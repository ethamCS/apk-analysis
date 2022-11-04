package androidx.compose.ui.unit;

import androidx.compose.animation.FlingCalculator$FlingInfo$$ExternalSyntheticBackport0;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import net.lingala.zip4j.util.InternalZipConstants;
/* compiled from: TextUnit.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001dH\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0014H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010 J!\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010!J\u001a\u0010\"\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001dH\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ!\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0014H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010 J!\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010!J\u000f\u0010*\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u0000H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u00038@X\u0081\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0010\u001a\u00020\u00118Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/ui/unit/TextUnit;", "", "packedValue", "", "constructor-impl", "(J)J", "isEm", "", "isEm-impl", "(J)Z", "isSp", "isSp-impl", "rawType", "getRawType$annotations", "()V", "getRawType-impl", "type", "Landroidx/compose/ui/unit/TextUnitType;", "getType-UIouoOA", "value", "", "getValue-impl", "(J)F", "compareTo", "", "other", "compareTo--R2X_6o", "(JJ)I", "div", "", "div-kPz2Gy4", "(JD)J", "(JF)J", "(JI)J", "equals", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(J)I", "times", "times-kPz2Gy4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-XSAIIZE", "Companion", "ui-unit_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class TextUnit {
    public static final Companion Companion = new Companion(null);
    private static final TextUnitType[] TextUnitTypes = {TextUnitType.m4312boximpl(TextUnitType.Companion.m4321getUnspecifiedUIouoOA()), TextUnitType.m4312boximpl(TextUnitType.Companion.m4320getSpUIouoOA()), TextUnitType.m4312boximpl(TextUnitType.Companion.m4319getEmUIouoOA())};
    private static final long Unspecified = TextUnitKt.pack(0, Float.NaN);
    private final long packedValue;

    /* renamed from: box-impl */
    public static final /* synthetic */ TextUnit m4277boximpl(long j) {
        return new TextUnit(j);
    }

    /* renamed from: constructor-impl */
    public static long m4279constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl */
    public static boolean m4283equalsimpl(long j, Object obj) {
        return (obj instanceof TextUnit) && j == ((TextUnit) obj).m4296unboximpl();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m4284equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getRawType$annotations() {
    }

    /* renamed from: getRawType-impl */
    public static final long m4285getRawTypeimpl(long j) {
        return j & 1095216660480L;
    }

    /* renamed from: hashCode-impl */
    public static int m4288hashCodeimpl(long j) {
        return FlingCalculator$FlingInfo$$ExternalSyntheticBackport0.m(j);
    }

    public boolean equals(Object obj) {
        return m4283equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4288hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ long m4296unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ TextUnit(long j) {
        this.packedValue = j;
    }

    /* renamed from: unaryMinus-XSAIIZE */
    public static final long m4295unaryMinusXSAIIZE(long j) {
        TextUnitKt.m4300checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m4285getRawTypeimpl(j), -m4287getValueimpl(j));
    }

    /* renamed from: div-kPz2Gy4 */
    public static final long m4281divkPz2Gy4(long j, float f) {
        TextUnitKt.m4300checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m4285getRawTypeimpl(j), m4287getValueimpl(j) / f);
    }

    /* renamed from: div-kPz2Gy4 */
    public static final long m4280divkPz2Gy4(long j, double d) {
        TextUnitKt.m4300checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m4285getRawTypeimpl(j), (float) (m4287getValueimpl(j) / d));
    }

    /* renamed from: div-kPz2Gy4 */
    public static final long m4282divkPz2Gy4(long j, int i) {
        TextUnitKt.m4300checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m4285getRawTypeimpl(j), m4287getValueimpl(j) / i);
    }

    /* renamed from: times-kPz2Gy4 */
    public static final long m4292timeskPz2Gy4(long j, float f) {
        TextUnitKt.m4300checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m4285getRawTypeimpl(j), m4287getValueimpl(j) * f);
    }

    /* renamed from: times-kPz2Gy4 */
    public static final long m4291timeskPz2Gy4(long j, double d) {
        TextUnitKt.m4300checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m4285getRawTypeimpl(j), (float) (m4287getValueimpl(j) * d));
    }

    /* renamed from: times-kPz2Gy4 */
    public static final long m4293timeskPz2Gy4(long j, int i) {
        TextUnitKt.m4300checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m4285getRawTypeimpl(j), m4287getValueimpl(j) * i);
    }

    /* renamed from: compareTo--R2X_6o */
    public static final int m4278compareToR2X_6o(long j, long j2) {
        TextUnitKt.m4301checkArithmeticNB67dxo(j, j2);
        return Float.compare(m4287getValueimpl(j), m4287getValueimpl(j2));
    }

    public String toString() {
        return m4294toStringimpl(this.packedValue);
    }

    /* renamed from: toString-impl */
    public static String m4294toStringimpl(long j) {
        long m4286getTypeUIouoOA = m4286getTypeUIouoOA(j);
        if (TextUnitType.m4315equalsimpl0(m4286getTypeUIouoOA, TextUnitType.Companion.m4321getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m4315equalsimpl0(m4286getTypeUIouoOA, TextUnitType.Companion.m4320getSpUIouoOA())) {
            return m4287getValueimpl(j) + ".sp";
        } else if (!TextUnitType.m4315equalsimpl0(m4286getTypeUIouoOA, TextUnitType.Companion.m4319getEmUIouoOA())) {
            return "Invalid";
        } else {
            return m4287getValueimpl(j) + ".em";
        }
    }

    /* compiled from: TextUnit.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u000e\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/unit/TextUnit$Companion;", "", "()V", "TextUnitTypes", "", "Landroidx/compose/ui/unit/TextUnitType;", "getTextUnitTypes$ui_unit_release", "()[Landroidx/compose/ui/unit/TextUnitType;", "[Landroidx/compose/ui/unit/TextUnitType;", "Unspecified", "Landroidx/compose/ui/unit/TextUnit;", "getUnspecified-XSAIIZE$annotations", "getUnspecified-XSAIIZE", "()J", "J", "ui-unit_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getUnspecified-XSAIIZE$annotations */
        public static /* synthetic */ void m4297getUnspecifiedXSAIIZE$annotations() {
        }

        private Companion() {
        }

        public final TextUnitType[] getTextUnitTypes$ui_unit_release() {
            return TextUnit.TextUnitTypes;
        }

        /* renamed from: getUnspecified-XSAIIZE */
        public final long m4298getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }
    }

    /* renamed from: getType-UIouoOA */
    public static final long m4286getTypeUIouoOA(long j) {
        return TextUnitTypes[(int) (m4285getRawTypeimpl(j) >>> 32)].m4318unboximpl();
    }

    /* renamed from: isSp-impl */
    public static final boolean m4290isSpimpl(long j) {
        return m4285getRawTypeimpl(j) == 4294967296L;
    }

    /* renamed from: isEm-impl */
    public static final boolean m4289isEmimpl(long j) {
        return m4285getRawTypeimpl(j) == 8589934592L;
    }

    /* renamed from: getValue-impl */
    public static final float m4287getValueimpl(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & InternalZipConstants.ZIP_64_SIZE_LIMIT));
    }
}
