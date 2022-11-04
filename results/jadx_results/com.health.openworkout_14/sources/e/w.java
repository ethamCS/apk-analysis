package e;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class w extends h0 {

    /* renamed from: c */
    private static final b0 f4397c = b0.b("application/x-www-form-urlencoded");

    /* renamed from: a */
    private final List<String> f4398a;

    /* renamed from: b */
    private final List<String> f4399b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final List<String> f4400a;

        /* renamed from: b */
        private final List<String> f4401b;
        @Nullable

        /* renamed from: c */
        private final Charset f4402c;

        public a() {
            this(null);
        }

        public a(@Nullable Charset charset) {
            this.f4400a = new ArrayList();
            this.f4401b = new ArrayList();
            this.f4402c = charset;
        }

        public a a(String str, String str2) {
            Objects.requireNonNull(str, "name == null");
            Objects.requireNonNull(str2, "value == null");
            this.f4400a.add(z.c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f4402c));
            this.f4401b.add(z.c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f4402c));
            return this;
        }

        public a b(String str, String str2) {
            Objects.requireNonNull(str, "name == null");
            Objects.requireNonNull(str2, "value == null");
            this.f4400a.add(z.c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f4402c));
            this.f4401b.add(z.c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f4402c));
            return this;
        }

        public w c() {
            return new w(this.f4400a, this.f4401b);
        }
    }

    w(List<String> list, List<String> list2) {
        this.f4398a = e.m0.e.r(list);
        this.f4399b = e.m0.e.r(list2);
    }

    private long i(@Nullable f.d dVar, boolean z) {
        f.c cVar = z ? new f.c() : dVar.b();
        int size = this.f4398a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                cVar.D0(38);
            }
            cVar.J0(this.f4398a.get(i));
            cVar.D0(61);
            cVar.J0(this.f4399b.get(i));
        }
        if (z) {
            long v0 = cVar.v0();
            cVar.f0();
            return v0;
        }
        return 0L;
    }

    @Override // e.h0
    public long a() {
        return i(null, true);
    }

    @Override // e.h0
    public b0 b() {
        return f4397c;
    }

    @Override // e.h0
    public void h(f.d dVar) {
        i(dVar, false);
    }
}
