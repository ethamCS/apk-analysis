package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
/* loaded from: classes.dex */
public class e extends androidx.appcompat.view.menu.g {
    public e(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        androidx.appcompat.view.menu.i iVar = (androidx.appcompat.view.menu.i) a(i, i2, i3, charSequence);
        g gVar = new g(e(), this, iVar);
        iVar.a(gVar);
        return gVar;
    }
}
