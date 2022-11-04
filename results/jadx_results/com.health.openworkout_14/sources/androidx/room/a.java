package androidx.room;

import android.content.Context;
import androidx.room.j;
import b.o.a.c;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    public final c.AbstractC0060c f1835a;

    /* renamed from: b */
    public final Context f1836b;

    /* renamed from: c */
    public final String f1837c;

    /* renamed from: d */
    public final j.d f1838d;

    /* renamed from: e */
    public final List<j.b> f1839e;

    /* renamed from: f */
    public final boolean f1840f;

    /* renamed from: g */
    public final j.c f1841g;

    /* renamed from: h */
    public final Executor f1842h;
    public final Executor i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    private final Set<Integer> m;

    public a(Context context, String str, c.AbstractC0060c abstractC0060c, j.d dVar, List<j.b> list, boolean z, j.c cVar, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this.f1835a = abstractC0060c;
        this.f1836b = context;
        this.f1837c = str;
        this.f1838d = dVar;
        this.f1839e = list;
        this.f1840f = z;
        this.f1841g = cVar;
        this.f1842h = executor;
        this.i = executor2;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = set;
    }

    public boolean a(int i, int i2) {
        Set<Integer> set;
        return (!(i > i2) || !this.l) && this.k && ((set = this.m) == null || !set.contains(Integer.valueOf(i)));
    }
}
