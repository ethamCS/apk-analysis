package a.i.b;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* loaded from: classes.dex */
class b {

    /* loaded from: classes.dex */
    public interface a<T> {
        void a(T t, Rect rect);
    }

    /* renamed from: a.i.b.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0021b<T, V> {
        int a(T t);

        V a(T t, int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c<T> implements Comparator<T> {

        /* renamed from: b */
        private final Rect f310b = new Rect();

        /* renamed from: c */
        private final Rect f311c = new Rect();
        private final boolean d;
        private final a<T> e;

        c(boolean z, a<T> aVar) {
            this.d = z;
            this.e = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            Rect rect = this.f310b;
            Rect rect2 = this.f311c;
            this.e.a(t, rect);
            this.e.a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                return this.d ? 1 : -1;
            } else if (i3 > i4) {
                return this.d ? -1 : 1;
            } else {
                int i5 = rect.bottom;
                int i6 = rect2.bottom;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                int i7 = rect.right;
                int i8 = rect2.right;
                if (i7 < i8) {
                    return this.d ? 1 : -1;
                } else if (i7 <= i8) {
                    return 0;
                } else {
                    return this.d ? -1 : 1;
                }
            }
        }
    }

    private static int a(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    public static <L, T> T a(L l, AbstractC0021b<L, T> abstractC0021b, a<T> aVar, T t, int i, boolean z, boolean z2) {
        int a2 = abstractC0021b.a(l);
        ArrayList arrayList = new ArrayList(a2);
        for (int i2 = 0; i2 < a2; i2++) {
            arrayList.add(abstractC0021b.a(l, i2));
        }
        Collections.sort(arrayList, new c(z, aVar));
        if (i != 1) {
            if (i != 2) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
            }
            return (T) a(t, arrayList, z2);
        }
        return (T) b(t, arrayList, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <L, T> T a(L r7, a.i.b.b.AbstractC0021b<L, T> r8, a.i.b.b.a<T> r9, T r10, android.graphics.Rect r11, int r12) {
        /*
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r11)
            r1 = 17
            r2 = 0
            if (r12 == r1) goto L38
            r1 = 33
            if (r12 == r1) goto L2e
            r1 = 66
            if (r12 == r1) goto L26
            r1 = 130(0x82, float:1.82E-43)
            if (r12 != r1) goto L1e
            int r1 = r11.height()
            int r1 = r1 + 1
            int r1 = -r1
            goto L34
        L1e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r7.<init>(r8)
            throw r7
        L26:
            int r1 = r11.width()
            int r1 = r1 + 1
            int r1 = -r1
            goto L3e
        L2e:
            int r1 = r11.height()
            int r1 = r1 + 1
        L34:
            r0.offset(r2, r1)
            goto L41
        L38:
            int r1 = r11.width()
            int r1 = r1 + 1
        L3e:
            r0.offset(r1, r2)
        L41:
            r1 = 0
            int r3 = r8.a(r7)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
        L4b:
            if (r2 >= r3) goto L64
            java.lang.Object r5 = r8.a(r7, r2)
            if (r5 != r10) goto L54
            goto L61
        L54:
            r9.a(r5, r4)
            boolean r6 = b(r12, r11, r4, r0)
            if (r6 == 0) goto L61
            r0.set(r4)
            r1 = r5
        L61:
            int r2 = r2 + 1
            goto L4b
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.b.b.a(java.lang.Object, a.i.b.b$b, a.i.b.b$a, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    }

    private static <T> T a(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int lastIndexOf = (t == null ? -1 : arrayList.lastIndexOf(t)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (z && size > 0) {
            return arrayList.get(0);
        }
        return null;
    }

    private static boolean a(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    private static boolean a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean a2 = a(i, rect, rect2);
        if (a(i, rect, rect3) || !a2) {
            return false;
        }
        return !b(i, rect, rect3) || i == 17 || i == 66 || c(i, rect, rect2) < e(i, rect, rect3);
    }

    private static boolean a(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        } else if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        }
    }

    private static <T> T b(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int indexOf = (t == null ? size : arrayList.indexOf(t)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (z && size > 0) {
            return arrayList.get(size - 1);
        }
        return null;
    }

    private static boolean b(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            return rect.left >= rect2.right;
        } else if (i == 33) {
            return rect.top >= rect2.bottom;
        } else if (i == 66) {
            return rect.right <= rect2.left;
        } else if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            return rect.bottom <= rect2.top;
        }
    }

    private static boolean b(int i, Rect rect, Rect rect2, Rect rect3) {
        if (!a(rect, rect2, i)) {
            return false;
        }
        if (!a(rect, rect3, i) || a(i, rect, rect2, rect3)) {
            return true;
        }
        return !a(i, rect, rect3, rect2) && a(c(i, rect, rect2), g(i, rect, rect2)) < a(c(i, rect, rect3), g(i, rect, rect3));
    }

    private static int c(int i, Rect rect, Rect rect2) {
        return Math.max(0, d(i, rect, rect2));
    }

    private static int d(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return i2 - i3;
    }

    private static int e(int i, Rect rect, Rect rect2) {
        return Math.max(1, f(i, rect, rect2));
    }

    private static int f(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        }
        return i2 - i3;
    }

    private static int g(int i, Rect rect, Rect rect2) {
        int height;
        int i2;
        int height2;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = rect.left + (rect.width() / 2);
            i2 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - (i2 + (height2 / 2)));
        }
        height = rect.top + (rect.height() / 2);
        i2 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - (i2 + (height2 / 2)));
    }
}
