package sc;

import hc.t;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import sc.d;
import ub.c0;
import ub.q0;
import ub.v;
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0012 BA\u0012\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lsc/a;", "Lsc/d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "args", BuildConfig.FLAVOR, "g", "([Ljava/lang/Object;)Ljava/lang/Object;", "c", "()Ljava/lang/Void;", "member", "Ljava/lang/reflect/Type;", "e", "()Ljava/lang/reflect/Type;", "returnType", BuildConfig.FLAVOR, "parameterTypes", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/Class;", "jClass", BuildConfig.FLAVOR, "parameterNames", "Lsc/a$a;", "callMode", "Lsc/a$b;", "origin", "Ljava/lang/reflect/Method;", "methods", "<init>", "(Ljava/lang/Class;Ljava/util/List;Lsc/a$a;Lsc/a$b;Ljava/util/List;)V", "b", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a */
    private final Class<?> f21611a;

    /* renamed from: b */
    private final List<String> f21612b;

    /* renamed from: c */
    private final EnumC0363a f21613c;

    /* renamed from: d */
    private final List<Method> f21614d;

    /* renamed from: e */
    private final List<Type> f21615e;

    /* renamed from: f */
    private final List<Class<?>> f21616f;

    /* renamed from: g */
    private final List<Object> f21617g;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lsc/a$a;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "CALL_BY_NAME", "POSITIONAL_CALL", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* renamed from: sc.a$a */
    /* loaded from: classes.dex */
    public enum EnumC0363a {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lsc/a$b;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "JAVA", "KOTLIN", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public enum b {
        JAVA,
        KOTLIN
    }

    public a(Class<?> cls, List<String> list, EnumC0363a enumC0363a, b bVar, List<Method> list2) {
        int s10;
        int s11;
        int s12;
        List l02;
        t.e(cls, "jClass");
        t.e(list, "parameterNames");
        t.e(enumC0363a, "callMode");
        t.e(bVar, "origin");
        t.e(list2, "methods");
        this.f21611a = cls;
        this.f21612b = list;
        this.f21613c = enumC0363a;
        this.f21614d = list2;
        s10 = v.s(list2, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (Method method : list2) {
            arrayList.add(method.getGenericReturnType());
        }
        this.f21615e = arrayList;
        List<Method> list3 = this.f21614d;
        s11 = v.s(list3, 10);
        ArrayList arrayList2 = new ArrayList(s11);
        for (Method method2 : list3) {
            Class<?> returnType = method2.getReturnType();
            t.d(returnType, "it");
            Class<?> g10 = dd.d.g(returnType);
            if (g10 != null) {
                returnType = g10;
            }
            arrayList2.add(returnType);
        }
        this.f21616f = arrayList2;
        List<Method> list4 = this.f21614d;
        s12 = v.s(list4, 10);
        ArrayList arrayList3 = new ArrayList(s12);
        for (Method method3 : list4) {
            arrayList3.add(method3.getDefaultValue());
        }
        this.f21617g = arrayList3;
        if (this.f21613c == EnumC0363a.POSITIONAL_CALL && bVar == b.JAVA) {
            l02 = c0.l0(this.f21612b, "value");
            if (!l02.isEmpty()) {
                throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ a(java.lang.Class r7, java.util.List r8, sc.a.EnumC0363a r9, sc.a.b r10, java.util.List r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L2a
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = ub.s.s(r8, r12)
            r11.<init>(r12)
            java.util.Iterator r12 = r8.iterator()
        L13:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L2a
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.reflect.Method r13 = r7.getDeclaredMethod(r13, r0)
            r11.add(r13)
            goto L13
        L2a:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.a.<init>(java.lang.Class, java.util.List, sc.a$a, sc.a$b, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Override // sc.d
    public List<Type> a() {
        return this.f21615e;
    }

    public void b(Object[] objArr) {
        d.a.a(this, objArr);
    }

    public Void c() {
        return null;
    }

    @Override // sc.d
    public Type e() {
        return this.f21611a;
    }

    @Override // sc.d
    public Object g(Object[] objArr) {
        List M0;
        Map q10;
        t.e(objArr, "args");
        b(objArr);
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            int i12 = i11 + 1;
            Object l10 = (obj == null && this.f21613c == EnumC0363a.CALL_BY_NAME) ? this.f21617g.get(i11) : sc.b.l(obj, this.f21616f.get(i11));
            if (l10 == null) {
                sc.b.k(i11, this.f21612b.get(i11), this.f21616f.get(i11));
                throw null;
            }
            arrayList.add(l10);
            i10++;
            i11 = i12;
        }
        Class<?> cls = this.f21611a;
        M0 = c0.M0(this.f21612b, arrayList);
        q10 = q0.q(M0);
        return sc.b.f(cls, q10, this.f21614d);
    }

    @Override // sc.d
    public /* bridge */ /* synthetic */ Member getMember() {
        return (Member) c();
    }
}
