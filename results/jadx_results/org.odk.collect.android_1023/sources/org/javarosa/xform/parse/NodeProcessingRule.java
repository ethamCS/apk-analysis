package org.javarosa.xform.parse;

import java.util.Hashtable;
/* loaded from: classes.dex */
public class NodeProcessingRule {
    public boolean allowChildText;
    public boolean allowUnknownChildren;
    public Hashtable childRules = new Hashtable();
    public String name;

    public NodeProcessingRule(String str, boolean z, boolean z2) {
        this.name = str;
        this.allowUnknownChildren = z;
        this.allowChildText = z2;
    }

    public void addChild(ChildProcessingRule childProcessingRule) {
        this.childRules.put(childProcessingRule.name, childProcessingRule);
    }
}
