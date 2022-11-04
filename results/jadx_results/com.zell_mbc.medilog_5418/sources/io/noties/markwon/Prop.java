package io.noties.markwon;

import java.util.Objects;
/* loaded from: classes2.dex */
public class Prop<T> {
    private final String name;

    public static <T> Prop<T> of(Class<T> cls, String str) {
        return new Prop<>(str);
    }

    public static <T> Prop<T> of(String str) {
        return new Prop<>(str);
    }

    Prop(String str) {
        this.name = str;
    }

    public String name() {
        return this.name;
    }

    public T get(RenderProps renderProps) {
        return (T) renderProps.get(this);
    }

    public T get(RenderProps renderProps, T t) {
        return (T) renderProps.get(this, t);
    }

    public T require(RenderProps renderProps) {
        T t = get(renderProps);
        Objects.requireNonNull(t, this.name);
        return t;
    }

    public void set(RenderProps renderProps, T t) {
        renderProps.set(this, t);
    }

    public void clear(RenderProps renderProps) {
        renderProps.clear(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.name.equals(((Prop) obj).name);
        }
        return false;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return "Prop{name='" + this.name + "'}";
    }
}
