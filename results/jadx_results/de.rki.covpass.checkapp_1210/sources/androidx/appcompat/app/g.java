package androidx.appcompat.app;

import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
class g {

    /* renamed from: a */
    private final Deque<WeakReference<XmlPullParser>> f796a = new ArrayDeque();

    private static boolean b(XmlPullParser xmlPullParser) {
        if (xmlPullParser != null) {
            try {
                if (xmlPullParser.getEventType() == 3) {
                    return true;
                }
                return xmlPullParser.getEventType() == 1;
            } catch (XmlPullParserException unused) {
                return true;
            }
        }
        return true;
    }

    private static XmlPullParser c(Deque<WeakReference<XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = deque.peek().get();
            if (!b(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    private static boolean d(XmlPullParser xmlPullParser, XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() != 2) {
                return false;
            }
            return "include".equals(xmlPullParser2.getName());
        } catch (XmlPullParserException unused) {
            return false;
        }
    }

    public boolean a(AttributeSet attributeSet) {
        if (attributeSet instanceof XmlPullParser) {
            XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
            if (xmlPullParser.getDepth() != 1) {
                return false;
            }
            XmlPullParser c10 = c(this.f796a);
            this.f796a.push(new WeakReference<>(xmlPullParser));
            return d(xmlPullParser, c10);
        }
        return false;
    }
}
