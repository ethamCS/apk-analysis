package io.flutter.plugin.platform;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.Window;
import io.flutter.embedding.engine.i.i;
import java.io.FileNotFoundException;
import java.util.List;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    private final Activity f1185a;

    /* renamed from: b */
    private final io.flutter.embedding.engine.i.i f1186b;

    /* renamed from: c */
    private final c f1187c;

    /* renamed from: d */
    private i.j f1188d;

    /* renamed from: e */
    private int f1189e = 1280;
    final i.h f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements i.h {
        a() {
            d.this = r1;
        }

        @Override // io.flutter.embedding.engine.i.i.h
        public void d() {
            d.this.m();
        }

        @Override // io.flutter.embedding.engine.i.i.h
        public void e(int i) {
            d.this.r(i);
        }

        @Override // io.flutter.embedding.engine.i.i.h
        public void f(i.c cVar) {
            d.this.p(cVar);
        }

        @Override // io.flutter.embedding.engine.i.i.h
        public void g(i.g gVar) {
            d.this.u(gVar);
        }

        @Override // io.flutter.embedding.engine.i.i.h
        public void h(List<i.k> list) {
            d.this.q(list);
        }

        @Override // io.flutter.embedding.engine.i.i.h
        public void i() {
            d.this.n();
        }

        @Override // io.flutter.embedding.engine.i.i.h
        public void j(String str) {
            d.this.o(str);
        }

        @Override // io.flutter.embedding.engine.i.i.h
        public boolean k() {
            CharSequence k = d.this.k(i.e.PLAIN_TEXT);
            return k != null && k.length() > 0;
        }

        @Override // io.flutter.embedding.engine.i.i.h
        public void l(i.EnumC0053i enumC0053i) {
            d.this.l(enumC0053i);
        }

        @Override // io.flutter.embedding.engine.i.i.h
        public CharSequence m(i.e eVar) {
            return d.this.k(eVar);
        }

        @Override // io.flutter.embedding.engine.i.i.h
        public void n(i.j jVar) {
            d.this.s(jVar);
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f1191a;

        /* renamed from: b */
        static final /* synthetic */ int[] f1192b;

        /* renamed from: c */
        static final /* synthetic */ int[] f1193c;

        static {
            int[] iArr = new int[i.d.values().length];
            f1193c = iArr;
            try {
                iArr[i.d.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1193c[i.d.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[i.k.values().length];
            f1192b = iArr2;
            try {
                iArr2[i.k.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1192b[i.k.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[i.g.values().length];
            f1191a = iArr3;
            try {
                iArr3[i.g.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1191a[i.g.LIGHT_IMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1191a[i.g.MEDIUM_IMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1191a[i.g.HEAVY_IMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1191a[i.g.SELECTION_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean d();
    }

    public d(Activity activity, io.flutter.embedding.engine.i.i iVar, c cVar) {
        a aVar = new a();
        this.f = aVar;
        this.f1185a = activity;
        this.f1186b = iVar;
        iVar.j(aVar);
        this.f1187c = cVar;
    }

    public CharSequence k(i.e eVar) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f1185a.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (primaryClip == null) {
                return null;
            }
            if (eVar != null && eVar != i.e.PLAIN_TEXT) {
                return null;
            }
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt.getUri() != null) {
                this.f1185a.getContentResolver().openTypedAssetFileDescriptor(itemAt.getUri(), "text/*", null);
            }
            return itemAt.coerceToText(this.f1185a);
        } catch (FileNotFoundException unused) {
            return null;
        } catch (SecurityException e2) {
            d.a.b.g("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e2);
            return null;
        }
    }

    public void l(i.EnumC0053i enumC0053i) {
        if (enumC0053i == i.EnumC0053i.CLICK) {
            this.f1185a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    public void m() {
        c cVar = this.f1187c;
        if (cVar == null || !cVar.d()) {
            Activity activity = this.f1185a;
            if (!(activity instanceof androidx.activity.d)) {
                activity.finish();
            } else {
                ((androidx.activity.d) activity).i().b();
                throw null;
            }
        }
    }

    public void n() {
        t();
    }

    public void o(String str) {
        ((ClipboardManager) this.f1185a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    public void p(i.c cVar) {
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            return;
        }
        if (i < 28 && i > 21) {
            this.f1185a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f1017b, (Bitmap) null, cVar.f1016a));
        }
        if (i < 28) {
            return;
        }
        this.f1185a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f1017b, 0, cVar.f1016a));
    }

    public void q(List<i.k> list) {
        int i = (list.size() != 0 || Build.VERSION.SDK_INT < 19) ? 1798 : 5894;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int i3 = b.f1192b[list.get(i2).ordinal()];
            if (i3 == 1) {
                i &= -5;
            } else if (i3 == 2) {
                i = i & (-513) & (-3);
            }
        }
        this.f1189e = i;
        t();
    }

    public void r(int i) {
        this.f1185a.setRequestedOrientation(i);
    }

    public void s(i.j jVar) {
        Window window = this.f1185a.getWindow();
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            i.d dVar = jVar.f1042d;
            if (dVar != null) {
                int i2 = b.f1193c[dVar.ordinal()];
                if (i2 == 1) {
                    systemUiVisibility |= 16;
                } else if (i2 == 2) {
                    systemUiVisibility &= -17;
                }
            }
            Integer num = jVar.f1041c;
            if (num != null) {
                window.setNavigationBarColor(num.intValue());
            }
        }
        if (i >= 23) {
            i.d dVar2 = jVar.f1040b;
            if (dVar2 != null) {
                int i3 = b.f1193c[dVar2.ordinal()];
                if (i3 == 1) {
                    systemUiVisibility |= 8192;
                } else if (i3 == 2) {
                    systemUiVisibility &= -8193;
                }
            }
            Integer num2 = jVar.f1039a;
            if (num2 != null) {
                window.setStatusBarColor(num2.intValue());
            }
        }
        if (jVar.f1043e != null && i >= 28) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(134217728);
            window.setNavigationBarDividerColor(jVar.f1043e.intValue());
        }
        decorView.setSystemUiVisibility(systemUiVisibility);
        this.f1188d = jVar;
    }

    public void j() {
        this.f1186b.j(null);
    }

    public void t() {
        this.f1185a.getWindow().getDecorView().setSystemUiVisibility(this.f1189e);
        i.j jVar = this.f1188d;
        if (jVar != null) {
            s(jVar);
        }
    }

    void u(i.g gVar) {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        View decorView = this.f1185a.getWindow().getDecorView();
        int i3 = b.f1191a[gVar.ordinal()];
        int i4 = 1;
        if (i3 != 1) {
            if (i3 != 2) {
                i4 = 3;
                if (i3 != 3) {
                    i4 = 4;
                    if (i3 != 4) {
                        if (i3 != 5 || i2 < 21) {
                            return;
                        }
                    } else if (i2 < 23) {
                        return;
                    } else {
                        i = 6;
                    }
                }
            }
            decorView.performHapticFeedback(i4);
            return;
        }
        i = 0;
        decorView.performHapticFeedback(i);
    }
}
