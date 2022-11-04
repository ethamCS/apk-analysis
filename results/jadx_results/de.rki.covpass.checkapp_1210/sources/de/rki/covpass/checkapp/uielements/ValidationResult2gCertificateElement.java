package de.rki.covpass.checkapp.uielements;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import hc.k0;
import hc.t;
import hc.y;
import k7.w;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oc.k;
import org.conscrypt.BuildConfig;
import y7.f;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010*\u001a\u00020)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u0010-\u001a\u00020\u0002¢\u0006\u0004\b.\u0010/J+\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000f\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R/\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R/\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR/\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR/\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R/\u0010(\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00060"}, d2 = {"Lde/rki/covpass/checkapp/uielements/ValidationResult2gCertificateElement;", "Landroid/widget/FrameLayout;", BuildConfig.FLAVOR, "icon", BuildConfig.FLAVOR, "title", "validFromText", "Ltb/e0;", "d", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "textNotValidated", "b", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Landroid/view/View$OnClickListener;", "detailsClickListener", "c", "(Ljava/lang/Integer;Ljava/lang/Integer;Landroid/view/View$OnClickListener;)V", "<set-?>", "icon$delegate", "Lkc/d;", "getIcon", "()Ljava/lang/Integer;", "setIcon", "(Ljava/lang/Integer;)V", "title$delegate", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "validFromText$delegate", "getValidFromText", "setValidFromText", "textNotValidated$delegate", "getTextNotValidated", "setTextNotValidated", "buttonClickListener$delegate", "getButtonClickListener", "()Landroid/view/View$OnClickListener;", "setButtonClickListener", "(Landroid/view/View$OnClickListener;)V", "buttonClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ValidationResult2gCertificateElement extends FrameLayout {
    static final /* synthetic */ k<Object>[] V3 = {k0.e(new y(ValidationResult2gCertificateElement.class, "icon", "getIcon()Ljava/lang/Integer;", 0)), k0.e(new y(ValidationResult2gCertificateElement.class, "title", "getTitle()Ljava/lang/String;", 0)), k0.e(new y(ValidationResult2gCertificateElement.class, "validFromText", "getValidFromText()Ljava/lang/String;", 0)), k0.e(new y(ValidationResult2gCertificateElement.class, "textNotValidated", "getTextNotValidated()Ljava/lang/Integer;", 0)), k0.e(new y(ValidationResult2gCertificateElement.class, "buttonClickListener", "getButtonClickListener()Landroid/view/View$OnClickListener;", 0))};
    private final kc.d U3;

    /* renamed from: c */
    private final f f8528c;

    /* renamed from: d */
    private final kc.d f8529d;

    /* renamed from: q */
    private final kc.d f8530q;

    /* renamed from: x */
    private final kc.d f8531x;

    /* renamed from: y */
    private final kc.d f8532y;

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/checkapp/uielements/ValidationResult2gCertificateElement$a", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends kc.b<Integer> {

        /* renamed from: b */
        final /* synthetic */ ValidationResult2gCertificateElement f8533b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, ValidationResult2gCertificateElement validationResult2gCertificateElement) {
            super(obj);
            this.f8533b = validationResult2gCertificateElement;
        }

        @Override // kc.b
        protected void c(k<?> kVar, Integer num, Integer num2) {
            t.e(kVar, "property");
            Integer num3 = num2;
            if (num3 != null) {
                this.f8533b.f8528c.f25916e.setImageResource(num3.intValue());
            }
            ImageView imageView = this.f8533b.f8528c.f25916e;
            t.d(imageView, "binding.resultCertificateIcon");
            int i10 = 0;
            if (!(num3 != null)) {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/checkapp/uielements/ValidationResult2gCertificateElement$b", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends kc.b<String> {

        /* renamed from: b */
        final /* synthetic */ ValidationResult2gCertificateElement f8534b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, ValidationResult2gCertificateElement validationResult2gCertificateElement) {
            super(obj);
            this.f8534b = validationResult2gCertificateElement;
        }

        @Override // kc.b
        protected void c(k<?> kVar, String str, String str2) {
            t.e(kVar, "property");
            String str3 = str2;
            if (str3 != null) {
                this.f8534b.f8528c.f25919h.setText(str3);
            }
            TextView textView = this.f8534b.f8528c.f25919h;
            t.d(textView, "binding.resultCertificateTitle");
            int i10 = 0;
            if (!(str3 != null)) {
                i10 = 8;
            }
            textView.setVisibility(i10);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/checkapp/uielements/ValidationResult2gCertificateElement$c", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends kc.b<String> {

        /* renamed from: b */
        final /* synthetic */ ValidationResult2gCertificateElement f8535b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, ValidationResult2gCertificateElement validationResult2gCertificateElement) {
            super(obj);
            this.f8535b = validationResult2gCertificateElement;
        }

        @Override // kc.b
        protected void c(k<?> kVar, String str, String str2) {
            t.e(kVar, "property");
            String str3 = str2;
            if (str3 != null) {
                this.f8535b.f8528c.f25920i.setText(str3);
            }
            TextView textView = this.f8535b.f8528c.f25920i;
            t.d(textView, "binding.resultCertificateValidFrom");
            int i10 = 0;
            if (!(str3 != null)) {
                i10 = 8;
            }
            textView.setVisibility(i10);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/checkapp/uielements/ValidationResult2gCertificateElement$d", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends kc.b<Integer> {

        /* renamed from: b */
        final /* synthetic */ ValidationResult2gCertificateElement f8536b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, ValidationResult2gCertificateElement validationResult2gCertificateElement) {
            super(obj);
            this.f8536b = validationResult2gCertificateElement;
        }

        @Override // kc.b
        protected void c(k<?> kVar, Integer num, Integer num2) {
            t.e(kVar, "property");
            Integer num3 = num2;
            if (num3 != null) {
                this.f8536b.f8528c.f25918g.setText(num3.intValue());
            }
            TextView textView = this.f8536b.f8528c.f25918g;
            t.d(textView, "binding.resultCertificateTextNotValidated");
            int i10 = 0;
            if (!(num3 != null)) {
                i10 = 8;
            }
            textView.setVisibility(i10);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/checkapp/uielements/ValidationResult2gCertificateElement$e", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends kc.b<View.OnClickListener> {

        /* renamed from: b */
        final /* synthetic */ ValidationResult2gCertificateElement f8537b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj, ValidationResult2gCertificateElement validationResult2gCertificateElement) {
            super(obj);
            this.f8537b = validationResult2gCertificateElement;
        }

        @Override // kc.b
        protected void c(k<?> kVar, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
            t.e(kVar, "property");
            View.OnClickListener onClickListener3 = onClickListener2;
            if (onClickListener3 != null) {
                this.f8537b.f8528c.f25915d.setOnClickListener(onClickListener3);
            }
            LinearLayout linearLayout = this.f8537b.f8528c.f25913b;
            t.d(linearLayout, "binding.resultCertificateButtonDetails");
            int i10 = 0;
            if (!(onClickListener3 != null)) {
                i10 = 8;
            }
            linearLayout.setVisibility(i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ValidationResult2gCertificateElement(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.e(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidationResult2gCertificateElement(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.e(context, "context");
        f d10 = f.d(LayoutInflater.from(context));
        t.d(d10, "inflate(LayoutInflater.from(context))");
        this.f8528c = d10;
        kc.a aVar = kc.a.f14870a;
        this.f8529d = new a(null, this);
        this.f8530q = new b(null, this);
        this.f8531x = new c(null, this);
        this.f8532y = new d(null, this);
        this.U3 = new e(null, this);
        addView(d10.a());
        d10.a().setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    }

    public /* synthetic */ ValidationResult2gCertificateElement(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final View.OnClickListener getButtonClickListener() {
        return (View.OnClickListener) this.U3.a(this, V3[4]);
    }

    private final Integer getIcon() {
        return (Integer) this.f8529d.a(this, V3[0]);
    }

    private final Integer getTextNotValidated() {
        return (Integer) this.f8532y.a(this, V3[3]);
    }

    private final String getTitle() {
        return (String) this.f8530q.a(this, V3[1]);
    }

    private final String getValidFromText() {
        return (String) this.f8531x.a(this, V3[2]);
    }

    private final void setButtonClickListener(View.OnClickListener onClickListener) {
        this.U3.b(this, V3[4], onClickListener);
    }

    private final void setIcon(Integer num) {
        this.f8529d.b(this, V3[0], num);
    }

    private final void setTextNotValidated(Integer num) {
        this.f8532y.b(this, V3[3], num);
    }

    private final void setTitle(String str) {
        this.f8530q.b(this, V3[1], str);
    }

    private final void setValidFromText(String str) {
        this.f8531x.b(this, V3[2], str);
    }

    public final void b(Integer num, Integer num2, Integer num3) {
        setIcon(num);
        setTitle(num2 != null ? w.f(num2.intValue(), new Object[0]) : null);
        setTextNotValidated(num3);
        this.f8528c.f25915d.setClickable(false);
    }

    public final void c(Integer num, Integer num2, View.OnClickListener onClickListener) {
        setIcon(num);
        setTitle(num2 != null ? w.f(num2.intValue(), new Object[0]) : null);
        setButtonClickListener(onClickListener);
    }

    public final void d(Integer num, String str, String str2) {
        setIcon(num);
        setTitle(str);
        setValidFromText(str2);
        this.f8528c.f25915d.setClickable(false);
    }
}
