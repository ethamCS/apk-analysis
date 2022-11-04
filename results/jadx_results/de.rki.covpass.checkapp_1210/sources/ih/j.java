package ih;
/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a */
    private i f12669a;

    protected abstract i a();

    public synchronized i b() {
        if (this.f12669a == null) {
            this.f12669a = a();
        }
        return this.f12669a;
    }
}
