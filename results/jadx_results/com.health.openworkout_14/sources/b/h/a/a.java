package b.h.a;

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
import b.h.a.b;
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: b */
    protected boolean f2594b;

    /* renamed from: c */
    protected boolean f2595c;

    /* renamed from: d */
    protected Cursor f2596d;

    /* renamed from: e */
    protected Context f2597e;

    /* renamed from: f */
    protected int f2598f;

    /* renamed from: g */
    protected C0055a f2599g;

    /* renamed from: h */
    protected DataSetObserver f2600h;
    protected b.h.a.b i;

    /* renamed from: b.h.a.a$a */
    /* loaded from: classes.dex */
    public class C0055a extends ContentObserver {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0055a() {
            super(new Handler());
            a.this = r1;
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
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
            aVar.f2594b = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f2594b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        f(context, cursor, z ? 1 : 2);
    }

    public abstract CharSequence a(Cursor cursor);

    public void b(Cursor cursor) {
        Cursor j = j(cursor);
        if (j != null) {
            j.close();
        }
    }

    @Override // b.h.a.b.a
    public Cursor c() {
        return this.f2596d;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    void f(Context context, Cursor cursor, int i) {
        b bVar;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f2595c = true;
        } else {
            this.f2595c = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f2596d = cursor;
        this.f2594b = z;
        this.f2597e = context;
        this.f2598f = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f2599g = new C0055a();
            bVar = new b();
        } else {
            bVar = null;
            this.f2599g = null;
        }
        this.f2600h = bVar;
        if (z) {
            C0055a c0055a = this.f2599g;
            if (c0055a != null) {
                cursor.registerContentObserver(c0055a);
            }
            DataSetObserver dataSetObserver = this.f2600h;
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
        if (!this.f2594b || (cursor = this.f2596d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f2594b) {
            this.f2596d.moveToPosition(i);
            if (view == null) {
                view = g(this.f2597e, this.f2596d, viewGroup);
            }
            e(view, this.f2597e, this.f2596d);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.i == null) {
            this.i = new b.h.a.b(this);
        }
        return this.i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f2594b || (cursor = this.f2596d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f2596d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f2594b || (cursor = this.f2596d) == null || !cursor.moveToPosition(i)) {
            return 0L;
        }
        return this.f2596d.getLong(this.f2598f);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f2594b) {
            if (this.f2596d.moveToPosition(i)) {
                if (view == null) {
                    view = h(this.f2597e, this.f2596d, viewGroup);
                }
                e(view, this.f2597e, this.f2596d);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void i() {
        Cursor cursor;
        if (!this.f2595c || (cursor = this.f2596d) == null || cursor.isClosed()) {
            return;
        }
        this.f2594b = this.f2596d.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f2596d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0055a c0055a = this.f2599g;
            if (c0055a != null) {
                cursor2.unregisterContentObserver(c0055a);
            }
            DataSetObserver dataSetObserver = this.f2600h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2596d = cursor;
        if (cursor != null) {
            C0055a c0055a2 = this.f2599g;
            if (c0055a2 != null) {
                cursor.registerContentObserver(c0055a2);
            }
            DataSetObserver dataSetObserver2 = this.f2600h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f2598f = cursor.getColumnIndexOrThrow("_id");
            this.f2594b = true;
            notifyDataSetChanged();
        } else {
            this.f2598f = -1;
            this.f2594b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
