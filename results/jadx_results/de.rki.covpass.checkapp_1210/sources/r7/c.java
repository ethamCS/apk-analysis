package r7;

import android.content.SharedPreferences;
import hc.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import q7.h;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0015"}, d2 = {"Lr7/c;", "Lq7/h;", "Ltb/e0;", "clear", BuildConfig.FLAVOR, "value", "a", "()J", "b", "(J)V", "currentTime", "e", "c", "elapsedTime", "f", "d", "currentOffset", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "kronos-android_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class c implements h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final SharedPreferences f20489a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lr7/c$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "KEY_CURRENT_TIME", "Ljava/lang/String;", "KEY_ELAPSED_TIME", "KEY_OFFSET", "SHARED_PREFERENCES_NAME", "<init>", "()V", "kronos-android_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public c(SharedPreferences sharedPreferences) {
        t.e(sharedPreferences, "sharedPreferences");
        this.f20489a = sharedPreferences;
    }

    @Override // q7.h
    public long a() {
        return this.f20489a.getLong("com.lyft.kronos.cached_current_time", 0L);
    }

    @Override // q7.h
    public void b(long j10) {
        this.f20489a.edit().putLong("com.lyft.kronos.cached_current_time", j10).apply();
    }

    @Override // q7.h
    public void c(long j10) {
        this.f20489a.edit().putLong("com.lyft.kronos.cached_elapsed_time", j10).apply();
    }

    @Override // q7.h
    public void clear() {
        this.f20489a.edit().clear().apply();
    }

    @Override // q7.h
    public void d(long j10) {
        this.f20489a.edit().putLong("com.lyft.kronos.cached_offset", j10).apply();
    }

    @Override // q7.h
    public long e() {
        return this.f20489a.getLong("com.lyft.kronos.cached_elapsed_time", 0L);
    }

    @Override // q7.h
    public long f() {
        return this.f20489a.getLong("com.lyft.kronos.cached_offset", 0L);
    }
}
