package j$.time.format;

import java.text.ParsePosition;
import java.util.Iterator;
import java.util.Set;
import org.conscrypt.BuildConfig;
/* loaded from: classes2.dex */
class p {

    /* renamed from: a */
    protected String f13094a;

    /* renamed from: b */
    protected String f13095b;

    /* renamed from: c */
    protected char f13096c;

    /* renamed from: d */
    protected p f13097d;

    /* renamed from: e */
    protected p f13098e;

    private p(String str, String str2, p pVar) {
        this.f13094a = str;
        this.f13095b = str2;
        this.f13097d = pVar;
        this.f13096c = str.length() == 0 ? (char) 65535 : this.f13094a.charAt(0);
    }

    public /* synthetic */ p(String str, String str2, p pVar, C0486b c0486b) {
        this(str, str2, pVar);
    }

    private boolean b(String str, String str2) {
        int i10 = 0;
        while (i10 < str.length() && i10 < this.f13094a.length() && c(str.charAt(i10), this.f13094a.charAt(i10))) {
            i10++;
        }
        if (i10 != this.f13094a.length()) {
            p e10 = e(this.f13094a.substring(i10), this.f13095b, this.f13097d);
            this.f13094a = str.substring(0, i10);
            this.f13097d = e10;
            if (i10 < str.length()) {
                this.f13097d.f13098e = e(str.substring(i10), str2, null);
                this.f13095b = null;
            } else {
                this.f13095b = str2;
            }
            return true;
        } else if (i10 >= str.length()) {
            this.f13095b = str2;
            return true;
        } else {
            String substring = str.substring(i10);
            for (p pVar = this.f13097d; pVar != null; pVar = pVar.f13098e) {
                if (c(pVar.f13096c, substring.charAt(0))) {
                    return pVar.b(substring, str2);
                }
            }
            p e11 = e(substring, str2, null);
            e11.f13098e = this.f13097d;
            this.f13097d = e11;
            return true;
        }
    }

    public static p f(x xVar) {
        return xVar.k() ? new p(BuildConfig.FLAVOR, null, null) : new o();
    }

    public static p g(Set set, x xVar) {
        p f10 = f(xVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            f10.b(str, str);
        }
        return f10;
    }

    public final boolean a(String str, String str2) {
        return b(str, str2);
    }

    protected boolean c(char c10, char c11) {
        return c10 == c11;
    }

    public final String d(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!h(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f13094a.length() + index;
        p pVar = this.f13097d;
        if (pVar != null && length2 != length) {
            while (true) {
                if (!c(pVar.f13096c, charSequence.charAt(length2))) {
                    pVar = pVar.f13098e;
                    if (pVar == null) {
                        break;
                    }
                } else {
                    parsePosition.setIndex(length2);
                    String d10 = pVar.d(charSequence, parsePosition);
                    if (d10 != null) {
                        return d10;
                    }
                }
            }
        }
        parsePosition.setIndex(length2);
        return this.f13095b;
    }

    protected p e(String str, String str2, p pVar) {
        return new p(str, str2, pVar);
    }

    protected boolean h(CharSequence charSequence, int i10, int i11) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f13094a, i10);
        }
        int length = this.f13094a.length();
        if (length > i11 - i10) {
            return false;
        }
        int i12 = 0;
        while (true) {
            int i13 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i14 = i12 + 1;
            int i15 = i10 + 1;
            if (!c(this.f13094a.charAt(i12), charSequence.charAt(i10))) {
                return false;
            }
            i10 = i15;
            length = i13;
            i12 = i14;
        }
    }
}
