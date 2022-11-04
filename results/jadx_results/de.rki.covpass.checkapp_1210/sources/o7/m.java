package o7;
/* loaded from: classes.dex */
public class m extends g {

    /* renamed from: c */
    private boolean f17635c = true;

    public m(h6.o oVar) {
        super(oVar);
    }

    @Override // o7.g
    protected h6.c e(h6.j jVar) {
        if (this.f17635c) {
            this.f17635c = false;
            return new h6.c(new o6.j(jVar.e()));
        }
        this.f17635c = true;
        return new h6.c(new o6.j(jVar));
    }
}
