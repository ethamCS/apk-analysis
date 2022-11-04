package h6;
/* loaded from: classes.dex */
public class s {

    /* renamed from: a */
    private final float f11373a;

    /* renamed from: b */
    private final float f11374b;

    public s(float f10, float f11) {
        this.f11373a = f10;
        this.f11374b = f11;
    }

    private static float a(s sVar, s sVar2, s sVar3) {
        float f10 = sVar2.f11373a;
        float f11 = sVar2.f11374b;
        return ((sVar3.f11373a - f10) * (sVar.f11374b - f11)) - ((sVar3.f11374b - f11) * (sVar.f11373a - f10));
    }

    public static float b(s sVar, s sVar2) {
        return p6.a.a(sVar.f11373a, sVar.f11374b, sVar2.f11373a, sVar2.f11374b);
    }

    public static void e(s[] sVarArr) {
        s sVar;
        s sVar2;
        s sVar3;
        float b10 = b(sVarArr[0], sVarArr[1]);
        float b11 = b(sVarArr[1], sVarArr[2]);
        float b12 = b(sVarArr[0], sVarArr[2]);
        if (b11 >= b10 && b11 >= b12) {
            sVar3 = sVarArr[0];
            sVar2 = sVarArr[1];
            sVar = sVarArr[2];
        } else if (b12 < b11 || b12 < b10) {
            sVar3 = sVarArr[2];
            sVar2 = sVarArr[0];
            sVar = sVarArr[1];
        } else {
            sVar3 = sVarArr[1];
            sVar2 = sVarArr[0];
            sVar = sVarArr[2];
        }
        if (a(sVar2, sVar3, sVar) < 0.0f) {
            s sVar4 = sVar;
            sVar = sVar2;
            sVar2 = sVar4;
        }
        sVarArr[0] = sVar2;
        sVarArr[1] = sVar3;
        sVarArr[2] = sVar;
    }

    public final float c() {
        return this.f11373a;
    }

    public final float d() {
        return this.f11374b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f11373a == sVar.f11373a && this.f11374b == sVar.f11374b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f11373a) * 31) + Float.floatToIntBits(this.f11374b);
    }

    public final String toString() {
        return "(" + this.f11373a + ',' + this.f11374b + ')';
    }
}
