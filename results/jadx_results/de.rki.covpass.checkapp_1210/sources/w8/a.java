package w8;

import android.graphics.drawable.Drawable;
import android.view.View;
import de.rki.covpass.commonapp.uielements.InfoElement;
import hc.t;
import j8.j;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a,\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\u0085\u0001\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u009d\u0001\u0010\u0014\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lde/rki/covpass/commonapp/uielements/InfoElement;", BuildConfig.FLAVOR, "title", "subtitle", "description", "Ltb/e0;", "a", BuildConfig.FLAVOR, "iconRes", "subtitleTopMarginDimenRes", "descriptionTopMarginDimenRes", "subtitleStyle", "descriptionStyle", "subtitleContentDescription", "descriptionContentDescription", "d", "(Lde/rki/covpass/commonapp/uielements/InfoElement;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/view/View$OnClickListener;", "descriptionLink", "titleStyle", "b", "(Lde/rki/covpass/commonapp/uielements/InfoElement;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Landroid/view/View$OnClickListener;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "common-app_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {
    private static final void a(InfoElement infoElement, String str, String str2, String str3) {
        infoElement.setTitle(str);
        infoElement.setSubtitle(str2);
        infoElement.setDescription(str3);
    }

    public static final void b(InfoElement infoElement, String str, String str2, Integer num, String str3, Integer num2, View.OnClickListener onClickListener, Integer num3, Integer num4, Integer num5, String str4, String str5, Integer num6) {
        Drawable drawable;
        t.e(infoElement, "<this>");
        t.e(str, "title");
        a(infoElement, str, str2, str3);
        if (num2 != null) {
            drawable = androidx.core.content.a.d(infoElement.getContext(), num2.intValue());
        } else {
            drawable = null;
        }
        infoElement.setIcon(drawable);
        infoElement.setElementColor(androidx.core.content.a.d(infoElement.getContext(), j.c_res_0x7f0700a2));
        infoElement.setDescriptionLink(onClickListener);
        if (num != null) {
            infoElement.setSubtitleStyle(num.intValue());
        }
        if (num3 != null) {
            infoElement.setDescriptionStyle(num3.intValue());
        }
        if (num6 != null) {
            infoElement.setTitleStyle(num6.intValue());
        }
        if (num4 != null) {
            infoElement.setSubtitleTopMarginDimenRes(num4.intValue());
        }
        if (num5 != null) {
            infoElement.setDescriptionTopMarginDimenRes(num5.intValue());
        }
        if (str4 != null) {
            infoElement.setSubtitleContentDescription(str4);
        }
        if (str5 != null) {
            infoElement.setDescriptionContentDescription(str5);
        }
    }

    public static /* synthetic */ void c(InfoElement infoElement, String str, String str2, Integer num, String str3, Integer num2, View.OnClickListener onClickListener, Integer num3, Integer num4, Integer num5, String str4, String str5, Integer num6, int i10, Object obj) {
        Integer num7 = null;
        String str6 = (i10 & 2) != 0 ? null : str2;
        Integer num8 = (i10 & 4) != 0 ? null : num;
        String str7 = (i10 & 8) != 0 ? null : str3;
        Integer num9 = (i10 & 16) != 0 ? null : num2;
        View.OnClickListener onClickListener2 = (i10 & 32) != 0 ? null : onClickListener;
        Integer num10 = (i10 & 64) != 0 ? null : num3;
        Integer num11 = (i10 & 128) != 0 ? null : num4;
        Integer num12 = (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : num5;
        String str8 = (i10 & 512) != 0 ? null : str4;
        String str9 = (i10 & 1024) != 0 ? null : str5;
        if ((i10 & 2048) == 0) {
            num7 = num6;
        }
        b(infoElement, str, str6, num8, str7, num9, onClickListener2, num10, num11, num12, str8, str9, num7);
    }

    public static final void d(InfoElement infoElement, String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str4, String str5) {
        Drawable drawable;
        t.e(infoElement, "<this>");
        t.e(str, "title");
        a(infoElement, str, str2, str3);
        if (num != null) {
            drawable = androidx.core.content.a.d(infoElement.getContext(), num.intValue());
        } else {
            drawable = null;
        }
        infoElement.setIcon(drawable);
        infoElement.setElementColor(androidx.core.content.a.d(infoElement.getContext(), j.e_res_0x7f0700fd));
        if (num2 != null) {
            infoElement.setSubtitleTopMarginDimenRes(num2.intValue());
        }
        if (num3 != null) {
            infoElement.setDescriptionTopMarginDimenRes(num3.intValue());
        }
        if (num4 != null) {
            infoElement.setSubtitleStyle(num4.intValue());
        }
        if (num5 != null) {
            infoElement.setDescriptionStyle(num5.intValue());
        }
        if (str4 != null) {
            infoElement.setSubtitleContentDescription(str4);
        }
        if (str5 != null) {
            infoElement.setDescriptionContentDescription(str5);
        }
    }

    public static /* synthetic */ void e(InfoElement infoElement, String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str4, String str5, int i10, Object obj) {
        String str6 = null;
        String str7 = (i10 & 2) != 0 ? null : str2;
        String str8 = (i10 & 4) != 0 ? null : str3;
        Integer num6 = (i10 & 8) != 0 ? null : num;
        Integer num7 = (i10 & 16) != 0 ? null : num2;
        Integer num8 = (i10 & 32) != 0 ? null : num3;
        Integer num9 = (i10 & 64) != 0 ? null : num4;
        Integer num10 = (i10 & 128) != 0 ? null : num5;
        String str9 = (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : str4;
        if ((i10 & 512) == 0) {
            str6 = str5;
        }
        d(infoElement, str, str7, str8, num6, num7, num8, num9, num10, str9, str6);
    }
}
