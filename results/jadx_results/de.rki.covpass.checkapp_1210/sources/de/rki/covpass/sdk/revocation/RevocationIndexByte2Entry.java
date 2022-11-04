package de.rki.covpass.sdk.revocation;

import fc.c;
import hc.t;
import jf.d;
import kf.d0;
import kf.h1;
import kf.m0;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.h;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB\u001b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0019\u0010\u001aB/\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lde/rki/covpass/sdk/revocation/RevocationIndexByte2Entry;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "b", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "timestamp", "Ljava/lang/Integer;", "getNum", "()Ljava/lang/Integer;", "num", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;)V", "seen1", "Lkf/h1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Integer;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@h
/* loaded from: classes.dex */
public final class RevocationIndexByte2Entry {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final Long f8744a;

    /* renamed from: b */
    private final Integer f8745b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/revocation/RevocationIndexByte2Entry$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/revocation/RevocationIndexByte2Entry;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RevocationIndexByte2Entry> serializer() {
            return RevocationIndexByte2Entry$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RevocationIndexByte2Entry(int i10, Long l10, Integer num, h1 h1Var) {
        if (3 != (i10 & 3)) {
            w0.a(i10, 3, RevocationIndexByte2Entry$$serializer.INSTANCE.getDescriptor());
        }
        this.f8744a = l10;
        this.f8745b = num;
    }

    public RevocationIndexByte2Entry(Long l10, Integer num) {
        this.f8744a = l10;
        this.f8745b = num;
    }

    @c
    public static final void b(RevocationIndexByte2Entry revocationIndexByte2Entry, d dVar, SerialDescriptor serialDescriptor) {
        t.e(revocationIndexByte2Entry, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        dVar.m(serialDescriptor, 0, m0.f15197a, revocationIndexByte2Entry.f8744a);
        dVar.m(serialDescriptor, 1, d0.f15152a, revocationIndexByte2Entry.f8745b);
    }

    public final Long a() {
        return this.f8744a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RevocationIndexByte2Entry)) {
            return false;
        }
        RevocationIndexByte2Entry revocationIndexByte2Entry = (RevocationIndexByte2Entry) obj;
        return t.a(this.f8744a, revocationIndexByte2Entry.f8744a) && t.a(this.f8745b, revocationIndexByte2Entry.f8745b);
    }

    public int hashCode() {
        Long l10 = this.f8744a;
        int i10 = 0;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Integer num = this.f8745b;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        Long l10 = this.f8744a;
        Integer num = this.f8745b;
        return "RevocationIndexByte2Entry(timestamp=" + l10 + ", num=" + num + ")";
    }
}
