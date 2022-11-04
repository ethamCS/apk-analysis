package org.apache.james.mime4j.field.address.parser;
/* loaded from: classes.dex */
public class ASTdomain extends SimpleNode {
    public ASTdomain(int id) {
        super(id);
    }

    public ASTdomain(AddressListParser p, int id) {
        super(p, id);
    }

    @Override // org.apache.james.mime4j.field.address.parser.SimpleNode, org.apache.james.mime4j.field.address.parser.Node
    public Object jjtAccept(AddressListParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
