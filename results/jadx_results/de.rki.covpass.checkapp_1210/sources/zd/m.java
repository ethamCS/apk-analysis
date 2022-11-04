package zd;

import bf.x;
import hc.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes3.dex */
public enum m {
    PLAIN { // from class: zd.m.b
        @Override // zd.m
        public String g(String str) {
            t.e(str, "string");
            return str;
        }
    },
    HTML { // from class: zd.m.a
        @Override // zd.m
        public String g(String str) {
            String E;
            String E2;
            t.e(str, "string");
            E = x.E(str, "<", "&lt;", false, 4, null);
            E2 = x.E(E, ">", "&gt;", false, 4, null);
            return E2;
        }
    };

    /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String g(String str);
}
