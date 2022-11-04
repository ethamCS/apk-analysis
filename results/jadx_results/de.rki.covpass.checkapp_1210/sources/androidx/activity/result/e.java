package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: c */
    private final IntentSender f630c;

    /* renamed from: d */
    private final Intent f631d;

    /* renamed from: q */
    private final int f632q;

    /* renamed from: x */
    private final int f633x;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<e> {
        a() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        /* renamed from: b */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private IntentSender f634a;

        /* renamed from: b */
        private Intent f635b;

        /* renamed from: c */
        private int f636c;

        /* renamed from: d */
        private int f637d;

        public b(IntentSender intentSender) {
            this.f634a = intentSender;
        }

        public e a() {
            return new e(this.f634a, this.f635b, this.f636c, this.f637d);
        }

        public b b(Intent intent) {
            this.f635b = intent;
            return this;
        }

        public b c(int i10, int i11) {
            this.f637d = i10;
            this.f636c = i11;
            return this;
        }
    }

    e(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f630c = intentSender;
        this.f631d = intent;
        this.f632q = i10;
        this.f633x = i11;
    }

    e(Parcel parcel) {
        this.f630c = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f631d = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f632q = parcel.readInt();
        this.f633x = parcel.readInt();
    }

    public Intent a() {
        return this.f631d;
    }

    public int c() {
        return this.f632q;
    }

    public int d() {
        return this.f633x;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IntentSender e() {
        return this.f630c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f630c, i10);
        parcel.writeParcelable(this.f631d, i10);
        parcel.writeInt(this.f632q);
        parcel.writeInt(this.f633x);
    }
}
