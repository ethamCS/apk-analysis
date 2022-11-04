package u0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class c extends a {
    private int X3;
    private int Y3;
    private LayoutInflater Z3;

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.Y3 = i10;
        this.X3 = i10;
        this.Z3 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // u0.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.Z3.inflate(this.Y3, viewGroup, false);
    }

    @Override // u0.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.Z3.inflate(this.X3, viewGroup, false);
    }
}
