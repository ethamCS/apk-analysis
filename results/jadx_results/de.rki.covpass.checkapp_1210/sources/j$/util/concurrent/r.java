package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;
/* loaded from: classes2.dex */
public final class r extends m {

    /* renamed from: h */
    private static final Unsafe f13330h;

    /* renamed from: i */
    private static final long f13331i;

    /* renamed from: e */
    s f13332e;

    /* renamed from: f */
    volatile s f13333f;

    /* renamed from: g */
    volatile Thread f13334g;
    volatile int lockState;

    static {
        try {
            Unsafe c10 = w.c();
            f13330h = c10;
            f13331i = c10.objectFieldOffset(r.class.getDeclaredField("lockState"));
        } catch (Exception e10) {
            throw new Error(e10);
        }
    }

    public r(s sVar) {
        super(-2, null, null, null);
        int j10;
        int compareComparables;
        this.f13333f = sVar;
        s sVar2 = null;
        while (sVar != null) {
            s sVar3 = (s) sVar.f13317d;
            sVar.f13337g = null;
            sVar.f13336f = null;
            if (sVar2 == null) {
                sVar.f13335e = null;
                sVar.f13339i = false;
            } else {
                Object obj = sVar.f13315b;
                int i10 = sVar.f13314a;
                s sVar4 = sVar2;
                Class<?> cls = null;
                while (true) {
                    Object obj2 = sVar4.f13315b;
                    int i11 = sVar4.f13314a;
                    j10 = i11 > i10 ? -1 : i11 < i10 ? 1 : ((cls == null && (cls = ConcurrentHashMap.comparableClassFor(obj)) == null) || (compareComparables = ConcurrentHashMap.compareComparables(cls, obj, obj2)) == 0) ? j(obj, obj2) : compareComparables;
                    s sVar5 = j10 <= 0 ? sVar4.f13336f : sVar4.f13337g;
                    if (sVar5 == null) {
                        break;
                    }
                    sVar4 = sVar5;
                }
                sVar.f13335e = sVar4;
                if (j10 <= 0) {
                    sVar4.f13336f = sVar;
                } else {
                    sVar4.f13337g = sVar;
                }
                sVar = c(sVar2, sVar);
            }
            sVar2 = sVar;
            sVar = sVar3;
        }
        this.f13332e = sVar2;
    }

    static s b(s sVar, s sVar2) {
        while (sVar2 != null && sVar2 != sVar) {
            s sVar3 = sVar2.f13335e;
            if (sVar3 == null) {
                sVar2.f13339i = false;
                return sVar2;
            } else if (sVar2.f13339i) {
                sVar2.f13339i = false;
                return sVar;
            } else {
                s sVar4 = sVar3.f13336f;
                s sVar5 = null;
                if (sVar4 == sVar2) {
                    sVar4 = sVar3.f13337g;
                    if (sVar4 != null && sVar4.f13339i) {
                        sVar4.f13339i = false;
                        sVar3.f13339i = true;
                        sVar = h(sVar, sVar3);
                        sVar3 = sVar2.f13335e;
                        sVar4 = sVar3 == null ? null : sVar3.f13337g;
                    }
                    if (sVar4 == null) {
                        sVar2 = sVar3;
                    } else {
                        s sVar6 = sVar4.f13336f;
                        s sVar7 = sVar4.f13337g;
                        if ((sVar7 != null && sVar7.f13339i) || (sVar6 != null && sVar6.f13339i)) {
                            if (sVar7 == null || !sVar7.f13339i) {
                                if (sVar6 != null) {
                                    sVar6.f13339i = false;
                                }
                                sVar4.f13339i = true;
                                sVar = i(sVar, sVar4);
                                sVar3 = sVar2.f13335e;
                                if (sVar3 != null) {
                                    sVar5 = sVar3.f13337g;
                                }
                                sVar4 = sVar5;
                            }
                            if (sVar4 != null) {
                                sVar4.f13339i = sVar3 == null ? false : sVar3.f13339i;
                                s sVar8 = sVar4.f13337g;
                                if (sVar8 != null) {
                                    sVar8.f13339i = false;
                                }
                            }
                            if (sVar3 != null) {
                                sVar3.f13339i = false;
                                sVar = h(sVar, sVar3);
                            }
                            sVar2 = sVar;
                            sVar = sVar2;
                        }
                        sVar4.f13339i = true;
                        sVar2 = sVar3;
                    }
                } else {
                    if (sVar4 != null && sVar4.f13339i) {
                        sVar4.f13339i = false;
                        sVar3.f13339i = true;
                        sVar = i(sVar, sVar3);
                        sVar3 = sVar2.f13335e;
                        sVar4 = sVar3 == null ? null : sVar3.f13336f;
                    }
                    if (sVar4 == null) {
                        sVar2 = sVar3;
                    } else {
                        s sVar9 = sVar4.f13336f;
                        s sVar10 = sVar4.f13337g;
                        if ((sVar9 != null && sVar9.f13339i) || (sVar10 != null && sVar10.f13339i)) {
                            if (sVar9 == null || !sVar9.f13339i) {
                                if (sVar10 != null) {
                                    sVar10.f13339i = false;
                                }
                                sVar4.f13339i = true;
                                sVar = h(sVar, sVar4);
                                sVar3 = sVar2.f13335e;
                                if (sVar3 != null) {
                                    sVar5 = sVar3.f13336f;
                                }
                                sVar4 = sVar5;
                            }
                            if (sVar4 != null) {
                                sVar4.f13339i = sVar3 == null ? false : sVar3.f13339i;
                                s sVar11 = sVar4.f13336f;
                                if (sVar11 != null) {
                                    sVar11.f13339i = false;
                                }
                            }
                            if (sVar3 != null) {
                                sVar3.f13339i = false;
                                sVar = i(sVar, sVar3);
                            }
                            sVar2 = sVar;
                            sVar = sVar2;
                        }
                        sVar4.f13339i = true;
                        sVar2 = sVar3;
                    }
                }
            }
        }
        return sVar;
    }

    static s c(s sVar, s sVar2) {
        s sVar3;
        sVar2.f13339i = true;
        while (true) {
            s sVar4 = sVar2.f13335e;
            if (sVar4 == null) {
                sVar2.f13339i = false;
                return sVar2;
            } else if (!sVar4.f13339i || (sVar3 = sVar4.f13335e) == null) {
                break;
            } else {
                s sVar5 = sVar3.f13336f;
                if (sVar4 == sVar5) {
                    sVar5 = sVar3.f13337g;
                    if (sVar5 == null || !sVar5.f13339i) {
                        if (sVar2 == sVar4.f13337g) {
                            sVar = h(sVar, sVar4);
                            s sVar6 = sVar4.f13335e;
                            sVar3 = sVar6 == null ? null : sVar6.f13335e;
                            sVar4 = sVar6;
                            sVar2 = sVar4;
                        }
                        if (sVar4 != null) {
                            sVar4.f13339i = false;
                            if (sVar3 != null) {
                                sVar3.f13339i = true;
                                sVar = i(sVar, sVar3);
                            }
                        }
                    } else {
                        sVar5.f13339i = false;
                        sVar4.f13339i = false;
                        sVar3.f13339i = true;
                        sVar2 = sVar3;
                    }
                } else if (sVar5 == null || !sVar5.f13339i) {
                    if (sVar2 == sVar4.f13336f) {
                        sVar = i(sVar, sVar4);
                        s sVar7 = sVar4.f13335e;
                        sVar3 = sVar7 == null ? null : sVar7.f13335e;
                        sVar4 = sVar7;
                        sVar2 = sVar4;
                    }
                    if (sVar4 != null) {
                        sVar4.f13339i = false;
                        if (sVar3 != null) {
                            sVar3.f13339i = true;
                            sVar = h(sVar, sVar3);
                        }
                    }
                } else {
                    sVar5.f13339i = false;
                    sVar4.f13339i = false;
                    sVar3.f13339i = true;
                    sVar2 = sVar3;
                }
            }
        }
        return sVar;
    }

    private final void d() {
        boolean z10 = false;
        while (true) {
            int i10 = this.lockState;
            if ((i10 & (-3)) == 0) {
                if (f13330h.compareAndSwapInt(this, f13331i, i10, 1)) {
                    break;
                }
            } else if ((i10 & 2) == 0) {
                if (f13330h.compareAndSwapInt(this, f13331i, i10, i10 | 2)) {
                    z10 = true;
                    this.f13334g = Thread.currentThread();
                }
            } else if (z10) {
                LockSupport.park(this);
            }
        }
        if (z10) {
            this.f13334g = null;
        }
    }

    private final void e() {
        if (!f13330h.compareAndSwapInt(this, f13331i, 0, 1)) {
            d();
        }
    }

    static s h(s sVar, s sVar2) {
        s sVar3 = sVar2.f13337g;
        if (sVar3 != null) {
            s sVar4 = sVar3.f13336f;
            sVar2.f13337g = sVar4;
            if (sVar4 != null) {
                sVar4.f13335e = sVar2;
            }
            s sVar5 = sVar2.f13335e;
            sVar3.f13335e = sVar5;
            if (sVar5 == null) {
                sVar3.f13339i = false;
                sVar = sVar3;
            } else if (sVar5.f13336f == sVar2) {
                sVar5.f13336f = sVar3;
            } else {
                sVar5.f13337g = sVar3;
            }
            sVar3.f13336f = sVar2;
            sVar2.f13335e = sVar3;
        }
        return sVar;
    }

    static s i(s sVar, s sVar2) {
        s sVar3 = sVar2.f13336f;
        if (sVar3 != null) {
            s sVar4 = sVar3.f13337g;
            sVar2.f13336f = sVar4;
            if (sVar4 != null) {
                sVar4.f13335e = sVar2;
            }
            s sVar5 = sVar2.f13335e;
            sVar3.f13335e = sVar5;
            if (sVar5 == null) {
                sVar3.f13339i = false;
                sVar = sVar3;
            } else if (sVar5.f13337g == sVar2) {
                sVar5.f13337g = sVar3;
            } else {
                sVar5.f13336f = sVar3;
            }
            sVar3.f13337g = sVar2;
            sVar2.f13335e = sVar3;
        }
        return sVar;
    }

    static int j(Object obj, Object obj2) {
        int compareTo;
        if (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) {
            return System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1;
        }
        return compareTo;
    }

    @Override // j$.util.concurrent.m
    public final m a(int i10, Object obj) {
        Object obj2;
        Thread thread;
        Thread thread2;
        s sVar = null;
        if (obj != null) {
            m mVar = this.f13333f;
            while (mVar != null) {
                int i11 = this.lockState;
                if ((i11 & 3) == 0) {
                    Unsafe unsafe = f13330h;
                    long j10 = f13331i;
                    if (unsafe.compareAndSwapInt(this, j10, i11, i11 + 4)) {
                        try {
                            s sVar2 = this.f13332e;
                            if (sVar2 != null) {
                                sVar = sVar2.b(i10, obj, null);
                            }
                            if (w.a(unsafe, this, j10) == 6 && (thread2 = this.f13334g) != null) {
                                LockSupport.unpark(thread2);
                            }
                            return sVar;
                        } catch (Throwable th2) {
                            if (w.a(f13330h, this, f13331i) == 6 && (thread = this.f13334g) != null) {
                                LockSupport.unpark(thread);
                            }
                            throw th2;
                        }
                    }
                } else if (mVar.f13314a == i10 && ((obj2 = mVar.f13315b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return mVar;
                } else {
                    mVar = mVar.f13317d;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a2, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a7 A[LOOP:0: B:3:0x000c->B:54:0x00a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0071 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.concurrent.s f(int r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r4 = r17
            j$.util.concurrent.s r2 = r1.f13332e
            r8 = 0
            r9 = 0
            r10 = r2
            r2 = r8
            r3 = r9
        Lc:
            if (r10 != 0) goto L22
            j$.util.concurrent.s r9 = new j$.util.concurrent.s
            r6 = 0
            r7 = 0
            r2 = r9
            r3 = r16
            r4 = r17
            r5 = r18
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f13332e = r9
            r1.f13333f = r9
            goto La2
        L22:
            int r5 = r10.f13314a
            r11 = 1
            if (r5 <= r0) goto L2a
            r5 = -1
        L28:
            r12 = r5
            goto L68
        L2a:
            if (r5 >= r0) goto L2e
            r12 = r11
            goto L68
        L2e:
            java.lang.Object r5 = r10.f13315b
            if (r5 == r4) goto Laa
            if (r5 == 0) goto L3c
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto L3c
            goto Laa
        L3c:
            if (r2 != 0) goto L44
            java.lang.Class r2 = j$.util.concurrent.ConcurrentHashMap.comparableClassFor(r17)
            if (r2 == 0) goto L4a
        L44:
            int r6 = j$.util.concurrent.ConcurrentHashMap.compareComparables(r2, r4, r5)
            if (r6 != 0) goto L67
        L4a:
            if (r3 != 0) goto L62
            j$.util.concurrent.s r3 = r10.f13336f
            if (r3 == 0) goto L56
            j$.util.concurrent.s r3 = r3.b(r0, r4, r2)
            if (r3 != 0) goto L60
        L56:
            j$.util.concurrent.s r3 = r10.f13337g
            if (r3 == 0) goto L61
            j$.util.concurrent.s r3 = r3.b(r0, r4, r2)
            if (r3 == 0) goto L61
        L60:
            return r3
        L61:
            r3 = r11
        L62:
            int r5 = j(r4, r5)
            goto L28
        L67:
            r12 = r6
        L68:
            if (r12 > 0) goto L6d
            j$.util.concurrent.s r5 = r10.f13336f
            goto L6f
        L6d:
            j$.util.concurrent.s r5 = r10.f13337g
        L6f:
            if (r5 != 0) goto La7
            j$.util.concurrent.s r13 = r1.f13333f
            j$.util.concurrent.s r14 = new j$.util.concurrent.s
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r13
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f13333f = r14
            if (r13 == 0) goto L87
            r13.f13338h = r14
        L87:
            if (r12 > 0) goto L8c
            r10.f13336f = r14
            goto L8e
        L8c:
            r10.f13337g = r14
        L8e:
            boolean r0 = r10.f13339i
            if (r0 != 0) goto L95
            r14.f13339i = r11
            goto La2
        L95:
            r15.e()
            j$.util.concurrent.s r0 = r1.f13332e     // Catch: java.lang.Throwable -> La3
            j$.util.concurrent.s r0 = c(r0, r14)     // Catch: java.lang.Throwable -> La3
            r1.f13332e = r0     // Catch: java.lang.Throwable -> La3
            r1.lockState = r9
        La2:
            return r8
        La3:
            r0 = move-exception
            r1.lockState = r9
            throw r0
        La7:
            r10 = r5
            goto Lc
        Laa:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.r.f(int, java.lang.Object, java.lang.Object):j$.util.concurrent.s");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x008e A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:21:0x0030, B:25:0x0039, B:28:0x003f, B:30:0x004d, B:31:0x0052, B:33:0x0058, B:35:0x005c, B:36:0x005f, B:37:0x0061, B:38:0x0065, B:40:0x006b, B:41:0x006d, B:44:0x0077, B:46:0x007b, B:47:0x007e, B:56:0x008e, B:59:0x0096, B:61:0x009a, B:62:0x009d, B:63:0x009f, B:64:0x00a5, B:67:0x00aa, B:68:0x00ae, B:70:0x00b2, B:72:0x00b6, B:74:0x00ba, B:75:0x00bd, B:77:0x00c1, B:78:0x00c3), top: B:85:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00aa A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:21:0x0030, B:25:0x0039, B:28:0x003f, B:30:0x004d, B:31:0x0052, B:33:0x0058, B:35:0x005c, B:36:0x005f, B:37:0x0061, B:38:0x0065, B:40:0x006b, B:41:0x006d, B:44:0x0077, B:46:0x007b, B:47:0x007e, B:56:0x008e, B:59:0x0096, B:61:0x009a, B:62:0x009d, B:63:0x009f, B:64:0x00a5, B:67:0x00aa, B:68:0x00ae, B:70:0x00b2, B:72:0x00b6, B:74:0x00ba, B:75:0x00bd, B:77:0x00c1, B:78:0x00c3), top: B:85:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b2 A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:21:0x0030, B:25:0x0039, B:28:0x003f, B:30:0x004d, B:31:0x0052, B:33:0x0058, B:35:0x005c, B:36:0x005f, B:37:0x0061, B:38:0x0065, B:40:0x006b, B:41:0x006d, B:44:0x0077, B:46:0x007b, B:47:0x007e, B:56:0x008e, B:59:0x0096, B:61:0x009a, B:62:0x009d, B:63:0x009f, B:64:0x00a5, B:67:0x00aa, B:68:0x00ae, B:70:0x00b2, B:72:0x00b6, B:74:0x00ba, B:75:0x00bd, B:77:0x00c1, B:78:0x00c3), top: B:85:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ba A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:21:0x0030, B:25:0x0039, B:28:0x003f, B:30:0x004d, B:31:0x0052, B:33:0x0058, B:35:0x005c, B:36:0x005f, B:37:0x0061, B:38:0x0065, B:40:0x006b, B:41:0x006d, B:44:0x0077, B:46:0x007b, B:47:0x007e, B:56:0x008e, B:59:0x0096, B:61:0x009a, B:62:0x009d, B:63:0x009f, B:64:0x00a5, B:67:0x00aa, B:68:0x00ae, B:70:0x00b2, B:72:0x00b6, B:74:0x00ba, B:75:0x00bd, B:77:0x00c1, B:78:0x00c3), top: B:85:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bd A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:21:0x0030, B:25:0x0039, B:28:0x003f, B:30:0x004d, B:31:0x0052, B:33:0x0058, B:35:0x005c, B:36:0x005f, B:37:0x0061, B:38:0x0065, B:40:0x006b, B:41:0x006d, B:44:0x0077, B:46:0x007b, B:47:0x007e, B:56:0x008e, B:59:0x0096, B:61:0x009a, B:62:0x009d, B:63:0x009f, B:64:0x00a5, B:67:0x00aa, B:68:0x00ae, B:70:0x00b2, B:72:0x00b6, B:74:0x00ba, B:75:0x00bd, B:77:0x00c1, B:78:0x00c3), top: B:85:0x0030 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(j$.util.concurrent.s r11) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.r.g(j$.util.concurrent.s):boolean");
    }
}
