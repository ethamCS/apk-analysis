package org.odk.collect.android.provider;

import android.net.Uri;
import android.provider.BaseColumns;
/* loaded from: classes.dex */
public final class FormsProviderAPI {
    public static final String AUTHORITY = "org.odk.collect.android.provider.odk.forms";

    private FormsProviderAPI() {
    }

    /* loaded from: classes.dex */
    public static final class FormsColumns implements BaseColumns {
        public static final String BASE64_RSA_PUBLIC_KEY = "base64RsaPublicKey";
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.odk.form";
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.odk.form";
        public static final Uri CONTENT_URI = Uri.parse("content://org.odk.collect.android.provider.odk.forms/forms");
        public static final String DATE = "date";
        public static final String DESCRIPTION = "description";
        public static final String DISPLAY_NAME = "displayName";
        public static final String DISPLAY_SUBTEXT = "displaySubtext";
        public static final String FORM_FILE_PATH = "formFilePath";
        public static final String FORM_MEDIA_PATH = "formMediaPath";
        public static final String JRCACHE_FILE_PATH = "jrcacheFilePath";
        public static final String JR_FORM_ID = "jrFormId";
        public static final String JR_VERSION = "jrVersion";
        public static final String LANGUAGE = "language";
        public static final String MD5_HASH = "md5Hash";
        public static final String SUBMISSION_URI = "submissionUri";

        private FormsColumns() {
        }
    }
}
