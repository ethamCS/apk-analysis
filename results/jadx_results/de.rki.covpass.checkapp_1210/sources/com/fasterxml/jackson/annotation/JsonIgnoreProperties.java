package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface JsonIgnoreProperties {

    /* loaded from: classes.dex */
    public static class Value implements Serializable {
        protected static final Value EMPTY = new Value(Collections.emptySet(), false, false, false, true);
        protected final boolean _allowGetters;
        protected final boolean _allowSetters;
        protected final boolean _ignoreUnknown;
        protected final Set<String> _ignored;
        protected final boolean _merge;

        protected Value(Set<String> set, boolean z10, boolean z11, boolean z12, boolean z13) {
            this._ignored = set == null ? Collections.emptySet() : set;
            this._ignoreUnknown = z10;
            this._allowGetters = z11;
            this._allowSetters = z12;
            this._merge = z13;
        }

        private static Set<String> _asSet(String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                return Collections.emptySet();
            }
            HashSet hashSet = new HashSet(strArr.length);
            for (String str : strArr) {
                hashSet.add(str);
            }
            return hashSet;
        }

        private static boolean _empty(Set<String> set, boolean z10, boolean z11, boolean z12, boolean z13) {
            Value value = EMPTY;
            if (z10 == value._ignoreUnknown && z11 == value._allowGetters && z12 == value._allowSetters && z13 == value._merge) {
                return set == null || set.size() == 0;
            }
            return false;
        }

        private static boolean _equals(Value value, Value value2) {
            return value._ignoreUnknown == value2._ignoreUnknown && value._merge == value2._merge && value._allowGetters == value2._allowGetters && value._allowSetters == value2._allowSetters && value._ignored.equals(value2._ignored);
        }

        private static Set<String> _merge(Set<String> set, Set<String> set2) {
            if (set.isEmpty()) {
                return set2;
            }
            if (set2.isEmpty()) {
                return set;
            }
            HashSet hashSet = new HashSet(set.size() + set2.size());
            hashSet.addAll(set);
            hashSet.addAll(set2);
            return hashSet;
        }

        public static Value construct(Set<String> set, boolean z10, boolean z11, boolean z12, boolean z13) {
            return _empty(set, z10, z11, z12, z13) ? EMPTY : new Value(set, z10, z11, z12, z13);
        }

        public static Value empty() {
            return EMPTY;
        }

        public static Value from(JsonIgnoreProperties jsonIgnoreProperties) {
            return jsonIgnoreProperties == null ? EMPTY : construct(_asSet(jsonIgnoreProperties.value()), jsonIgnoreProperties.ignoreUnknown(), jsonIgnoreProperties.allowGetters(), jsonIgnoreProperties.allowSetters(), false);
        }

        public static Value merge(Value value, Value value2) {
            return value == null ? value2 : value.withOverrides(value2);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            return obj.getClass() == getClass() && _equals(this, (Value) obj);
        }

        public Set<String> findIgnoredForDeserialization() {
            return this._allowSetters ? Collections.emptySet() : this._ignored;
        }

        public Set<String> findIgnoredForSerialization() {
            return this._allowGetters ? Collections.emptySet() : this._ignored;
        }

        public boolean getIgnoreUnknown() {
            return this._ignoreUnknown;
        }

        public int hashCode() {
            return this._ignored.size() + (this._ignoreUnknown ? 1 : -3) + (this._allowGetters ? 3 : -7) + (this._allowSetters ? 7 : -11) + (this._merge ? 11 : -13);
        }

        public String toString() {
            return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", this._ignored, Boolean.valueOf(this._ignoreUnknown), Boolean.valueOf(this._allowGetters), Boolean.valueOf(this._allowSetters), Boolean.valueOf(this._merge));
        }

        public Value withOverrides(Value value) {
            if (value == null || value == EMPTY) {
                return this;
            }
            if (!value._merge) {
                return value;
            }
            if (_equals(this, value)) {
                return this;
            }
            Set<String> _merge = _merge(this._ignored, value._ignored);
            boolean z10 = false;
            boolean z11 = this._ignoreUnknown || value._ignoreUnknown;
            boolean z12 = this._allowGetters || value._allowGetters;
            if (this._allowSetters || value._allowSetters) {
                z10 = true;
            }
            return construct(_merge, z11, z12, z10, true);
        }
    }

    boolean allowGetters() default false;

    boolean allowSetters() default false;

    boolean ignoreUnknown() default false;

    String[] value() default {};
}
