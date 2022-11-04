package o8;

import j$.time.Instant;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lo8/w;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "title", "I", "b", "()I", "j$/time/Instant", "date", "Lj$/time/Instant;", "a", "()Lj$/time/Instant;", "<init>", "(ILj$/time/Instant;)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a */
    private final int f17707a;

    /* renamed from: b */
    private final Instant f17708b;

    public w(int i10, Instant instant) {
        this.f17707a = i10;
        this.f17708b = instant;
    }

    public final Instant a() {
        return this.f17708b;
    }

    public final int b() {
        return this.f17707a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f17707a == wVar.f17707a && hc.t.a(this.f17708b, wVar.f17708b);
    }

    public int hashCode() {
        int i10 = this.f17707a * 31;
        Instant instant = this.f17708b;
        return i10 + (instant == null ? 0 : instant.hashCode());
    }

    public String toString() {
        int i10 = this.f17707a;
        Instant instant = this.f17708b;
        return "SettingItem(title=" + i10 + ", date=" + instant + ")";
    }
}
