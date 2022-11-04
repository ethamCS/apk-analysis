package ll;

import java.util.Objects;
import java.util.concurrent.ForkJoinTask;
/* loaded from: classes3.dex */
public abstract class e extends ForkJoinTask<Number> {
    Class U3;

    /* renamed from: c */
    final int f16107c;

    /* renamed from: d */
    final int f16108d;

    /* renamed from: q */
    final f f16109q;

    /* renamed from: y */
    Number f16111y;

    /* renamed from: x */
    boolean f16110x = true;
    e V3 = null;

    /* loaded from: classes3.dex */
    public static class a extends e {
        public a(int i10, int i11, Class cls, f fVar) {
            super(i10, i11, cls, fVar);
        }

        @Override // ll.e
        protected e e(int i10, int i11, Class cls, f fVar) {
            return new a(i10, i11, cls, fVar);
        }

        @Override // ll.e
        protected void f(Number number) {
            Number valueOf;
            int intValue;
            int intValue2;
            Class cls = this.U3;
            if (cls == Byte.TYPE) {
                intValue = this.f16111y.byteValue();
                intValue2 = number.byteValue();
            } else if (cls == Short.TYPE) {
                intValue = this.f16111y.shortValue();
                intValue2 = number.shortValue();
            } else if (cls != Integer.TYPE) {
                if (cls == Long.TYPE) {
                    valueOf = Long.valueOf(Math.max(this.f16111y.longValue(), number.longValue()));
                } else if (cls == Float.TYPE) {
                    valueOf = Float.valueOf(Math.max(this.f16111y.floatValue(), number.floatValue()));
                } else if (cls != Double.TYPE) {
                    throw new RuntimeException("Unknown primitive type " + this.U3);
                } else {
                    valueOf = Double.valueOf(Math.max(this.f16111y.doubleValue(), number.doubleValue()));
                }
                this.f16111y = valueOf;
            } else {
                intValue = this.f16111y.intValue();
                intValue2 = number.intValue();
            }
            valueOf = Integer.valueOf(Math.max(intValue, intValue2));
            this.f16111y = valueOf;
        }

        @Override // ll.e, java.util.concurrent.ForkJoinTask
        public /* bridge */ /* synthetic */ Number getRawResult() {
            return super.getRawResult();
        }

        @Override // ll.e, java.util.concurrent.ForkJoinTask
        protected /* bridge */ /* synthetic */ void setRawResult(Number number) {
            super.setRawResult(number);
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends e {
        public b(int i10, int i11, Class cls, f fVar) {
            super(i10, i11, cls, fVar);
        }

        @Override // ll.e
        protected e e(int i10, int i11, Class cls, f fVar) {
            return new b(i10, i11, cls, fVar);
        }

        @Override // ll.e
        protected void f(Number number) {
            Number valueOf;
            int intValue;
            int intValue2;
            Class cls = this.U3;
            if (cls == Byte.TYPE) {
                intValue = this.f16111y.byteValue();
                intValue2 = number.byteValue();
            } else if (cls == Short.TYPE) {
                intValue = this.f16111y.shortValue();
                intValue2 = number.shortValue();
            } else if (cls != Integer.TYPE) {
                if (cls == Long.TYPE) {
                    valueOf = Long.valueOf(Math.min(this.f16111y.longValue(), number.longValue()));
                } else if (cls == Float.TYPE) {
                    valueOf = Float.valueOf(Math.min(this.f16111y.floatValue(), number.floatValue()));
                } else if (cls != Double.TYPE) {
                    throw new RuntimeException("Unknown primitive type " + this.U3);
                } else {
                    valueOf = Double.valueOf(Math.min(this.f16111y.doubleValue(), number.doubleValue()));
                }
                this.f16111y = valueOf;
            } else {
                intValue = this.f16111y.intValue();
                intValue2 = number.intValue();
            }
            valueOf = Integer.valueOf(Math.min(intValue, intValue2));
            this.f16111y = valueOf;
        }

        @Override // ll.e, java.util.concurrent.ForkJoinTask
        public /* bridge */ /* synthetic */ Number getRawResult() {
            return super.getRawResult();
        }

        @Override // ll.e, java.util.concurrent.ForkJoinTask
        protected /* bridge */ /* synthetic */ void setRawResult(Number number) {
            super.setRawResult(number);
        }
    }

    protected e(int i10, int i11, Class cls, f fVar) {
        this.f16107c = i10;
        this.f16108d = i11;
        this.U3 = cls;
        this.f16109q = fVar;
    }

    /* renamed from: c */
    public Number getRawResult() {
        return this.f16111y;
    }

    protected abstract e e(int i10, int i11, Class cls, f fVar);

    @Override // java.util.concurrent.ForkJoinTask
    protected boolean exec() {
        e eVar;
        if (this.f16110x) {
            int i10 = this.f16107c;
            eVar = null;
            e eVar2 = null;
            while (true) {
                int i11 = i10 + 1;
                int i12 = this.f16108d;
                if (i11 >= i12) {
                    break;
                }
                e e10 = e(i10, i12, this.U3, this.f16109q);
                e10.f16110x = false;
                if (eVar == null) {
                    eVar = e10;
                } else {
                    Objects.requireNonNull(eVar2);
                    eVar2.V3 = e10;
                }
                e10.fork();
                eVar2 = e10;
                i10 = i11;
            }
            this.f16111y = this.f16109q.accept(i10);
        } else {
            this.f16111y = this.f16109q.accept(this.f16107c);
            eVar = null;
        }
        while (eVar != null) {
            eVar.join();
            f(eVar.f16111y);
            e eVar3 = eVar.V3;
            eVar.V3 = null;
            eVar = eVar3;
        }
        return true;
    }

    protected abstract void f(Number number);

    /* renamed from: g */
    public void setRawResult(Number number) {
        this.f16111y = number;
    }
}
