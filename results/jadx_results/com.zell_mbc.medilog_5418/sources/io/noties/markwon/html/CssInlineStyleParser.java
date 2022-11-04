package io.noties.markwon.html;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public abstract class CssInlineStyleParser {
    public abstract Iterable<CssProperty> parse(String str);

    public static CssInlineStyleParser create() {
        return new Impl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class Impl extends CssInlineStyleParser {
        Impl() {
        }

        @Override // io.noties.markwon.html.CssInlineStyleParser
        public Iterable<CssProperty> parse(String str) {
            return new CssIterable(str);
        }

        /* loaded from: classes2.dex */
        public static class CssIterable implements Iterable<CssProperty> {
            private final String input;

            CssIterable(String str) {
                this.input = str;
            }

            @Override // java.lang.Iterable
            public Iterator<CssProperty> iterator() {
                return new CssIterator();
            }

            /* loaded from: classes2.dex */
            private class CssIterator implements Iterator<CssProperty> {
                private final StringBuilder builder;
                private final CssProperty cssProperty;
                private int index;
                private final int length;

                private CssIterator() {
                    CssIterable.this = r2;
                    this.cssProperty = new CssProperty();
                    this.builder = new StringBuilder();
                    this.length = r2.input.length();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    prepareNext();
                    return hasNextPrepared();
                }

                @Override // java.util.Iterator
                public CssProperty next() {
                    if (!hasNextPrepared()) {
                        throw new NoSuchElementException();
                    }
                    return this.cssProperty;
                }

                private void prepareNext() {
                    this.cssProperty.set("", "");
                    this.builder.setLength(0);
                    String str = null;
                    String str2 = null;
                    boolean z = false;
                    for (int i = this.index; i < this.length; i++) {
                        char charAt = CssIterable.this.input.charAt(i);
                        if (str == null) {
                            if (':' == charAt) {
                                if (this.builder.length() > 0) {
                                    str = this.builder.toString().trim();
                                }
                                this.builder.setLength(0);
                            } else if (';' == charAt) {
                                this.builder.setLength(0);
                            } else if (Character.isWhitespace(charAt)) {
                                if (this.builder.length() > 0) {
                                    z = true;
                                }
                            } else if (z) {
                                this.builder.setLength(0);
                                this.builder.append(charAt);
                                z = false;
                            } else {
                                this.builder.append(charAt);
                            }
                        } else if (str2 != null) {
                            continue;
                        } else if (Character.isWhitespace(charAt)) {
                            if (this.builder.length() > 0) {
                                this.builder.append(charAt);
                            }
                        } else if (';' == charAt) {
                            str2 = this.builder.toString().trim();
                            this.builder.setLength(0);
                            if (hasValues(str, str2)) {
                                this.index = i + 1;
                                this.cssProperty.set(str, str2);
                                return;
                            }
                        } else {
                            this.builder.append(charAt);
                        }
                    }
                    if (str == null || this.builder.length() <= 0) {
                        return;
                    }
                    this.cssProperty.set(str, this.builder.toString().trim());
                    this.index = this.length;
                }

                private boolean hasNextPrepared() {
                    return hasValues(this.cssProperty.key(), this.cssProperty.value());
                }

                private boolean hasValues(String str, String str2) {
                    return !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2);
                }
            }
        }
    }
}
