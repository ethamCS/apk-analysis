package h8;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import de.rki.covpass.sdk.cert.models.ExpertModeData;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lh8/q;", "Lh8/s;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Ltb/e0;", "o1", "z2", BuildConfig.FLAVOR, "buttonTextRes", "Ljava/lang/Integer;", "w2", "()Ljava/lang/Integer;", "Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "expertModeData", "Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "H2", "()Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "<init>", "()V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class q extends s {
    private final Integer H5;
    private final ExpertModeData I5;

    @Override // h8.s, h8.v
    public ExpertModeData H2() {
        return this.I5;
    }

    @Override // h8.v, androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        hc.t.e(view, "view");
        super.o1(view, bundle);
        MaterialButton materialButton = v2().f14698c;
        hc.t.d(materialButton, "bottomSheetBinding.bottomSheetActionButton");
        materialButton.setVisibility(8);
    }

    @Override // h8.s, j8.e
    public Integer w2() {
        return this.H5;
    }

    @Override // h8.v, j8.e
    public void z2() {
        m7.v.q(m7.g.b(this, 0, 1, null), false, 1, null);
    }
}
