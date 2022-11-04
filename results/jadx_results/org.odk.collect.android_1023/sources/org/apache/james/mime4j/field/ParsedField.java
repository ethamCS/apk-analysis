package org.apache.james.mime4j.field;

import org.apache.james.mime4j.parser.Field;
/* loaded from: classes.dex */
public interface ParsedField extends Field {
    ParseException getParseException();

    boolean isValidField();
}
