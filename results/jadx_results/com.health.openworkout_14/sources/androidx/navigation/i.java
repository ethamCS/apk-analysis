package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class i {
    private static final Pattern i = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a */
    private final ArrayList<String> f1326a = new ArrayList<>();

    /* renamed from: b */
    private final Map<String, c> f1327b = new HashMap();

    /* renamed from: c */
    private Pattern f1328c;

    /* renamed from: d */
    private boolean f1329d;

    /* renamed from: e */
    private boolean f1330e;

    /* renamed from: f */
    private final String f1331f;

    /* renamed from: g */
    private Pattern f1332g;

    /* renamed from: h */
    private final String f1333h;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private String f1334a;

        /* renamed from: b */
        private String f1335b;

        /* renamed from: c */
        private String f1336c;

        public i a() {
            return new i(this.f1334a, this.f1335b, this.f1336c);
        }

        public a b(String str) {
            if (!str.isEmpty()) {
                this.f1335b = str;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }

        public a c(String str) {
            this.f1336c = str;
            return this;
        }

        public a d(String str) {
            this.f1334a = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements Comparable<b> {

        /* renamed from: b */
        String f1337b;

        /* renamed from: c */
        String f1338c;

        b(String str) {
            String[] split = str.split("/", -1);
            this.f1337b = split[0];
            this.f1338c = split[1];
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            int i = this.f1337b.equals(bVar.f1337b) ? 2 : 0;
            return this.f1338c.equals(bVar.f1338c) ? i + 1 : i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        private String f1339a;

        /* renamed from: b */
        private ArrayList<String> f1340b = new ArrayList<>();

        c() {
        }

        void a(String str) {
            this.f1340b.add(str);
        }

        String b(int i) {
            return this.f1340b.get(i);
        }

        String c() {
            return this.f1339a;
        }

        void d(String str) {
            this.f1339a = str;
        }

        public int e() {
            return this.f1340b.size();
        }
    }

    i(String str, String str2, String str3) {
        this.f1328c = null;
        this.f1329d = false;
        this.f1330e = false;
        this.f1332g = null;
        this.f1331f = str2;
        this.f1333h = str3;
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.f1330e = parse.getQuery() != null;
            StringBuilder sb = new StringBuilder("^");
            if (!i.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.f1330e) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    a(str.substring(0, matcher.start()), sb, compile);
                }
                this.f1329d = false;
                for (String str4 : parse.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(str4);
                    Matcher matcher2 = compile.matcher(queryParameter);
                    c cVar = new c();
                    int i2 = 0;
                    while (matcher2.find()) {
                        cVar.a(matcher2.group(1));
                        sb2.append(Pattern.quote(queryParameter.substring(i2, matcher2.start())));
                        sb2.append("(.+?)?");
                        i2 = matcher2.end();
                    }
                    if (i2 < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(i2)));
                    }
                    cVar.d(sb2.toString().replace(".*", "\\E.*\\Q"));
                    this.f1327b.put(str4, cVar);
                }
            } else {
                this.f1329d = a(str, sb, compile);
            }
            this.f1328c = Pattern.compile(sb.toString().replace(".*", "\\E.*\\Q"));
        }
        if (str3 != null) {
            if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
                throw new IllegalArgumentException("The given mimeType " + str3 + " does not match to required \"type/subtype\" format");
            }
            b bVar = new b(str3);
            this.f1332g = Pattern.compile(("^(" + bVar.f1337b + "|[*]+)/(" + bVar.f1338c + "|[*]+)$").replace("*|[*]", "[\\s\\S]"));
        }
    }

    private boolean a(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !str.contains(".*");
        int i2 = 0;
        while (matcher.find()) {
            this.f1326a.add(matcher.group(1));
            sb.append(Pattern.quote(str.substring(i2, matcher.start())));
            sb.append("(.+?)");
            i2 = matcher.end();
            z = false;
        }
        if (i2 < str.length()) {
            sb.append(Pattern.quote(str.substring(i2)));
        }
        sb.append("($|(\\?(.)*))");
        return z;
    }

    private boolean f(Bundle bundle, String str, String str2, e eVar) {
        if (eVar == null) {
            bundle.putString(str, str2);
            return false;
        }
        try {
            eVar.b().g(bundle, str, str2);
            return false;
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    public String b() {
        return this.f1331f;
    }

    public Bundle c(Uri uri, Map<String, e> map) {
        Matcher matcher;
        Matcher matcher2 = this.f1328c.matcher(uri.toString());
        if (!matcher2.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        int size = this.f1326a.size();
        int i2 = 0;
        while (i2 < size) {
            String str = this.f1326a.get(i2);
            i2++;
            if (f(bundle, str, Uri.decode(matcher2.group(i2)), map.get(str))) {
                return null;
            }
        }
        if (this.f1330e) {
            for (String str2 : this.f1327b.keySet()) {
                c cVar = this.f1327b.get(str2);
                String queryParameter = uri.getQueryParameter(str2);
                if (queryParameter != null) {
                    matcher = Pattern.compile(cVar.c()).matcher(queryParameter);
                    if (!matcher.matches()) {
                        return null;
                    }
                } else {
                    matcher = null;
                }
                for (int i3 = 0; i3 < cVar.e(); i3++) {
                    String decode = matcher != null ? Uri.decode(matcher.group(i3 + 1)) : null;
                    String b2 = cVar.b(i3);
                    e eVar = map.get(b2);
                    if (eVar != null && (decode == null || decode.replaceAll("[{}]", "").equals(b2))) {
                        if (eVar.a() != null) {
                            decode = eVar.a().toString();
                        } else if (eVar.d()) {
                            decode = null;
                        }
                    }
                    if (f(bundle, b2, decode, eVar)) {
                        return null;
                    }
                }
            }
        }
        return bundle;
    }

    public int d(String str) {
        if (this.f1333h == null || !this.f1332g.matcher(str).matches()) {
            return -1;
        }
        return new b(this.f1333h).compareTo(new b(str));
    }

    public boolean e() {
        return this.f1329d;
    }
}
