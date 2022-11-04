package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.room.i0;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import m1.h;
/* loaded from: classes.dex */
public class j {

    /* renamed from: a */
    public final h.c f4918a;

    /* renamed from: b */
    public final Context f4919b;

    /* renamed from: c */
    public final String f4920c;

    /* renamed from: d */
    public final i0.d f4921d;

    /* renamed from: e */
    public final List<i0.b> f4922e;

    /* renamed from: f */
    public final List<Object> f4923f;

    /* renamed from: g */
    public final List<i1.a> f4924g;

    /* renamed from: h */
    public final boolean f4925h;

    /* renamed from: i */
    public final i0.c f4926i;

    /* renamed from: j */
    public final Executor f4927j;

    /* renamed from: k */
    public final Executor f4928k;

    /* renamed from: l */
    public final boolean f4929l;

    /* renamed from: m */
    public final Intent f4930m;

    /* renamed from: n */
    public final boolean f4931n;

    /* renamed from: o */
    public final boolean f4932o;

    /* renamed from: p */
    private final Set<Integer> f4933p;

    /* renamed from: q */
    public final String f4934q;

    /* renamed from: r */
    public final File f4935r;

    /* renamed from: s */
    public final Callable<InputStream> f4936s;

    @SuppressLint({"LambdaLast"})
    public j(Context context, String str, h.c cVar, i0.d dVar, List<i0.b> list, boolean z10, i0.c cVar2, Executor executor, Executor executor2, Intent intent, boolean z11, boolean z12, Set<Integer> set, String str2, File file, Callable<InputStream> callable, i0.e eVar, List<Object> list2, List<i1.a> list3) {
        this.f4918a = cVar;
        this.f4919b = context;
        this.f4920c = str;
        this.f4921d = dVar;
        this.f4922e = list;
        this.f4925h = z10;
        this.f4926i = cVar2;
        this.f4927j = executor;
        this.f4928k = executor2;
        this.f4930m = intent;
        this.f4929l = intent != null;
        this.f4931n = z11;
        this.f4932o = z12;
        this.f4933p = set;
        this.f4934q = str2;
        this.f4935r = file;
        this.f4936s = callable;
        this.f4923f = list2 == null ? Collections.emptyList() : list2;
        this.f4924g = list3 == null ? Collections.emptyList() : list3;
    }

    public boolean a(int i10, int i11) {
        Set<Integer> set;
        if (!(i10 > i11) || !this.f4932o) {
            return this.f4931n && ((set = this.f4933p) == null || !set.contains(Integer.valueOf(i10)));
        }
        return false;
    }
}
