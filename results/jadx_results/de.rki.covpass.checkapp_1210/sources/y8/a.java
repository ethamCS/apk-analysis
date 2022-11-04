package y8;

import android.os.ParcelFileDescriptor;
import hc.t;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Ljava/io/File;", "Landroid/os/ParcelFileDescriptor;", "a", "common-app_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {
    public static final ParcelFileDescriptor a(File file) {
        t.e(file, "<this>");
        file.createNewFile();
        ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 805306368);
        if (open != null) {
            return open;
        }
        throw new IOException();
    }
}
