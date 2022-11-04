package net.lingala.zip4j.util;

import java.io.File;
import java.nio.charset.Charset;
/* loaded from: classes2.dex */
public final class InternalZipConstants {
    public static final int AES_AUTH_LENGTH = 10;
    public static final int AES_BLOCK_SIZE = 16;
    public static final int AES_EXTRA_DATA_RECORD_SIZE = 11;
    public static final String AES_HASH_CHARSET = "ISO-8859-1";
    public static final int AES_HASH_ITERATIONS = 1000;
    public static final String AES_MAC_ALGORITHM = "HmacSHA1";
    public static final int AES_PASSWORD_VERIFIER_LENGTH = 2;
    public static final int BUFF_SIZE = 4096;
    public static final Charset CHARSET_UTF_8;
    public static final int ENDHDR = 22;
    public static final String FILE_SEPARATOR = File.separator;
    public static final int MAX_ALLOWED_ZIP_COMMENT_LENGTH = 65535;
    public static final int MAX_COMMENT_SIZE = 65536;
    public static final int MIN_BUFF_SIZE = 512;
    public static final int MIN_SPLIT_LENGTH = 65536;
    public static final String SEVEN_ZIP_SPLIT_FILE_EXTENSION_PATTERN = ".zip.001";
    public static final int STD_DEC_HDR_SIZE = 12;
    public static final int UPDATE_LFH_COMP_SIZE = 18;
    public static final int UPDATE_LFH_CRC = 14;
    public static final int UPDATE_LFH_UNCOMP_SIZE = 22;
    public static final Charset ZIP4J_DEFAULT_CHARSET;
    public static final int ZIP_64_NUMBER_OF_ENTRIES_LIMIT = 65535;
    public static final long ZIP_64_SIZE_LIMIT = 4294967295L;
    public static final String ZIP_FILE_SEPARATOR = "/";
    public static final String ZIP_STANDARD_CHARSET_NAME = "Cp437";

    private InternalZipConstants() {
    }

    static {
        Charset forName = Charset.forName("UTF-8");
        CHARSET_UTF_8 = forName;
        ZIP4J_DEFAULT_CHARSET = forName;
    }
}
