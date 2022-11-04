package io.flutter.plugins.urllauncher;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class WebViewActivity extends Activity {

    /* renamed from: e */
    public static String f1239e = "close action";
    private static String f = "url";
    private static String g = "enableJavaScript";
    private static String h = "enableDomStorage";

    /* renamed from: c */
    private WebView f1242c;

    /* renamed from: a */
    private final BroadcastReceiver f1240a = new a();

    /* renamed from: b */
    private final WebViewClient f1241b = new b(this);

    /* renamed from: d */
    private IntentFilter f1243d = new IntentFilter(f1239e);

    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
            WebViewActivity.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (WebViewActivity.f1239e.equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends WebViewClient {
        b(WebViewActivity webViewActivity) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (Build.VERSION.SDK_INT >= 21) {
                webView.loadUrl(webResourceRequest.getUrl().toString());
                return false;
            }
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (Build.VERSION.SDK_INT < 21) {
                webView.loadUrl(str);
                return false;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c extends WebChromeClient {

        /* loaded from: classes.dex */
        class a extends WebViewClient {
            a() {
                c.this = r1;
            }

            @Override // android.webkit.WebViewClient
            @TargetApi(21)
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                WebViewActivity.this.f1242c.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                WebViewActivity.this.f1242c.loadUrl(str);
                return true;
            }
        }

        private c() {
            WebViewActivity.this = r1;
        }

        /* synthetic */ c(WebViewActivity webViewActivity, a aVar) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            a aVar = new a();
            WebView webView2 = new WebView(WebViewActivity.this.f1242c.getContext());
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public static Intent b(Context context, String str, boolean z, boolean z2, Bundle bundle) {
        return new Intent(context, WebViewActivity.class).putExtra(f, str).putExtra(g, z).putExtra(h, z2).putExtra("com.android.browser.headers", bundle);
    }

    private Map<String, String> c(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f1242c = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(f);
        boolean booleanExtra = intent.getBooleanExtra(g, false);
        boolean booleanExtra2 = intent.getBooleanExtra(h, false);
        this.f1242c.loadUrl(stringExtra, c(intent.getBundleExtra("com.android.browser.headers")));
        this.f1242c.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f1242c.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f1242c.setWebViewClient(this.f1241b);
        this.f1242c.getSettings().setSupportMultipleWindows(true);
        this.f1242c.setWebChromeClient(new c(this, null));
        registerReceiver(this.f1240a, this.f1243d);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f1240a);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f1242c.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f1242c.goBack();
        return true;
    }
}
