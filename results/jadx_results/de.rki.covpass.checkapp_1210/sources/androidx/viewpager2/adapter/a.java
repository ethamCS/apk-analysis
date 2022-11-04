package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.y;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public final class a extends RecyclerView.d0 {
    private a(FrameLayout frameLayout) {
        super(frameLayout);
    }

    public static a M(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(y.k());
        frameLayout.setSaveEnabled(false);
        return new a(frameLayout);
    }

    public FrameLayout N() {
        return (FrameLayout) this.f4533a;
    }
}
