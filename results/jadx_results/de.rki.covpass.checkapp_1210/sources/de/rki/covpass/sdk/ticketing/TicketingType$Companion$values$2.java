package de.rki.covpass.sdk.ticketing;

import hc.k0;
import hc.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/ticketing/TicketingType;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class TicketingType$Companion$values$2 extends v implements gc.a<List<? extends TicketingType>> {
    public static final TicketingType$Companion$values$2 INSTANCE = new TicketingType$Companion$values$2();

    TicketingType$Companion$values$2() {
        super(0);
    }

    @Override // gc.a
    public final List<? extends TicketingType> invoke() {
        int s10;
        List<oc.d> v10 = k0.b(TicketingType.class).v();
        s10 = ub.v.s(v10, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (oc.d dVar : v10) {
            Object I = dVar.I();
            if (I == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            arrayList.add((TicketingType) I);
        }
        return arrayList;
    }
}
