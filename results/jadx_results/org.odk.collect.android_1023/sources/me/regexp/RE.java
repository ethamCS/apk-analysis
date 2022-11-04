package me.regexp;

import java.util.Vector;
import org.apache.james.mime4j.field.datetime.parser.DateTimeParserConstants;
/* loaded from: classes.dex */
public class RE {
    static final char E_ALNUM = 'w';
    static final char E_BOUND = 'b';
    static final char E_DIGIT = 'd';
    static final char E_NALNUM = 'W';
    static final char E_NBOUND = 'B';
    static final char E_NDIGIT = 'D';
    static final char E_NSPACE = 'S';
    static final char E_SPACE = 's';
    public static final int MATCH_CASEINDEPENDENT = 1;
    public static final int MATCH_MULTILINE = 2;
    public static final int MATCH_NORMAL = 0;
    public static final int MATCH_SINGLELINE = 4;
    static final int MAX_PAREN = 16;
    static final char OP_ANY = '.';
    static final char OP_ANYOF = '[';
    static final char OP_ATOM = 'A';
    static final char OP_BACKREF = '#';
    static final char OP_BOL = '^';
    static final char OP_BRANCH = '|';
    static final char OP_CLOSE = ')';
    static final char OP_CLOSE_CLUSTER = '>';
    static final char OP_CONTINUE = 'C';
    static final char OP_END = 'E';
    static final char OP_EOL = '$';
    static final char OP_ESCAPE = '\\';
    static final char OP_GOTO = 'G';
    static final char OP_MAYBE = '?';
    static final char OP_NOTHING = 'N';
    static final char OP_OPEN = '(';
    static final char OP_OPEN_CLUSTER = '<';
    static final char OP_PLUS = '+';
    static final char OP_POSIXCLASS = 'P';
    static final char OP_RELUCTANTMAYBE = '/';
    static final char OP_RELUCTANTPLUS = '=';
    static final char OP_RELUCTANTSTAR = '8';
    static final char OP_STAR = '*';
    static final char POSIX_CLASS_ALNUM = 'w';
    static final char POSIX_CLASS_ALPHA = 'a';
    static final char POSIX_CLASS_BLANK = 'b';
    static final char POSIX_CLASS_CNTRL = 'c';
    static final char POSIX_CLASS_DIGIT = 'd';
    static final char POSIX_CLASS_GRAPH = 'g';
    static final char POSIX_CLASS_JPART = 'k';
    static final char POSIX_CLASS_JSTART = 'j';
    static final char POSIX_CLASS_LOWER = 'l';
    static final char POSIX_CLASS_PRINT = 'p';
    static final char POSIX_CLASS_PUNCT = '!';
    static final char POSIX_CLASS_SPACE = 's';
    static final char POSIX_CLASS_UPPER = 'u';
    static final char POSIX_CLASS_XDIGIT = 'x';
    public static final int REPLACE_ALL = 0;
    public static final int REPLACE_BACKREFERENCES = 2;
    public static final int REPLACE_FIRSTONLY = 1;
    static final int maxNode = 65536;
    static final int nodeSize = 3;
    static final int offsetNext = 2;
    static final int offsetOpcode = 0;
    static final int offsetOpdata = 1;
    transient int end0;
    transient int end1;
    transient int end2;
    transient int[] endBackref;
    transient int[] endn;
    int matchFlags;
    int maxParen;
    transient int parenCount;
    REProgram program;
    transient CharacterIterator search;
    transient int start0;
    transient int start1;
    transient int start2;
    transient int[] startBackref;
    transient int[] startn;

    public RE(String pattern) throws RESyntaxException {
        this(pattern, 0);
    }

    public RE(String pattern, int matchFlags) throws RESyntaxException {
        this(new RECompiler().compile(pattern), matchFlags);
    }

    public RE(REProgram program, int matchFlags) {
        this.maxParen = 16;
        setProgram(program);
        setMatchFlags(matchFlags);
    }

    public RE(REProgram program) {
        this(program, 0);
    }

    public RE() {
        this((REProgram) null, 0);
    }

    public static String simplePatternToFullRegularExpression(String pattern) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            switch (c) {
                case DateTimeParserConstants.WS /* 36 */:
                case '(':
                case ')':
                case '+':
                case DateTimeParserConstants.DIGITS /* 46 */:
                case '?':
                case '[':
                case '\\':
                case ']':
                case '^':
                case '{':
                case '|':
                case '}':
                    buf.append(OP_ESCAPE);
                    break;
                case '*':
                    buf.append(".*");
                    continue;
            }
            buf.append(c);
        }
        return buf.toString();
    }

    public void setMatchFlags(int matchFlags) {
        this.matchFlags = matchFlags;
    }

    public int getMatchFlags() {
        return this.matchFlags;
    }

    public void setProgram(REProgram program) {
        this.program = program;
        if (program != null && program.maxParens != -1) {
            this.maxParen = program.maxParens;
        } else {
            this.maxParen = 16;
        }
    }

    public REProgram getProgram() {
        return this.program;
    }

    public int getParenCount() {
        return this.parenCount;
    }

    public String getParen(int which) {
        int start;
        if (which >= this.parenCount || (start = getParenStart(which)) < 0) {
            return null;
        }
        return this.search.substring(start, getParenEnd(which));
    }

    public final int getParenStart(int which) {
        if (which < this.parenCount) {
            switch (which) {
                case 0:
                    return this.start0;
                case 1:
                    return this.start1;
                case 2:
                    return this.start2;
                default:
                    if (this.startn == null) {
                        allocParens();
                    }
                    return this.startn[which];
            }
        }
        return -1;
    }

    public final int getParenEnd(int which) {
        if (which < this.parenCount) {
            switch (which) {
                case 0:
                    return this.end0;
                case 1:
                    return this.end1;
                case 2:
                    return this.end2;
                default:
                    if (this.endn == null) {
                        allocParens();
                    }
                    return this.endn[which];
            }
        }
        return -1;
    }

    public final int getParenLength(int which) {
        if (which < this.parenCount) {
            return getParenEnd(which) - getParenStart(which);
        }
        return -1;
    }

    protected final void setParenStart(int which, int i) {
        if (which < this.parenCount) {
            switch (which) {
                case 0:
                    this.start0 = i;
                    return;
                case 1:
                    this.start1 = i;
                    return;
                case 2:
                    this.start2 = i;
                    return;
                default:
                    if (this.startn == null) {
                        allocParens();
                    }
                    this.startn[which] = i;
                    return;
            }
        }
    }

    protected final void setParenEnd(int which, int i) {
        if (which < this.parenCount) {
            switch (which) {
                case 0:
                    this.end0 = i;
                    return;
                case 1:
                    this.end1 = i;
                    return;
                case 2:
                    this.end2 = i;
                    return;
                default:
                    if (this.endn == null) {
                        allocParens();
                    }
                    this.endn[which] = i;
                    return;
            }
        }
    }

    protected void internalError(String s) throws Error {
        throw new Error(new StringBuffer().append("RE internal error: ").append(s).toString());
    }

    private void allocParens() {
        this.startn = new int[this.maxParen];
        this.endn = new int[this.maxParen];
        for (int i = 0; i < this.maxParen; i++) {
            this.startn[i] = -1;
            this.endn[i] = -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:0x0625, code lost:
        r13 = matchNodes(r21 + 3, me.regexp.RE.maxNode, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0637, code lost:
        if (r13 != (-1)) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0639, code lost:
        r0 = (short) r15[r21 + 2];
        r21 = r21 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0644, code lost:
        if (r0 == 0) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x064e, code lost:
        if (r15[r21] == '|') goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0650, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:?, code lost:
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected int matchNodes(int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 1886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.regexp.RE.matchNodes(int, int, int):int");
    }

    protected boolean matchAt(int i) {
        this.start0 = -1;
        this.end0 = -1;
        this.start1 = -1;
        this.end1 = -1;
        this.start2 = -1;
        this.end2 = -1;
        this.startn = null;
        this.endn = null;
        this.parenCount = 1;
        setParenStart(0, i);
        if ((this.program.flags & 1) != 0) {
            this.startBackref = new int[this.maxParen];
            this.endBackref = new int[this.maxParen];
        }
        int idx = matchNodes(0, maxNode, i);
        if (idx != -1) {
            setParenEnd(0, idx);
            return true;
        }
        this.parenCount = 0;
        return false;
    }

    public boolean match(String search, int i) {
        return match(new StringCharacterIterator(search), i);
    }

    public boolean match(CharacterIterator search, int i) {
        int k;
        if (this.program == null) {
            internalError("No RE program to run!");
        }
        this.search = search;
        if ((this.program.flags & 2) == 2) {
            if ((this.matchFlags & 2) == 0) {
                return i == 0 && matchAt(i);
            }
            while (!search.isEnd(i)) {
                if (!isNewline(i)) {
                    if (matchAt(i)) {
                        return true;
                    }
                    while (!search.isEnd(i) && !isNewline(i)) {
                        i++;
                    }
                }
                i++;
            }
            return false;
        } else if (this.program.prefix == null) {
            while (!search.isEnd(i - 1)) {
                if (matchAt(i)) {
                    return true;
                }
                i++;
            }
            return false;
        } else {
            boolean caseIndependent = (this.matchFlags & 1) != 0;
            char[] prefix = this.program.prefix;
            while (!search.isEnd((prefix.length + i) - 1)) {
                int j = i;
                int k2 = 0;
                while (true) {
                    int j2 = j + 1;
                    k = k2 + 1;
                    boolean match = compareChars(search.charAt(j), prefix[k2], caseIndependent) == 0;
                    if (!match || k >= prefix.length) {
                        break;
                    }
                    k2 = k;
                    j = j2;
                }
                if (k == prefix.length && matchAt(i)) {
                    return true;
                }
                i++;
            }
            return false;
        }
    }

    public boolean match(String search) {
        return match(search, 0);
    }

    public String[] split(String s) {
        Vector v = new Vector();
        int pos = 0;
        int len = s.length();
        while (pos < len && match(s, pos)) {
            int start = getParenStart(0);
            int newpos = getParenEnd(0);
            if (newpos == pos) {
                v.addElement(s.substring(pos, start + 1));
                newpos++;
            } else {
                v.addElement(s.substring(pos, start));
            }
            pos = newpos;
        }
        String remainder = s.substring(pos);
        if (remainder.length() != 0) {
            v.addElement(remainder);
        }
        String[] ret = new String[v.size()];
        v.copyInto(ret);
        return ret;
    }

    public String subst(String substituteIn, String substitution) {
        return subst(substituteIn, substitution, 0);
    }

    public String subst(String substituteIn, String substitution, int flags) {
        char c;
        StringBuffer ret = new StringBuffer();
        int pos = 0;
        int len = substituteIn.length();
        while (pos < len && match(substituteIn, pos)) {
            ret.append(substituteIn.substring(pos, getParenStart(0)));
            if ((flags & 2) != 0) {
                int lCurrentPosition = 0;
                int lLastPosition = -2;
                int lLength = substitution.length();
                while (true) {
                    int lCurrentPosition2 = substitution.indexOf("$", lCurrentPosition);
                    if (lCurrentPosition2 < 0) {
                        break;
                    }
                    if ((lCurrentPosition2 == 0 || substitution.charAt(lCurrentPosition2 - 1) != '\\') && lCurrentPosition2 + 1 < lLength && (c = substitution.charAt(lCurrentPosition2 + 1)) >= '0' && c <= '9') {
                        ret.append(substitution.substring(lLastPosition + 2, lCurrentPosition2));
                        String val = getParen(c - '0');
                        if (val != null) {
                            ret.append(val);
                        }
                        lLastPosition = lCurrentPosition2;
                    }
                    lCurrentPosition = lCurrentPosition2 + 1;
                }
                ret.append(substitution.substring(lLastPosition + 2, lLength));
            } else {
                ret.append(substitution);
            }
            int newpos = getParenEnd(0);
            if (newpos == pos) {
                newpos++;
            }
            pos = newpos;
            if ((flags & 1) != 0) {
                break;
            }
        }
        if (pos < len) {
            ret.append(substituteIn.substring(pos));
        }
        return ret.toString();
    }

    public String[] grep(Object[] search) {
        Vector v = new Vector();
        for (Object obj : search) {
            String s = obj.toString();
            if (match(s)) {
                v.addElement(s);
            }
        }
        String[] ret = new String[v.size()];
        v.copyInto(ret);
        return ret;
    }

    private boolean isNewline(int i) {
        char nextChar = this.search.charAt(i);
        return nextChar == '\n' || nextChar == '\r' || nextChar == 133 || nextChar == 8232 || nextChar == 8233;
    }

    private int compareChars(char c1, char c2, boolean caseIndependent) {
        if (caseIndependent) {
            c1 = RECharacter.toLowerCase(c1);
            c2 = RECharacter.toLowerCase(c2);
        }
        return c1 - c2;
    }
}
