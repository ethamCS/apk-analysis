package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes.dex */
public class d {

    /* renamed from: n */
    private static final Object f3817n = new Object();

    /* renamed from: o */
    private static final Object f3818o = new Object();

    /* renamed from: p */
    private static volatile d f3819p;

    /* renamed from: b */
    private final Set<e> f3821b;

    /* renamed from: e */
    private final b f3824e;

    /* renamed from: f */
    final g f3825f;

    /* renamed from: g */
    final boolean f3826g;

    /* renamed from: h */
    final boolean f3827h;

    /* renamed from: i */
    final int[] f3828i;

    /* renamed from: j */
    private final boolean f3829j;

    /* renamed from: k */
    private final int f3830k;

    /* renamed from: l */
    private final int f3831l;

    /* renamed from: m */
    private final AbstractC0047d f3832m;

    /* renamed from: a */
    private final ReadWriteLock f3820a = new ReentrantReadWriteLock();

    /* renamed from: c */
    private volatile int f3822c = 3;

    /* renamed from: d */
    private final Handler f3823d = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: b */
        private volatile androidx.emoji2.text.g f3833b;

        /* renamed from: c */
        private volatile l f3834c;

        /* renamed from: androidx.emoji2.text.d$a$a */
        /* loaded from: classes.dex */
        class C0046a extends h {
            C0046a() {
                a.this = r1;
            }

            @Override // androidx.emoji2.text.d.h
            public void a(Throwable th2) {
                a.this.f3836a.m(th2);
            }

            @Override // androidx.emoji2.text.d.h
            public void b(l lVar) {
                a.this.d(lVar);
            }
        }

        a(d dVar) {
            super(dVar);
        }

        @Override // androidx.emoji2.text.d.b
        void a() {
            try {
                this.f3836a.f3825f.a(new C0046a());
            } catch (Throwable th2) {
                this.f3836a.m(th2);
            }
        }

        @Override // androidx.emoji2.text.d.b
        CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f3833b.h(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.d.b
        void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f3834c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f3836a.f3826g);
        }

        void d(l lVar) {
            if (lVar == null) {
                this.f3836a.m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f3834c = lVar;
            l lVar2 = this.f3834c;
            i iVar = new i();
            AbstractC0047d abstractC0047d = this.f3836a.f3832m;
            d dVar = this.f3836a;
            this.f3833b = new androidx.emoji2.text.g(lVar2, iVar, abstractC0047d, dVar.f3827h, dVar.f3828i);
            this.f3836a.n();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final d f3836a;

        b(d dVar) {
            this.f3836a = dVar;
        }

        void a() {
            throw null;
        }

        CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            throw null;
        }

        void c(EditorInfo editorInfo) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a */
        final g f3837a;

        /* renamed from: b */
        boolean f3838b;

        /* renamed from: c */
        boolean f3839c;

        /* renamed from: d */
        int[] f3840d;

        /* renamed from: e */
        Set<e> f3841e;

        /* renamed from: f */
        boolean f3842f;

        /* renamed from: g */
        int f3843g = -16711936;

        /* renamed from: h */
        int f3844h = 0;

        /* renamed from: i */
        AbstractC0047d f3845i = new g.b();

        public c(g gVar) {
            androidx.core.util.h.h(gVar, "metadataLoader cannot be null.");
            this.f3837a = gVar;
        }

        public final g a() {
            return this.f3837a;
        }

        public c b(int i10) {
            this.f3844h = i10;
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.d$d */
    /* loaded from: classes.dex */
    public interface AbstractC0047d {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public void a(Throwable th2) {
        }

        public void b() {
        }
    }

    /* loaded from: classes.dex */
    public static class f implements Runnable {

        /* renamed from: c */
        private final List<e> f3846c;

        /* renamed from: d */
        private final Throwable f3847d;

        /* renamed from: q */
        private final int f3848q;

        f(e eVar, int i10) {
            this(Arrays.asList((e) androidx.core.util.h.h(eVar, "initCallback cannot be null")), i10, null);
        }

        f(Collection<e> collection, int i10) {
            this(collection, i10, null);
        }

        f(Collection<e> collection, int i10, Throwable th2) {
            androidx.core.util.h.h(collection, "initCallbacks cannot be null");
            this.f3846c = new ArrayList(collection);
            this.f3848q = i10;
            this.f3847d = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3846c.size();
            int i10 = 0;
            if (this.f3848q != 1) {
                while (i10 < size) {
                    this.f3846c.get(i10).a(this.f3847d);
                    i10++;
                }
                return;
            }
            while (i10 < size) {
                this.f3846c.get(i10).b();
                i10++;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(h hVar);
    }

    /* loaded from: classes.dex */
    public static abstract class h {
        public abstract void a(Throwable th2);

        public abstract void b(l lVar);
    }

    /* loaded from: classes.dex */
    public static class i {
        i() {
        }

        public androidx.emoji2.text.h a(androidx.emoji2.text.f fVar) {
            return new n(fVar);
        }
    }

    private d(c cVar) {
        this.f3826g = cVar.f3838b;
        this.f3827h = cVar.f3839c;
        this.f3828i = cVar.f3840d;
        this.f3829j = cVar.f3842f;
        this.f3830k = cVar.f3843g;
        this.f3825f = cVar.f3837a;
        this.f3831l = cVar.f3844h;
        this.f3832m = cVar.f3845i;
        i0.b bVar = new i0.b();
        this.f3821b = bVar;
        Set<e> set = cVar.f3841e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f3841e);
        }
        this.f3824e = new a(this);
        l();
    }

    public static d b() {
        d dVar;
        synchronized (f3817n) {
            dVar = f3819p;
            androidx.core.util.h.j(dVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return dVar;
    }

    public static boolean e(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return androidx.emoji2.text.g.c(inputConnection, editable, i10, i11, z10);
    }

    public static boolean f(Editable editable, int i10, KeyEvent keyEvent) {
        return androidx.emoji2.text.g.d(editable, i10, keyEvent);
    }

    public static d g(c cVar) {
        d dVar = f3819p;
        if (dVar == null) {
            synchronized (f3817n) {
                dVar = f3819p;
                if (dVar == null) {
                    dVar = new d(cVar);
                    f3819p = dVar;
                }
            }
        }
        return dVar;
    }

    public static boolean h() {
        return f3819p != null;
    }

    private boolean j() {
        return d() == 1;
    }

    private void l() {
        this.f3820a.writeLock().lock();
        try {
            if (this.f3831l == 0) {
                this.f3822c = 0;
            }
            this.f3820a.writeLock().unlock();
            if (d() != 0) {
                return;
            }
            this.f3824e.a();
        } catch (Throwable th2) {
            this.f3820a.writeLock().unlock();
            throw th2;
        }
    }

    public int c() {
        return this.f3830k;
    }

    public int d() {
        this.f3820a.readLock().lock();
        try {
            return this.f3822c;
        } finally {
            this.f3820a.readLock().unlock();
        }
    }

    public boolean i() {
        return this.f3829j;
    }

    public void k() {
        boolean z10 = true;
        if (this.f3831l != 1) {
            z10 = false;
        }
        androidx.core.util.h.j(z10, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (j()) {
            return;
        }
        this.f3820a.writeLock().lock();
        try {
            if (this.f3822c == 0) {
                return;
            }
            this.f3822c = 0;
            this.f3820a.writeLock().unlock();
            this.f3824e.a();
        } finally {
            this.f3820a.writeLock().unlock();
        }
    }

    void m(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f3820a.writeLock().lock();
        try {
            this.f3822c = 2;
            arrayList.addAll(this.f3821b);
            this.f3821b.clear();
            this.f3820a.writeLock().unlock();
            this.f3823d.post(new f(arrayList, this.f3822c, th2));
        } catch (Throwable th3) {
            this.f3820a.writeLock().unlock();
            throw th3;
        }
    }

    void n() {
        ArrayList arrayList = new ArrayList();
        this.f3820a.writeLock().lock();
        try {
            this.f3822c = 1;
            arrayList.addAll(this.f3821b);
            this.f3821b.clear();
            this.f3820a.writeLock().unlock();
            this.f3823d.post(new f(arrayList, this.f3822c));
        } catch (Throwable th2) {
            this.f3820a.writeLock().unlock();
            throw th2;
        }
    }

    public CharSequence o(CharSequence charSequence) {
        return p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence p(CharSequence charSequence, int i10, int i11) {
        return q(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11, int i12) {
        return r(charSequence, i10, i11, i12, 0);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        androidx.core.util.h.j(j(), "Not initialized yet");
        androidx.core.util.h.e(i10, "start cannot be negative");
        androidx.core.util.h.e(i11, "end cannot be negative");
        androidx.core.util.h.e(i12, "maxEmojiCount cannot be negative");
        boolean z11 = false;
        androidx.core.util.h.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        androidx.core.util.h.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        androidx.core.util.h.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            if (i13 != 2) {
                z11 = this.f3826g;
            }
            z10 = z11;
        } else {
            z10 = true;
        }
        return this.f3824e.b(charSequence, i10, i11, i12, z10);
    }

    public void s(e eVar) {
        androidx.core.util.h.h(eVar, "initCallback cannot be null");
        this.f3820a.writeLock().lock();
        try {
            if (this.f3822c != 1 && this.f3822c != 2) {
                this.f3821b.add(eVar);
            }
            this.f3823d.post(new f(eVar, this.f3822c));
        } finally {
            this.f3820a.writeLock().unlock();
        }
    }

    public void t(e eVar) {
        androidx.core.util.h.h(eVar, "initCallback cannot be null");
        this.f3820a.writeLock().lock();
        try {
            this.f3821b.remove(eVar);
        } finally {
            this.f3820a.writeLock().unlock();
        }
    }

    public void u(EditorInfo editorInfo) {
        if (!j() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f3824e.c(editorInfo);
    }
}
