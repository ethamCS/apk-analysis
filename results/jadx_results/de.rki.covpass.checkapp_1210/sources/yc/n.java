package yc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tb.x;
import ub.c0;
import ub.q0;
import ub.t;
import ub.u;
/* loaded from: classes.dex */
public enum n {
    CLASS("class", false, 2, null),
    ANNOTATION_CLASS("annotation class", false, 2, null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, null),
    FIELD("field", false, 2, null),
    LOCAL_VARIABLE("local variable", false, 2, null),
    VALUE_PARAMETER("value parameter", false, 2, null),
    CONSTRUCTOR("constructor", false, 2, null),
    FUNCTION("function", false, 2, null),
    PROPERTY_GETTER("getter", false, 2, null),
    PROPERTY_SETTER("setter", false, 2, null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE("file", false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY("class", false),
    OBJECT("object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    BACKING_FIELD("backing field", false, 2, null),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);
    
    private static final List<n> U3;
    private static final List<n> V3;
    private static final List<n> W3;
    private static final List<n> X3;
    private static final List<n> Y3;
    private static final List<n> Z3;

    /* renamed from: a4 */
    private static final List<n> f26057a4;

    /* renamed from: b4 */
    private static final List<n> f26058b4;

    /* renamed from: c4 */
    private static final List<n> f26059c4;

    /* renamed from: d4 */
    private static final List<n> f26060d4;

    /* renamed from: e4 */
    private static final List<n> f26061e4;

    /* renamed from: f4 */
    private static final List<n> f26062f4;

    /* renamed from: g4 */
    private static final Map<e, n> f26063g4;

    /* renamed from: x */
    private static final Set<n> f26081x;

    /* renamed from: y */
    private static final Set<n> f26083y;

    /* renamed from: c */
    private final String f26086c;

    /* renamed from: d */
    private final boolean f26087d;
    public static final a Companion = new a(null);

    /* renamed from: q */
    private static final HashMap<String, n> f26073q = new HashMap<>();

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        n[] values;
        Set<n> J0;
        Set<n> u02;
        List<n> k10;
        List<n> k11;
        List<n> k12;
        List<n> k13;
        List<n> k14;
        List<n> k15;
        List<n> k16;
        List<n> k17;
        List<n> d10;
        List<n> d11;
        List<n> d12;
        List<n> d13;
        Map<e, n> k18;
        for (n nVar : values()) {
            f26073q.put(nVar.name(), nVar);
        }
        n[] values2 = values();
        ArrayList arrayList = new ArrayList();
        for (n nVar2 : values2) {
            if (nVar2.f26087d) {
                arrayList.add(nVar2);
            }
        }
        J0 = c0.J0(arrayList);
        f26081x = J0;
        u02 = ub.m.u0(values());
        f26083y = u02;
        n nVar3 = CLASS;
        k10 = u.k(ANNOTATION_CLASS, nVar3);
        U3 = k10;
        k11 = u.k(LOCAL_CLASS, nVar3);
        V3 = k11;
        k12 = u.k(CLASS_ONLY, nVar3);
        W3 = k12;
        n nVar4 = OBJECT;
        k13 = u.k(COMPANION_OBJECT, nVar4, nVar3);
        X3 = k13;
        k14 = u.k(nVar4, nVar3);
        Y3 = k14;
        k15 = u.k(INTERFACE, nVar3);
        Z3 = k15;
        k16 = u.k(ENUM_CLASS, nVar3);
        f26057a4 = k16;
        n nVar5 = PROPERTY;
        n nVar6 = FIELD;
        k17 = u.k(ENUM_ENTRY, nVar5, nVar6);
        f26058b4 = k17;
        n nVar7 = PROPERTY_SETTER;
        d10 = t.d(nVar7);
        f26059c4 = d10;
        n nVar8 = PROPERTY_GETTER;
        d11 = t.d(nVar8);
        f26060d4 = d11;
        d12 = t.d(FUNCTION);
        f26061e4 = d12;
        n nVar9 = FILE;
        d13 = t.d(nVar9);
        f26062f4 = d13;
        e eVar = e.CONSTRUCTOR_PARAMETER;
        n nVar10 = VALUE_PARAMETER;
        k18 = q0.k(x.a(eVar, nVar10), x.a(e.FIELD, nVar6), x.a(e.PROPERTY, nVar5), x.a(e.FILE, nVar9), x.a(e.PROPERTY_GETTER, nVar8), x.a(e.PROPERTY_SETTER, nVar7), x.a(e.RECEIVER, nVar10), x.a(e.SETTER_PARAMETER, nVar10), x.a(e.PROPERTY_DELEGATE_FIELD, nVar6));
        f26063g4 = k18;
    }

    n(String str, boolean z10) {
        this.f26086c = str;
        this.f26087d = z10;
    }

    /* synthetic */ n(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
