package io.ktor.utils.io.internal;

import hc.t;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0007\b\f\u0002\u0004\u0005\u0006\u0014B\u0019\b\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0002\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0004\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0006\u0010\u0003R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000f\u0082\u0001\u0007\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lio/ktor/utils/io/internal/g;", BuildConfig.FLAVOR, "c", "()Lio/ktor/utils/io/internal/g;", "d", "e", "f", "Ljava/nio/ByteBuffer;", "a", "Ljava/nio/ByteBuffer;", "backingBuffer", "Lio/ktor/utils/io/internal/i;", "b", "Lio/ktor/utils/io/internal/i;", "capacity", "()Ljava/nio/ByteBuffer;", "readBuffer", "writeBuffer", "<init>", "(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/internal/i;)V", "g", "Lio/ktor/utils/io/internal/g$a;", "Lio/ktor/utils/io/internal/g$c;", "Lio/ktor/utils/io/internal/g$b;", "Lio/ktor/utils/io/internal/g$d;", "Lio/ktor/utils/io/internal/g$g;", "Lio/ktor/utils/io/internal/g$e;", "Lio/ktor/utils/io/internal/g$f;", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a */
    public final ByteBuffer f12889a;

    /* renamed from: b */
    public final i f12890b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lio/ktor/utils/io/internal/g$a;", "Lio/ktor/utils/io/internal/g;", BuildConfig.FLAVOR, "toString", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends g {

        /* renamed from: c */
        public static final a f12891c = new a();

        private a() {
            super(h.a(), h.b(), null);
        }

        public String toString() {
            return "IDLE(empty)";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lio/ktor/utils/io/internal/g$b;", "Lio/ktor/utils/io/internal/g;", "Lio/ktor/utils/io/internal/g$d;", "h", "()Lio/ktor/utils/io/internal/g$d;", "Lio/ktor/utils/io/internal/g$g;", "i", "()Lio/ktor/utils/io/internal/g$g;", BuildConfig.FLAVOR, "toString", "Lio/ktor/utils/io/internal/g$c;", "c", "Lio/ktor/utils/io/internal/g$c;", "g", "()Lio/ktor/utils/io/internal/g$c;", "initial", "<init>", "(Lio/ktor/utils/io/internal/g$c;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends g {

        /* renamed from: c */
        private final c f12892c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar) {
            super(cVar.f12889a, cVar.f12890b, null);
            t.e(cVar, "initial");
            this.f12892c = cVar;
        }

        public final c g() {
            return this.f12892c;
        }

        /* renamed from: h */
        public d c() {
            return this.f12892c.h();
        }

        /* renamed from: i */
        public C0196g d() {
            return this.f12892c.j();
        }

        public String toString() {
            return "IDLE(with buffer)";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010%\u001a\u00020\n\u0012\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001e\u0010\u0007R\u001a\u0010$\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#¨\u0006*"}, d2 = {"Lio/ktor/utils/io/internal/g$c;", "Lio/ktor/utils/io/internal/g;", "Lio/ktor/utils/io/internal/g$d;", "k", "()Lio/ktor/utils/io/internal/g$d;", "Lio/ktor/utils/io/internal/g$g;", "l", "()Lio/ktor/utils/io/internal/g$g;", BuildConfig.FLAVOR, "toString", "Ljava/nio/ByteBuffer;", "c", "Ljava/nio/ByteBuffer;", "b", "()Ljava/nio/ByteBuffer;", "writeBuffer", "d", "a", "readBuffer", "Lio/ktor/utils/io/internal/g$b;", "e", "Lio/ktor/utils/io/internal/g$b;", "g", "()Lio/ktor/utils/io/internal/g$b;", "idleState", "f", "Lio/ktor/utils/io/internal/g$d;", "h", "readingState", "Lio/ktor/utils/io/internal/g$g;", "j", "writingState", "Lio/ktor/utils/io/internal/g$e;", "Lio/ktor/utils/io/internal/g$e;", "i", "()Lio/ktor/utils/io/internal/g$e;", "readingWritingState", "backingBuffer", BuildConfig.FLAVOR, "reservedSize", "<init>", "(Ljava/nio/ByteBuffer;I)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c extends g {

        /* renamed from: c */
        private final ByteBuffer f12893c;

        /* renamed from: d */
        private final ByteBuffer f12894d;

        /* renamed from: e */
        private final b f12895e;

        /* renamed from: f */
        private final d f12896f;

        /* renamed from: g */
        private final C0196g f12897g;

        /* renamed from: h */
        private final e f12898h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ByteBuffer byteBuffer, int i10) {
            super(byteBuffer, new i(byteBuffer.capacity() - i10), null);
            t.e(byteBuffer, "backingBuffer");
            boolean z10 = true;
            if (byteBuffer.position() == 0) {
                if (!(byteBuffer.limit() != byteBuffer.capacity() ? false : z10)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                ByteBuffer duplicate = byteBuffer.duplicate();
                t.d(duplicate, "backingBuffer.duplicate()");
                this.f12893c = duplicate;
                ByteBuffer duplicate2 = byteBuffer.duplicate();
                t.d(duplicate2, "backingBuffer.duplicate()");
                this.f12894d = duplicate2;
                this.f12895e = new b(this);
                this.f12896f = new d(this);
                this.f12897g = new C0196g(this);
                this.f12898h = new e(this);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public /* synthetic */ c(ByteBuffer byteBuffer, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(byteBuffer, (i11 & 2) != 0 ? 8 : i10);
        }

        @Override // io.ktor.utils.io.internal.g
        public ByteBuffer a() {
            return this.f12894d;
        }

        @Override // io.ktor.utils.io.internal.g
        public ByteBuffer b() {
            return this.f12893c;
        }

        public final b g() {
            return this.f12895e;
        }

        public final d h() {
            return this.f12896f;
        }

        public final e i() {
            return this.f12898h;
        }

        public final C0196g j() {
            return this.f12897g;
        }

        /* renamed from: k */
        public d c() {
            return this.f12896f;
        }

        /* renamed from: l */
        public C0196g d() {
            return this.f12897g;
        }

        public String toString() {
            return "Initial";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lio/ktor/utils/io/internal/g$d;", "Lio/ktor/utils/io/internal/g;", "Lio/ktor/utils/io/internal/g$e;", "g", "()Lio/ktor/utils/io/internal/g$e;", "Lio/ktor/utils/io/internal/g$b;", "h", "()Lio/ktor/utils/io/internal/g$b;", BuildConfig.FLAVOR, "toString", "Lio/ktor/utils/io/internal/g$c;", "c", "Lio/ktor/utils/io/internal/g$c;", "initial", "Ljava/nio/ByteBuffer;", "a", "()Ljava/nio/ByteBuffer;", "readBuffer", "<init>", "(Lio/ktor/utils/io/internal/g$c;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class d extends g {

        /* renamed from: c */
        private final c f12899c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(cVar.f12889a, cVar.f12890b, null);
            t.e(cVar, "initial");
            this.f12899c = cVar;
        }

        @Override // io.ktor.utils.io.internal.g
        public ByteBuffer a() {
            return this.f12899c.a();
        }

        /* renamed from: g */
        public e d() {
            return this.f12899c.i();
        }

        /* renamed from: h */
        public b e() {
            return this.f12899c.g();
        }

        public String toString() {
            return "Reading";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0016"}, d2 = {"Lio/ktor/utils/io/internal/g$e;", "Lio/ktor/utils/io/internal/g;", "Lio/ktor/utils/io/internal/g$g;", "g", "()Lio/ktor/utils/io/internal/g$g;", "Lio/ktor/utils/io/internal/g$d;", "h", "()Lio/ktor/utils/io/internal/g$d;", BuildConfig.FLAVOR, "toString", "Lio/ktor/utils/io/internal/g$c;", "c", "Lio/ktor/utils/io/internal/g$c;", "initial", "Ljava/nio/ByteBuffer;", "a", "()Ljava/nio/ByteBuffer;", "readBuffer", "b", "writeBuffer", "<init>", "(Lio/ktor/utils/io/internal/g$c;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class e extends g {

        /* renamed from: c */
        private final c f12900c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c cVar) {
            super(cVar.f12889a, cVar.f12890b, null);
            t.e(cVar, "initial");
            this.f12900c = cVar;
        }

        @Override // io.ktor.utils.io.internal.g
        public ByteBuffer a() {
            return this.f12900c.a();
        }

        @Override // io.ktor.utils.io.internal.g
        public ByteBuffer b() {
            return this.f12900c.b();
        }

        /* renamed from: g */
        public C0196g e() {
            return this.f12900c.j();
        }

        /* renamed from: h */
        public d f() {
            return this.f12900c.h();
        }

        public String toString() {
            return "Reading+Writing";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lio/ktor/utils/io/internal/g$f;", "Lio/ktor/utils/io/internal/g;", BuildConfig.FLAVOR, "toString", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class f extends g {

        /* renamed from: c */
        public static final f f12901c = new f();

        private f() {
            super(h.a(), h.b(), null);
        }

        public String toString() {
            return "Terminated";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lio/ktor/utils/io/internal/g$g;", "Lio/ktor/utils/io/internal/g;", "Lio/ktor/utils/io/internal/g$e;", "g", "()Lio/ktor/utils/io/internal/g$e;", "Lio/ktor/utils/io/internal/g$b;", "h", "()Lio/ktor/utils/io/internal/g$b;", BuildConfig.FLAVOR, "toString", "Lio/ktor/utils/io/internal/g$c;", "c", "Lio/ktor/utils/io/internal/g$c;", "initial", "Ljava/nio/ByteBuffer;", "b", "()Ljava/nio/ByteBuffer;", "writeBuffer", "<init>", "(Lio/ktor/utils/io/internal/g$c;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* renamed from: io.ktor.utils.io.internal.g$g */
    /* loaded from: classes.dex */
    public static final class C0196g extends g {

        /* renamed from: c */
        private final c f12902c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0196g(c cVar) {
            super(cVar.f12889a, cVar.f12890b, null);
            t.e(cVar, "initial");
            this.f12902c = cVar;
        }

        @Override // io.ktor.utils.io.internal.g
        public ByteBuffer b() {
            return this.f12902c.b();
        }

        /* renamed from: g */
        public e c() {
            return this.f12902c.i();
        }

        /* renamed from: h */
        public b f() {
            return this.f12902c.g();
        }

        public String toString() {
            return "Writing";
        }
    }

    private g(ByteBuffer byteBuffer, i iVar) {
        this.f12889a = byteBuffer;
        this.f12890b = iVar;
    }

    public /* synthetic */ g(ByteBuffer byteBuffer, i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, iVar);
    }

    public ByteBuffer a() {
        throw new IllegalStateException(t.l("read buffer is not available in state ", this).toString());
    }

    public ByteBuffer b() {
        throw new IllegalStateException(t.l("write buffer is not available in state ", this).toString());
    }

    public g c() {
        throw new IllegalStateException(t.l("Reading is not available in state ", this).toString());
    }

    public g d() {
        throw new IllegalStateException(t.l("Writing is not available in state ", this).toString());
    }

    public g e() {
        throw new IllegalStateException(t.l("Unable to stop reading in state ", this).toString());
    }

    public g f() {
        throw new IllegalStateException(t.l("Unable to stop writing in state ", this).toString());
    }
}
