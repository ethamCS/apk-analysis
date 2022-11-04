package uc;

import hc.t;
import hc.v;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ub.y0;
/* loaded from: classes.dex */
public enum i {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    
    public static final a Companion = new a(null);

    /* renamed from: y */
    public static final Set<i> f23421y;

    /* renamed from: c */
    private final wd.f f23422c;

    /* renamed from: d */
    private final wd.f f23423d;

    /* renamed from: q */
    private final Lazy f23424q;

    /* renamed from: x */
    private final Lazy f23425x;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v implements gc.a<wd.c> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            i.this = r1;
        }

        /* renamed from: b */
        public final wd.c invoke() {
            wd.c c10 = k.f23458r.c(i.this.h());
            t.d(c10, "BUILT_INS_PACKAGE_FQ_NAME.child(arrayTypeName)");
            return c10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends v implements gc.a<wd.c> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(0);
            i.this = r1;
        }

        /* renamed from: b */
        public final wd.c invoke() {
            wd.c c10 = k.f23458r.c(i.this.p());
            t.d(c10, "BUILT_INS_PACKAGE_FQ_NAME.child(this.typeName)");
            return c10;
        }
    }

    static {
        i iVar;
        i iVar2;
        i iVar3;
        i iVar4;
        i iVar5;
        i iVar6;
        Set<i> e10;
        e10 = y0.e(r0, iVar, iVar2, iVar3, iVar4, iVar5, iVar6);
        f23421y = e10;
    }

    i(String str) {
        Lazy b10;
        Lazy b11;
        wd.f j10 = wd.f.j(str);
        t.d(j10, "identifier(typeName)");
        this.f23422c = j10;
        wd.f j11 = wd.f.j(str + "Array");
        t.d(j11, "identifier(\"${typeName}Array\")");
        this.f23423d = j11;
        tb.o oVar = tb.o.PUBLICATION;
        b10 = tb.m.b(oVar, new c());
        this.f23424q = b10;
        b11 = tb.m.b(oVar, new b());
        this.f23425x = b11;
    }

    public final wd.c g() {
        return (wd.c) this.f23425x.getValue();
    }

    public final wd.f h() {
        return this.f23423d;
    }

    public final wd.c j() {
        return (wd.c) this.f23424q.getValue();
    }

    public final wd.f p() {
        return this.f23422c;
    }
}
