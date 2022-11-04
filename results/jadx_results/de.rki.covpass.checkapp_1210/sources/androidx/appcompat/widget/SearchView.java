package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
/* loaded from: classes.dex */
public class SearchView extends l0 implements k.c {

    /* renamed from: c5 */
    static final n f1101c5;
    private k A4;
    View.OnFocusChangeListener B4;
    private m C4;
    private View.OnClickListener D4;
    private boolean E4;
    private boolean F4;
    u0.a G4;
    private boolean H4;
    private CharSequence I4;
    private boolean J4;
    private boolean K4;
    private int L4;
    private boolean M4;
    private CharSequence N4;
    private CharSequence O4;
    private boolean P4;
    private int Q4;
    SearchableInfo R4;
    private Bundle S4;
    private final Runnable T4;
    private Runnable U4;
    private final WeakHashMap<String, Drawable.ConstantState> V4;
    private final View.OnClickListener W4;
    View.OnKeyListener X4;
    private final TextView.OnEditorActionListener Y4;
    private final AdapterView.OnItemClickListener Z4;

    /* renamed from: a5 */
    private final AdapterView.OnItemSelectedListener f1102a5;

    /* renamed from: b5 */
    private TextWatcher f1103b5;

    /* renamed from: e4 */
    final SearchAutoComplete f1104e4;

    /* renamed from: f4 */
    private final View f1105f4;

    /* renamed from: g4 */
    private final View f1106g4;

    /* renamed from: h4 */
    private final View f1107h4;

    /* renamed from: i4 */
    final ImageView f1108i4;

    /* renamed from: j4 */
    final ImageView f1109j4;

    /* renamed from: k4 */
    final ImageView f1110k4;

    /* renamed from: l4 */
    final ImageView f1111l4;

    /* renamed from: m4 */
    private final View f1112m4;

    /* renamed from: n4 */
    private p f1113n4;

    /* renamed from: o4 */
    private Rect f1114o4;

    /* renamed from: p4 */
    private Rect f1115p4;

    /* renamed from: q4 */
    private int[] f1116q4;

    /* renamed from: r4 */
    private int[] f1117r4;

    /* renamed from: s4 */
    private final ImageView f1118s4;

    /* renamed from: t4 */
    private final Drawable f1119t4;

    /* renamed from: u4 */
    private final int f1120u4;

    /* renamed from: v4 */
    private final int f1121v4;

    /* renamed from: w4 */
    private final Intent f1122w4;

    /* renamed from: x4 */
    private final Intent f1123x4;

    /* renamed from: y4 */
    private final CharSequence f1124y4;

    /* renamed from: z4 */
    private l f1125z4;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends androidx.appcompat.widget.d {
        private SearchView U3;
        private boolean V3;
        final Runnable W3;

        /* renamed from: y */
        private int f1126y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            a() {
                SearchAutoComplete.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, e.a.f9182p);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.W3 = new a();
            this.f1126y = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 < 960 || i11 < 720 || configuration.orientation != 2) {
                if (i10 >= 600) {
                    return 192;
                }
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }

        void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f1101c5.c(this);
                return;
            }
            setInputMethodMode(1);
            if (!enoughToFilter()) {
                return;
            }
            showDropDown();
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.V3) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.V3 = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1126y <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.V3) {
                removeCallbacks(this.W3);
                post(this.W3);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.U3.Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.U3.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (!z10 || !this.U3.hasFocus() || getVisibility() != 0) {
                return;
            }
            this.V3 = true;
            if (!SearchView.M(getContext())) {
                return;
            }
            b();
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.V3 = false;
                removeCallbacks(this.W3);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.V3 = true;
            } else {
                this.V3 = false;
                removeCallbacks(this.W3);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.U3 = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1126y = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        a() {
            SearchView.this = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.Y(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
            SearchView.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.f0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
            SearchView.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            u0.a aVar = SearchView.this.G4;
            if (aVar instanceof t0) {
                aVar.a(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements View.OnFocusChangeListener {
        d() {
            SearchView.this = r1;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.B4;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements View.OnLayoutChangeListener {
        e() {
            SearchView.this = r1;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        f() {
            SearchView.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1108i4) {
                searchView.V();
            } else if (view == searchView.f1110k4) {
                searchView.R();
            } else if (view == searchView.f1109j4) {
                searchView.W();
            } else if (view == searchView.f1111l4) {
                searchView.a0();
            } else if (view != searchView.f1104e4) {
            } else {
                searchView.H();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements View.OnKeyListener {
        g() {
            SearchView.this = r1;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.R4 == null) {
                return false;
            }
            if (searchView.f1104e4.isPopupShowing() && SearchView.this.f1104e4.getListSelection() != -1) {
                return SearchView.this.X(view, i10, keyEvent);
            }
            if (SearchView.this.f1104e4.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, null, searchView2.f1104e4.getText().toString());
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements TextView.OnEditorActionListener {
        h() {
            SearchView.this = r1;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements AdapterView.OnItemClickListener {
        i() {
            SearchView.this = r1;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.S(i10, 0, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements AdapterView.OnItemSelectedListener {
        j() {
            SearchView.this = r1;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.T(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean a(int i10);

        boolean b(int i10);
    }

    /* loaded from: classes.dex */
    public static class n {

        /* renamed from: a */
        private Method f1138a;

        /* renamed from: b */
        private Method f1139b;

        /* renamed from: c */
        private Method f1140c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        n() {
            this.f1138a = null;
            this.f1139b = null;
            this.f1140c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1138a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1139b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1140c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT < 29) {
                return;
            }
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1139b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1138a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1140c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o extends v0.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: q */
        boolean f1141q;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<o> {
            a() {
            }

            /* renamed from: a */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            /* renamed from: b */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            /* renamed from: c */
            public o[] newArray(int i10) {
                return new o[i10];
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1141q = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1141q + "}";
        }

        @Override // v0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f1141q));
        }
    }

    /* loaded from: classes.dex */
    private static class p extends TouchDelegate {

        /* renamed from: a */
        private final View f1142a;

        /* renamed from: e */
        private final int f1146e;

        /* renamed from: f */
        private boolean f1147f;

        /* renamed from: b */
        private final Rect f1143b = new Rect();

        /* renamed from: d */
        private final Rect f1145d = new Rect();

        /* renamed from: c */
        private final Rect f1144c = new Rect();

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1146e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.f1142a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1143b.set(rect);
            this.f1145d.set(rect);
            Rect rect3 = this.f1145d;
            int i10 = this.f1146e;
            rect3.inset(-i10, -i10);
            this.f1144c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            int i10;
            float f10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f1147f;
                    if (z11 && !this.f1145d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f1147f;
                        this.f1147f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.f1143b.contains(x10, y10)) {
                    this.f1147f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (z12) {
                if (!z10 || this.f1144c.contains(x10, y10)) {
                    Rect rect = this.f1144c;
                    f10 = x10 - rect.left;
                    i10 = y10 - rect.top;
                } else {
                    f10 = this.f1142a.getWidth() / 2;
                    i10 = this.f1142a.getHeight() / 2;
                }
                motionEvent.setLocation(f10, i10);
                return this.f1142a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    static {
        f1101c5 = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.I_res_0x7f030358);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1114o4 = new Rect();
        this.f1115p4 = new Rect();
        this.f1116q4 = new int[2];
        this.f1117r4 = new int[2];
        this.T4 = new b();
        this.U4 = new c();
        this.V4 = new WeakHashMap<>();
        f fVar = new f();
        this.W4 = fVar;
        this.X4 = new g();
        h hVar = new h();
        this.Y4 = hVar;
        i iVar = new i();
        this.Z4 = iVar;
        j jVar = new j();
        this.f1102a5 = jVar;
        this.f1103b5 = new a();
        int[] iArr = e.j.f9237f2;
        a1 v10 = a1.v(context, attributeSet, iArr, i10, 0);
        androidx.core.view.y.m0(this, context, iArr, attributeSet, v10.r(), i10, 0);
        LayoutInflater.from(context).inflate(v10.n(e.j.f9287p2, e.g.r_res_0x7f0c0019), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(e.f.D_res_0x7f09021d);
        this.f1104e4 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1105f4 = findViewById(e.f.z_res_0x7f090219);
        View findViewById = findViewById(e.f.C_res_0x7f09021c);
        this.f1106g4 = findViewById;
        View findViewById2 = findViewById(e.f.J_res_0x7f090253);
        this.f1107h4 = findViewById2;
        ImageView imageView = (ImageView) findViewById(e.f.x_res_0x7f090217);
        this.f1108i4 = imageView;
        ImageView imageView2 = (ImageView) findViewById(e.f.A_res_0x7f09021a);
        this.f1109j4 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(e.f.y_res_0x7f090218);
        this.f1110k4 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(e.f.E_res_0x7f09021e);
        this.f1111l4 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(e.f.B_res_0x7f09021b);
        this.f1118s4 = imageView5;
        androidx.core.view.y.s0(findViewById, v10.g(e.j.f9292q2));
        androidx.core.view.y.s0(findViewById2, v10.g(e.j.f9312u2));
        int i11 = e.j.f9307t2;
        imageView.setImageDrawable(v10.g(i11));
        imageView2.setImageDrawable(v10.g(e.j.f9277n2));
        imageView3.setImageDrawable(v10.g(e.j.f9262k2));
        imageView4.setImageDrawable(v10.g(e.j.f9322w2));
        imageView5.setImageDrawable(v10.g(i11));
        this.f1119t4 = v10.g(e.j.f9302s2);
        d1.a(imageView, getResources().getString(e.h.n_res_0x7f100070));
        this.f1120u4 = v10.n(e.j.f9317v2, e.g.q_res_0x7f0c0018);
        this.f1121v4 = v10.n(e.j.f9267l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1103b5);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.X4);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v10.a(e.j.f9282o2, true));
        int f10 = v10.f(e.j.f9247h2, -1);
        if (f10 != -1) {
            setMaxWidth(f10);
        }
        this.f1124y4 = v10.p(e.j.f9272m2);
        this.I4 = v10.p(e.j.f9297r2);
        int k10 = v10.k(e.j.f9257j2, -1);
        if (k10 != -1) {
            setImeOptions(k10);
        }
        int k11 = v10.k(e.j.f9252i2, -1);
        if (k11 != -1) {
            setInputType(k11);
        }
        setFocusable(v10.a(e.j.f9242g2, true));
        v10.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1122w4 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1123x4 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1112m4 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.E4);
        g0();
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.O4);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.S4;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.R4.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i10, String str) {
        int i11;
        String o10;
        try {
            String o11 = t0.o(cursor, "suggest_intent_action");
            if (o11 == null) {
                o11 = this.R4.getSuggestIntentAction();
            }
            if (o11 == null) {
                o11 = "android.intent.action.SEARCH";
            }
            String str2 = o11;
            String o12 = t0.o(cursor, "suggest_intent_data");
            if (o12 == null) {
                o12 = this.R4.getSuggestIntentData();
            }
            if (o12 != null && (o10 = t0.o(cursor, "suggest_intent_data_id")) != null) {
                o12 = o12 + "/" + Uri.encode(o10);
            }
            return C(str2, o12 == null ? null : Uri.parse(o12), t0.o(cursor, "suggest_intent_extra_data"), t0.o(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                i11 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i11 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.S4;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i10 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i10 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i10);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void G() {
        this.f1104e4.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.f1116q4);
        getLocationInWindow(this.f1117r4);
        int[] iArr = this.f1116q4;
        int i10 = iArr[1];
        int[] iArr2 = this.f1117r4;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.E4 || this.f1119t4 == null) {
            return charSequence;
        }
        int textSize = (int) (this.f1104e4.getTextSize() * 1.25d);
        this.f1119t4.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1119t4), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        SearchableInfo searchableInfo = this.R4;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.R4.getVoiceSearchLaunchWebSearch()) {
            intent = this.f1122w4;
        } else if (this.R4.getVoiceSearchLaunchRecognizer()) {
            intent = this.f1123x4;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean N() {
        return (this.H4 || this.M4) && !L();
    }

    private void O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    private boolean Q(int i10, int i11, String str) {
        Cursor b10 = this.G4.b();
        if (b10 == null || !b10.moveToPosition(i10)) {
            return false;
        }
        O(D(b10, i11, str));
        return true;
    }

    private void b0() {
        post(this.T4);
    }

    private void c0(int i10) {
        CharSequence c10;
        Editable text = this.f1104e4.getText();
        Cursor b10 = this.G4.b();
        if (b10 == null) {
            return;
        }
        if (!b10.moveToPosition(i10) || (c10 = this.G4.c(b10)) == null) {
            setQuery(text);
        } else {
            setQuery(c10);
        }
    }

    private void e0() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1104e4.getText());
        int i10 = 0;
        if (!z11 && (!this.E4 || this.P4)) {
            z10 = false;
        }
        ImageView imageView = this.f1110k4;
        if (!z10) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        Drawable drawable = this.f1110k4.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1104e4;
        if (queryHint == null) {
            queryHint = BuildConfig.FLAVOR;
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(e.d.g_res_0x7f060036);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(e.d.h_res_0x7f060037);
    }

    private void h0() {
        this.f1104e4.setThreshold(this.R4.getSuggestThreshold());
        this.f1104e4.setImeOptions(this.R4.getImeOptions());
        int inputType = this.R4.getInputType();
        int i10 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.R4.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1104e4.setInputType(inputType);
        u0.a aVar = this.G4;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.R4.getSuggestAuthority() != null) {
            t0 t0Var = new t0(getContext(), this, this.R4, this.V4);
            this.G4 = t0Var;
            this.f1104e4.setAdapter(t0Var);
            t0 t0Var2 = (t0) this.G4;
            if (this.J4) {
                i10 = 2;
            }
            t0Var2.x(i10);
        }
    }

    private void i0() {
        this.f1107h4.setVisibility((!N() || !(this.f1109j4.getVisibility() == 0 || this.f1111l4.getVisibility() == 0)) ? 8 : 0);
    }

    private void j0(boolean z10) {
        this.f1109j4.setVisibility((!this.H4 || !N() || !hasFocus() || (!z10 && this.M4)) ? 8 : 0);
    }

    private void k0(boolean z10) {
        this.F4 = z10;
        int i10 = 0;
        int i11 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.f1104e4.getText());
        this.f1108i4.setVisibility(i11);
        j0(z11);
        this.f1105f4.setVisibility(z10 ? 8 : 0);
        if (this.f1118s4.getDrawable() == null || this.E4) {
            i10 = 8;
        }
        this.f1118s4.setVisibility(i10);
        e0();
        l0(!z11);
        i0();
    }

    private void l0(boolean z10) {
        int i10 = 8;
        if (this.M4 && !L() && z10) {
            this.f1109j4.setVisibility(8);
            i10 = 0;
        }
        this.f1111l4.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1104e4.setText(charSequence);
        this.f1104e4.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void B() {
        if (this.f1112m4.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1106g4.getPaddingLeft();
            Rect rect = new Rect();
            boolean b10 = h1.b(this);
            int dimensionPixelSize = this.E4 ? resources.getDimensionPixelSize(e.d.e_res_0x7f060029) + resources.getDimensionPixelSize(e.d.f_res_0x7f06002a) : 0;
            this.f1104e4.getDropDownBackground().getPadding(rect);
            int i10 = rect.left;
            this.f1104e4.setDropDownHorizontalOffset(b10 ? -i10 : paddingLeft - (i10 + dimensionPixelSize));
            this.f1104e4.setDropDownWidth((((this.f1112m4.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1104e4.refreshAutoCompleteResults();
            return;
        }
        n nVar = f1101c5;
        nVar.b(this.f1104e4);
        nVar.a(this.f1104e4);
    }

    public boolean L() {
        return this.F4;
    }

    void P(int i10, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void R() {
        if (!TextUtils.isEmpty(this.f1104e4.getText())) {
            this.f1104e4.setText(BuildConfig.FLAVOR);
            this.f1104e4.requestFocus();
            this.f1104e4.setImeVisibility(true);
        } else if (!this.E4) {
        } else {
            k kVar = this.A4;
            if (kVar != null && kVar.a()) {
                return;
            }
            clearFocus();
            k0(true);
        }
    }

    boolean S(int i10, int i11, String str) {
        m mVar = this.C4;
        if (mVar == null || !mVar.b(i10)) {
            Q(i10, 0, null);
            this.f1104e4.setImeVisibility(false);
            G();
            return true;
        }
        return false;
    }

    boolean T(int i10) {
        m mVar = this.C4;
        if (mVar == null || !mVar.a(i10)) {
            c0(i10);
            return true;
        }
        return false;
    }

    public void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void V() {
        k0(false);
        this.f1104e4.requestFocus();
        this.f1104e4.setImeVisibility(true);
        View.OnClickListener onClickListener = this.D4;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void W() {
        Editable text = this.f1104e4.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        l lVar = this.f1125z4;
        if (lVar != null && lVar.b(text.toString())) {
            return;
        }
        if (this.R4 != null) {
            P(0, null, text.toString());
        }
        this.f1104e4.setImeVisibility(false);
        G();
    }

    boolean X(View view, int i10, KeyEvent keyEvent) {
        if (this.R4 != null && this.G4 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return S(this.f1104e4.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f1104e4.setSelection(i10 == 21 ? 0 : this.f1104e4.length());
                this.f1104e4.setListSelection(0);
                this.f1104e4.clearListSelection();
                this.f1104e4.b();
                return true;
            } else if (i10 == 19) {
                this.f1104e4.getListSelection();
                return false;
            }
        }
        return false;
    }

    void Y(CharSequence charSequence) {
        Editable text = this.f1104e4.getText();
        this.O4 = text;
        boolean z10 = !TextUtils.isEmpty(text);
        j0(z10);
        l0(!z10);
        e0();
        i0();
        if (this.f1125z4 != null && !TextUtils.equals(charSequence, this.N4)) {
            this.f1125z4.a(charSequence.toString());
        }
        this.N4 = charSequence.toString();
    }

    void Z() {
        k0(L());
        b0();
        if (this.f1104e4.hasFocus()) {
            H();
        }
    }

    void a0() {
        Intent E;
        SearchableInfo searchableInfo = this.R4;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                E = F(this.f1122w4, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                E = E(this.f1123x4, searchableInfo);
            }
            getContext().startActivity(E);
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // k.c
    public void c() {
        if (this.P4) {
            return;
        }
        this.P4 = true;
        int imeOptions = this.f1104e4.getImeOptions();
        this.Q4 = imeOptions;
        this.f1104e4.setImeOptions(imeOptions | 33554432);
        this.f1104e4.setText(BuildConfig.FLAVOR);
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.K4 = true;
        super.clearFocus();
        this.f1104e4.clearFocus();
        this.f1104e4.setImeVisibility(false);
        this.K4 = false;
    }

    public void d0(CharSequence charSequence, boolean z10) {
        this.f1104e4.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1104e4;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.O4 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        W();
    }

    @Override // k.c
    public void f() {
        d0(BuildConfig.FLAVOR, false);
        clearFocus();
        k0(true);
        this.f1104e4.setImeOptions(this.Q4);
        this.P4 = false;
    }

    void f0() {
        int[] iArr = this.f1104e4.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1106g4.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1107h4.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f1104e4.getImeOptions();
    }

    public int getInputType() {
        return this.f1104e4.getInputType();
    }

    public int getMaxWidth() {
        return this.L4;
    }

    public CharSequence getQuery() {
        return this.f1104e4.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.I4;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.R4;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1124y4 : getContext().getText(this.R4.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f1121v4;
    }

    public int getSuggestionRowLayout() {
        return this.f1120u4;
    }

    public u0.a getSuggestionsAdapter() {
        return this.G4;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.T4);
        post(this.U4);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.l0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            I(this.f1104e4, this.f1114o4);
            Rect rect = this.f1115p4;
            Rect rect2 = this.f1114o4;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            p pVar = this.f1113n4;
            if (pVar != null) {
                pVar.a(this.f1115p4, this.f1114o4);
                return;
            }
            p pVar2 = new p(this.f1115p4, this.f1114o4, this.f1104e4);
            this.f1113n4 = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r0 <= 0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    @Override // androidx.appcompat.widget.l0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.L()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2c
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            goto L39
        L1d:
            int r0 = r3.L4
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.L4
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.L4
            if (r0 <= 0) goto L31
        L30:
            goto L35
        L31:
            int r0 = r3.getPreferredWidth()
        L35:
            int r4 = java.lang.Math.min(r0, r4)
        L39:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L46
            goto L53
        L46:
            int r5 = r3.getPreferredHeight()
            goto L53
        L4b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L53:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        k0(oVar.f1141q);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f1141q = L();
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (!this.K4 && isFocusable()) {
            if (L()) {
                return super.requestFocus(i10, rect);
            }
            boolean requestFocus = this.f1104e4.requestFocus(i10, rect);
            if (requestFocus) {
                k0(false);
            }
            return requestFocus;
        }
        return false;
    }

    public void setAppSearchData(Bundle bundle) {
        this.S4 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.E4 == z10) {
            return;
        }
        this.E4 = z10;
        k0(z10);
        g0();
    }

    public void setImeOptions(int i10) {
        this.f1104e4.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f1104e4.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.L4 = i10;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.A4 = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.B4 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.f1125z4 = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.D4 = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.C4 = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.I4 = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.J4 = z10;
        u0.a aVar = this.G4;
        if (aVar instanceof t0) {
            ((t0) aVar).x(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.R4 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean K = K();
        this.M4 = K;
        if (K) {
            this.f1104e4.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.H4 = z10;
        k0(L());
    }

    public void setSuggestionsAdapter(u0.a aVar) {
        this.G4 = aVar;
        this.f1104e4.setAdapter(aVar);
    }
}
