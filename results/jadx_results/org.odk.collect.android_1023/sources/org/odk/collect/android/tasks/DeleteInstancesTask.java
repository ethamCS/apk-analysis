package org.odk.collect.android.tasks;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.listeners.DeleteInstancesListener;
import org.odk.collect.android.provider.InstanceProviderAPI;
/* loaded from: classes.dex */
public class DeleteInstancesTask extends AsyncTask<Long, Void, Integer> {
    private static final String t = "DeleteInstancesTask";
    private ContentResolver cr;
    private DeleteInstancesListener dl;
    private int successCount = 0;

    public Integer doInBackground(Long... params) {
        int deleted = 0;
        if (params == null || this.cr == null || this.dl == null) {
            return 0;
        }
        for (int i = 0; i < params.length && !isCancelled(); i++) {
            try {
                Uri deleteForm = Uri.withAppendedPath(InstanceProviderAPI.InstanceColumns.CONTENT_URI, params[i].toString());
                int wasDeleted = this.cr.delete(deleteForm, null, null);
                deleted += wasDeleted;
                if (wasDeleted > 0) {
                    Collect.getInstance().getActivityLogger().logAction(this, "delete", deleteForm.toString());
                }
            } catch (Exception ex) {
                Log.e(t, "Exception during delete of: " + params[i].toString() + " exception: " + ex.toString());
            }
        }
        this.successCount = deleted;
        return Integer.valueOf(deleted);
    }

    public void onPostExecute(Integer result) {
        this.cr = null;
        if (this.dl != null) {
            this.dl.deleteComplete(result.intValue());
        }
        super.onPostExecute((DeleteInstancesTask) result);
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        this.cr = null;
        if (this.dl != null) {
            this.dl.deleteComplete(this.successCount);
        }
    }

    public void setDeleteListener(DeleteInstancesListener listener) {
        this.dl = listener;
    }

    public void setContentResolver(ContentResolver resolver) {
        this.cr = resolver;
    }

    public int getDeleteCount() {
        return this.successCount;
    }
}