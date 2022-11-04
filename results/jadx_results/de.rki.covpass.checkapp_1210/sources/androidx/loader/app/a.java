package androidx.loader.app;

import androidx.lifecycle.v;
import androidx.lifecycle.z0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public abstract class a {
    public static <T extends v & z0> a b(T t10) {
        return new b(t10, t10.I());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
