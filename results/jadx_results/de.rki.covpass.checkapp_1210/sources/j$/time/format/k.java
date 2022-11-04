package j$.time.format;

import j$.time.AbstractC0484a;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.conscrypt.BuildConfig;
/* loaded from: classes2.dex */
public final class k implements g {

    /* renamed from: c */
    private static final ConcurrentHashMap f13077c = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: a */
    private final FormatStyle f13078a;

    /* renamed from: b */
    private final FormatStyle f13079b;

    public k(FormatStyle formatStyle, FormatStyle formatStyle2) {
        this.f13078a = formatStyle;
        this.f13079b = formatStyle2;
    }

    private DateTimeFormatter a(Locale locale, j$.time.chrono.e eVar) {
        String str = "ISO|" + locale.toString() + '|' + this.f13078a + this.f13079b;
        DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) f13077c.get(str);
        if (dateTimeFormatter == null) {
            FormatStyle formatStyle = this.f13078a;
            FormatStyle formatStyle2 = this.f13079b;
            int i10 = DateTimeFormatterBuilder.f13045i;
            if (formatStyle == null && formatStyle2 == null) {
                throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
            }
            DateFormat dateInstance = formatStyle2 == null ? DateFormat.getDateInstance(formatStyle.ordinal(), locale) : formatStyle == null ? DateFormat.getTimeInstance(formatStyle2.ordinal(), locale) : DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
            if (dateInstance instanceof SimpleDateFormat) {
                String pattern = ((SimpleDateFormat) dateInstance).toPattern();
                if (pattern == null) {
                    pattern = null;
                } else {
                    int i11 = 0;
                    boolean z10 = true;
                    boolean z11 = pattern.indexOf(66) != -1;
                    if (pattern.indexOf(98) == -1) {
                        z10 = false;
                    }
                    if (z11 || z10) {
                        StringBuilder sb2 = new StringBuilder(pattern.length());
                        char c10 = ' ';
                        while (i11 < pattern.length()) {
                            char charAt = pattern.charAt(i11);
                            if (charAt == ' ' ? i11 == 0 || (c10 != 'B' && c10 != 'b') : charAt != 'B' && charAt != 'b') {
                                sb2.append(charAt);
                            }
                            i11++;
                            c10 = charAt;
                        }
                        int length = sb2.length() - 1;
                        if (length >= 0 && sb2.charAt(length) == ' ') {
                            sb2.deleteCharAt(length);
                        }
                        pattern = sb2.toString();
                    }
                }
                DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern(pattern).toFormatter(locale);
                DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) f13077c.putIfAbsent(str, formatter);
                return dateTimeFormatter2 != null ? dateTimeFormatter2 : formatter;
            }
            throw new UnsupportedOperationException("Can't determine pattern from " + dateInstance);
        }
        return dateTimeFormatter;
    }

    @Override // j$.time.format.g
    public final boolean b(z zVar, StringBuilder sb2) {
        a(zVar.c(), j$.time.chrono.c.b(zVar.d())).f().b(zVar, sb2);
        return true;
    }

    @Override // j$.time.format.g
    public final int d(x xVar, CharSequence charSequence, int i10) {
        return a(xVar.i(), xVar.h()).f().d(xVar, charSequence, i10);
    }

    public final String toString() {
        StringBuilder b10 = AbstractC0484a.b("Localized(");
        Object obj = this.f13078a;
        Object obj2 = BuildConfig.FLAVOR;
        if (obj == null) {
            obj = obj2;
        }
        b10.append(obj);
        b10.append(",");
        FormatStyle formatStyle = this.f13079b;
        if (formatStyle != null) {
            obj2 = formatStyle;
        }
        b10.append(obj2);
        b10.append(")");
        return b10.toString();
    }
}
