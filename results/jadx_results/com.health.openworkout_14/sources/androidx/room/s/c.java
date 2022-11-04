package androidx.room.s;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.room.j;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class c {
    public static void a(b.o.a.b bVar) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor V = bVar.V("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (V.moveToNext()) {
            try {
                arrayList.add(V.getString(0));
            } catch (Throwable th) {
                V.close();
                throw th;
            }
        }
        V.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                bVar.t("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static Cursor b(j jVar, b.o.a.e eVar, boolean z, CancellationSignal cancellationSignal) {
        Cursor q = jVar.q(eVar, cancellationSignal);
        if (!z || !(q instanceof AbstractWindowedCursor)) {
            return q;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) q;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? b.a(abstractWindowedCursor) : q;
    }

    public static int c(File file) {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            fileChannel = new FileInputStream(file).getChannel();
            fileChannel.tryLock(60L, 4L, true);
            fileChannel.position(60L);
            if (fileChannel.read(allocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            return allocate.getInt();
        } finally {
            if (fileChannel != null) {
                fileChannel.close();
            }
        }
    }
}
