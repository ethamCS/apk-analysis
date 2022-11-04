package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: android.support.v4.app.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0003a extends Binder implements a {

        /* renamed from: android.support.v4.app.a$a$a */
        /* loaded from: classes.dex */
        public static class C0004a implements a {

            /* renamed from: b */
            public static a f7b;

            /* renamed from: a */
            private IBinder f8a;

            C0004a(IBinder iBinder) {
                this.f8a = iBinder;
            }

            @Override // android.support.v4.app.a
            public void A(String str, int i, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f8a.transact(1, obtain, null, 1) || AbstractBinderC0003a.o0() == null) {
                        return;
                    }
                    AbstractBinderC0003a.o0().A(str, i, str2, notification);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.app.a
            public void K(String str, int i, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (this.f8a.transact(2, obtain, null, 1) || AbstractBinderC0003a.o0() == null) {
                        return;
                    }
                    AbstractBinderC0003a.o0().K(str, i, str2);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f8a;
            }

            @Override // android.support.v4.app.a
            public void g(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    if (this.f8a.transact(3, obtain, null, 1) || AbstractBinderC0003a.o0() == null) {
                        return;
                    }
                    AbstractBinderC0003a.o0().g(str);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static a n0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0004a(iBinder) : (a) queryLocalInterface;
        }

        public static a o0() {
            return C0004a.f7b;
        }
    }

    void A(String str, int i, String str2, Notification notification);

    void K(String str, int i, String str2);

    void g(String str);
}
