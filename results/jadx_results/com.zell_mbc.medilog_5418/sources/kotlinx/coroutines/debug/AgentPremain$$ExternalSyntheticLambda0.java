package kotlinx.coroutines.debug;

import sun.misc.Signal;
import sun.misc.SignalHandler;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class AgentPremain$$ExternalSyntheticLambda0 implements SignalHandler {
    public static final /* synthetic */ AgentPremain$$ExternalSyntheticLambda0 INSTANCE = new AgentPremain$$ExternalSyntheticLambda0();

    private /* synthetic */ AgentPremain$$ExternalSyntheticLambda0() {
    }

    public final void handle(Signal signal) {
        AgentPremain.m6246installSignalHandler$lambda1(signal);
    }
}
