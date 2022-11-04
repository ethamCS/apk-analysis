package de.rki.covpass.commonapp.uielements;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import hc.k0;
import hc.t;
import hc.y;
import k8.e;
import kc.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oc.k;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J!\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bJ\u000f\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR/\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R/\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R+\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\t\u0010\f\"\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Lde/rki/covpass/commonapp/uielements/CheckContextCheckboxElement;", "Landroid/widget/FrameLayout;", BuildConfig.FLAVOR, "title", "subtitle", "Ltb/e0;", "d", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", BuildConfig.FLAVOR, "isChecked", "c", "b", "()Z", "<set-?>", "title$delegate", "Lkc/d;", "getTitle", "()Ljava/lang/Integer;", "setTitle", "(Ljava/lang/Integer;)V", "subtitle$delegate", "getSubtitle", "setSubtitle", "isChecked$delegate", "setChecked", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class CheckContextCheckboxElement extends FrameLayout {

    /* renamed from: y */
    static final /* synthetic */ k<Object>[] f8565y = {k0.e(new y(CheckContextCheckboxElement.class, "title", "getTitle()Ljava/lang/Integer;", 0)), k0.e(new y(CheckContextCheckboxElement.class, "subtitle", "getSubtitle()Ljava/lang/Integer;", 0)), k0.e(new y(CheckContextCheckboxElement.class, "isChecked", "isChecked()Z", 0))};

    /* renamed from: c */
    private final e f8566c;

    /* renamed from: d */
    private final d f8567d;

    /* renamed from: q */
    private final d f8568q;

    /* renamed from: x */
    private final d f8569x;

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/commonapp/uielements/CheckContextCheckboxElement$a", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends kc.b<Integer> {

        /* renamed from: b */
        final /* synthetic */ CheckContextCheckboxElement f8570b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, CheckContextCheckboxElement checkContextCheckboxElement) {
            super(obj);
            this.f8570b = checkContextCheckboxElement;
        }

        @Override // kc.b
        protected void c(k<?> kVar, Integer num, Integer num2) {
            t.e(kVar, "property");
            Integer num3 = num2;
            if (num3 != null) {
                this.f8570b.f8566c.f14721d.setText(num3.intValue());
            }
            TextView textView = this.f8570b.f8566c.f14721d;
            t.d(textView, "binding.checkContextCheckboxElementTitle");
            int i10 = 0;
            if (!(num3 != null)) {
                i10 = 8;
            }
            textView.setVisibility(i10);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/commonapp/uielements/CheckContextCheckboxElement$b", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends kc.b<Integer> {

        /* renamed from: b */
        final /* synthetic */ CheckContextCheckboxElement f8571b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, CheckContextCheckboxElement checkContextCheckboxElement) {
            super(obj);
            this.f8571b = checkContextCheckboxElement;
        }

        @Override // kc.b
        protected void c(k<?> kVar, Integer num, Integer num2) {
            t.e(kVar, "property");
            Integer num3 = num2;
            if (num3 != null) {
                this.f8571b.f8566c.f14720c.setText(num3.intValue());
            }
            TextView textView = this.f8571b.f8566c.f14720c;
            t.d(textView, "binding.checkContextCheckboxElementSubtitle");
            int i10 = 0;
            if (!(num3 != null)) {
                i10 = 8;
            }
            textView.setVisibility(i10);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/commonapp/uielements/CheckContextCheckboxElement$c", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends kc.b<Boolean> {

        /* renamed from: b */
        final /* synthetic */ CheckContextCheckboxElement f8572b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, CheckContextCheckboxElement checkContextCheckboxElement) {
            super(obj);
            this.f8572b = checkContextCheckboxElement;
        }

        @Override // kc.b
        protected void c(k<?> kVar, Boolean bool, Boolean bool2) {
            t.e(kVar, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            this.f8572b.f8566c.f14719b.setChecked(booleanValue);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CheckContextCheckboxElement(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.e(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckContextCheckboxElement(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.e(context, "context");
        e d10 = e.d(LayoutInflater.from(context));
        t.d(d10, "inflate(LayoutInflater.from(context))");
        this.f8566c = d10;
        kc.a aVar = kc.a.f14870a;
        this.f8567d = new a(null, this);
        this.f8568q = new b(null, this);
        this.f8569x = new c(Boolean.FALSE, this);
        addView(d10.a());
        d10.a().setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    }

    public /* synthetic */ CheckContextCheckboxElement(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final Integer getSubtitle() {
        return (Integer) this.f8568q.a(this, f8565y[1]);
    }

    private final Integer getTitle() {
        return (Integer) this.f8567d.a(this, f8565y[0]);
    }

    private final void setChecked(boolean z10) {
        this.f8569x.b(this, f8565y[2], Boolean.valueOf(z10));
    }

    private final void setSubtitle(Integer num) {
        this.f8568q.b(this, f8565y[1], num);
    }

    private final void setTitle(Integer num) {
        this.f8567d.b(this, f8565y[0], num);
    }

    public final boolean b() {
        return this.f8566c.f14719b.isChecked();
    }

    public final void c(boolean z10) {
        setChecked(z10);
    }

    public final void d(Integer num, Integer num2) {
        setTitle(num);
        setSubtitle(num2);
    }
}
