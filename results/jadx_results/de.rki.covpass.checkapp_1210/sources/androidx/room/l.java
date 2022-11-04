package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public interface l extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements l {

        /* renamed from: androidx.room.l$a$a */
        /* loaded from: classes.dex */
        public static class C0061a implements l {

            /* renamed from: b */
            public static l f4954b;

            /* renamed from: a */
            private IBinder f4955a;

            C0061a(IBinder iBinder) {
                this.f4955a = iBinder;
            }

            @Override // androidx.room.l
            public void a(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    if (this.f4955a.transact(1, obtain, null, 1) || a.f() == null) {
                        return;
                    }
                    a.f().a(strArr);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4955a;
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static l e(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof l)) ? new C0061a(iBinder) : (l) queryLocalInterface;
        }

        public static l f() {
            return C0061a.f4954b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                a(parcel.createStringArray());
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
        }
    }

    void a(String[] strArr);
}
