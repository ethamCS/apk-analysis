package j$.time.format;

import j$.time.temporal.TemporalField;
import java.util.Iterator;
import java.util.Locale;
/* renamed from: j$.time.format.b */
/* loaded from: classes2.dex */
public final class C0486b extends B {

    /* renamed from: d */
    final /* synthetic */ A f13066d;

    public C0486b(A a10) {
        this.f13066d = a10;
    }

    @Override // j$.time.format.B
    public final String d(TemporalField temporalField, long j10, E e10, Locale locale) {
        return this.f13066d.a(j10, e10);
    }

    @Override // j$.time.format.B
    public final Iterator e(TemporalField temporalField, E e10, Locale locale) {
        return this.f13066d.b(e10);
    }
}
