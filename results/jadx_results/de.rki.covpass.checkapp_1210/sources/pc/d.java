package pc;

import hc.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import oc.g;
import oc.m;
import org.conscrypt.BuildConfig;
import rc.f;
import rc.h;
import rc.k;
import xc.l;
import xc.y;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\"6\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005\"(\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002*\u0006\u0012\u0002\b\u00030\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0007\u001a\u0004\b\t\u0010\n\",\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\r*\u0006\u0012\u0002\b\u00030\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u000e\u0010\u000f\",\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\r*\u0006\u0012\u0002\b\u00030\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0007\u001a\u0004\b\u0012\u0010\u000f\">\u0010\u0018\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00150\r\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0007\u001a\u0004\b\u0016\u0010\u000f\">\u0010\u001b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00150\r\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0007\u001a\u0004\b\u0019\u0010\u000f\"\u001c\u0010 \u001a\u00020\u001d*\u0006\u0012\u0002\b\u00030\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u001c\u0010\"\u001a\u00020\u001d*\u0006\u0012\u0002\b\u00030\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {BuildConfig.FLAVOR, "T", "Loc/d;", "Loc/g;", "f", "(Loc/d;)Loc/g;", "getPrimaryConstructor$annotations", "(Loc/d;)V", "primaryConstructor", "a", "(Loc/d;)Loc/d;", "getCompanionObject$annotations", "companionObject", BuildConfig.FLAVOR, "d", "(Loc/d;)Ljava/util/Collection;", "getFunctions$annotations", "functions", "b", "getDeclaredFunctions$annotations", "declaredFunctions", "Loc/m;", "e", "getMemberProperties$annotations", "memberProperties", "c", "getDeclaredMemberProperties$annotations", "declaredMemberProperties", "Lrc/f;", BuildConfig.FLAVOR, "g", "(Lrc/f;)Z", "isExtension", "h", "isNotExtension", "kotlin-reflection"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class d {
    public static final oc.d<?> a(oc.d<?> dVar) {
        Object obj;
        t.e(dVar, "<this>");
        Iterator<T> it = dVar.z().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            oc.d dVar2 = (oc.d) obj;
            t.c(dVar2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            if (((h) dVar2).getDescriptor().N()) {
                break;
            }
        }
        return (oc.d) obj;
    }

    public static final Collection<g<?>> b(oc.d<?> dVar) {
        t.e(dVar, "<this>");
        Collection<f<?>> k10 = ((h.a) ((h) dVar).U().invoke()).k();
        ArrayList arrayList = new ArrayList();
        for (Object obj : k10) {
            if (obj instanceof g) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> Collection<m<T, ?>> c(oc.d<T> dVar) {
        t.e(dVar, "<this>");
        Collection<f<?>> l10 = ((h) dVar).U().invoke().l();
        ArrayList arrayList = new ArrayList();
        for (T t10 : l10) {
            f fVar = (f) t10;
            if (h(fVar) && (fVar instanceof m)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final Collection<g<?>> d(oc.d<?> dVar) {
        t.e(dVar, "<this>");
        Collection<oc.c<?>> x10 = dVar.x();
        ArrayList arrayList = new ArrayList();
        for (Object obj : x10) {
            if (obj instanceof g) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> Collection<m<T, ?>> e(oc.d<T> dVar) {
        t.e(dVar, "<this>");
        Collection<f<?>> h10 = ((h) dVar).U().invoke().h();
        ArrayList arrayList = new ArrayList();
        for (T t10 : h10) {
            f fVar = (f) t10;
            if (h(fVar) && (fVar instanceof m)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T> g<T> f(oc.d<T> dVar) {
        T t10;
        t.e(dVar, "<this>");
        Iterator<T> it = ((h) dVar).k().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            g gVar = (g) t10;
            t.c(gVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
            y E = ((k) gVar).E();
            t.c(E, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
            if (((l) E).S()) {
                break;
            }
        }
        return (g) t10;
    }

    private static final boolean g(f<?> fVar) {
        return fVar.E().U() != null;
    }

    private static final boolean h(f<?> fVar) {
        return !g(fVar);
    }
}
