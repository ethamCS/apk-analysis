package y0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private final b f25741a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: a */
        private final TextView f25742a;

        /* renamed from: b */
        private final d f25743b;

        /* renamed from: c */
        private boolean f25744c = true;

        a(TextView textView) {
            this.f25742a = textView;
            this.f25743b = new d(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f25743b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f25743b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> g(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                if (inputFilterArr[i10] instanceof d) {
                    sparseArray.put(i10, inputFilterArr[i10]);
                }
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> g10 = g(inputFilterArr);
            if (g10.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - g10.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (g10.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void k() {
            this.f25742a.setFilters(a(this.f25742a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            return (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) ? new h(transformationMethod) : transformationMethod;
        }

        @Override // y0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f25744c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // y0.f.b
        public boolean b() {
            return this.f25744c;
        }

        @Override // y0.f.b
        void c(boolean z10) {
            if (z10) {
                l();
            }
        }

        @Override // y0.f.b
        void d(boolean z10) {
            this.f25744c = z10;
            l();
            k();
        }

        @Override // y0.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f25744c ? m(transformationMethod) : j(transformationMethod);
        }

        void i(boolean z10) {
            this.f25744c = z10;
        }

        void l() {
            this.f25742a.setTransformationMethod(e(this.f25742a.getTransformationMethod()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        b() {
        }

        InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        void c(boolean z10) {
            throw null;
        }

        void d(boolean z10) {
            throw null;
        }

        TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends b {

        /* renamed from: a */
        private final a f25745a;

        c(TextView textView) {
            this.f25745a = new a(textView);
        }

        private boolean f() {
            return !androidx.emoji2.text.d.h();
        }

        @Override // y0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f25745a.a(inputFilterArr);
        }

        @Override // y0.f.b
        public boolean b() {
            return this.f25745a.b();
        }

        @Override // y0.f.b
        void c(boolean z10) {
            if (f()) {
                return;
            }
            this.f25745a.c(z10);
        }

        @Override // y0.f.b
        void d(boolean z10) {
            if (f()) {
                this.f25745a.i(z10);
            } else {
                this.f25745a.d(z10);
            }
        }

        @Override // y0.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f25745a.e(transformationMethod);
        }
    }

    public f(TextView textView, boolean z10) {
        androidx.core.util.h.h(textView, "textView cannot be null");
        this.f25741a = !z10 ? new c(textView) : new a(textView);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f25741a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f25741a.b();
    }

    public void c(boolean z10) {
        this.f25741a.c(z10);
    }

    public void d(boolean z10) {
        this.f25741a.d(z10);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f25741a.e(transformationMethod);
    }
}
