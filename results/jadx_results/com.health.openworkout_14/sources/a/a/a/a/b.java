package a.a.a.a;

import a.a.a.a.a;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b */
    final Handler f1b = null;

    /* renamed from: c */
    a.a.a.a.a f2c;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    /* renamed from: a.a.a.a.b$b */
    /* loaded from: classes.dex */
    class BinderC0002b extends a.AbstractBinderC0000a {
        BinderC0002b() {
            b.this = r1;
        }

        @Override // a.a.a.a.a
        public void r(int i, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f1b;
            if (handler != null) {
                handler.post(new c(i, bundle));
            } else {
                bVar.a(i, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: b */
        final int f4b;

        /* renamed from: c */
        final Bundle f5c;

        c(int i, Bundle bundle) {
            b.this = r1;
            this.f4b = i;
            this.f5c = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f4b, this.f5c);
        }
    }

    b(Parcel parcel) {
        this.f2c = a.AbstractBinderC0000a.t(parcel.readStrongBinder());
    }

    protected void a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f2c == null) {
                this.f2c = new BinderC0002b();
            }
            parcel.writeStrongBinder(this.f2c.asBinder());
        }
    }
}
