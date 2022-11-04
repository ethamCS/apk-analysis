package de.rki.covpass.commonapp.uielements;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import hc.k0;
import hc.t;
import hc.y;
import kc.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oc.k;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bR/\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0006R+\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\b\u0010\u000b\"\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, d2 = {"Lde/rki/covpass/commonapp/uielements/ExpertModeToggleElement;", "Landroid/widget/FrameLayout;", BuildConfig.FLAVOR, "title", "Ltb/e0;", "c", "(Ljava/lang/Integer;)V", BuildConfig.FLAVOR, "isChecked", "d", "b", "()Z", "<set-?>", "title$delegate", "Lkc/d;", "getTitle", "()Ljava/lang/Integer;", "setTitle", "isChecked$delegate", "setChecked", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ExpertModeToggleElement extends FrameLayout {

    /* renamed from: x */
    static final /* synthetic */ k<Object>[] f8573x = {k0.e(new y(ExpertModeToggleElement.class, "title", "getTitle()Ljava/lang/Integer;", 0)), k0.e(new y(ExpertModeToggleElement.class, "isChecked", "isChecked()Z", 0))};

    /* renamed from: c */
    private final k8.k f8574c;

    /* renamed from: d */
    private final d f8575d;

    /* renamed from: q */
    private final d f8576q;

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/commonapp/uielements/ExpertModeToggleElement$a", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends kc.b<Integer> {

        /* renamed from: b */
        final /* synthetic */ ExpertModeToggleElement f8577b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, ExpertModeToggleElement expertModeToggleElement) {
            super(obj);
            this.f8577b = expertModeToggleElement;
        }

        @Override // kc.b
        protected void c(k<?> kVar, Integer num, Integer num2) {
            t.e(kVar, "property");
            Integer num3 = num2;
            if (num3 != null) {
                this.f8577b.f8574c.f14756c.setText(num3.intValue());
            }
            TextView textView = this.f8577b.f8574c.f14756c;
            t.d(textView, "binding.expertModeToggleElementTitle");
            int i10 = 0;
            if (!(num3 != null)) {
                i10 = 8;
            }
            textView.setVisibility(i10);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/commonapp/uielements/ExpertModeToggleElement$b", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends kc.b<Boolean> {

        /* renamed from: b */
        final /* synthetic */ ExpertModeToggleElement f8578b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, ExpertModeToggleElement expertModeToggleElement) {
            super(obj);
            this.f8578b = expertModeToggleElement;
        }

        @Override // kc.b
        protected void c(k<?> kVar, Boolean bool, Boolean bool2) {
            t.e(kVar, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            this.f8578b.f8574c.f14755b.setChecked(booleanValue);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpertModeToggleElement(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.e(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpertModeToggleElement(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.e(context, "context");
        k8.k d10 = k8.k.d(LayoutInflater.from(context));
        t.d(d10, "inflate(LayoutInflater.from(context))");
        this.f8574c = d10;
        kc.a aVar = kc.a.f14870a;
        this.f8575d = new a(null, this);
        this.f8576q = new b(Boolean.FALSE, this);
        addView(d10.a());
        d10.a().setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    }

    public /* synthetic */ ExpertModeToggleElement(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final Integer getTitle() {
        return (Integer) this.f8575d.a(this, f8573x[0]);
    }

    private final void setChecked(boolean z10) {
        this.f8576q.b(this, f8573x[1], Boolean.valueOf(z10));
    }

    private final void setTitle(Integer num) {
        this.f8575d.b(this, f8573x[0], num);
    }

    public final boolean b() {
        return this.f8574c.f14755b.isChecked();
    }

    public final void c(Integer num) {
        setTitle(num);
    }

    public final void d(boolean z10) {
        setChecked(z10);
    }
}
