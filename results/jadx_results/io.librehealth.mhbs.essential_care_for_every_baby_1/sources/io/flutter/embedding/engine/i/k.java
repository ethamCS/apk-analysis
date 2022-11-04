package io.flutter.embedding.engine.i;

import d.a.c.a.i;
import d.a.c.a.p;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class k {

    /* renamed from: a */
    public final boolean f1066a;

    /* renamed from: b */
    private byte[] f1067b;

    /* renamed from: c */
    private d.a.c.a.i f1068c;

    /* renamed from: d */
    private i.d f1069d;

    /* renamed from: e */
    private boolean f1070e;
    private boolean f;
    private final i.c g;

    /* loaded from: classes.dex */
    public class a implements i.d {

        /* renamed from: a */
        final /* synthetic */ byte[] f1071a;

        a(byte[] bArr) {
            k.this = r1;
            this.f1071a = bArr;
        }

        @Override // d.a.c.a.i.d
        public void a(String str, String str2, Object obj) {
            d.a.b.b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        @Override // d.a.c.a.i.d
        public void b(Object obj) {
            k.this.f1067b = this.f1071a;
        }

        @Override // d.a.c.a.i.d
        public void c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements i.c {
        b() {
            k.this = r1;
        }

        @Override // d.a.c.a.i.c
        public void g(d.a.c.a.h hVar, i.d dVar) {
            Map i;
            String str = hVar.f695a;
            Object obj = hVar.f696b;
            str.hashCode();
            if (str.equals("get")) {
                k.this.f = true;
                if (!k.this.f1070e) {
                    k kVar = k.this;
                    if (kVar.f1066a) {
                        kVar.f1069d = dVar;
                        return;
                    }
                }
                k kVar2 = k.this;
                i = kVar2.i(kVar2.f1067b);
            } else if (!str.equals("put")) {
                dVar.c();
                return;
            } else {
                k.this.f1067b = (byte[]) obj;
                i = null;
            }
            dVar.b(i);
        }
    }

    k(d.a.c.a.i iVar, boolean z) {
        this.f1070e = false;
        this.f = false;
        b bVar = new b();
        this.g = bVar;
        this.f1068c = iVar;
        this.f1066a = z;
        iVar.e(bVar);
    }

    public k(io.flutter.embedding.engine.e.a aVar, boolean z) {
        this(new d.a.c.a.i(aVar, "flutter/restoration", p.f709b), z);
    }

    public Map<String, Object> i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public void g() {
        this.f1067b = null;
    }

    public byte[] h() {
        return this.f1067b;
    }

    public void j(byte[] bArr) {
        this.f1070e = true;
        i.d dVar = this.f1069d;
        if (dVar != null) {
            dVar.b(i(bArr));
            this.f1069d = null;
        } else if (this.f) {
            this.f1068c.d("push", i(bArr), new a(bArr));
            return;
        }
        this.f1067b = bArr;
    }
}
