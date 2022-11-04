package com.health.openworkout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.t;
import androidx.navigation.z.c;
import com.google.android.material.navigation.NavigationView;
import com.health.openworkout.core.d.b;
/* loaded from: classes.dex */
public class MainActivity extends d {
    private c t;

    /* loaded from: classes.dex */
    class a implements NavigationView.c {

        /* renamed from: a */
        final /* synthetic */ NavController f3369a;

        /* renamed from: b */
        final /* synthetic */ DrawerLayout f3370b;

        a(NavController navController, DrawerLayout drawerLayout) {
            MainActivity.this = r1;
            this.f3369a = navController;
            this.f3370b = drawerLayout;
        }

        @Override // com.google.android.material.navigation.NavigationView.c
        public boolean a(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == R.id.nav_about) {
                MainActivity.this.L();
            } else if (itemId == R.id.nav_help) {
                MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/oliexdev/openWorkout")));
            }
            androidx.navigation.z.d.f(menuItem, this.f3369a);
            this.f3370b.e(8388611);
            return true;
        }
    }

    public void L() {
        SpannableString spannableString = new SpannableString(getResources().getString(R.string.label_about_info));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getResources().getString(R.string.app_name) + " " + String.format("v%s (%d)", "1.3.1", 14)).setMessage(spannableString).setIcon(R.drawable.ic_openworkout).setPositiveButton(getResources().getString(R.string.label_ok), (DialogInterface.OnClickListener) null).create().show();
    }

    @Override // androidx.appcompat.app.d
    public boolean F() {
        return androidx.navigation.z.d.e(t.a(this, R.id.nav_host_fragment), this.t) || super.F();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        H((Toolbar) findViewById(R.id.toolbar));
        getWindow().addFlags(128);
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        c.b bVar = new c.b(R.id.nav_home, R.id.nav_main_preferences, R.id.nav_trainings);
        bVar.b(drawerLayout);
        this.t = bVar.a();
        NavController a2 = t.a(this, R.id.nav_host_fragment);
        androidx.navigation.z.d.g(this, a2, this.t);
        androidx.navigation.z.d.h(navigationView, a2);
        navigationView.setNavigationItemSelectedListener(new a(a2, drawerLayout));
        if (!b.c().e()) {
            b.c().d(this);
        }
        com.health.openworkout.core.a.h().n();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}
