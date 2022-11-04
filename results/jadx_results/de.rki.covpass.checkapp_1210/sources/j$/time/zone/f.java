package j$.time.zone;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a */
    private static final CopyOnWriteArrayList f13226a;

    /* renamed from: b */
    private static final ConcurrentHashMap f13227b = new ConcurrentHashMap(512, 0.75f, 2);

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f13226a = copyOnWriteArrayList;
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new d(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public static Set a() {
        return new HashSet(f13227b.keySet());
    }

    public static ZoneRules b(String str, boolean z10) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = f13227b;
        f fVar = (f) concurrentHashMap.get(str);
        if (fVar == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new c("No time-zone data files registered");
            }
            throw new c("Unknown time-zone ID: " + str);
        }
        return fVar.c(str);
    }

    public static void e(f fVar) {
        Objects.requireNonNull(fVar, "provider");
        for (String str : fVar.d()) {
            Objects.requireNonNull(str, "zoneId");
            if (((f) f13227b.putIfAbsent(str, fVar)) != null) {
                throw new c("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + fVar);
            }
        }
        f13226a.add(fVar);
    }

    protected abstract ZoneRules c(String str);

    protected abstract Set d();
}
