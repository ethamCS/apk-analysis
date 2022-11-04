package de.rki.covpass.sdk.cert.models;

import hc.t;
import java.util.List;
import kf.h1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u001f\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fB5\b\u0017\u0012\u0006\u0010 \u001a\u00020\u0010\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\t\u0010\u000f\u001a\u00020\fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006&"}, d2 = {"Lde/rki/covpass/sdk/cert/models/DscList;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "e", BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/cert/models/DscListEntry;", "certificates", BuildConfig.FLAVOR, "etag", "a", "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "Ljava/util/List;", "c", "()Ljava/util/List;", "setCertificates", "(Ljava/util/List;)V", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "seen1", "Lkf/h1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.h
/* loaded from: classes.dex */
public final class DscList {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private List<DscListEntry> f8656a;

    /* renamed from: b */
    private final String f8657b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/cert/models/DscList$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/cert/models/DscList;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DscList> serializer() {
            return DscList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DscList(int i10, List list, String str, h1 h1Var) {
        if (1 != (i10 & 1)) {
            w0.a(i10, 1, DscList$$serializer.INSTANCE.getDescriptor());
        }
        this.f8656a = list;
        if ((i10 & 2) == 0) {
            this.f8657b = BuildConfig.FLAVOR;
        } else {
            this.f8657b = str;
        }
    }

    public DscList(List<DscListEntry> list, String str) {
        t.e(list, "certificates");
        t.e(str, "etag");
        this.f8656a = list;
        this.f8657b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DscList b(DscList dscList, List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = dscList.f8656a;
        }
        if ((i10 & 2) != 0) {
            str = dscList.f8657b;
        }
        return dscList.a(list, str);
    }

    @fc.c
    public static final void e(DscList dscList, jf.d dVar, SerialDescriptor serialDescriptor) {
        t.e(dscList, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        boolean z10 = false;
        dVar.t(serialDescriptor, 0, new kf.f(DscListEntry$$serializer.INSTANCE), dscList.f8656a);
        if (dVar.p(serialDescriptor, 1) || !t.a(dscList.f8657b, BuildConfig.FLAVOR)) {
            z10 = true;
        }
        if (z10) {
            dVar.E(serialDescriptor, 1, dscList.f8657b);
        }
    }

    public final DscList a(List<DscListEntry> list, String str) {
        t.e(list, "certificates");
        t.e(str, "etag");
        return new DscList(list, str);
    }

    public final List<DscListEntry> c() {
        return this.f8656a;
    }

    public final String d() {
        return this.f8657b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DscList)) {
            return false;
        }
        DscList dscList = (DscList) obj;
        return t.a(this.f8656a, dscList.f8656a) && t.a(this.f8657b, dscList.f8657b);
    }

    public int hashCode() {
        return (this.f8656a.hashCode() * 31) + this.f8657b.hashCode();
    }

    public String toString() {
        List<DscListEntry> list = this.f8656a;
        String str = this.f8657b;
        return "DscList(certificates=" + list + ", etag=" + str + ")";
    }
}
