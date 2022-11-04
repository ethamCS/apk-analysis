package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.m0;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b */
    private static final PorterDuff.Mode f692b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static j f693c;

    /* renamed from: a */
    private m0 f694a;

    /* loaded from: classes.dex */
    public static class a implements m0.e {

        /* renamed from: a */
        private final int[] f695a = {a.a.e.abc_textfield_search_default_mtrl_alpha, a.a.e.abc_textfield_default_mtrl_alpha, a.a.e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        private final int[] f696b = {a.a.e.abc_ic_commit_search_api_mtrl_alpha, a.a.e.abc_seekbar_tick_mark_material, a.a.e.abc_ic_menu_share_mtrl_alpha, a.a.e.abc_ic_menu_copy_mtrl_am_alpha, a.a.e.abc_ic_menu_cut_mtrl_alpha, a.a.e.abc_ic_menu_selectall_mtrl_alpha, a.a.e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        private final int[] f697c = {a.a.e.abc_textfield_activated_mtrl_alpha, a.a.e.abc_textfield_search_activated_mtrl_alpha, a.a.e.abc_cab_background_top_mtrl_alpha, a.a.e.abc_text_cursor_material, a.a.e.abc_text_select_handle_left_mtrl_dark, a.a.e.abc_text_select_handle_middle_mtrl_dark, a.a.e.abc_text_select_handle_right_mtrl_dark, a.a.e.abc_text_select_handle_left_mtrl_light, a.a.e.abc_text_select_handle_middle_mtrl_light, a.a.e.abc_text_select_handle_right_mtrl_light};
        private final int[] d = {a.a.e.abc_popup_background_mtrl_mult, a.a.e.abc_cab_background_internal_bg, a.a.e.abc_menu_hardkey_panel_mtrl_mult};
        private final int[] e = {a.a.e.abc_tab_indicator_material, a.a.e.abc_textfield_search_material};
        private final int[] f = {a.a.e.abc_btn_check_material, a.a.e.abc_btn_radio_material, a.a.e.abc_btn_check_material_anim, a.a.e.abc_btn_radio_material_anim};

        a() {
        }

        private ColorStateList a(Context context) {
            return b(context, 0);
        }

        private void a(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.f692b;
            }
            drawable.setColorFilter(j.a(i, mode));
        }

        private boolean a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList b(Context context) {
            return b(context, r0.b(context, a.a.a.colorAccent));
        }

        private ColorStateList b(Context context, int i) {
            int b2 = r0.b(context, a.a.a.colorControlHighlight);
            return new ColorStateList(new int[][]{r0.f742b, r0.d, r0.f743c, r0.f}, new int[]{r0.a(context, a.a.a.colorButtonNormal), a.g.e.a.b(b2, i), a.g.e.a.b(b2, i), i});
        }

        private ColorStateList c(Context context) {
            return b(context, r0.b(context, a.a.a.colorButtonNormal));
        }

        private ColorStateList d(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList c2 = r0.c(context, a.a.a.colorSwitchThumbNormal);
            if (c2 == null || !c2.isStateful()) {
                iArr[0] = r0.f742b;
                iArr2[0] = r0.a(context, a.a.a.colorSwitchThumbNormal);
                iArr[1] = r0.e;
                iArr2[1] = r0.b(context, a.a.a.colorControlActivated);
                iArr[2] = r0.f;
                iArr2[2] = r0.b(context, a.a.a.colorSwitchThumbNormal);
            } else {
                iArr[0] = r0.f742b;
                iArr2[0] = c2.getColorForState(iArr[0], 0);
                iArr[1] = r0.e;
                iArr2[1] = r0.b(context, a.a.a.colorControlActivated);
                iArr[2] = r0.f;
                iArr2[2] = c2.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        @Override // androidx.appcompat.widget.m0.e
        public ColorStateList a(Context context, int i) {
            if (i == a.a.e.abc_edit_text_material) {
                return a.a.k.a.a.b(context, a.a.c.abc_tint_edittext);
            }
            if (i == a.a.e.abc_switch_track_mtrl_alpha) {
                return a.a.k.a.a.b(context, a.a.c.abc_tint_switch_track);
            }
            if (i == a.a.e.abc_switch_thumb_material) {
                return d(context);
            }
            if (i == a.a.e.abc_btn_default_mtrl_shape) {
                return c(context);
            }
            if (i == a.a.e.abc_btn_borderless_material) {
                return a(context);
            }
            if (i == a.a.e.abc_btn_colored_material) {
                return b(context);
            }
            if (i == a.a.e.abc_spinner_mtrl_am_alpha || i == a.a.e.abc_spinner_textfield_background_material) {
                return a.a.k.a.a.b(context, a.a.c.abc_tint_spinner);
            }
            if (a(this.f696b, i)) {
                return r0.c(context, a.a.a.colorControlNormal);
            }
            if (a(this.e, i)) {
                return a.a.k.a.a.b(context, a.a.c.abc_tint_default);
            }
            if (a(this.f, i)) {
                return a.a.k.a.a.b(context, a.a.c.abc_tint_btn_checkable);
            }
            if (i != a.a.e.abc_seekbar_thumb_material) {
                return null;
            }
            return a.a.k.a.a.b(context, a.a.c.abc_tint_seek_thumb);
        }

        @Override // androidx.appcompat.widget.m0.e
        public PorterDuff.Mode a(int i) {
            if (i == a.a.e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.m0.e
        public Drawable a(m0 m0Var, Context context, int i) {
            if (i == a.a.e.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{m0Var.a(context, a.a.e.abc_cab_background_internal_bg), m0Var.a(context, a.a.e.abc_cab_background_top_mtrl_alpha)});
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.m0.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.j.a()
                int[] r1 = r6.f695a
                boolean r1 = r6.a(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = a.a.a.colorControlNormal
            L14:
                r8 = -1
            L15:
                r1 = 1
                goto L44
            L17:
                int[] r1 = r6.f697c
                boolean r1 = r6.a(r1, r8)
                if (r1 == 0) goto L22
                int r2 = a.a.a.colorControlActivated
                goto L14
            L22:
                int[] r1 = r6.d
                boolean r1 = r6.a(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = a.a.e.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = a.a.e.abc_dialog_material_background
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = -1
                r1 = 0
                r2 = 0
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.e0.a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.r0.b(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.j.a(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.m0.e
        public boolean b(Context context, int i, Drawable drawable) {
            LayerDrawable layerDrawable;
            Drawable findDrawableByLayerId;
            int i2;
            if (i == a.a.e.abc_seekbar_track_material) {
                layerDrawable = (LayerDrawable) drawable;
                a(layerDrawable.findDrawableByLayerId(16908288), r0.b(context, a.a.a.colorControlNormal), j.f692b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
                i2 = a.a.a.colorControlNormal;
            } else if (i != a.a.e.abc_ratingbar_material && i != a.a.e.abc_ratingbar_indicator_material && i != a.a.e.abc_ratingbar_small_material) {
                return false;
            } else {
                layerDrawable = (LayerDrawable) drawable;
                a(layerDrawable.findDrawableByLayerId(16908288), r0.a(context, a.a.a.colorControlNormal), j.f692b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
                i2 = a.a.a.colorControlActivated;
            }
            a(findDrawableByLayerId, r0.b(context, i2), j.f692b);
            a(layerDrawable.findDrawableByLayerId(16908301), r0.b(context, a.a.a.colorControlActivated), j.f692b);
            return true;
        }
    }

    public static synchronized PorterDuffColorFilter a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2;
        synchronized (j.class) {
            a2 = m0.a(i, mode);
        }
        return a2;
    }

    public static void a(Drawable drawable, u0 u0Var, int[] iArr) {
        m0.a(drawable, u0Var, iArr);
    }

    public static synchronized j b() {
        j jVar;
        synchronized (j.class) {
            if (f693c == null) {
                c();
            }
            jVar = f693c;
        }
        return jVar;
    }

    public static synchronized void c() {
        synchronized (j.class) {
            if (f693c == null) {
                j jVar = new j();
                f693c = jVar;
                jVar.f694a = m0.a();
                f693c.f694a.a(new a());
            }
        }
    }

    public synchronized Drawable a(Context context, int i) {
        return this.f694a.a(context, i);
    }

    public synchronized Drawable a(Context context, int i, boolean z) {
        return this.f694a.a(context, i, z);
    }

    public synchronized void a(Context context) {
        this.f694a.a(context);
    }

    public synchronized ColorStateList b(Context context, int i) {
        return this.f694a.b(context, i);
    }
}
