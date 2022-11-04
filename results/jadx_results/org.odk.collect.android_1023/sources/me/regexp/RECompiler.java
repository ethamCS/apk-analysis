package me.regexp;

import java.util.Hashtable;
import org.apache.james.mime4j.field.datetime.parser.DateTimeParserConstants;
import org.kxml2.wap.Wbxml;
import org.opendatakit.httpclientandroidlib.HttpStatus;
/* loaded from: classes.dex */
public class RECompiler {
    static final int ESC_BACKREF = 1048575;
    static final int ESC_CLASS = 1048573;
    static final int ESC_COMPLEX = 1048574;
    static final int ESC_MASK = 1048560;
    static final int NODE_NORMAL = 0;
    static final int NODE_NULLABLE = 1;
    static final int NODE_TOPLEVEL = 2;
    static final int bracketUnbounded = -1;
    static final Hashtable hashPOSIX = new Hashtable();
    int bracketMin;
    int bracketOpt;
    int idx;
    int len;
    int parens;
    String pattern;
    char[] instruction = new char[Wbxml.EXT_T_0];
    int lenInstruction = 0;

    static {
        hashPOSIX.put("alnum", new Character('w'));
        hashPOSIX.put("alpha", new Character('a'));
        hashPOSIX.put("blank", new Character('b'));
        hashPOSIX.put("cntrl", new Character('c'));
        hashPOSIX.put("digit", new Character('d'));
        hashPOSIX.put("graph", new Character('g'));
        hashPOSIX.put("lower", new Character('l'));
        hashPOSIX.put("print", new Character('p'));
        hashPOSIX.put("punct", new Character('!'));
        hashPOSIX.put("space", new Character('s'));
        hashPOSIX.put("upper", new Character('u'));
        hashPOSIX.put("xdigit", new Character('x'));
        hashPOSIX.put("javastart", new Character('j'));
        hashPOSIX.put("javapart", new Character('k'));
    }

    void ensure(int n) {
        int curlen = this.instruction.length;
        if (this.lenInstruction + n >= curlen) {
            while (this.lenInstruction + n >= curlen) {
                curlen *= 2;
            }
            char[] newInstruction = new char[curlen];
            System.arraycopy(this.instruction, 0, newInstruction, 0, this.lenInstruction);
            this.instruction = newInstruction;
        }
    }

    void emit(char c) {
        ensure(1);
        char[] cArr = this.instruction;
        int i = this.lenInstruction;
        this.lenInstruction = i + 1;
        cArr[i] = c;
    }

    void nodeInsert(char opcode, int opdata, int insertAt) {
        ensure(3);
        System.arraycopy(this.instruction, insertAt, this.instruction, insertAt + 3, this.lenInstruction - insertAt);
        this.instruction[insertAt] = opcode;
        this.instruction[insertAt + 1] = (char) opdata;
        this.instruction[insertAt + 2] = 0;
        this.lenInstruction += 3;
    }

    void setNextOfEnd(int node, int pointTo) {
        char c = this.instruction[node + 2];
        while (c != 0 && node < this.lenInstruction) {
            if (node == pointTo) {
                pointTo = this.lenInstruction;
            }
            node += c;
            c = this.instruction[node + 2];
        }
        if (node < this.lenInstruction) {
            int offset = pointTo - node;
            if (offset != ((short) offset)) {
                throw new RESyntaxException("Exceeded short jump range.");
            }
            this.instruction[node + 2] = (char) ((short) offset);
        }
    }

    int node(char opcode, int opdata) {
        ensure(3);
        this.instruction[this.lenInstruction] = opcode;
        this.instruction[this.lenInstruction + 1] = (char) opdata;
        this.instruction[this.lenInstruction + 2] = 0;
        this.lenInstruction += 3;
        return this.lenInstruction - 3;
    }

    void internalError() throws Error {
        throw new Error("Internal error!");
    }

    void syntaxError(String s) throws RESyntaxException {
        throw new RESyntaxException(s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
        if (r2.charAt(r3) != ',') goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r2.charAt(r3) != '{') goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void bracket() throws me.regexp.RESyntaxException {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.regexp.RECompiler.bracket():void");
    }

    int escape() throws RESyntaxException {
        int i;
        int i2;
        if (this.pattern.charAt(this.idx) != '\\') {
            internalError();
        }
        if (this.idx + 1 == this.len) {
            syntaxError("Escape terminates string");
        }
        this.idx += 2;
        char escapeChar = this.pattern.charAt(this.idx - 1);
        switch (escapeChar) {
            case DateTimeParserConstants.ANY /* 48 */:
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                if ((this.idx < this.len && Character.isDigit(this.pattern.charAt(this.idx))) || escapeChar == '0') {
                    int val = escapeChar - '0';
                    if (this.idx < this.len && Character.isDigit(this.pattern.charAt(this.idx))) {
                        String str = this.pattern;
                        this.idx = this.idx + 1;
                        int val2 = (val << 3) + (str.charAt(i) - '0');
                        if (this.idx < this.len && Character.isDigit(this.pattern.charAt(this.idx))) {
                            String str2 = this.pattern;
                            this.idx = this.idx + 1;
                            return (val2 << 3) + (str2.charAt(i2) - '0');
                        }
                        return val2;
                    }
                    return val;
                }
                return ESC_BACKREF;
            case Wbxml.EXT_I_2 /* 66 */:
            case 'b':
                return ESC_COMPLEX;
            case Wbxml.LITERAL_C /* 68 */:
            case 'S':
            case 'W':
            case 'd':
            case 's':
            case 'w':
                return ESC_CLASS;
            case HttpStatus.SC_PROCESSING /* 102 */:
                return 12;
            case 'n':
                return 10;
            case 'r':
                return 13;
            case 't':
                return 9;
            case 'u':
            case 'x':
                int hexDigits = escapeChar == 'u' ? 4 : 2;
                int val3 = 0;
                while (this.idx < this.len) {
                    int hexDigits2 = hexDigits - 1;
                    if (hexDigits > 0) {
                        char c = this.pattern.charAt(this.idx);
                        if (c >= '0' && c <= '9') {
                            val3 = ((val3 << 4) + c) - 48;
                        } else {
                            char c2 = Character.toLowerCase(c);
                            if (c2 >= 'a' && c2 <= 'f') {
                                val3 = (val3 << 4) + (c2 - 'a') + 10;
                            } else {
                                syntaxError(new StringBuffer().append("Expected ").append(hexDigits2).append(" hexadecimal digits after \\").append(escapeChar).toString());
                            }
                        }
                        this.idx++;
                        hexDigits = hexDigits2;
                    } else {
                        return val3;
                    }
                }
                return val3;
            default:
                return escapeChar;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
        if (r0.charAt(r18) == ']') goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0345  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int characterClass() throws me.regexp.RESyntaxException {
        /*
            Method dump skipped, instructions count: 1134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.regexp.RECompiler.characterClass():int");
    }

    int atom() throws RESyntaxException {
        int ret = node('A', 0);
        int lenAtom = 0;
        while (true) {
            if (this.idx < this.len) {
                if (this.idx + 1 < this.len) {
                    char c = this.pattern.charAt(this.idx + 1);
                    if (this.pattern.charAt(this.idx) == '\\') {
                        int idxEscape = this.idx;
                        escape();
                        if (this.idx < this.len) {
                            c = this.pattern.charAt(this.idx);
                        }
                        this.idx = idxEscape;
                    }
                    switch (c) {
                        case '*':
                        case '+':
                        case '?':
                        case '{':
                            if (lenAtom != 0) {
                                break;
                            }
                            break;
                    }
                }
                switch (this.pattern.charAt(this.idx)) {
                    case DateTimeParserConstants.WS /* 36 */:
                    case '(':
                    case ')':
                    case DateTimeParserConstants.DIGITS /* 46 */:
                    case '[':
                    case ']':
                    case '^':
                    case '|':
                        break;
                    case '*':
                    case '+':
                    case '?':
                    case '{':
                        if (lenAtom == 0) {
                            syntaxError("Missing operand to closure");
                            break;
                        }
                        break;
                    case '\\':
                        int idxBeforeEscape = this.idx;
                        int c2 = escape();
                        if ((c2 & ESC_MASK) == ESC_MASK) {
                            this.idx = idxBeforeEscape;
                            break;
                        } else {
                            emit((char) c2);
                            lenAtom++;
                            break;
                        }
                    default:
                        String str = this.pattern;
                        int i = this.idx;
                        this.idx = i + 1;
                        emit(str.charAt(i));
                        lenAtom++;
                        break;
                }
            }
        }
        if (lenAtom == 0) {
            internalError();
        }
        this.instruction[ret + 1] = (char) lenAtom;
        return ret;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int terminal(int[] r7) throws me.regexp.RESyntaxException {
        /*
            r6 = this;
            r5 = 0
            java.lang.String r2 = r6.pattern
            int r3 = r6.idx
            char r2 = r2.charAt(r3)
            switch(r2) {
                case 0: goto L3f;
                case 36: goto L17;
                case 40: goto L2d;
                case 41: goto L32;
                case 42: goto L44;
                case 43: goto L44;
                case 46: goto L17;
                case 63: goto L44;
                case 91: goto L28;
                case 92: goto L49;
                case 93: goto L3a;
                case 94: goto L17;
                case 123: goto L44;
                case 124: goto L37;
                default: goto Lc;
            }
        Lc:
            r2 = r7[r5]
            r2 = r2 & (-2)
            r7[r5] = r2
            int r2 = r6.atom()
        L16:
            return r2
        L17:
            java.lang.String r2 = r6.pattern
            int r3 = r6.idx
            int r4 = r3 + 1
            r6.idx = r4
            char r2 = r2.charAt(r3)
            int r2 = r6.node(r2, r5)
            goto L16
        L28:
            int r2 = r6.characterClass()
            goto L16
        L2d:
            int r2 = r6.expr(r7)
            goto L16
        L32:
            java.lang.String r2 = "Unexpected close paren"
            r6.syntaxError(r2)
        L37:
            r6.internalError()
        L3a:
            java.lang.String r2 = "Mismatched class"
            r6.syntaxError(r2)
        L3f:
            java.lang.String r2 = "Unexpected end of input"
            r6.syntaxError(r2)
        L44:
            java.lang.String r2 = "Missing operand to closure"
            r6.syntaxError(r2)
        L49:
            int r1 = r6.idx
            int r2 = r6.escape()
            switch(r2) {
                case 1048573: goto L5b;
                case 1048574: goto L5b;
                case 1048575: goto L72;
                default: goto L52;
            }
        L52:
            r6.idx = r1
            r2 = r7[r5]
            r2 = r2 & (-2)
            r7[r5] = r2
            goto Lc
        L5b:
            r2 = r7[r5]
            r2 = r2 & (-2)
            r7[r5] = r2
            r2 = 92
            java.lang.String r3 = r6.pattern
            int r4 = r6.idx
            int r4 = r4 + (-1)
            char r3 = r3.charAt(r4)
            int r2 = r6.node(r2, r3)
            goto L16
        L72:
            java.lang.String r2 = r6.pattern
            int r3 = r6.idx
            int r3 = r3 + (-1)
            char r2 = r2.charAt(r3)
            int r2 = r2 + (-48)
            char r0 = (char) r2
            int r2 = r6.parens
            if (r2 > r0) goto L88
            java.lang.String r2 = "Bad backreference"
            r6.syntaxError(r2)
        L88:
            r2 = r7[r5]
            r2 = r2 | 1
            r7[r5] = r2
            r2 = 35
            int r2 = r6.node(r2, r0)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: me.regexp.RECompiler.terminal(int[]):int");
    }

    int closure(int[] flags) throws RESyntaxException {
        int idxBeforeTerminal = this.idx;
        int[] terminalFlags = {0};
        int ret = terminal(terminalFlags);
        flags[0] = flags[0] | terminalFlags[0];
        if (this.idx < this.len) {
            boolean greedy = true;
            char closureType = this.pattern.charAt(this.idx);
            switch (closureType) {
                case '*':
                case '?':
                    flags[0] = flags[0] | 1;
                case '+':
                    this.idx++;
                case '{':
                    char c = this.instruction[ret];
                    if (c == '^' || c == '$') {
                        syntaxError("Bad closure operand");
                    }
                    if ((terminalFlags[0] & 1) != 0) {
                        syntaxError("Closure operand can't be nullable");
                        break;
                    }
                    break;
            }
            if (this.idx < this.len && this.pattern.charAt(this.idx) == '?') {
                this.idx++;
                greedy = false;
            }
            if (greedy) {
                switch (closureType) {
                    case '*':
                        nodeInsert('*', 0, ret);
                        setNextOfEnd(ret + 3, ret);
                        break;
                    case '+':
                        nodeInsert('C', 0, ret);
                        int n = node('+', 0);
                        setNextOfEnd(ret + 3, n);
                        setNextOfEnd(n, ret);
                        break;
                    case '?':
                        nodeInsert('?', 0, ret);
                        int n2 = node('N', 0);
                        setNextOfEnd(ret, n2);
                        setNextOfEnd(ret + 3, n2);
                        break;
                    case '{':
                        bracket();
                        int bracketEnd = this.idx;
                        int bracketMin = this.bracketMin;
                        int bracketOpt = this.bracketOpt;
                        int c2 = 0;
                        int pos = ret;
                        while (c2 < bracketMin) {
                            this.idx = idxBeforeTerminal;
                            int pos2 = terminal(terminalFlags);
                            setNextOfEnd(pos, pos2);
                            c2++;
                            pos = pos2;
                        }
                        if (bracketOpt == -1) {
                            this.idx = bracketEnd;
                            nodeInsert('*', 0, pos);
                            setNextOfEnd(pos + 3, pos);
                            break;
                        } else {
                            if (bracketOpt > 0) {
                                int[] opt = new int[bracketOpt + 1];
                                nodeInsert('?', 0, pos);
                                opt[0] = pos;
                                for (int c3 = 1; c3 < bracketOpt; c3++) {
                                    opt[c3] = node('?', 0);
                                    this.idx = idxBeforeTerminal;
                                    terminal(terminalFlags);
                                }
                                int end = node('N', 0);
                                opt[bracketOpt] = end;
                                for (int c4 = 0; c4 < bracketOpt; c4++) {
                                    setNextOfEnd(opt[c4], end);
                                    setNextOfEnd(opt[c4] + 3, opt[c4 + 1]);
                                }
                            } else {
                                this.lenInstruction = pos;
                                node('N', 0);
                            }
                            this.idx = bracketEnd;
                            break;
                        }
                }
            } else {
                switch (closureType) {
                    case '*':
                        nodeInsert('8', 0, ret);
                        setNextOfEnd(ret + 3, ret);
                        break;
                    case '+':
                        nodeInsert('C', 0, ret);
                        int n3 = node('=', 0);
                        setNextOfEnd(n3, ret);
                        setNextOfEnd(ret + 3, n3);
                        break;
                    case '?':
                        nodeInsert('/', 0, ret);
                        int n4 = node('N', 0);
                        setNextOfEnd(ret, n4);
                        setNextOfEnd(ret + 3, n4);
                        break;
                }
            }
        }
        return ret;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        r4 = node('N', 0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int branch(int[] r10) throws me.regexp.RESyntaxException {
        /*
            r9 = this;
            r8 = -1
            r7 = 0
            r4 = -1
            r0 = -1
            r5 = 1
            int[] r1 = new int[r5]
            r3 = 1
        L8:
            int r5 = r9.idx
            int r6 = r9.len
            if (r5 >= r6) goto L3b
            java.lang.String r5 = r9.pattern
            int r6 = r9.idx
            char r5 = r5.charAt(r6)
            r6 = 124(0x7c, float:1.74E-43)
            if (r5 == r6) goto L3b
            java.lang.String r5 = r9.pattern
            int r6 = r9.idx
            char r5 = r5.charAt(r6)
            r6 = 41
            if (r5 == r6) goto L3b
            r1[r7] = r7
            int r2 = r9.closure(r1)
            r5 = r1[r7]
            if (r5 != 0) goto L31
            r3 = 0
        L31:
            if (r0 == r8) goto L36
            r9.setNextOfEnd(r0, r2)
        L36:
            r0 = r2
            if (r4 != r8) goto L8
            r4 = r2
            goto L8
        L3b:
            if (r4 != r8) goto L43
            r5 = 78
            int r4 = r9.node(r5, r7)
        L43:
            if (r3 == 0) goto L4b
            r5 = r10[r7]
            r5 = r5 | 1
            r10[r7] = r5
        L4b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: me.regexp.RECompiler.branch(int[]):int");
    }

    int expr(int[] flags) throws RESyntaxException {
        int end;
        int paren = -1;
        int ret = -1;
        int closeParens = this.parens;
        if ((flags[0] & 2) == 0 && this.pattern.charAt(this.idx) == '(') {
            if (this.idx + 2 < this.len && this.pattern.charAt(this.idx + 1) == '?' && this.pattern.charAt(this.idx + 2) == ':') {
                paren = 2;
                this.idx += 3;
                ret = node('<', 0);
            } else {
                paren = 1;
                this.idx++;
                int i = this.parens;
                this.parens = i + 1;
                ret = node('(', i);
            }
        }
        flags[0] = flags[0] & (-3);
        boolean open = false;
        int branch = branch(flags);
        if (ret == -1) {
            ret = branch;
        } else {
            setNextOfEnd(ret, branch);
        }
        while (this.idx < this.len && this.pattern.charAt(this.idx) == '|') {
            if (!open) {
                nodeInsert('|', 0, branch);
                open = true;
            }
            this.idx++;
            int branch2 = node('|', 0);
            setNextOfEnd(branch, branch2);
            branch(flags);
            branch = branch2;
        }
        if (paren > 0) {
            if (this.idx < this.len && this.pattern.charAt(this.idx) == ')') {
                this.idx++;
            } else {
                syntaxError("Missing close paren");
            }
            if (paren == 1) {
                end = node(')', closeParens);
            } else {
                end = node('>', 0);
            }
        } else {
            end = node('E', 0);
        }
        setNextOfEnd(ret, end);
        int currentNode = ret;
        char c = this.instruction[currentNode + 2];
        while (c != 0 && currentNode < this.lenInstruction) {
            if (this.instruction[currentNode] == '|') {
                setNextOfEnd(currentNode + 3, end);
            }
            c = this.instruction[currentNode + 2];
            currentNode += c;
        }
        return ret;
    }

    public REProgram compile(String pattern) throws RESyntaxException {
        this.pattern = pattern;
        this.len = pattern.length();
        this.idx = 0;
        this.lenInstruction = 0;
        this.parens = 1;
        int[] flags = {2};
        expr(flags);
        if (this.idx != this.len) {
            if (pattern.charAt(this.idx) == ')') {
                syntaxError("Unmatched close paren");
            }
            syntaxError("Unexpected input remains");
        }
        char[] ins = new char[this.lenInstruction];
        System.arraycopy(this.instruction, 0, ins, 0, this.lenInstruction);
        return new REProgram(this.parens, ins);
    }

    /* loaded from: classes.dex */
    public class RERange {
        private final RECompiler this$0;
        int size = 16;
        int[] minRange = new int[this.size];
        int[] maxRange = new int[this.size];
        int num = 0;

        RERange(RECompiler rECompiler) {
            this.this$0 = rECompiler;
        }

        void delete(int index) {
            if (this.num == 0 || index >= this.num) {
                return;
            }
            while (true) {
                index++;
                if (index < this.num) {
                    if (index - 1 >= 0) {
                        this.minRange[index - 1] = this.minRange[index];
                        this.maxRange[index - 1] = this.maxRange[index];
                    }
                } else {
                    this.num--;
                    return;
                }
            }
        }

        void merge(int min, int max) {
            for (int i = 0; i < this.num; i++) {
                if (min < this.minRange[i] || max > this.maxRange[i]) {
                    if (min <= this.minRange[i] && max >= this.maxRange[i]) {
                        delete(i);
                        merge(min, max);
                        return;
                    } else if (min >= this.minRange[i] && min <= this.maxRange[i]) {
                        int min2 = this.minRange[i];
                        delete(i);
                        merge(min2, max);
                        return;
                    } else if (max >= this.minRange[i] && max <= this.maxRange[i]) {
                        int max2 = this.maxRange[i];
                        delete(i);
                        merge(min, max2);
                        return;
                    }
                } else {
                    return;
                }
            }
            if (this.num >= this.size) {
                this.size *= 2;
                int[] newMin = new int[this.size];
                int[] newMax = new int[this.size];
                System.arraycopy(this.minRange, 0, newMin, 0, this.num);
                System.arraycopy(this.maxRange, 0, newMax, 0, this.num);
                this.minRange = newMin;
                this.maxRange = newMax;
            }
            this.minRange[this.num] = min;
            this.maxRange[this.num] = max;
            this.num++;
        }

        void remove(int min, int max) {
            for (int i = 0; i < this.num; i++) {
                if (this.minRange[i] >= min && this.maxRange[i] <= max) {
                    delete(i);
                    return;
                } else if (min >= this.minRange[i] && max <= this.maxRange[i]) {
                    int minr = this.minRange[i];
                    int maxr = this.maxRange[i];
                    delete(i);
                    if (minr < min) {
                        merge(minr, min - 1);
                    }
                    if (max < maxr) {
                        merge(max + 1, maxr);
                        return;
                    }
                    return;
                } else if (this.minRange[i] >= min && this.minRange[i] <= max) {
                    this.minRange[i] = max + 1;
                    return;
                } else if (this.maxRange[i] >= min && this.maxRange[i] <= max) {
                    this.maxRange[i] = min - 1;
                    return;
                }
            }
        }

        void include(int min, int max, boolean include) {
            if (include) {
                merge(min, max);
            } else {
                remove(min, max);
            }
        }

        void include(char minmax, boolean include) {
            include(minmax, minmax, include);
        }
    }
}
