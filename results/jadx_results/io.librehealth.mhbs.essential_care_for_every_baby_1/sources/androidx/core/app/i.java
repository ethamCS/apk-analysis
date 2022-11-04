package androidx.core.app;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    private final String f219a;

    /* renamed from: b */
    private final CharSequence f220b;

    /* renamed from: c */
    private final CharSequence[] f221c;

    /* renamed from: d */
    private final boolean f222d;

    /* renamed from: e */
    private final int f223e;
    private final Bundle f;
    private final Set<String> g;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final String f224a;

        /* renamed from: d */
        private CharSequence f227d;

        /* renamed from: e */
        private CharSequence[] f228e;

        /* renamed from: b */
        private final Set<String> f225b = new HashSet();

        /* renamed from: c */
        private final Bundle f226c = new Bundle();
        private boolean f = true;
        private int g = 0;

        public a(String str) {
            if (str != null) {
                this.f224a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        public i a() {
            return new i(this.f224a, this.f227d, this.f228e, this.f, this.g, this.f226c, this.f225b);
        }

        public a b(CharSequence charSequence) {
            this.f227d = charSequence;
            return this;
        }
    }

    i(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set<String> set) {
        this.f219a = str;
        this.f220b = charSequence;
        this.f221c = charSequenceArr;
        this.f222d = z;
        this.f223e = i;
        this.f = bundle;
        this.g = set;
        if (g() != 2 || c()) {
            return;
        }
        throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
    }

    static RemoteInput a(i iVar) {
        RemoteInput.Builder addExtras = new RemoteInput.Builder(iVar.j()).setLabel(iVar.i()).setChoices(iVar.e()).setAllowFreeFormInput(iVar.c()).addExtras(iVar.h());
        if (Build.VERSION.SDK_INT >= 29) {
            addExtras.setEditChoicesBeforeSending(iVar.g());
        }
        return addExtras.build();
    }

    public static RemoteInput[] b(i[] iVarArr) {
        if (iVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[iVarArr.length];
        for (int i = 0; i < iVarArr.length; i++) {
            remoteInputArr[i] = a(iVarArr[i]);
        }
        return remoteInputArr;
    }

    private static Intent f(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (!description.hasMimeType("text/vnd.android.intent") || !description.getLabel().toString().contentEquals("android.remoteinput.results")) {
            return null;
        }
        return clipData.getItemAt(0).getIntent();
    }

    public static Bundle k(Intent intent) {
        Intent f;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            return RemoteInput.getResultsFromIntent(intent);
        }
        if (i >= 16 && (f = f(intent)) != null) {
            return (Bundle) f.getExtras().getParcelable("android.remoteinput.resultsData");
        }
        return null;
    }

    public boolean c() {
        return this.f222d;
    }

    public Set<String> d() {
        return this.g;
    }

    public CharSequence[] e() {
        return this.f221c;
    }

    public int g() {
        return this.f223e;
    }

    public Bundle h() {
        return this.f;
    }

    public CharSequence i() {
        return this.f220b;
    }

    public String j() {
        return this.f219a;
    }

    public boolean l() {
        return !c() && (e() == null || e().length == 0) && d() != null && !d().isEmpty();
    }
}
