package de.rki.covpass.sdk.revocation;

import fc.c;
import hc.t;
import java.util.Map;
import jf.d;
import kf.d0;
import kf.h0;
import kf.h1;
import kf.j;
import kf.m0;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.h;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B1\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001a¢\u0006\u0004\b \u0010!BE\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001a\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R%\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u0011\u0010\u001e¨\u0006("}, d2 = {"Lde/rki/covpass/sdk/revocation/RevocationIndexEntry;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "c", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "timestamp", "Ljava/lang/Integer;", "getNum", "()Ljava/lang/Integer;", "num", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/revocation/RevocationIndexByte2Entry;", "Ljava/util/Map;", "()Ljava/util/Map;", "byte2", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/Map;)V", "seen1", "Lkf/h1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Integer;Ljava/util/Map;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@h
/* loaded from: classes.dex */
public final class RevocationIndexEntry {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final Long f8746a;

    /* renamed from: b */
    private final Integer f8747b;

    /* renamed from: c */
    private final Map<Byte, RevocationIndexByte2Entry> f8748c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/revocation/RevocationIndexEntry$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/revocation/RevocationIndexEntry;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RevocationIndexEntry> serializer() {
            return RevocationIndexEntry$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RevocationIndexEntry(int i10, Long l10, Integer num, Map map, h1 h1Var) {
        if (7 != (i10 & 7)) {
            w0.a(i10, 7, RevocationIndexEntry$$serializer.INSTANCE.getDescriptor());
        }
        this.f8746a = l10;
        this.f8747b = num;
        this.f8748c = map;
    }

    public RevocationIndexEntry(Long l10, Integer num, Map<Byte, RevocationIndexByte2Entry> map) {
        this.f8746a = l10;
        this.f8747b = num;
        this.f8748c = map;
    }

    @c
    public static final void c(RevocationIndexEntry revocationIndexEntry, d dVar, SerialDescriptor serialDescriptor) {
        t.e(revocationIndexEntry, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        dVar.m(serialDescriptor, 0, m0.f15197a, revocationIndexEntry.f8746a);
        dVar.m(serialDescriptor, 1, d0.f15152a, revocationIndexEntry.f8747b);
        dVar.m(serialDescriptor, 2, new h0(j.f15174a, RevocationIndexByte2Entry$$serializer.INSTANCE), revocationIndexEntry.f8748c);
    }

    public final Map<Byte, RevocationIndexByte2Entry> a() {
        return this.f8748c;
    }

    public final Long b() {
        return this.f8746a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RevocationIndexEntry)) {
            return false;
        }
        RevocationIndexEntry revocationIndexEntry = (RevocationIndexEntry) obj;
        return t.a(this.f8746a, revocationIndexEntry.f8746a) && t.a(this.f8747b, revocationIndexEntry.f8747b) && t.a(this.f8748c, revocationIndexEntry.f8748c);
    }

    public int hashCode() {
        Long l10 = this.f8746a;
        int i10 = 0;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Integer num = this.f8747b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Map<Byte, RevocationIndexByte2Entry> map = this.f8748c;
        if (map != null) {
            i10 = map.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        Long l10 = this.f8746a;
        Integer num = this.f8747b;
        Map<Byte, RevocationIndexByte2Entry> map = this.f8748c;
        return "RevocationIndexEntry(timestamp=" + l10 + ", num=" + num + ", byte2=" + map + ")";
    }
}
