package sd;

import hc.t;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nc.g;
import ub.c0;
import ub.k0;
import ub.v;
/* loaded from: classes.dex */
public final class a extends td.a {
    public static final C0369a Companion = new C0369a(null);

    /* renamed from: f */
    public static final a f21656f = new a(1, 0, 7);

    /* renamed from: g */
    public static final a f21657g = new a(new int[0]);

    /* renamed from: sd.a$a */
    /* loaded from: classes.dex */
    public static final class C0369a {
        private C0369a() {
        }

        public /* synthetic */ C0369a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(InputStream inputStream) {
            int s10;
            int[] E0;
            t.e(inputStream, "stream");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            g gVar = new g(1, dataInputStream.readInt());
            s10 = v.s(gVar, 10);
            ArrayList arrayList = new ArrayList(s10);
            Iterator<Integer> it = gVar.iterator();
            while (it.hasNext()) {
                ((k0) it).b();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            E0 = c0.E0(arrayList);
            return new a(Arrays.copyOf(E0, E0.length));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        t.e(iArr, "numbers");
    }

    public boolean h() {
        return f(f21656f);
    }
}
