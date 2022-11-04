package io.flutter.embedding.engine.i;

import d.a.c.a.a;
import d.a.c.a.o;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.c;
import java.util.HashMap;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    public final d.a.c.a.a<Object> f986a;

    /* renamed from: b */
    public final FlutterJNI f987b;

    /* renamed from: c */
    private AbstractC0052b f988c;

    /* renamed from: d */
    private final a.d<Object> f989d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a.d<Object> {
        a() {
            b.this = r1;
        }

        @Override // d.a.c.a.a.d
        public void a(Object obj, a.e<Object> eVar) {
            if (b.this.f988c == null) {
                return;
            }
            HashMap hashMap = (HashMap) obj;
            String str = (String) hashMap.get("type");
            HashMap hashMap2 = (HashMap) hashMap.get("data");
            d.a.b.e("AccessibilityChannel", "Received " + str + " message.");
            str.hashCode();
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1140076541:
                    if (str.equals("tooltip")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -649620375:
                    if (str.equals("announce")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 114595:
                    if (str.equals("tap")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 114203431:
                    if (str.equals("longPress")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    String str2 = (String) hashMap2.get("message");
                    if (str2 != null) {
                        b.this.f988c.b(str2);
                        break;
                    }
                    break;
                case 1:
                    String str3 = (String) hashMap2.get("message");
                    if (str3 != null) {
                        b.this.f988c.f(str3);
                        break;
                    }
                    break;
                case 2:
                    Integer num = (Integer) hashMap.get("nodeId");
                    if (num != null) {
                        b.this.f988c.e(num.intValue());
                        break;
                    }
                    break;
                case 3:
                    Integer num2 = (Integer) hashMap.get("nodeId");
                    if (num2 != null) {
                        b.this.f988c.d(num2.intValue());
                        break;
                    }
                    break;
            }
            eVar.a(null);
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0052b extends FlutterJNI.a {
        void b(String str);

        void d(int i);

        void e(int i);

        void f(String str);
    }

    public b(io.flutter.embedding.engine.e.a aVar, FlutterJNI flutterJNI) {
        a aVar2 = new a();
        this.f989d = aVar2;
        d.a.c.a.a<Object> aVar3 = new d.a.c.a.a<>(aVar, "flutter/accessibility", o.f706a);
        this.f986a = aVar3;
        aVar3.e(aVar2);
        this.f987b = flutterJNI;
    }

    public void b(int i, c.f fVar) {
        this.f987b.dispatchSemanticsAction(i, fVar);
    }

    public void c(int i, c.f fVar, Object obj) {
        this.f987b.dispatchSemanticsAction(i, fVar, obj);
    }

    public void d() {
        this.f987b.setSemanticsEnabled(false);
    }

    public void e() {
        this.f987b.setSemanticsEnabled(true);
    }

    public void f(int i) {
        this.f987b.setAccessibilityFeatures(i);
    }

    public void g(AbstractC0052b abstractC0052b) {
        this.f988c = abstractC0052b;
        this.f987b.setAccessibilityDelegate(abstractC0052b);
    }
}
