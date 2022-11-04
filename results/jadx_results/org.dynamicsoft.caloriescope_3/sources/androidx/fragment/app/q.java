package androidx.fragment.app;

import a.g.l.u;
import a.g.l.w;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f955b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f956c;
        final /* synthetic */ ArrayList d;
        final /* synthetic */ ArrayList e;
        final /* synthetic */ ArrayList f;

        a(q qVar, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f955b = i;
            this.f956c = arrayList;
            this.d = arrayList2;
            this.e = arrayList3;
            this.f = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f955b; i++) {
                u.a((View) this.f956c.get(i), (String) this.d.get(i));
                u.a((View) this.e.get(i), (String) this.f.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f957b;

        /* renamed from: c */
        final /* synthetic */ Map f958c;

        b(q qVar, ArrayList arrayList, Map map) {
            this.f957b = arrayList;
            this.f958c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f957b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f957b.get(i);
                String v = u.v(view);
                if (v != null) {
                    u.a(view, q.a(this.f958c, v));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f959b;

        /* renamed from: c */
        final /* synthetic */ Map f960c;

        c(q qVar, ArrayList arrayList, Map map) {
            this.f959b = arrayList;
            this.f960c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f959b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f959b.get(i);
                u.a(view, (String) this.f960c.get(u.v(view)));
            }
        }
    }

    static String a(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void a(List<View> list, View view) {
        int size = list.size();
        if (a(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!a(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public static boolean a(List list) {
        return list == null || list.isEmpty();
    }

    private static boolean a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public abstract Object a(Object obj, Object obj2, Object obj3);

    public ArrayList<String> a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(u.v(view));
            u.a(view, (String) null);
        }
        return arrayList2;
    }

    public void a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    public void a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String v = u.v(view2);
            arrayList4.add(v);
            if (v != null) {
                u.a(view2, (String) null);
                String str = map.get(v);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        u.a(arrayList2.get(i2), v);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        a.g.l.r.a(view, new a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public void a(View view, ArrayList<View> arrayList, Map<String, String> map) {
        a.g.l.r.a(view, new b(this, arrayList, map));
    }

    public abstract void a(ViewGroup viewGroup, Object obj);

    public void a(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        a.g.l.r.a(viewGroup, new c(this, arrayList, map));
    }

    public abstract void a(Object obj, Rect rect);

    public abstract void a(Object obj, View view);

    public abstract void a(Object obj, View view, ArrayList<View> arrayList);

    public abstract void a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void a(Object obj, ArrayList<View> arrayList);

    public abstract void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public void a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean a2 = w.a(viewGroup2);
                viewGroup = viewGroup2;
                if (!a2) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        a(arrayList, viewGroup2.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup);
        }
    }

    public void a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String v = u.v(view);
            if (v != null) {
                map.put(v, view);
            }
            if (!(view instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                a(map, viewGroup.getChildAt(i));
            }
        }
    }

    public abstract boolean a(Object obj);

    public abstract Object b(Object obj);

    public abstract Object b(Object obj, Object obj2, Object obj3);

    public abstract void b(Object obj, View view);

    public abstract void b(Object obj, View view, ArrayList<View> arrayList);

    public abstract void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object c(Object obj);

    public abstract void c(Object obj, View view);
}
