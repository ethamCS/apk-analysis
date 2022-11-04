package com.health.openworkout.gui.training;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.TrainingPlan;
import com.health.openworkout.gui.datatypes.GenericFragment;
import com.health.openworkout.gui.datatypes.a;
import java.util.List;
/* loaded from: classes.dex */
public class d extends com.health.openworkout.gui.datatypes.a<b> {
    private List<TrainingPlan> k;
    private Context l;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3487a;

        static {
            int[] iArr = new int[GenericFragment.FRAGMENT_MODE.values().length];
            f3487a = iArr;
            try {
                iArr[GenericFragment.FRAGMENT_MODE.VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3487a[GenericFragment.FRAGMENT_MODE.EDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a.c {
        TextView A;
        ImageView x;
        TextView y;
        TextView z;

        public b(View view) {
            super(view);
            this.x = (ImageView) view.findViewById(R.id.imgView);
            this.y = (TextView) view.findViewById(R.id.nameView);
            this.z = (TextView) view.findViewById(R.id.detailedView);
            this.A = (TextView) view.findViewById(R.id.trophyView);
            M(true);
            N(true);
        }
    }

    public d(Context context, List<TrainingPlan> list) {
        super(context);
        this.l = context;
        this.k = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014f  */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(com.health.openworkout.gui.training.d.b r8, int r9) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.health.openworkout.gui.training.d.u(com.health.openworkout.gui.training.d$b, int):void");
    }

    /* renamed from: Z */
    public b w(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_training, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int f() {
        return this.k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long g(int i) {
        return this.k.get(i).getTrainingPlanId();
    }
}
