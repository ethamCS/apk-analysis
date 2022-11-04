package org.junit.rules;

import java.util.List;
import org.junit.internal.management.ManagementFactory;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
/* loaded from: classes.dex */
public class DisableOnDebug implements TestRule {
    private final boolean debugging;
    private final TestRule rule;

    public DisableOnDebug(TestRule testRule) {
        this(testRule, ManagementFactory.getRuntimeMXBean().getInputArguments());
    }

    DisableOnDebug(TestRule testRule, List<String> list) {
        this.rule = testRule;
        this.debugging = isDebugging(list);
    }

    @Override // org.junit.rules.TestRule
    public Statement apply(Statement statement, Description description) {
        return this.debugging ? statement : this.rule.apply(statement, description);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean isDebugging(java.util.List<java.lang.String> r2) {
        /*
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "-Xdebug"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L20
            java.lang.String r1 = "-agentlib:jdwp"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L4
        L20:
            r2 = 1
            return r2
        L22:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.junit.rules.DisableOnDebug.isDebugging(java.util.List):boolean");
    }

    public boolean isDebugging() {
        return this.debugging;
    }
}
