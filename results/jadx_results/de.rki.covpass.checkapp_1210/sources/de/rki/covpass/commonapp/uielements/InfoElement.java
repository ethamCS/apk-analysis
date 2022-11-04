package de.rki.covpass.commonapp.uielements;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import hc.k0;
import hc.t;
import hc.y;
import j8.o;
import j8.p;
import k7.w;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010I\u001a\u00020H\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010J\u001a\u00020\u0017¢\u0006\u0004\bK\u0010LJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR/\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR+\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010!\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR/\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\t\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010\rR/\u0010)\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\t\u001a\u0004\b'\u0010\u000b\"\u0004\b(\u0010\rR/\u00100\u001a\u0004\u0018\u00010*2\b\u0010\u0007\u001a\u0004\u0018\u00010*8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\t\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R+\u00104\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\t\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u0010\u001cR+\u00108\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\t\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u0010\u001cR+\u0010<\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010\t\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u0010\u001cR/\u0010C\u001a\u0004\u0018\u00010=2\b\u0010\u0007\u001a\u0004\u0018\u00010=8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010\t\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR/\u0010G\u001a\u0004\u0018\u00010=2\b\u0010\u0007\u001a\u0004\u0018\u00010=8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010\t\u001a\u0004\bE\u0010@\"\u0004\bF\u0010B¨\u0006M"}, d2 = {"Lde/rki/covpass/commonapp/uielements/InfoElement;", "Landroid/widget/RelativeLayout;", "Landroid/util/AttributeSet;", "attrs", "Ltb/e0;", "b", BuildConfig.FLAVOR, "<set-?>", "title$delegate", "Lkc/d;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "subtitle$delegate", "getSubtitle", "setSubtitle", "subtitle", "subtitleContentDescription$delegate", "getSubtitleContentDescription", "setSubtitleContentDescription", "subtitleContentDescription", BuildConfig.FLAVOR, "subtitleStyle$delegate", "getSubtitleStyle", "()I", "setSubtitleStyle", "(I)V", "subtitleStyle", "subtitleTopMarginDimenRes$delegate", "getSubtitleTopMarginDimenRes", "setSubtitleTopMarginDimenRes", "subtitleTopMarginDimenRes", "description$delegate", "getDescription", "setDescription", "description", "descriptionContentDescription$delegate", "getDescriptionContentDescription", "setDescriptionContentDescription", "descriptionContentDescription", "Landroid/view/View$OnClickListener;", "descriptionLink$delegate", "getDescriptionLink", "()Landroid/view/View$OnClickListener;", "setDescriptionLink", "(Landroid/view/View$OnClickListener;)V", "descriptionLink", "titleStyle$delegate", "getTitleStyle", "setTitleStyle", "titleStyle", "descriptionStyle$delegate", "getDescriptionStyle", "setDescriptionStyle", "descriptionStyle", "descriptionTopMarginDimenRes$delegate", "getDescriptionTopMarginDimenRes", "setDescriptionTopMarginDimenRes", "descriptionTopMarginDimenRes", "Landroid/graphics/drawable/Drawable;", "icon$delegate", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "icon", "elementColor$delegate", "getElementColor", "setElementColor", "elementColor", "Landroid/content/Context;", "context", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class InfoElement extends RelativeLayout {

    /* renamed from: d4 */
    static final /* synthetic */ oc.k<Object>[] f8579d4 = {k0.e(new y(InfoElement.class, "title", "getTitle()Ljava/lang/String;", 0)), k0.e(new y(InfoElement.class, "subtitle", "getSubtitle()Ljava/lang/String;", 0)), k0.e(new y(InfoElement.class, "subtitleContentDescription", "getSubtitleContentDescription()Ljava/lang/String;", 0)), k0.e(new y(InfoElement.class, "subtitleStyle", "getSubtitleStyle()I", 0)), k0.e(new y(InfoElement.class, "subtitleTopMarginDimenRes", "getSubtitleTopMarginDimenRes()I", 0)), k0.e(new y(InfoElement.class, "description", "getDescription()Ljava/lang/String;", 0)), k0.e(new y(InfoElement.class, "descriptionContentDescription", "getDescriptionContentDescription()Ljava/lang/String;", 0)), k0.e(new y(InfoElement.class, "descriptionLink", "getDescriptionLink()Landroid/view/View$OnClickListener;", 0)), k0.e(new y(InfoElement.class, "titleStyle", "getTitleStyle()I", 0)), k0.e(new y(InfoElement.class, "descriptionStyle", "getDescriptionStyle()I", 0)), k0.e(new y(InfoElement.class, "descriptionTopMarginDimenRes", "getDescriptionTopMarginDimenRes()I", 0)), k0.e(new y(InfoElement.class, "icon", "getIcon()Landroid/graphics/drawable/Drawable;", 0)), k0.e(new y(InfoElement.class, "elementColor", "getElementColor()Landroid/graphics/drawable/Drawable;", 0))};
    private final kc.d U3;
    private final kc.d V3;
    private final kc.d W3;
    private final kc.d X3;
    private final kc.d Y3;
    private final kc.d Z3;

    /* renamed from: a4 */
    private final kc.d f8580a4;

    /* renamed from: b4 */
    private final kc.d f8581b4;

    /* renamed from: c */
    private final k8.m f8582c;

    /* renamed from: c4 */
    private final kc.d f8583c4;

    /* renamed from: d */
    private final kc.d f8584d;

    /* renamed from: q */
    private final kc.d f8585q;

    /* renamed from: x */
    private final kc.d f8586x;

    /* renamed from: y */
    private final kc.d f8587y;

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/commonapp/uielements/InfoElement$a", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends kc.b<Integer> {

        /* renamed from: b */
        final /* synthetic */ InfoElement f8588b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, InfoElement infoElement) {
            super(obj);
            this.f8588b = infoElement;
        }

        @Override // kc.b
        protected void c(oc.k<?> kVar, Integer num, Integer num2) {
            t.e(kVar, "property");
            int intValue = num2.intValue();
            num.intValue();
            this.f8588b.f8582c.f14770b.setTextAppearance(intValue);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/commonapp/uielements/InfoElement$b", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends kc.b<Integer> {

        /* renamed from: b */
        final /* synthetic */ InfoElement f8589b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, InfoElement infoElement) {
            super(obj);
            this.f8589b = infoElement;
        }

        @Override // kc.b
        protected void c(oc.k<?> kVar, Integer num, Integer num2) {
            t.e(kVar, "property");
            int intValue = num2.intValue();
            num.intValue();
            ViewGroup.LayoutParams layoutParams = this.f8589b.f8582c.f14770b.getLayoutParams();
            t.c(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.f8589b.getResources().getDimensionPixelSize(intValue);
            this.f8589b.f8582c.f14770b.requestLayout();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/commonapp/uielements/InfoElement$c", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends kc.b<Drawable> {

        /* renamed from: b */
        final /* synthetic */ InfoElement f8590b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, InfoElement infoElement) {
            super(obj);
            this.f8590b = infoElement;
        }

        @Override // kc.b
        protected void c(oc.k<?> kVar, Drawable drawable, Drawable drawable2) {
            t.e(kVar, "property");
            Drawable drawable3 = drawable2;
            this.f8590b.f8582c.f14771c.setImageDrawable(drawable3);
            ImageView imageView = this.f8590b.f8582c.f14771c;
            t.d(imageView, "binding.infoIcon");
            int i10 = 0;
            if (!(drawable3 != null)) {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/commonapp/uielements/InfoElement$d", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends kc.b<Drawable> {

        /* renamed from: b */
        final /* synthetic */ InfoElement f8591b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, InfoElement infoElement) {
            super(obj);
            this.f8591b = infoElement;
        }

        @Override // kc.b
        protected void c(oc.k<?> kVar, Drawable drawable, Drawable drawable2) {
            t.e(kVar, "property");
            this.f8591b.f8582c.a().setBackground(drawable2);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/commonapp/uielements/InfoElement$e", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends kc.b<String> {

        /* renamed from: b */
        final /* synthetic */ InfoElement f8592b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj, InfoElement infoElement) {
            super(obj);
            this.f8592b = infoElement;
        }

        @Override // kc.b
        protected void c(oc.k<?> kVar, String str, String str2) {
            t.e(kVar, "property");
            this.f8592b.f8582c.f14773e.setText(str2);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/commonapp/uielements/InfoElement$f", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class f extends kc.b<String> {

        /* renamed from: b */
        final /* synthetic */ InfoElement f8593b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Object obj, InfoElement infoElement) {
            super(obj);
            this.f8593b = infoElement;
        }

        @Override // kc.b
        protected void c(oc.k<?> kVar, String str, String str2) {
            t.e(kVar, "property");
            String str3 = str2;
            this.f8593b.f8582c.f14772d.setText(str3);
            TextView textView = this.f8593b.f8582c.f14772d;
            t.d(textView, "binding.infoSubtitle");
            int i10 = 0;
            if (str3 == null || str3.length() == 0) {
                i10 = 8;
            }
            textView.setVisibility(i10);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/commonapp/uielements/InfoElement$g", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class g extends kc.b<String> {

        /* renamed from: b */
        final /* synthetic */ InfoElement f8594b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Object obj, InfoElement infoElement) {
            super(obj);
            this.f8594b = infoElement;
        }

        @Override // kc.b
        protected void c(oc.k<?> kVar, String str, String str2) {
            t.e(kVar, "property");
            this.f8594b.f8582c.f14772d.setContentDescription(str2);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/commonapp/uielements/InfoElement$h", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class h extends kc.b<Integer> {

        /* renamed from: b */
        final /* synthetic */ InfoElement f8595b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Object obj, InfoElement infoElement) {
            super(obj);
            this.f8595b = infoElement;
        }

        @Override // kc.b
        protected void c(oc.k<?> kVar, Integer num, Integer num2) {
            t.e(kVar, "property");
            int intValue = num2.intValue();
            num.intValue();
            this.f8595b.f8582c.f14772d.setTextAppearance(intValue);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/commonapp/uielements/InfoElement$i", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class i extends kc.b<Integer> {

        /* renamed from: b */
        final /* synthetic */ InfoElement f8596b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Object obj, InfoElement infoElement) {
            super(obj);
            this.f8596b = infoElement;
        }

        @Override // kc.b
        protected void c(oc.k<?> kVar, Integer num, Integer num2) {
            t.e(kVar, "property");
            int intValue = num2.intValue();
            num.intValue();
            ViewGroup.LayoutParams layoutParams = this.f8596b.f8582c.f14772d.getLayoutParams();
            t.c(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.f8596b.getResources().getDimensionPixelSize(intValue);
            this.f8596b.f8582c.f14772d.requestLayout();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/commonapp/uielements/InfoElement$j", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class j extends kc.b<String> {

        /* renamed from: b */
        final /* synthetic */ InfoElement f8597b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Object obj, InfoElement infoElement) {
            super(obj);
            this.f8597b = infoElement;
        }

        @Override // kc.b
        protected void c(oc.k<?> kVar, String str, String str2) {
            t.e(kVar, "property");
            String str3 = str2;
            TextView textView = this.f8597b.f8582c.f14770b;
            int i10 = 0;
            textView.setText(w.e(str3 == null ? BuildConfig.FLAVOR : str3, new Object[0], false, 4, null));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            t.d(textView, BuildConfig.FLAVOR);
            y8.e.a(textView);
            TextView textView2 = this.f8597b.f8582c.f14770b;
            t.d(textView2, "binding.infoDescription");
            if (str3 == null || str3.length() == 0) {
                i10 = 8;
            }
            textView2.setVisibility(i10);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/commonapp/uielements/InfoElement$k", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class k extends kc.b<String> {

        /* renamed from: b */
        final /* synthetic */ InfoElement f8598b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Object obj, InfoElement infoElement) {
            super(obj);
            this.f8598b = infoElement;
        }

        @Override // kc.b
        protected void c(oc.k<?> kVar, String str, String str2) {
            t.e(kVar, "property");
            this.f8598b.f8582c.f14770b.setContentDescription(str2);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/commonapp/uielements/InfoElement$l", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class l extends kc.b<View.OnClickListener> {

        /* renamed from: b */
        final /* synthetic */ InfoElement f8599b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Object obj, InfoElement infoElement) {
            super(obj);
            this.f8599b = infoElement;
        }

        @Override // kc.b
        protected void c(oc.k<?> kVar, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
            t.e(kVar, "property");
            this.f8599b.f8582c.f14770b.setOnClickListener(onClickListener2);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"de/rki/covpass/commonapp/uielements/InfoElement$m", "Lkc/b;", "Loc/k;", "property", "oldValue", "newValue", "Ltb/e0;", "c", "(Loc/k;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class m extends kc.b<Integer> {

        /* renamed from: b */
        final /* synthetic */ InfoElement f8600b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Object obj, InfoElement infoElement) {
            super(obj);
            this.f8600b = infoElement;
        }

        @Override // kc.b
        protected void c(oc.k<?> kVar, Integer num, Integer num2) {
            t.e(kVar, "property");
            int intValue = num2.intValue();
            num.intValue();
            this.f8600b.f8582c.f14773e.setTextAppearance(intValue);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InfoElement(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.e(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoElement(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.e(context, "context");
        k8.m d10 = k8.m.d(LayoutInflater.from(context));
        t.d(d10, "inflate(LayoutInflater.from(context))");
        this.f8582c = d10;
        kc.a aVar = kc.a.f14870a;
        this.f8584d = new e(null, this);
        this.f8585q = new f(null, this);
        this.f8586x = new g(null, this);
        this.f8587y = new h(Integer.valueOf(o.b_res_0x7f11011b), this);
        this.U3 = new i(Integer.valueOf(j8.i.c_res_0x7f0600bb), this);
        this.V3 = new j(null, this);
        this.W3 = new k(null, this);
        this.X3 = new l(null, this);
        this.Y3 = new m(Integer.valueOf(o.d_res_0x7f11012c), this);
        this.Z3 = new a(Integer.valueOf(o.a_res_0x7f110118), this);
        this.f8580a4 = new b(Integer.valueOf(j8.i.b_res_0x7f0600a9), this);
        this.f8581b4 = new c(null, this);
        this.f8583c4 = new d(null, this);
        b(attributeSet);
        addView(d10.a());
        d10.a().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
    }

    public /* synthetic */ InfoElement(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void b(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f14136k0);
        t.d(obtainStyledAttributes, "context.obtainStyledAttr… R.styleable.InfoElement)");
        try {
            setTitle(obtainStyledAttributes.getString(p.f14151p0));
            setSubtitle(obtainStyledAttributes.getString(p.f14148o0));
            setDescription(obtainStyledAttributes.getString(p.f14139l0));
            setIcon(obtainStyledAttributes.getDrawable(p.f14145n0));
            setElementColor(obtainStyledAttributes.getDrawable(p.f14142m0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final String getDescription() {
        return (String) this.V3.a(this, f8579d4[5]);
    }

    public final String getDescriptionContentDescription() {
        return (String) this.W3.a(this, f8579d4[6]);
    }

    public final View.OnClickListener getDescriptionLink() {
        return (View.OnClickListener) this.X3.a(this, f8579d4[7]);
    }

    public final int getDescriptionStyle() {
        return ((Number) this.Z3.a(this, f8579d4[9])).intValue();
    }

    public final int getDescriptionTopMarginDimenRes() {
        return ((Number) this.f8580a4.a(this, f8579d4[10])).intValue();
    }

    public final Drawable getElementColor() {
        return (Drawable) this.f8583c4.a(this, f8579d4[12]);
    }

    public final Drawable getIcon() {
        return (Drawable) this.f8581b4.a(this, f8579d4[11]);
    }

    public final String getSubtitle() {
        return (String) this.f8585q.a(this, f8579d4[1]);
    }

    public final String getSubtitleContentDescription() {
        return (String) this.f8586x.a(this, f8579d4[2]);
    }

    public final int getSubtitleStyle() {
        return ((Number) this.f8587y.a(this, f8579d4[3])).intValue();
    }

    public final int getSubtitleTopMarginDimenRes() {
        return ((Number) this.U3.a(this, f8579d4[4])).intValue();
    }

    public final String getTitle() {
        return (String) this.f8584d.a(this, f8579d4[0]);
    }

    public final int getTitleStyle() {
        return ((Number) this.Y3.a(this, f8579d4[8])).intValue();
    }

    public final void setDescription(String str) {
        this.V3.b(this, f8579d4[5], str);
    }

    public final void setDescriptionContentDescription(String str) {
        this.W3.b(this, f8579d4[6], str);
    }

    public final void setDescriptionLink(View.OnClickListener onClickListener) {
        this.X3.b(this, f8579d4[7], onClickListener);
    }

    public final void setDescriptionStyle(int i10) {
        this.Z3.b(this, f8579d4[9], Integer.valueOf(i10));
    }

    public final void setDescriptionTopMarginDimenRes(int i10) {
        this.f8580a4.b(this, f8579d4[10], Integer.valueOf(i10));
    }

    public final void setElementColor(Drawable drawable) {
        this.f8583c4.b(this, f8579d4[12], drawable);
    }

    public final void setIcon(Drawable drawable) {
        this.f8581b4.b(this, f8579d4[11], drawable);
    }

    public final void setSubtitle(String str) {
        this.f8585q.b(this, f8579d4[1], str);
    }

    public final void setSubtitleContentDescription(String str) {
        this.f8586x.b(this, f8579d4[2], str);
    }

    public final void setSubtitleStyle(int i10) {
        this.f8587y.b(this, f8579d4[3], Integer.valueOf(i10));
    }

    public final void setSubtitleTopMarginDimenRes(int i10) {
        this.U3.b(this, f8579d4[4], Integer.valueOf(i10));
    }

    public final void setTitle(String str) {
        this.f8584d.b(this, f8579d4[0], str);
    }

    public final void setTitleStyle(int i10) {
        this.Y3.b(this, f8579d4[8], Integer.valueOf(i10));
    }
}
