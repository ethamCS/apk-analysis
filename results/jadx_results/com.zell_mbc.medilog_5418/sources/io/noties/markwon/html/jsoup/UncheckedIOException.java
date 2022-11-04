package io.noties.markwon.html.jsoup;

import java.io.IOException;
/* loaded from: classes2.dex */
public class UncheckedIOException extends RuntimeException {
    public UncheckedIOException(IOException iOException) {
        super(iOException);
    }

    public IOException ioException() {
        return (IOException) getCause();
    }
}
