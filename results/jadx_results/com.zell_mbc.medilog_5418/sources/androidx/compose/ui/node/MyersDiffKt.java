package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MyersDiff.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0013\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a]\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a \u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\bH\u0002\u001a \u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a8\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0014H\u0000\u001a]\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u0016\u001aU\u0010!\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a\u001c\u0010$\u001a\u00020\u0001*\u00020\u00142\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"applyDiff", "", "oldSize", "", "newSize", "diagonals", "Landroidx/compose/ui/node/IntStack;", "callback", "Landroidx/compose/ui/node/DiffCallback;", "backward", "", "oldStart", "oldEnd", "newStart", "newEnd", "cb", "forward", "Landroidx/compose/ui/node/CenteredArray;", "d", "snake", "", "backward-4l5_RBY", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z", "calculateDiff", "executeDiff", "fillSnake", "startX", "startY", "endX", "endY", "reverse", "data", "forward-4l5_RBY", "midPoint", "midPoint-q5eDKzI", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z", "swap", "i", "j", "ui_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class MyersDiffKt {
    private static final IntStack calculateDiff(int i, int i2, DiffCallback diffCallback) {
        int i3 = ((i + i2) + 1) / 2;
        IntStack intStack = new IntStack(i3 * 3);
        IntStack intStack2 = new IntStack(i3 * 4);
        intStack2.pushRange(0, i, 0, i2);
        int i4 = (i3 * 2) + 1;
        int[] m3299constructorimpl = CenteredArray.m3299constructorimpl(new int[i4]);
        int[] m3299constructorimpl2 = CenteredArray.m3299constructorimpl(new int[i4]);
        int[] m3439constructorimpl = Snake.m3439constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int pop = intStack2.pop();
            int pop2 = intStack2.pop();
            int pop3 = intStack2.pop();
            int pop4 = intStack2.pop();
            int[] iArr = m3299constructorimpl;
            int[] iArr2 = m3299constructorimpl2;
            if (m3366midPointq5eDKzI(pop4, pop3, pop2, pop, diffCallback, m3299constructorimpl, m3299constructorimpl2, m3439constructorimpl)) {
                if (Snake.m3442getDiagonalSizeimpl(m3439constructorimpl) > 0) {
                    Snake.m3437addDiagonalToStackimpl(m3439constructorimpl, intStack);
                }
                intStack2.pushRange(pop4, Snake.m3447getStartXimpl(m3439constructorimpl), pop2, Snake.m3448getStartYimpl(m3439constructorimpl));
                intStack2.pushRange(Snake.m3443getEndXimpl(m3439constructorimpl), pop3, Snake.m3444getEndYimpl(m3439constructorimpl), pop);
            }
            m3299constructorimpl = iArr;
            m3299constructorimpl2 = iArr2;
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i, i2, 0);
        return intStack;
    }

    private static final void applyDiff(int i, int i2, IntStack intStack, DiffCallback diffCallback) {
        while (intStack.isNotEmpty()) {
            int pop = intStack.pop();
            int pop2 = intStack.pop();
            int pop3 = intStack.pop();
            while (i > pop3) {
                i--;
                diffCallback.remove(i);
            }
            while (i2 > pop2) {
                i2--;
                diffCallback.insert(i, i2);
            }
            while (true) {
                int i3 = pop - 1;
                if (pop > 0) {
                    i--;
                    i2--;
                    diffCallback.same(i, i2);
                    pop = i3;
                }
            }
        }
        while (i > 0) {
            i--;
            diffCallback.remove(i);
        }
        while (i2 > 0) {
            i2--;
            diffCallback.insert(i, i2);
        }
    }

    public static final void executeDiff(int i, int i2, DiffCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        applyDiff(i, i2, calculateDiff(i, i2, callback), callback);
    }

    /* renamed from: midPoint-q5eDKzI */
    private static final boolean m3366midPointq5eDKzI(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i5 = i2 - i;
        int i6 = i4 - i3;
        if (i5 >= 1 && i6 >= 1) {
            int i7 = ((i5 + i6) + 1) / 2;
            CenteredArray.m3305setimpl(iArr, 1, i);
            CenteredArray.m3305setimpl(iArr2, 1, i2);
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i8;
                if (m3365forward4l5_RBY(i, i2, i3, i4, diffCallback, iArr, iArr2, i8, iArr3) || m3364backward4l5_RBY(i, i2, i3, i4, diffCallback, iArr, iArr2, i9, iArr3)) {
                    return true;
                }
                i8 = i9 + 1;
            }
        }
        return false;
    }

    /* renamed from: forward-4l5_RBY */
    private static final boolean m3365forward4l5_RBY(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int i6;
        int i7;
        int i8;
        int i9 = (i2 - i) - (i4 - i3);
        boolean z = Math.abs(i9) % 2 == 1;
        int i10 = -i5;
        for (int i11 = i10; i11 <= i5; i11 += 2) {
            if (i11 == i10 || (i11 != i5 && CenteredArray.m3302getimpl(iArr, i11 + 1) > CenteredArray.m3302getimpl(iArr, i11 - 1))) {
                i7 = CenteredArray.m3302getimpl(iArr, i11 + 1);
                i6 = i7;
            } else {
                i7 = CenteredArray.m3302getimpl(iArr, i11 - 1);
                i6 = i7 + 1;
            }
            int i12 = (i3 + (i6 - i)) - i11;
            int i13 = (i5 == 0 || i6 != i7) ? i12 : i12 - 1;
            while (i6 < i2 && i12 < i4) {
                if (!diffCallback.areItemsTheSame(i6, i12)) {
                    break;
                }
                i6++;
                i12++;
            }
            CenteredArray.m3305setimpl(iArr, i11, i6);
            if (z && (i8 = i9 - i11) >= i10 + 1 && i8 <= i5 - 1) {
                if (CenteredArray.m3302getimpl(iArr2, i8) <= i6) {
                    fillSnake(i7, i13, i6, i12, false, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: backward-4l5_RBY */
    private static final boolean m3364backward4l5_RBY(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int i6;
        int i7;
        int i8;
        int i9 = (i2 - i) - (i4 - i3);
        boolean z = i9 % 2 == 0;
        int i10 = -i5;
        for (int i11 = i10; i11 <= i5; i11 += 2) {
            if (i11 == i10 || (i11 != i5 && CenteredArray.m3302getimpl(iArr2, i11 + 1) < CenteredArray.m3302getimpl(iArr2, i11 - 1))) {
                i7 = CenteredArray.m3302getimpl(iArr2, i11 + 1);
                i6 = i7;
            } else {
                i7 = CenteredArray.m3302getimpl(iArr2, i11 - 1);
                i6 = i7 - 1;
            }
            int i12 = i4 - ((i2 - i6) - i11);
            int i13 = (i5 == 0 || i6 != i7) ? i12 : i12 + 1;
            while (i6 > i && i12 > i3) {
                if (!diffCallback.areItemsTheSame(i6 - 1, i12 - 1)) {
                    break;
                }
                i6--;
                i12--;
            }
            CenteredArray.m3305setimpl(iArr2, i11, i6);
            if (z && (i8 = i9 - i11) >= i10 && i8 <= i5) {
                if (CenteredArray.m3302getimpl(iArr, i8) >= i6) {
                    fillSnake(i6, i12, i7, i13, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    public static final void fillSnake(int i, int i2, int i3, int i4, boolean z, int[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        data[0] = i;
        data[1] = i2;
        data[2] = i3;
        data[3] = i4;
        data[4] = z ? 1 : 0;
    }

    public static final void swap(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }
}
