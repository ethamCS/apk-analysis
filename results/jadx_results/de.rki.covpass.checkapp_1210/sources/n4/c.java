package n4;
/* loaded from: classes.dex */
public enum c {
    JSON(".json"),
    ZIP(".zip");
    

    /* renamed from: c */
    public final String f16869c;

    c(String str) {
        this.f16869c = str;
    }

    public String b() {
        return ".temp" + this.f16869c;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f16869c;
    }
}
