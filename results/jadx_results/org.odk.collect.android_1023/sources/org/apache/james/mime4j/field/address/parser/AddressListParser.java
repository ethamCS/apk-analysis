package org.apache.james.mime4j.field.address.parser;

import java.io.InputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Vector;
import org.odk.collect.android.utilities.EncryptionUtils;
/* loaded from: classes.dex */
public class AddressListParser implements AddressListParserTreeConstants, AddressListParserConstants {
    private static int[] jj_la1_0;
    private static int[] jj_la1_1;
    private final JJCalls[] jj_2_rtns;
    private int jj_endpos;
    private Vector<int[]> jj_expentries;
    private int[] jj_expentry;
    private int jj_gc;
    private int jj_gen;
    SimpleCharStream jj_input_stream;
    private int jj_kind;
    private int jj_la;
    private final int[] jj_la1;
    private Token jj_lastpos;
    private int[] jj_lasttokens;
    private final LookaheadSuccess jj_ls;
    public Token jj_nt;
    private int jj_ntk;
    private boolean jj_rescan;
    private Token jj_scanpos;
    private boolean jj_semLA;
    protected JJTAddressListParserState jjtree;
    public boolean lookingAhead;
    public Token token;
    public AddressListParserTokenManager token_source;

    public static void main(String[] args) throws ParseException {
        while (true) {
            try {
                AddressListParser parser = new AddressListParser(System.in);
                parser.parseLine();
                ((SimpleNode) parser.jjtree.rootNode()).dump("> ");
            } catch (Exception x) {
                x.printStackTrace();
                return;
            }
        }
    }

    public ASTaddress_list parseAddressList() throws ParseException {
        try {
            parseAddressList0();
            return (ASTaddress_list) this.jjtree.rootNode();
        } catch (TokenMgrError tme) {
            throw new ParseException(tme.getMessage());
        }
    }

    public ASTaddress parseAddress() throws ParseException {
        try {
            parseAddress0();
            return (ASTaddress) this.jjtree.rootNode();
        } catch (TokenMgrError tme) {
            throw new ParseException(tme.getMessage());
        }
    }

    public ASTmailbox parseMailbox() throws ParseException {
        try {
            parseMailbox0();
            return (ASTmailbox) this.jjtree.rootNode();
        } catch (TokenMgrError tme) {
            throw new ParseException(tme.getMessage());
        }
    }

    void jjtreeOpenNodeScope(Node n) {
        ((SimpleNode) n).firstToken = getToken(1);
    }

    void jjtreeCloseNodeScope(Node n) {
        ((SimpleNode) n).lastToken = getToken(0);
    }

    public final void parseLine() throws ParseException {
        address_list();
        switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
            case 1:
                jj_consume_token(1);
                break;
            default:
                this.jj_la1[0] = this.jj_gen;
                break;
        }
        jj_consume_token(2);
    }

    public final void parseAddressList0() throws ParseException {
        address_list();
        jj_consume_token(0);
    }

    public final void parseAddress0() throws ParseException {
        address();
        jj_consume_token(0);
    }

    public final void parseMailbox0() throws ParseException {
        mailbox();
        jj_consume_token(0);
    }

    public final void address_list() throws ParseException {
        ASTaddress_list jjtn000 = new ASTaddress_list(1);
        this.jjtree.openNodeScope(jjtn000);
        jjtreeOpenNodeScope(jjtn000);
        try {
            switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
                case 6:
                case 14:
                case 31:
                    address();
                    break;
                default:
                    this.jj_la1[1] = this.jj_gen;
                    break;
            }
            while (true) {
                switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
                    case 3:
                        jj_consume_token(3);
                        switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
                            case 6:
                            case 14:
                            case 31:
                                address();
                                break;
                            default:
                                this.jj_la1[3] = this.jj_gen;
                                break;
                        }
                    default:
                        this.jj_la1[2] = this.jj_gen;
                        if (jjtc000) {
                            return;
                        }
                        return;
                }
            }
        } catch (Throwable jjte000) {
            try {
                if (1 != 0) {
                    this.jjtree.clearNodeScope(jjtn000);
                } else {
                    this.jjtree.popNode();
                }
                if (jjte000 instanceof RuntimeException) {
                    throw ((RuntimeException) jjte000);
                }
                if (jjte000 instanceof ParseException) {
                    throw ((ParseException) jjte000);
                }
                throw ((Error) jjte000);
            } finally {
                if (1 != 0) {
                    this.jjtree.closeNodeScope((Node) jjtn000, true);
                    jjtreeCloseNodeScope(jjtn000);
                }
            }
        }
    }

    public final void address() throws ParseException {
        ASTaddress jjtn000 = new ASTaddress(2);
        this.jjtree.openNodeScope(jjtn000);
        jjtreeOpenNodeScope(jjtn000);
        try {
            if (jj_2_1(Integer.MAX_VALUE)) {
                addr_spec();
            } else {
                switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
                    case 6:
                        angle_addr();
                        break;
                    case 14:
                    case 31:
                        phrase();
                        switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
                            case 4:
                                group_body();
                                break;
                            case 5:
                            default:
                                this.jj_la1[4] = this.jj_gen;
                                jj_consume_token(-1);
                                throw new ParseException();
                            case 6:
                                angle_addr();
                                break;
                        }
                    default:
                        this.jj_la1[5] = this.jj_gen;
                        jj_consume_token(-1);
                        throw new ParseException();
                }
            }
        } catch (Throwable jjte000) {
            try {
                if (1 != 0) {
                    this.jjtree.clearNodeScope(jjtn000);
                } else {
                    this.jjtree.popNode();
                }
                if (jjte000 instanceof RuntimeException) {
                    throw ((RuntimeException) jjte000);
                }
                if (jjte000 instanceof ParseException) {
                    throw ((ParseException) jjte000);
                }
                throw ((Error) jjte000);
            } finally {
                if (1 != 0) {
                    this.jjtree.closeNodeScope((Node) jjtn000, true);
                    jjtreeCloseNodeScope(jjtn000);
                }
            }
        }
    }

    public final void mailbox() throws ParseException {
        ASTmailbox jjtn000 = new ASTmailbox(3);
        this.jjtree.openNodeScope(jjtn000);
        jjtreeOpenNodeScope(jjtn000);
        try {
            if (jj_2_2(Integer.MAX_VALUE)) {
                addr_spec();
            } else {
                switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
                    case 6:
                        angle_addr();
                        break;
                    case 14:
                    case 31:
                        name_addr();
                        break;
                    default:
                        this.jj_la1[6] = this.jj_gen;
                        jj_consume_token(-1);
                        throw new ParseException();
                }
            }
        } catch (Throwable jjte000) {
            try {
                if (1 != 0) {
                    this.jjtree.clearNodeScope(jjtn000);
                } else {
                    this.jjtree.popNode();
                }
                if (jjte000 instanceof RuntimeException) {
                    throw ((RuntimeException) jjte000);
                }
                if (jjte000 instanceof ParseException) {
                    throw ((ParseException) jjte000);
                }
                throw ((Error) jjte000);
            } finally {
                if (1 != 0) {
                    this.jjtree.closeNodeScope((Node) jjtn000, true);
                    jjtreeCloseNodeScope(jjtn000);
                }
            }
        }
    }

    public final void name_addr() throws ParseException {
        ASTname_addr jjtn000 = new ASTname_addr(4);
        this.jjtree.openNodeScope(jjtn000);
        jjtreeOpenNodeScope(jjtn000);
        try {
            phrase();
            angle_addr();
        } catch (Throwable jjte000) {
            try {
                if (1 != 0) {
                    this.jjtree.clearNodeScope(jjtn000);
                } else {
                    this.jjtree.popNode();
                }
                if (jjte000 instanceof RuntimeException) {
                    throw ((RuntimeException) jjte000);
                }
                if (jjte000 instanceof ParseException) {
                    throw ((ParseException) jjte000);
                }
                throw ((Error) jjte000);
            } finally {
                if (1 != 0) {
                    this.jjtree.closeNodeScope((Node) jjtn000, true);
                    jjtreeCloseNodeScope(jjtn000);
                }
            }
        }
    }

    public final void group_body() throws ParseException {
        ASTgroup_body jjtn000 = new ASTgroup_body(5);
        this.jjtree.openNodeScope(jjtn000);
        jjtreeOpenNodeScope(jjtn000);
        try {
            jj_consume_token(4);
            switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
                case 6:
                case 14:
                case 31:
                    mailbox();
                    break;
                default:
                    this.jj_la1[7] = this.jj_gen;
                    break;
            }
            while (true) {
                switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
                    case 3:
                        jj_consume_token(3);
                        switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
                            case 6:
                            case 14:
                            case 31:
                                mailbox();
                                break;
                            default:
                                this.jj_la1[9] = this.jj_gen;
                                break;
                        }
                    default:
                        this.jj_la1[8] = this.jj_gen;
                        jj_consume_token(5);
                        if (jjtc000) {
                            return;
                        }
                        return;
                }
            }
        } catch (Throwable jjte000) {
            try {
                if (1 != 0) {
                    this.jjtree.clearNodeScope(jjtn000);
                } else {
                    this.jjtree.popNode();
                }
                if (jjte000 instanceof RuntimeException) {
                    throw ((RuntimeException) jjte000);
                }
                if (jjte000 instanceof ParseException) {
                    throw ((ParseException) jjte000);
                }
                throw ((Error) jjte000);
            } finally {
                if (1 != 0) {
                    this.jjtree.closeNodeScope((Node) jjtn000, true);
                    jjtreeCloseNodeScope(jjtn000);
                }
            }
        }
    }

    public final void angle_addr() throws ParseException {
        ASTangle_addr jjtn000 = new ASTangle_addr(6);
        this.jjtree.openNodeScope(jjtn000);
        jjtreeOpenNodeScope(jjtn000);
        try {
            jj_consume_token(6);
            switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
                case 8:
                    route();
                    break;
                default:
                    this.jj_la1[10] = this.jj_gen;
                    break;
            }
            addr_spec();
            jj_consume_token(7);
        } catch (Throwable jjte000) {
            try {
                if (1 != 0) {
                    this.jjtree.clearNodeScope(jjtn000);
                } else {
                    this.jjtree.popNode();
                }
                if (jjte000 instanceof RuntimeException) {
                    throw ((RuntimeException) jjte000);
                }
                if (jjte000 instanceof ParseException) {
                    throw ((ParseException) jjte000);
                }
                throw ((Error) jjte000);
            } finally {
                if (1 != 0) {
                    this.jjtree.closeNodeScope((Node) jjtn000, true);
                    jjtreeCloseNodeScope(jjtn000);
                }
            }
        }
    }

    public final void route() throws ParseException {
        ASTroute jjtn000 = new ASTroute(7);
        this.jjtree.openNodeScope(jjtn000);
        jjtreeOpenNodeScope(jjtn000);
        try {
            jj_consume_token(8);
            domain();
            while (true) {
                switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
                    case 3:
                    case 8:
                        break;
                    default:
                        this.jj_la1[11] = this.jj_gen;
                        jj_consume_token(4);
                        if (jjtc000) {
                            return;
                        }
                        return;
                }
                while (true) {
                    switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
                        case 3:
                            jj_consume_token(3);
                    }
                }
                this.jj_la1[12] = this.jj_gen;
                jj_consume_token(8);
                domain();
            }
        } catch (Throwable jjte000) {
            try {
                if (1 != 0) {
                    this.jjtree.clearNodeScope(jjtn000);
                } else {
                    this.jjtree.popNode();
                }
                if (jjte000 instanceof RuntimeException) {
                    throw ((RuntimeException) jjte000);
                }
                if (jjte000 instanceof ParseException) {
                    throw ((ParseException) jjte000);
                }
                throw ((Error) jjte000);
            } finally {
                if (1 != 0) {
                    this.jjtree.closeNodeScope((Node) jjtn000, true);
                    jjtreeCloseNodeScope(jjtn000);
                }
            }
        }
    }

    public final void phrase() throws ParseException {
        int i;
        ASTphrase jjtn000 = new ASTphrase(8);
        this.jjtree.openNodeScope(jjtn000);
        jjtreeOpenNodeScope(jjtn000);
        while (true) {
            try {
                switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
                    case 14:
                        jj_consume_token(14);
                        break;
                    case 31:
                        jj_consume_token(31);
                        break;
                    default:
                        this.jj_la1[13] = this.jj_gen;
                        jj_consume_token(-1);
                        throw new ParseException();
                }
                if (this.jj_ntk == -1) {
                    i = jj_ntk();
                    continue;
                } else {
                    i = this.jj_ntk;
                    continue;
                }
                switch (i) {
                    case 14:
                    case 31:
                        break;
                    default:
                        this.jj_la1[14] = this.jj_gen;
                        if (jjtc000) {
                            return;
                        }
                        return;
                }
            } finally {
                if (1 != 0) {
                    this.jjtree.closeNodeScope((Node) jjtn000, true);
                    jjtreeCloseNodeScope(jjtn000);
                }
            }
        }
    }

    public final void addr_spec() throws ParseException {
        ASTaddr_spec jjtn000 = new ASTaddr_spec(9);
        this.jjtree.openNodeScope(jjtn000);
        jjtreeOpenNodeScope(jjtn000);
        try {
            local_part();
            jj_consume_token(8);
            domain();
        } catch (Throwable jjte000) {
            try {
                if (1 != 0) {
                    this.jjtree.clearNodeScope(jjtn000);
                } else {
                    this.jjtree.popNode();
                }
                if (jjte000 instanceof RuntimeException) {
                    throw ((RuntimeException) jjte000);
                }
                if (jjte000 instanceof ParseException) {
                    throw ((ParseException) jjte000);
                }
                throw ((Error) jjte000);
            } finally {
                if (1 != 0) {
                    this.jjtree.closeNodeScope((Node) jjtn000, true);
                    jjtreeCloseNodeScope(jjtn000);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
        throw new org.apache.james.mime4j.field.address.parser.ParseException("Words in local part must be separated by '.'");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void local_part() throws org.apache.james.mime4j.field.address.parser.ParseException {
        /*
            r9 = this;
            r8 = 1
            r7 = 31
            r6 = -1
            org.apache.james.mime4j.field.address.parser.ASTlocal_part r1 = new org.apache.james.mime4j.field.address.parser.ASTlocal_part
            r3 = 10
            r1.<init>(r3)
            r0 = 1
            org.apache.james.mime4j.field.address.parser.JJTAddressListParserState r3 = r9.jjtree
            r3.openNodeScope(r1)
            r9.jjtreeOpenNodeScope(r1)
            int r3 = r9.jj_ntk     // Catch: java.lang.Throwable -> L31
            if (r3 != r6) goto L3d
            int r3 = r9.jj_ntk()     // Catch: java.lang.Throwable -> L31
        L1c:
            switch(r3) {
                case 14: goto L40;
                case 31: goto L64;
                default: goto L1f;
            }     // Catch: java.lang.Throwable -> L31
        L1f:
            int[] r3 = r9.jj_la1     // Catch: java.lang.Throwable -> L31
            r4 = 15
            int r5 = r9.jj_gen     // Catch: java.lang.Throwable -> L31
            r3[r4] = r5     // Catch: java.lang.Throwable -> L31
            r3 = -1
            r9.jj_consume_token(r3)     // Catch: java.lang.Throwable -> L31
            org.apache.james.mime4j.field.address.parser.ParseException r3 = new org.apache.james.mime4j.field.address.parser.ParseException     // Catch: java.lang.Throwable -> L31
            r3.<init>()     // Catch: java.lang.Throwable -> L31
            throw r3     // Catch: java.lang.Throwable -> L31
        L31:
            r3 = move-exception
            if (r0 == 0) goto L3c
            org.apache.james.mime4j.field.address.parser.JJTAddressListParserState r4 = r9.jjtree
            r4.closeNodeScope(r1, r8)
            r9.jjtreeCloseNodeScope(r1)
        L3c:
            throw r3
        L3d:
            int r3 = r9.jj_ntk     // Catch: java.lang.Throwable -> L31
            goto L1c
        L40:
            r3 = 14
            org.apache.james.mime4j.field.address.parser.Token r2 = r9.jj_consume_token(r3)     // Catch: java.lang.Throwable -> L31
        L46:
            int r3 = r9.jj_ntk     // Catch: java.lang.Throwable -> L31
            if (r3 != r6) goto L6b
            int r3 = r9.jj_ntk()     // Catch: java.lang.Throwable -> L31
        L4e:
            switch(r3) {
                case 9: goto L6e;
                case 14: goto L6e;
                case 31: goto L6e;
                default: goto L51;
            }     // Catch: java.lang.Throwable -> L31
        L51:
            int[] r3 = r9.jj_la1     // Catch: java.lang.Throwable -> L31
            r4 = 16
            int r5 = r9.jj_gen     // Catch: java.lang.Throwable -> L31
            r3[r4] = r5     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L63
            org.apache.james.mime4j.field.address.parser.JJTAddressListParserState r3 = r9.jjtree
            r3.closeNodeScope(r1, r8)
            r9.jjtreeCloseNodeScope(r1)
        L63:
            return
        L64:
            r3 = 31
            org.apache.james.mime4j.field.address.parser.Token r2 = r9.jj_consume_token(r3)     // Catch: java.lang.Throwable -> L31
            goto L46
        L6b:
            int r3 = r9.jj_ntk     // Catch: java.lang.Throwable -> L31
            goto L4e
        L6e:
            int r3 = r9.jj_ntk     // Catch: java.lang.Throwable -> L31
            if (r3 != r6) goto L9f
            int r3 = r9.jj_ntk()     // Catch: java.lang.Throwable -> L31
        L76:
            switch(r3) {
                case 9: goto La2;
                default: goto L79;
            }     // Catch: java.lang.Throwable -> L31
        L79:
            int[] r3 = r9.jj_la1     // Catch: java.lang.Throwable -> L31
            r4 = 17
            int r5 = r9.jj_gen     // Catch: java.lang.Throwable -> L31
            r3[r4] = r5     // Catch: java.lang.Throwable -> L31
        L81:
            int r3 = r2.kind     // Catch: java.lang.Throwable -> L31
            if (r3 == r7) goto L97
            java.lang.String r3 = r2.image     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = r2.image     // Catch: java.lang.Throwable -> L31
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L31
            int r4 = r4 + (-1)
            char r3 = r3.charAt(r4)     // Catch: java.lang.Throwable -> L31
            r4 = 46
            if (r3 == r4) goto La9
        L97:
            org.apache.james.mime4j.field.address.parser.ParseException r3 = new org.apache.james.mime4j.field.address.parser.ParseException     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = "Words in local part must be separated by '.'"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L31
            throw r3     // Catch: java.lang.Throwable -> L31
        L9f:
            int r3 = r9.jj_ntk     // Catch: java.lang.Throwable -> L31
            goto L76
        La2:
            r3 = 9
            org.apache.james.mime4j.field.address.parser.Token r2 = r9.jj_consume_token(r3)     // Catch: java.lang.Throwable -> L31
            goto L81
        La9:
            int r3 = r9.jj_ntk     // Catch: java.lang.Throwable -> L31
            if (r3 != r6) goto Lc6
            int r3 = r9.jj_ntk()     // Catch: java.lang.Throwable -> L31
        Lb1:
            switch(r3) {
                case 14: goto Lc9;
                case 31: goto Ld1;
                default: goto Lb4;
            }     // Catch: java.lang.Throwable -> L31
        Lb4:
            int[] r3 = r9.jj_la1     // Catch: java.lang.Throwable -> L31
            r4 = 18
            int r5 = r9.jj_gen     // Catch: java.lang.Throwable -> L31
            r3[r4] = r5     // Catch: java.lang.Throwable -> L31
            r3 = -1
            r9.jj_consume_token(r3)     // Catch: java.lang.Throwable -> L31
            org.apache.james.mime4j.field.address.parser.ParseException r3 = new org.apache.james.mime4j.field.address.parser.ParseException     // Catch: java.lang.Throwable -> L31
            r3.<init>()     // Catch: java.lang.Throwable -> L31
            throw r3     // Catch: java.lang.Throwable -> L31
        Lc6:
            int r3 = r9.jj_ntk     // Catch: java.lang.Throwable -> L31
            goto Lb1
        Lc9:
            r3 = 14
            org.apache.james.mime4j.field.address.parser.Token r2 = r9.jj_consume_token(r3)     // Catch: java.lang.Throwable -> L31
            goto L46
        Ld1:
            r3 = 31
            org.apache.james.mime4j.field.address.parser.Token r2 = r9.jj_consume_token(r3)     // Catch: java.lang.Throwable -> L31
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.james.mime4j.field.address.parser.AddressListParser.local_part():void");
    }

    public final void domain() throws ParseException {
        ASTdomain jjtn000 = new ASTdomain(11);
        this.jjtree.openNodeScope(jjtn000);
        jjtreeOpenNodeScope(jjtn000);
        try {
            switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
                case 14:
                    Token t = jj_consume_token(14);
                    while (true) {
                        switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
                            case 9:
                            case 14:
                                switch (this.jj_ntk == -1 ? jj_ntk() : this.jj_ntk) {
                                    case 9:
                                        t = jj_consume_token(9);
                                        break;
                                    default:
                                        this.jj_la1[20] = this.jj_gen;
                                        break;
                                }
                                if (t.image.charAt(t.image.length() - 1) != '.') {
                                    throw new ParseException("Atoms in domain names must be separated by '.'");
                                }
                                t = jj_consume_token(14);
                            default:
                                this.jj_la1[19] = this.jj_gen;
                                break;
                        }
                    }
                case 18:
                    jj_consume_token(18);
                    break;
                default:
                    this.jj_la1[21] = this.jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
            }
        } finally {
            if (1 != 0) {
                this.jjtree.closeNodeScope((Node) jjtn000, true);
                jjtreeCloseNodeScope(jjtn000);
            }
        }
    }

    private final boolean jj_2_1(int xla) {
        boolean z = true;
        this.jj_la = xla;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            if (jj_3_1()) {
                z = false;
            }
        } catch (LookaheadSuccess e) {
        } finally {
            jj_save(0, xla);
        }
        return z;
    }

    private final boolean jj_2_2(int xla) {
        this.jj_la = xla;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return !jj_3_2();
        } catch (LookaheadSuccess e) {
            return true;
        } finally {
            jj_save(1, xla);
        }
    }

    private final boolean jj_3R_12() {
        Token xsp;
        if (jj_scan_token(14)) {
            return true;
        }
        do {
            xsp = this.jj_scanpos;
        } while (!jj_3R_13());
        this.jj_scanpos = xsp;
        return false;
    }

    private final boolean jj_3R_10() {
        Token xsp = this.jj_scanpos;
        if (jj_3R_12()) {
            this.jj_scanpos = xsp;
            if (jj_scan_token(18)) {
                return true;
            }
        }
        return false;
    }

    private final boolean jj_3_2() {
        return jj_3R_8();
    }

    private final boolean jj_3R_9() {
        Token xsp;
        Token xsp2 = this.jj_scanpos;
        if (jj_scan_token(14)) {
            this.jj_scanpos = xsp2;
            if (jj_scan_token(31)) {
                return true;
            }
        }
        do {
            xsp = this.jj_scanpos;
        } while (!jj_3R_11());
        this.jj_scanpos = xsp;
        return false;
    }

    private final boolean jj_3R_11() {
        Token xsp = this.jj_scanpos;
        if (jj_scan_token(9)) {
            this.jj_scanpos = xsp;
        }
        Token xsp2 = this.jj_scanpos;
        if (jj_scan_token(14)) {
            this.jj_scanpos = xsp2;
            if (jj_scan_token(31)) {
                return true;
            }
        }
        return false;
    }

    private final boolean jj_3R_13() {
        Token xsp = this.jj_scanpos;
        if (jj_scan_token(9)) {
            this.jj_scanpos = xsp;
        }
        return jj_scan_token(14);
    }

    private final boolean jj_3R_8() {
        return jj_3R_9() || jj_scan_token(8) || jj_3R_10();
    }

    private final boolean jj_3_1() {
        return jj_3R_8();
    }

    static {
        jj_la1_0();
        jj_la1_1();
    }

    private static void jj_la1_0() {
        jj_la1_0 = new int[]{2, -2147467200, 8, -2147467200, 80, -2147467200, -2147467200, -2147467200, 8, -2147467200, EncryptionUtils.SYMMETRIC_KEY_LENGTH, 264, 8, -2147467264, -2147467264, -2147467264, -2147466752, 512, -2147467264, 16896, 512, 278528};
    }

    private static void jj_la1_1() {
        jj_la1_1 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    public AddressListParser(InputStream stream) {
        this(stream, null);
    }

    public AddressListParser(InputStream stream, String encoding) {
        this.jjtree = new JJTAddressListParserState();
        this.lookingAhead = false;
        this.jj_la1 = new int[22];
        this.jj_2_rtns = new JJCalls[2];
        this.jj_rescan = false;
        this.jj_gc = 0;
        this.jj_ls = new LookaheadSuccess();
        this.jj_expentries = new Vector<>();
        this.jj_kind = -1;
        this.jj_lasttokens = new int[100];
        try {
            this.jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1);
            this.token_source = new AddressListParserTokenManager(this.jj_input_stream);
            this.token = new Token();
            this.jj_ntk = -1;
            this.jj_gen = 0;
            for (int i = 0; i < 22; i++) {
                this.jj_la1[i] = -1;
            }
            for (int i2 = 0; i2 < this.jj_2_rtns.length; i2++) {
                this.jj_2_rtns[i2] = new JJCalls();
            }
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public void ReInit(InputStream stream) {
        ReInit(stream, null);
    }

    public void ReInit(InputStream stream, String encoding) {
        try {
            this.jj_input_stream.ReInit(stream, encoding, 1, 1);
            this.token_source.ReInit(this.jj_input_stream);
            this.token = new Token();
            this.jj_ntk = -1;
            this.jjtree.reset();
            this.jj_gen = 0;
            for (int i = 0; i < 22; i++) {
                this.jj_la1[i] = -1;
            }
            for (int i2 = 0; i2 < this.jj_2_rtns.length; i2++) {
                this.jj_2_rtns[i2] = new JJCalls();
            }
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public AddressListParser(Reader stream) {
        this.jjtree = new JJTAddressListParserState();
        this.lookingAhead = false;
        this.jj_la1 = new int[22];
        this.jj_2_rtns = new JJCalls[2];
        this.jj_rescan = false;
        this.jj_gc = 0;
        this.jj_ls = new LookaheadSuccess();
        this.jj_expentries = new Vector<>();
        this.jj_kind = -1;
        this.jj_lasttokens = new int[100];
        this.jj_input_stream = new SimpleCharStream(stream, 1, 1);
        this.token_source = new AddressListParserTokenManager(this.jj_input_stream);
        this.token = new Token();
        this.jj_ntk = -1;
        this.jj_gen = 0;
        for (int i = 0; i < 22; i++) {
            this.jj_la1[i] = -1;
        }
        for (int i2 = 0; i2 < this.jj_2_rtns.length; i2++) {
            this.jj_2_rtns[i2] = new JJCalls();
        }
    }

    public void ReInit(Reader stream) {
        this.jj_input_stream.ReInit(stream, 1, 1);
        this.token_source.ReInit(this.jj_input_stream);
        this.token = new Token();
        this.jj_ntk = -1;
        this.jjtree.reset();
        this.jj_gen = 0;
        for (int i = 0; i < 22; i++) {
            this.jj_la1[i] = -1;
        }
        for (int i2 = 0; i2 < this.jj_2_rtns.length; i2++) {
            this.jj_2_rtns[i2] = new JJCalls();
        }
    }

    public AddressListParser(AddressListParserTokenManager tm) {
        this.jjtree = new JJTAddressListParserState();
        this.lookingAhead = false;
        this.jj_la1 = new int[22];
        this.jj_2_rtns = new JJCalls[2];
        this.jj_rescan = false;
        this.jj_gc = 0;
        this.jj_ls = new LookaheadSuccess();
        this.jj_expentries = new Vector<>();
        this.jj_kind = -1;
        this.jj_lasttokens = new int[100];
        this.token_source = tm;
        this.token = new Token();
        this.jj_ntk = -1;
        this.jj_gen = 0;
        for (int i = 0; i < 22; i++) {
            this.jj_la1[i] = -1;
        }
        for (int i2 = 0; i2 < this.jj_2_rtns.length; i2++) {
            this.jj_2_rtns[i2] = new JJCalls();
        }
    }

    public void ReInit(AddressListParserTokenManager tm) {
        this.token_source = tm;
        this.token = new Token();
        this.jj_ntk = -1;
        this.jjtree.reset();
        this.jj_gen = 0;
        for (int i = 0; i < 22; i++) {
            this.jj_la1[i] = -1;
        }
        for (int i2 = 0; i2 < this.jj_2_rtns.length; i2++) {
            this.jj_2_rtns[i2] = new JJCalls();
        }
    }

    private final Token jj_consume_token(int kind) throws ParseException {
        Token oldToken = this.token;
        if (oldToken.next != null) {
            this.token = this.token.next;
        } else {
            Token token = this.token;
            Token nextToken = this.token_source.getNextToken();
            token.next = nextToken;
            this.token = nextToken;
        }
        this.jj_ntk = -1;
        if (this.token.kind == kind) {
            this.jj_gen++;
            int i = this.jj_gc + 1;
            this.jj_gc = i;
            if (i > 100) {
                this.jj_gc = 0;
                for (int i2 = 0; i2 < this.jj_2_rtns.length; i2++) {
                    for (JJCalls c = this.jj_2_rtns[i2]; c != null; c = c.next) {
                        if (c.gen < this.jj_gen) {
                            c.first = null;
                        }
                    }
                }
            }
            return this.token;
        }
        this.token = oldToken;
        this.jj_kind = kind;
        throw generateParseException();
    }

    /* loaded from: classes.dex */
    public static final class LookaheadSuccess extends Error {
        private LookaheadSuccess() {
        }
    }

    private final boolean jj_scan_token(int kind) {
        if (this.jj_scanpos == this.jj_lastpos) {
            this.jj_la--;
            if (this.jj_scanpos.next == null) {
                Token token = this.jj_scanpos;
                Token nextToken = this.token_source.getNextToken();
                token.next = nextToken;
                this.jj_scanpos = nextToken;
                this.jj_lastpos = nextToken;
            } else {
                Token token2 = this.jj_scanpos.next;
                this.jj_scanpos = token2;
                this.jj_lastpos = token2;
            }
        } else {
            this.jj_scanpos = this.jj_scanpos.next;
        }
        if (this.jj_rescan) {
            int i = 0;
            Token tok = this.token;
            while (tok != null && tok != this.jj_scanpos) {
                i++;
                tok = tok.next;
            }
            if (tok != null) {
                jj_add_error_token(kind, i);
            }
        }
        if (this.jj_scanpos.kind != kind) {
            return true;
        }
        if (this.jj_la != 0 || this.jj_scanpos != this.jj_lastpos) {
            return false;
        }
        throw this.jj_ls;
    }

    public final Token getNextToken() {
        if (this.token.next != null) {
            this.token = this.token.next;
        } else {
            Token token = this.token;
            Token nextToken = this.token_source.getNextToken();
            token.next = nextToken;
            this.token = nextToken;
        }
        this.jj_ntk = -1;
        this.jj_gen++;
        return this.token;
    }

    public final Token getToken(int index) {
        Token t;
        Token t2 = this.lookingAhead ? this.jj_scanpos : this.token;
        int i = 0;
        Token t3 = t2;
        while (i < index) {
            if (t3.next != null) {
                t = t3.next;
            } else {
                t = this.token_source.getNextToken();
                t3.next = t;
            }
            i++;
            t3 = t;
        }
        return t3;
    }

    private final int jj_ntk() {
        Token token = this.token.next;
        this.jj_nt = token;
        if (token == null) {
            Token token2 = this.token;
            Token nextToken = this.token_source.getNextToken();
            token2.next = nextToken;
            int i = nextToken.kind;
            this.jj_ntk = i;
            return i;
        }
        int i2 = this.jj_nt.kind;
        this.jj_ntk = i2;
        return i2;
    }

    private void jj_add_error_token(int kind, int pos) {
        if (pos < 100) {
            if (pos == this.jj_endpos + 1) {
                int[] iArr = this.jj_lasttokens;
                int i = this.jj_endpos;
                this.jj_endpos = i + 1;
                iArr[i] = kind;
            } else if (this.jj_endpos != 0) {
                this.jj_expentry = new int[this.jj_endpos];
                for (int i2 = 0; i2 < this.jj_endpos; i2++) {
                    this.jj_expentry[i2] = this.jj_lasttokens[i2];
                }
                boolean exists = false;
                Enumeration e = this.jj_expentries.elements();
                while (e.hasMoreElements()) {
                    int[] oldentry = e.nextElement();
                    if (oldentry.length == this.jj_expentry.length) {
                        exists = true;
                        int i3 = 0;
                        while (true) {
                            if (i3 < this.jj_expentry.length) {
                                if (oldentry[i3] == this.jj_expentry[i3]) {
                                    i3++;
                                } else {
                                    exists = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (exists) {
                            break;
                        }
                    }
                }
                if (!exists) {
                    this.jj_expentries.addElement(this.jj_expentry);
                }
                if (pos != 0) {
                    int[] iArr2 = this.jj_lasttokens;
                    this.jj_endpos = pos;
                    iArr2[pos - 1] = kind;
                }
            }
        }
    }

    public ParseException generateParseException() {
        this.jj_expentries.removeAllElements();
        boolean[] la1tokens = new boolean[34];
        for (int i = 0; i < 34; i++) {
            la1tokens[i] = false;
        }
        if (this.jj_kind >= 0) {
            la1tokens[this.jj_kind] = true;
            this.jj_kind = -1;
        }
        for (int i2 = 0; i2 < 22; i2++) {
            if (this.jj_la1[i2] == this.jj_gen) {
                for (int j = 0; j < 32; j++) {
                    if ((jj_la1_0[i2] & (1 << j)) != 0) {
                        la1tokens[j] = true;
                    }
                    if ((jj_la1_1[i2] & (1 << j)) != 0) {
                        la1tokens[j + 32] = true;
                    }
                }
            }
        }
        for (int i3 = 0; i3 < 34; i3++) {
            if (la1tokens[i3]) {
                this.jj_expentry = new int[1];
                this.jj_expentry[0] = i3;
                this.jj_expentries.addElement(this.jj_expentry);
            }
        }
        this.jj_endpos = 0;
        jj_rescan_token();
        jj_add_error_token(0, 0);
        int[][] exptokseq = new int[this.jj_expentries.size()];
        for (int i4 = 0; i4 < this.jj_expentries.size(); i4++) {
            exptokseq[i4] = this.jj_expentries.elementAt(i4);
        }
        return new ParseException(this.token, exptokseq, tokenImage);
    }

    public final void enable_tracing() {
    }

    public final void disable_tracing() {
    }

    private final void jj_rescan_token() {
        this.jj_rescan = true;
        for (int i = 0; i < 2; i++) {
            try {
                JJCalls p = this.jj_2_rtns[i];
                do {
                    if (p.gen > this.jj_gen) {
                        this.jj_la = p.arg;
                        Token token = p.first;
                        this.jj_scanpos = token;
                        this.jj_lastpos = token;
                        switch (i) {
                            case 0:
                                jj_3_1();
                                break;
                            case 1:
                                jj_3_2();
                                break;
                        }
                    }
                    p = p.next;
                } while (p != null);
            } catch (LookaheadSuccess e) {
            }
        }
        this.jj_rescan = false;
    }

    private final void jj_save(int index, int xla) {
        JJCalls p = this.jj_2_rtns[index];
        while (true) {
            if (p.gen <= this.jj_gen) {
                break;
            } else if (p.next == null) {
                JJCalls p2 = new JJCalls();
                p.next = p2;
                p = p2;
                break;
            } else {
                p = p.next;
            }
        }
        p.gen = (this.jj_gen + xla) - this.jj_la;
        p.first = this.token;
        p.arg = xla;
    }

    /* loaded from: classes.dex */
    public static final class JJCalls {
        int arg;
        Token first;
        int gen;
        JJCalls next;

        JJCalls() {
        }
    }
}
