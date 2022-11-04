package ei;

import java.util.HashMap;
import java.util.Map;
import nh.a0;
import nh.b0;
import nh.c0;
import nh.p;
import nh.v;
import nh.w;
import nh.x;
import nh.y;
import nh.z;
import org.bouncycastle.crypto.r;
import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a */
    private static final Map f9664a;

    /* renamed from: ei.a$a */
    /* loaded from: classes3.dex */
    static class C0142a {
        C0142a() {
        }
    }

    /* loaded from: classes3.dex */
    static class b {
        b() {
        }
    }

    /* loaded from: classes3.dex */
    static class c {
        c() {
        }
    }

    /* loaded from: classes3.dex */
    static class d {
        d() {
        }
    }

    /* loaded from: classes3.dex */
    static class e {
        e() {
        }
    }

    /* loaded from: classes3.dex */
    static class f {
        f() {
        }
    }

    /* loaded from: classes3.dex */
    static class g {
        g() {
        }
    }

    /* loaded from: classes3.dex */
    static class h {
        h() {
        }
    }

    /* loaded from: classes3.dex */
    static class i {
        i() {
        }
    }

    /* loaded from: classes3.dex */
    static class j {
        j() {
        }
    }

    /* loaded from: classes3.dex */
    static class k {
        k() {
        }
    }

    /* loaded from: classes3.dex */
    static class l {
        l() {
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f9664a = hashMap;
        hashMap.put(a().getAlgorithmName(), new d());
        hashMap.put(b().getAlgorithmName(), new e());
        hashMap.put(c().getAlgorithmName(), new f());
        hashMap.put(d().getAlgorithmName(), new g());
        hashMap.put(e().getAlgorithmName(), new h());
        hashMap.put(j().getAlgorithmName(), new i());
        hashMap.put(f().getAlgorithmName(), new j());
        hashMap.put(g().getAlgorithmName(), new k());
        hashMap.put(h().getAlgorithmName(), new l());
        hashMap.put(i().getAlgorithmName(), new C0142a());
        hashMap.put(m().getAlgorithmName(), new b());
        hashMap.put(n().getAlgorithmName(), new c());
    }

    public static r a() {
        return new p();
    }

    public static r b() {
        return new v();
    }

    public static r c() {
        return new w();
    }

    public static r d() {
        return new x();
    }

    public static r e() {
        return new y();
    }

    public static r f() {
        return new z(224);
    }

    public static r g() {
        return new z((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    public static r h() {
        return new z(384);
    }

    public static r i() {
        return new z(512);
    }

    public static r j() {
        return new a0();
    }

    public static r k() {
        return new b0(224);
    }

    public static r l() {
        return new b0((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    public static r m() {
        return new c0(128);
    }

    public static r n() {
        return new c0((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }
}
