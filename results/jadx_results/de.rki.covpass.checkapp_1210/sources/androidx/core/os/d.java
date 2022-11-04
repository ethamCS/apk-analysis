package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import hc.t;
import java.io.Serializable;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.r;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {BuildConfig.FLAVOR, "Ltb/r;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "pairs", "Landroid/os/Bundle;", "a", "([Ltb/r;)Landroid/os/Bundle;", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d {
    public static final Bundle a(r<String, ? extends Object>... rVarArr) {
        t.e(rVarArr, "pairs");
        Bundle bundle = new Bundle(rVarArr.length);
        for (r<String, ? extends Object> rVar : rVarArr) {
            String b10 = rVar.b();
            Object c10 = rVar.c();
            if (c10 == null) {
                bundle.putString(b10, null);
            } else if (c10 instanceof Boolean) {
                bundle.putBoolean(b10, ((Boolean) c10).booleanValue());
            } else if (c10 instanceof Byte) {
                bundle.putByte(b10, ((Number) c10).byteValue());
            } else if (c10 instanceof Character) {
                bundle.putChar(b10, ((Character) c10).charValue());
            } else if (c10 instanceof Double) {
                bundle.putDouble(b10, ((Number) c10).doubleValue());
            } else if (c10 instanceof Float) {
                bundle.putFloat(b10, ((Number) c10).floatValue());
            } else if (c10 instanceof Integer) {
                bundle.putInt(b10, ((Number) c10).intValue());
            } else if (c10 instanceof Long) {
                bundle.putLong(b10, ((Number) c10).longValue());
            } else if (c10 instanceof Short) {
                bundle.putShort(b10, ((Number) c10).shortValue());
            } else if (c10 instanceof Bundle) {
                bundle.putBundle(b10, (Bundle) c10);
            } else if (c10 instanceof CharSequence) {
                bundle.putCharSequence(b10, (CharSequence) c10);
            } else if (c10 instanceof Parcelable) {
                bundle.putParcelable(b10, (Parcelable) c10);
            } else if (c10 instanceof boolean[]) {
                bundle.putBooleanArray(b10, (boolean[]) c10);
            } else if (c10 instanceof byte[]) {
                bundle.putByteArray(b10, (byte[]) c10);
            } else if (c10 instanceof char[]) {
                bundle.putCharArray(b10, (char[]) c10);
            } else if (c10 instanceof double[]) {
                bundle.putDoubleArray(b10, (double[]) c10);
            } else if (c10 instanceof float[]) {
                bundle.putFloatArray(b10, (float[]) c10);
            } else if (c10 instanceof int[]) {
                bundle.putIntArray(b10, (int[]) c10);
            } else if (c10 instanceof long[]) {
                bundle.putLongArray(b10, (long[]) c10);
            } else if (c10 instanceof short[]) {
                bundle.putShortArray(b10, (short[]) c10);
            } else if (c10 instanceof Object[]) {
                Class<?> componentType = c10.getClass().getComponentType();
                t.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(b10, (Parcelable[]) c10);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(b10, (String[]) c10);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(b10, (CharSequence[]) c10);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + b10 + '\"');
                    }
                    bundle.putSerializable(b10, (Serializable) c10);
                }
            } else {
                if (!(c10 instanceof Serializable)) {
                    if (c10 instanceof IBinder) {
                        b.a(bundle, b10, (IBinder) c10);
                    } else if (c10 instanceof Size) {
                        c.a(bundle, b10, (Size) c10);
                    } else if (!(c10 instanceof SizeF)) {
                        throw new IllegalArgumentException("Illegal value type " + c10.getClass().getCanonicalName() + " for key \"" + b10 + '\"');
                    } else {
                        c.b(bundle, b10, (SizeF) c10);
                    }
                }
                bundle.putSerializable(b10, (Serializable) c10);
            }
        }
        return bundle;
    }
}
