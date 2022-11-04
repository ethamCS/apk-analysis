package io.flutter.embedding.engine.e;

import d.a.c.a.b;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class b implements d.a.c.a.b, c {

    /* renamed from: a */
    private final FlutterJNI f955a;

    /* renamed from: d */
    private int f958d = 1;

    /* renamed from: b */
    private final Map<String, b.a> f956b = new HashMap();

    /* renamed from: c */
    private final Map<Integer, b.AbstractC0039b> f957c = new HashMap();

    /* loaded from: classes.dex */
    static class a implements b.AbstractC0039b {

        /* renamed from: a */
        private final FlutterJNI f959a;

        /* renamed from: b */
        private final int f960b;

        /* renamed from: c */
        private final AtomicBoolean f961c = new AtomicBoolean(false);

        a(FlutterJNI flutterJNI, int i) {
            this.f959a = flutterJNI;
            this.f960b = i;
        }

        @Override // d.a.c.a.b.AbstractC0039b
        public void a(ByteBuffer byteBuffer) {
            if (!this.f961c.getAndSet(true)) {
                if (byteBuffer == null) {
                    this.f959a.invokePlatformMessageEmptyResponseCallback(this.f960b);
                    return;
                } else {
                    this.f959a.invokePlatformMessageResponseCallback(this.f960b, byteBuffer, byteBuffer.position());
                    return;
                }
            }
            throw new IllegalStateException("Reply already submitted");
        }
    }

    public b(FlutterJNI flutterJNI) {
        this.f955a = flutterJNI;
    }

    private static void e(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() != null) {
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
            return;
        }
        throw error;
    }

    @Override // d.a.c.a.b
    public void a(String str, ByteBuffer byteBuffer, b.AbstractC0039b abstractC0039b) {
        int i;
        d.a.b.e("DartMessenger", "Sending message with callback over channel '" + str + "'");
        if (abstractC0039b != null) {
            i = this.f958d;
            this.f958d = i + 1;
            this.f957c.put(Integer.valueOf(i), abstractC0039b);
        } else {
            i = 0;
        }
        if (byteBuffer == null) {
            this.f955a.dispatchEmptyPlatformMessage(str, i);
        } else {
            this.f955a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i);
        }
    }

    @Override // io.flutter.embedding.engine.e.c
    public void b(int i, byte[] bArr) {
        d.a.b.e("DartMessenger", "Received message reply from Dart.");
        b.AbstractC0039b remove = this.f957c.remove(Integer.valueOf(i));
        if (remove != null) {
            try {
                d.a.b.e("DartMessenger", "Invoking registered callback for reply from Dart.");
                remove.a(bArr == null ? null : ByteBuffer.wrap(bArr));
            } catch (Error e2) {
                e(e2);
            } catch (Exception e3) {
                d.a.b.c("DartMessenger", "Uncaught exception in binary message reply handler", e3);
            }
        }
    }

    @Override // io.flutter.embedding.engine.e.c
    public void c(String str, byte[] bArr, int i) {
        d.a.b.e("DartMessenger", "Received message from Dart over channel '" + str + "'");
        b.a aVar = this.f956b.get(str);
        if (aVar != null) {
            try {
                d.a.b.e("DartMessenger", "Deferring to registered handler to process message.");
                aVar.a(bArr == null ? null : ByteBuffer.wrap(bArr), new a(this.f955a, i));
                return;
            } catch (Error e2) {
                e(e2);
                return;
            } catch (Exception e3) {
                d.a.b.c("DartMessenger", "Uncaught exception in binary message listener", e3);
            }
        } else {
            d.a.b.e("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
        }
        this.f955a.invokePlatformMessageEmptyResponseCallback(i);
    }

    @Override // d.a.c.a.b
    public void d(String str, b.a aVar) {
        if (aVar == null) {
            d.a.b.e("DartMessenger", "Removing handler for channel '" + str + "'");
            this.f956b.remove(str);
            return;
        }
        d.a.b.e("DartMessenger", "Setting handler for channel '" + str + "'");
        this.f956b.put(str, aVar);
    }
}
