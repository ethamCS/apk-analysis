package androidx.compose.ui.tooling.data;

import androidx.autofill.HintConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SlotTree.kt */
@UiToolingDataApi
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014¨\u0006 "}, d2 = {"Landroidx/compose/ui/tooling/data/SourceInformationContext;", "", HintConstants.AUTOFILL_HINT_NAME, "", "sourceFile", "packageHash", "", "locations", "", "Landroidx/compose/ui/tooling/data/SourceLocationInfo;", "repeatOffset", "parameters", "Landroidx/compose/ui/tooling/data/Parameter;", "isCall", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ILjava/util/List;Z)V", "()Z", "getLocations", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "nextLocation", "getPackageHash", "()I", "getParameters", "getRepeatOffset", "getSourceFile", "nextSourceLocation", "Landroidx/compose/ui/tooling/data/SourceLocation;", "sourceLocation", "callIndex", "parentContext", "ui-tooling-data_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SourceInformationContext {
    private final boolean isCall;
    private final List<SourceLocationInfo> locations;
    private final String name;
    private int nextLocation;
    private final int packageHash;
    private final List<Parameter> parameters;
    private final int repeatOffset;
    private final String sourceFile;

    public SourceInformationContext(String str, String str2, int i, List<SourceLocationInfo> locations, int i2, List<Parameter> list, boolean z) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        this.name = str;
        this.sourceFile = str2;
        this.packageHash = i;
        this.locations = locations;
        this.repeatOffset = i2;
        this.parameters = list;
        this.isCall = z;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSourceFile() {
        return this.sourceFile;
    }

    public final int getPackageHash() {
        return this.packageHash;
    }

    public final List<SourceLocationInfo> getLocations() {
        return this.locations;
    }

    public final int getRepeatOffset() {
        return this.repeatOffset;
    }

    public final List<Parameter> getParameters() {
        return this.parameters;
    }

    public final boolean isCall() {
        return this.isCall;
    }

    public final SourceLocation nextSourceLocation() {
        int i;
        if (this.nextLocation >= this.locations.size() && (i = this.repeatOffset) >= 0) {
            this.nextLocation = i;
        }
        if (this.nextLocation < this.locations.size()) {
            List<SourceLocationInfo> list = this.locations;
            int i2 = this.nextLocation;
            this.nextLocation = i2 + 1;
            SourceLocationInfo sourceLocationInfo = list.get(i2);
            Integer lineNumber = sourceLocationInfo.getLineNumber();
            int intValue = lineNumber != null ? lineNumber.intValue() : -1;
            Integer offset = sourceLocationInfo.getOffset();
            int intValue2 = offset != null ? offset.intValue() : -1;
            Integer length = sourceLocationInfo.getLength();
            return new SourceLocation(intValue, intValue2, length != null ? length.intValue() : -1, this.sourceFile, this.packageHash);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.tooling.data.SourceLocation sourceLocation(int r9, androidx.compose.ui.tooling.data.SourceInformationContext r10) {
        /*
            r8 = this;
            java.util.List<androidx.compose.ui.tooling.data.SourceLocationInfo> r0 = r8.locations
            int r0 = r0.size()
            if (r9 < r0) goto L22
            int r0 = r8.repeatOffset
            if (r0 < 0) goto L22
            java.util.List<androidx.compose.ui.tooling.data.SourceLocationInfo> r1 = r8.locations
            int r1 = r1.size()
            if (r0 >= r1) goto L22
            int r0 = r8.repeatOffset
            int r9 = r9 - r0
            java.util.List<androidx.compose.ui.tooling.data.SourceLocationInfo> r0 = r8.locations
            int r0 = r0.size()
            int r1 = r8.repeatOffset
            int r0 = r0 - r1
            int r9 = r9 % r0
            int r9 = r9 + r1
        L22:
            java.util.List<androidx.compose.ui.tooling.data.SourceLocationInfo> r0 = r8.locations
            int r0 = r0.size()
            r1 = 0
            if (r9 >= r0) goto L86
            java.util.List<androidx.compose.ui.tooling.data.SourceLocationInfo> r0 = r8.locations
            java.lang.Object r9 = r0.get(r9)
            androidx.compose.ui.tooling.data.SourceLocationInfo r9 = (androidx.compose.ui.tooling.data.SourceLocationInfo) r9
            androidx.compose.ui.tooling.data.SourceLocation r0 = new androidx.compose.ui.tooling.data.SourceLocation
            java.lang.Integer r2 = r9.getLineNumber()
            r3 = -1
            if (r2 == 0) goto L42
            int r2 = r2.intValue()
            r4 = r2
            goto L43
        L42:
            r4 = -1
        L43:
            java.lang.Integer r2 = r9.getOffset()
            if (r2 == 0) goto L4f
            int r2 = r2.intValue()
            r5 = r2
            goto L50
        L4f:
            r5 = -1
        L50:
            java.lang.Integer r9 = r9.getLength()
            if (r9 == 0) goto L5b
            int r9 = r9.intValue()
            goto L5c
        L5b:
            r9 = -1
        L5c:
            java.lang.String r2 = r8.sourceFile
            if (r2 != 0) goto L67
            if (r10 == 0) goto L65
            java.lang.String r6 = r10.sourceFile
            goto L68
        L65:
            r6 = r1
            goto L68
        L67:
            r6 = r2
        L68:
            if (r2 != 0) goto L6f
            if (r10 == 0) goto L75
            int r10 = r10.packageHash
            goto L71
        L6f:
            int r10 = r8.packageHash
        L71:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
        L75:
            if (r1 == 0) goto L7d
            int r10 = r1.intValue()
            r7 = r10
            goto L7e
        L7d:
            r7 = -1
        L7e:
            r2 = r0
            r3 = r4
            r4 = r5
            r5 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.data.SourceInformationContext.sourceLocation(int, androidx.compose.ui.tooling.data.SourceInformationContext):androidx.compose.ui.tooling.data.SourceLocation");
    }
}
