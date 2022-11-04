package y1;

import org.conscrypt.PSKKeyManager;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    private boolean f25753a;

    /* renamed from: b */
    private boolean f25754b;

    /* renamed from: c */
    private boolean f25755c;

    /* renamed from: d */
    private boolean f25756d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f25753a = z10;
        this.f25754b = z11;
        this.f25755c = z12;
        this.f25756d = z13;
    }

    public boolean a() {
        return this.f25753a;
    }

    public boolean b() {
        return this.f25755c;
    }

    public boolean c() {
        return this.f25756d;
    }

    public boolean d() {
        return this.f25754b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f25753a == bVar.f25753a && this.f25754b == bVar.f25754b && this.f25755c == bVar.f25755c && this.f25756d == bVar.f25756d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public int hashCode() {
        ?? r02 = this.f25753a;
        int i10 = r02;
        if (this.f25754b) {
            i10 = r02 + 16;
        }
        int i11 = i10;
        if (this.f25755c) {
            i11 = i10 + PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        return this.f25756d ? i11 + 4096 : i11;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f25753a), Boolean.valueOf(this.f25754b), Boolean.valueOf(this.f25755c), Boolean.valueOf(this.f25756d));
    }
}
