package b.c.a;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import b.c.a.s;
import b.c.a.x;
import java.io.InputStream;
/* loaded from: classes.dex */
public class f extends x {

    /* renamed from: b */
    private static final UriMatcher f1287b;

    /* renamed from: a */
    private final Context f1288a;

    @TargetApi(14)
    /* loaded from: classes.dex */
    public static class a {
        static InputStream a(ContentResolver contentResolver, Uri uri) {
            return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f1287b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f1287b.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f1287b.addURI("com.android.contacts", "contacts/#/photo", 2);
        f1287b.addURI("com.android.contacts", "contacts/#", 3);
        f1287b.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public f(Context context) {
        this.f1288a = context;
    }

    private InputStream c(v vVar) {
        ContentResolver contentResolver = this.f1288a.getContentResolver();
        Uri uri = vVar.d;
        int match = f1287b.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return Build.VERSION.SDK_INT < 14 ? ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri) : a.a(contentResolver, uri);
    }

    @Override // b.c.a.x
    public x.a a(v vVar, int i) {
        InputStream c2 = c(vVar);
        if (c2 != null) {
            return new x.a(c2, s.e.DISK);
        }
        return null;
    }

    @Override // b.c.a.x
    public boolean a(v vVar) {
        Uri uri = vVar.d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f1287b.match(vVar.d) != -1;
    }
}
