package io.noties.markwon;
/* loaded from: classes2.dex */
public interface RenderProps {
    <T> void clear(Prop<T> prop);

    void clearAll();

    <T> T get(Prop<T> prop);

    <T> T get(Prop<T> prop, T t);

    <T> void set(Prop<T> prop, T t);
}
