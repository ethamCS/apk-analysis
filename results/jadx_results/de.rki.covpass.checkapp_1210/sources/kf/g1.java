package kf;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b/\u00100J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010\b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0097\u0001J\u0011\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0013\u0010\u0011\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u001a\u0010\u0014\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00038\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\r8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010)\u001a\b\u0012\u0004\u0012\u00020\t0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u001f¨\u00061"}, d2 = {"Lkf/g1;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkf/k;", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p", "q", BuildConfig.FLAVOR, "name", "k", "n", BuildConfig.FLAVOR, "r", BuildConfig.FLAVOR, "other", "equals", "toString", "hashCode", "original", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "j", "()Ljava/util/List;", "annotations", "m", "()I", "elementsCount", "isInline", "()Z", "Lif/i;", "h", "()Lif/i;", "kind", "serialName", "Ljava/lang/String;", "l", "()Ljava/lang/String;", BuildConfig.FLAVOR, "serialNames", "Ljava/util/Set;", "a", "()Ljava/util/Set;", "o", "isNullable", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class g1 implements SerialDescriptor, k {

    /* renamed from: a */
    private final SerialDescriptor f15164a;

    /* renamed from: b */
    private final String f15165b;

    /* renamed from: c */
    private final Set<String> f15166c;

    public g1(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "original");
        this.f15164a = serialDescriptor;
        this.f15165b = serialDescriptor.l() + '?';
        this.f15166c = v0.a(serialDescriptor);
    }

    @Override // kf.k
    public Set<String> a() {
        return this.f15166c;
    }

    public final SerialDescriptor b() {
        return this.f15164a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && hc.t.a(this.f15164a, ((g1) obj).f15164a);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public p000if.i h() {
        return this.f15164a.h();
    }

    public int hashCode() {
        return this.f15164a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f15164a.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> j() {
        return this.f15164a.j();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int k(String str) {
        hc.t.e(str, "name");
        return this.f15164a.k(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String l() {
        return this.f15165b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int m() {
        return this.f15164a.m();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String n(int i10) {
        return this.f15164a.n(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean o() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> p(int i10) {
        return this.f15164a.p(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor q(int i10) {
        return this.f15164a.q(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean r(int i10) {
        return this.f15164a.r(i10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f15164a);
        sb2.append('?');
        return sb2.toString();
    }
}
