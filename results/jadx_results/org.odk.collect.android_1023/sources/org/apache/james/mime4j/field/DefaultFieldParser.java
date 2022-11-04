package org.apache.james.mime4j.field;
/* loaded from: classes.dex */
public class DefaultFieldParser extends DelegatingFieldParser {
    public DefaultFieldParser() {
        setFieldParser("Content-Transfer-Encoding", ContentTransferEncodingField.PARSER);
        setFieldParser("Content-Type", ContentTypeField.PARSER);
        setFieldParser("Content-Disposition", ContentDispositionField.PARSER);
        FieldParser dateTimeParser = DateTimeField.PARSER;
        setFieldParser("Date", dateTimeParser);
        setFieldParser(FieldName.RESENT_DATE, dateTimeParser);
        FieldParser mailboxListParser = MailboxListField.PARSER;
        setFieldParser("From", mailboxListParser);
        setFieldParser(FieldName.RESENT_FROM, mailboxListParser);
        FieldParser mailboxParser = MailboxField.PARSER;
        setFieldParser(FieldName.SENDER, mailboxParser);
        setFieldParser(FieldName.RESENT_SENDER, mailboxParser);
        FieldParser addressListParser = AddressListField.PARSER;
        setFieldParser(FieldName.TO, addressListParser);
        setFieldParser(FieldName.RESENT_TO, addressListParser);
        setFieldParser(FieldName.CC, addressListParser);
        setFieldParser(FieldName.RESENT_CC, addressListParser);
        setFieldParser(FieldName.BCC, addressListParser);
        setFieldParser(FieldName.RESENT_BCC, addressListParser);
        setFieldParser(FieldName.REPLY_TO, addressListParser);
    }
}
