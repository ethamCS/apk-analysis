package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a */
    static final Charset f7822a = Charset.forName("UTF-8");

    /* renamed from: b */
    static final Charset f7823b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f7824c;

    /* renamed from: d */
    public static final ByteBuffer f7825d;

    /* renamed from: e */
    public static final j f7826e;

    /* loaded from: classes.dex */
    public interface a extends i<Boolean> {
    }

    /* loaded from: classes.dex */
    public interface b extends i<Double> {
    }

    /* loaded from: classes.dex */
    public interface c {
        int c();
    }

    /* loaded from: classes.dex */
    public interface d<T extends c> {
        T a(int i10);
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a(int i10);
    }

    /* loaded from: classes.dex */
    public interface f extends i<Float> {
    }

    /* loaded from: classes.dex */
    public interface g extends i<Integer> {
    }

    /* loaded from: classes.dex */
    public interface h extends i<Long> {
    }

    /* loaded from: classes.dex */
    public interface i<E> extends List<E>, RandomAccess {
        boolean I();

        void p();

        i<E> t(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f7824c = bArr;
        f7825d = ByteBuffer.wrap(bArr);
        f7826e = j.f(bArr);
    }

    public static <T> T a(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static <T> T b(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i10, int i11) {
        int i12 = i(i11, bArr, i10, i11);
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return t1.m(bArr);
    }

    public static Object h(Object obj, Object obj2) {
        return ((s0) obj).g().n((s0) obj2).u();
    }

    public static int i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f7822a);
    }
}
