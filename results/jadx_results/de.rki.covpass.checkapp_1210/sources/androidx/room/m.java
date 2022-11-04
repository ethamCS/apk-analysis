package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.l;
/* loaded from: classes.dex */
public interface m extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements m {

        /* renamed from: androidx.room.m$a$a */
        /* loaded from: classes.dex */
        public static class C0062a implements m {

            /* renamed from: b */
            public static m f4961b;

            /* renamed from: a */
            private IBinder f4962a;

            C0062a(IBinder iBinder) {
                this.f4962a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4962a;
            }

            @Override // androidx.room.m
            public int b(l lVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
                    obtain.writeString(str);
                    if (!this.f4962a.transact(1, obtain, obtain2, 0) && a.f() != null) {
                        return a.f().b(lVar, str);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.room.m
            public void c(int i10, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i10);
                    obtain.writeStringArray(strArr);
                    if (this.f4962a.transact(3, obtain, null, 1) || a.f() == null) {
                        return;
                    }
                    a.f().c(i10, strArr);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static m e(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof m)) ? new C0062a(iBinder) : (m) queryLocalInterface;
        }

        public static m f() {
            return C0062a.f4961b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int b10 = b(l.a.e(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(b10);
                return true;
            } else if (i10 == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                d(l.a.e(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i10 == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                c(parcel.readInt(), parcel.createStringArray());
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
        }
    }

    int b(l lVar, String str);

    void c(int i10, String[] strArr);

    void d(l lVar, int i10);
}
