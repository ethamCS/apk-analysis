package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
/* loaded from: classes.dex */
public class JsonMappingException extends DatabindException {
    protected LinkedList<Reference> _path;
    protected transient Closeable _processor;

    /* loaded from: classes.dex */
    public static class Reference implements Serializable {
        protected String _desc;
        protected String _fieldName;
        protected transient Object _from;
        protected int _index;

        protected Reference() {
            this._index = -1;
        }

        public Reference(Object obj, int i10) {
            this._from = obj;
            this._index = i10;
        }

        public Reference(Object obj, String str) {
            this._index = -1;
            this._from = obj;
            Objects.requireNonNull(str, "Cannot pass null fieldName");
            this._fieldName = str;
        }

        public String getDescription() {
            char c10;
            if (this._desc == null) {
                StringBuilder sb2 = new StringBuilder();
                Object obj = this._from;
                if (obj != null) {
                    Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
                    int i10 = 0;
                    while (cls.isArray()) {
                        cls = cls.getComponentType();
                        i10++;
                    }
                    String name = cls.getName();
                    while (true) {
                        sb2.append(name);
                        i10--;
                        if (i10 < 0) {
                            break;
                        }
                        name = "[]";
                    }
                } else {
                    sb2.append("UNKNOWN");
                }
                sb2.append('[');
                if (this._fieldName != null) {
                    c10 = '\"';
                    sb2.append('\"');
                    sb2.append(this._fieldName);
                } else {
                    int i11 = this._index;
                    if (i11 >= 0) {
                        sb2.append(i11);
                        sb2.append(']');
                        this._desc = sb2.toString();
                    } else {
                        c10 = '?';
                    }
                }
                sb2.append(c10);
                sb2.append(']');
                this._desc = sb2.toString();
            }
            return this._desc;
        }

        public String toString() {
            return getDescription();
        }
    }

    public JsonMappingException(Closeable closeable, String str) {
        super(str);
        this._processor = closeable;
        if (closeable instanceof JsonParser) {
            this._location = ((JsonParser) closeable).getTokenLocation();
        }
    }

    public JsonMappingException(Closeable closeable, String str, JsonLocation jsonLocation) {
        super(str, jsonLocation);
        this._processor = closeable;
    }

    public JsonMappingException(Closeable closeable, String str, Throwable th2) {
        super(str, th2);
        JsonLocation tokenLocation;
        this._processor = closeable;
        if (th2 instanceof JacksonException) {
            tokenLocation = ((JacksonException) th2).getLocation();
        } else if (!(closeable instanceof JsonParser)) {
            return;
        } else {
            tokenLocation = ((JsonParser) closeable).getTokenLocation();
        }
        this._location = tokenLocation;
    }

    public static JsonMappingException from(JsonGenerator jsonGenerator, String str) {
        return new JsonMappingException(jsonGenerator, str, (Throwable) null);
    }

    public static JsonMappingException from(JsonGenerator jsonGenerator, String str, Throwable th2) {
        return new JsonMappingException(jsonGenerator, str, th2);
    }

    public static JsonMappingException from(JsonParser jsonParser, String str) {
        return new JsonMappingException(jsonParser, str);
    }

    public static JsonMappingException from(JsonParser jsonParser, String str, Throwable th2) {
        return new JsonMappingException(jsonParser, str, th2);
    }

    public static JsonMappingException from(DeserializationContext deserializationContext, String str) {
        return new JsonMappingException(deserializationContext.getParser(), str);
    }

    public static JsonMappingException fromUnexpectedIOE(IOException iOException) {
        return new JsonMappingException(null, String.format("Unexpected IOException (of type %s): %s", iOException.getClass().getName(), ClassUtil.exceptionMessage(iOException)));
    }

    public static JsonMappingException wrapWithPath(Throwable th2, Reference reference) {
        JsonMappingException jsonMappingException;
        if (th2 instanceof JsonMappingException) {
            jsonMappingException = (JsonMappingException) th2;
        } else {
            String exceptionMessage = ClassUtil.exceptionMessage(th2);
            if (exceptionMessage == null || exceptionMessage.isEmpty()) {
                exceptionMessage = "(was " + th2.getClass().getName() + ")";
            }
            Closeable closeable = null;
            if (th2 instanceof JacksonException) {
                Object processor = ((JacksonException) th2).getProcessor();
                if (processor instanceof Closeable) {
                    closeable = (Closeable) processor;
                }
            }
            jsonMappingException = new JsonMappingException(closeable, exceptionMessage, th2);
        }
        jsonMappingException.prependPath(reference);
        return jsonMappingException;
    }

    public static JsonMappingException wrapWithPath(Throwable th2, Object obj, int i10) {
        return wrapWithPath(th2, new Reference(obj, i10));
    }

    public static JsonMappingException wrapWithPath(Throwable th2, Object obj, String str) {
        return wrapWithPath(th2, new Reference(obj, str));
    }

    protected void _appendPathDesc(StringBuilder sb2) {
        LinkedList<Reference> linkedList = this._path;
        if (linkedList == null) {
            return;
        }
        Iterator<Reference> it = linkedList.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append("->");
            }
        }
    }

    protected String _buildMessage() {
        String message = super.getMessage();
        if (this._path == null) {
            return message;
        }
        StringBuilder sb2 = message == null ? new StringBuilder() : new StringBuilder(message);
        sb2.append(" (through reference chain: ");
        StringBuilder pathReference = getPathReference(sb2);
        pathReference.append(')');
        return pathReference.toString();
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return _buildMessage();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        return _buildMessage();
    }

    public StringBuilder getPathReference(StringBuilder sb2) {
        _appendPathDesc(sb2);
        return sb2;
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    @JsonIgnore
    public Object getProcessor() {
        return this._processor;
    }

    public void prependPath(Reference reference) {
        if (this._path == null) {
            this._path = new LinkedList<>();
        }
        if (this._path.size() < 1000) {
            this._path.addFirst(reference);
        }
    }

    @Override // com.fasterxml.jackson.databind.DatabindException
    public void prependPath(Object obj, String str) {
        prependPath(new Reference(obj, str));
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public JsonMappingException withCause(Throwable th2) {
        initCause(th2);
        return this;
    }
}
