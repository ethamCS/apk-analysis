package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a */
    final a f4790a;

    /* loaded from: classes.dex */
    public interface a {
        void a(a.b bVar);

        a.b b(int i10, int i11, int i12, Object obj);
    }

    public h(a aVar) {
        this.f4790a = aVar;
    }

    private int a(List<a.b> list) {
        boolean z10 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f4668a != 8) {
                z10 = true;
            } else if (z10) {
                return size;
            }
        }
        return -1;
    }

    private void c(List<a.b> list, int i10, a.b bVar, int i11, a.b bVar2) {
        int i12 = bVar.f4671d;
        int i13 = bVar2.f4669b;
        int i14 = i12 < i13 ? -1 : 0;
        int i15 = bVar.f4669b;
        if (i15 < i13) {
            i14++;
        }
        if (i13 <= i15) {
            bVar.f4669b = i15 + bVar2.f4671d;
        }
        int i16 = bVar2.f4669b;
        if (i16 <= i12) {
            bVar.f4671d = i12 + bVar2.f4671d;
        }
        bVar2.f4669b = i16 + i14;
        list.set(i10, bVar2);
        list.set(i11, bVar);
    }

    private void d(List<a.b> list, int i10, int i11) {
        a.b bVar = list.get(i10);
        a.b bVar2 = list.get(i11);
        int i12 = bVar2.f4668a;
        if (i12 == 1) {
            c(list, i10, bVar, i11, bVar2);
        } else if (i12 == 2) {
            e(list, i10, bVar, i11, bVar2);
        } else if (i12 != 4) {
        } else {
            f(list, i10, bVar, i11, bVar2);
        }
    }

    public void b(List<a.b> list) {
        while (true) {
            int a10 = a(list);
            if (a10 != -1) {
                d(list, a10, a10 + 1);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
        if (r0 > r14.f4669b) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c8, code lost:
        if (r0 >= r14.f4669b) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ca, code lost:
        r12.f4671d = r0 - r14.f4671d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cf, code lost:
        r10.set(r11, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d6, code lost:
        if (r12.f4669b == r12.f4671d) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d8, code lost:
        r10.set(r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00dc, code lost:
        r10.remove(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00df, code lost:
        if (r6 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e1, code lost:
        r10.add(r11, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e4, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void e(java.util.List<androidx.recyclerview.widget.a.b> r10, int r11, androidx.recyclerview.widget.a.b r12, int r13, androidx.recyclerview.widget.a.b r14) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.h.e(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
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
            int r0 = r11.f4671d
            int r1 = r13.f4669b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto Ld
            int r1 = r1 - r4
            r13.f4669b = r1
            goto L20
        Ld:
            int r5 = r13.f4671d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r4
            r13.f4671d = r5
            androidx.recyclerview.widget.h$a r0 = r8.f4790a
            int r1 = r11.f4669b
            java.lang.Object r5 = r13.f4670c
            androidx.recyclerview.widget.a$b r0 = r0.b(r2, r1, r4, r5)
            goto L21
        L20:
            r0 = r3
        L21:
            int r1 = r11.f4669b
            int r5 = r13.f4669b
            if (r1 > r5) goto L2b
            int r5 = r5 + r4
            r13.f4669b = r5
            goto L41
        L2b:
            int r6 = r13.f4671d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.h$a r3 = r8.f4790a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f4670c
            androidx.recyclerview.widget.a$b r3 = r3.b(r2, r1, r5, r4)
            int r1 = r13.f4671d
            int r1 = r1 - r5
            r13.f4671d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f4671d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.h$a r11 = r8.f4790a
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.h.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
