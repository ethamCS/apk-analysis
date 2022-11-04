package d.a.c.c;

import android.annotation.TargetApi;
import android.view.PointerIcon;
import io.flutter.embedding.engine.i.g;
import java.util.HashMap;
@TargetApi(24)
/* loaded from: classes.dex */
public class a {

    /* renamed from: c */
    private static HashMap<String, Integer> f717c;

    /* renamed from: a */
    private final c f718a;

    /* renamed from: b */
    private final g f719b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d.a.c.c.a$a */
    /* loaded from: classes.dex */
    public class C0042a implements g.b {
        C0042a() {
            a.this = r1;
        }

        @Override // io.flutter.embedding.engine.i.g.b
        public void a(String str) {
            a.this.f718a.setPointerIcon(a.this.d(str));
        }
    }

    /* loaded from: classes.dex */
    public class b extends HashMap<String, Integer> {
        b(a aVar) {
            put("alias", 1010);
            put("allScroll", 1013);
            put("basic", 1000);
            put("cell", 1006);
            put("click", 1002);
            put("contextMenu", 1001);
            put("copy", 1011);
            put("forbidden", 1012);
            put("grab", 1020);
            put("grabbing", 1021);
            put("help", 1003);
            put("move", 1013);
            put("none", 0);
            put("noDrop", 1012);
            put("precise", 1007);
            put("text", 1008);
            put("resizeColumn", 1014);
            put("resizeDown", 1015);
            put("resizeUpLeft", 1016);
            put("resizeDownRight", 1017);
            put("resizeLeft", 1014);
            put("resizeLeftRight", 1014);
            put("resizeRight", 1014);
            put("resizeRow", 1015);
            put("resizeUp", 1015);
            put("resizeUpDown", 1015);
            put("resizeUpLeft", 1017);
            put("resizeUpRight", 1016);
            put("resizeUpLeftDownRight", 1017);
            put("resizeUpRightDownLeft", 1016);
            put("verticalText", 1009);
            put("wait", 1004);
            put("zoomIn", 1018);
            put("zoomOut", 1019);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        PointerIcon a(int i);

        void setPointerIcon(PointerIcon pointerIcon);
    }

    public a(c cVar, g gVar) {
        this.f718a = cVar;
        this.f719b = gVar;
        gVar.b(new C0042a());
    }

    public PointerIcon d(String str) {
        if (f717c == null) {
            f717c = new b(this);
        }
        return this.f718a.a(f717c.getOrDefault(str, 1000).intValue());
    }

    public void c() {
        this.f719b.b(null);
    }
}
