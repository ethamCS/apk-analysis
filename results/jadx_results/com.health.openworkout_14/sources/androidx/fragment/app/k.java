package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
/* loaded from: classes.dex */
public class k implements LayoutInflater.Factory2 {

    /* renamed from: b */
    private final m f1069b;

    public k(m mVar) {
        this.f1069b = mVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (g.class.getName().equals(str)) {
            return new g(context, attributeSet, this.f1069b);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.k.c.f2633a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(b.k.c.f2634b);
        }
        int resourceId = obtainStyledAttributes.getResourceId(b.k.c.f2635c, -1);
        String string = obtainStyledAttributes.getString(b.k.c.f2636d);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !i.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f1069b.W(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f1069b.X(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.f1069b.W(id);
        }
        if (m.p0(2)) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + fragment);
        }
        if (fragment == null) {
            fragment = this.f1069b.e0().a(context.getClassLoader(), attributeValue);
            fragment.n = true;
            fragment.w = resourceId != 0 ? resourceId : id;
            fragment.x = id;
            fragment.y = string;
            fragment.o = true;
            m mVar = this.f1069b;
            fragment.s = mVar;
            j<?> jVar = mVar.o;
            fragment.t = jVar;
            fragment.u0(jVar.i(), attributeSet, fragment.f1013c);
            this.f1069b.d(fragment);
            this.f1069b.z0(fragment);
        } else if (fragment.o) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        } else {
            fragment.o = true;
            j<?> jVar2 = this.f1069b.o;
            fragment.t = jVar2;
            fragment.u0(jVar2.i(), attributeSet, fragment.f1013c);
        }
        m mVar2 = this.f1069b;
        if (mVar2.n >= 1 || !fragment.n) {
            mVar2.z0(fragment);
        } else {
            mVar2.A0(fragment, 1);
        }
        View view2 = fragment.H;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.H.getTag() == null) {
                fragment.H.setTag(string);
            }
            return fragment.H;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
