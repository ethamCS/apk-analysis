package org.javarosa.xform.parse;
/* loaded from: classes.dex */
public class ChildProcessingRule {
    public static final int MULT_NOT_ALLOWED = 1;
    public static final int MULT_PROCESS_ALL = 3;
    public static final int MULT_PROCESS_FIRST_ONLY = 2;
    public boolean anyLevel;
    public IElementHandler handler;
    public int multiplicity;
    public String name;
    public boolean required;

    public ChildProcessingRule(String str, IElementHandler iElementHandler, boolean z, boolean z2, int i) {
        this.name = str;
        this.handler = iElementHandler;
        this.required = z;
        this.anyLevel = z2;
        this.multiplicity = i;
    }
}
