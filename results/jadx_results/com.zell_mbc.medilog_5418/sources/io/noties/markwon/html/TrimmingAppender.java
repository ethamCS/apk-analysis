package io.noties.markwon.html;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class TrimmingAppender {
    public abstract <T extends Appendable & CharSequence> void append(T t, String str);

    TrimmingAppender() {
    }

    public static TrimmingAppender create() {
        return new Impl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class Impl extends TrimmingAppender {
        Impl() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // io.noties.markwon.html.TrimmingAppender
        public <T extends Appendable & CharSequence> void append(T t, String str) {
            int length;
            T t2 = t;
            int length2 = t2.length();
            int length3 = str.length();
            boolean z = false;
            for (int i = 0; i < length3; i++) {
                char charAt = str.charAt(i);
                if (Character.isWhitespace(charAt)) {
                    z = true;
                } else {
                    if (z && (length = t2.length()) > 0 && !Character.isWhitespace(t2.charAt(length - 1))) {
                        AppendableUtils.appendQuietly((Appendable) t, ' ');
                    }
                    AppendableUtils.appendQuietly(t, charAt);
                    z = false;
                }
            }
            if (!z || length2 >= t2.length()) {
                return;
            }
            AppendableUtils.appendQuietly((Appendable) t, ' ');
        }
    }
}
