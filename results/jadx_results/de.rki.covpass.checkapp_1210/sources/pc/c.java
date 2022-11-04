package pc;

import hc.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import oc.j;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\"$\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"$\u0010\t\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0005\u001a\u0004\b\u0007\u0010\u0003\"(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\n*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0005\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Loc/c;", "Loc/j;", "b", "(Loc/c;)Loc/j;", "getInstanceParameter$annotations", "(Loc/c;)V", "instanceParameter", "a", "getExtensionReceiverParameter$annotations", "extensionReceiverParameter", BuildConfig.FLAVOR, "c", "(Loc/c;)Ljava/util/List;", "getValueParameters$annotations", "valueParameters", "kotlin-reflection"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c {
    public static final j a(oc.c<?> cVar) {
        t.e(cVar, "<this>");
        Iterator<T> it = cVar.getParameters().iterator();
        Object obj = null;
        boolean z10 = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((j) next).h() == j.a.EXTENSION_RECEIVER) {
                    if (z10) {
                        break;
                    }
                    z10 = true;
                    obj2 = next;
                }
            } else if (z10) {
                obj = obj2;
            }
        }
        return (j) obj;
    }

    public static final j b(oc.c<?> cVar) {
        t.e(cVar, "<this>");
        Iterator<T> it = cVar.getParameters().iterator();
        Object obj = null;
        boolean z10 = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((j) next).h() == j.a.INSTANCE) {
                    if (z10) {
                        break;
                    }
                    z10 = true;
                    obj2 = next;
                }
            } else if (z10) {
                obj = obj2;
            }
        }
        return (j) obj;
    }

    public static final List<j> c(oc.c<?> cVar) {
        t.e(cVar, "<this>");
        List<j> parameters = cVar.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((j) obj).h() == j.a.VALUE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
