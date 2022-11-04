package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.core.view.b;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public final class g implements r0.b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a */
    private final int f964a;

    /* renamed from: b */
    private final int f965b;

    /* renamed from: c */
    private final int f966c;

    /* renamed from: d */
    private final int f967d;

    /* renamed from: e */
    private CharSequence f968e;

    /* renamed from: f */
    private CharSequence f969f;

    /* renamed from: g */
    private Intent f970g;

    /* renamed from: h */
    private char f971h;

    /* renamed from: j */
    private char f973j;

    /* renamed from: l */
    private Drawable f975l;

    /* renamed from: n */
    e f977n;

    /* renamed from: o */
    private m f978o;

    /* renamed from: p */
    private Runnable f979p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f980q;

    /* renamed from: r */
    private CharSequence f981r;

    /* renamed from: s */
    private CharSequence f982s;

    /* renamed from: z */
    private int f989z;

    /* renamed from: i */
    private int f972i = 4096;

    /* renamed from: k */
    private int f974k = 4096;

    /* renamed from: m */
    private int f976m = 0;

    /* renamed from: t */
    private ColorStateList f983t = null;

    /* renamed from: u */
    private PorterDuff.Mode f984u = null;

    /* renamed from: v */
    private boolean f985v = false;

    /* renamed from: w */
    private boolean f986w = false;

    /* renamed from: x */
    private boolean f987x = false;

    /* renamed from: y */
    private int f988y = 16;
    private boolean D = false;

    /* loaded from: classes.dex */
    class a implements b.AbstractC0042b {
        a() {
            g.this = r1;
        }

        @Override // androidx.core.view.b.AbstractC0042b
        public void onActionProviderVisibilityChanged(boolean z10) {
            g gVar = g.this;
            gVar.f977n.J(gVar);
        }
    }

    public g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f977n = eVar;
        this.f964a = i11;
        this.f965b = i10;
        this.f966c = i12;
        this.f967d = i13;
        this.f968e = charSequence;
        this.f989z = i14;
    }

    private static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f987x && (this.f985v || this.f986w)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (this.f985v) {
                androidx.core.graphics.drawable.a.o(drawable, this.f983t);
            }
            if (this.f986w) {
                androidx.core.graphics.drawable.a.p(drawable, this.f984u);
            }
            this.f987x = false;
        }
        return drawable;
    }

    public boolean A() {
        return this.f977n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f989z & 4) == 4;
    }

    @Override // r0.b
    public r0.b a(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.f977n.K(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    @Override // r0.b
    public androidx.core.view.b b() {
        return this.B;
    }

    public void c() {
        this.f977n.I(this);
    }

    @Override // r0.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f989z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f977n.f(this);
    }

    @Override // r0.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f977n.k(this);
    }

    public int f() {
        return this.f967d;
    }

    public char g() {
        return this.f977n.G() ? this.f973j : this.f971h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // r0.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View d10 = bVar.d(this);
        this.A = d10;
        return d10;
    }

    @Override // r0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f974k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f973j;
    }

    @Override // r0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f981r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f965b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f975l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f976m == 0) {
            return null;
        }
        Drawable b10 = g.a.b(this.f977n.u(), this.f976m);
        this.f976m = 0;
        this.f975l = b10;
        return e(b10);
    }

    @Override // r0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f983t;
    }

    @Override // r0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f984u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f970g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f964a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // r0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f972i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f971h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f966c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f978o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f968e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f969f;
        return charSequence != null ? charSequence : this.f968e;
    }

    @Override // r0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f982s;
    }

    public String h() {
        int i10;
        char g10 = g();
        if (g10 == 0) {
            return BuildConfig.FLAVOR;
        }
        Resources resources = this.f977n.u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f977n.u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(e.h.m_res_0x7f10006c));
        }
        int i11 = this.f977n.G() ? this.f974k : this.f972i;
        d(sb2, i11, 65536, resources.getString(e.h.i_res_0x7f100068));
        d(sb2, i11, 4096, resources.getString(e.h.e_res_0x7f100064));
        d(sb2, i11, 2, resources.getString(e.h.d_res_0x7f100063));
        d(sb2, i11, 1, resources.getString(e.h.j_res_0x7f100069));
        d(sb2, i11, 4, resources.getString(e.h.l_res_0x7f10006b));
        d(sb2, i11, 8, resources.getString(e.h.h_res_0x7f100067));
        if (g10 == '\b') {
            i10 = e.h.f_res_0x7f100065;
        } else if (g10 == '\n') {
            i10 = e.h.g_res_0x7f100066;
        } else if (g10 != ' ') {
            sb2.append(g10);
            return sb2.toString();
        } else {
            i10 = e.h.k_res_0x7f10006a;
        }
        sb2.append(resources.getString(i10));
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f978o != null;
    }

    public CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // r0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f988y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f988y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f988y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        return (bVar == null || !bVar.g()) ? (this.f988y & 8) == 0 : (this.f988y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f989z & 8) != 0) {
            if (this.A == null && (bVar = this.B) != null) {
                this.A = bVar.d(this);
            }
            return this.A != null;
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f980q;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            e eVar = this.f977n;
            if (eVar.h(eVar, this)) {
                return true;
            }
            Runnable runnable = this.f979p;
            if (runnable != null) {
                runnable.run();
                return true;
            }
            if (this.f970g != null) {
                try {
                    this.f977n.u().startActivity(this.f970g);
                    return true;
                } catch (ActivityNotFoundException e10) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                }
            }
            androidx.core.view.b bVar = this.B;
            return bVar != null && bVar.e();
        }
        return true;
    }

    public boolean l() {
        return (this.f988y & 32) == 32;
    }

    public boolean m() {
        return (this.f988y & 4) != 0;
    }

    public boolean n() {
        return (this.f989z & 1) == 1;
    }

    public boolean o() {
        return (this.f989z & 2) == 2;
    }

    /* renamed from: p */
    public r0.b setActionView(int i10) {
        Context u10 = this.f977n.u();
        setActionView(LayoutInflater.from(u10).inflate(i10, (ViewGroup) new LinearLayout(u10), false));
        return this;
    }

    /* renamed from: q */
    public r0.b setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f964a) > 0) {
            view.setId(i10);
        }
        this.f977n.I(this);
        return this;
    }

    public void r(boolean z10) {
        this.D = z10;
        this.f977n.K(false);
    }

    public void s(boolean z10) {
        int i10 = this.f988y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f988y = i11;
        if (i10 != i11) {
            this.f977n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f973j == c10) {
            return this;
        }
        this.f973j = Character.toLowerCase(c10);
        this.f977n.K(false);
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f973j == c10 && this.f974k == i10) {
            return this;
        }
        this.f973j = Character.toLowerCase(c10);
        this.f974k = KeyEvent.normalizeMetaState(i10);
        this.f977n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f988y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f988y = i11;
        if (i10 != i11) {
            this.f977n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f988y & 4) != 0) {
            this.f977n.T(this);
        } else {
            s(z10);
        }
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public r0.b setContentDescription(CharSequence charSequence) {
        this.f981r = charSequence;
        this.f977n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f988y = z10 ? this.f988y | 16 : this.f988y & (-17);
        this.f977n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f975l = null;
        this.f976m = i10;
        this.f987x = true;
        this.f977n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f976m = 0;
        this.f975l = drawable;
        this.f987x = true;
        this.f977n.K(false);
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f983t = colorStateList;
        this.f985v = true;
        this.f987x = true;
        this.f977n.K(false);
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f984u = mode;
        this.f986w = true;
        this.f987x = true;
        this.f977n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f970g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f971h == c10) {
            return this;
        }
        this.f971h = c10;
        this.f977n.K(false);
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f971h == c10 && this.f972i == i10) {
            return this;
        }
        this.f971h = c10;
        this.f972i = KeyEvent.normalizeMetaState(i10);
        this.f977n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f980q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f971h = c10;
        this.f973j = Character.toLowerCase(c11);
        this.f977n.K(false);
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f971h = c10;
        this.f972i = KeyEvent.normalizeMetaState(i10);
        this.f973j = Character.toLowerCase(c11);
        this.f974k = KeyEvent.normalizeMetaState(i11);
        this.f977n.K(false);
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            this.f989z = i10;
            this.f977n.I(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f977n.u().getString(i10));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f968e = charSequence;
        this.f977n.K(false);
        m mVar = this.f978o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f969f = charSequence;
        this.f977n.K(false);
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public r0.b setTooltipText(CharSequence charSequence) {
        this.f982s = charSequence;
        this.f977n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f977n.J(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f988y = (z10 ? 4 : 0) | (this.f988y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f968e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        this.f988y = z10 ? this.f988y | 32 : this.f988y & (-33);
    }

    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    /* renamed from: w */
    public r0.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(m mVar) {
        this.f978o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    public boolean y(boolean z10) {
        int i10 = this.f988y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f988y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f977n.A();
    }
}
