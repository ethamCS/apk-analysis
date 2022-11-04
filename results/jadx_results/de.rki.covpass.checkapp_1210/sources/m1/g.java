package m1;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
/* loaded from: classes.dex */
public interface g extends Closeable {
    List<Pair<String, String>> C();

    void C0();

    void F0(String str, Object[] objArr);

    void H(String str);

    void H0();

    Cursor J(j jVar);

    Cursor R(j jVar, CancellationSignal cancellationSignal);

    k T(String str);

    Cursor Y0(String str);

    boolean isOpen();

    String l();

    boolean n0();

    void q();

    void t();

    boolean x0();
}
