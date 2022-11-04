package t0;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.util.h;
import androidx.core.view.c;
import androidx.core.view.y;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public class a extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ AbstractC0371c f21789a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z10, AbstractC0371c abstractC0371c) {
            super(inputConnection, z10);
            this.f21789a = abstractC0371c;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
            if (this.f21789a.a(d.f(inputContentInfo), i10, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i10, bundle);
        }
    }

    /* loaded from: classes.dex */
    public class b extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ AbstractC0371c f21790a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InputConnection inputConnection, boolean z10, AbstractC0371c abstractC0371c) {
            super(inputConnection, z10);
            this.f21790a = abstractC0371c;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (c.e(str, bundle, this.f21790a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* renamed from: t0.c$c */
    /* loaded from: classes.dex */
    public interface AbstractC0371c {
        boolean a(d dVar, int i10, Bundle bundle);
    }

    private static AbstractC0371c b(final View view) {
        h.g(view);
        return new AbstractC0371c() { // from class: t0.b
            @Override // t0.c.AbstractC0371c
            public final boolean a(d dVar, int i10, Bundle bundle) {
                boolean f10;
                f10 = c.f(view, dVar, i10, bundle);
                return f10;
            }
        };
    }

    public static InputConnection c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return d(inputConnection, editorInfo, b(view));
    }

    @Deprecated
    public static InputConnection d(InputConnection inputConnection, EditorInfo editorInfo, AbstractC0371c abstractC0371c) {
        androidx.core.util.c.c(inputConnection, "inputConnection must be non-null");
        androidx.core.util.c.c(editorInfo, "editorInfo must be non-null");
        androidx.core.util.c.c(abstractC0371c, "onCommitContentListener must be non-null");
        return Build.VERSION.SDK_INT >= 25 ? new a(inputConnection, false, abstractC0371c) : t0.a.a(editorInfo).length == 0 ? inputConnection : new b(inputConnection, false, abstractC0371c);
    }

    static boolean e(String str, Bundle bundle, AbstractC0371c abstractC0371c) {
        boolean z10;
        Throwable th2;
        ResultReceiver resultReceiver;
        boolean z11 = false;
        z11 = false;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z10 = false;
        } else if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            return false;
        } else {
            z10 = true;
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
            try {
                Uri uri = (Uri) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                Uri uri2 = (Uri) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                int i10 = bundle.getInt(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                Bundle bundle2 = (Bundle) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                if (uri != null && clipDescription != null) {
                    z11 = abstractC0371c.a(new d(uri, clipDescription, uri2), i10, bundle2);
                }
                if (resultReceiver != null) {
                    int i11 = z11 ? 1 : 0;
                    int i12 = z11 ? 1 : 0;
                    int i13 = z11 ? 1 : 0;
                    resultReceiver.send(i11, null);
                }
                return z11;
            } catch (Throwable th3) {
                th2 = th3;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            resultReceiver = null;
        }
    }

    public static /* synthetic */ boolean f(View view, d dVar, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                dVar.d();
                InputContentInfo inputContentInfo = (InputContentInfo) dVar.e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        return y.e0(view, new c.a(new ClipData(dVar.b(), new ClipData.Item(dVar.a())), 2).d(dVar.c()).b(bundle).a()) == null;
    }
}
