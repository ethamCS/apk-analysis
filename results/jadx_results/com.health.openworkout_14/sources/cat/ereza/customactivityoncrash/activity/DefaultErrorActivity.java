package cat.ereza.customactivityoncrash.activity;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.appcompat.app.d;
import c.a.a.e;
import c.a.a.f;
import c.a.a.g;
/* loaded from: classes.dex */
public final class DefaultErrorActivity extends d {

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ c.a.a.h.a f2880b;

        a(c.a.a.h.a aVar) {
            DefaultErrorActivity.this = r1;
            this.f2880b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.a.a.a.G(DefaultErrorActivity.this, this.f2880b);
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ c.a.a.h.a f2882b;

        b(c.a.a.h.a aVar) {
            DefaultErrorActivity.this = r1;
            this.f2882b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.a.a.a.o(DefaultErrorActivity.this, this.f2882b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {

        /* loaded from: classes.dex */
        class a implements DialogInterface.OnClickListener {
            a() {
                c.this = r1;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                DefaultErrorActivity.this.L();
            }
        }

        c() {
            DefaultErrorActivity.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.a aVar = new c.a(DefaultErrorActivity.this);
            aVar.p(e.e_res_0x7f100032);
            DefaultErrorActivity defaultErrorActivity = DefaultErrorActivity.this;
            aVar.g(c.a.a.a.q(defaultErrorActivity, defaultErrorActivity.getIntent()));
            aVar.l(e.b_res_0x7f10002f, null);
            aVar.j(e.d_res_0x7f100031, new a());
            TextView textView = (TextView) aVar.s().findViewById(16908299);
            if (textView != null) {
                textView.setTextSize(0, DefaultErrorActivity.this.getResources().getDimension(c.a.a.b.a_res_0x7f07005e));
            }
        }
    }

    public void L() {
        String q = c.a.a.a.q(this, getIntent());
        ClipboardManager clipboardManager = (ClipboardManager) getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(getString(e.a_res_0x7f10002e), q));
            Toast.makeText(this, e.c_res_0x7f100030, 0).show();
        }
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    @SuppressLint({"PrivateResource"})
    public void onCreate(Bundle bundle) {
        View.OnClickListener onClickListener;
        super.onCreate(bundle);
        TypedArray obtainStyledAttributes = obtainStyledAttributes(g.f2871a);
        if (!obtainStyledAttributes.hasValue(g.f2872b)) {
            setTheme(f.a_res_0x7f1101b9);
        }
        obtainStyledAttributes.recycle();
        setContentView(c.a.a.d.a_res_0x7f0c0020);
        Button button = (Button) findViewById(c.a.a.c.c_res_0x7f090095);
        c.a.a.h.a s = c.a.a.a.s(getIntent());
        if (s == null) {
            finish();
            return;
        }
        if (!s.m() || s.i() == null) {
            onClickListener = new b(s);
        } else {
            button.setText(e.f_res_0x7f100034);
            onClickListener = new a(s);
        }
        button.setOnClickListener(onClickListener);
        Button button2 = (Button) findViewById(c.a.a.c.b_res_0x7f090094);
        if (s.l()) {
            button2.setOnClickListener(new c());
        } else {
            button2.setVisibility(8);
        }
        Integer f2 = s.f();
        ImageView imageView = (ImageView) findViewById(c.a.a.c.a_res_0x7f090093);
        if (f2 == null) {
            return;
        }
        imageView.setImageDrawable(b.g.d.c.f.a(getResources(), f2.intValue(), getTheme()));
    }
}
