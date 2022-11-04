package androidx.room.s;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public class a {

    /* renamed from: e */
    private static final Map<String, Lock> f1934e = new HashMap();

    /* renamed from: a */
    private final File f1935a;

    /* renamed from: b */
    private final Lock f1936b;

    /* renamed from: c */
    private final boolean f1937c;

    /* renamed from: d */
    private FileChannel f1938d;

    public a(String str, File file, boolean z) {
        File file2 = new File(file, str + ".lck");
        this.f1935a = file2;
        this.f1936b = a(file2.getAbsolutePath());
        this.f1937c = z;
    }

    private static Lock a(String str) {
        Lock lock;
        Map<String, Lock> map = f1934e;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    public void b() {
        this.f1936b.lock();
        if (this.f1937c) {
            try {
                FileChannel channel = new FileOutputStream(this.f1935a).getChannel();
                this.f1938d = channel;
                channel.lock();
            } catch (IOException e2) {
                throw new IllegalStateException("Unable to grab copy lock.", e2);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.f1938d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f1936b.unlock();
    }
}
