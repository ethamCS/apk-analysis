package l1;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import c6.a;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import y5.g;
import y5.i;
import z5.f;
/* loaded from: classes.dex */
public final class a implements SharedPreferences {

    /* renamed from: a */
    final SharedPreferences f15665a;

    /* renamed from: b */
    final List<SharedPreferences.OnSharedPreferenceChangeListener> f15666b = new ArrayList();

    /* renamed from: c */
    final String f15667c;

    /* renamed from: d */
    final String f15668d;

    /* renamed from: e */
    final y5.a f15669e;

    /* renamed from: f */
    final y5.d f15670f;

    /* renamed from: l1.a$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0237a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15671a;

        static {
            int[] iArr = new int[c.values().length];
            f15671a = iArr;
            try {
                iArr[c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15671a[c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15671a[c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15671a[c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15671a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15671a[c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements SharedPreferences.Editor {

        /* renamed from: a */
        private final a f15672a;

        /* renamed from: b */
        private final SharedPreferences.Editor f15673b;

        /* renamed from: d */
        private AtomicBoolean f15675d = new AtomicBoolean(false);

        /* renamed from: c */
        private final List<String> f15674c = new CopyOnWriteArrayList();

        b(a aVar, SharedPreferences.Editor editor) {
            this.f15672a = aVar;
            this.f15673b = editor;
        }

        private void a() {
            if (this.f15675d.getAndSet(false)) {
                for (String str : this.f15672a.getAll().keySet()) {
                    if (!this.f15674c.contains(str) && !this.f15672a.g(str)) {
                        this.f15673b.remove(this.f15672a.d(str));
                    }
                }
            }
        }

        private void b() {
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f15672a.f15666b) {
                for (String str : this.f15674c) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f15672a, str);
                }
            }
        }

        private void c(String str, byte[] bArr) {
            if (this.f15672a.g(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.f15674c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair<String, String> e10 = this.f15672a.e(str, bArr);
                this.f15673b.putString((String) e10.first, (String) e10.second);
            } catch (GeneralSecurityException e11) {
                throw new SecurityException("Could not encrypt data: " + e11.getMessage(), e11);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            a();
            this.f15673b.apply();
            b();
            this.f15674c.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f15675d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            a();
            try {
                return this.f15673b.commit();
            } finally {
                b();
                this.f15674c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z10) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(c.BOOLEAN.g());
            allocate.put(z10 ? (byte) 1 : (byte) 0);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f10) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.FLOAT.g());
            allocate.putFloat(f10);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i10) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.INT.g());
            allocate.putInt(i10);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j10) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(c.LONG.g());
            allocate.putLong(j10);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(c.STRING.g());
            allocate.putInt(length);
            allocate.put(bytes);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new i0.b<>();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            for (String str2 : set) {
                byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(c.STRING_SET.g());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f15672a.g(str)) {
                this.f15673b.remove(this.f15672a.d(str));
                this.f15674c.remove(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        

        /* renamed from: c */
        private final int f15680c;

        c(int i10) {
            this.f15680c = i10;
        }

        public static c b(int i10) {
            if (i10 != 0) {
                if (i10 == 1) {
                    return STRING_SET;
                }
                if (i10 == 2) {
                    return INT;
                }
                if (i10 == 3) {
                    return LONG;
                }
                if (i10 == 4) {
                    return FLOAT;
                }
                if (i10 == 5) {
                    return BOOLEAN;
                }
                return null;
            }
            return STRING;
        }

        public int g() {
            return this.f15680c;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        AES256_SIV(b6.a.j());
        

        /* renamed from: c */
        private final g f15683c;

        d(g gVar) {
            this.f15683c = gVar;
        }

        g b() {
            return this.f15683c;
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        AES256_GCM(f.j());
        

        /* renamed from: c */
        private final g f15686c;

        e(g gVar) {
            this.f15686c = gVar;
        }

        g b() {
            return this.f15686c;
        }
    }

    a(String str, String str2, SharedPreferences sharedPreferences, y5.a aVar, y5.d dVar) {
        this.f15667c = str;
        this.f15665a = sharedPreferences;
        this.f15668d = str2;
        this.f15669e = aVar;
        this.f15670f = dVar;
    }

    public static SharedPreferences a(Context context, String str, l1.b bVar, d dVar, e eVar) {
        return b(str, bVar.a(), context, dVar, eVar);
    }

    @Deprecated
    public static SharedPreferences b(String str, String str2, Context context, d dVar, e eVar) {
        b6.b.b();
        z5.a.b();
        Context applicationContext = context.getApplicationContext();
        a.b j10 = new a.b().h(dVar.b()).j(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str);
        i c10 = j10.i("android-keystore://" + str2).d().c();
        a.b j11 = new a.b().h(eVar.b()).j(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str);
        i c11 = j11.i("android-keystore://" + str2).d().c();
        y5.d dVar2 = (y5.d) c10.h(y5.d.class);
        return new a(str, str2, applicationContext.getSharedPreferences(str, 0), (y5.a) c11.h(y5.a.class), dVar2);
    }

    private Object f(String str) {
        if (g(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String d10 = d(str);
            String string = this.f15665a.getString(d10, null);
            if (string == null) {
                return null;
            }
            boolean z10 = false;
            ByteBuffer wrap = ByteBuffer.wrap(this.f15669e.b(g6.f.a(string, 0), d10.getBytes(StandardCharsets.UTF_8)));
            wrap.position(0);
            switch (C0237a.f15671a[c.b(wrap.getInt()).ordinal()]) {
                case 1:
                    int i10 = wrap.getInt();
                    ByteBuffer slice = wrap.slice();
                    wrap.limit(i10);
                    String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                    if (!charBuffer.equals("__NULL__")) {
                        return charBuffer;
                    }
                    return null;
                case 2:
                    return Integer.valueOf(wrap.getInt());
                case 3:
                    return Long.valueOf(wrap.getLong());
                case 4:
                    return Float.valueOf(wrap.getFloat());
                case 5:
                    if (wrap.get() != 0) {
                        z10 = true;
                    }
                    return Boolean.valueOf(z10);
                case 6:
                    i0.b bVar = new i0.b();
                    while (wrap.hasRemaining()) {
                        int i11 = wrap.getInt();
                        ByteBuffer slice2 = wrap.slice();
                        slice2.limit(i11);
                        wrap.position(wrap.position() + i11);
                        bVar.add(StandardCharsets.UTF_8.decode(slice2).toString());
                    }
                    if (bVar.size() == 1 && "__NULL__".equals(bVar.k(0))) {
                        return null;
                    }
                    return bVar;
                default:
                    return null;
            }
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not decrypt value. " + e10.getMessage(), e10);
        }
    }

    String c(String str) {
        try {
            String str2 = new String(this.f15670f.b(g6.f.a(str, 0), this.f15667c.getBytes()), StandardCharsets.UTF_8);
            if (!str2.equals("__NULL__")) {
                return str2;
            }
            return null;
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not decrypt key. " + e10.getMessage(), e10);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!g(str)) {
            return this.f15665a.contains(d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    String d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return g6.f.d(this.f15670f.a(str.getBytes(StandardCharsets.UTF_8), this.f15667c.getBytes()));
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not encrypt key. " + e10.getMessage(), e10);
        }
    }

    Pair<String, String> e(String str, byte[] bArr) {
        String d10 = d(str);
        return new Pair<>(d10, g6.f.d(this.f15669e.a(bArr, d10.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new b(this, this.f15665a.edit());
    }

    boolean g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.f15665a.getAll().entrySet()) {
            if (!g(entry.getKey())) {
                String c10 = c(entry.getKey());
                hashMap.put(c10, f(c10));
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z10) {
        Object f10 = f(str);
        return (f10 == null || !(f10 instanceof Boolean)) ? z10 : ((Boolean) f10).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f10) {
        Object f11 = f(str);
        return (f11 == null || !(f11 instanceof Float)) ? f10 : ((Float) f11).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i10) {
        Object f10 = f(str);
        return (f10 == null || !(f10 instanceof Integer)) ? i10 : ((Integer) f10).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j10) {
        Object f10 = f(str);
        return (f10 == null || !(f10 instanceof Long)) ? j10 : ((Long) f10).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object f10 = f(str);
        return (f10 == null || !(f10 instanceof String)) ? str2 : (String) f10;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Object f10 = f(str);
        Set<String> bVar = f10 instanceof Set ? (Set) f10 : new i0.b<>();
        return bVar.size() > 0 ? bVar : set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f15666b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f15666b.remove(onSharedPreferenceChangeListener);
    }
}
