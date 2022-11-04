package org.apache.james.mime4j.field.address.parser;
/* loaded from: classes.dex */
public class ASTaddress_list extends SimpleNode {
    public ASTaddress_list(int id) {
        super(id);
    }

    public ASTaddress_list(AddressListParser p, int id) {
        super(p, id);
    }

    @Override // org.apache.james.mime4j.field.address.parser.SimpleNode, org.apache.james.mime4j.field.address.parser.Node
    public Object jjtAccept(AddressListParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
