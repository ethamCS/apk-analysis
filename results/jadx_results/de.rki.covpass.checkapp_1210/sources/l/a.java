package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* loaded from: classes.dex */
public class a implements r0.b {

    /* renamed from: a */
    private final int f15609a;

    /* renamed from: b */
    private final int f15610b;

    /* renamed from: c */
    private final int f15611c;

    /* renamed from: d */
    private CharSequence f15612d;

    /* renamed from: e */
    private CharSequence f15613e;

    /* renamed from: f */
    private Intent f15614f;

    /* renamed from: g */
    private char f15615g;

    /* renamed from: i */
    private char f15617i;

    /* renamed from: k */
    private Drawable f15619k;

    /* renamed from: l */
    private Context f15620l;

    /* renamed from: m */
    private MenuItem.OnMenuItemClickListener f15621m;

    /* renamed from: n */
    private CharSequence f15622n;

    /* renamed from: o */
    private CharSequence f15623o;

    /* renamed from: h */
    private int f15616h = 4096;

    /* renamed from: j */
    private int f15618j = 4096;

    /* renamed from: p */
    private ColorStateList f15624p = null;

    /* renamed from: q */
    private PorterDuff.Mode f15625q = null;

    /* renamed from: r */
    private boolean f15626r = false;

    /* renamed from: s */
    private boolean f15627s = false;

    /* renamed from: t */
    private int f15628t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f15620l = context;
        this.f15609a = i11;
        this.f15610b = i10;
        this.f15611c = i13;
        this.f15612d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f15619k;
        if (drawable != null) {
            if (!this.f15626r && !this.f15627s) {
                return;
            }
            Drawable r10 = androidx.core.graphics.drawable.a.r(drawable);
            this.f15619k = r10;
            Drawable mutate = r10.mutate();
            this.f15619k = mutate;
            if (this.f15626r) {
                androidx.core.graphics.drawable.a.o(mutate, this.f15624p);
            }
            if (!this.f15627s) {
                return;
            }
            androidx.core.graphics.drawable.a.p(this.f15619k, this.f15625q);
        }
    }

    @Override // r0.b
    public r0.b a(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // r0.b
    public androidx.core.view.b b() {
        return null;
    }

    @Override // r0.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public r0.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public r0.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // r0.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public r0.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // r0.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // r0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f15618j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f15617i;
    }

    @Override // r0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f15622n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f15610b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f15619k;
    }

    @Override // r0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f15624p;
    }

    @Override // r0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f15625q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f15614f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f15609a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // r0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f15616h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f15615g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f15611c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f15612d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f15613e;
        return charSequence != null ? charSequence : this.f15612d;
    }

    @Override // r0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f15623o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // r0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f15628t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f15628t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f15628t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f15628t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f15617i = Character.toLowerCase(c10);
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f15617i = Character.toLowerCase(c10);
        this.f15618j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f15628t = (z10 ? 1 : 0) | (this.f15628t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f15628t = (z10 ? 2 : 0) | (this.f15628t & (-3));
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public r0.b setContentDescription(CharSequence charSequence) {
        this.f15622n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f15628t = (z10 ? 16 : 0) | (this.f15628t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f15619k = androidx.core.content.a.d(this.f15620l, i10);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f15619k = drawable;
        c();
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15624p = colorStateList;
        this.f15626r = true;
        c();
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15625q = mode;
        this.f15627s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f15614f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f15615g = c10;
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f15615g = c10;
        this.f15616h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15621m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f15615g = c10;
        this.f15617i = Character.toLowerCase(c11);
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f15615g = c10;
        this.f15616h = KeyEvent.normalizeMetaState(i10);
        this.f15617i = Character.toLowerCase(c11);
        this.f15618j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f15612d = this.f15620l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f15612d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15613e = charSequence;
        return this;
    }

    @Override // r0.b, android.view.MenuItem
    public r0.b setTooltipText(CharSequence charSequence) {
        this.f15623o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.f15628t & 8;
        if (z10) {
            i10 = 0;
        }
        this.f15628t = i11 | i10;
        return this;
    }
}
