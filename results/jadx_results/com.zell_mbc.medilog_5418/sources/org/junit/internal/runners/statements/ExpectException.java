package org.junit.internal.runners.statements;

import org.junit.runners.model.Statement;
/* loaded from: classes2.dex */
public class ExpectException extends Statement {
    private final Class<? extends Throwable> expected;
    private final Statement next;

    public ExpectException(Statement statement, Class<? extends Throwable> cls) {
        this.next = statement;
        this.expected = cls;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    @Override // org.junit.runners.model.Statement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void evaluate() throws java.lang.Exception {
        /*
            r3 = this;
            org.junit.runners.model.Statement r0 = r3.next     // Catch: java.lang.Throwable -> L7 org.junit.internal.AssumptionViolatedException -> L47
            r0.evaluate()     // Catch: java.lang.Throwable -> L7 org.junit.internal.AssumptionViolatedException -> L47
            r0 = 1
            goto L55
        L7:
            r0 = move-exception
            java.lang.Class<? extends java.lang.Throwable> r1 = r3.expected
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L15
            goto L54
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected exception, expected<"
            r1.append(r2)
            java.lang.Class<? extends java.lang.Throwable> r2 = r3.expected
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = "> but was<"
            r1.append(r2)
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = ">"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>(r1, r0)
            throw r2
        L47:
            r0 = move-exception
            java.lang.Class<? extends java.lang.Throwable> r1 = r3.expected
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L75
        L54:
            r0 = 0
        L55:
            if (r0 != 0) goto L58
            return
        L58:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected exception: "
            r1.append(r2)
            java.lang.Class<? extends java.lang.Throwable> r2 = r3.expected
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L75:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.junit.internal.runners.statements.ExpectException.evaluate():void");
    }
}
