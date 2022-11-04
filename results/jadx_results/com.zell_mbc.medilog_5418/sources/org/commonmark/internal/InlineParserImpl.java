package org.commonmark.internal;

import androidx.core.net.MailTo;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.commonmark.internal.inline.AsteriskDelimiterProcessor;
import org.commonmark.internal.inline.UnderscoreDelimiterProcessor;
import org.commonmark.internal.util.Escaping;
import org.commonmark.internal.util.Html5Entities;
import org.commonmark.internal.util.LinkScanner;
import org.commonmark.internal.util.Parsing;
import org.commonmark.node.Code;
import org.commonmark.node.HardLineBreak;
import org.commonmark.node.HtmlInline;
import org.commonmark.node.Link;
import org.commonmark.node.Node;
import org.commonmark.node.SoftLineBreak;
import org.commonmark.node.Text;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.InlineParserContext;
import org.commonmark.parser.delimiter.DelimiterProcessor;
/* loaded from: classes2.dex */
public class InlineParserImpl implements InlineParser {
    private static final String ASCII_PUNCTUATION = "!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~";
    private static final String CDATA = "<!\\[CDATA\\[[\\s\\S]*?\\]\\]>";
    private static final String DECLARATION = "<![A-Z]+\\s+[^>]*>";
    private static final String HTMLCOMMENT = "<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->";
    private static final String HTMLTAG = "(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)";
    private static final String PROCESSINGINSTRUCTION = "[<][?].*?[?][>]";
    private final InlineParserContext context;
    private final BitSet delimiterCharacters;
    private final Map<Character, DelimiterProcessor> delimiterProcessors;
    private int index;
    private String input;
    private Bracket lastBracket;
    private Delimiter lastDelimiter;
    private final BitSet specialCharacters;
    private static final Pattern PUNCTUATION = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    private static final Pattern HTML_TAG = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    private static final Pattern ESCAPABLE = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    private static final Pattern ENTITY_HERE = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    private static final Pattern TICKS = Pattern.compile("`+");
    private static final Pattern TICKS_HERE = Pattern.compile("^`+");
    private static final Pattern EMAIL_AUTOLINK = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    private static final Pattern AUTOLINK = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    private static final Pattern SPNL = Pattern.compile("^ *(?:\n *)?");
    private static final Pattern UNICODE_WHITESPACE_CHAR = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    private static final Pattern WHITESPACE = Pattern.compile("\\s+");
    private static final Pattern FINAL_SPACE = Pattern.compile(" *$");

    public InlineParserImpl(InlineParserContext inlineParserContext) {
        Map<Character, DelimiterProcessor> calculateDelimiterProcessors = calculateDelimiterProcessors(inlineParserContext.getCustomDelimiterProcessors());
        this.delimiterProcessors = calculateDelimiterProcessors;
        BitSet calculateDelimiterCharacters = calculateDelimiterCharacters(calculateDelimiterProcessors.keySet());
        this.delimiterCharacters = calculateDelimiterCharacters;
        this.specialCharacters = calculateSpecialCharacters(calculateDelimiterCharacters);
        this.context = inlineParserContext;
    }

    public static BitSet calculateDelimiterCharacters(Set<Character> set) {
        BitSet bitSet = new BitSet();
        for (Character ch : set) {
            bitSet.set(ch.charValue());
        }
        return bitSet;
    }

    public static BitSet calculateSpecialCharacters(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        return bitSet2;
    }

    public static Map<Character, DelimiterProcessor> calculateDelimiterProcessors(List<DelimiterProcessor> list) {
        HashMap hashMap = new HashMap();
        addDelimiterProcessors(Arrays.asList(new AsteriskDelimiterProcessor(), new UnderscoreDelimiterProcessor()), hashMap);
        addDelimiterProcessors(list, hashMap);
        return hashMap;
    }

    private static void addDelimiterProcessors(Iterable<DelimiterProcessor> iterable, Map<Character, DelimiterProcessor> map) {
        StaggeredDelimiterProcessor staggeredDelimiterProcessor;
        for (DelimiterProcessor delimiterProcessor : iterable) {
            char openingCharacter = delimiterProcessor.getOpeningCharacter();
            char closingCharacter = delimiterProcessor.getClosingCharacter();
            if (openingCharacter == closingCharacter) {
                DelimiterProcessor delimiterProcessor2 = map.get(Character.valueOf(openingCharacter));
                if (delimiterProcessor2 != null && delimiterProcessor2.getOpeningCharacter() == delimiterProcessor2.getClosingCharacter()) {
                    if (delimiterProcessor2 instanceof StaggeredDelimiterProcessor) {
                        staggeredDelimiterProcessor = (StaggeredDelimiterProcessor) delimiterProcessor2;
                    } else {
                        StaggeredDelimiterProcessor staggeredDelimiterProcessor2 = new StaggeredDelimiterProcessor(openingCharacter);
                        staggeredDelimiterProcessor2.add(delimiterProcessor2);
                        staggeredDelimiterProcessor = staggeredDelimiterProcessor2;
                    }
                    staggeredDelimiterProcessor.add(delimiterProcessor);
                    map.put(Character.valueOf(openingCharacter), staggeredDelimiterProcessor);
                } else {
                    addDelimiterProcessorForChar(openingCharacter, delimiterProcessor, map);
                }
            } else {
                addDelimiterProcessorForChar(openingCharacter, delimiterProcessor, map);
                addDelimiterProcessorForChar(closingCharacter, delimiterProcessor, map);
            }
        }
    }

    private static void addDelimiterProcessorForChar(char c, DelimiterProcessor delimiterProcessor, Map<Character, DelimiterProcessor> map) {
        if (map.put(Character.valueOf(c), delimiterProcessor) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    @Override // org.commonmark.parser.InlineParser
    public void parse(String str, Node node) {
        reset(str.trim());
        Node node2 = null;
        while (true) {
            node2 = parseInline(node2);
            if (node2 != null) {
                node.appendChild(node2);
            } else {
                processDelimiters(null);
                mergeChildTextNodes(node);
                return;
            }
        }
    }

    void reset(String str) {
        this.input = str;
        this.index = 0;
        this.lastDelimiter = null;
        this.lastBracket = null;
    }

    private Text text(String str, int i, int i2) {
        return new Text(str.substring(i, i2));
    }

    private Text text(String str) {
        return new Text(str);
    }

    private Node parseInline(Node node) {
        Node node2;
        char peek = peek();
        if (peek == 0) {
            return null;
        }
        if (peek == '\n') {
            node2 = parseNewline(node);
        } else if (peek == '!') {
            node2 = parseBang();
        } else if (peek == '&') {
            node2 = parseEntity();
        } else if (peek == '<') {
            node2 = parseAutolink();
            if (node2 == null) {
                node2 = parseHtmlInline();
            }
        } else if (peek == '`') {
            node2 = parseBackticks();
        } else {
            switch (peek) {
                case '[':
                    node2 = parseOpenBracket();
                    break;
                case '\\':
                    node2 = parseBackslash();
                    break;
                case ']':
                    node2 = parseCloseBracket();
                    break;
                default:
                    if (this.delimiterCharacters.get(peek)) {
                        node2 = parseDelimiters(this.delimiterProcessors.get(Character.valueOf(peek)), peek);
                        break;
                    } else {
                        node2 = parseString();
                        break;
                    }
            }
        }
        if (node2 != null) {
            return node2;
        }
        this.index++;
        return text(String.valueOf(peek));
    }

    private String match(Pattern pattern) {
        if (this.index >= this.input.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.input);
        matcher.region(this.index, this.input.length());
        if (!matcher.find()) {
            return null;
        }
        this.index = matcher.end();
        return matcher.group();
    }

    private char peek() {
        if (this.index < this.input.length()) {
            return this.input.charAt(this.index);
        }
        return (char) 0;
    }

    private void spnl() {
        match(SPNL);
    }

    private Node parseNewline(Node node) {
        this.index++;
        if (node instanceof Text) {
            Text text = (Text) node;
            if (text.getLiteral().endsWith(" ")) {
                String literal = text.getLiteral();
                Matcher matcher = FINAL_SPACE.matcher(literal);
                int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                if (end > 0) {
                    text.setLiteral(literal.substring(0, literal.length() - end));
                }
                if (end >= 2) {
                    return new HardLineBreak();
                }
                return new SoftLineBreak();
            }
        }
        return new SoftLineBreak();
    }

    private Node parseBackslash() {
        this.index++;
        if (peek() == '\n') {
            HardLineBreak hardLineBreak = new HardLineBreak();
            this.index++;
            return hardLineBreak;
        }
        if (this.index < this.input.length()) {
            Pattern pattern = ESCAPABLE;
            String str = this.input;
            int i = this.index;
            if (pattern.matcher(str.substring(i, i + 1)).matches()) {
                String str2 = this.input;
                int i2 = this.index;
                Text text = text(str2, i2, i2 + 1);
                this.index++;
                return text;
            }
        }
        return text("\\");
    }

    private Node parseBackticks() {
        String match;
        String match2 = match(TICKS_HERE);
        if (match2 == null) {
            return null;
        }
        int i = this.index;
        do {
            match = match(TICKS);
            if (match == null) {
                this.index = i;
                return text(match2);
            }
        } while (!match.equals(match2));
        Code code = new Code();
        String replace = this.input.substring(i, this.index - match2.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ' && Parsing.hasNonSpace(replace)) {
            replace = replace.substring(1, replace.length() - 1);
        }
        code.setLiteral(replace);
        return code;
    }

    private Node parseDelimiters(DelimiterProcessor delimiterProcessor, char c) {
        DelimiterData scanDelimiters = scanDelimiters(delimiterProcessor, c);
        if (scanDelimiters == null) {
            return null;
        }
        int i = scanDelimiters.count;
        int i2 = this.index;
        int i3 = i2 + i;
        this.index = i3;
        Text text = text(this.input, i2, i3);
        Delimiter delimiter = new Delimiter(text, c, scanDelimiters.canOpen, scanDelimiters.canClose, this.lastDelimiter);
        this.lastDelimiter = delimiter;
        delimiter.length = i;
        this.lastDelimiter.originalLength = i;
        if (this.lastDelimiter.previous != null) {
            this.lastDelimiter.previous.next = this.lastDelimiter;
        }
        return text;
    }

    private Node parseOpenBracket() {
        int i = this.index;
        this.index = i + 1;
        Text text = text("[");
        addBracket(Bracket.link(text, i, this.lastBracket, this.lastDelimiter));
        return text;
    }

    private Node parseBang() {
        int i = this.index;
        this.index = i + 1;
        if (peek() == '[') {
            this.index++;
            Text text = text("![");
            addBracket(Bracket.image(text, i + 1, this.lastBracket, this.lastDelimiter));
            return text;
        }
        return text("!");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.commonmark.node.Node parseCloseBracket() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.InlineParserImpl.parseCloseBracket():org.commonmark.node.Node");
    }

    private void addBracket(Bracket bracket) {
        Bracket bracket2 = this.lastBracket;
        if (bracket2 != null) {
            bracket2.bracketAfter = true;
        }
        this.lastBracket = bracket;
    }

    private void removeLastBracket() {
        this.lastBracket = this.lastBracket.previous;
    }

    private String parseLinkDestination() {
        String str;
        int scanLinkDestination = LinkScanner.scanLinkDestination(this.input, this.index);
        if (scanLinkDestination == -1) {
            return null;
        }
        if (peek() == '<') {
            str = this.input.substring(this.index + 1, scanLinkDestination - 1);
        } else {
            str = this.input.substring(this.index, scanLinkDestination);
        }
        this.index = scanLinkDestination;
        return Escaping.unescapeString(str);
    }

    private String parseLinkTitle() {
        int scanLinkTitle = LinkScanner.scanLinkTitle(this.input, this.index);
        if (scanLinkTitle == -1) {
            return null;
        }
        String substring = this.input.substring(this.index + 1, scanLinkTitle - 1);
        this.index = scanLinkTitle;
        return Escaping.unescapeString(substring);
    }

    int parseLinkLabel() {
        if (this.index < this.input.length() && this.input.charAt(this.index) == '[') {
            int i = this.index + 1;
            int scanLinkLabelContent = LinkScanner.scanLinkLabelContent(this.input, i);
            int i2 = scanLinkLabelContent - i;
            if (scanLinkLabelContent != -1 && i2 <= 999 && scanLinkLabelContent < this.input.length() && this.input.charAt(scanLinkLabelContent) == ']') {
                this.index = scanLinkLabelContent + 1;
                return i2 + 2;
            }
        }
        return 0;
    }

    private Node parseAutolink() {
        String match = match(EMAIL_AUTOLINK);
        if (match != null) {
            String substring = match.substring(1, match.length() - 1);
            Link link = new Link(MailTo.MAILTO_SCHEME + substring, null);
            link.appendChild(new Text(substring));
            return link;
        }
        String match2 = match(AUTOLINK);
        if (match2 == null) {
            return null;
        }
        String substring2 = match2.substring(1, match2.length() - 1);
        Link link2 = new Link(substring2, null);
        link2.appendChild(new Text(substring2));
        return link2;
    }

    private Node parseHtmlInline() {
        String match = match(HTML_TAG);
        if (match != null) {
            HtmlInline htmlInline = new HtmlInline();
            htmlInline.setLiteral(match);
            return htmlInline;
        }
        return null;
    }

    private Node parseEntity() {
        String match = match(ENTITY_HERE);
        if (match != null) {
            return text(Html5Entities.entityToString(match));
        }
        return null;
    }

    private Node parseString() {
        int i = this.index;
        int length = this.input.length();
        while (true) {
            int i2 = this.index;
            if (i2 == length || this.specialCharacters.get(this.input.charAt(i2))) {
                break;
            }
            this.index++;
        }
        int i3 = this.index;
        if (i != i3) {
            return text(this.input, i, i3);
        }
        return null;
    }

    private DelimiterData scanDelimiters(DelimiterProcessor delimiterProcessor, char c) {
        boolean z;
        int i = this.index;
        boolean z2 = false;
        int i2 = 0;
        while (peek() == c) {
            i2++;
            this.index++;
        }
        if (i2 < delimiterProcessor.getMinLength()) {
            this.index = i;
            return null;
        }
        String str = "\n";
        String substring = i == 0 ? str : this.input.substring(i - 1, i);
        char peek = peek();
        if (peek != 0) {
            str = String.valueOf(peek);
        }
        Pattern pattern = PUNCTUATION;
        boolean matches = pattern.matcher(substring).matches();
        Pattern pattern2 = UNICODE_WHITESPACE_CHAR;
        boolean matches2 = pattern2.matcher(substring).matches();
        boolean matches3 = pattern.matcher(str).matches();
        boolean matches4 = pattern2.matcher(str).matches();
        boolean z3 = !matches4 && (!matches3 || matches2 || matches);
        boolean z4 = !matches2 && (!matches || matches4 || matches3);
        if (c == '_') {
            z = z3 && (!z4 || matches);
            if (z4 && (!z3 || matches3)) {
                z2 = true;
            }
        } else {
            boolean z5 = z3 && c == delimiterProcessor.getOpeningCharacter();
            if (z4 && c == delimiterProcessor.getClosingCharacter()) {
                z2 = true;
            }
            z = z5;
        }
        this.index = i;
        return new DelimiterData(i2, z, z2);
    }

    private void processDelimiters(Delimiter delimiter) {
        boolean z;
        HashMap hashMap = new HashMap();
        Delimiter delimiter2 = this.lastDelimiter;
        while (delimiter2 != null && delimiter2.previous != delimiter) {
            delimiter2 = delimiter2.previous;
        }
        while (delimiter2 != null) {
            char c = delimiter2.delimiterChar;
            DelimiterProcessor delimiterProcessor = this.delimiterProcessors.get(Character.valueOf(c));
            if (!delimiter2.canClose || delimiterProcessor == null) {
                delimiter2 = delimiter2.next;
            } else {
                char openingCharacter = delimiterProcessor.getOpeningCharacter();
                Delimiter delimiter3 = delimiter2.previous;
                int i = 0;
                boolean z2 = false;
                while (true) {
                    z = true;
                    if (delimiter3 == null || delimiter3 == delimiter || delimiter3 == hashMap.get(Character.valueOf(c))) {
                        break;
                    }
                    if (delimiter3.canOpen && delimiter3.delimiterChar == openingCharacter) {
                        i = delimiterProcessor.getDelimiterUse(delimiter3, delimiter2);
                        z2 = true;
                        if (i > 0) {
                            break;
                        }
                    }
                    delimiter3 = delimiter3.previous;
                }
                z = false;
                if (!z) {
                    if (!z2) {
                        hashMap.put(Character.valueOf(c), delimiter2.previous);
                        if (!delimiter2.canOpen) {
                            removeDelimiterKeepNode(delimiter2);
                        }
                    }
                    delimiter2 = delimiter2.next;
                } else {
                    Text text = delimiter3.node;
                    Text text2 = delimiter2.node;
                    delimiter3.length -= i;
                    delimiter2.length -= i;
                    text.setLiteral(text.getLiteral().substring(0, text.getLiteral().length() - i));
                    text2.setLiteral(text2.getLiteral().substring(0, text2.getLiteral().length() - i));
                    removeDelimitersBetween(delimiter3, delimiter2);
                    mergeTextNodesBetweenExclusive(text, text2);
                    delimiterProcessor.process(text, text2, i);
                    if (delimiter3.length == 0) {
                        removeDelimiterAndNode(delimiter3);
                    }
                    if (delimiter2.length == 0) {
                        Delimiter delimiter4 = delimiter2.next;
                        removeDelimiterAndNode(delimiter2);
                        delimiter2 = delimiter4;
                    }
                }
            }
        }
        while (true) {
            Delimiter delimiter5 = this.lastDelimiter;
            if (delimiter5 == null || delimiter5 == delimiter) {
                return;
            }
            removeDelimiterKeepNode(delimiter5);
        }
    }

    private void removeDelimitersBetween(Delimiter delimiter, Delimiter delimiter2) {
        Delimiter delimiter3 = delimiter2.previous;
        while (delimiter3 != null && delimiter3 != delimiter) {
            Delimiter delimiter4 = delimiter3.previous;
            removeDelimiterKeepNode(delimiter3);
            delimiter3 = delimiter4;
        }
    }

    private void removeDelimiterAndNode(Delimiter delimiter) {
        delimiter.node.unlink();
        removeDelimiter(delimiter);
    }

    private void removeDelimiterKeepNode(Delimiter delimiter) {
        removeDelimiter(delimiter);
    }

    private void removeDelimiter(Delimiter delimiter) {
        if (delimiter.previous != null) {
            delimiter.previous.next = delimiter.next;
        }
        if (delimiter.next == null) {
            this.lastDelimiter = delimiter.previous;
            return;
        }
        delimiter.next.previous = delimiter.previous;
    }

    private void mergeTextNodesBetweenExclusive(Node node, Node node2) {
        if (node == node2 || node.getNext() == node2) {
            return;
        }
        mergeTextNodesInclusive(node.getNext(), node2.getPrevious());
    }

    private void mergeChildTextNodes(Node node) {
        if (node.getFirstChild() == node.getLastChild()) {
            return;
        }
        mergeTextNodesInclusive(node.getFirstChild(), node.getLastChild());
    }

    private void mergeTextNodesInclusive(Node node, Node node2) {
        Text text = null;
        Text text2 = null;
        int i = 0;
        while (node != null) {
            if (node instanceof Text) {
                text2 = (Text) node;
                if (text == null) {
                    text = text2;
                }
                i += text2.getLiteral().length();
            } else {
                mergeIfNeeded(text, text2, i);
                text = null;
                text2 = null;
                i = 0;
            }
            if (node == node2) {
                break;
            }
            node = node.getNext();
        }
        mergeIfNeeded(text, text2, i);
    }

    private void mergeIfNeeded(Text text, Text text2, int i) {
        if (text == null || text2 == null || text == text2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(text.getLiteral());
        Node next = text.getNext();
        Node next2 = text2.getNext();
        while (next != next2) {
            sb.append(((Text) next).getLiteral());
            Node next3 = next.getNext();
            next.unlink();
            next = next3;
        }
        text.setLiteral(sb.toString());
    }

    /* loaded from: classes2.dex */
    public static class DelimiterData {
        final boolean canClose;
        final boolean canOpen;
        final int count;

        DelimiterData(int i, boolean z, boolean z2) {
            this.count = i;
            this.canOpen = z;
            this.canClose = z2;
        }
    }
}
