package ba;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.ValueNode;
import j$.time.OffsetDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class c extends ValueNode implements Comparable<c> {

    /* renamed from: d */
    private static final DateTimeFormatter f5763d = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ");

    /* renamed from: c */
    private final OffsetDateTime f5764c;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5765a;

        static {
            int[] iArr = new int[d.values().length];
            f5765a = iArr;
            try {
                iArr[d.day.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5765a[d.hour.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5765a[d.month.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5765a[d.year.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    protected c(OffsetDateTime offsetDateTime) {
        this.f5764c = offsetDateTime;
    }

    private static boolean G(int i10) {
        return i10 % 400 == 0 || (i10 % 4 == 0 && i10 % 100 != 0);
    }

    private static c N(String str) {
        if (str.matches("^\\d{4}$")) {
            return s(String.format("%04d-12-31", Integer.valueOf(Integer.parseInt(str))));
        }
        if (!str.matches("^\\d{4}-\\d{2}$")) {
            return null;
        }
        int parseInt = Integer.parseInt(str.substring(0, 4));
        int parseInt2 = Integer.parseInt(str.substring(5, 7)) + 1;
        if (parseInt2 > 12) {
            parseInt++;
            parseInt2 = 1;
        }
        return s(String.format("%04d-%02d-%02d", Integer.valueOf(parseInt), Integer.valueOf(parseInt2), 1)).M(-1, d.day);
    }

    public static c r(String str) {
        c N = N(str);
        if (N != null) {
            return N;
        }
        if (str.matches("^\\d{4}-\\d{2}-\\d{2}$")) {
            return s(str);
        }
        throw new DateTimeParseException("can't parse " + str + " as an EU DCC date-of-birth", str, 0);
    }

    public static c s(String str) {
        String str2;
        c N = N(str);
        if (N != null) {
            return N;
        }
        if (str.matches("^\\d{4}-\\d{2}-\\d{2}$")) {
            return z(str + "T00:00:00Z");
        }
        Matcher matcher = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2})(\\.\\d+?)?(Z|(([+-])(\\d{1,2}):?(\\d{2})?))?$").matcher(str);
        if (!matcher.matches()) {
            throw new DateTimeParseException("not an allowed date or date-time format: " + str, str, 0);
        }
        String format = String.format("%s-%s-%sT%s:%s:%s", matcher.group(1), matcher.group(2), matcher.group(3), matcher.group(4), matcher.group(5), matcher.group(6));
        if (matcher.group(7) != null) {
            format = format + String.format("%-4s", matcher.group(7)).replace(' ', '0').substring(0, 4);
        }
        if (matcher.group(8) == null || matcher.group(8).equals("Z")) {
            str2 = format + "Z";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(format);
            sb2.append(matcher.group(10));
            sb2.append(String.format("%2s", matcher.group(11)).replaceAll(" ", "0"));
            sb2.append(":");
            sb2.append(matcher.group(12) != null ? matcher.group(12) : "00");
            str2 = sb2.toString();
        }
        return z(str2);
    }

    private static c z(String str) {
        try {
            return new c(OffsetDateTime.parse(str));
        } catch (DateTimeParseException e10) {
            throw e10;
        }
    }

    public c M(int i10, d dVar) {
        if (i10 == 0) {
            return this;
        }
        int i11 = a.f5765a[dVar.ordinal()];
        boolean z10 = true;
        if (i11 == 1) {
            return new c(this.f5764c.plusDays(i10));
        }
        if (i11 == 2) {
            return new c(this.f5764c.plusHours(i10));
        }
        if (i11 == 3) {
            return new c(this.f5764c.plusMonths(i10));
        }
        if (i11 != 4) {
            throw new RuntimeException(String.format("time unit \"%s\" not handled", dVar));
        }
        if (!(this.f5764c.getMonthValue() == 2 && this.f5764c.getDayOfMonth() == 29) || G(this.f5764c.getYear() + i10)) {
            z10 = false;
        }
        return new c(this.f5764c.plusYears(i10).plusDays(z10 ? 1L : 0L));
    }

    public OffsetDateTime V() {
        return this.f5764c;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return f5763d.format(this.f5764c);
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode
    public JsonToken asToken() {
        return null;
    }

    /* renamed from: b */
    public int compareTo(c cVar) {
        return this.f5764c.compareTo(cVar.f5764c);
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && compareTo((c) obj) == 0;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.OBJECT;
    }

    public int hashCode() {
        return this.f5764c.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
    }
}
