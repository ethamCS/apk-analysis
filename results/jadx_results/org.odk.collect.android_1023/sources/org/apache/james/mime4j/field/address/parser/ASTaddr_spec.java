package org.apache.james.mime4j.field.address.parser;
/* loaded from: classes.dex */
public class ASTaddr_spec extends SimpleNode {
    public ASTaddr_spec(int id) {
        super(id);
    }

    public ASTaddr_spec(AddressListParser p, int id) {
        super(p, id);
    }

    @Override // org.apache.james.mime4j.field.address.parser.SimpleNode, org.apache.james.mime4j.field.address.parser.Node
    public Object jjtAccept(AddressListParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}