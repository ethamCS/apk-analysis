package zh;

import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class q {

    /* renamed from: a */
    private final int f26979a;

    /* renamed from: b */
    private final int f26980b;

    /* renamed from: c */
    private final int f26981c;

    /* renamed from: d */
    private final int f26982d;

    /* renamed from: e */
    private final SecureRandom f26983e;

    public q(int i10, int i11, int i12, SecureRandom secureRandom) {
        this(i10, i11, i12, secureRandom, -1);
    }

    public q(int i10, int i11, int i12, SecureRandom secureRandom, int i13) {
        this.f26979a = i10;
        this.f26980b = i11;
        this.f26982d = i12;
        this.f26981c = i13;
        this.f26983e = secureRandom;
    }

    public int a() {
        return this.f26982d;
    }

    public int b() {
        return this.f26979a;
    }

    public int c() {
        return this.f26980b;
    }

    public SecureRandom d() {
        return this.f26983e;
    }

    public int e() {
        return this.f26981c;
    }
}
