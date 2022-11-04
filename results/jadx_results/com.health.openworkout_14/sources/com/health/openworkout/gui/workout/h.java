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
import androidx.recyclerview.widget.RecyclerView;
import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
import com.health.openworkout.gui.datatypes.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* loaded from: classes.dex */
public class h extends RecyclerView.g<a> {

    /* renamed from: e */
    private static a.b f3541e;

    /* renamed from: c */
    private final List<WorkoutItem> f3542c;

    /* renamed from: d */
    private Context f3543d;

    /* loaded from: classes.dex */
    public static class a extends RecyclerView.d0 {
        ImageView t;
        TextView u;
        TextView v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.health.openworkout.gui.workout.h$a$a */
        /* loaded from: classes.dex */
        public class View$OnClickListenerC0098a implements View.OnClickListener {
            View$OnClickListenerC0098a() {
                a.this = r1;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                h.f3541e.a(a.this.j(), view);
            }
        }

        public a(View view) {
            super(view);
            this.t = (ImageView) view.findViewById(R.id.imgView);
            this.u = (TextView) view.findViewById(R.id.nameView);
            this.v = (TextView) view.findViewById(R.id.detailedView);
            view.setOnClickListener(new View$OnClickListenerC0098a());
        }
    }

    public h(Context context, List<WorkoutItem> list) {
        this.f3543d = context;
        this.f3542c = list;
    }

    /* renamed from: G */
    public void u(a aVar, int i) {
        WorkoutItem workoutItem = this.f3542c.get(i);
        aVar.u.setText(workoutItem.getName());
        aVar.v.setText(workoutItem.getDescription());
        try {
            if (workoutItem.isImagePathExternal()) {
                aVar.t.setImageURI(Uri.parse(workoutItem.getImagePath()));
            } else {
                String str = com.health.openworkout.core.a.h().g().isMale() ? "male" : "female";
                AssetManager assets = this.f3543d.getAssets();
                InputStream open = assets.open("image/" + str + "/" + workoutItem.getImagePath());
                aVar.t.setImageDrawable(Drawable.createFromStream(open, null));
                open.close();
            }
        } catch (IOException e2) {
            aVar.t.setImageResource(R.drawable.ic_no_file);
            h.a.a.c(e2);
        } catch (SecurityException e3) {
            aVar.t.setImageResource(R.drawable.ic_no_file);
            Context context = this.f3543d;
            Toast.makeText(context, this.f3543d.getString(R.string.error_no_access_to_file) + " " + workoutItem.getImagePath(), 0).show();
            h.a.a.c(e3);
        }
    }

    /* renamed from: H */
    public a w(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_workoutdatabase, viewGroup, false));
    }

    public void I(a.b bVar) {
        f3541e = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int f() {
        return this.f3542c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long g(int i) {
        return this.f3542c.get(i).getWorkoutItemId();
    }
}
