package j$.time.temporal;
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements i {

    /* renamed from: a */
    public final /* synthetic */ int f13170a;

    public /* synthetic */ j(int i10) {
        this.f13170a = i10;
    }

    public final Temporal b(Temporal temporal) {
        int i10 = this.f13170a;
        int i11 = temporal.get(ChronoField.DAY_OF_WEEK);
        if (i11 == i10) {
            return temporal;
        }
        int i12 = i11 - i10;
        return temporal.i(i12 >= 0 ? 7 - i12 : -i12, ChronoUnit.DAYS);
    }
}
