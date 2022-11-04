package j1;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.i0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import m1.j;
/* loaded from: classes.dex */
public class c {
    public static CancellationSignal a() {
        return m1.b.b();
    }

    public static void b(m1.g gVar) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor Y0 = gVar.Y0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (Y0.moveToNext()) {
            try {
                arrayList.add(Y0.getString(0));
            } catch (Throwable th2) {
                Y0.close();
                throw th2;
            }
        }
        Y0.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                gVar.H("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static Cursor c(i0 i0Var, j jVar, boolean z10, CancellationSignal cancellationSignal) {
        Cursor C = i0Var.C(jVar, cancellationSignal);
        if (!z10 || !(C instanceof AbstractWindowedCursor)) {
            return C;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) C;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? b.a(abstractWindowedCursor) : C;
    }

    public static int d(File file) {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            int i10 = allocate.getInt();
            channel.close();
            return i10;
        } catch (Throwable th2) {
            if (0 != 0) {
                fileChannel.close();
            }
            throw th2;
        }
    }
}
