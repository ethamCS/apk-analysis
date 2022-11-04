package com.health.openworkout.gui.training;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.GitHubFile;
import com.health.openworkout.core.datatypes.TrainingPlan;
import com.health.openworkout.gui.datatypes.a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.List;
/* loaded from: classes.dex */
public class a extends RecyclerView.g<C0092a> {

    /* renamed from: f */
    private static a.b f3479f;

    /* renamed from: c */
    private List<GitHubFile> f3480c;

    /* renamed from: d */
    private C0092a f3481d;

    /* renamed from: e */
    private Context f3482e;

    /* renamed from: com.health.openworkout.gui.training.a$a */
    /* loaded from: classes.dex */
    public static class C0092a extends RecyclerView.d0 {
        ImageView t;
        TextView u;
        TextView v;
        ImageView w;
        ProgressBar x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.health.openworkout.gui.training.a$a$a */
        /* loaded from: classes.dex */
        public class View$OnClickListenerC0093a implements View.OnClickListener {
            View$OnClickListenerC0093a() {
                C0092a.this = r1;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a.f3479f.a(C0092a.this.j(), view);
            }
        }

        public C0092a(View view) {
            super(view);
            this.t = (ImageView) view.findViewById(R.id.imgView);
            this.u = (TextView) view.findViewById(R.id.nameView);
            this.v = (TextView) view.findViewById(R.id.detailedView);
            this.w = (ImageView) view.findViewById(R.id.downloadView);
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progressBar);
            this.x = progressBar;
            progressBar.setMax(100);
            view.setOnClickListener(new View$OnClickListenerC0093a());
        }
    }

    public a(Context context, List<GitHubFile> list) {
        this.f3482e = context;
        this.f3480c = list;
    }

    public void G(TrainingPlan trainingPlan) {
        this.f3481d.x.setProgress(100);
        try {
            if (trainingPlan.isImagePathExternal()) {
                this.f3481d.t.setImageURI(Uri.parse(trainingPlan.getImagePath()));
            } else {
                AssetManager assets = this.f3482e.getAssets();
                InputStream open = assets.open("image/" + trainingPlan.getImagePath());
                this.f3481d.t.setImageDrawable(Drawable.createFromStream(open, null));
                open.close();
            }
        } catch (IOException e2) {
            h.a.a.c(e2);
        } catch (SecurityException e3) {
            this.f3481d.t.setImageResource(R.drawable.ic_no_file);
            Context context = this.f3482e;
            Toast.makeText(context, this.f3482e.getString(R.string.error_no_access_to_file) + " " + trainingPlan.getImagePath(), 0).show();
            h.a.a.c(e3);
        }
        this.f3481d.w.setImageResource(R.drawable.ic_download_finished);
        this.f3481d.u.setEnabled(true);
        this.f3481d.v.setEnabled(true);
        this.f3481d.f1551a.setOnClickListener(null);
    }

    /* renamed from: H */
    public void u(C0092a c0092a, int i) {
        TextView textView;
        String str;
        this.f3481d = c0092a;
        GitHubFile gitHubFile = this.f3480c.get(i);
        c0092a.u.setText(gitHubFile.getName().substring(0, gitHubFile.getName().length() - 4));
        DecimalFormat decimalFormat = new DecimalFormat("##0.00");
        double size = ((float) gitHubFile.getSize()) / 1000000.0f;
        if (size >= 1.0d) {
            textView = c0092a.v;
            str = String.format(this.f3482e.getString(R.string.label_package_size_mbytes), decimalFormat.format(size));
        } else {
            textView = c0092a.v;
            str = String.format(this.f3482e.getString(R.string.label_package_size_kbytes), decimalFormat.format(size * 1000.0d));
        }
        textView.setText(str);
        String substring = gitHubFile.getName().substring(0, gitHubFile.getName().length() - 4);
        if (new File(this.f3482e.getFilesDir(), substring).exists()) {
            for (TrainingPlan trainingPlan : com.health.openworkout.core.a.h().k()) {
                if (trainingPlan.getName().equals(substring)) {
                    G(trainingPlan);
                }
            }
        }
    }

    /* renamed from: I */
    public C0092a w(ViewGroup viewGroup, int i) {
        return new C0092a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_trainingdatabase, viewGroup, false));
    }

    public void J(a.b bVar) {
        f3479f = bVar;
    }

    public void K(long j, long j2) {
        this.f3481d.x.setProgress((int) ((j / j2) * 100.0d));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int f() {
        return this.f3480c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long g(int i) {
        List<GitHubFile> list = this.f3480c;
        return list.indexOf(list.get(i));
    }
}
