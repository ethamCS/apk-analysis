package hb;

import hc.k0;
import hc.t;
import hc.y;
import io.ktor.utils.io.s;
import java.util.Map;
import kotlin.Metadata;
import oc.k;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\u0006\u0010\u001d\u001a\u00028\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\f\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fRS\u0010\u0018\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0018\u00010\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0018\u00010\u00108@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R+\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u00018V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lhb/f;", "Key", "Value", BuildConfig.FLAVOR, "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ltb/e0;", "b", "()V", BuildConfig.FLAVOR, "toString", "key", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "Lhb/e;", "<set-?>", "backReference$delegate", "Lkc/d;", "a", "()Lhb/e;", "d", "(Lhb/e;)V", "backReference", "value$delegate", "getValue", "e", "(Ljava/lang/Object;)V", "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class f<Key, Value> implements Map.Entry<Key, Value>, ic.d {

    /* renamed from: y */
    static final /* synthetic */ k<Object>[] f11717y = {k0.e(new y(f.class, "backReference", "getBackReference$ktor_utils()Lio/ktor/util/collections/internal/ForwardListNode;", 0)), k0.e(new y(f.class, "value", "getValue()Ljava/lang/Object;", 0))};

    /* renamed from: c */
    private final Key f11718c;

    /* renamed from: d */
    private final kc.d f11719d = new a(null);

    /* renamed from: q */
    private final kc.d f11720q;

    /* renamed from: x */
    private final int f11721x;

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a implements kc.d<Object, e<f<Key, Value>>> {

        /* renamed from: a */
        private e<f<Key, Value>> f11722a;

        /* renamed from: b */
        final /* synthetic */ Object f11723b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj) {
            this.f11723b = obj;
            this.f11722a = obj;
        }

        @Override // kc.d, kc.c
        public e<f<Key, Value>> a(Object obj, k<?> kVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            return this.f11722a;
        }

        @Override // kc.d
        public void b(Object obj, k<?> kVar, e<f<Key, Value>> eVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            this.f11722a = eVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b implements kc.d<Object, Value> {

        /* renamed from: a */
        private Value f11724a;

        /* renamed from: b */
        final /* synthetic */ Object f11725b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Object obj) {
            this.f11725b = obj;
            this.f11724a = obj;
        }

        @Override // kc.d, kc.c
        public Value a(Object obj, k<?> kVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            return this.f11724a;
        }

        @Override // kc.d
        public void b(Object obj, k<?> kVar, Value value) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            this.f11724a = value;
        }
    }

    public f(Key key, Value value) {
        this.f11718c = key;
        this.f11720q = new b(value);
        Key key2 = getKey();
        this.f11721x = key2 == null ? 0 : key2.hashCode();
        s.a(this);
    }

    public final e<f<Key, Value>> a() {
        return (e) this.f11719d.a(this, f11717y[0]);
    }

    public final void b() {
        e<f<Key, Value>> a10 = a();
        t.b(a10);
        a10.e();
        d(null);
    }

    public final void d(e<f<Key, Value>> eVar) {
        this.f11719d.b(this, f11717y[0], eVar);
    }

    public void e(Value value) {
        this.f11720q.b(this, f11717y[1], value);
    }

    @Override // java.util.Map.Entry
    public Key getKey() {
        return this.f11718c;
    }

    @Override // java.util.Map.Entry
    public Value getValue() {
        return (Value) this.f11720q.a(this, f11717y[1]);
    }

    @Override // java.util.Map.Entry
    public Value setValue(Value value) {
        Value value2 = getValue();
        e(value);
        return value2;
    }

    public String toString() {
        return "MapItem[" + getKey() + ", " + getValue() + ']';
    }
}
