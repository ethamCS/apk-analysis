package c4;
/* loaded from: classes.dex */
public enum p {
    U8(false, Byte.TYPE, o.f6223a),
    S8(true, Byte.TYPE, o.f6223a),
    U16(false, Short.TYPE, o.f6223a),
    S16(true, Short.TYPE, o.f6223a),
    S32(true, Integer.TYPE, o.f6223a),
    S64(true, Long.TYPE, o.f6223a),
    F32(true, Float.TYPE, o.f6223a),
    F64(true, Double.TYPE, o.f6223a),
    I8(Byte.TYPE),
    I16(Short.TYPE),
    I(true),
    F(true);
    
    private final double U3;
    private final Class V3;
    private final Class W3;
    private final a X3;

    /* renamed from: c */
    private final int f6235c;

    /* renamed from: d */
    private final boolean f6236d;

    /* renamed from: q */
    private final boolean f6237q;

    /* renamed from: x */
    private final boolean f6238x;

    /* renamed from: y */
    private final double f6239y;

    /* loaded from: classes.dex */
    public interface a {
    }

    p(Class cls) {
        this.f6236d = true;
        this.V3 = cls;
        this.f6237q = false;
        this.f6235c = v(cls);
        this.f6238x = r(cls);
        this.W3 = x(cls);
        this.X3 = o.f6223a;
        this.U3 = Double.NaN;
        this.f6239y = Double.NaN;
    }

    p(boolean z10) {
        this.f6236d = true;
        this.f6238x = z10;
        this.f6237q = false;
        this.f6235c = -1;
        this.V3 = Object.class;
        this.W3 = Object.class;
        this.U3 = Double.NaN;
        this.f6239y = Double.NaN;
        this.X3 = o.f6223a;
    }

    p(boolean z10, Class cls, a aVar) {
        this.f6236d = false;
        this.f6237q = z10;
        this.V3 = cls;
        this.X3 = aVar;
        this.f6235c = v(cls);
        this.f6238x = r(cls);
        this.W3 = x(cls);
        this.U3 = t();
        this.f6239y = s();
    }

    public static p g(Class cls) {
        if (l.class.isAssignableFrom(cls)) {
            return U8;
        }
        if (j.class.isAssignableFrom(cls)) {
            return S8;
        }
        if (k.class.isAssignableFrom(cls)) {
            return U16;
        }
        if (g.class.isAssignableFrom(cls)) {
            return S16;
        }
        if (h.class.isAssignableFrom(cls)) {
            return S32;
        }
        if (i.class.isAssignableFrom(cls)) {
            return S64;
        }
        if (c4.a.class.isAssignableFrom(cls)) {
            return F32;
        }
        if (b.class.isAssignableFrom(cls)) {
            return F64;
        }
        if (e.class.isAssignableFrom(cls)) {
            return I8;
        }
        if (d.class.isAssignableFrom(cls)) {
            return I16;
        }
        if (f.class.isAssignableFrom(cls)) {
            return I;
        }
        if (c.class.isAssignableFrom(cls)) {
            return F;
        }
        if (e0.class.isAssignableFrom(cls)) {
            return U8;
        }
        if (c0.class.isAssignableFrom(cls)) {
            return S8;
        }
        if (d0.class.isAssignableFrom(cls)) {
            return U16;
        }
        if (z.class.isAssignableFrom(cls)) {
            return S16;
        }
        if (a0.class.isAssignableFrom(cls)) {
            return S32;
        }
        if (b0.class.isAssignableFrom(cls)) {
            return S64;
        }
        if (u.class.isAssignableFrom(cls)) {
            return F32;
        }
        if (v.class.isAssignableFrom(cls)) {
            return F64;
        }
        if (x.class.isAssignableFrom(cls)) {
            return I8;
        }
        if (w.class.isAssignableFrom(cls)) {
            return I16;
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException("Unknown image type. class=" + canonicalName);
    }

    private boolean r(Class cls) {
        return (cls == Float.TYPE || cls == Double.TYPE) ? false : true;
    }

    private double s() {
        double d10;
        double d11;
        if (!this.f6238x) {
            int i10 = this.f6235c;
            if (i10 == 32) {
                return 3.4028234663852886E38d;
            }
            if (i10 == 64) {
                return Double.MAX_VALUE;
            }
            throw new RuntimeException("Unexpected number of bits for float type: " + this.f6235c);
        }
        int i11 = this.f6235c;
        int i12 = 0;
        if (i11 == 8) {
            d11 = 127.0d;
            if (!this.f6237q) {
                i12 = -128;
            }
        } else if (i11 == 16) {
            d11 = 32767.0d;
            if (!this.f6237q) {
                i12 = -32768;
            }
        } else if (i11 != 32) {
            if (i11 == 64) {
                d11 = 9.223372036854776E18d;
                d10 = this.f6237q ? 0L : Long.MIN_VALUE;
                return d11 - d10;
            }
            throw new RuntimeException("Unexpected number of bits for integer type: " + this.f6235c);
        } else {
            d11 = 2.147483647E9d;
            if (!this.f6237q) {
                i12 = Integer.MIN_VALUE;
            }
        }
        d10 = i12;
        return d11 - d10;
    }

    private double t() {
        boolean z10 = this.f6238x;
        if (!z10 || this.f6237q) {
            if (!z10) {
                int i10 = this.f6235c;
                if (i10 == 32) {
                    return -3.4028234663852886E38d;
                }
                if (i10 == 64) {
                    return -1.7976931348623157E308d;
                }
                int i11 = this.f6235c;
                throw new RuntimeException("Unexpected number of bits for float type: " + i11);
            }
            int i12 = this.f6235c;
            if (i12 == 8) {
                return -128.0d;
            }
            if (i12 == 16) {
                return -32768.0d;
            }
            if (i12 == 32) {
                return -2.147483648E9d;
            }
            if (i12 == 64) {
                return -9.223372036854776E18d;
            }
            int i13 = this.f6235c;
            throw new RuntimeException("Unexpected number of bits for integer type: " + i13);
        }
        return 0.0d;
    }

    private int v(Class cls) {
        Class cls2 = Float.TYPE;
        if (cls == cls2 || cls == Double.TYPE) {
            return cls == cls2 ? 32 : 64;
        } else if (cls == Byte.TYPE) {
            return 8;
        } else {
            if (cls == Short.TYPE) {
                return 16;
            }
            if (cls == Integer.TYPE) {
                return 32;
            }
            return cls == Long.TYPE ? 64 : -1;
        }
    }

    private Class x(Class cls) {
        return (cls == Float.TYPE || cls == Double.TYPE) ? cls : this.f6235c <= 32 ? Integer.TYPE : Long.TYPE;
    }

    public Class h() {
        return this.V3;
    }

    public int j() {
        return this.f6235c;
    }

    public boolean p() {
        return this.f6238x;
    }
}
