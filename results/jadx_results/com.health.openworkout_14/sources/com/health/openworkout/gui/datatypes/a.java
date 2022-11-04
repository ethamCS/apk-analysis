package com.health.openworkout.gui.datatypes;

import android.content.Context;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import androidx.recyclerview.widget.RecyclerView;
import com.health.openworkout.R;
import com.health.openworkout.gui.datatypes.GenericFragment;
import com.health.openworkout.gui.datatypes.a.c;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public abstract class a<VH extends c> extends RecyclerView.g<VH> {

    /* renamed from: d */
    private static b f3431d;

    /* renamed from: e */
    private static b f3432e;

    /* renamed from: f */
    private static b f3433f;

    /* renamed from: g */
    private static b f3434g;

    /* renamed from: h */
    private static b f3435h;
    private static b i;
    private static b j;

    /* renamed from: c */
    private GenericFragment.FRAGMENT_MODE f3436c = GenericFragment.FRAGMENT_MODE.VIEW;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.health.openworkout.gui.datatypes.a$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0085a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3437a;

        static {
            int[] iArr = new int[GenericFragment.FRAGMENT_MODE.values().length];
            f3437a = iArr;
            try {
                iArr[GenericFragment.FRAGMENT_MODE.VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3437a[GenericFragment.FRAGMENT_MODE.EDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(int i, View view);
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.d0 implements PopupMenu.OnMenuItemClickListener {
        ImageView t;
        ImageView u;
        ImageView v;
        PopupMenu w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.health.openworkout.gui.datatypes.a$c$a */
        /* loaded from: classes.dex */
        public class View$OnClickListenerC0086a implements View.OnClickListener {
            View$OnClickListenerC0086a() {
                c.this = r1;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (a.f3431d != null) {
                    a.f3431d.a(c.this.j(), view);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b implements View.OnClickListener {
            b() {
                c.this = r1;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                c.this.w.show();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.health.openworkout.gui.datatypes.a$c$c */
        /* loaded from: classes.dex */
        public class View$OnClickListenerC0087c implements View.OnClickListener {
            View$OnClickListenerC0087c() {
                c.this = r1;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (a.f3432e != null) {
                    a.f3432e.a(c.this.j(), view);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class d implements View.OnTouchListener {
            d() {
                c.this = r1;
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0 || a.f3434g == null) {
                    return false;
                }
                a.f3434g.a(c.this.j(), view);
                return false;
            }
        }

        public c(View view) {
            super(view);
            this.t = (ImageView) view.findViewById(R.id.reorderView);
            this.u = (ImageView) view.findViewById(R.id.optionView);
            this.v = (ImageView) view.findViewById(R.id.editView);
            PopupMenu popupMenu = new PopupMenu(view.getContext(), this.u);
            this.w = popupMenu;
            a.X(popupMenu);
            this.w.setOnMenuItemClickListener(this);
            this.w.getMenuInflater().inflate(R.menu.item_menu, this.w.getMenu());
            view.setOnClickListener(new View$OnClickListenerC0086a());
            this.u.setOnClickListener(new b());
            this.v.setOnClickListener(new View$OnClickListenerC0087c());
            this.t.setOnTouchListener(new d());
        }

        public void M(boolean z) {
            this.w.getMenu().findItem(R.id.export).setVisible(z);
        }

        public void N(boolean z) {
            this.w.getMenu().findItem(R.id.publish).setVisible(z);
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.delete /* 2131296412 */:
                    if (a.f3433f != null) {
                        a.f3433f.a(j(), null);
                    }
                    return true;
                case R.id.duplicate /* 2131296440 */:
                    if (a.f3435h != null) {
                        a.f3435h.a(j(), null);
                    }
                    return true;
                case R.id.export /* 2131296456 */:
                    if (a.j != null) {
                        a.j.a(j(), null);
                    }
                    return true;
                case R.id.publish /* 2131296608 */:
                    if (a.i != null) {
                        a.i.a(j(), null);
                    }
                    return true;
                default:
                    return false;
            }
        }
    }

    public a(Context context) {
    }

    public static void X(PopupMenu popupMenu) {
        Field[] declaredFields;
        try {
            for (Field field : popupMenu.getClass().getDeclaredFields()) {
                if ("mPopup".equals(field.getName())) {
                    field.setAccessible(true);
                    Object obj = field.get(popupMenu);
                    Class.forName(obj.getClass().getName()).getMethod("setForceShowIcon", Boolean.TYPE).invoke(obj, Boolean.TRUE);
                    return;
                }
            }
        } catch (Exception e2) {
            h.a.a.c(e2);
        }
    }

    public GenericFragment.FRAGMENT_MODE N() {
        return this.f3436c;
    }

    public void O(VH vh, int i2) {
        ImageView imageView;
        int i3;
        int i4 = C0085a.f3437a[this.f3436c.ordinal()];
        if (i4 == 1) {
            imageView = vh.t;
            i3 = 8;
        } else if (i4 != 2) {
            return;
        } else {
            imageView = vh.t;
            i3 = 0;
        }
        imageView.setVisibility(i3);
        vh.u.setVisibility(i3);
        vh.v.setVisibility(i3);
    }

    public void P(GenericFragment.FRAGMENT_MODE fragment_mode) {
        this.f3436c = fragment_mode;
    }

    public void Q(b bVar) {
        f3431d = bVar;
    }

    public void R(b bVar) {
        f3433f = bVar;
    }

    public void S(b bVar) {
        f3435h = bVar;
    }

    public void T(b bVar) {
        f3432e = bVar;
    }

    public void U(b bVar) {
        j = bVar;
    }

    public void V(b bVar) {
        i = bVar;
    }

    public void W(b bVar) {
        f3434g = bVar;
    }
}
