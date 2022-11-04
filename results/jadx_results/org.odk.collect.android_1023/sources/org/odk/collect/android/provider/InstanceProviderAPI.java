package org.odk.collect.android.provider;

import android.net.Uri;
import android.provider.BaseColumns;
/* loaded from: classes.dex */
public final class InstanceProviderAPI {
    public static final String AUTHORITY = "org.odk.collect.android.provider.odk.instances";
    public static final String STATUS_COMPLETE = "complete";
    public static final String STATUS_INCOMPLETE = "incomplete";
    public static final String STATUS_SUBMISSION_FAILED = "submissionFailed";
    public static final String STATUS_SUBMITTED = "submitted";

    private InstanceProviderAPI() {
    }

    /* loaded from: classes.dex */
    public static final class InstanceColumns implements BaseColumns {
        public static final String CAN_EDIT_WHEN_COMPLETE = "canEditWhenComplete";
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.odk.instance";
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.odk.instance";
        public static final Uri CONTENT_URI = Uri.parse("content://org.odk.collect.android.provider.odk.instances/instances");
        public static final String DISPLAY_NAME = "displayName";
        public static final String DISPLAY_SUBTEXT = "displaySubtext";
        public static final String INSTANCE_FILE_PATH = "instanceFilePath";
        public static final String JR_FORM_ID = "jrFormId";
        public static final String JR_VERSION = "jrVersion";
        public static final String LAST_STATUS_CHANGE_DATE = "date";
        public static final String STATUS = "status";
        public static final String SUBMISSION_URI = "submissionUri";

        private InstanceColumns() {
        }
    }
}
