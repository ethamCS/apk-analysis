package mc;

import hc.t;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lmc/a;", "Llc/a;", "Ljava/util/Random;", "e", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a extends lc.a {
    @Override // lc.a
    public Random e() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        t.d(current, "current()");
        return current;
    }
}
