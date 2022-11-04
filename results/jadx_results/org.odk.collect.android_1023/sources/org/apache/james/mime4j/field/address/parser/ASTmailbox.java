package org.apache.james.mime4j.field.address.parser;
/* loaded from: classes.dex */
public class ASTmailbox extends SimpleNode {
    public ASTmailbox(int id) {
        super(id);
    }

    public ASTmailbox(AddressListParser p, int id) {
        super(p, id);
    }

    @Override // org.apache.james.mime4j.field.address.parser.SimpleNode, org.apache.james.mime4j.field.address.parser.Node
    public Object jjtAccept(AddressListParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
