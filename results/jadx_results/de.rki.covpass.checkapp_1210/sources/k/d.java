package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: a */
    private int f14477a;

    /* renamed from: b */
    private Resources.Theme f14478b;

    /* renamed from: c */
    private LayoutInflater f14479c;

    /* renamed from: d */
    private Configuration f14480d;

    /* renamed from: e */
    private Resources f14481e;

    public d() {
        super(null);
    }

    public d(Context context, int i10) {
        super(context);
        this.f14477a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f14478b = theme;
    }

    private Resources b() {
        if (this.f14481e == null) {
            Configuration configuration = this.f14480d;
            this.f14481e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.f14481e;
    }

    private void d() {
        boolean z10 = this.f14478b == null;
        if (z10) {
            this.f14478b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f14478b.setTo(theme);
            }
        }
        e(this.f14478b, this.f14477a, z10);
    }

    public void a(Configuration configuration) {
        if (this.f14481e == null) {
            if (this.f14480d != null) {
                throw new IllegalStateException("Override configuration has already been set");
            }
            this.f14480d = new Configuration(configuration);
            return;
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f14477a;
    }

    protected void e(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f14479c == null) {
                this.f14479c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f14479c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f14478b;
        if (theme != null) {
            return theme;
        }
        if (this.f14477a == 0) {
            this.f14477a = e.i.d_res_0x7f11023a;
        }
        d();
        return this.f14478b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f14477a != i10) {
            this.f14477a = i10;
            d();
        }
    }
}
