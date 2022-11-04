package cg;

import bf.w;
import bf.x;
import bf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.t;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0004BG\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0013"}, d2 = {"Lcg/e;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "clientOriginated", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", "equals", "perMessageDeflate", "clientMaxWindowBits", "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", "<init>", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e {
    public static final a Companion = new a(null);

    /* renamed from: a */
    public final boolean f6532a;

    /* renamed from: b */
    public final Integer f6533b;

    /* renamed from: c */
    public final boolean f6534c;

    /* renamed from: d */
    public final Integer f6535d;

    /* renamed from: e */
    public final boolean f6536e;

    /* renamed from: f */
    public final boolean f6537f;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcg/e$a;", BuildConfig.FLAVOR, "Lof/t;", "responseHeaders", "Lcg/e;", "a", BuildConfig.FLAVOR, "HEADER_WEB_SOCKET_EXTENSION", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(t tVar) {
            boolean v10;
            boolean v11;
            boolean v12;
            Integer l10;
            boolean v13;
            boolean v14;
            Integer l11;
            boolean v15;
            hc.t.e(tVar, "responseHeaders");
            int size = tVar.size();
            int i10 = 0;
            boolean z10 = false;
            Integer num = null;
            boolean z11 = false;
            Integer num2 = null;
            boolean z12 = false;
            boolean z13 = false;
            while (i10 < size) {
                int i11 = i10 + 1;
                v10 = x.v(tVar.b(i10), "Sec-WebSocket-Extensions", true);
                if (v10) {
                    String i12 = tVar.i(i10);
                    int i13 = 0;
                    while (i13 < i12.length()) {
                        int r10 = pf.d.r(i12, ',', i13, 0, 4, null);
                        int p10 = pf.d.p(i12, ';', i13, r10);
                        String Y = pf.d.Y(i12, i13, p10);
                        int i14 = p10 + 1;
                        v11 = x.v(Y, "permessage-deflate", true);
                        if (v11) {
                            if (z10) {
                                z13 = true;
                            }
                            i13 = i14;
                            while (i13 < r10) {
                                int p11 = pf.d.p(i12, ';', i13, r10);
                                int p12 = pf.d.p(i12, '=', i13, p11);
                                String Y2 = pf.d.Y(i12, i13, p12);
                                String r02 = p12 < p11 ? y.r0(pf.d.Y(i12, p12 + 1, p11), "\"") : null;
                                i13 = p11 + 1;
                                v12 = x.v(Y2, "client_max_window_bits", true);
                                if (v12) {
                                    if (num != null) {
                                        z13 = true;
                                    }
                                    if (r02 == null) {
                                        num = null;
                                    } else {
                                        l10 = w.l(r02);
                                        num = l10;
                                    }
                                    if (num == null) {
                                        z13 = true;
                                    }
                                } else {
                                    v13 = x.v(Y2, "client_no_context_takeover", true);
                                    if (v13) {
                                        if (z11) {
                                            z13 = true;
                                        }
                                        if (r02 != null) {
                                            z13 = true;
                                        }
                                        z11 = true;
                                    } else {
                                        v14 = x.v(Y2, "server_max_window_bits", true);
                                        if (v14) {
                                            if (num2 != null) {
                                                z13 = true;
                                            }
                                            if (r02 == null) {
                                                num2 = null;
                                            } else {
                                                l11 = w.l(r02);
                                                num2 = l11;
                                            }
                                            if (num2 == null) {
                                                z13 = true;
                                            }
                                        } else {
                                            v15 = x.v(Y2, "server_no_context_takeover", true);
                                            if (v15) {
                                                if (z12) {
                                                    z13 = true;
                                                }
                                                if (r02 != null) {
                                                    z13 = true;
                                                }
                                                z12 = true;
                                            } else {
                                                z13 = true;
                                            }
                                        }
                                    }
                                }
                            }
                            z10 = true;
                        } else {
                            i13 = i14;
                            z13 = true;
                        }
                    }
                }
                i10 = i11;
            }
            return new e(z10, num, z11, num2, z12, z13);
        }
    }

    public e() {
        this(false, null, false, null, false, false, 63, null);
    }

    public e(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13) {
        this.f6532a = z10;
        this.f6533b = num;
        this.f6534c = z11;
        this.f6535d = num2;
        this.f6536e = z12;
        this.f6537f = z13;
    }

    public /* synthetic */ e(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? false : z11, (i10 & 8) == 0 ? num2 : null, (i10 & 16) != 0 ? false : z12, (i10 & 32) != 0 ? false : z13);
    }

    public final boolean a(boolean z10) {
        return z10 ? this.f6534c : this.f6536e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f6532a == eVar.f6532a && hc.t.a(this.f6533b, eVar.f6533b) && this.f6534c == eVar.f6534c && hc.t.a(this.f6535d, eVar.f6535d) && this.f6536e == eVar.f6536e && this.f6537f == eVar.f6537f;
    }

    public int hashCode() {
        boolean z10 = this.f6532a;
        int i10 = 1;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int i13 = i11 * 31;
        Integer num = this.f6533b;
        int i14 = 0;
        int hashCode = (i13 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z11 = this.f6534c;
        if (z11) {
            z11 = true;
        }
        int i15 = z11 ? 1 : 0;
        int i16 = z11 ? 1 : 0;
        int i17 = (hashCode + i15) * 31;
        Integer num2 = this.f6535d;
        if (num2 != null) {
            i14 = num2.hashCode();
        }
        int i18 = (i17 + i14) * 31;
        boolean z12 = this.f6536e;
        if (z12) {
            z12 = true;
        }
        int i19 = z12 ? 1 : 0;
        int i20 = z12 ? 1 : 0;
        int i21 = (i18 + i19) * 31;
        boolean z13 = this.f6537f;
        if (!z13) {
            i10 = z13 ? 1 : 0;
        }
        return i21 + i10;
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f6532a + ", clientMaxWindowBits=" + this.f6533b + ", clientNoContextTakeover=" + this.f6534c + ", serverMaxWindowBits=" + this.f6535d + ", serverNoContextTakeover=" + this.f6536e + ", unknownValues=" + this.f6537f + ')';
    }
}
