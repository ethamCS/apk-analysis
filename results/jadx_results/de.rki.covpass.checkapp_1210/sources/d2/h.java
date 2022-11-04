package d2;

import androidx.work.WorkerParameters;
/* loaded from: classes.dex */
public class h implements Runnable {

    /* renamed from: c */
    private v1.i f8226c;

    /* renamed from: d */
    private String f8227d;

    /* renamed from: q */
    private WorkerParameters.a f8228q;

    public h(v1.i iVar, String str, WorkerParameters.a aVar) {
        this.f8226c = iVar;
        this.f8227d = str;
        this.f8228q = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f8226c.m().j(this.f8227d, this.f8228q);
    }
}
