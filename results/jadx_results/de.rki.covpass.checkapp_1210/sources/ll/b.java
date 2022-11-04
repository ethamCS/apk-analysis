package ll;

import j$.util.function.IntConsumer;
import j$.util.stream.IntStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import ll.e;
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a */
    private static ForkJoinPool f16100a = new ForkJoinPool();

    /* loaded from: classes3.dex */
    public interface a<D> {
        D a();
    }

    /* renamed from: ll.b$b */
    /* loaded from: classes3.dex */
    public interface AbstractC0242b<D> {
        void a(D d10);
    }

    public static /* synthetic */ void b(int i10, int i11, IntConsumer intConsumer) {
        IntStream.CC.range(i10, i11).parallel().forEach(intConsumer);
    }

    public static <T> void c(int i10, int i11, int i12, d<T> dVar, h<T> hVar) {
        ForkJoinPool forkJoinPool = f16100a;
        int parallelism = forkJoinPool.getParallelism();
        int i13 = i11 - i10;
        if (i13 == 0) {
            return;
        }
        if (i13 >= 0) {
            i(i10, i11, dVar, hVar, forkJoinPool, j(i13, i12, parallelism));
            return;
        }
        throw new IllegalArgumentException("end must be more than start. " + i10 + " -> " + i11);
    }

    public static <T> void d(int i10, int i11, d<T> dVar, h<T> hVar) {
        ForkJoinPool forkJoinPool = f16100a;
        int parallelism = forkJoinPool.getParallelism();
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 >= 0) {
            i(i10, i11, dVar, hVar, forkJoinPool, Math.max(1, i12 / parallelism));
            return;
        }
        throw new IllegalArgumentException("end must be more than start. " + i10 + " -> " + i11);
    }

    public static void e(int i10, int i11, g gVar) {
        ForkJoinPool forkJoinPool = f16100a;
        int parallelism = forkJoinPool.getParallelism();
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 >= 0) {
            try {
                forkJoinPool.submit(new j(i10, i11, Math.max(1, i12 / parallelism), gVar)).get();
                return;
            } catch (InterruptedException | ExecutionException e10) {
                throw new RuntimeException(e10);
            }
        }
        throw new IllegalArgumentException("end must be more than start. " + i10 + " -> " + i11);
    }

    public static void f(final int i10, final int i11, final IntConsumer intConsumer) {
        try {
            f16100a.submit(new Runnable() { // from class: ll.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.b(i10, i11, intConsumer);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e10) {
            e10.printStackTrace();
        }
    }

    public static Number g(int i10, int i11, Class cls, f fVar) {
        try {
            return (Number) f16100a.submit(new e.a(i10, i11, cls, fVar)).get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static Number h(int i10, int i11, Class cls, f fVar) {
        try {
            return (Number) f16100a.submit(new e.b(i10, i11, cls, fVar)).get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static <T> void i(int i10, int i11, d<T> dVar, h<T> hVar, ForkJoinPool forkJoinPool, int i12) {
        dVar.f();
        try {
            forkJoinPool.submit(new i(i10, i11, i12, dVar, hVar)).get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException(e10);
        }
    }

    static int j(int i10, int i11, int i12) {
        return i10 / Math.max(1, i10 / Math.max(i11, i10 / i12));
    }
}
