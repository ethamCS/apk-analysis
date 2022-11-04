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

    /* renamed from: a */
    final Handler f1a = null;

    /* renamed from: b */
    a.a.a.a.a f2b;

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
        public void k0(int i, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f1a;
            if (handler != null) {
                handler.post(new c(i, bundle));
            } else {
                bVar.a(i, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a */
        final int f4a;

        /* renamed from: b */
        final Bundle f5b;

        c(int i, Bundle bundle) {
            b.this = r1;
            this.f4a = i;
            this.f5b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f4a, this.f5b);
        }
    }

    b(Parcel parcel) {
        this.f2b = a.AbstractBinderC0000a.n0(parcel.readStrongBinder());
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
            if (this.f2b == null) {
                this.f2b = new BinderC0002b();
            }
            parcel.writeStrongBinder(this.f2b.asBinder());
        }
    }
}
