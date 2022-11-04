package qc;

import hc.t;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import oc.g;
import oc.h;
import oc.k;
import org.conscrypt.BuildConfig;
import rc.f;
import rc.j0;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\",\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Loc/c;", BuildConfig.FLAVOR, "value", "a", "(Loc/c;)Z", "b", "(Loc/c;Z)V", "isAccessible", "kotlin-reflection"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {
    public static final boolean a(oc.c<?> cVar) {
        sc.d<?> D;
        t.e(cVar, "<this>");
        if (cVar instanceof h) {
            k kVar = (k) cVar;
            Field b10 = c.b(kVar);
            if (!(b10 != null ? b10.isAccessible() : true)) {
                return false;
            }
            Method c10 = c.c(kVar);
            if (!(c10 != null ? c10.isAccessible() : true)) {
                return false;
            }
            Method e10 = c.e((h) cVar);
            if (!(e10 != null ? e10.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof k) {
            k kVar2 = (k) cVar;
            Field b11 = c.b(kVar2);
            if (!(b11 != null ? b11.isAccessible() : true)) {
                return false;
            }
            Method c11 = c.c(kVar2);
            if (!(c11 != null ? c11.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof k.b) {
            Field b12 = c.b(((k.b) cVar).a());
            if (!(b12 != null ? b12.isAccessible() : true)) {
                return false;
            }
            Method d10 = c.d((g) cVar);
            if (!(d10 != null ? d10.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof h.a) {
            Field b13 = c.b(((h.a) cVar).a());
            if (!(b13 != null ? b13.isAccessible() : true)) {
                return false;
            }
            Method d11 = c.d((g) cVar);
            if (!(d11 != null ? d11.isAccessible() : true)) {
                return false;
            }
        } else if (!(cVar instanceof g)) {
            throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + ')');
        } else {
            g gVar = (g) cVar;
            Method d12 = c.d(gVar);
            if (!(d12 != null ? d12.isAccessible() : true)) {
                return false;
            }
            f<?> b14 = j0.b(cVar);
            AccessibleObject accessibleObject = null;
            Object member = (b14 == null || (D = b14.D()) == null) ? null : D.getMember();
            if (member instanceof AccessibleObject) {
                accessibleObject = (AccessibleObject) member;
            }
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            Constructor a10 = c.a(gVar);
            if (!(a10 != null ? a10.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static final void b(oc.c<?> cVar, boolean z10) {
        Method method;
        sc.d<?> D;
        t.e(cVar, "<this>");
        if (cVar instanceof h) {
            k kVar = (k) cVar;
            Field b10 = c.b(kVar);
            if (b10 != null) {
                b10.setAccessible(z10);
            }
            Method c10 = c.c(kVar);
            if (c10 != null) {
                c10.setAccessible(z10);
            }
            method = c.e((h) cVar);
            if (method == null) {
                return;
            }
        } else if (cVar instanceof k) {
            k kVar2 = (k) cVar;
            Field b11 = c.b(kVar2);
            if (b11 != null) {
                b11.setAccessible(z10);
            }
            method = c.c(kVar2);
            if (method == null) {
                return;
            }
        } else if (cVar instanceof k.b) {
            Field b12 = c.b(((k.b) cVar).a());
            if (b12 != null) {
                b12.setAccessible(z10);
            }
            method = c.d((g) cVar);
            if (method == null) {
                return;
            }
        } else if (!(cVar instanceof h.a)) {
            if (!(cVar instanceof g)) {
                throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + ')');
            }
            g gVar = (g) cVar;
            Method d10 = c.d(gVar);
            if (d10 != null) {
                d10.setAccessible(z10);
            }
            f<?> b13 = j0.b(cVar);
            AccessibleObject accessibleObject = null;
            Object member = (b13 == null || (D = b13.D()) == null) ? null : D.getMember();
            if (member instanceof AccessibleObject) {
                accessibleObject = (AccessibleObject) member;
            }
            if (accessibleObject != null) {
                accessibleObject.setAccessible(true);
            }
            Constructor a10 = c.a(gVar);
            if (a10 == null) {
                return;
            }
            a10.setAccessible(z10);
            return;
        } else {
            Field b14 = c.b(((h.a) cVar).a());
            if (b14 != null) {
                b14.setAccessible(z10);
            }
            method = c.d((g) cVar);
            if (method == null) {
                return;
            }
        }
        method.setAccessible(z10);
    }
}
