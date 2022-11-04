package com.health.openworkout.gui.datatypes;

import android.content.DialogInterface;
import android.os.AsyncTask;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.annotation.Keep;
import androidx.appcompat.app.c;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.health.openworkout.R;
import com.health.openworkout.gui.datatypes.a;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class GenericFragment extends Fragment {
    private FRAGMENT_MODE X = FRAGMENT_MODE.VIEW;
    private androidx.recyclerview.widget.i Y = new androidx.recyclerview.widget.i(new b(15, 0));
    private MenuItem Z;
    private MenuItem a0;

    @Keep
    /* loaded from: classes.dex */
    public enum FRAGMENT_MODE {
        VIEW,
        EDIT
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3417a;

        static {
            int[] iArr = new int[FRAGMENT_MODE.values().length];
            f3417a = iArr;
            try {
                iArr[FRAGMENT_MODE.VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3417a[FRAGMENT_MODE.EDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends i.AbstractC0030i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i, int i2) {
            super(i, i2);
            GenericFragment.this = r1;
        }

        @Override // androidx.recyclerview.widget.i.f
        public void B(RecyclerView.d0 d0Var, int i) {
        }

        @Override // androidx.recyclerview.widget.i.f
        public boolean r() {
            return false;
        }

        @Override // androidx.recyclerview.widget.i.f
        public boolean y(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            int j = d0Var.j();
            int j2 = d0Var2.j();
            Collections.swap(GenericFragment.this.C1(), j, j2);
            GenericFragment.this.B1().o(j, j2);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class c implements a.b {
        c() {
            GenericFragment.this = r1;
        }

        @Override // com.health.openworkout.gui.datatypes.a.b
        public void a(int i, View view) {
            if (i != -1) {
                GenericFragment.this.O1(i);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements a.b {
        d() {
            GenericFragment.this = r1;
        }

        @Override // com.health.openworkout.gui.datatypes.a.b
        public void a(int i, View view) {
            if (i != -1) {
                GenericFragment.this.K1(i);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements a.b {

        /* loaded from: classes.dex */
        class a extends AsyncTask<Void, Void, Void> {

            /* renamed from: a */
            final /* synthetic */ int f3422a;

            a(int i) {
                e.this = r1;
                this.f3422a = i;
            }

            /* renamed from: a */
            public Void doInBackground(Void... voidArr) {
                GenericFragment.this.J1(this.f3422a);
                return null;
            }

            /* renamed from: b */
            public void onPostExecute(Void r2) {
                if (GenericFragment.this.E1() != null) {
                    GenericFragment.this.E1().setVisibility(8);
                }
            }
        }

        e() {
            GenericFragment.this = r1;
        }

        @Override // com.health.openworkout.gui.datatypes.a.b
        public void a(int i, View view) {
            if (i != -1) {
                GenericFragment.this.E1().setVisibility(0);
                GenericFragment.this.B1().n(i + 1);
                new a(i).execute(new Void[0]);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements a.b {
        f() {
            GenericFragment.this = r1;
        }

        @Override // com.health.openworkout.gui.datatypes.a.b
        public void a(int i, View view) {
            if (i != -1) {
                GenericFragment.this.B1().s(i);
                GenericFragment.this.I1(i);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements a.b {
        g() {
            GenericFragment.this = r1;
        }

        @Override // com.health.openworkout.gui.datatypes.a.b
        public void a(int i, View view) {
            if (i != -1) {
                GenericFragment.this.Y.H(GenericFragment.this.F1().b0(i));
            }
        }
    }

    /* loaded from: classes.dex */
    public class h implements a.b {
        h() {
            GenericFragment.this = r1;
        }

        @Override // com.health.openworkout.gui.datatypes.a.b
        public void a(int i, View view) {
            if (i != -1) {
                GenericFragment.this.M1(i);
            }
        }
    }

    /* loaded from: classes.dex */
    public class i implements a.b {
        i() {
            GenericFragment.this = r1;
        }

        @Override // com.health.openworkout.gui.datatypes.a.b
        public void a(int i, View view) {
            if (i != -1) {
                GenericFragment.this.L1(i);
            }
        }
    }

    /* loaded from: classes.dex */
    public class j implements DialogInterface.OnClickListener {

        /* loaded from: classes.dex */
        class a extends AsyncTask<Void, Void, Void> {
            a() {
                j.this = r1;
            }

            /* renamed from: a */
            public Void doInBackground(Void... voidArr) {
                GenericFragment.this.N1();
                return null;
            }

            /* renamed from: b */
            public void onPostExecute(Void r5) {
                if (GenericFragment.this.E1() != null) {
                    GenericFragment.this.E1().setVisibility(8);
                }
                GenericFragment.this.H1();
                Toast.makeText(GenericFragment.this.m(), String.format(GenericFragment.this.N(R.string.label_reset_toast), GenericFragment.this.G1()), 0).show();
            }
        }

        j() {
            GenericFragment.this = r1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i != -1) {
                return;
            }
            GenericFragment.this.E1().setVisibility(0);
            new a().execute(new Void[0]);
        }
    }

    public GenericFragment() {
        p1(true);
    }

    public ProgressBar E1() {
        if (P() != null) {
            return (ProgressBar) P().findViewById(R.id.progressBar);
        }
        return null;
    }

    private void P1() {
        int i2 = a.f3417a[this.X.ordinal()];
        if (i2 == 1) {
            this.Z.setVisible(false);
            this.a0.setVisible(true);
        } else if (i2 == 2) {
            this.Z.setVisible(true);
            this.a0.setVisible(false);
        }
        if (this.X == FRAGMENT_MODE.VIEW) {
            this.Y.m(null);
            B1().Q(new c());
        }
        if (this.X == FRAGMENT_MODE.EDIT) {
            B1().Q(null);
            this.Y.m(F1());
            B1().T(new d());
            B1().S(new e());
            B1().R(new f());
            B1().W(new g());
            B1().V(new h());
            B1().U(new i());
        }
    }

    protected abstract com.health.openworkout.gui.datatypes.a B1();

    protected abstract List C1();

    public FRAGMENT_MODE D1() {
        return this.X;
    }

    protected abstract RecyclerView F1();

    protected abstract String G1();

    protected abstract void H1();

    protected abstract void I1(int i2);

    protected abstract void J1(int i2);

    protected abstract void K1(int i2);

    protected void L1(int i2) {
    }

    protected void M1(int i2) {
    }

    protected abstract void N1();

    protected abstract void O1(int i2);

    protected abstract void Q1();

    @Override // androidx.fragment.app.Fragment
    public void l0(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.fragment_menu, menu);
        this.Z = menu.findItem(R.id.save);
        this.a0 = menu.findItem(R.id.edit);
        P1();
        super.l0(menu, menuInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public void n0() {
        super.n0();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean w0(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.edit) {
            this.X = FRAGMENT_MODE.EDIT;
            B1().P(this.X);
            P1();
            H1();
            return true;
        } else if (itemId == R.id.reset) {
            c.a aVar = new c.a(t());
            j jVar = new j();
            aVar.g(N(R.string.label_really_reset_dialog));
            aVar.m(N(R.string.label_ok), jVar);
            aVar.i(N(R.string.label_cancel), jVar);
            aVar.s();
            return true;
        } else if (itemId != R.id.save) {
            return super.w0(menuItem);
        } else {
            this.X = FRAGMENT_MODE.VIEW;
            B1().P(this.X);
            P1();
            Q1();
            H1();
            Toast.makeText(t(), String.format(N(R.string.label_save_toast), G1()), 0).show();
            return true;
        }
    }
}
