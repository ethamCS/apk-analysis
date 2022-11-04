package u0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import u0.b;
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {
    protected C0397a U3;
    protected DataSetObserver V3;
    protected u0.b W3;

    /* renamed from: c */
    protected boolean f22494c;

    /* renamed from: d */
    protected boolean f22495d;

    /* renamed from: q */
    protected Cursor f22496q;

    /* renamed from: x */
    protected Context f22497x;

    /* renamed from: y */
    protected int f22498y;

    /* renamed from: u0.a$a */
    /* loaded from: classes.dex */
    public class C0397a extends ContentObserver {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0397a() {
            super(new Handler());
            a.this = r1;
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.i();
        }
    }

    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
            a.this = r1;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f22494c = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f22494c = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor j10 = j(cursor);
        if (j10 != null) {
            j10.close();
        }
    }

    @Override // u0.b.a
    public Cursor b() {
        return this.f22496q;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    void f(Context context, Cursor cursor, int i10) {
        b bVar;
        boolean z10 = false;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f22495d = true;
        } else {
            this.f22495d = false;
        }
        if (cursor != null) {
            z10 = true;
        }
        this.f22496q = cursor;
        this.f22494c = z10;
        this.f22497x = context;
        this.f22498y = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.U3 = new C0397a();
            bVar = new b();
        } else {
            bVar = null;
            this.U3 = null;
        }
        this.V3 = bVar;
        if (z10) {
            C0397a c0397a = this.U3;
            if (c0397a != null) {
                cursor.registerContentObserver(c0397a);
            }
            DataSetObserver dataSetObserver = this.V3;
            if (dataSetObserver == null) {
                return;
            }
            cursor.registerDataSetObserver(dataSetObserver);
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f22494c || (cursor = this.f22496q) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f22494c) {
            this.f22496q.moveToPosition(i10);
            if (view == null) {
                view = g(this.f22497x, this.f22496q, viewGroup);
            }
            e(view, this.f22497x, this.f22496q);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.W3 == null) {
            this.W3 = new u0.b(this);
        }
        return this.W3;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f22494c || (cursor = this.f22496q) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f22496q;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (!this.f22494c || (cursor = this.f22496q) == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f22496q.getLong(this.f22498y);
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f22494c) {
            if (this.f22496q.moveToPosition(i10)) {
                if (view == null) {
                    view = h(this.f22497x, this.f22496q, viewGroup);
                }
                e(view, this.f22497x, this.f22496q);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i10);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void i() {
        Cursor cursor;
        if (!this.f22495d || (cursor = this.f22496q) == null || cursor.isClosed()) {
            return;
        }
        this.f22494c = this.f22496q.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f22496q;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0397a c0397a = this.U3;
            if (c0397a != null) {
                cursor2.unregisterContentObserver(c0397a);
            }
            DataSetObserver dataSetObserver = this.V3;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f22496q = cursor;
        if (cursor != null) {
            C0397a c0397a2 = this.U3;
            if (c0397a2 != null) {
                cursor.registerContentObserver(c0397a2);
            }
            DataSetObserver dataSetObserver2 = this.V3;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f22498y = cursor.getColumnIndexOrThrow("_id");
            this.f22494c = true;
            notifyDataSetChanged();
        } else {
            this.f22498y = -1;
            this.f22494c = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
