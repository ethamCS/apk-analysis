package u1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a */
    private UUID f22568a;

    /* renamed from: b */
    private a f22569b;

    /* renamed from: c */
    private androidx.work.a f22570c;

    /* renamed from: d */
    private Set<String> f22571d;

    /* renamed from: e */
    private androidx.work.a f22572e;

    /* renamed from: f */
    private int f22573f;

    /* loaded from: classes.dex */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean b() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public s(UUID uuid, a aVar, androidx.work.a aVar2, List<String> list, androidx.work.a aVar3, int i10) {
        this.f22568a = uuid;
        this.f22569b = aVar;
        this.f22570c = aVar2;
        this.f22571d = new HashSet(list);
        this.f22572e = aVar3;
        this.f22573f = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f22573f != sVar.f22573f || !this.f22568a.equals(sVar.f22568a) || this.f22569b != sVar.f22569b || !this.f22570c.equals(sVar.f22570c) || !this.f22571d.equals(sVar.f22571d)) {
            return false;
        }
        return this.f22572e.equals(sVar.f22572e);
    }

    public int hashCode() {
        return (((((((((this.f22568a.hashCode() * 31) + this.f22569b.hashCode()) * 31) + this.f22570c.hashCode()) * 31) + this.f22571d.hashCode()) * 31) + this.f22572e.hashCode()) * 31) + this.f22573f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f22568a + "', mState=" + this.f22569b + ", mOutputData=" + this.f22570c + ", mTags=" + this.f22571d + ", mProgress=" + this.f22572e + '}';
    }
}
