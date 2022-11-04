package zd;

import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ub.c0;
/* loaded from: classes3.dex */
public enum e {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);
    
    public static final a Companion = new a(null);

    /* renamed from: d */
    public static final Set<e> f26653d;

    /* renamed from: q */
    public static final Set<e> f26658q;

    /* renamed from: c */
    private final boolean f26661c;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Set<e> J0;
        Set<e> u02;
        e[] values = values();
        ArrayList arrayList = new ArrayList();
        for (e eVar : values) {
            if (eVar.f26661c) {
                arrayList.add(eVar);
            }
        }
        J0 = c0.J0(arrayList);
        f26653d = J0;
        u02 = ub.m.u0(values());
        f26658q = u02;
    }

    e(boolean z10) {
        this.f26661c = z10;
    }
}
