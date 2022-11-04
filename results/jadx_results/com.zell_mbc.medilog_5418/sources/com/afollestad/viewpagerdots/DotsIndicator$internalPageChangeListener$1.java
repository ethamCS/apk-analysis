package com.afollestad.viewpagerdots;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;
/* compiled from: DotsIndicator.kt */
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/afollestad/viewpagerdots/DotsIndicator$internalPageChangeListener$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", BuildConfig.APPLICATION_ID}, k = 1, mv = {1, 1, 11})
/* loaded from: classes2.dex */
public final class DotsIndicator$internalPageChangeListener$1 implements ViewPager.OnPageChangeListener {
    final /* synthetic */ DotsIndicator this$0;

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    public DotsIndicator$internalPageChangeListener$1(DotsIndicator dotsIndicator) {
        this.this$0 = dotsIndicator;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        ViewPager viewPager;
        PagerAdapter adapter;
        viewPager = this.this$0.viewPager;
        if (((viewPager == null || (adapter = viewPager.getAdapter()) == null) ? 0 : adapter.getCount()) <= 0) {
            return;
        }
        this.this$0.internalPageSelected(i);
        this.this$0.lastPosition = i;
    }
}
