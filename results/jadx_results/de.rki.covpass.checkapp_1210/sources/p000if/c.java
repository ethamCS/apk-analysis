package p000if;

import hc.t;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import oc.d;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010%\u001a\u00020\u0001\u0012\n\u0010'\u001a\u0006\u0012\u0002\b\u00030&¢\u0006\u0004\b(\u0010)J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0097\u0001J\u0011\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0013\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00028\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\f8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\f8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0014\u0010 \u001a\u00020\u001d8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006*"}, d2 = {"Lif/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p", "q", BuildConfig.FLAVOR, "name", "k", "n", BuildConfig.FLAVOR, "r", BuildConfig.FLAVOR, "other", "equals", "hashCode", "toString", "j", "()Ljava/util/List;", "annotations", "m", "()I", "elementsCount", "isInline", "()Z", "o", "isNullable", "Lif/i;", "h", "()Lif/i;", "kind", "serialName", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "original", "Loc/d;", "kClass", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Loc/d;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: if.c */
/* loaded from: classes3.dex */
final class c implements SerialDescriptor {

    /* renamed from: a */
    private final SerialDescriptor f12519a;

    /* renamed from: b */
    public final d<?> f12520b;

    /* renamed from: c */
    private final String f12521c;

    public c(SerialDescriptor serialDescriptor, d<?> dVar) {
        t.e(serialDescriptor, "original");
        t.e(dVar, "kClass");
        this.f12519a = serialDescriptor;
        this.f12520b = dVar;
        this.f12521c = serialDescriptor.l() + '<' + dVar.G() + '>';
    }

    public boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && t.a(this.f12519a, cVar.f12519a) && t.a(cVar.f12520b, this.f12520b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public i h() {
        return this.f12519a.h();
    }

    public int hashCode() {
        return (this.f12520b.hashCode() * 31) + l().hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f12519a.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> j() {
        return this.f12519a.j();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int k(String str) {
        t.e(str, "name");
        return this.f12519a.k(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String l() {
        return this.f12521c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int m() {
        return this.f12519a.m();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String n(int i10) {
        return this.f12519a.n(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean o() {
        return this.f12519a.o();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> p(int i10) {
        return this.f12519a.p(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor q(int i10) {
        return this.f12519a.q(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean r(int i10) {
        return this.f12519a.r(i10);
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f12520b + ", original: " + this.f12519a + ')';
    }
}
