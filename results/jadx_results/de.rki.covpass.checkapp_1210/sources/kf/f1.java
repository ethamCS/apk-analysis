package kf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\n\b\u0001\u0010\u0003*\u0004\u0018\u00018\u00002*\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00070\u0004B#\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 \u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b$\u0010%J\u0019\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014J\u001c\u0010\u000f\u001a\u00020\b*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014J)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0016\u001a\u00020\u0015*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010\u0014\u001a\u00020\bH\u0014J3\u0010\u0019\u001a\u00020\u0015*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006&"}, d2 = {"Lkf/f1;", BuildConfig.FLAVOR, "ElementKlass", "Element", "Lkf/n;", BuildConfig.FLAVOR, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", BuildConfig.FLAVOR, "s", "([Ljava/lang/Object;)I", BuildConfig.FLAVOR, "r", "([Ljava/lang/Object;)Ljava/util/Iterator;", "o", "p", "v", "(Ljava/util/ArrayList;)[Ljava/lang/Object;", "u", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "size", "Ltb/e0;", "q", "index", "element", "t", "(Ljava/util/ArrayList;ILjava/lang/Object;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "Loc/d;", "kClass", "Lkotlinx/serialization/KSerializer;", "eSerializer", "<init>", "(Loc/d;Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class f1<ElementKlass, Element extends ElementKlass> extends n<Element, Element[], ArrayList<Element>> {

    /* renamed from: b */
    private final oc.d<ElementKlass> f15160b;

    /* renamed from: c */
    private final SerialDescriptor f15161c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(oc.d<ElementKlass> dVar, KSerializer<Element> kSerializer) {
        super(kSerializer, null);
        hc.t.e(dVar, "kClass");
        hc.t.e(kSerializer, "eSerializer");
        this.f15160b = dVar;
        this.f15161c = new d(kSerializer.getDescriptor());
    }

    @Override // kf.n, kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return this.f15161c;
    }

    /* renamed from: o */
    public ArrayList<Element> a() {
        return new ArrayList<>();
    }

    /* renamed from: p */
    public int b(ArrayList<Element> arrayList) {
        hc.t.e(arrayList, "<this>");
        return arrayList.size();
    }

    /* renamed from: q */
    public void c(ArrayList<Element> arrayList, int i10) {
        hc.t.e(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    /* renamed from: r */
    public Iterator<Element> d(Element[] elementArr) {
        hc.t.e(elementArr, "<this>");
        return hc.d.a(elementArr);
    }

    /* renamed from: s */
    public int e(Element[] elementArr) {
        hc.t.e(elementArr, "<this>");
        return elementArr.length;
    }

    /* renamed from: t */
    public void n(ArrayList<Element> arrayList, int i10, Element element) {
        hc.t.e(arrayList, "<this>");
        arrayList.add(i10, element);
    }

    /* renamed from: u */
    public ArrayList<Element> k(Element[] elementArr) {
        List d10;
        hc.t.e(elementArr, "<this>");
        d10 = ub.l.d(elementArr);
        return new ArrayList<>(d10);
    }

    /* renamed from: v */
    public Element[] l(ArrayList<Element> arrayList) {
        hc.t.e(arrayList, "<this>");
        return (Element[]) u0.o(arrayList, this.f15160b);
    }
}
