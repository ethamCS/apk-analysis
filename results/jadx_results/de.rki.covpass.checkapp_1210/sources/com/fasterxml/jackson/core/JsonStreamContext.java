package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharTypes;
/* loaded from: classes.dex */
public abstract class JsonStreamContext {
    protected int _index;
    protected int _type;

    public JsonStreamContext() {
    }

    public JsonStreamContext(int i10, int i11) {
        this._type = i10;
        this._index = i11;
    }

    public JsonStreamContext(JsonStreamContext jsonStreamContext) {
        this._type = jsonStreamContext._type;
        this._index = jsonStreamContext._index;
    }

    public final int getCurrentIndex() {
        int i10 = this._index;
        if (i10 < 0) {
            return 0;
        }
        return i10;
    }

    public abstract String getCurrentName();

    public abstract Object getCurrentValue();

    public final int getEntryCount() {
        return this._index + 1;
    }

    public abstract JsonStreamContext getParent();

    public final boolean inArray() {
        return this._type == 1;
    }

    public final boolean inObject() {
        return this._type == 2;
    }

    public final boolean inRoot() {
        return this._type == 0;
    }

    public abstract void setCurrentValue(Object obj);

    public String toString() {
        char c10;
        StringBuilder sb2 = new StringBuilder(64);
        int i10 = this._type;
        if (i10 != 0) {
            if (i10 != 1) {
                sb2.append('{');
                String currentName = getCurrentName();
                if (currentName != null) {
                    sb2.append('\"');
                    CharTypes.appendQuoted(sb2, currentName);
                    sb2.append('\"');
                } else {
                    sb2.append('?');
                }
                c10 = '}';
            } else {
                sb2.append('[');
                sb2.append(getCurrentIndex());
                c10 = ']';
            }
            sb2.append(c10);
        } else {
            sb2.append("/");
        }
        return sb2.toString();
    }

    public String typeDesc() {
        int i10 = this._type;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "Object" : "Array" : "root";
    }
}
