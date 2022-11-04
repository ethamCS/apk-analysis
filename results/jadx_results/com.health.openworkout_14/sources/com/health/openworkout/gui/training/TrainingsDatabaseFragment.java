package com.health.openworkout.gui.training;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.health.openworkout.R;
import com.health.openworkout.core.d.a;
import com.health.openworkout.core.datatypes.GitHubFile;
import com.health.openworkout.gui.datatypes.a;
import java.io.File;
import java.util.List;
/* loaded from: classes.dex */
public class TrainingsDatabaseFragment extends Fragment {
    private RecyclerView X;
    private ProgressBar Y;
    private List<GitHubFile> Z;
    private com.health.openworkout.gui.training.a a0;

    /* loaded from: classes.dex */
    public class a implements a.d {

        /* renamed from: a */
        final /* synthetic */ com.health.openworkout.core.d.a f3474a;

        /* renamed from: com.health.openworkout.gui.training.TrainingsDatabaseFragment$a$a */
        /* loaded from: classes.dex */
        class C0091a implements a.b {
            C0091a() {
                a.this = r1;
            }

            @Override // com.health.openworkout.gui.datatypes.a.b
            public void a(int i, View view) {
                a.this.f3474a.i((GitHubFile) TrainingsDatabaseFragment.this.Z.get(i));
                TrainingsDatabaseFragment.this.a0.l(i);
            }
        }

        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: b */
            final /* synthetic */ File f3477b;

            b(File file) {
                a.this = r1;
                this.f3477b = file;
            }

            @Override // java.lang.Runnable
            public void run() {
                TrainingsDatabaseFragment.this.a0.G(a.this.f3474a.q(this.f3477b));
            }
        }

        a(com.health.openworkout.core.d.a aVar) {
            TrainingsDatabaseFragment.this = r1;
            this.f3474a = aVar;
        }

        @Override // com.health.openworkout.core.d.a.d
        public void a(Exception exc) {
            Toast.makeText(TrainingsDatabaseFragment.this.t(), exc.getMessage(), 1).show();
            TrainingsDatabaseFragment.this.Y.setVisibility(8);
        }

        @Override // com.health.openworkout.core.d.a.d
        public void b(File file) {
            TrainingsDatabaseFragment.this.m().runOnUiThread(new b(file));
        }

        @Override // com.health.openworkout.core.d.a.d
        public void c(long j, long j2) {
            TrainingsDatabaseFragment.this.a0.K(j, j2);
        }

        @Override // com.health.openworkout.core.d.a.d
        public void d(List<GitHubFile> list) {
            TrainingsDatabaseFragment.this.Z = list;
            TrainingsDatabaseFragment trainingsDatabaseFragment = TrainingsDatabaseFragment.this;
            trainingsDatabaseFragment.a0 = new com.health.openworkout.gui.training.a(trainingsDatabaseFragment.t(), TrainingsDatabaseFragment.this.Z);
            TrainingsDatabaseFragment.this.a0.J(new C0091a());
            TrainingsDatabaseFragment.this.X.setAdapter(TrainingsDatabaseFragment.this.a0);
            TrainingsDatabaseFragment.this.Y.setVisibility(8);
        }
    }

    protected void F1() {
        com.health.openworkout.core.d.a aVar = new com.health.openworkout.core.d.a(t());
        aVar.r(new a(aVar));
        aVar.n();
    }

    @Override // androidx.fragment.app.Fragment
    public View m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_trainingdatabase, viewGroup, false);
        this.X = (RecyclerView) inflate.findViewById(R.id.trainingsView);
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.progressBar);
        this.Y = progressBar;
        progressBar.setVisibility(0);
        this.X.setHasFixedSize(true);
        this.X.setLayoutManager(new LinearLayoutManager(t()));
        F1();
        return inflate;
    }
}
