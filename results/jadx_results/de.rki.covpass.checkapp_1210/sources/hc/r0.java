package hc;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lhc/r0;", "Loc/o;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class r0 implements oc.o {
    public static final a Companion = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lhc/r0$a;", BuildConfig.FLAVOR, "Loc/o;", "typeParameter", BuildConfig.FLAVOR, "a", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: hc.r0$a$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0176a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f11778a;

            static {
                int[] iArr = new int[oc.q.values().length];
                iArr[oc.q.INVARIANT.ordinal()] = 1;
                iArr[oc.q.IN.ordinal()] = 2;
                iArr[oc.q.OUT.ordinal()] = 3;
                f11778a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(oc.o oVar) {
            String str;
            t.e(oVar, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i10 = C0176a.f11778a[oVar.w().ordinal()];
            if (i10 != 2) {
                if (i10 == 3) {
                    str = "out ";
                }
                sb2.append(oVar.getName());
                String sb3 = sb2.toString();
                t.d(sb3, "StringBuilder().apply(builderAction).toString()");
                return sb3;
            }
            str = "in ";
            sb2.append(str);
            sb2.append(oVar.getName());
            String sb32 = sb2.toString();
            t.d(sb32, "StringBuilder().apply(builderAction).toString()");
            return sb32;
        }
    }
}
