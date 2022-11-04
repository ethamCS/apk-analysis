package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    private final c f21341a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements c {

        /* renamed from: a */
        private final SessionConfiguration f21342a;

        /* renamed from: b */
        private final List<s.b> f21343b;

        a(int i10, List<s.b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i10, g.g(list), executor, stateCallback));
        }

        a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f21342a = sessionConfiguration;
            this.f21343b = Collections.unmodifiableList(g.h(sessionConfiguration.getOutputConfigurations()));
        }

        @Override // s.g.c
        public CameraCaptureSession.StateCallback a() {
            return this.f21342a.getStateCallback();
        }

        @Override // s.g.c
        public s.a b() {
            return s.a.b(this.f21342a.getInputConfiguration());
        }

        @Override // s.g.c
        public Executor c() {
            return this.f21342a.getExecutor();
        }

        @Override // s.g.c
        public Object d() {
            return this.f21342a;
        }

        @Override // s.g.c
        public int e() {
            return this.f21342a.getSessionType();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return Objects.equals(this.f21342a, ((a) obj).f21342a);
        }

        @Override // s.g.c
        public List<s.b> f() {
            return this.f21343b;
        }

        @Override // s.g.c
        public void g(CaptureRequest captureRequest) {
            this.f21342a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            return this.f21342a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements c {

        /* renamed from: a */
        private final List<s.b> f21344a;

        /* renamed from: b */
        private final CameraCaptureSession.StateCallback f21345b;

        /* renamed from: c */
        private final Executor f21346c;

        /* renamed from: d */
        private int f21347d;

        /* renamed from: e */
        private s.a f21348e = null;

        /* renamed from: f */
        private CaptureRequest f21349f = null;

        b(int i10, List<s.b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f21347d = i10;
            this.f21344a = Collections.unmodifiableList(new ArrayList(list));
            this.f21345b = stateCallback;
            this.f21346c = executor;
        }

        @Override // s.g.c
        public CameraCaptureSession.StateCallback a() {
            return this.f21345b;
        }

        @Override // s.g.c
        public s.a b() {
            return this.f21348e;
        }

        @Override // s.g.c
        public Executor c() {
            return this.f21346c;
        }

        @Override // s.g.c
        public Object d() {
            return null;
        }

        @Override // s.g.c
        public int e() {
            return this.f21347d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f21348e, bVar.f21348e) && this.f21347d == bVar.f21347d && this.f21344a.size() == bVar.f21344a.size()) {
                    for (int i10 = 0; i10 < this.f21344a.size(); i10++) {
                        if (!this.f21344a.get(i10).equals(bVar.f21344a.get(i10))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // s.g.c
        public List<s.b> f() {
            return this.f21344a;
        }

        @Override // s.g.c
        public void g(CaptureRequest captureRequest) {
            this.f21349f = captureRequest;
        }

        public int hashCode() {
            int hashCode = this.f21344a.hashCode() ^ 31;
            int i10 = (hashCode << 5) - hashCode;
            s.a aVar = this.f21348e;
            int hashCode2 = (aVar == null ? 0 : aVar.hashCode()) ^ i10;
            return this.f21347d ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        CameraCaptureSession.StateCallback a();

        s.a b();

        Executor c();

        Object d();

        int e();

        List<s.b> f();

        void g(CaptureRequest captureRequest);
    }

    public g(int i10, List<s.b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.f21341a = Build.VERSION.SDK_INT < 28 ? new b(i10, list, executor, stateCallback) : new a(i10, list, executor, stateCallback);
    }

    public static List<OutputConfiguration> g(List<s.b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (s.b bVar : list) {
            arrayList.add((OutputConfiguration) bVar.d());
        }
        return arrayList;
    }

    static List<s.b> h(List<OutputConfiguration> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (OutputConfiguration outputConfiguration : list) {
            arrayList.add(s.b.e(outputConfiguration));
        }
        return arrayList;
    }

    public Executor a() {
        return this.f21341a.c();
    }

    public s.a b() {
        return this.f21341a.b();
    }

    public List<s.b> c() {
        return this.f21341a.f();
    }

    public int d() {
        return this.f21341a.e();
    }

    public CameraCaptureSession.StateCallback e() {
        return this.f21341a.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f21341a.equals(((g) obj).f21341a);
    }

    public void f(CaptureRequest captureRequest) {
        this.f21341a.g(captureRequest);
    }

    public int hashCode() {
        return this.f21341a.hashCode();
    }

    public Object i() {
        return this.f21341a.d();
    }
}
