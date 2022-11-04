package org.commonmark.internal;

import java.util.ArrayList;
import java.util.List;
import org.commonmark.internal.util.Escaping;
import org.commonmark.internal.util.LinkScanner;
import org.commonmark.internal.util.Parsing;
import org.commonmark.node.LinkReferenceDefinition;
/* loaded from: classes2.dex */
public class LinkReferenceDefinitionParser {
    private String destination;
    private StringBuilder label;
    private String normalizedLabel;
    private StringBuilder title;
    private char titleDelimiter;
    private State state = State.START_DEFINITION;
    private final StringBuilder paragraph = new StringBuilder();
    private final List<LinkReferenceDefinition> definitions = new ArrayList();
    private boolean referenceValid = false;

    /* loaded from: classes2.dex */
    public enum State {
        START_DEFINITION,
        LABEL,
        DESTINATION,
        START_TITLE,
        TITLE,
        PARAGRAPH
    }

    public void parse(CharSequence charSequence) {
        if (this.paragraph.length() != 0) {
            this.paragraph.append('\n');
        }
        this.paragraph.append(charSequence);
        int i = 0;
        while (i < charSequence.length()) {
            switch (AnonymousClass1.$SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State[this.state.ordinal()]) {
                case 1:
                    return;
                case 2:
                    i = startDefinition(charSequence, i);
                    break;
                case 3:
                    i = label(charSequence, i);
                    break;
                case 4:
                    i = destination(charSequence, i);
                    break;
                case 5:
                    i = startTitle(charSequence, i);
                    break;
                case 6:
                    i = title(charSequence, i);
                    break;
            }
            if (i == -1) {
                this.state = State.PARAGRAPH;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.commonmark.internal.LinkReferenceDefinitionParser$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State = iArr;
            try {
                iArr[State.PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State[State.START_DEFINITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State[State.LABEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State[State.DESTINATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State[State.START_TITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State[State.TITLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public CharSequence getParagraphContent() {
        return this.paragraph;
    }

    public List<LinkReferenceDefinition> getDefinitions() {
        finishReference();
        return this.definitions;
    }

    State getState() {
        return this.state;
    }

    private int startDefinition(CharSequence charSequence, int i) {
        int skipSpaceTab = Parsing.skipSpaceTab(charSequence, i, charSequence.length());
        if (skipSpaceTab >= charSequence.length() || charSequence.charAt(skipSpaceTab) != '[') {
            return -1;
        }
        this.state = State.LABEL;
        this.label = new StringBuilder();
        int i2 = skipSpaceTab + 1;
        if (i2 >= charSequence.length()) {
            this.label.append('\n');
        }
        return i2;
    }

    private int label(CharSequence charSequence, int i) {
        int i2;
        int scanLinkLabelContent = LinkScanner.scanLinkLabelContent(charSequence, i);
        if (scanLinkLabelContent == -1) {
            return -1;
        }
        this.label.append(charSequence, i, scanLinkLabelContent);
        if (scanLinkLabelContent >= charSequence.length()) {
            this.label.append('\n');
            return scanLinkLabelContent;
        } else if (charSequence.charAt(scanLinkLabelContent) != ']' || (i2 = scanLinkLabelContent + 1) >= charSequence.length() || charSequence.charAt(i2) != ':' || this.label.length() > 999) {
            return -1;
        } else {
            String normalizeLabelContent = Escaping.normalizeLabelContent(this.label.toString());
            if (normalizeLabelContent.isEmpty()) {
                return -1;
            }
            this.normalizedLabel = normalizeLabelContent;
            this.state = State.DESTINATION;
            return Parsing.skipSpaceTab(charSequence, i2 + 1, charSequence.length());
        }
    }

    private int destination(CharSequence charSequence, int i) {
        String str;
        int skipSpaceTab = Parsing.skipSpaceTab(charSequence, i, charSequence.length());
        int scanLinkDestination = LinkScanner.scanLinkDestination(charSequence, skipSpaceTab);
        if (scanLinkDestination == -1) {
            return -1;
        }
        if (charSequence.charAt(skipSpaceTab) == '<') {
            str = charSequence.subSequence(skipSpaceTab + 1, scanLinkDestination - 1).toString();
        } else {
            str = charSequence.subSequence(skipSpaceTab, scanLinkDestination).toString();
        }
        this.destination = str;
        int skipSpaceTab2 = Parsing.skipSpaceTab(charSequence, scanLinkDestination, charSequence.length());
        if (skipSpaceTab2 >= charSequence.length()) {
            this.referenceValid = true;
            this.paragraph.setLength(0);
        } else if (skipSpaceTab2 == scanLinkDestination) {
            return -1;
        }
        this.state = State.START_TITLE;
        return skipSpaceTab2;
    }

    private int startTitle(CharSequence charSequence, int i) {
        int skipSpaceTab = Parsing.skipSpaceTab(charSequence, i, charSequence.length());
        if (skipSpaceTab >= charSequence.length()) {
            this.state = State.START_DEFINITION;
            return skipSpaceTab;
        }
        this.titleDelimiter = (char) 0;
        char charAt = charSequence.charAt(skipSpaceTab);
        if (charAt == '\"' || charAt == '\'') {
            this.titleDelimiter = charAt;
        } else if (charAt == '(') {
            this.titleDelimiter = ')';
        }
        if (this.titleDelimiter != 0) {
            this.state = State.TITLE;
            this.title = new StringBuilder();
            skipSpaceTab++;
            if (skipSpaceTab == charSequence.length()) {
                this.title.append('\n');
            }
        } else {
            finishReference();
            this.state = State.START_DEFINITION;
        }
        return skipSpaceTab;
    }

    private int title(CharSequence charSequence, int i) {
        int scanLinkTitleContent = LinkScanner.scanLinkTitleContent(charSequence, i, this.titleDelimiter);
        if (scanLinkTitleContent == -1) {
            return -1;
        }
        this.title.append(charSequence.subSequence(i, scanLinkTitleContent));
        if (scanLinkTitleContent >= charSequence.length()) {
            this.title.append('\n');
            return scanLinkTitleContent;
        }
        int skipSpaceTab = Parsing.skipSpaceTab(charSequence, scanLinkTitleContent + 1, charSequence.length());
        if (skipSpaceTab != charSequence.length()) {
            return -1;
        }
        this.referenceValid = true;
        finishReference();
        this.paragraph.setLength(0);
        this.state = State.START_DEFINITION;
        return skipSpaceTab;
    }

    private void finishReference() {
        if (!this.referenceValid) {
            return;
        }
        String unescapeString = Escaping.unescapeString(this.destination);
        StringBuilder sb = this.title;
        this.definitions.add(new LinkReferenceDefinition(this.normalizedLabel, unescapeString, sb != null ? Escaping.unescapeString(sb.toString()) : null));
        this.label = null;
        this.referenceValid = false;
        this.normalizedLabel = null;
        this.destination = null;
        this.title = null;
    }
}
