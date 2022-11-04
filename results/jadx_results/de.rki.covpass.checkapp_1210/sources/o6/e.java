package o6;

import java.util.List;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    private final byte[] f17581a;

    /* renamed from: b */
    private int f17582b;

    /* renamed from: c */
    private final String f17583c;

    /* renamed from: d */
    private final List<byte[]> f17584d;

    /* renamed from: e */
    private final String f17585e;

    /* renamed from: f */
    private Integer f17586f;

    /* renamed from: g */
    private Integer f17587g;

    /* renamed from: h */
    private Object f17588h;

    /* renamed from: i */
    private final int f17589i;

    /* renamed from: j */
    private final int f17590j;

    public e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public e(byte[] bArr, String str, List<byte[]> list, String str2, int i10, int i11) {
        this.f17581a = bArr;
        this.f17582b = bArr == null ? 0 : bArr.length * 8;
        this.f17583c = str;
        this.f17584d = list;
        this.f17585e = str2;
        this.f17589i = i11;
        this.f17590j = i10;
    }

    public List<byte[]> a() {
        return this.f17584d;
    }

    public String b() {
        return this.f17585e;
    }

    public int c() {
        return this.f17582b;
    }

    public Object d() {
        return this.f17588h;
    }

    public byte[] e() {
        return this.f17581a;
    }

    public int f() {
        return this.f17589i;
    }

    public int g() {
        return this.f17590j;
    }

    public String h() {
        return this.f17583c;
    }

    public boolean i() {
        return this.f17589i >= 0 && this.f17590j >= 0;
    }

    public void j(Integer num) {
        this.f17587g = num;
    }

    public void k(Integer num) {
        this.f17586f = num;
    }

    public void l(int i10) {
        this.f17582b = i10;
    }

    public void m(Object obj) {
        this.f17588h = obj;
    }
}
