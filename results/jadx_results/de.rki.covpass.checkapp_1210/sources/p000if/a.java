package p000if;

import hc.t;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
import ub.u;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tR.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010\r\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000fR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000fR&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000fR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000f¨\u0006 "}, d2 = {"Lif/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "elementName", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "annotations", BuildConfig.FLAVOR, "isOptional", "Ltb/e0;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "h", "(Ljava/util/List;)V", "getAnnotations$annotations", "()V", BuildConfig.FLAVOR, "elementNames", "f", "elementDescriptors", "e", "elementAnnotations", "d", "elementOptionality", "g", "serialName", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: if.a */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a */
    private final String f12512a;

    /* renamed from: b */
    private List<? extends Annotation> f12513b;

    /* renamed from: c */
    private final List<String> f12514c = new ArrayList();

    /* renamed from: d */
    private final Set<String> f12515d = new HashSet();

    /* renamed from: e */
    private final List<SerialDescriptor> f12516e = new ArrayList();

    /* renamed from: f */
    private final List<List<Annotation>> f12517f = new ArrayList();

    /* renamed from: g */
    private final List<Boolean> f12518g = new ArrayList();

    public a(String str) {
        List<? extends Annotation> h10;
        t.e(str, "serialName");
        this.f12512a = str;
        h10 = u.h();
        this.f12513b = h10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(a aVar, String str, SerialDescriptor serialDescriptor, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = u.h();
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        aVar.a(str, serialDescriptor, list, z10);
    }

    public final void a(String str, SerialDescriptor serialDescriptor, List<? extends Annotation> list, boolean z10) {
        t.e(str, "elementName");
        t.e(serialDescriptor, "descriptor");
        t.e(list, "annotations");
        if (!this.f12515d.add(str)) {
            throw new IllegalArgumentException(("Element with name '" + str + "' is already registered").toString());
        }
        this.f12514c.add(str);
        this.f12516e.add(serialDescriptor);
        this.f12517f.add(list);
        this.f12518g.add(Boolean.valueOf(z10));
    }

    public final List<Annotation> c() {
        return this.f12513b;
    }

    public final List<List<Annotation>> d() {
        return this.f12517f;
    }

    public final List<SerialDescriptor> e() {
        return this.f12516e;
    }

    public final List<String> f() {
        return this.f12514c;
    }

    public final List<Boolean> g() {
        return this.f12518g;
    }

    public final void h(List<? extends Annotation> list) {
        t.e(list, "<set-?>");
        this.f12513b = list;
    }
}
