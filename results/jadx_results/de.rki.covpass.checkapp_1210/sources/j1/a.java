package j1;

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
    private static final Map<String, Lock> f13940e = new HashMap();

    /* renamed from: a */
    private final File f13941a;

    /* renamed from: b */
    private final Lock f13942b;

    /* renamed from: c */
    private final boolean f13943c;

    /* renamed from: d */
    private FileChannel f13944d;

    public a(String str, File file, boolean z10) {
        File file2 = new File(file, str + ".lck");
        this.f13941a = file2;
        this.f13942b = a(file2.getAbsolutePath());
        this.f13943c = z10;
    }

    private static Lock a(String str) {
        Lock lock;
        Map<String, Lock> map = f13940e;
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
        this.f13942b.lock();
        if (this.f13943c) {
            try {
                FileChannel channel = new FileOutputStream(this.f13941a).getChannel();
                this.f13944d = channel;
                channel.lock();
            } catch (IOException e10) {
                throw new IllegalStateException("Unable to grab copy lock.", e10);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.f13944d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f13942b.unlock();
    }
}
