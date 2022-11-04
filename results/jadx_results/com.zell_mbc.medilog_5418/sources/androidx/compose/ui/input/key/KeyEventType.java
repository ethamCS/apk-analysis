package androidx.compose.ui.input.key;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: KeyEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/key/KeyEventType;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class KeyEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m2929constructorimpl(0);
    private static final int KeyUp = m2929constructorimpl(1);
    private static final int KeyDown = m2929constructorimpl(2);

    /* renamed from: box-impl */
    public static final /* synthetic */ KeyEventType m2928boximpl(int i) {
        return new KeyEventType(i);
    }

    /* renamed from: constructor-impl */
    public static int m2929constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl */
    public static boolean m2930equalsimpl(int i, Object obj) {
        return (obj instanceof KeyEventType) && i == ((KeyEventType) obj).m2934unboximpl();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m2931equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl */
    public static int m2932hashCodeimpl(int i) {
        return i;
    }

    public boolean equals(Object obj) {
        return m2930equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2932hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ int m2934unboximpl() {
        return this.value;
    }

    private /* synthetic */ KeyEventType(int i) {
        this.value = i;
    }

    public String toString() {
        return m2933toStringimpl(this.value);
    }

    /* renamed from: toString-impl */
    public static String m2933toStringimpl(int i) {
        return m2931equalsimpl0(i, KeyUp) ? "KeyUp" : m2931equalsimpl0(i, KeyDown) ? "KeyDown" : m2931equalsimpl0(i, Unknown) ? "Unknown" : "Invalid";
    }

    /* compiled from: KeyEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/input/key/KeyEventType$Companion;", "", "()V", "KeyDown", "Landroidx/compose/ui/input/key/KeyEventType;", "getKeyDown-CS__XNY", "()I", "I", "KeyUp", "getKeyUp-CS__XNY", "Unknown", "getUnknown-CS__XNY", "ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getUnknown-CS__XNY */
        public final int m2937getUnknownCS__XNY() {
            return KeyEventType.Unknown;
        }

        /* renamed from: getKeyUp-CS__XNY */
        public final int m2936getKeyUpCS__XNY() {
            return KeyEventType.KeyUp;
        }

        /* renamed from: getKeyDown-CS__XNY */
        public final int m2935getKeyDownCS__XNY() {
            return KeyEventType.KeyDown;
        }
    }
}
