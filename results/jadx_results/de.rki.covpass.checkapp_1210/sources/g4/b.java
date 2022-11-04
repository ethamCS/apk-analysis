package g4;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    private final List<u> f10401a = new ArrayList();

    public void a(u uVar) {
        this.f10401a.add(uVar);
    }

    public void b(Path path) {
        for (int size = this.f10401a.size() - 1; size >= 0; size--) {
            q4.h.b(path, this.f10401a.get(size));
        }
    }
}
