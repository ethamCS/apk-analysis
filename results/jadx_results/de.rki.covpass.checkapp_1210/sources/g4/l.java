package g4;

import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import l4.i;
@TargetApi(19)
/* loaded from: classes.dex */
public class l implements m, j {

    /* renamed from: d */
    private final String f10467d;

    /* renamed from: f */
    private final l4.i f10469f;

    /* renamed from: a */
    private final Path f10464a = new Path();

    /* renamed from: b */
    private final Path f10465b = new Path();

    /* renamed from: c */
    private final Path f10466c = new Path();

    /* renamed from: e */
    private final List<m> f10468e = new ArrayList();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10470a;

        static {
            int[] iArr = new int[i.a.values().length];
            f10470a = iArr;
            try {
                iArr[i.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10470a[i.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10470a[i.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10470a[i.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10470a[i.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(l4.i iVar) {
        this.f10467d = iVar.c();
        this.f10469f = iVar;
    }

    private void b() {
        for (int i10 = 0; i10 < this.f10468e.size(); i10++) {
            this.f10466c.addPath(this.f10468e.get(i10).l());
        }
    }

    @TargetApi(19)
    private void e(Path.Op op) {
        this.f10465b.reset();
        this.f10464a.reset();
        for (int size = this.f10468e.size() - 1; size >= 1; size--) {
            m mVar = this.f10468e.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                List<m> j10 = dVar.j();
                for (int size2 = j10.size() - 1; size2 >= 0; size2--) {
                    Path l10 = j10.get(size2).l();
                    l10.transform(dVar.k());
                    this.f10465b.addPath(l10);
                }
            } else {
                this.f10465b.addPath(mVar.l());
            }
        }
        m mVar2 = this.f10468e.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List<m> j11 = dVar2.j();
            for (int i10 = 0; i10 < j11.size(); i10++) {
                Path l11 = j11.get(i10).l();
                l11.transform(dVar2.k());
                this.f10464a.addPath(l11);
            }
        } else {
            this.f10464a.set(mVar2.l());
        }
        this.f10466c.op(this.f10464a, this.f10465b, op);
    }

    @Override // g4.c
    public void c(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < this.f10468e.size(); i10++) {
            this.f10468e.get(i10).c(list, list2);
        }
    }

    @Override // g4.j
    public void d(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c previous = listIterator.previous();
            if (previous instanceof m) {
                this.f10468e.add((m) previous);
                listIterator.remove();
            }
        }
    }

    @Override // g4.m
    public Path l() {
        Path.Op op;
        this.f10466c.reset();
        if (this.f10469f.d()) {
            return this.f10466c;
        }
        int i10 = a.f10470a[this.f10469f.b().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                op = Path.Op.UNION;
            } else if (i10 == 3) {
                op = Path.Op.REVERSE_DIFFERENCE;
            } else if (i10 == 4) {
                op = Path.Op.INTERSECT;
            } else if (i10 == 5) {
                op = Path.Op.XOR;
            }
            e(op);
        } else {
            b();
        }
        return this.f10466c;
    }
}
