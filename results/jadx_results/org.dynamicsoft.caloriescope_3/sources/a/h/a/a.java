package a.h.a;

import a.h.a.b;
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
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: b */
    protected boolean f302b;

    /* renamed from: c */
    protected boolean f303c;
    protected Cursor d;
    protected Context e;
    protected int f;
    protected C0018a g;
    protected DataSetObserver h;
    protected a.h.a.b i;

    /* renamed from: a.h.a.a$a */
    /* loaded from: classes.dex */
    public class C0018a extends ContentObserver {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0018a() {
            super(new Handler());
            a.this = r1;
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            a.this.b();
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
            aVar.f302b = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f302b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        a(context, cursor, z ? 1 : 2);
    }

    @Override // a.h.a.b.a
    public Cursor a() {
        return this.d;
    }

    public abstract View a(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // a.h.a.b.a
    public abstract CharSequence a(Cursor cursor);

    void a(Context context, Cursor cursor, int i) {
        b bVar;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f303c = true;
        } else {
            this.f303c = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.d = cursor;
        this.f302b = z;
        this.e = context;
        this.f = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.g = new C0018a();
            bVar = new b();
        } else {
            bVar = null;
            this.g = null;
        }
        this.h = bVar;
        if (z) {
            C0018a c0018a = this.g;
            if (c0018a != null) {
                cursor.registerContentObserver(c0018a);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver == null) {
                return;
            }
            cursor.registerDataSetObserver(dataSetObserver);
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public abstract View b(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void b() {
        Cursor cursor;
        if (!this.f303c || (cursor = this.d) == null || cursor.isClosed()) {
            return;
        }
        this.f302b = this.d.requery();
    }

    @Override // a.h.a.b.a
    public void b(Cursor cursor) {
        Cursor c2 = c(cursor);
        if (c2 != null) {
            c2.close();
        }
    }

    public Cursor c(Cursor cursor) {
        Cursor cursor2 = this.d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0018a c0018a = this.g;
            if (c0018a != null) {
                cursor2.unregisterContentObserver(c0018a);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.d = cursor;
        if (cursor != null) {
            C0018a c0018a2 = this.g;
            if (c0018a2 != null) {
                cursor.registerContentObserver(c0018a2);
            }
            DataSetObserver dataSetObserver2 = this.h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f = cursor.getColumnIndexOrThrow("_id");
            this.f302b = true;
            notifyDataSetChanged();
        } else {
            this.f = -1;
            this.f302b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f302b || (cursor = this.d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f302b) {
            this.d.moveToPosition(i);
            if (view == null) {
                view = a(this.e, this.d, viewGroup);
            }
            a(view, this.e, this.d);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.i == null) {
            this.i = new a.h.a.b(this);
        }
        return this.i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f302b || (cursor = this.d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f302b || (cursor = this.d) == null || !cursor.moveToPosition(i)) {
            return 0L;
        }
        return this.d.getLong(this.f);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f302b) {
            if (this.d.moveToPosition(i)) {
                if (view == null) {
                    view = b(this.e, this.d, viewGroup);
                }
                a(view, this.e, this.d);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
