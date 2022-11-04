package de.rki.covpass.commonapp.license.models;

import fc.c;
import hc.t;
import java.util.List;
import jf.d;
import kf.f;
import kf.h1;
import kf.k1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.h;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/Bc\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\"\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0019\u0012\b\u0010(\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b)\u0010*Bw\b\u0017\u0012\u0006\u0010+\u001a\u00020\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\"\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0019\u0012\b\u0010(\u001a\u0004\u0018\u00010\t\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b)\u0010.J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001f\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u0019\u0010\"\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\u0013R\u001f\u0010%\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b\u0015\u0010\u001cR\u0019\u0010(\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010\u0011\u001a\u0004\b'\u0010\u0013¨\u00061"}, d2 = {"Lde/rki/covpass/commonapp/license/models/OpenSourceItem;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "e", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "project", "b", "description", "d", "version", BuildConfig.FLAVOR, "Ljava/util/List;", "getDevelopers", "()Ljava/util/List;", "developers", "getUrl", "url", "f", "getYear", "year", "Lde/rki/covpass/commonapp/license/models/License;", "g", "licenses", "h", "getDependency", "dependency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "seen1", "Lkf/h1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkf/h1;)V", "Companion", "$serializer", "common-app_release"}, k = 1, mv = {1, 7, 1})
@h
/* loaded from: classes.dex */
public final class OpenSourceItem {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f8550a;

    /* renamed from: b */
    private final String f8551b;

    /* renamed from: c */
    private final String f8552c;

    /* renamed from: d */
    private final List<String> f8553d;

    /* renamed from: e */
    private final String f8554e;

    /* renamed from: f */
    private final String f8555f;

    /* renamed from: g */
    private final List<License> f8556g;

    /* renamed from: h */
    private final String f8557h;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/commonapp/license/models/OpenSourceItem$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/commonapp/license/models/OpenSourceItem;", "common-app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OpenSourceItem> serializer() {
            return OpenSourceItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OpenSourceItem(int i10, String str, String str2, String str3, List list, String str4, String str5, List list2, String str6, h1 h1Var) {
        if (255 != (i10 & 255)) {
            w0.a(i10, 255, OpenSourceItem$$serializer.INSTANCE.getDescriptor());
        }
        this.f8550a = str;
        this.f8551b = str2;
        this.f8552c = str3;
        this.f8553d = list;
        this.f8554e = str4;
        this.f8555f = str5;
        this.f8556g = list2;
        this.f8557h = str6;
    }

    public OpenSourceItem(String str, String str2, String str3, List<String> list, String str4, String str5, List<License> list2, String str6) {
        this.f8550a = str;
        this.f8551b = str2;
        this.f8552c = str3;
        this.f8553d = list;
        this.f8554e = str4;
        this.f8555f = str5;
        this.f8556g = list2;
        this.f8557h = str6;
    }

    @c
    public static final void e(OpenSourceItem openSourceItem, d dVar, SerialDescriptor serialDescriptor) {
        t.e(openSourceItem, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        k1 k1Var = k1.f15181a;
        dVar.m(serialDescriptor, 0, k1Var, openSourceItem.f8550a);
        dVar.m(serialDescriptor, 1, k1Var, openSourceItem.f8551b);
        dVar.m(serialDescriptor, 2, k1Var, openSourceItem.f8552c);
        dVar.m(serialDescriptor, 3, new f(k1Var), openSourceItem.f8553d);
        dVar.m(serialDescriptor, 4, k1Var, openSourceItem.f8554e);
        dVar.m(serialDescriptor, 5, k1Var, openSourceItem.f8555f);
        dVar.m(serialDescriptor, 6, new f(License$$serializer.INSTANCE), openSourceItem.f8556g);
        dVar.m(serialDescriptor, 7, k1Var, openSourceItem.f8557h);
    }

    public final String a() {
        return this.f8551b;
    }

    public final List<License> b() {
        return this.f8556g;
    }

    public final String c() {
        return this.f8550a;
    }

    public final String d() {
        return this.f8552c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenSourceItem)) {
            return false;
        }
        OpenSourceItem openSourceItem = (OpenSourceItem) obj;
        return t.a(this.f8550a, openSourceItem.f8550a) && t.a(this.f8551b, openSourceItem.f8551b) && t.a(this.f8552c, openSourceItem.f8552c) && t.a(this.f8553d, openSourceItem.f8553d) && t.a(this.f8554e, openSourceItem.f8554e) && t.a(this.f8555f, openSourceItem.f8555f) && t.a(this.f8556g, openSourceItem.f8556g) && t.a(this.f8557h, openSourceItem.f8557h);
    }

    public int hashCode() {
        String str = this.f8550a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f8551b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8552c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.f8553d;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.f8554e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f8555f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<License> list2 = this.f8556g;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str6 = this.f8557h;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return hashCode7 + i10;
    }

    public String toString() {
        String str = this.f8550a;
        String str2 = this.f8551b;
        String str3 = this.f8552c;
        List<String> list = this.f8553d;
        String str4 = this.f8554e;
        String str5 = this.f8555f;
        List<License> list2 = this.f8556g;
        String str6 = this.f8557h;
        return "OpenSourceItem(project=" + str + ", description=" + str2 + ", version=" + str3 + ", developers=" + list + ", url=" + str4 + ", year=" + str5 + ", licenses=" + list2 + ", dependency=" + str6 + ")";
    }
}
