package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.R;
import androidx.viewpager2.adapter.StatefulAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes2.dex */
public final class ViewPager2 extends ViewGroup {
    private static final WindowInsetsCompat EMPTY_INSETS = new WindowInsetsCompat.Builder().build();
    public static final int OFFSCREEN_PAGE_LIMIT_DEFAULT = -1;
    public static final int ORIENTATION_HORIZONTAL = 0;
    public static final int ORIENTATION_VERTICAL = 1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static boolean sFeatureEnhancedA11yEnabled = true;
    AccessibilityProvider mAccessibilityProvider;
    int mCurrentItem;
    private FakeDrag mFakeDragger;
    LinearLayoutManager mLayoutManager;
    private CompositeOnPageChangeCallback mPageChangeEventDispatcher;
    private PageTransformerAdapter mPageTransformerAdapter;
    private PagerSnapHelper mPagerSnapHelper;
    private Parcelable mPendingAdapterState;
    RecyclerView mRecyclerView;
    ScrollEventAdapter mScrollEventAdapter;
    private final Rect mTmpContainerRect = new Rect();
    private final Rect mTmpChildRect = new Rect();
    private CompositeOnPageChangeCallback mExternalPageChangeCallbacks = new CompositeOnPageChangeCallback(3);
    boolean mCurrentItemDirty = false;
    private RecyclerView.AdapterDataObserver mCurrentItemDataSetChangeObserver = new DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.1
        @Override // androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            ViewPager2.this.mCurrentItemDirty = true;
            ViewPager2.this.mScrollEventAdapter.notifyDataSetChangeHappened();
        }
    };
    private int mPendingCurrentItem = -1;
    private RecyclerView.ItemAnimator mSavedItemAnimator = null;
    private boolean mSavedItemAnimatorPresent = false;
    private boolean mUserInputEnabled = true;
    private int mOffscreenPageLimit = -1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface OffscreenPageLimit {
    }

    /* loaded from: classes2.dex */
    public static abstract class OnPageChangeCallback {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Orientation {
    }

    /* loaded from: classes2.dex */
    public interface PageTransformer {
        void transformPage(View view, float f);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ScrollState {
    }

    public ViewPager2(Context context) {
        super(context);
        initialize(context, null);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initialize(context, attributeSet);
    }

    private void initialize(Context context, AttributeSet attributeSet) {
        AccessibilityProvider accessibilityProvider;
        if (sFeatureEnhancedA11yEnabled) {
            accessibilityProvider = new PageAwareAccessibilityProvider();
        } else {
            accessibilityProvider = new BasicAccessibilityProvider();
        }
        this.mAccessibilityProvider = accessibilityProvider;
        RecyclerViewImpl recyclerViewImpl = new RecyclerViewImpl(context);
        this.mRecyclerView = recyclerViewImpl;
        recyclerViewImpl.setId(ViewCompat.generateViewId());
        this.mRecyclerView.setDescendantFocusability(131072);
        LinearLayoutManagerImpl linearLayoutManagerImpl = new LinearLayoutManagerImpl(context);
        this.mLayoutManager = linearLayoutManagerImpl;
        this.mRecyclerView.setLayoutManager(linearLayoutManagerImpl);
        this.mRecyclerView.setScrollingTouchSlop(1);
        setOrientation(context, attributeSet);
        this.mRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mRecyclerView.addOnChildAttachStateChangeListener(enforceChildFillListener());
        ScrollEventAdapter scrollEventAdapter = new ScrollEventAdapter(this);
        this.mScrollEventAdapter = scrollEventAdapter;
        this.mFakeDragger = new FakeDrag(this, scrollEventAdapter, this.mRecyclerView);
        PagerSnapHelperImpl pagerSnapHelperImpl = new PagerSnapHelperImpl();
        this.mPagerSnapHelper = pagerSnapHelperImpl;
        pagerSnapHelperImpl.attachToRecyclerView(this.mRecyclerView);
        this.mRecyclerView.addOnScrollListener(this.mScrollEventAdapter);
        CompositeOnPageChangeCallback compositeOnPageChangeCallback = new CompositeOnPageChangeCallback(3);
        this.mPageChangeEventDispatcher = compositeOnPageChangeCallback;
        this.mScrollEventAdapter.setOnPageChangeCallback(compositeOnPageChangeCallback);
        OnPageChangeCallback onPageChangeCallback = new OnPageChangeCallback() { // from class: androidx.viewpager2.widget.ViewPager2.2
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i) {
                if (ViewPager2.this.mCurrentItem != i) {
                    ViewPager2.this.mCurrentItem = i;
                    ViewPager2.this.mAccessibilityProvider.onSetNewCurrentItem();
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int i) {
                if (i == 0) {
                    ViewPager2.this.updateCurrentItem();
                }
            }
        };
        OnPageChangeCallback onPageChangeCallback2 = new OnPageChangeCallback() { // from class: androidx.viewpager2.widget.ViewPager2.3
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i) {
                ViewPager2.this.clearFocus();
                if (ViewPager2.this.hasFocus()) {
                    ViewPager2.this.mRecyclerView.requestFocus(2);
                }
            }
        };
        this.mPageChangeEventDispatcher.addOnPageChangeCallback(onPageChangeCallback);
        this.mPageChangeEventDispatcher.addOnPageChangeCallback(onPageChangeCallback2);
        this.mAccessibilityProvider.onInitialize(this.mPageChangeEventDispatcher, this.mRecyclerView);
        this.mPageChangeEventDispatcher.addOnPageChangeCallback(this.mExternalPageChangeCallbacks);
        PageTransformerAdapter pageTransformerAdapter = new PageTransformerAdapter(this.mLayoutManager);
        this.mPageTransformerAdapter = pageTransformerAdapter;
        this.mPageChangeEventDispatcher.addOnPageChangeCallback(pageTransformerAdapter);
        RecyclerView recyclerView = this.mRecyclerView;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private RecyclerView.OnChildAttachStateChangeListener enforceChildFillListener() {
        return new RecyclerView.OnChildAttachStateChangeListener() { // from class: androidx.viewpager2.widget.ViewPager2.4
            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewDetachedFromWindow(View view) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewAttachedToWindow(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (layoutParams.width == -1 && layoutParams.height == -1) {
                    return;
                }
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (this.mAccessibilityProvider.handlesGetAccessibilityClassName()) {
            return this.mAccessibilityProvider.onGetAccessibilityClassName();
        }
        return super.getAccessibilityClassName();
    }

    private void setOrientation(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ViewPager2);
        ViewCompat.saveAttributeDataForStyleable(this, context, R.styleable.ViewPager2, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(R.styleable.ViewPager2_android_orientation, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.mRecyclerViewId = this.mRecyclerView.getId();
        int i = this.mPendingCurrentItem;
        if (i == -1) {
            i = this.mCurrentItem;
        }
        savedState.mCurrentItem = i;
        Parcelable parcelable = this.mPendingAdapterState;
        if (parcelable != null) {
            savedState.mAdapterState = parcelable;
        } else {
            RecyclerView.Adapter adapter = this.mRecyclerView.getAdapter();
            if (adapter instanceof StatefulAdapter) {
                savedState.mAdapterState = ((StatefulAdapter) adapter).saveState();
            }
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mPendingCurrentItem = savedState.mCurrentItem;
        this.mPendingAdapterState = savedState.mAdapterState;
    }

    private void restorePendingState() {
        RecyclerView.Adapter adapter;
        if (this.mPendingCurrentItem == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.mPendingAdapterState;
        if (parcelable != null) {
            if (adapter instanceof StatefulAdapter) {
                ((StatefulAdapter) adapter).restoreState(parcelable);
            }
            this.mPendingAdapterState = null;
        }
        int max = Math.max(0, Math.min(this.mPendingCurrentItem, adapter.getItemCount() - 1));
        this.mCurrentItem = max;
        this.mPendingCurrentItem = -1;
        this.mRecyclerView.scrollToPosition(max);
        this.mAccessibilityProvider.onRestorePendingState();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).mRecyclerViewId;
            sparseArray.put(this.mRecyclerView.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        restorePendingState();
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.viewpager2.widget.ViewPager2.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                if (Build.VERSION.SDK_INT >= 24) {
                    return new SavedState(parcel, classLoader);
                }
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        Parcelable mAdapterState;
        int mCurrentItem;
        int mRecyclerViewId;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readValues(parcel, classLoader);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            readValues(parcel, null);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void readValues(Parcel parcel, ClassLoader classLoader) {
            this.mRecyclerViewId = parcel.readInt();
            this.mCurrentItem = parcel.readInt();
            this.mAdapterState = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mRecyclerViewId);
            parcel.writeInt(this.mCurrentItem);
            parcel.writeParcelable(this.mAdapterState, i);
        }
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.mRecyclerView.getAdapter();
        this.mAccessibilityProvider.onDetachAdapter(adapter2);
        unregisterCurrentItemDataSetTracker(adapter2);
        this.mRecyclerView.setAdapter(adapter);
        this.mCurrentItem = 0;
        restorePendingState();
        this.mAccessibilityProvider.onAttachAdapter(adapter);
        registerCurrentItemDataSetTracker(adapter);
    }

    private void registerCurrentItemDataSetTracker(RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mCurrentItemDataSetChangeObserver);
        }
    }

    private void unregisterCurrentItemDataSetTracker(RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.mCurrentItemDataSetChangeObserver);
        }
    }

    public RecyclerView.Adapter getAdapter() {
        return this.mRecyclerView.getAdapter();
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(getClass().getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        measureChild(this.mRecyclerView, i, i2);
        int measuredWidth = this.mRecyclerView.getMeasuredWidth();
        int measuredHeight = this.mRecyclerView.getMeasuredHeight();
        int measuredState = this.mRecyclerView.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.mRecyclerView.getMeasuredWidth();
        int measuredHeight = this.mRecyclerView.getMeasuredHeight();
        this.mTmpContainerRect.left = getPaddingLeft();
        this.mTmpContainerRect.right = (i3 - i) - getPaddingRight();
        this.mTmpContainerRect.top = getPaddingTop();
        this.mTmpContainerRect.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.mTmpContainerRect, this.mTmpChildRect);
        this.mRecyclerView.layout(this.mTmpChildRect.left, this.mTmpChildRect.top, this.mTmpChildRect.right, this.mTmpChildRect.bottom);
        if (this.mCurrentItemDirty) {
            updateCurrentItem();
        }
    }

    void updateCurrentItem() {
        PagerSnapHelper pagerSnapHelper = this.mPagerSnapHelper;
        if (pagerSnapHelper == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View findSnapView = pagerSnapHelper.findSnapView(this.mLayoutManager);
        if (findSnapView == null) {
            return;
        }
        int position = this.mLayoutManager.getPosition(findSnapView);
        if (position != this.mCurrentItem && getScrollState() == 0) {
            this.mPageChangeEventDispatcher.onPageSelected(position);
        }
        this.mCurrentItemDirty = false;
    }

    int getPageSize() {
        int i;
        int i2;
        RecyclerView recyclerView = this.mRecyclerView;
        if (getOrientation() == 0) {
            i = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            i2 = recyclerView.getPaddingRight();
        } else {
            i = recyclerView.getHeight() - recyclerView.getPaddingTop();
            i2 = recyclerView.getPaddingBottom();
        }
        return i - i2;
    }

    public void setOrientation(int i) {
        this.mLayoutManager.setOrientation(i);
        this.mAccessibilityProvider.onSetOrientation();
    }

    public int getOrientation() {
        return this.mLayoutManager.getOrientation();
    }

    public boolean isRtl() {
        return this.mLayoutManager.getLayoutDirection() == 1;
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public void setCurrentItem(int i, boolean z) {
        if (isFakeDragging()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        setCurrentItemInternal(i, z);
    }

    void setCurrentItemInternal(int i, boolean z) {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.mPendingCurrentItem == -1) {
                return;
            }
            this.mPendingCurrentItem = Math.max(i, 0);
        } else if (adapter.getItemCount() <= 0) {
        } else {
            int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
            if (min == this.mCurrentItem && this.mScrollEventAdapter.isIdle()) {
                return;
            }
            int i2 = this.mCurrentItem;
            if (min == i2 && z) {
                return;
            }
            double d = i2;
            this.mCurrentItem = min;
            this.mAccessibilityProvider.onSetNewCurrentItem();
            if (!this.mScrollEventAdapter.isIdle()) {
                d = this.mScrollEventAdapter.getRelativeScrollPosition();
            }
            this.mScrollEventAdapter.notifyProgrammaticScroll(min, z);
            if (!z) {
                this.mRecyclerView.scrollToPosition(min);
                return;
            }
            double d2 = min;
            if (Math.abs(d2 - d) > 3.0d) {
                this.mRecyclerView.scrollToPosition(d2 > d ? min - 3 : min + 3);
                RecyclerView recyclerView = this.mRecyclerView;
                recyclerView.post(new SmoothScrollToPosition(min, recyclerView));
                return;
            }
            this.mRecyclerView.smoothScrollToPosition(min);
        }
    }

    public int getCurrentItem() {
        return this.mCurrentItem;
    }

    public int getScrollState() {
        return this.mScrollEventAdapter.getScrollState();
    }

    public boolean beginFakeDrag() {
        return this.mFakeDragger.beginFakeDrag();
    }

    public boolean fakeDragBy(float f) {
        return this.mFakeDragger.fakeDragBy(f);
    }

    public boolean endFakeDrag() {
        return this.mFakeDragger.endFakeDrag();
    }

    public boolean isFakeDragging() {
        return this.mFakeDragger.isFakeDragging();
    }

    public void snapToPage() {
        View findSnapView = this.mPagerSnapHelper.findSnapView(this.mLayoutManager);
        if (findSnapView == null) {
            return;
        }
        int[] calculateDistanceToFinalSnap = this.mPagerSnapHelper.calculateDistanceToFinalSnap(this.mLayoutManager, findSnapView);
        if (calculateDistanceToFinalSnap[0] == 0 && calculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.smoothScrollBy(calculateDistanceToFinalSnap[0], calculateDistanceToFinalSnap[1]);
    }

    public void setUserInputEnabled(boolean z) {
        this.mUserInputEnabled = z;
        this.mAccessibilityProvider.onSetUserInputEnabled();
    }

    public boolean isUserInputEnabled() {
        return this.mUserInputEnabled;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.mOffscreenPageLimit = i;
        this.mRecyclerView.requestLayout();
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.mRecyclerView.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.mRecyclerView.canScrollVertically(i);
    }

    public void registerOnPageChangeCallback(OnPageChangeCallback onPageChangeCallback) {
        this.mExternalPageChangeCallbacks.addOnPageChangeCallback(onPageChangeCallback);
    }

    public void unregisterOnPageChangeCallback(OnPageChangeCallback onPageChangeCallback) {
        this.mExternalPageChangeCallbacks.removeOnPageChangeCallback(onPageChangeCallback);
    }

    public void setPageTransformer(PageTransformer pageTransformer) {
        if (pageTransformer != null) {
            if (!this.mSavedItemAnimatorPresent) {
                this.mSavedItemAnimator = this.mRecyclerView.getItemAnimator();
                this.mSavedItemAnimatorPresent = true;
            }
            this.mRecyclerView.setItemAnimator(null);
        } else if (this.mSavedItemAnimatorPresent) {
            this.mRecyclerView.setItemAnimator(this.mSavedItemAnimator);
            this.mSavedItemAnimator = null;
            this.mSavedItemAnimatorPresent = false;
        }
        if (pageTransformer == this.mPageTransformerAdapter.getPageTransformer()) {
            return;
        }
        this.mPageTransformerAdapter.setPageTransformer(pageTransformer);
        requestTransform();
    }

    public void requestTransform() {
        if (this.mPageTransformerAdapter.getPageTransformer() == null) {
            return;
        }
        double relativeScrollPosition = this.mScrollEventAdapter.getRelativeScrollPosition();
        int i = (int) relativeScrollPosition;
        float f = (float) (relativeScrollPosition - i);
        this.mPageTransformerAdapter.onPageScrolled(i, f, Math.round(getPageSize() * f));
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.mAccessibilityProvider.onSetLayoutDirection();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.mAccessibilityProvider.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.mAccessibilityProvider.handlesPerformAccessibilityAction(i, bundle)) {
            return this.mAccessibilityProvider.onPerformAccessibilityAction(i, bundle);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets.isConsumed()) {
            return onApplyWindowInsets;
        }
        int childCount = this.mRecyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.mRecyclerView.getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(onApplyWindowInsets));
        }
        return consumeAllInsets(windowInsets);
    }

    private WindowInsets consumeAllInsets(WindowInsets windowInsets) {
        WindowInsetsCompat windowInsetsCompat = EMPTY_INSETS;
        if (windowInsetsCompat.toWindowInsets() != null) {
            return windowInsetsCompat.toWindowInsets();
        }
        return windowInsets.consumeSystemWindowInsets().consumeStableInsets();
    }

    /* loaded from: classes2.dex */
    public class RecyclerViewImpl extends RecyclerView {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RecyclerViewImpl(Context context) {
            super(context);
            ViewPager2.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            if (ViewPager2.this.mAccessibilityProvider.handlesRvGetAccessibilityClassName()) {
                return ViewPager2.this.mAccessibilityProvider.onRvGetAccessibilityClassName();
            }
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.mCurrentItem);
            accessibilityEvent.setToIndex(ViewPager2.this.mCurrentItem);
            ViewPager2.this.mAccessibilityProvider.onRvInitializeAccessibilityEvent(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.isUserInputEnabled() && super.onTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.isUserInputEnabled() && super.onInterceptTouchEvent(motionEvent);
        }
    }

    /* loaded from: classes2.dex */
    public class LinearLayoutManagerImpl extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        LinearLayoutManagerImpl(Context context) {
            super(context);
            ViewPager2.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean performAccessibilityAction(RecyclerView.Recycler recycler, RecyclerView.State state, int i, Bundle bundle) {
            if (ViewPager2.this.mAccessibilityProvider.handlesLmPerformAccessibilityAction(i)) {
                return ViewPager2.this.mAccessibilityProvider.onLmPerformAccessibilityAction(i);
            }
            return super.performAccessibilityAction(recycler, state, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
            ViewPager2.this.mAccessibilityProvider.onLmInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            ViewPager2.this.mAccessibilityProvider.onLmInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(state, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }
    }

    /* loaded from: classes2.dex */
    public class PagerSnapHelperImpl extends PagerSnapHelper {
        PagerSnapHelperImpl() {
            ViewPager2.this = r1;
        }

        @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
        public View findSnapView(RecyclerView.LayoutManager layoutManager) {
            if (ViewPager2.this.isFakeDragging()) {
                return null;
            }
            return super.findSnapView(layoutManager);
        }
    }

    /* loaded from: classes2.dex */
    public static class SmoothScrollToPosition implements Runnable {
        private final int mPosition;
        private final RecyclerView mRecyclerView;

        SmoothScrollToPosition(int i, RecyclerView recyclerView) {
            this.mPosition = i;
            this.mRecyclerView = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.mRecyclerView.smoothScrollToPosition(this.mPosition);
        }
    }

    public void addItemDecoration(RecyclerView.ItemDecoration itemDecoration) {
        this.mRecyclerView.addItemDecoration(itemDecoration);
    }

    public void addItemDecoration(RecyclerView.ItemDecoration itemDecoration, int i) {
        this.mRecyclerView.addItemDecoration(itemDecoration, i);
    }

    public RecyclerView.ItemDecoration getItemDecorationAt(int i) {
        return this.mRecyclerView.getItemDecorationAt(i);
    }

    public int getItemDecorationCount() {
        return this.mRecyclerView.getItemDecorationCount();
    }

    public void invalidateItemDecorations() {
        this.mRecyclerView.invalidateItemDecorations();
    }

    public void removeItemDecorationAt(int i) {
        this.mRecyclerView.removeItemDecorationAt(i);
    }

    public void removeItemDecoration(RecyclerView.ItemDecoration itemDecoration) {
        this.mRecyclerView.removeItemDecoration(itemDecoration);
    }

    /* loaded from: classes2.dex */
    public abstract class AccessibilityProvider {
        boolean handlesGetAccessibilityClassName() {
            return false;
        }

        boolean handlesLmPerformAccessibilityAction(int i) {
            return false;
        }

        boolean handlesPerformAccessibilityAction(int i, Bundle bundle) {
            return false;
        }

        boolean handlesRvGetAccessibilityClassName() {
            return false;
        }

        void onAttachAdapter(RecyclerView.Adapter<?> adapter) {
        }

        void onDetachAdapter(RecyclerView.Adapter<?> adapter) {
        }

        void onInitialize(CompositeOnPageChangeCallback compositeOnPageChangeCallback, RecyclerView recyclerView) {
        }

        void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        void onLmInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        void onLmInitializeAccessibilityNodeInfoForItem(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        void onRestorePendingState() {
        }

        void onRvInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        }

        void onSetLayoutDirection() {
        }

        void onSetNewCurrentItem() {
        }

        void onSetOrientation() {
        }

        void onSetUserInputEnabled() {
        }

        private AccessibilityProvider() {
            ViewPager2.this = r1;
        }

        String onGetAccessibilityClassName() {
            throw new IllegalStateException("Not implemented.");
        }

        boolean onPerformAccessibilityAction(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean onLmPerformAccessibilityAction(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        CharSequence onRvGetAccessibilityClassName() {
            throw new IllegalStateException("Not implemented.");
        }
    }

    /* loaded from: classes2.dex */
    public class BasicAccessibilityProvider extends AccessibilityProvider {
        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean handlesRvGetAccessibilityClassName() {
            return true;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        BasicAccessibilityProvider() {
            super();
            ViewPager2.this = r2;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean handlesLmPerformAccessibilityAction(int i) {
            return (i == 8192 || i == 4096) && !ViewPager2.this.isUserInputEnabled();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean onLmPerformAccessibilityAction(int i) {
            if (handlesLmPerformAccessibilityAction(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onLmInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (!ViewPager2.this.isUserInputEnabled()) {
                accessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                accessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfoCompat.setScrollable(false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public CharSequence onRvGetAccessibilityClassName() {
            if (handlesRvGetAccessibilityClassName()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes2.dex */
    public class PageAwareAccessibilityProvider extends AccessibilityProvider {
        private RecyclerView.AdapterDataObserver mAdapterDataObserver;
        private final AccessibilityViewCommand mActionPageForward = new AccessibilityViewCommand() { // from class: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.1
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                PageAwareAccessibilityProvider.this.setCurrentItemFromAccessibilityCommand(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        };
        private final AccessibilityViewCommand mActionPageBackward = new AccessibilityViewCommand() { // from class: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.2
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                PageAwareAccessibilityProvider.this.setCurrentItemFromAccessibilityCommand(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        };

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean handlesGetAccessibilityClassName() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean handlesPerformAccessibilityAction(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        PageAwareAccessibilityProvider() {
            super();
            ViewPager2.this = r2;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onInitialize(CompositeOnPageChangeCallback compositeOnPageChangeCallback, RecyclerView recyclerView) {
            ViewCompat.setImportantForAccessibility(recyclerView, 2);
            this.mAdapterDataObserver = new DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.3
                @Override // androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onChanged() {
                    PageAwareAccessibilityProvider.this.updatePageAccessibilityActions();
                }
            };
            if (ViewCompat.getImportantForAccessibility(ViewPager2.this) == 0) {
                ViewCompat.setImportantForAccessibility(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public String onGetAccessibilityClassName() {
            if (handlesGetAccessibilityClassName()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onRestorePendingState() {
            updatePageAccessibilityActions();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onAttachAdapter(RecyclerView.Adapter<?> adapter) {
            updatePageAccessibilityActions();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.mAdapterDataObserver);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onDetachAdapter(RecyclerView.Adapter<?> adapter) {
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(this.mAdapterDataObserver);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onSetOrientation() {
            updatePageAccessibilityActions();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onSetNewCurrentItem() {
            updatePageAccessibilityActions();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onSetUserInputEnabled() {
            updatePageAccessibilityActions();
            if (Build.VERSION.SDK_INT < 21) {
                ViewPager2.this.sendAccessibilityEvent(2048);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onSetLayoutDirection() {
            updatePageAccessibilityActions();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
            addCollectionInfo(wrap);
            if (Build.VERSION.SDK_INT >= 16) {
                addScrollActions(wrap);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        void onLmInitializeAccessibilityNodeInfoForItem(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            addCollectionItemInfo(view, accessibilityNodeInfoCompat);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean onPerformAccessibilityAction(int i, Bundle bundle) {
            int i2;
            if (!handlesPerformAccessibilityAction(i, bundle)) {
                throw new IllegalStateException();
            }
            if (i == 8192) {
                i2 = ViewPager2.this.getCurrentItem() - 1;
            } else {
                i2 = ViewPager2.this.getCurrentItem() + 1;
            }
            setCurrentItemFromAccessibilityCommand(i2);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onRvInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(onGetAccessibilityClassName());
        }

        void setCurrentItemFromAccessibilityCommand(int i) {
            if (ViewPager2.this.isUserInputEnabled()) {
                ViewPager2.this.setCurrentItemInternal(i, true);
            }
        }

        void updatePageAccessibilityActions() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = 16908360;
            ViewCompat.removeAccessibilityAction(viewPager2, 16908360);
            ViewCompat.removeAccessibilityAction(viewPager2, 16908361);
            ViewCompat.removeAccessibilityAction(viewPager2, 16908358);
            ViewCompat.removeAccessibilityAction(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0 || !ViewPager2.this.isUserInputEnabled()) {
                return;
            }
            if (ViewPager2.this.getOrientation() == 0) {
                boolean isRtl = ViewPager2.this.isRtl();
                int i2 = isRtl ? 16908360 : 16908361;
                if (isRtl) {
                    i = 16908361;
                }
                if (ViewPager2.this.mCurrentItem < itemCount - 1) {
                    ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i2, null), null, this.mActionPageForward);
                }
                if (ViewPager2.this.mCurrentItem <= 0) {
                    return;
                }
                ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i, null), null, this.mActionPageBackward);
                return;
            }
            if (ViewPager2.this.mCurrentItem < itemCount - 1) {
                ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908359, null), null, this.mActionPageForward);
            }
            if (ViewPager2.this.mCurrentItem <= 0) {
                return;
            }
            ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908358, null), null, this.mActionPageBackward);
        }

        private void addCollectionInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int i;
            int i2 = 1;
            if (ViewPager2.this.getAdapter() == null) {
                i = 0;
                i2 = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                i2 = ViewPager2.this.getAdapter().getItemCount();
                i = 1;
            } else {
                i = ViewPager2.this.getAdapter().getItemCount();
            }
            accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(i2, i, false, 0));
        }

        private void addCollectionItemInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.mLayoutManager.getPosition(view) : 0, 1, ViewPager2.this.getOrientation() == 0 ? ViewPager2.this.mLayoutManager.getPosition(view) : 0, 1, false, false));
        }

        private void addScrollActions(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int itemCount;
            RecyclerView.Adapter adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !ViewPager2.this.isUserInputEnabled()) {
                return;
            }
            if (ViewPager2.this.mCurrentItem > 0) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
            if (ViewPager2.this.mCurrentItem < itemCount - 1) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            accessibilityNodeInfoCompat.setScrollable(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static abstract class DataSetChangeObserver extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        private DataSetChangeObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }
    }
}
