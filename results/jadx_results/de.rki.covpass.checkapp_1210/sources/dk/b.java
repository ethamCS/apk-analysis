package dk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public class b implements c {

    /* renamed from: d */
    private static final List f9163d = Collections.unmodifiableList(new ArrayList());

    /* renamed from: a */
    private String f9164a;

    /* renamed from: b */
    private List f9165b;

    /* renamed from: c */
    private byte[] f9166c;

    public b(String str, List list, byte[] bArr) {
        this.f9164a = str;
        this.f9165b = Collections.unmodifiableList(list);
        this.f9166c = bArr;
    }

    public b(String str, byte[] bArr) {
        this(str, f9163d, bArr);
    }

    @Override // dk.c
    public b a() {
        return this;
    }

    public byte[] b() {
        return this.f9166c;
    }

    public List c() {
        return this.f9165b;
    }

    public String d() {
        return this.f9164a;
    }
}
