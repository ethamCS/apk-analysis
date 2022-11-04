package rf;

import bf.k;
import bf.x;
import eg.a0;
import eg.i;
import eg.n;
import eg.y;
import gc.l;
import hc.t;
import hc.v;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import tb.e0;
import yf.h;
@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0004GHIJB9\b\u0000\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010A\u001a\u000201\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u0010B\u001a\u00020\u0016\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0006\u0010\u0011\u001a\u00020\u0003J\u000f\u0010\u0012\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\b\u0018\u00010\u0014R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0086\u0002J \u0010\u0019\u001a\b\u0018\u00010\u0018R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007J#\u0010\u001c\u001a\u00020\u00032\n\u0010\u001a\u001a\u00060\u0018R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007J\u001b\u0010!\u001a\u00020\u000b2\n\u0010 \u001a\u00060\u001fR\u00020\u0000H\u0000¢\u0006\u0004\b!\u0010\"J\b\u0010#\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J\u0006\u0010%\u001a\u00020\u0003J\u0006\u0010&\u001a\u00020\u0003R\u001a\u0010(\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00102\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R*\u00107\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\u001fR\u00020\u0000068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\"\u0010;\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006K"}, d2 = {"Lrf/d;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Ltb/e0;", "w0", "Leg/d;", "s0", BuildConfig.FLAVOR, "line", "z0", "u0", BuildConfig.FLAVOR, "j0", "r", "O0", "key", "V0", "h0", "D0", "()V", "Lrf/d$d;", "G", BuildConfig.FLAVOR, "expectedSequenceNumber", "Lrf/d$b;", "z", "editor", "success", "s", "(Lrf/d$b;Z)V", "K0", "Lrf/d$c;", "entry", "M0", "(Lrf/d$c;)Z", "flush", "close", "R0", "u", "Lxf/a;", "fileSystem", "Lxf/a;", "W", "()Lxf/a;", "Ljava/io/File;", "directory", "Ljava/io/File;", "V", "()Ljava/io/File;", BuildConfig.FLAVOR, "valueCount", "I", "f0", "()I", "Ljava/util/LinkedHashMap;", "lruEntries", "Ljava/util/LinkedHashMap;", "e0", "()Ljava/util/LinkedHashMap;", "closed", "Z", "M", "()Z", "setClosed$okhttp", "(Z)V", "appVersion", "maxSize", "Lsf/e;", "taskRunner", "<init>", "(Lxf/a;Ljava/io/File;IIJLsf/e;)V", "a", "b", "c", "d", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class d implements Closeable, Flushable {
    public static final a Companion = new a(null);

    /* renamed from: k4 */
    public static final String f21148k4 = "journal";

    /* renamed from: l4 */
    public static final String f21149l4 = "journal.tmp";

    /* renamed from: m4 */
    public static final String f21150m4 = "journal.bkp";

    /* renamed from: n4 */
    public static final String f21151n4 = "libcore.io.DiskLruCache";

    /* renamed from: o4 */
    public static final String f21152o4 = "1";

    /* renamed from: p4 */
    public static final long f21153p4 = -1;

    /* renamed from: q4 */
    public static final k f21154q4 = new k("[a-z0-9_-]{1,120}");

    /* renamed from: r4 */
    public static final String f21155r4 = "CLEAN";

    /* renamed from: s4 */
    public static final String f21156s4 = "DIRTY";

    /* renamed from: t4 */
    public static final String f21157t4 = "REMOVE";

    /* renamed from: u4 */
    public static final String f21158u4 = "READ";
    private final File U3;
    private final File V3;
    private final File W3;
    private long X3;
    private eg.d Y3;

    /* renamed from: a4 */
    private int f21159a4;

    /* renamed from: b4 */
    private boolean f21160b4;

    /* renamed from: c */
    private final xf.a f21161c;

    /* renamed from: c4 */
    private boolean f21162c4;

    /* renamed from: d */
    private final File f21163d;

    /* renamed from: d4 */
    private boolean f21164d4;

    /* renamed from: e4 */
    private boolean f21165e4;

    /* renamed from: f4 */
    private boolean f21166f4;

    /* renamed from: g4 */
    private boolean f21167g4;

    /* renamed from: h4 */
    private long f21168h4;

    /* renamed from: i4 */
    private final sf.d f21169i4;

    /* renamed from: q */
    private final int f21171q;

    /* renamed from: x */
    private final int f21172x;

    /* renamed from: y */
    private long f21173y;
    private final LinkedHashMap<String, c> Z3 = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: j4 */
    private final e f21170j4 = new e(t.l(pf.d.f19196i, " Cache"));

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007¨\u0006\u0015"}, d2 = {"Lrf/d$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "ANY_SEQUENCE_NUMBER", "J", BuildConfig.FLAVOR, "CLEAN", "Ljava/lang/String;", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "Lbf/k;", "LEGAL_KEY_PATTERN", "Lbf/k;", "MAGIC", "READ", "REMOVE", "VERSION_1", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\r\u001a\u00060\u000bR\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002R\u001e\u0010\r\u001a\u00060\u000bR\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lrf/d$b;", BuildConfig.FLAVOR, "Ltb/e0;", "c", "()V", BuildConfig.FLAVOR, "index", "Leg/y;", "f", "b", "a", "Lrf/d$c;", "Lrf/d;", "entry", "Lrf/d$c;", "d", "()Lrf/d$c;", BuildConfig.FLAVOR, "written", "[Z", "e", "()[Z", "<init>", "(Lrf/d;Lrf/d$c;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class b {

        /* renamed from: a */
        private final c f21174a;

        /* renamed from: b */
        private final boolean[] f21175b;

        /* renamed from: c */
        private boolean f21176c;

        /* renamed from: d */
        final /* synthetic */ d f21177d;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/IOException;", "it", "Ltb/e0;", "b", "(Ljava/io/IOException;)V"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes3.dex */
        public static final class a extends v implements l<IOException, e0> {

            /* renamed from: c */
            final /* synthetic */ d f21178c;

            /* renamed from: d */
            final /* synthetic */ b f21179d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, b bVar) {
                super(1);
                this.f21178c = dVar;
                this.f21179d = bVar;
            }

            public final void b(IOException iOException) {
                t.e(iOException, "it");
                d dVar = this.f21178c;
                b bVar = this.f21179d;
                synchronized (dVar) {
                    bVar.c();
                    e0 e0Var = e0.f22152a;
                }
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ e0 invoke(IOException iOException) {
                b(iOException);
                return e0.f22152a;
            }
        }

        public b(d dVar, c cVar) {
            t.e(dVar, "this$0");
            t.e(cVar, "entry");
            this.f21177d = dVar;
            this.f21174a = cVar;
            this.f21175b = cVar.g() ? null : new boolean[dVar.f0()];
        }

        public final void a() {
            d dVar = this.f21177d;
            synchronized (dVar) {
                if (!(!this.f21176c)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (t.a(d().b(), this)) {
                    dVar.s(this, false);
                }
                this.f21176c = true;
                e0 e0Var = e0.f22152a;
            }
        }

        public final void b() {
            d dVar = this.f21177d;
            synchronized (dVar) {
                if (!(!this.f21176c)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (t.a(d().b(), this)) {
                    dVar.s(this, true);
                }
                this.f21176c = true;
                e0 e0Var = e0.f22152a;
            }
        }

        public final void c() {
            if (t.a(this.f21174a.b(), this)) {
                if (this.f21177d.f21162c4) {
                    this.f21177d.s(this, false);
                } else {
                    this.f21174a.q(true);
                }
            }
        }

        public final c d() {
            return this.f21174a;
        }

        public final boolean[] e() {
            return this.f21175b;
        }

        public final y f(int i10) {
            d dVar = this.f21177d;
            synchronized (dVar) {
                if (!this.f21176c) {
                    if (!t.a(d().b(), this)) {
                        return n.b();
                    }
                    if (!d().g()) {
                        boolean[] e10 = e();
                        t.b(e10);
                        e10[i10] = true;
                    }
                    try {
                        return new rf.e(dVar.W().c(d().c().get(i10)), new a(dVar, this));
                    } catch (FileNotFoundException unused) {
                        return n.b();
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\t\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\bE\u0010FJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0018\u00010\u0012R\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\"\u0010(\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010.\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R(\u00102\u001a\b\u0018\u000101R\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00108\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010?\u001a\u00020>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lrf/d$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "strings", BuildConfig.FLAVOR, "j", BuildConfig.FLAVOR, "index", "Leg/a0;", "k", "Ltb/e0;", "m", "(Ljava/util/List;)V", "Leg/d;", "writer", "s", "(Leg/d;)V", "Lrf/d$d;", "Lrf/d;", "r", "()Lrf/d$d;", "key", "Ljava/lang/String;", "d", "()Ljava/lang/String;", BuildConfig.FLAVOR, "lengths", "[J", "e", "()[J", BuildConfig.FLAVOR, "Ljava/io/File;", "cleanFiles", "Ljava/util/List;", "a", "()Ljava/util/List;", "dirtyFiles", "c", BuildConfig.FLAVOR, "readable", "Z", "g", "()Z", "o", "(Z)V", "zombie", "i", "q", "Lrf/d$b;", "currentEditor", "Lrf/d$b;", "b", "()Lrf/d$b;", "l", "(Lrf/d$b;)V", "lockingSourceCount", "I", "f", "()I", "n", "(I)V", BuildConfig.FLAVOR, "sequenceNumber", "J", "h", "()J", "p", "(J)V", "<init>", "(Lrf/d;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class c {

        /* renamed from: a */
        private final String f21180a;

        /* renamed from: b */
        private final long[] f21181b;

        /* renamed from: c */
        private final List<File> f21182c = new ArrayList();

        /* renamed from: d */
        private final List<File> f21183d = new ArrayList();

        /* renamed from: e */
        private boolean f21184e;

        /* renamed from: f */
        private boolean f21185f;

        /* renamed from: g */
        private b f21186g;

        /* renamed from: h */
        private int f21187h;

        /* renamed from: i */
        private long f21188i;

        /* renamed from: j */
        final /* synthetic */ d f21189j;

        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"rf/d$c$a", "Leg/i;", "Ltb/e0;", "close", "okhttp"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes3.dex */
        public static final class a extends i {

            /* renamed from: d */
            private boolean f21190d;

            /* renamed from: q */
            final /* synthetic */ a0 f21191q;

            /* renamed from: x */
            final /* synthetic */ d f21192x;

            /* renamed from: y */
            final /* synthetic */ c f21193y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a0 a0Var, d dVar, c cVar) {
                super(a0Var);
                this.f21191q = a0Var;
                this.f21192x = dVar;
                this.f21193y = cVar;
            }

            @Override // eg.i, eg.a0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                if (!this.f21190d) {
                    this.f21190d = true;
                    d dVar = this.f21192x;
                    c cVar = this.f21193y;
                    synchronized (dVar) {
                        cVar.n(cVar.f() - 1);
                        if (cVar.f() == 0 && cVar.i()) {
                            dVar.M0(cVar);
                        }
                        e0 e0Var = e0.f22152a;
                    }
                }
            }
        }

        public c(d dVar, String str) {
            t.e(dVar, "this$0");
            t.e(str, "key");
            this.f21189j = dVar;
            this.f21180a = str;
            this.f21181b = new long[dVar.f0()];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int f02 = dVar.f0();
            for (int i10 = 0; i10 < f02; i10++) {
                sb2.append(i10);
                this.f21182c.add(new File(this.f21189j.V(), sb2.toString()));
                sb2.append(".tmp");
                this.f21183d.add(new File(this.f21189j.V(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        private final Void j(List<String> list) {
            throw new IOException(t.l("unexpected journal line: ", list));
        }

        private final a0 k(int i10) {
            a0 b10 = this.f21189j.W().b(this.f21182c.get(i10));
            if (this.f21189j.f21162c4) {
                return b10;
            }
            this.f21187h++;
            return new a(b10, this.f21189j, this);
        }

        public final List<File> a() {
            return this.f21182c;
        }

        public final b b() {
            return this.f21186g;
        }

        public final List<File> c() {
            return this.f21183d;
        }

        public final String d() {
            return this.f21180a;
        }

        public final long[] e() {
            return this.f21181b;
        }

        public final int f() {
            return this.f21187h;
        }

        public final boolean g() {
            return this.f21184e;
        }

        public final long h() {
            return this.f21188i;
        }

        public final boolean i() {
            return this.f21185f;
        }

        public final void l(b bVar) {
            this.f21186g = bVar;
        }

        public final void m(List<String> list) {
            t.e(list, "strings");
            if (list.size() != this.f21189j.f0()) {
                j(list);
                throw new tb.i();
            }
            int i10 = 0;
            try {
                int size = list.size();
                while (i10 < size) {
                    int i11 = i10 + 1;
                    this.f21181b[i10] = Long.parseLong(list.get(i10));
                    i10 = i11;
                }
            } catch (NumberFormatException unused) {
                j(list);
                throw new tb.i();
            }
        }

        public final void n(int i10) {
            this.f21187h = i10;
        }

        public final void o(boolean z10) {
            this.f21184e = z10;
        }

        public final void p(long j10) {
            this.f21188i = j10;
        }

        public final void q(boolean z10) {
            this.f21185f = z10;
        }

        public final C0347d r() {
            d dVar = this.f21189j;
            if (pf.d.f19195h && !Thread.holdsLock(dVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + dVar);
            } else if (!this.f21184e) {
                return null;
            } else {
                if (!this.f21189j.f21162c4 && (this.f21186g != null || this.f21185f)) {
                    return null;
                }
                ArrayList<a0> arrayList = new ArrayList();
                long[] jArr = (long[]) this.f21181b.clone();
                try {
                    int f02 = this.f21189j.f0();
                    for (int i10 = 0; i10 < f02; i10++) {
                        arrayList.add(k(i10));
                    }
                    return new C0347d(this.f21189j, this.f21180a, this.f21188i, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    for (a0 a0Var : arrayList) {
                        pf.d.m(a0Var);
                    }
                    try {
                        this.f21189j.M0(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
        }

        public final void s(eg.d dVar) {
            t.e(dVar, "writer");
            long[] jArr = this.f21181b;
            int length = jArr.length;
            int i10 = 0;
            while (i10 < length) {
                long j10 = jArr[i10];
                i10++;
                dVar.i0(32).T0(j10);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\f\u0010\u0004\u001a\b\u0018\u00010\u0002R\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0015"}, d2 = {"Lrf/d$d;", "Ljava/io/Closeable;", "Lrf/d$b;", "Lrf/d;", "b", BuildConfig.FLAVOR, "index", "Leg/a0;", "e", "Ltb/e0;", "close", BuildConfig.FLAVOR, "key", BuildConfig.FLAVOR, "sequenceNumber", BuildConfig.FLAVOR, "sources", BuildConfig.FLAVOR, "lengths", "<init>", "(Lrf/d;Ljava/lang/String;JLjava/util/List;[J)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* renamed from: rf.d$d */
    /* loaded from: classes3.dex */
    public final class C0347d implements Closeable {

        /* renamed from: c */
        private final String f21194c;

        /* renamed from: d */
        private final long f21195d;

        /* renamed from: q */
        private final List<a0> f21196q;

        /* renamed from: x */
        private final long[] f21197x;

        /* renamed from: y */
        final /* synthetic */ d f21198y;

        /* JADX WARN: Multi-variable type inference failed */
        public C0347d(d dVar, String str, long j10, List<? extends a0> list, long[] jArr) {
            t.e(dVar, "this$0");
            t.e(str, "key");
            t.e(list, "sources");
            t.e(jArr, "lengths");
            this.f21198y = dVar;
            this.f21194c = str;
            this.f21195d = j10;
            this.f21196q = list;
            this.f21197x = jArr;
        }

        public final b b() {
            return this.f21198y.z(this.f21194c, this.f21195d);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (a0 a0Var : this.f21196q) {
                pf.d.m(a0Var);
            }
        }

        public final a0 e(int i10) {
            return this.f21196q.get(i10);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"rf/d$e", "Lsf/a;", BuildConfig.FLAVOR, "f", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class e extends sf.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(str, false, 2, null);
            d.this = r3;
        }

        @Override // sf.a
        public long f() {
            d dVar = d.this;
            synchronized (dVar) {
                if (!dVar.f21164d4 || dVar.M()) {
                    return -1L;
                }
                try {
                    dVar.R0();
                } catch (IOException unused) {
                    dVar.f21166f4 = true;
                }
                try {
                    if (dVar.j0()) {
                        dVar.D0();
                        dVar.f21159a4 = 0;
                    }
                } catch (IOException unused2) {
                    dVar.f21167g4 = true;
                    dVar.Y3 = n.c(n.b());
                }
                return -1L;
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/IOException;", "it", "Ltb/e0;", "b", "(Ljava/io/IOException;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class f extends v implements l<IOException, e0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f() {
            super(1);
            d.this = r1;
        }

        public final void b(IOException iOException) {
            t.e(iOException, "it");
            d dVar = d.this;
            if (!pf.d.f19195h || Thread.holdsLock(dVar)) {
                d.this.f21160b4 = true;
                return;
            }
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + dVar);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(IOException iOException) {
            b(iOException);
            return e0.f22152a;
        }
    }

    public d(xf.a aVar, File file, int i10, int i11, long j10, sf.e eVar) {
        t.e(aVar, "fileSystem");
        t.e(file, "directory");
        t.e(eVar, "taskRunner");
        this.f21161c = aVar;
        this.f21163d = file;
        this.f21171q = i10;
        this.f21172x = i11;
        this.f21173y = j10;
        boolean z10 = false;
        this.f21169i4 = eVar.i();
        if (j10 > 0) {
            if (!(i11 > 0 ? true : z10)) {
                throw new IllegalArgumentException("valueCount <= 0".toString());
            }
            this.U3 = new File(file, f21148k4);
            this.V3 = new File(file, f21149l4);
            this.W3 = new File(file, f21150m4);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    public static /* synthetic */ b B(d dVar, String str, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = f21153p4;
        }
        return dVar.z(str, j10);
    }

    private final boolean O0() {
        for (c cVar : this.Z3.values()) {
            if (!cVar.i()) {
                t.d(cVar, "toEvict");
                M0(cVar);
                return true;
            }
        }
        return false;
    }

    private final void V0(String str) {
        if (f21154q4.h(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public final boolean j0() {
        int i10 = this.f21159a4;
        return i10 >= 2000 && i10 >= this.Z3.size();
    }

    private final synchronized void r() {
        if (!(!this.f21165e4)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    private final eg.d s0() {
        return n.c(new rf.e(this.f21161c.e(this.U3), new f()));
    }

    private final void u0() {
        this.f21161c.a(this.V3);
        Iterator<c> it = this.Z3.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            t.d(next, "i.next()");
            c cVar = next;
            int i10 = 0;
            if (cVar.b() == null) {
                int i11 = this.f21172x;
                while (i10 < i11) {
                    this.X3 += cVar.e()[i10];
                    i10++;
                }
            } else {
                cVar.l(null);
                int i12 = this.f21172x;
                while (i10 < i12) {
                    this.f21161c.a(cVar.a().get(i10));
                    this.f21161c.a(cVar.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private final void w0() {
        eg.e d10 = n.d(this.f21161c.b(this.U3));
        try {
            String b02 = d10.b0();
            String b03 = d10.b0();
            String b04 = d10.b0();
            String b05 = d10.b0();
            String b06 = d10.b0();
            if (t.a(f21151n4, b02) && t.a(f21152o4, b03) && t.a(String.valueOf(this.f21171q), b04) && t.a(String.valueOf(f0()), b05)) {
                int i10 = 0;
                if (!(b06.length() > 0)) {
                    while (true) {
                        try {
                            z0(d10.b0());
                            i10++;
                        } catch (EOFException unused) {
                            this.f21159a4 = i10 - e0().size();
                            if (!d10.g0()) {
                                D0();
                            } else {
                                this.Y3 = s0();
                            }
                            e0 e0Var = e0.f22152a;
                            th = null;
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + b02 + ", " + b03 + ", " + b05 + ", " + b06 + ']');
        } finally {
        }
    }

    private final void z0(String str) {
        int Z;
        int Z2;
        String str2;
        boolean I;
        boolean I2;
        boolean I3;
        List<String> x02;
        boolean I4;
        Z = bf.y.Z(str, ' ', 0, false, 6, null);
        if (Z != -1) {
            int i10 = Z + 1;
            Z2 = bf.y.Z(str, ' ', i10, false, 4, null);
            if (Z2 == -1) {
                str2 = str.substring(i10);
                t.d(str2, "this as java.lang.String).substring(startIndex)");
                String str3 = f21157t4;
                if (Z == str3.length()) {
                    I4 = x.I(str, str3, false, 2, null);
                    if (I4) {
                        this.Z3.remove(str2);
                        return;
                    }
                }
            } else {
                str2 = str.substring(i10, Z2);
                t.d(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            c cVar = this.Z3.get(str2);
            if (cVar == null) {
                cVar = new c(this, str2);
                this.Z3.put(str2, cVar);
            }
            if (Z2 != -1) {
                String str4 = f21155r4;
                if (Z == str4.length()) {
                    I3 = x.I(str, str4, false, 2, null);
                    if (I3) {
                        String substring = str.substring(Z2 + 1);
                        t.d(substring, "this as java.lang.String).substring(startIndex)");
                        x02 = bf.y.x0(substring, new char[]{' '}, false, 0, 6, null);
                        cVar.o(true);
                        cVar.l(null);
                        cVar.m(x02);
                        return;
                    }
                }
            }
            if (Z2 == -1) {
                String str5 = f21156s4;
                if (Z == str5.length()) {
                    I2 = x.I(str, str5, false, 2, null);
                    if (I2) {
                        cVar.l(new b(this, cVar));
                        return;
                    }
                }
            }
            if (Z2 == -1) {
                String str6 = f21158u4;
                if (Z == str6.length()) {
                    I = x.I(str, str6, false, 2, null);
                    if (I) {
                        return;
                    }
                }
            }
            throw new IOException(t.l("unexpected journal line: ", str));
        }
        throw new IOException(t.l("unexpected journal line: ", str));
    }

    public final synchronized void D0() {
        eg.d dVar = this.Y3;
        if (dVar != null) {
            dVar.close();
        }
        eg.d c10 = n.c(this.f21161c.c(this.V3));
        c10.Q0(f21151n4).i0(10);
        c10.Q0(f21152o4).i0(10);
        c10.T0(this.f21171q).i0(10);
        c10.T0(f0()).i0(10);
        c10.i0(10);
        for (c cVar : e0().values()) {
            if (cVar.b() != null) {
                c10.Q0(f21156s4).i0(32);
                c10.Q0(cVar.d());
            } else {
                c10.Q0(f21155r4).i0(32);
                c10.Q0(cVar.d());
                cVar.s(c10);
            }
            c10.i0(10);
        }
        e0 e0Var = e0.f22152a;
        dc.b.a(c10, null);
        if (this.f21161c.f(this.U3)) {
            this.f21161c.g(this.U3, this.W3);
        }
        this.f21161c.g(this.V3, this.U3);
        this.f21161c.a(this.W3);
        this.Y3 = s0();
        this.f21160b4 = false;
        this.f21167g4 = false;
    }

    public final synchronized C0347d G(String str) {
        t.e(str, "key");
        h0();
        r();
        V0(str);
        c cVar = this.Z3.get(str);
        if (cVar == null) {
            return null;
        }
        C0347d r10 = cVar.r();
        if (r10 == null) {
            return null;
        }
        this.f21159a4++;
        eg.d dVar = this.Y3;
        t.b(dVar);
        dVar.Q0(f21158u4).i0(32).Q0(str).i0(10);
        if (j0()) {
            sf.d.j(this.f21169i4, this.f21170j4, 0L, 2, null);
        }
        return r10;
    }

    public final synchronized boolean K0(String str) {
        t.e(str, "key");
        h0();
        r();
        V0(str);
        c cVar = this.Z3.get(str);
        if (cVar == null) {
            return false;
        }
        boolean M0 = M0(cVar);
        if (M0 && this.X3 <= this.f21173y) {
            this.f21166f4 = false;
        }
        return M0;
    }

    public final boolean M() {
        return this.f21165e4;
    }

    public final boolean M0(c cVar) {
        eg.d dVar;
        t.e(cVar, "entry");
        if (!this.f21162c4) {
            if (cVar.f() > 0 && (dVar = this.Y3) != null) {
                dVar.Q0(f21156s4);
                dVar.i0(32);
                dVar.Q0(cVar.d());
                dVar.i0(10);
                dVar.flush();
            }
            if (cVar.f() > 0 || cVar.b() != null) {
                cVar.q(true);
                return true;
            }
        }
        b b10 = cVar.b();
        if (b10 != null) {
            b10.c();
        }
        int i10 = this.f21172x;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f21161c.a(cVar.a().get(i11));
            this.X3 -= cVar.e()[i11];
            cVar.e()[i11] = 0;
        }
        this.f21159a4++;
        eg.d dVar2 = this.Y3;
        if (dVar2 != null) {
            dVar2.Q0(f21157t4);
            dVar2.i0(32);
            dVar2.Q0(cVar.d());
            dVar2.i0(10);
        }
        this.Z3.remove(cVar.d());
        if (j0()) {
            sf.d.j(this.f21169i4, this.f21170j4, 0L, 2, null);
        }
        return true;
    }

    public final void R0() {
        while (this.X3 > this.f21173y) {
            if (!O0()) {
                return;
            }
        }
        this.f21166f4 = false;
    }

    public final File V() {
        return this.f21163d;
    }

    public final xf.a W() {
        return this.f21161c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        b b10;
        if (this.f21164d4 && !this.f21165e4) {
            Collection<c> values = this.Z3.values();
            t.d(values, "lruEntries.values");
            int i10 = 0;
            Object[] array = values.toArray(new c[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c[] cVarArr = (c[]) array;
            int length = cVarArr.length;
            while (i10 < length) {
                c cVar = cVarArr[i10];
                i10++;
                if (cVar.b() != null && (b10 = cVar.b()) != null) {
                    b10.c();
                }
            }
            R0();
            eg.d dVar = this.Y3;
            t.b(dVar);
            dVar.close();
            this.Y3 = null;
            this.f21165e4 = true;
            return;
        }
        this.f21165e4 = true;
    }

    public final LinkedHashMap<String, c> e0() {
        return this.Z3;
    }

    public final int f0() {
        return this.f21172x;
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (!this.f21164d4) {
            return;
        }
        r();
        R0();
        eg.d dVar = this.Y3;
        t.b(dVar);
        dVar.flush();
    }

    public final synchronized void h0() {
        if (pf.d.f19195h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (this.f21164d4) {
            return;
        }
        if (this.f21161c.f(this.W3)) {
            if (this.f21161c.f(this.U3)) {
                this.f21161c.a(this.W3);
            } else {
                this.f21161c.g(this.W3, this.U3);
            }
        }
        this.f21162c4 = pf.d.F(this.f21161c, this.W3);
        if (this.f21161c.f(this.U3)) {
            try {
                w0();
                u0();
                this.f21164d4 = true;
                return;
            } catch (IOException e10) {
                h g10 = h.Companion.g();
                g10.k("DiskLruCache " + this.f21163d + " is corrupt: " + ((Object) e10.getMessage()) + ", removing", 5, e10);
                u();
                this.f21165e4 = false;
            }
        }
        D0();
        this.f21164d4 = true;
    }

    public final synchronized void s(b bVar, boolean z10) {
        t.e(bVar, "editor");
        c d10 = bVar.d();
        if (t.a(d10.b(), bVar)) {
            int i10 = 0;
            if (z10 && !d10.g()) {
                int i11 = this.f21172x;
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = i12 + 1;
                    boolean[] e10 = bVar.e();
                    t.b(e10);
                    if (!e10[i12]) {
                        bVar.a();
                        throw new IllegalStateException(t.l("Newly created entry didn't create value for index ", Integer.valueOf(i12)));
                    } else if (!this.f21161c.f(d10.c().get(i12))) {
                        bVar.a();
                        return;
                    } else {
                        i12 = i13;
                    }
                }
            }
            int i14 = this.f21172x;
            while (i10 < i14) {
                int i15 = i10 + 1;
                File file = d10.c().get(i10);
                if (!z10 || d10.i()) {
                    this.f21161c.a(file);
                } else if (this.f21161c.f(file)) {
                    File file2 = d10.a().get(i10);
                    this.f21161c.g(file, file2);
                    long j10 = d10.e()[i10];
                    long h10 = this.f21161c.h(file2);
                    d10.e()[i10] = h10;
                    this.X3 = (this.X3 - j10) + h10;
                }
                i10 = i15;
            }
            d10.l(null);
            if (d10.i()) {
                M0(d10);
                return;
            }
            this.f21159a4++;
            eg.d dVar = this.Y3;
            t.b(dVar);
            if (!d10.g() && !z10) {
                e0().remove(d10.d());
                dVar.Q0(f21157t4).i0(32);
                dVar.Q0(d10.d());
                dVar.i0(10);
                dVar.flush();
                if (this.X3 <= this.f21173y || j0()) {
                    sf.d.j(this.f21169i4, this.f21170j4, 0L, 2, null);
                }
                return;
            }
            d10.o(true);
            dVar.Q0(f21155r4).i0(32);
            dVar.Q0(d10.d());
            d10.s(dVar);
            dVar.i0(10);
            if (z10) {
                long j11 = this.f21168h4;
                this.f21168h4 = 1 + j11;
                d10.p(j11);
            }
            dVar.flush();
            if (this.X3 <= this.f21173y) {
            }
            sf.d.j(this.f21169i4, this.f21170j4, 0L, 2, null);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void u() {
        close();
        this.f21161c.d(this.f21163d);
    }

    public final synchronized b z(String str, long j10) {
        t.e(str, "key");
        h0();
        r();
        V0(str);
        c cVar = this.Z3.get(str);
        if (j10 == f21153p4 || (cVar != null && cVar.h() == j10)) {
            if ((cVar == null ? null : cVar.b()) != null) {
                return null;
            }
            if (cVar != null && cVar.f() != 0) {
                return null;
            }
            if (!this.f21166f4 && !this.f21167g4) {
                eg.d dVar = this.Y3;
                t.b(dVar);
                dVar.Q0(f21156s4).i0(32).Q0(str).i0(10);
                dVar.flush();
                if (this.f21160b4) {
                    return null;
                }
                if (cVar == null) {
                    cVar = new c(this, str);
                    this.Z3.put(str, cVar);
                }
                b bVar = new b(this, cVar);
                cVar.l(bVar);
                return bVar;
            }
            sf.d.j(this.f21169i4, this.f21170j4, 0L, 2, null);
            return null;
        }
        return null;
    }
}
