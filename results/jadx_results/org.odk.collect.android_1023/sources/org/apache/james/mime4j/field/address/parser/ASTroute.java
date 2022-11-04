package org.apache.james.mime4j.field.address.parser;
/* loaded from: classes.dex */
public class ASTroute extends SimpleNode {
    public ASTroute(int id) {
        super(id);
    }

    public ASTroute(AddressListParser p, int id) {
        super(p, id);
    }

    @Override // org.apache.james.mime4j.field.address.parser.SimpleNode, org.apache.james.mime4j.field.address.parser.Node
    public Object jjtAccept(AddressListParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
