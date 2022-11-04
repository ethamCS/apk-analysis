package b.o.a;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
/* loaded from: classes.dex */
public interface b extends Closeable {
    void B();

    f D(String str);

    Cursor G(e eVar);

    Cursor V(String str);

    String X();

    Cursor Z(e eVar, CancellationSignal cancellationSignal);

    boolean b0();

    void g();

    void h();

    boolean isOpen();

    List<Pair<String, String>> p();

    void r(boolean z);

    void t(String str);
}
