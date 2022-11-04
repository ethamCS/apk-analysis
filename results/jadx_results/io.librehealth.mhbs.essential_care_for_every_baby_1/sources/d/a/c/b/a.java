package d.a.c.b;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import io.flutter.embedding.engine.i.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private final f f713a;

    /* renamed from: b */
    private final Context f714b;

    /* renamed from: c */
    final f.b f715c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d.a.c.b.a$a */
    /* loaded from: classes.dex */
    public class C0041a implements f.b {
        C0041a() {
            a.this = r1;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
        @Override // io.flutter.embedding.engine.i.f.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String a(java.lang.String r9, java.lang.String r10) {
            /*
                r8 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                d.a.c.b.a r1 = d.a.c.b.a.this
                android.content.Context r1 = d.a.c.b.a.a(r1)
                r2 = 17
                r3 = 0
                if (r10 == 0) goto L4a
                java.util.Locale r4 = d.a.c.b.a.b(r10)
                if (r0 < r2) goto L34
                android.content.res.Configuration r1 = new android.content.res.Configuration
                d.a.c.b.a r5 = d.a.c.b.a.this
                android.content.Context r5 = d.a.c.b.a.a(r5)
                android.content.res.Resources r5 = r5.getResources()
                android.content.res.Configuration r5 = r5.getConfiguration()
                r1.<init>(r5)
                r1.setLocale(r4)
                d.a.c.b.a r4 = d.a.c.b.a.this
                android.content.Context r4 = d.a.c.b.a.a(r4)
                android.content.Context r1 = r4.createConfigurationContext(r1)
                goto L4a
            L34:
                d.a.c.b.a r5 = d.a.c.b.a.this
                android.content.Context r5 = d.a.c.b.a.a(r5)
                android.content.res.Resources r5 = r5.getResources()
                android.content.res.Configuration r6 = r5.getConfiguration()
                java.util.Locale r7 = r6.locale
                r6.locale = r4
                r5.updateConfiguration(r6, r3)
                goto L4b
            L4a:
                r7 = r3
            L4b:
                d.a.c.b.a r4 = d.a.c.b.a.this
                android.content.Context r4 = d.a.c.b.a.a(r4)
                java.lang.String r4 = r4.getPackageName()
                android.content.res.Resources r5 = r1.getResources()
                java.lang.String r6 = "string"
                int r9 = r5.getIdentifier(r9, r6, r4)
                if (r9 == 0) goto L6a
                android.content.res.Resources r1 = r1.getResources()
                java.lang.String r9 = r1.getString(r9)
                goto L6b
            L6a:
                r9 = r3
            L6b:
                if (r10 == 0) goto L82
                if (r0 >= r2) goto L82
                d.a.c.b.a r10 = d.a.c.b.a.this
                android.content.Context r10 = d.a.c.b.a.a(r10)
                android.content.res.Resources r10 = r10.getResources()
                android.content.res.Configuration r0 = r10.getConfiguration()
                r0.locale = r7
                r10.updateConfiguration(r0, r3)
            L82:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: d.a.c.b.a.C0041a.a(java.lang.String, java.lang.String):java.lang.String");
        }
    }

    public a(Context context, f fVar) {
        C0041a c0041a = new C0041a();
        this.f715c = c0041a;
        this.f714b = context;
        this.f713a = fVar;
        fVar.c(c0041a);
    }

    public static Locale b(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        String str4 = "";
        int i = 1;
        if (split.length <= 1 || split[1].length() != 4) {
            str2 = str4;
        } else {
            str2 = split[1];
            i = 2;
        }
        if (split.length > i && split[i].length() >= 2 && split[i].length() <= 3) {
            str4 = split[i];
        }
        return new Locale(str3, str4, str2);
    }

    public Locale c(List<Locale> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            ArrayList arrayList = new ArrayList();
            LocaleList locales = this.f714b.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i2 = 0; i2 < size; i2++) {
                Locale locale = locales.get(i2);
                String language = locale.getLanguage();
                if (!locale.getScript().isEmpty()) {
                    language = language + "-" + locale.getScript();
                }
                if (!locale.getCountry().isEmpty()) {
                    language = language + "-" + locale.getCountry();
                }
                arrayList.add(new Locale.LanguageRange(language));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage()));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage() + "-*"));
            }
            Locale lookup = Locale.lookup(arrayList, list);
            if (lookup != null) {
                return lookup;
            }
        } else if (i >= 24) {
            LocaleList locales2 = this.f714b.getResources().getConfiguration().getLocales();
            for (int i3 = 0; i3 < locales2.size(); i3++) {
                Locale locale2 = locales2.get(i3);
                for (Locale locale3 : list) {
                    if (locale2.equals(locale3)) {
                        return locale3;
                    }
                }
                for (Locale locale4 : list) {
                    if (locale2.getLanguage().equals(locale4.toLanguageTag())) {
                        return locale4;
                    }
                }
                for (Locale locale5 : list) {
                    if (locale2.getLanguage().equals(locale5.getLanguage())) {
                        return locale5;
                    }
                }
            }
        } else {
            Locale locale6 = this.f714b.getResources().getConfiguration().locale;
            if (locale6 != null) {
                for (Locale locale7 : list) {
                    if (locale6.equals(locale7)) {
                        return locale7;
                    }
                }
                for (Locale locale8 : list) {
                    if (locale6.getLanguage().equals(locale8.toString())) {
                        return locale8;
                    }
                }
            }
        }
        return list.get(0);
    }

    public void d(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            int size = locales.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(locales.get(i));
            }
        } else {
            arrayList.add(configuration.locale);
        }
        this.f713a.b(arrayList);
    }
}
