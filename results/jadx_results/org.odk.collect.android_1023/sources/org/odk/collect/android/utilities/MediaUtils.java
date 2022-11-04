package org.odk.collect.android.utilities;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.odk.collect.android.application.Collect;
/* loaded from: classes.dex */
public class MediaUtils {
    private static final String t = "MediaUtils";

    private MediaUtils() {
    }

    private static String escapePath(String path) {
        String ep = path.replaceAll("\\!", "!!");
        return ep.replaceAll("_", "!_").replaceAll("%", "!%");
    }

    public static final Uri getImageUriFromMediaProvider(String imageFile) {
        String[] selectArgs = {imageFile};
        String[] projection = {"_id"};
        Cursor c = null;
        try {
            c = Collect.getInstance().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, projection, "_data=?", selectArgs, null);
            if (c.getCount() > 0) {
                c.moveToFirst();
                String id = c.getString(c.getColumnIndex("_id"));
                Uri withAppendedPath = Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, id);
            }
            if (c != null) {
                c.close();
            }
            return null;
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }

    public static final int deleteImageFileFromMediaProvider(String imageFile) {
        ContentResolver cr = Collect.getInstance().getContentResolver();
        int count = 0;
        Cursor imageCursor = null;
        try {
            try {
                String[] selectArgs = {imageFile};
                String[] projection = {"_id"};
                imageCursor = cr.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, projection, "_data=?", selectArgs, null);
                if (imageCursor.getCount() > 0) {
                    imageCursor.moveToFirst();
                    List<Uri> imagesToDelete = new ArrayList<>();
                    do {
                        String id = imageCursor.getString(imageCursor.getColumnIndex("_id"));
                        imagesToDelete.add(Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, id));
                    } while (imageCursor.moveToNext());
                    for (Uri uri : imagesToDelete) {
                        Log.i(t, "attempting to delete: " + uri);
                        count += cr.delete(uri, null, null);
                    }
                }
            } catch (Exception e) {
                Log.e(t, e.toString());
                if (imageCursor != null) {
                    imageCursor.close();
                }
            }
            File f = new File(imageFile);
            if (f.exists()) {
                f.delete();
            }
            return count;
        } finally {
            if (imageCursor != null) {
                imageCursor.close();
            }
        }
    }

    public static final int deleteImagesInFolderFromMediaProvider(File folder) {
        ContentResolver cr = Collect.getInstance().getContentResolver();
        int count = 0;
        Cursor imageCursor = null;
        try {
            try {
                String[] selectArgs = {escapePath(folder.getAbsolutePath())};
                String[] projection = {"_id"};
                imageCursor = cr.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, projection, "_data like ? escape '!'", selectArgs, null);
                if (imageCursor.getCount() > 0) {
                    imageCursor.moveToFirst();
                    List<Uri> imagesToDelete = new ArrayList<>();
                    do {
                        String id = imageCursor.getString(imageCursor.getColumnIndex("_id"));
                        imagesToDelete.add(Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, id));
                    } while (imageCursor.moveToNext());
                    for (Uri uri : imagesToDelete) {
                        Log.i(t, "attempting to delete: " + uri);
                        count += cr.delete(uri, null, null);
                    }
                }
            } catch (Exception e) {
                Log.e(t, e.toString());
                if (imageCursor != null) {
                    imageCursor.close();
                }
            }
            return count;
        } finally {
            if (imageCursor != null) {
                imageCursor.close();
            }
        }
    }

    public static final Uri getAudioUriFromMediaProvider(String audioFile) {
        String[] selectArgs = {audioFile};
        String[] projection = {"_id"};
        Cursor c = null;
        try {
            c = Collect.getInstance().getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, projection, "_data=?", selectArgs, null);
            if (c.getCount() > 0) {
                c.moveToFirst();
                String id = c.getString(c.getColumnIndex("_id"));
                Uri withAppendedPath = Uri.withAppendedPath(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, id);
            }
            if (c != null) {
                c.close();
            }
            return null;
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }

    public static final int deleteAudioFileFromMediaProvider(String audioFile) {
        ContentResolver cr = Collect.getInstance().getContentResolver();
        int count = 0;
        Cursor audioCursor = null;
        try {
            try {
                String[] selectArgs = {audioFile};
                String[] projection = {"_id"};
                audioCursor = cr.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, projection, "_data=?", selectArgs, null);
                if (audioCursor.getCount() > 0) {
                    audioCursor.moveToFirst();
                    List<Uri> audioToDelete = new ArrayList<>();
                    do {
                        String id = audioCursor.getString(audioCursor.getColumnIndex("_id"));
                        audioToDelete.add(Uri.withAppendedPath(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, id));
                    } while (audioCursor.moveToNext());
                    for (Uri uri : audioToDelete) {
                        Log.i(t, "attempting to delete: " + uri);
                        count += cr.delete(uri, null, null);
                    }
                }
            } catch (Exception e) {
                Log.e(t, e.toString());
                if (audioCursor != null) {
                    audioCursor.close();
                }
            }
            File f = new File(audioFile);
            if (f.exists()) {
                f.delete();
            }
            return count;
        } finally {
            if (audioCursor != null) {
                audioCursor.close();
            }
        }
    }

    public static final int deleteAudioInFolderFromMediaProvider(File folder) {
        ContentResolver cr = Collect.getInstance().getContentResolver();
        int count = 0;
        Cursor audioCursor = null;
        try {
            try {
                String[] selectArgs = {escapePath(folder.getAbsolutePath())};
                String[] projection = {"_id"};
                audioCursor = cr.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, projection, "_data like ? escape '!'", selectArgs, null);
                if (audioCursor.getCount() > 0) {
                    audioCursor.moveToFirst();
                    List<Uri> audioToDelete = new ArrayList<>();
                    do {
                        String id = audioCursor.getString(audioCursor.getColumnIndex("_id"));
                        audioToDelete.add(Uri.withAppendedPath(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, id));
                    } while (audioCursor.moveToNext());
                    for (Uri uri : audioToDelete) {
                        Log.i(t, "attempting to delete: " + uri);
                        count += cr.delete(uri, null, null);
                    }
                }
            } catch (Exception e) {
                Log.e(t, e.toString());
                if (audioCursor != null) {
                    audioCursor.close();
                }
            }
            return count;
        } finally {
            if (audioCursor != null) {
                audioCursor.close();
            }
        }
    }

    public static final Uri getVideoUriFromMediaProvider(String videoFile) {
        String[] selectArgs = {videoFile};
        String[] projection = {"_id"};
        Cursor c = null;
        try {
            c = Collect.getInstance().getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, projection, "_data=?", selectArgs, null);
            if (c.getCount() > 0) {
                c.moveToFirst();
                String id = c.getString(c.getColumnIndex("_id"));
                Uri withAppendedPath = Uri.withAppendedPath(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, id);
            }
            if (c != null) {
                c.close();
            }
            return null;
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }

    public static final int deleteVideoFileFromMediaProvider(String videoFile) {
        ContentResolver cr = Collect.getInstance().getContentResolver();
        int count = 0;
        Cursor videoCursor = null;
        try {
            try {
                String[] selectArgs = {videoFile};
                String[] projection = {"_id"};
                videoCursor = cr.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, projection, "_data=?", selectArgs, null);
                if (videoCursor.getCount() > 0) {
                    videoCursor.moveToFirst();
                    List<Uri> videoToDelete = new ArrayList<>();
                    do {
                        String id = videoCursor.getString(videoCursor.getColumnIndex("_id"));
                        videoToDelete.add(Uri.withAppendedPath(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, id));
                    } while (videoCursor.moveToNext());
                    for (Uri uri : videoToDelete) {
                        Log.i(t, "attempting to delete: " + uri);
                        count += cr.delete(uri, null, null);
                    }
                }
            } catch (Exception e) {
                Log.e(t, e.toString());
                if (videoCursor != null) {
                    videoCursor.close();
                }
            }
            File f = new File(videoFile);
            if (f.exists()) {
                f.delete();
            }
            return count;
        } finally {
            if (videoCursor != null) {
                videoCursor.close();
            }
        }
    }

    public static final int deleteVideoInFolderFromMediaProvider(File folder) {
        ContentResolver cr = Collect.getInstance().getContentResolver();
        int count = 0;
        Cursor videoCursor = null;
        try {
            try {
                String[] selectArgs = {escapePath(folder.getAbsolutePath())};
                String[] projection = {"_id"};
                videoCursor = cr.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, projection, "_data like ? escape '!'", selectArgs, null);
                if (videoCursor.getCount() > 0) {
                    videoCursor.moveToFirst();
                    List<Uri> videoToDelete = new ArrayList<>();
                    do {
                        String id = videoCursor.getString(videoCursor.getColumnIndex("_id"));
                        videoToDelete.add(Uri.withAppendedPath(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, id));
                    } while (videoCursor.moveToNext());
                    for (Uri uri : videoToDelete) {
                        Log.i(t, "attempting to delete: " + uri);
                        count += cr.delete(uri, null, null);
                    }
                }
            } catch (Exception e) {
                Log.e(t, e.toString());
                if (videoCursor != null) {
                    videoCursor.close();
                }
            }
            return count;
        } finally {
            if (videoCursor != null) {
                videoCursor.close();
            }
        }
    }
}
