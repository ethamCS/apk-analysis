package j$.util;

import java.util.Objects;
import org.conscrypt.BuildConfig;
/* loaded from: classes2.dex */
public final class V {

    /* renamed from: a */
    private final String f13275a;

    /* renamed from: b */
    private final String f13276b;

    /* renamed from: c */
    private final String f13277c;

    /* renamed from: d */
    private StringBuilder f13278d;

    /* renamed from: e */
    private String f13279e;

    public V(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        Objects.requireNonNull(charSequence2, "The prefix must not be null");
        Objects.requireNonNull(charSequence, "The delimiter must not be null");
        Objects.requireNonNull(charSequence3, "The suffix must not be null");
        String charSequence4 = charSequence2.toString();
        this.f13275a = charSequence4;
        this.f13276b = charSequence.toString();
        String charSequence5 = charSequence3.toString();
        this.f13277c = charSequence5;
        this.f13279e = charSequence4 + charSequence5;
    }

    private StringBuilder c() {
        StringBuilder sb2 = this.f13278d;
        if (sb2 != null) {
            sb2.append(this.f13276b);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f13275a);
            this.f13278d = sb3;
        }
        return this.f13278d;
    }

    public final V a(CharSequence charSequence) {
        c().append(charSequence);
        return this;
    }

    public final V b(V v10) {
        Objects.requireNonNull(v10);
        StringBuilder sb2 = v10.f13278d;
        if (sb2 != null) {
            c().append((CharSequence) v10.f13278d, v10.f13275a.length(), sb2.length());
        }
        return this;
    }

    public final String toString() {
        if (this.f13278d == null) {
            return this.f13279e;
        }
        if (this.f13277c.equals(BuildConfig.FLAVOR)) {
            return this.f13278d.toString();
        }
        int length = this.f13278d.length();
        StringBuilder sb2 = this.f13278d;
        sb2.append(this.f13277c);
        String sb3 = sb2.toString();
        this.f13278d.setLength(length);
        return sb3;
    }
}
