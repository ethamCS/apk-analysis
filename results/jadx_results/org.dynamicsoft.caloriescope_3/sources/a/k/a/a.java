package a.k.a;

import androidx.lifecycle.h;
import androidx.lifecycle.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public abstract class a {
    public static <T extends h & t> a a(T t) {
        return new b(t, t.e());
    }

    public abstract void a();

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
