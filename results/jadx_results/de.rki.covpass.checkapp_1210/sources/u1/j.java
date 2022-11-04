package u1;
/* loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends j {
        a() {
        }

        @Override // u1.j
        public i a(String str) {
            return null;
        }
    }

    public static j c() {
        return new a();
    }

    public abstract i a(String str);

    public final i b(String str) {
        i a10 = a(str);
        return a10 == null ? i.a(str) : a10;
    }
}
