package org.bouncycastle.jce.provider;

import java.security.cert.PolicyNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.conscrypt.BuildConfig;
/* loaded from: classes3.dex */
public class PKIXPolicyNode implements PolicyNode {
    protected List children;
    protected boolean critical;
    protected int depth;
    protected Set expectedPolicies;
    protected PolicyNode parent;
    protected Set policyQualifiers;
    protected String validPolicy;

    public PKIXPolicyNode(List list, int i10, Set set, PolicyNode policyNode, Set set2, String str, boolean z10) {
        this.children = list;
        this.depth = i10;
        this.expectedPolicies = set;
        this.parent = policyNode;
        this.policyQualifiers = set2;
        this.validPolicy = str;
        this.critical = z10;
    }

    public void addChild(PKIXPolicyNode pKIXPolicyNode) {
        this.children.add(pKIXPolicyNode);
        pKIXPolicyNode.setParent(this);
    }

    public Object clone() {
        return copy();
    }

    public PKIXPolicyNode copy() {
        HashSet hashSet = new HashSet();
        for (String str : this.expectedPolicies) {
            hashSet.add(new String(str));
        }
        HashSet hashSet2 = new HashSet();
        for (String str2 : this.policyQualifiers) {
            hashSet2.add(new String(str2));
        }
        PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), this.depth, hashSet, null, hashSet2, new String(this.validPolicy), this.critical);
        for (PKIXPolicyNode pKIXPolicyNode2 : this.children) {
            PKIXPolicyNode copy = pKIXPolicyNode2.copy();
            copy.setParent(pKIXPolicyNode);
            pKIXPolicyNode.addChild(copy);
        }
        return pKIXPolicyNode;
    }

    @Override // java.security.cert.PolicyNode
    public Iterator getChildren() {
        return this.children.iterator();
    }

    @Override // java.security.cert.PolicyNode
    public int getDepth() {
        return this.depth;
    }

    @Override // java.security.cert.PolicyNode
    public Set getExpectedPolicies() {
        return this.expectedPolicies;
    }

    @Override // java.security.cert.PolicyNode
    public PolicyNode getParent() {
        return this.parent;
    }

    @Override // java.security.cert.PolicyNode
    public Set getPolicyQualifiers() {
        return this.policyQualifiers;
    }

    @Override // java.security.cert.PolicyNode
    public String getValidPolicy() {
        return this.validPolicy;
    }

    public boolean hasChildren() {
        return !this.children.isEmpty();
    }

    @Override // java.security.cert.PolicyNode
    public boolean isCritical() {
        return this.critical;
    }

    public void removeChild(PKIXPolicyNode pKIXPolicyNode) {
        this.children.remove(pKIXPolicyNode);
    }

    public void setCritical(boolean z10) {
        this.critical = z10;
    }

    public void setExpectedPolicies(Set set) {
        this.expectedPolicies = set;
    }

    public void setParent(PKIXPolicyNode pKIXPolicyNode) {
        this.parent = pKIXPolicyNode;
    }

    public String toString() {
        return toString(BuildConfig.FLAVOR);
    }

    public String toString(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(this.validPolicy);
        stringBuffer.append(" {\n");
        for (int i10 = 0; i10 < this.children.size(); i10++) {
            stringBuffer.append(((PKIXPolicyNode) this.children.get(i10)).toString(str + "    "));
        }
        stringBuffer.append(str);
        stringBuffer.append("}\n");
        return stringBuffer.toString();
    }
}
