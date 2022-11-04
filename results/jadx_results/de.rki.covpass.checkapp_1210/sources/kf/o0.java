package kf;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
import p000if.j;
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B!\b\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0001\u0012\u0006\u0010 \u001a\u00020\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016R\u001a\u0010\u0013\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0082\u0001\u0002#$¨\u0006%"}, d2 = {"Lkf/o0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "n", "name", "k", BuildConfig.FLAVOR, "r", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p", "q", BuildConfig.FLAVOR, "other", "equals", "hashCode", "toString", "serialName", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "Lif/i;", "h", "()Lif/i;", "kind", "elementsCount", "I", "m", "()I", "keyDescriptor", "valueDescriptor", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lkf/g0;", "Lkf/w;", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class o0 implements SerialDescriptor {

    /* renamed from: a */
    private final String f15211a;

    /* renamed from: b */
    private final SerialDescriptor f15212b;

    /* renamed from: c */
    private final SerialDescriptor f15213c;

    /* renamed from: d */
    private final int f15214d;

    private o0(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.f15211a = str;
        this.f15212b = serialDescriptor;
        this.f15213c = serialDescriptor2;
        this.f15214d = 2;
    }

    public /* synthetic */ o0(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, serialDescriptor, serialDescriptor2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return hc.t.a(l(), o0Var.l()) && hc.t.a(this.f15212b, o0Var.f15212b) && hc.t.a(this.f15213c, o0Var.f15213c);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public p000if.i h() {
        return j.c.f12555a;
    }

    public int hashCode() {
        return (((l().hashCode() * 31) + this.f15212b.hashCode()) * 31) + this.f15213c.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.a.b(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> j() {
        return SerialDescriptor.a.a(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int k(String str) {
        Integer l10;
        hc.t.e(str, "name");
        l10 = bf.w.l(str);
        if (l10 != null) {
            return l10.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid map index");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String l() {
        return this.f15211a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int m() {
        return this.f15214d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String n(int i10) {
        return String.valueOf(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean o() {
        return SerialDescriptor.a.c(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> p(int i10) {
        List<Annotation> h10;
        if (i10 >= 0) {
            h10 = ub.u.h();
            return h10;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + l() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor q(int i10) {
        if (i10 >= 0) {
            int i11 = i10 % 2;
            if (i11 == 0) {
                return this.f15212b;
            }
            if (i11 != 1) {
                throw new IllegalStateException("Unreached".toString());
            }
            return this.f15213c;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + l() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean r(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + l() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return l() + '(' + this.f15212b + ", " + this.f15213c + ')';
    }
}
