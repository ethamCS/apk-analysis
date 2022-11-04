package de.rki.covpass.sdk.ticketing;

import hc.t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import tb.m;
import ub.c0;
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000e2\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B\u001b\b\u0004\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0000J\u0014\u0010\t\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lde/rki/covpass/sdk/ticketing/TicketingType;", BuildConfig.FLAVOR, "codes", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "([Ljava/lang/String;)V", BuildConfig.FLAVOR, "getCodes", "()Ljava/util/Set;", "matches", BuildConfig.FLAVOR, "type", "types", BuildConfig.FLAVOR, "Companion", "Recovery", "Test", "Vaccination", "Lde/rki/covpass/sdk/ticketing/TicketingType$Recovery;", "Lde/rki/covpass/sdk/ticketing/TicketingType$Test$Antigen;", "Lde/rki/covpass/sdk/ticketing/TicketingType$Test$Generic;", "Lde/rki/covpass/sdk/ticketing/TicketingType$Test$Pcr;", "Lde/rki/covpass/sdk/ticketing/TicketingType$Vaccination;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class TicketingType {
    public static final Companion Companion = new Companion(null);
    private static final Lazy<List<TicketingType>> values$delegate;
    private final Set<String> codes;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fR!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lde/rki/covpass/sdk/ticketing/TicketingType$Companion;", BuildConfig.FLAVOR, "()V", "values", BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/ticketing/TicketingType;", "getValues", "()Ljava/util/List;", "values$delegate", "Lkotlin/Lazy;", "valueOfOrNull", "code", BuildConfig.FLAVOR, "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<TicketingType> getValues() {
            return (List) TicketingType.values$delegate.getValue();
        }

        public final TicketingType valueOfOrNull(String str) {
            Object obj;
            t.e(str, "code");
            Iterator<T> it = getValues().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((TicketingType) obj).getCodes().contains(str)) {
                    break;
                }
            }
            return (TicketingType) obj;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lde/rki/covpass/sdk/ticketing/TicketingType$Recovery;", "Lde/rki/covpass/sdk/ticketing/TicketingType;", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Recovery extends TicketingType {
        public static final Recovery INSTANCE = new Recovery();

        private Recovery() {
            super(new String[]{"r"}, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lde/rki/covpass/sdk/ticketing/TicketingType$Test;", BuildConfig.FLAVOR, "Antigen", "Generic", "Pcr", "Lde/rki/covpass/sdk/ticketing/TicketingType$Test$Antigen;", "Lde/rki/covpass/sdk/ticketing/TicketingType$Test$Generic;", "Lde/rki/covpass/sdk/ticketing/TicketingType$Test$Pcr;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Test {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lde/rki/covpass/sdk/ticketing/TicketingType$Test$Antigen;", "Lde/rki/covpass/sdk/ticketing/TicketingType;", "Lde/rki/covpass/sdk/ticketing/TicketingType$Test;", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Antigen extends TicketingType implements Test {
            public static final Antigen INSTANCE = new Antigen();

            private Antigen() {
                super(new String[]{"tr"}, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lde/rki/covpass/sdk/ticketing/TicketingType$Test$Generic;", "Lde/rki/covpass/sdk/ticketing/TicketingType;", "Lde/rki/covpass/sdk/ticketing/TicketingType$Test;", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Generic extends TicketingType implements Test {
            public static final Generic INSTANCE = new Generic();

            private Generic() {
                super(new String[]{"t", "tp", "tr"}, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lde/rki/covpass/sdk/ticketing/TicketingType$Test$Pcr;", "Lde/rki/covpass/sdk/ticketing/TicketingType;", "Lde/rki/covpass/sdk/ticketing/TicketingType$Test;", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Pcr extends TicketingType implements Test {
            public static final Pcr INSTANCE = new Pcr();

            private Pcr() {
                super(new String[]{"tp"}, null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lde/rki/covpass/sdk/ticketing/TicketingType$Vaccination;", "Lde/rki/covpass/sdk/ticketing/TicketingType;", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Vaccination extends TicketingType {
        public static final Vaccination INSTANCE = new Vaccination();

        private Vaccination() {
            super(new String[]{"v"}, null);
        }
    }

    static {
        Lazy<List<TicketingType>> a10;
        a10 = m.a(TicketingType$Companion$values$2.INSTANCE);
        values$delegate = a10;
    }

    private TicketingType(String... strArr) {
        Set<String> u02;
        u02 = ub.m.u0(strArr);
        this.codes = u02;
    }

    public /* synthetic */ TicketingType(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    public final Set<String> getCodes() {
        return this.codes;
    }

    public final boolean matches(TicketingType ticketingType) {
        Set a02;
        t.e(ticketingType, "type");
        a02 = c0.a0(this.codes, ticketingType.codes);
        return !a02.isEmpty();
    }

    public final boolean matches(Collection<? extends TicketingType> collection) {
        t.e(collection, "types");
        if (collection.isEmpty()) {
            return false;
        }
        for (TicketingType ticketingType : collection) {
            if (matches(ticketingType)) {
                return true;
            }
        }
        return false;
    }
}
