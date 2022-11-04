package ce;

import java.util.Arrays;
import oe.m0;
import xc.h0;
/* loaded from: classes3.dex */
public final class e extends o<Character> {
    public e(char c10) {
        super(Character.valueOf(c10));
    }

    private final String c(char c10) {
        return c10 == '\b' ? "\\b" : c10 == '\t' ? "\\t" : c10 == '\n' ? "\\n" : c10 == '\f' ? "\\f" : c10 == '\r' ? "\\r" : e(c10) ? String.valueOf(c10) : "?";
    }

    private final boolean e(char c10) {
        byte type = (byte) Character.getType(c10);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    /* renamed from: d */
    public m0 a(h0 h0Var) {
        hc.t.e(h0Var, "module");
        m0 u10 = h0Var.x().u();
        hc.t.d(u10, "module.builtIns.charType");
        return u10;
    }

    @Override // ce.g
    public String toString() {
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(b().charValue()), c(b().charValue())}, 2));
        hc.t.d(format, "format(this, *args)");
        return format;
    }
}
