package com.health.openworkout.gui.workout;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
import com.health.openworkout.gui.datatypes.GenericFragment;
import com.health.openworkout.gui.datatypes.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* loaded from: classes.dex */
public class g extends com.health.openworkout.gui.datatypes.a<b> {
    private final List<WorkoutItem> k;
    private Context l;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3540a;

        static {
            int[] iArr = new int[GenericFragment.FRAGMENT_MODE.values().length];
            f3540a = iArr;
            try {
                iArr[GenericFragment.FRAGMENT_MODE.VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3540a[GenericFragment.FRAGMENT_MODE.EDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a.c {
        TextView A;
        ImageView B;
        TextView C;
        TextView x;
        ImageView y;
        TextView z;

        public b(View view) {
            super(view);
            this.x = (TextView) view.findViewById(R.id.prepView);
            this.y = (ImageView) view.findViewById(R.id.imgView);
            this.z = (TextView) view.findViewById(R.id.nameView);
            this.A = (TextView) view.findViewById(R.id.detailedView);
            this.B = (ImageView) view.findViewById(R.id.doneView);
            this.C = (TextView) view.findViewById(R.id.breakView);
        }
    }

    public g(Context context, List<WorkoutItem> list) {
        super(context);
        this.l = context;
        this.k = list;
    }

    /* renamed from: Y */
    public void u(b bVar, int i) {
        String str;
        TextView textView;
        super.O(bVar, i);
        WorkoutItem workoutItem = this.k.get(i);
        bVar.z.setText(workoutItem.getName());
        if (workoutItem.isFinished()) {
            bVar.B.setVisibility(0);
        } else {
            bVar.B.setVisibility(4);
        }
        if (workoutItem.isTimeMode()) {
            textView = bVar.A;
            str = String.format(this.l.getString(R.string.label_work_duration_item_info), Integer.valueOf(workoutItem.getWorkoutTime()));
        } else {
            textView = bVar.A;
            str = String.format(this.l.getString(R.string.label_repetition_item_info), Integer.valueOf(workoutItem.getRepetitionCount()));
        }
        textView.setText(str);
        bVar.x.setText(String.format(this.l.getString(R.string.label_prep_duration_item_info), Integer.valueOf(workoutItem.getPrepTime())));
        bVar.C.setText(String.format(this.l.getString(R.string.label_break_duration_item_info), Integer.valueOf(workoutItem.getBreakTime())));
        try {
            if (workoutItem.isImagePathExternal()) {
                bVar.y.setImageURI(Uri.parse(workoutItem.getImagePath()));
            } else {
                String str2 = com.health.openworkout.core.a.h().g().isMale() ? "male" : "female";
                AssetManager assets = this.l.getAssets();
                InputStream open = assets.open("image/" + str2 + "/" + workoutItem.getImagePath());
                bVar.y.setImageDrawable(Drawable.createFromStream(open, null));
                open.close();
            }
        } catch (IOException e2) {
            bVar.y.setImageResource(R.drawable.ic_no_file);
            h.a.a.c(e2);
        } catch (SecurityException e3) {
            bVar.y.setImageResource(R.drawable.ic_no_file);
            Context context = this.l;
            Toast.makeText(context, this.l.getString(R.string.error_no_access_to_file) + " " + workoutItem.getImagePath(), 0).show();
            h.a.a.c(e3);
        }
        if (a.f3540a[N().ordinal()] != 2) {
            return;
        }
        bVar.B.setVisibility(8);
    }

    /* renamed from: Z */
    public b w(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_workout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int f() {
        return this.k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long g(int i) {
        return this.k.get(i).getWorkoutItemId();
    }
}
