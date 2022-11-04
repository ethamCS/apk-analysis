package b.a.o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: a */
    private int f2048a;

    /* renamed from: b */
    private Resources.Theme f2049b;

    /* renamed from: c */
    private LayoutInflater f2050c;

    /* renamed from: d */
    private Configuration f2051d;

    /* renamed from: e */
    private Resources f2052e;

    public d() {
        super(null);
    }

    public d(Context context, int i) {
        super(context);
        this.f2048a = i;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f2049b = theme;
    }

    private Resources b() {
        Resources resources;
        if (this.f2052e == null) {
            Configuration configuration = this.f2051d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources2 = super.getResources();
                Configuration configuration2 = new Configuration(resources2.getConfiguration());
                configuration2.updateFrom(this.f2051d);
                this.f2052e = new Resources(resources2.getAssets(), resources2.getDisplayMetrics(), configuration2);
            }
            this.f2052e = resources;
        }
        return this.f2052e;
    }

    private void d() {
        boolean z = this.f2049b == null;
        if (z) {
            this.f2049b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2049b.setTo(theme);
            }
        }
        e(this.f2049b, this.f2048a, z);
    }

    public void a(Configuration configuration) {
        if (this.f2052e == null) {
            if (this.f2051d != null) {
                throw new IllegalStateException("Override configuration has already been set");
            }
            this.f2051d = new Configuration(configuration);
            return;
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f2048a;
    }

    protected void e(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
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
            if (this.f2050c == null) {
                this.f2050c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f2050c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2049b;
        if (theme != null) {
            return theme;
        }
        if (this.f2048a == 0) {
            this.f2048a = b.a.i.e_res_0x7f1101b8;
        }
        d();
        return this.f2049b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f2048a != i) {
            this.f2048a = i;
            d();
        }
    }
}
