package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;
/* loaded from: classes.dex */
public class p {

    /* renamed from: a */
    final a f1802a;

    /* loaded from: classes.dex */
    public interface a {
        void a(a.b bVar);

        a.b b(int i, int i2, int i3, Object obj);
    }

    public p(a aVar) {
        this.f1802a = aVar;
    }

    private int a(List<a.b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f1658a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    private void c(List<a.b> list, int i, a.b bVar, int i2, a.b bVar2) {
        int i3 = bVar.f1661d;
        int i4 = bVar2.f1659b;
        int i5 = i3 < i4 ? -1 : 0;
        int i6 = bVar.f1659b;
        if (i6 < i4) {
            i5++;
        }
        if (i4 <= i6) {
            bVar.f1659b = i6 + bVar2.f1661d;
        }
        int i7 = bVar2.f1659b;
        if (i7 <= i3) {
            bVar.f1661d = i3 + bVar2.f1661d;
        }
        bVar2.f1659b = i7 + i5;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    private void d(List<a.b> list, int i, int i2) {
        a.b bVar = list.get(i);
        a.b bVar2 = list.get(i2);
        int i3 = bVar2.f1658a;
        if (i3 == 1) {
            c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            e(list, i, bVar, i2, bVar2);
        } else if (i3 != 4) {
        } else {
            f(list, i, bVar, i2, bVar2);
        }
    }

    public void b(List<a.b> list) {
        while (true) {
            int a2 = a(list);
            if (a2 != -1) {
                d(list, a2, a2 + 1);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
        if (r0 > r14.f1659b) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c7, code lost:
        if (r0 >= r14.f1659b) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c9, code lost:
        r12.f1661d = r0 - r14.f1661d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ce, code lost:
        r10.set(r11, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d5, code lost:
        if (r12.f1659b == r12.f1661d) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d7, code lost:
        r10.set(r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00db, code lost:
        r10.remove(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00de, code lost:
        if (r6 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e0, code lost:
        r10.add(r11, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e3, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void e(java.util.List<androidx.recyclerview.widget.a.b> r10, int r11, androidx.recyclerview.widget.a.b r12, int r13, androidx.recyclerview.widget.a.b r14) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.p.e(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void f(java.util.List<androidx.recyclerview.widget.a.b> r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f1661d
            int r1 = r13.f1659b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto Ld
            int r1 = r1 - r4
            r13.f1659b = r1
            goto L20
        Ld:
            int r5 = r13.f1661d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r4
            r13.f1661d = r5
            androidx.recyclerview.widget.p$a r0 = r8.f1802a
            int r1 = r11.f1659b
            java.lang.Object r5 = r13.f1660c
            androidx.recyclerview.widget.a$b r0 = r0.b(r2, r1, r4, r5)
            goto L21
        L20:
            r0 = r3
        L21:
            int r1 = r11.f1659b
            int r5 = r13.f1659b
            if (r1 > r5) goto L2b
            int r5 = r5 + r4
            r13.f1659b = r5
            goto L41
        L2b:
            int r6 = r13.f1661d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.p$a r3 = r8.f1802a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f1660c
            androidx.recyclerview.widget.a$b r3 = r3.b(r2, r1, r5, r4)
            int r1 = r13.f1661d
            int r1 = r1 - r5
            r13.f1661d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f1661d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.p$a r11 = r8.f1802a
            r11.a(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r3 == 0) goto L5e
            r9.add(r10, r3)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.p.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
