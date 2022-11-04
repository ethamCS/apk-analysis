package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.conscrypt.BuildConfig;
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface JacksonInject {

    /* loaded from: classes.dex */
    public static class Value implements Serializable {
        protected static final Value EMPTY = new Value(null, null);
        protected final Object _id;
        protected final Boolean _useInput;

        protected Value(Object obj, Boolean bool) {
            this._id = obj;
            this._useInput = bool;
        }

        private static boolean _empty(Object obj, Boolean bool) {
            return obj == null && bool == null;
        }

        public static Value construct(Object obj, Boolean bool) {
            if (BuildConfig.FLAVOR.equals(obj)) {
                obj = null;
            }
            return _empty(obj, bool) ? EMPTY : new Value(obj, bool);
        }

        public static Value forId(Object obj) {
            return construct(obj, null);
        }

        public static Value from(JacksonInject jacksonInject) {
            return jacksonInject == null ? EMPTY : construct(jacksonInject.value(), jacksonInject.useInput().asBoolean());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                Value value = (Value) obj;
                if (OptBoolean.equals(this._useInput, value._useInput)) {
                    Object obj2 = this._id;
                    Object obj3 = value._id;
                    return obj2 == null ? obj3 == null : obj2.equals(obj3);
                }
            }
            return false;
        }

        public Object getId() {
            return this._id;
        }

        public Boolean getUseInput() {
            return this._useInput;
        }

        public boolean hasId() {
            return this._id != null;
        }

        public int hashCode() {
            Object obj = this._id;
            int i10 = 1;
            if (obj != null) {
                i10 = 1 + obj.hashCode();
            }
            Boolean bool = this._useInput;
            return bool != null ? i10 + bool.hashCode() : i10;
        }

        public String toString() {
            return String.format("JacksonInject.Value(id=%s,useInput=%s)", this._id, this._useInput);
        }

        public boolean willUseInput(boolean z10) {
            Boolean bool = this._useInput;
            return bool == null ? z10 : bool.booleanValue();
        }

        public Value withId(Object obj) {
            Object obj2 = this._id;
            if (obj == null) {
                if (obj2 == null) {
                    return this;
                }
            } else if (obj.equals(obj2)) {
                return this;
            }
            return new Value(obj, this._useInput);
        }

        public Value withUseInput(Boolean bool) {
            Boolean bool2 = this._useInput;
            if (bool == null) {
                if (bool2 == null) {
                    return this;
                }
            } else if (bool.equals(bool2)) {
                return this;
            }
            return new Value(this._id, bool);
        }
    }

    OptBoolean useInput() default OptBoolean.DEFAULT;

    String value() default "";
}
