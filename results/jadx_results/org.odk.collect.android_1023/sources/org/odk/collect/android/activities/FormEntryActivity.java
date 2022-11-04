package org.odk.collect.android.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.InputFilter;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.io.FileFilter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.javarosa.core.model.FormIndex;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.services.PropertyManager;
import org.javarosa.form.api.FormEntryCaption;
import org.javarosa.form.api.FormEntryPrompt;
import org.javarosa.model.xform.XFormsModule;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
import org.javarosa.xpath.XPathTypeMismatchException;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.listeners.AdvanceToNextListener;
import org.odk.collect.android.listeners.FormLoaderListener;
import org.odk.collect.android.listeners.FormSavedListener;
import org.odk.collect.android.logic.FormController;
import org.odk.collect.android.preferences.AdminPreferencesActivity;
import org.odk.collect.android.preferences.PreferencesActivity;
import org.odk.collect.android.provider.FormsProviderAPI;
import org.odk.collect.android.provider.InstanceProviderAPI;
import org.odk.collect.android.tasks.FormLoaderTask;
import org.odk.collect.android.tasks.SaveToDiskTask;
import org.odk.collect.android.utilities.FileUtils;
import org.odk.collect.android.utilities.MediaUtils;
import org.odk.collect.android.views.ODKView;
import org.odk.collect.android.widgets.QuestionWidget;
/* loaded from: classes.dex */
public class FormEntryActivity extends Activity implements Animation.AnimationListener, FormLoaderListener, FormSavedListener, AdvanceToNextListener, GestureDetector.OnGestureListener {
    public static final int ANNOTATE_IMAGE = 15;
    public static final int AUDIO_CAPTURE = 3;
    public static final int AUDIO_CHOOSER = 8;
    public static final int BARCODE_CAPTURE = 2;
    private static final int DELETE_REPEAT = 654321;
    private static final boolean DO_NOT_EVALUATE_CONSTRAINTS = false;
    private static final boolean DO_NOT_EXIT = false;
    public static final int DRAW_IMAGE = 13;
    private static final boolean EVALUATE_CONSTRAINTS = true;
    private static final boolean EXIT = true;
    public static final int EX_DECIMAL_CAPTURE = 12;
    public static final int EX_INT_CAPTURE = 11;
    public static final int EX_STRING_CAPTURE = 10;
    public static final int HIERARCHY_ACTIVITY = 6;
    public static final int IMAGE_CAPTURE = 1;
    public static final int IMAGE_CHOOSER = 7;
    public static final String KEY_ERROR = "error";
    public static final String KEY_FORMPATH = "formpath";
    public static final String KEY_INSTANCEPATH = "instancepath";
    public static final String KEY_INSTANCES = "instances";
    public static final String KEY_SUCCESS = "success";
    public static final String KEY_XPATH = "xpath";
    public static final String KEY_XPATH_WAITING_FOR_DATA = "xpathwaiting";
    public static final int LOCATION_CAPTURE = 5;
    public static final String LOCATION_RESULT = "LOCATION_RESULT";
    private static final int MENU_HIERARCHY_VIEW = 2;
    private static final int MENU_LANGUAGES = 1;
    private static final int MENU_PREFERENCES = 4;
    private static final int MENU_SAVE = 3;
    private static final String NEWFORM = "newform";
    private static final int PROGRESS_DIALOG = 1;
    private static final int SAVEPOINT_INTERVAL = 1;
    private static final int SAVING_DIALOG = 2;
    public static final int SIGNATURE_CAPTURE = 14;
    public static final int VIDEO_CAPTURE = 4;
    public static final int VIDEO_CHOOSER = 9;
    private static final String t = "FormEntryActivity";
    private SharedPreferences mAdminPreferences;
    private AlertDialog mAlertDialog;
    private View mCurrentView;
    private String mErrorMessage;
    private FormLoaderTask mFormLoaderTask;
    private String mFormPath;
    private GestureDetector mGestureDetector;
    private Animation mInAnimation;
    private Animation mOutAnimation;
    private ProgressDialog mProgressDialog;
    private RelativeLayout mRelativeLayout;
    private SaveToDiskTask mSaveToDiskTask;
    private View mStaleView = null;
    private boolean mBeenSwiped = false;
    private int viewCount = 0;
    private int mAnimationCompletionSet = 0;

    /* loaded from: classes.dex */
    public enum AnimationType {
        LEFT,
        RIGHT,
        FADE
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Cursor instanceCursor;
        String[] selectionArgs;
        String selection;
        super.onCreate(savedInstanceState);
        try {
            Collect.createODKDirs();
            setContentView(R.layout.form_entry);
            setTitle(getString(R.string.app_name) + " > " + getString(R.string.loading_form));
            this.mRelativeLayout = (RelativeLayout) findViewById(R.id.rl);
            this.mBeenSwiped = false;
            this.mAlertDialog = null;
            this.mCurrentView = null;
            this.mInAnimation = null;
            this.mOutAnimation = null;
            this.mGestureDetector = new GestureDetector(this);
            this.mAdminPreferences = getSharedPreferences(AdminPreferencesActivity.ADMIN_PREFERENCES, 0);
            new XFormsModule().registerModule();
            PropertyManager.setPropertyManager(new org.odk.collect.android.logic.PropertyManager(getApplicationContext()));
            String startingXPath = null;
            String waitingXPath = null;
            String instancePath = null;
            Boolean newForm = true;
            if (savedInstanceState != null) {
                if (savedInstanceState.containsKey(KEY_FORMPATH)) {
                    this.mFormPath = savedInstanceState.getString(KEY_FORMPATH);
                }
                if (savedInstanceState.containsKey(KEY_INSTANCEPATH)) {
                    instancePath = savedInstanceState.getString(KEY_INSTANCEPATH);
                }
                if (savedInstanceState.containsKey(KEY_XPATH)) {
                    startingXPath = savedInstanceState.getString(KEY_XPATH);
                    Log.i(t, "startingXPath is: " + startingXPath);
                }
                if (savedInstanceState.containsKey(KEY_XPATH_WAITING_FOR_DATA)) {
                    waitingXPath = savedInstanceState.getString(KEY_XPATH_WAITING_FOR_DATA);
                    Log.i(t, "waitingXPath is: " + waitingXPath);
                }
                if (savedInstanceState.containsKey(NEWFORM)) {
                    newForm = Boolean.valueOf(savedInstanceState.getBoolean(NEWFORM, true));
                }
                if (savedInstanceState.containsKey(KEY_ERROR)) {
                    this.mErrorMessage = savedInstanceState.getString(KEY_ERROR);
                }
            }
            if (this.mErrorMessage != null) {
                createErrorDialog(this.mErrorMessage, true);
                return;
            }
            Object data = getLastNonConfigurationInstance();
            if (data instanceof FormLoaderTask) {
                this.mFormLoaderTask = (FormLoaderTask) data;
            } else if (data instanceof SaveToDiskTask) {
                this.mSaveToDiskTask = (SaveToDiskTask) data;
            } else if (data == null) {
                if (!newForm.booleanValue()) {
                    if (Collect.getInstance().getFormController() != null) {
                        refreshCurrentView();
                        return;
                    }
                    Log.w(t, "Reloading form and restoring state.");
                    this.mFormLoaderTask = new FormLoaderTask(instancePath, startingXPath, waitingXPath);
                    Collect.getInstance().getActivityLogger().logAction(this, "formReloaded", this.mFormPath);
                    this.mFormLoaderTask.execute(this.mFormPath);
                    return;
                }
                Collect.getInstance().setFormController(null);
                Intent intent = getIntent();
                if (intent != null) {
                    Uri uri = intent.getData();
                    if (getContentResolver().getType(uri) == InstanceProviderAPI.InstanceColumns.CONTENT_ITEM_TYPE) {
                        instanceCursor = null;
                        try {
                            Cursor instanceCursor2 = getContentResolver().query(uri, null, null, null, null);
                            if (instanceCursor2.getCount() != 1) {
                                createErrorDialog("Bad URI: " + uri, true);
                                if (instanceCursor2 != null) {
                                    instanceCursor2.close();
                                    return;
                                }
                                return;
                            }
                            instanceCursor2.moveToFirst();
                            instancePath = instanceCursor2.getString(instanceCursor2.getColumnIndex(InstanceProviderAPI.InstanceColumns.INSTANCE_FILE_PATH));
                            Collect.getInstance().getActivityLogger().logAction(this, "instanceLoaded", instancePath);
                            String jrFormId = instanceCursor2.getString(instanceCursor2.getColumnIndex("jrFormId"));
                            int idxJrVersion = instanceCursor2.getColumnIndex("jrVersion");
                            String jrVersion = instanceCursor2.isNull(idxJrVersion) ? null : instanceCursor2.getString(idxJrVersion);
                            if (instanceCursor2 != null) {
                                instanceCursor2.close();
                            }
                            if (jrVersion == null) {
                                selectionArgs = new String[]{jrFormId};
                                selection = "jrFormId=? AND jrVersion IS NULL";
                            } else {
                                selectionArgs = new String[]{jrFormId, jrVersion};
                                selection = "jrFormId=? AND jrVersion=?";
                            }
                            Cursor formCursor = null;
                            try {
                                Cursor formCursor2 = getContentResolver().query(FormsProviderAPI.FormsColumns.CONTENT_URI, null, selection, selectionArgs, null);
                                if (formCursor2.getCount() == 1) {
                                    formCursor2.moveToFirst();
                                    this.mFormPath = formCursor2.getString(formCursor2.getColumnIndex(FormsProviderAPI.FormsColumns.FORM_FILE_PATH));
                                } else if (formCursor2.getCount() >= 1) {
                                    if (formCursor2.getCount() > 1) {
                                        formCursor2.moveToFirst();
                                        this.mFormPath = formCursor2.getString(formCursor2.getColumnIndex(FormsProviderAPI.FormsColumns.FORM_FILE_PATH));
                                        createErrorDialog("Multiple matching form definitions exist", false);
                                    }
                                } else {
                                    createErrorDialog(getString(R.string.parent_form_not_present, new Object[]{jrFormId}) + (jrVersion == null ? "" : "\n" + getString(R.string.version) + XFormAnswerDataSerializer.DELIMITER + jrVersion), true);
                                    if (formCursor2 != null) {
                                        formCursor2.close();
                                        return;
                                    }
                                    return;
                                }
                                if (formCursor2 != null) {
                                    formCursor2.close();
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } else if (getContentResolver().getType(uri) == FormsProviderAPI.FormsColumns.CONTENT_ITEM_TYPE) {
                        instanceCursor = null;
                        try {
                            Cursor c = getContentResolver().query(uri, null, null, null, null);
                            if (c.getCount() != 1) {
                                createErrorDialog("Bad URI: " + uri, true);
                                if (c != null) {
                                    c.close();
                                    return;
                                }
                                return;
                            }
                            c.moveToFirst();
                            this.mFormPath = c.getString(c.getColumnIndex(FormsProviderAPI.FormsColumns.FORM_FILE_PATH));
                            final String filePrefix = this.mFormPath.substring(this.mFormPath.lastIndexOf(47) + 1, this.mFormPath.lastIndexOf(46)) + "_";
                            File cacheDir = new File(Collect.CACHE_PATH);
                            File[] files = cacheDir.listFiles(new FileFilter() { // from class: org.odk.collect.android.activities.FormEntryActivity.1
                                @Override // java.io.FileFilter
                                public boolean accept(File pathname) {
                                    String name = pathname.getName();
                                    return name.startsWith(filePrefix) && name.endsWith(".xml.save");
                                }
                            });
                            int i = 0;
                            while (true) {
                                if (i >= files.length) {
                                    break;
                                }
                                File candidate = files[i];
                                String instanceDirName = candidate.getName().substring(0, candidate.getName().length() - ".xml.save".length());
                                File instanceDir = new File(Collect.INSTANCES_PATH + File.separator + instanceDirName);
                                File instanceFile = new File(instanceDir, instanceDirName + ".xml");
                                if (!instanceDir.exists() || !instanceDir.isDirectory() || instanceFile.exists()) {
                                    i++;
                                } else {
                                    instancePath = instanceFile.getAbsolutePath();
                                    break;
                                }
                            }
                            if (c != null) {
                                c.close();
                            }
                        } finally {
                            if (instanceCursor != null) {
                                instanceCursor.close();
                            }
                        }
                    } else {
                        Log.e(t, "unrecognized URI");
                        createErrorDialog("unrecognized URI: " + uri, true);
                        return;
                    }
                    this.mFormLoaderTask = new FormLoaderTask(instancePath, null, null);
                    Collect.getInstance().getActivityLogger().logAction(this, "formLoaded", this.mFormPath);
                    showDialog(1);
                    this.mFormLoaderTask.execute(this.mFormPath);
                }
            }
        } catch (RuntimeException e) {
            createErrorDialog(e.getMessage(), true);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_FORMPATH, this.mFormPath);
        FormController formController = Collect.getInstance().getFormController();
        if (formController != null) {
            outState.putString(KEY_INSTANCEPATH, formController.getInstancePath().getAbsolutePath());
            outState.putString(KEY_XPATH, formController.getXPath(formController.getFormIndex()));
            FormIndex waiting = formController.getIndexWaitingForData();
            if (waiting != null) {
                outState.putString(KEY_XPATH_WAITING_FOR_DATA, formController.getXPath(waiting));
            }
            SaveToDiskTask.blockingExportTempData();
        }
        outState.putBoolean(NEWFORM, false);
        outState.putString(KEY_ERROR, this.mErrorMessage);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        String sourceImagePath;
        super.onActivityResult(requestCode, resultCode, intent);
        FormController formController = Collect.getInstance().getFormController();
        if (formController == null) {
            if (this.mFormLoaderTask != null && this.mFormLoaderTask.getStatus() != AsyncTask.Status.FINISHED) {
                this.mFormLoaderTask.setActivityResult(requestCode, resultCode, intent);
            } else {
                Log.e(t, "Got an activityResult without any pending form loader");
            }
        } else if (resultCode == 0) {
            if (requestCode != 6) {
                ((ODKView) this.mCurrentView).cancelWaitingForBinaryData();
            }
        } else {
            switch (requestCode) {
                case 1:
                case 13:
                case 14:
                case 15:
                    File fi = new File(Collect.TMPFILE_PATH);
                    String mInstanceFolder = formController.getInstancePath().getParent();
                    String s = mInstanceFolder + File.separator + System.currentTimeMillis() + ".jpg";
                    File nf = new File(s);
                    if (!fi.renameTo(nf)) {
                        Log.e(t, "Failed to rename " + fi.getAbsolutePath());
                    } else {
                        Log.i(t, "renamed " + fi.getAbsolutePath() + " to " + nf.getAbsolutePath());
                    }
                    ((ODKView) this.mCurrentView).setBinaryData(nf);
                    saveAnswersForCurrentScreen(false);
                    break;
                case 2:
                    String sb = intent.getStringExtra("SCAN_RESULT");
                    ((ODKView) this.mCurrentView).setBinaryData(sb);
                    saveAnswersForCurrentScreen(false);
                    break;
                case 3:
                case 4:
                case 8:
                case 9:
                    Uri media = intent.getData();
                    ((ODKView) this.mCurrentView).setBinaryData(media);
                    saveAnswersForCurrentScreen(false);
                    break;
                case 5:
                    String sl = intent.getStringExtra(LOCATION_RESULT);
                    ((ODKView) this.mCurrentView).setBinaryData(sl);
                    saveAnswersForCurrentScreen(false);
                    break;
                case 7:
                    Uri selectedImage = intent.getData();
                    if (selectedImage.toString().startsWith("file")) {
                        sourceImagePath = selectedImage.toString().substring(6);
                    } else {
                        String[] projection = {"_data"};
                        Cursor cursor = null;
                        try {
                            cursor = getContentResolver().query(selectedImage, projection, null, null, null);
                            int column_index = cursor.getColumnIndexOrThrow("_data");
                            cursor.moveToFirst();
                            sourceImagePath = cursor.getString(column_index);
                            if (cursor != null) {
                                cursor.close();
                            }
                        } catch (Throwable th) {
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    String mInstanceFolder1 = formController.getInstancePath().getParent();
                    String destImagePath = mInstanceFolder1 + File.separator + System.currentTimeMillis() + ".jpg";
                    File source = new File(sourceImagePath);
                    File newImage = new File(destImagePath);
                    FileUtils.copyFile(source, newImage);
                    ((ODKView) this.mCurrentView).setBinaryData(newImage);
                    saveAnswersForCurrentScreen(false);
                    break;
                case 10:
                    String sv = intent.getStringExtra("value");
                    ((ODKView) this.mCurrentView).setBinaryData(sv);
                    saveAnswersForCurrentScreen(false);
                    break;
                case 11:
                    Integer iv = Integer.valueOf(intent.getIntExtra("value", 0));
                    ((ODKView) this.mCurrentView).setBinaryData(iv);
                    saveAnswersForCurrentScreen(false);
                    break;
                case 12:
                    Double dv = Double.valueOf(intent.getDoubleExtra("value", 0.0d));
                    ((ODKView) this.mCurrentView).setBinaryData(dv);
                    saveAnswersForCurrentScreen(false);
                    break;
            }
            refreshCurrentView();
        }
    }

    public void refreshCurrentView() {
        FormController formController = Collect.getInstance().getFormController();
        int event = formController.getEvent();
        View current = createView(event, false);
        showView(current, AnimationType.FADE);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        Collect.getInstance().getActivityLogger().logInstanceAction(this, "onPrepareOptionsMenu", "show");
        FormController formController = Collect.getInstance().getFormController();
        menu.removeItem(1);
        menu.removeItem(2);
        menu.removeItem(3);
        menu.removeItem(4);
        if (this.mAdminPreferences.getBoolean(AdminPreferencesActivity.KEY_SAVE_MID, true)) {
            menu.add(0, 3, 0, R.string.save_all_answers).setIcon(17301582);
        }
        if (this.mAdminPreferences.getBoolean(AdminPreferencesActivity.KEY_JUMP_TO, true)) {
            menu.add(0, 2, 0, getString(R.string.view_hierarchy)).setIcon(R.drawable.ic_menu_goto);
        }
        if (this.mAdminPreferences.getBoolean(AdminPreferencesActivity.KEY_CHANGE_LANGUAGE, true)) {
            menu.add(0, 1, 0, getString(R.string.change_language)).setIcon(R.drawable.ic_menu_start_conversation).setEnabled((formController.getLanguages() == null || formController.getLanguages().length == 1) ? false : true);
        }
        if (this.mAdminPreferences.getBoolean(AdminPreferencesActivity.KEY_ACCESS_SETTINGS, true)) {
            menu.add(0, 4, 0, getString(R.string.general_preferences)).setIcon(17301577);
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        FormController formController = Collect.getInstance().getFormController();
        switch (item.getItemId()) {
            case 1:
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "onOptionsItemSelected", "MENU_LANGUAGES");
                createLanguageDialog();
                return true;
            case 2:
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "onOptionsItemSelected", "MENU_HIERARCHY_VIEW");
                if (formController.currentPromptIsQuestion()) {
                    saveAnswersForCurrentScreen(false);
                }
                Intent i = new Intent(this, FormHierarchyActivity.class);
                startActivityForResult(i, 6);
                return true;
            case 3:
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "onOptionsItemSelected", "MENU_SAVE");
                saveDataToDisk(false, isInstanceComplete(false), null);
                return true;
            case 4:
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "onOptionsItemSelected", "MENU_PREFERENCES");
                Intent pref = new Intent(this, PreferencesActivity.class);
                startActivity(pref);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public boolean saveAnswersForCurrentScreen(boolean evaluateConstraints) {
        FormController formController = Collect.getInstance().getFormController();
        if (formController.currentPromptIsQuestion()) {
            LinkedHashMap<FormIndex, IAnswerData> answers = ((ODKView) this.mCurrentView).getAnswers();
            FormController.FailedConstraint constraint = formController.saveAllScreenAnswers(answers, evaluateConstraints);
            if (constraint != null) {
                createConstraintToast(constraint.index, constraint.status);
                return false;
            }
        }
        return true;
    }

    public void clearAnswer(QuestionWidget qw) {
        qw.clearAnswer();
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        Collect.getInstance().getActivityLogger().logInstanceAction(this, "onCreateContextMenu", "show");
        FormController formController = Collect.getInstance().getFormController();
        menu.add(0, v.getId(), 0, getString(R.string.clear_answer));
        if (formController.indexContainsRepeatableGroup()) {
            menu.add(0, DELETE_REPEAT, 0, getString(R.string.delete_repeat));
        }
        menu.setHeaderTitle(getString(R.string.edit_prompt));
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(MenuItem item) {
        Iterator i$ = ((ODKView) this.mCurrentView).getWidgets().iterator();
        while (i$.hasNext()) {
            QuestionWidget qw = i$.next();
            if (item.getItemId() == qw.getId()) {
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "onContextItemSelected", "createClearDialog", qw.getPrompt().getIndex());
                createClearDialog(qw);
            }
        }
        if (item.getItemId() == DELETE_REPEAT) {
            Collect.getInstance().getActivityLogger().logInstanceAction(this, "onContextItemSelected", "createDeleteRepeatConfirmDialog");
            createDeleteRepeatConfirmDialog();
        }
        return super.onContextItemSelected(item);
    }

    @Override // android.app.Activity
    public Object onRetainNonConfigurationInstance() {
        FormController formController = Collect.getInstance().getFormController();
        if (this.mFormLoaderTask != null && this.mFormLoaderTask.getStatus() != AsyncTask.Status.FINISHED) {
            return this.mFormLoaderTask;
        }
        if (this.mSaveToDiskTask != null && this.mSaveToDiskTask.getStatus() != AsyncTask.Status.FINISHED) {
            return this.mSaveToDiskTask;
        }
        if (formController != null && formController.currentPromptIsQuestion()) {
            saveAnswersForCurrentScreen(false);
        }
        return null;
    }

    private View createView(int event, boolean advancingPage) {
        RuntimeException e;
        FormEntryPrompt[] prompts;
        FormEntryCaption[] groups;
        ODKView odkv;
        FormController formController = Collect.getInstance().getFormController();
        setTitle(getString(R.string.app_name) + " > " + formController.getFormTitle());
        switch (event) {
            case 0:
                View startView = View.inflate(this, R.layout.form_entry_start, null);
                setTitle(getString(R.string.app_name) + " > " + formController.getFormTitle());
                ((TextView) startView.findViewById(R.id.description)).setText(getString(R.string.enter_data_description, new Object[]{formController.getFormTitle()}));
                Drawable image = null;
                File mediaFolder = formController.getMediaFolder();
                String mediaDir = mediaFolder.getAbsolutePath();
                BitmapDrawable bitImage = new BitmapDrawable(mediaDir + File.separator + "form_logo.png");
                if (bitImage != null && bitImage.getBitmap() != null && bitImage.getIntrinsicHeight() > 0 && bitImage.getIntrinsicWidth() > 0) {
                    image = bitImage;
                }
                if (image == null) {
                    ((ImageView) startView.findViewById(R.id.form_start_bling)).setVisibility(8);
                    return startView;
                }
                ImageView v = (ImageView) startView.findViewById(R.id.form_start_bling);
                v.setImageDrawable(image);
                v.setContentDescription(formController.getFormTitle());
                return startView;
            case 1:
                View endView = View.inflate(this, R.layout.form_entry_end, null);
                ((TextView) endView.findViewById(R.id.description)).setText(getString(R.string.save_enter_data_description, new Object[]{formController.getFormTitle()}));
                final CheckBox instanceComplete = (CheckBox) endView.findViewById(R.id.mark_finished);
                instanceComplete.setChecked(isInstanceComplete(true));
                if (!this.mAdminPreferences.getBoolean(AdminPreferencesActivity.KEY_MARK_AS_FINALIZED, true)) {
                    instanceComplete.setVisibility(8);
                }
                final EditText saveAs = (EditText) endView.findViewById(R.id.save_name);
                if (!this.mAdminPreferences.getBoolean(AdminPreferencesActivity.KEY_SAVE_AS, true)) {
                    saveAs.setVisibility(8);
                    TextView sa = (TextView) endView.findViewById(R.id.save_form_as);
                    sa.setVisibility(8);
                }
                InputFilter returnFilter = new InputFilter() { // from class: org.odk.collect.android.activities.FormEntryActivity.2
                    @Override // android.text.InputFilter
                    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                        for (int i = start; i < end; i++) {
                            if (Character.getType(source.charAt(i)) == 15) {
                                return "";
                            }
                        }
                        return null;
                    }
                };
                saveAs.setFilters(new InputFilter[]{returnFilter});
                String saveName = formController.getFormTitle();
                if (getContentResolver().getType(getIntent().getData()) == InstanceProviderAPI.InstanceColumns.CONTENT_ITEM_TYPE) {
                    Uri instanceUri = getIntent().getData();
                    Cursor instance = null;
                    try {
                        instance = getContentResolver().query(instanceUri, null, null, null, null);
                        if (instance.getCount() == 1) {
                            instance.moveToFirst();
                            saveName = instance.getString(instance.getColumnIndex("displayName"));
                        }
                    } finally {
                        if (instance != null) {
                            instance.close();
                        }
                    }
                }
                saveAs.setText(saveName);
                ((Button) endView.findViewById(R.id.save_exit_button)).setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.FormEntryActivity.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View v2) {
                        Collect.getInstance().getActivityLogger().logInstanceAction(this, "createView.saveAndExit", instanceComplete.isChecked() ? "saveAsComplete" : "saveIncomplete");
                        if (saveAs.getText().length() >= 1) {
                            FormEntryActivity.this.saveDataToDisk(true, instanceComplete.isChecked(), saveAs.getText().toString());
                        } else {
                            Toast.makeText(FormEntryActivity.this, (int) R.string.save_as_error, 0).show();
                        }
                    }
                });
                return endView;
            case 4:
            case 8:
            case 16:
                try {
                    prompts = formController.getQuestionPrompts();
                    groups = formController.getGroupsForCurrentIndex();
                    odkv = new ODKView(this, formController.getQuestionPrompts(), groups, advancingPage);
                } catch (RuntimeException e2) {
                    e = e2;
                }
                try {
                    Log.i(t, "created view for group " + (groups.length > 0 ? groups[groups.length - 1].getLongText() : "[top]") + XFormAnswerDataSerializer.DELIMITER + (prompts.length > 0 ? prompts[0].getQuestionText() : "[no question]"));
                    Iterator i$ = odkv.getWidgets().iterator();
                    while (i$.hasNext()) {
                        QuestionWidget qw = i$.next();
                        if (!qw.getPrompt().isReadOnly()) {
                            registerForContextMenu(qw);
                        }
                    }
                    return odkv;
                } catch (RuntimeException e3) {
                    e = e3;
                    createErrorDialog(e.getMessage(), true);
                    e.printStackTrace();
                    return new View(this);
                }
            default:
                Log.e(t, "Attempted to create a view that does not exist.");
                return null;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent mv) {
        boolean handled = this.mGestureDetector.onTouchEvent(mv);
        if (!handled) {
            return super.dispatchTouchEvent(mv);
        }
        return handled;
    }

    public void showNextView() {
        FormController formController = Collect.getInstance().getFormController();
        if (formController.currentPromptIsQuestion() && !saveAnswersForCurrentScreen(true)) {
            this.mBeenSwiped = false;
            return;
        }
        int event = formController.stepToNextScreenEvent();
        switch (event) {
            case 1:
            case 16:
                View next = createView(event, true);
                showView(next, AnimationType.RIGHT);
                return;
            case 2:
                createRepeatDialog();
                return;
            case 4:
            case 8:
                int i = this.viewCount + 1;
                this.viewCount = i;
                if (i % 1 == 0) {
                    SaveToDiskTask.blockingExportTempData();
                }
                View next2 = createView(event, true);
                showView(next2, AnimationType.RIGHT);
                return;
            case 32:
                Log.i(t, "repeat juncture: " + formController.getFormIndex().getReference());
                return;
            default:
                Log.w(t, "JavaRosa added a new EVENT type and didn't tell us... shame on them.");
                return;
        }
    }

    public void showPreviousView() {
        FormController formController = Collect.getInstance().getFormController();
        if (formController.currentPromptIsQuestion()) {
            saveAnswersForCurrentScreen(false);
        }
        if (formController.getEvent() != 0) {
            int event = formController.stepToPreviousScreenEvent();
            if (event == 0 || event == 8 || event == 4) {
                int i = this.viewCount + 1;
                this.viewCount = i;
                if (i % 1 == 0) {
                    SaveToDiskTask.blockingExportTempData();
                }
            }
            View next = createView(event, false);
            showView(next, AnimationType.LEFT);
            return;
        }
        this.mBeenSwiped = false;
    }

    public void showView(View next, AnimationType from) {
        if (this.mInAnimation != null) {
            this.mInAnimation.setAnimationListener(null);
        }
        if (this.mOutAnimation != null) {
            this.mOutAnimation.setAnimationListener(null);
        }
        switch (from) {
            case RIGHT:
                this.mInAnimation = AnimationUtils.loadAnimation(this, R.anim.push_left_in);
                this.mOutAnimation = AnimationUtils.loadAnimation(this, R.anim.push_left_out);
                break;
            case LEFT:
                this.mInAnimation = AnimationUtils.loadAnimation(this, R.anim.push_right_in);
                this.mOutAnimation = AnimationUtils.loadAnimation(this, R.anim.push_right_out);
                break;
            case FADE:
                this.mInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
                this.mOutAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_out);
                break;
        }
        this.mInAnimation.setAnimationListener(this);
        this.mOutAnimation.setAnimationListener(this);
        if (this.mCurrentView != null) {
            InputMethodManager inputManager = (InputMethodManager) getSystemService("input_method");
            inputManager.hideSoftInputFromWindow(this.mCurrentView.getWindowToken(), 0);
        }
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(-1, -1);
        this.mStaleView = this.mCurrentView;
        this.mCurrentView = next;
        this.mRelativeLayout.addView(this.mCurrentView, lp);
        this.mAnimationCompletionSet = 0;
        if (this.mStaleView != null) {
            this.mStaleView.startAnimation(this.mOutAnimation);
            this.mRelativeLayout.removeView(this.mStaleView);
        } else {
            this.mAnimationCompletionSet = 2;
        }
        this.mCurrentView.startAnimation(this.mInAnimation);
        String logString = "";
        switch (from) {
            case RIGHT:
                logString = "next";
                break;
            case LEFT:
                logString = "previous";
                break;
            case FADE:
                logString = "refresh";
                break;
        }
        Collect.getInstance().getActivityLogger().logInstanceAction(this, "showView", logString);
    }

    private void createConstraintToast(FormIndex index, int saveStatus) {
        FormController formController = Collect.getInstance().getFormController();
        String constraintText = formController.getQuestionPrompt(index).getConstraintText();
        switch (saveStatus) {
            case 1:
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "createConstraintToast.ANSWER_REQUIRED_BUT_EMPTY", "show", index);
                constraintText = getString(R.string.required_answer_error);
                break;
            case 2:
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "createConstraintToast.ANSWER_CONSTRAINT_VIOLATED", "show", index);
                if (constraintText == null) {
                    constraintText = getString(R.string.invalid_answer_error);
                    break;
                }
                break;
        }
        showCustomToast(constraintText, 0);
    }

    private void showCustomToast(String message, int duration) {
        LayoutInflater inflater = (LayoutInflater) getSystemService("layout_inflater");
        View view = inflater.inflate(R.layout.toast_view, (ViewGroup) null);
        TextView tv = (TextView) view.findViewById(R.id.message);
        tv.setText(message);
        Toast t2 = new Toast(this);
        t2.setView(view);
        t2.setDuration(duration);
        t2.setGravity(17, 0, 0);
        t2.show();
    }

    private void createRepeatDialog() {
        FormController formController = Collect.getInstance().getFormController();
        Collect.getInstance().getActivityLogger().logInstanceAction(this, "createRepeatDialog", "show");
        this.mAlertDialog = new AlertDialog.Builder(this).create();
        this.mAlertDialog.setIcon(17301659);
        DialogInterface.OnClickListener repeatListener = new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.FormEntryActivity.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int i) {
                FormController formController2 = Collect.getInstance().getFormController();
                switch (i) {
                    case -2:
                        Collect.getInstance().getActivityLogger().logInstanceAction(this, "createRepeatDialog", "showNext");
                        FormEntryActivity.this.showNextView();
                        return;
                    case -1:
                        Collect.getInstance().getActivityLogger().logInstanceAction(this, "createRepeatDialog", "addRepeat");
                        try {
                            formController2.newRepeat();
                            if (!formController2.indexIsInFieldList()) {
                                FormEntryActivity.this.showNextView();
                                return;
                            } else {
                                FormEntryActivity.this.refreshCurrentView();
                                return;
                            }
                        } catch (XPathTypeMismatchException e) {
                            FormEntryActivity.this.createErrorDialog(e.getMessage(), true);
                            return;
                        }
                    default:
                        return;
                }
            }
        };
        if (formController.getLastRepeatCount() > 0) {
            this.mAlertDialog.setTitle(getString(R.string.leaving_repeat_ask));
            this.mAlertDialog.setMessage(getString(R.string.add_another_repeat, new Object[]{formController.getLastGroupText()}));
            this.mAlertDialog.setButton(getString(R.string.add_another), repeatListener);
            this.mAlertDialog.setButton2(getString(R.string.leave_repeat_yes), repeatListener);
        } else {
            this.mAlertDialog.setTitle(getString(R.string.entering_repeat_ask));
            this.mAlertDialog.setMessage(getString(R.string.add_repeat, new Object[]{formController.getLastGroupText()}));
            this.mAlertDialog.setButton(getString(R.string.entering_repeat), repeatListener);
            this.mAlertDialog.setButton2(getString(R.string.add_repeat_no), repeatListener);
        }
        this.mAlertDialog.setCancelable(false);
        this.mBeenSwiped = false;
        this.mAlertDialog.show();
    }

    public void createErrorDialog(String errorMsg, final boolean shouldExit) {
        Collect.getInstance().getActivityLogger().logInstanceAction(this, "createErrorDialog", "show." + Boolean.toString(shouldExit));
        this.mErrorMessage = errorMsg;
        this.mAlertDialog = new AlertDialog.Builder(this).create();
        this.mAlertDialog.setIcon(17301659);
        this.mAlertDialog.setTitle(getString(R.string.error_occured));
        this.mAlertDialog.setMessage(errorMsg);
        DialogInterface.OnClickListener errorListener = new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.FormEntryActivity.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int i) {
                switch (i) {
                    case -1:
                        Collect.getInstance().getActivityLogger().logInstanceAction(this, "createErrorDialog", "OK");
                        if (shouldExit) {
                            FormEntryActivity.this.finish();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        };
        this.mAlertDialog.setCancelable(false);
        this.mAlertDialog.setButton(getString(R.string.ok), errorListener);
        this.mBeenSwiped = false;
        this.mAlertDialog.show();
    }

    private void createDeleteRepeatConfirmDialog() {
        Collect.getInstance().getActivityLogger().logInstanceAction(this, "createDeleteRepeatConfirmDialog", "show");
        FormController formController = Collect.getInstance().getFormController();
        this.mAlertDialog = new AlertDialog.Builder(this).create();
        this.mAlertDialog.setIcon(17301659);
        String name = formController.getLastRepeatedGroupName();
        int repeatcount = formController.getLastRepeatedGroupRepeatCount();
        if (repeatcount != -1) {
            name = name + " (" + (repeatcount + 1) + ")";
        }
        this.mAlertDialog.setTitle(getString(R.string.delete_repeat_ask));
        this.mAlertDialog.setMessage(getString(R.string.delete_repeat_confirm, new Object[]{name}));
        DialogInterface.OnClickListener quitListener = new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.FormEntryActivity.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int i) {
                FormController formController2 = Collect.getInstance().getFormController();
                switch (i) {
                    case -2:
                        Collect.getInstance().getActivityLogger().logInstanceAction(this, "createDeleteRepeatConfirmDialog", "cancel");
                        return;
                    case -1:
                        Collect.getInstance().getActivityLogger().logInstanceAction(this, "createDeleteRepeatConfirmDialog", "OK");
                        formController2.deleteRepeat();
                        FormEntryActivity.this.showPreviousView();
                        return;
                    default:
                        return;
                }
            }
        };
        this.mAlertDialog.setCancelable(false);
        this.mAlertDialog.setButton(getString(R.string.discard_group), quitListener);
        this.mAlertDialog.setButton2(getString(R.string.delete_repeat_no), quitListener);
        this.mAlertDialog.show();
    }

    public boolean saveDataToDisk(boolean exit, boolean complete, String updatedSaveName) {
        if (!saveAnswersForCurrentScreen(complete)) {
            Toast.makeText(this, getString(R.string.data_saved_error), 0).show();
            return false;
        }
        this.mSaveToDiskTask = new SaveToDiskTask(getIntent().getData(), Boolean.valueOf(exit), Boolean.valueOf(complete), updatedSaveName);
        this.mSaveToDiskTask.setFormSavedListener(this);
        showDialog(2);
        this.mSaveToDiskTask.execute(new Void[0]);
        return true;
    }

    private void createQuitDialog() {
        String[] items;
        FormController formController = Collect.getInstance().getFormController();
        if (this.mAdminPreferences.getBoolean(AdminPreferencesActivity.KEY_SAVE_MID, true)) {
            String[] two = {getString(R.string.keep_changes), getString(R.string.do_not_save)};
            items = two;
        } else {
            String[] one = {getString(R.string.do_not_save)};
            items = one;
        }
        Collect.getInstance().getActivityLogger().logInstanceAction(this, "createQuitDialog", "show");
        this.mAlertDialog = new AlertDialog.Builder(this).setIcon(17301659).setTitle(getString(R.string.quit_application, new Object[]{formController.getFormTitle()})).setNeutralButton(getString(R.string.do_not_exit), new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.FormEntryActivity.8
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int id) {
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "createQuitDialog", "cancel");
                dialog.cancel();
            }
        }).setItems(items, new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.FormEntryActivity.7
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        if (FormEntryActivity.this.mAdminPreferences.getBoolean(AdminPreferencesActivity.KEY_SAVE_MID, true)) {
                            Collect.getInstance().getActivityLogger().logInstanceAction(this, "createQuitDialog", "saveAndExit");
                            FormEntryActivity.this.saveDataToDisk(true, FormEntryActivity.this.isInstanceComplete(false), null);
                            return;
                        }
                        Collect.getInstance().getActivityLogger().logInstanceAction(this, "createQuitDialog", "discardAndExit");
                        FormEntryActivity.this.removeTempInstance();
                        FormEntryActivity.this.finishReturnInstance();
                        return;
                    case 1:
                        Collect.getInstance().getActivityLogger().logInstanceAction(this, "createQuitDialog", "discardAndExit");
                        FormEntryActivity.this.removeTempInstance();
                        FormEntryActivity.this.finishReturnInstance();
                        return;
                    case 2:
                        Collect.getInstance().getActivityLogger().logInstanceAction(this, "createQuitDialog", "cancel");
                        return;
                    default:
                        return;
                }
            }
        }).create();
        this.mAlertDialog.show();
    }

    public void removeTempInstance() {
        FormController formController = Collect.getInstance().getFormController();
        File temp = SaveToDiskTask.savepointFile(formController.getInstancePath());
        if (temp.exists()) {
            temp.delete();
        }
        String[] selectionArgs = {formController.getInstancePath().getAbsolutePath()};
        Cursor c = null;
        try {
            c = getContentResolver().query(InstanceProviderAPI.InstanceColumns.CONTENT_URI, null, "instanceFilePath=?", selectionArgs, null);
            boolean erase = c.getCount() < 1;
            if (erase) {
                String instanceFolder = formController.getInstancePath().getParent();
                Log.i(t, "attempting to delete: " + instanceFolder);
                int images = MediaUtils.deleteImagesInFolderFromMediaProvider(formController.getInstancePath().getParentFile());
                int audio = MediaUtils.deleteAudioInFolderFromMediaProvider(formController.getInstancePath().getParentFile());
                int video = MediaUtils.deleteVideoInFolderFromMediaProvider(formController.getInstancePath().getParentFile());
                Log.i(t, "removed from content providers: " + images + " image files, " + audio + " audio files, and " + video + " video files.");
                File f = new File(instanceFolder);
                if (f.exists() && f.isDirectory()) {
                    File[] arr$ = f.listFiles();
                    for (File del : arr$) {
                        Log.i(t, "deleting file: " + del.getAbsolutePath());
                        del.delete();
                    }
                    f.delete();
                }
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }

    private void createClearDialog(final QuestionWidget qw) {
        Collect.getInstance().getActivityLogger().logInstanceAction(this, "createClearDialog", "show", qw.getPrompt().getIndex());
        this.mAlertDialog = new AlertDialog.Builder(this).create();
        this.mAlertDialog.setIcon(17301659);
        this.mAlertDialog.setTitle(getString(R.string.clear_answer_ask));
        String question = qw.getPrompt().getLongText();
        if (question.length() > 50) {
            question = question.substring(0, 50) + "...";
        }
        this.mAlertDialog.setMessage(getString(R.string.clearanswer_confirm, new Object[]{question}));
        DialogInterface.OnClickListener quitListener = new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.FormEntryActivity.9
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int i) {
                switch (i) {
                    case -2:
                        Collect.getInstance().getActivityLogger().logInstanceAction(this, "createClearDialog", "cancel", qw.getPrompt().getIndex());
                        return;
                    case -1:
                        Collect.getInstance().getActivityLogger().logInstanceAction(this, "createClearDialog", "clearAnswer", qw.getPrompt().getIndex());
                        FormEntryActivity.this.clearAnswer(qw);
                        FormEntryActivity.this.saveAnswersForCurrentScreen(false);
                        return;
                    default:
                        return;
                }
            }
        };
        this.mAlertDialog.setCancelable(false);
        this.mAlertDialog.setButton(getString(R.string.discard_answer), quitListener);
        this.mAlertDialog.setButton2(getString(R.string.clear_answer_no), quitListener);
        this.mAlertDialog.show();
    }

    private void createLanguageDialog() {
        Collect.getInstance().getActivityLogger().logInstanceAction(this, "createLanguageDialog", "show");
        FormController formController = Collect.getInstance().getFormController();
        final String[] languages = formController.getLanguages();
        int selected = -1;
        if (languages != null) {
            String language = formController.getLanguage();
            for (int i = 0; i < languages.length; i++) {
                if (language.equals(languages[i])) {
                    selected = i;
                }
            }
        }
        this.mAlertDialog = new AlertDialog.Builder(this).setSingleChoiceItems(languages, selected, new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.FormEntryActivity.11
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int whichButton) {
                FormController formController2 = Collect.getInstance().getFormController();
                ContentValues values = new ContentValues();
                values.put(FormsProviderAPI.FormsColumns.LANGUAGE, languages[whichButton]);
                String[] selectArgs = {FormEntryActivity.this.mFormPath};
                int updated = FormEntryActivity.this.getContentResolver().update(FormsProviderAPI.FormsColumns.CONTENT_URI, values, "formFilePath=?", selectArgs);
                Log.i(FormEntryActivity.t, "Updated language to: " + languages[whichButton] + " in " + updated + " rows");
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "createLanguageDialog", "changeLanguage." + languages[whichButton]);
                formController2.setLanguage(languages[whichButton]);
                dialog.dismiss();
                if (formController2.currentPromptIsQuestion()) {
                    FormEntryActivity.this.saveAnswersForCurrentScreen(false);
                }
                FormEntryActivity.this.refreshCurrentView();
            }
        }).setTitle(getString(R.string.change_language)).setNegativeButton(getString(R.string.do_not_change), new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.FormEntryActivity.10
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int whichButton) {
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "createLanguageDialog", "cancel");
            }
        }).create();
        this.mAlertDialog.show();
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case 1:
                Log.e(t, "Creating PROGRESS_DIALOG");
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "onCreateDialog.PROGRESS_DIALOG", "show");
                this.mProgressDialog = new ProgressDialog(this);
                DialogInterface.OnClickListener loadingButtonListener = new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.FormEntryActivity.12
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialog, int which) {
                        Collect.getInstance().getActivityLogger().logInstanceAction(this, "onCreateDialog.PROGRESS_DIALOG", "cancel");
                        dialog.dismiss();
                        FormEntryActivity.this.mFormLoaderTask.setFormLoaderListener(null);
                        FormLoaderTask t2 = FormEntryActivity.this.mFormLoaderTask;
                        FormEntryActivity.this.mFormLoaderTask = null;
                        t2.cancel(true);
                        t2.destroy();
                        FormEntryActivity.this.finish();
                    }
                };
                this.mProgressDialog.setIcon(17301659);
                this.mProgressDialog.setTitle(getString(R.string.loading_form));
                this.mProgressDialog.setMessage(getString(R.string.please_wait));
                this.mProgressDialog.setIndeterminate(true);
                this.mProgressDialog.setCancelable(false);
                this.mProgressDialog.setButton(getString(R.string.cancel_loading_form), loadingButtonListener);
                return this.mProgressDialog;
            case 2:
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "onCreateDialog.SAVING_DIALOG", "show");
                this.mProgressDialog = new ProgressDialog(this);
                DialogInterface.OnClickListener savingButtonListener = new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.FormEntryActivity.13
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialog, int which) {
                        Collect.getInstance().getActivityLogger().logInstanceAction(this, "onCreateDialog.SAVING_DIALOG", "cancel");
                        dialog.dismiss();
                        FormEntryActivity.this.mSaveToDiskTask.setFormSavedListener(null);
                        SaveToDiskTask t2 = FormEntryActivity.this.mSaveToDiskTask;
                        FormEntryActivity.this.mSaveToDiskTask = null;
                        t2.cancel(true);
                    }
                };
                this.mProgressDialog.setIcon(17301659);
                this.mProgressDialog.setTitle(getString(R.string.saving_form));
                this.mProgressDialog.setMessage(getString(R.string.please_wait));
                this.mProgressDialog.setIndeterminate(true);
                this.mProgressDialog.setCancelable(false);
                this.mProgressDialog.setButton(getString(R.string.cancel), savingButtonListener);
                this.mProgressDialog.setButton(getString(R.string.cancel_saving_form), savingButtonListener);
                return this.mProgressDialog;
            default:
                return null;
        }
    }

    private void dismissDialogs() {
        Log.e(t, "Dismiss dialogs");
        if (this.mAlertDialog != null && this.mAlertDialog.isShowing()) {
            this.mAlertDialog.dismiss();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        FormController formController = Collect.getInstance().getFormController();
        dismissDialogs();
        if ((this.mSaveToDiskTask == null || this.mSaveToDiskTask.getStatus() == AsyncTask.Status.FINISHED) && this.mCurrentView != null && formController != null && formController.currentPromptIsQuestion()) {
            saveAnswersForCurrentScreen(false);
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        FormController formController = Collect.getInstance().getFormController();
        Collect.getInstance().getActivityLogger().open();
        if (this.mFormLoaderTask != null) {
            this.mFormLoaderTask.setFormLoaderListener(this);
            if (formController == null && this.mFormLoaderTask.getStatus() == AsyncTask.Status.FINISHED) {
                FormController fec = this.mFormLoaderTask.getFormController();
                if (fec != null) {
                    loadingComplete(this.mFormLoaderTask);
                } else {
                    dismissDialog(1);
                    FormLoaderTask t2 = this.mFormLoaderTask;
                    this.mFormLoaderTask = null;
                    t2.cancel(true);
                    t2.destroy();
                    startActivity(new Intent(this, MainMenuActivity.class));
                }
            }
        } else {
            refreshCurrentView();
        }
        if (this.mSaveToDiskTask != null) {
            this.mSaveToDiskTask.setFormSavedListener(this);
        }
        if (this.mErrorMessage != null && this.mAlertDialog != null && !this.mAlertDialog.isShowing()) {
            createErrorDialog(this.mErrorMessage, true);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case 4:
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "onKeyDown.KEYCODE_BACK", "quit");
                createQuitDialog();
                return true;
            case 21:
                if (event.isAltPressed() && !this.mBeenSwiped) {
                    this.mBeenSwiped = true;
                    Collect.getInstance().getActivityLogger().logInstanceAction(this, "onKeyDown.KEYCODE_DPAD_LEFT", "showPrevious");
                    showPreviousView();
                    return true;
                }
                break;
            case 22:
                if (event.isAltPressed() && !this.mBeenSwiped) {
                    this.mBeenSwiped = true;
                    Collect.getInstance().getActivityLogger().logInstanceAction(this, "onKeyDown.KEYCODE_DPAD_RIGHT", "showNext");
                    showNextView();
                    return true;
                }
                break;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (this.mFormLoaderTask != null) {
            this.mFormLoaderTask.setFormLoaderListener(null);
            if (this.mFormLoaderTask.getStatus() == AsyncTask.Status.FINISHED) {
                FormLoaderTask t2 = this.mFormLoaderTask;
                this.mFormLoaderTask = null;
                t2.cancel(true);
                t2.destroy();
            }
        }
        if (this.mSaveToDiskTask != null) {
            this.mSaveToDiskTask.setFormSavedListener(null);
            if (this.mSaveToDiskTask.getStatus() == AsyncTask.Status.FINISHED) {
                this.mSaveToDiskTask.cancel(true);
                this.mSaveToDiskTask = null;
            }
        }
        super.onDestroy();
    }

    private void afterAllAnimations() {
        Log.i(t, "afterAllAnimations");
        if (this.mStaleView != null) {
            if (this.mStaleView instanceof ODKView) {
                ((ODKView) this.mStaleView).recycleDrawables();
            }
            this.mStaleView = null;
        }
        if (this.mCurrentView instanceof ODKView) {
            ((ODKView) this.mCurrentView).setFocus(this);
        }
        this.mBeenSwiped = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        String str;
        StringBuilder append = new StringBuilder().append("onAnimationEnd ");
        if (animation == this.mInAnimation) {
            str = "in";
        } else {
            str = animation == this.mOutAnimation ? "out" : "other";
        }
        Log.i(t, append.append(str).toString());
        if (this.mInAnimation == animation) {
            this.mAnimationCompletionSet |= 1;
        } else if (this.mOutAnimation == animation) {
            this.mAnimationCompletionSet |= 2;
        } else {
            Log.e(t, "Unexpected animation");
        }
        if (this.mAnimationCompletionSet == 3) {
            afterAllAnimations();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        String str;
        StringBuilder append = new StringBuilder().append("onAnimationRepeat ");
        if (animation == this.mInAnimation) {
            str = "in";
        } else {
            str = animation == this.mOutAnimation ? "out" : "other";
        }
        Log.i(t, append.append(str).toString());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        String str;
        StringBuilder append = new StringBuilder().append("onAnimationStart ");
        if (animation == this.mInAnimation) {
            str = "in";
        } else {
            str = animation == this.mOutAnimation ? "out" : "other";
        }
        Log.i(t, append.append(str).toString());
    }

    @Override // org.odk.collect.android.listeners.FormLoaderListener
    public void loadingComplete(FormLoaderTask task) {
        dismissDialog(1);
        FormController formController = task.getFormController();
        boolean pendingActivityResult = task.hasPendingActivityResult();
        boolean hasUsedSavepoint = task.hasUsedSavepoint();
        int requestCode = task.getRequestCode();
        int resultCode = task.getResultCode();
        Intent intent = task.getIntent();
        this.mFormLoaderTask.setFormLoaderListener(null);
        FormLoaderTask t2 = this.mFormLoaderTask;
        this.mFormLoaderTask = null;
        t2.cancel(true);
        t2.destroy();
        Collect.getInstance().setFormController(formController);
        String[] languageTest = formController.getLanguages();
        if (languageTest != null) {
            String defaultLanguage = formController.getLanguage();
            String newLanguage = "";
            String[] selectArgs = {this.mFormPath};
            Cursor c = null;
            try {
                c = getContentResolver().query(FormsProviderAPI.FormsColumns.CONTENT_URI, null, "formFilePath=?", selectArgs, null);
                if (c.getCount() == 1) {
                    c.moveToFirst();
                    newLanguage = c.getString(c.getColumnIndex(FormsProviderAPI.FormsColumns.LANGUAGE));
                }
                try {
                    formController.setLanguage(newLanguage);
                } catch (Exception e) {
                    formController.setLanguage(defaultLanguage);
                }
            } finally {
                if (c != null) {
                    c.close();
                }
            }
        }
        if (pendingActivityResult) {
            refreshCurrentView();
            onActivityResult(requestCode, resultCode, intent);
            return;
        }
        if (hasUsedSavepoint) {
            runOnUiThread(new Runnable() { // from class: org.odk.collect.android.activities.FormEntryActivity.14
                @Override // java.lang.Runnable
                public void run() {
                    Toast.makeText(FormEntryActivity.this, FormEntryActivity.this.getString(R.string.savepoint_used), 1).show();
                }
            });
        }
        if (formController.getInstancePath() == null) {
            String time = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss", Locale.ENGLISH).format(Calendar.getInstance().getTime());
            String file = this.mFormPath.substring(this.mFormPath.lastIndexOf(47) + 1, this.mFormPath.lastIndexOf(46));
            String path = Collect.INSTANCES_PATH + File.separator + file + "_" + time;
            if (FileUtils.createFolder(path)) {
                formController.setInstancePath(new File(path + File.separator + file + "_" + time + ".xml"));
            }
        } else {
            Intent reqIntent = getIntent();
            boolean showFirst = reqIntent.getBooleanExtra("start", false);
            if (!showFirst) {
                Intent i = new Intent(this, FormHierarchyActivity.class);
                startActivity(i);
                return;
            }
        }
        refreshCurrentView();
    }

    @Override // org.odk.collect.android.listeners.FormLoaderListener
    public void loadingError(String errorMsg) {
        dismissDialog(1);
        if (errorMsg != null) {
            createErrorDialog(errorMsg, true);
        } else {
            createErrorDialog(getString(R.string.parse_error), true);
        }
    }

    @Override // org.odk.collect.android.listeners.FormSavedListener
    public void savingComplete(int saveStatus) {
        dismissDialog(2);
        switch (saveStatus) {
            case 1:
            case 2:
                refreshCurrentView();
                next();
                return;
            case 500:
                Toast.makeText(this, getString(R.string.data_saved_ok), 0).show();
                return;
            case 501:
                Toast.makeText(this, getString(R.string.data_saved_error), 1).show();
                return;
            case 504:
                Toast.makeText(this, getString(R.string.data_saved_ok), 0).show();
                finishReturnInstance();
                return;
            default:
                return;
        }
    }

    public int saveAnswer(IAnswerData answer, FormIndex index, boolean evaluateConstraints) {
        FormController formController = Collect.getInstance().getFormController();
        if (evaluateConstraints) {
            return formController.answerQuestion(index, answer);
        }
        formController.saveAnswer(index, answer);
        return 0;
    }

    public boolean isInstanceComplete(boolean end) {
        FormController formController = Collect.getInstance().getFormController();
        boolean complete = false;
        if (end) {
            SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
            complete = sharedPreferences.getBoolean(PreferencesActivity.KEY_COMPLETED_DEFAULT, true);
        }
        String[] selectionArgs = {formController.getInstancePath().getAbsolutePath()};
        Cursor c = null;
        try {
            c = getContentResolver().query(InstanceProviderAPI.InstanceColumns.CONTENT_URI, null, "instanceFilePath=?", selectionArgs, null);
            if (c != null && c.getCount() > 0) {
                c.moveToFirst();
                String status = c.getString(c.getColumnIndex(InstanceProviderAPI.InstanceColumns.STATUS));
                if (InstanceProviderAPI.STATUS_COMPLETE.compareTo(status) == 0) {
                    complete = true;
                }
            }
            return complete;
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }

    public void next() {
        if (!this.mBeenSwiped) {
            this.mBeenSwiped = true;
            showNextView();
        }
    }

    public void finishReturnInstance() {
        FormController formController = Collect.getInstance().getFormController();
        String action = getIntent().getAction();
        if ("android.intent.action.PICK".equals(action) || "android.intent.action.EDIT".equals(action)) {
            String[] selectionArgs = {formController.getInstancePath().getAbsolutePath()};
            Cursor c = null;
            try {
                c = getContentResolver().query(InstanceProviderAPI.InstanceColumns.CONTENT_URI, null, "instanceFilePath=?", selectionArgs, null);
                if (c.getCount() > 0) {
                    c.moveToFirst();
                    String id = c.getString(c.getColumnIndex("_id"));
                    Uri instance = Uri.withAppendedPath(InstanceProviderAPI.InstanceColumns.CONTENT_URI, id);
                    setResult(-1, new Intent().setData(instance));
                }
            } finally {
                if (c != null) {
                    c.close();
                }
            }
        }
        finish();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int xPixelLimit = (int) (dm.xdpi * 0.25d);
        int yPixelLimit = (int) (dm.ydpi * 0.25d);
        if ((!(this.mCurrentView instanceof ODKView) || !((ODKView) this.mCurrentView).suppressFlingGesture(e1, e2, velocityX, velocityY)) && !this.mBeenSwiped) {
            if ((Math.abs(e1.getX() - e2.getX()) <= xPixelLimit || Math.abs(e1.getY() - e2.getY()) >= yPixelLimit) && Math.abs(e1.getX() - e2.getX()) <= xPixelLimit * 2) {
                return false;
            }
            this.mBeenSwiped = true;
            if (velocityX > 0.0f) {
                if (e1.getX() > e2.getX()) {
                    Log.e(t, "showNextView VelocityX is bogus! " + e1.getX() + " > " + e2.getX());
                    Collect.getInstance().getActivityLogger().logInstanceAction(this, "onFling", "showNext");
                    showNextView();
                } else {
                    Collect.getInstance().getActivityLogger().logInstanceAction(this, "onFling", "showPrevious");
                    showPreviousView();
                }
            } else if (e1.getX() < e2.getX()) {
                Log.e(t, "showPreviousView VelocityX is bogus! " + e1.getX() + " < " + e2.getX());
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "onFling", "showPrevious");
                showPreviousView();
            } else {
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "onFling", "showNext");
                showNextView();
            }
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent e) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        this.mCurrentView.cancelLongPress();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent e) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override // org.odk.collect.android.listeners.AdvanceToNextListener
    public void advance() {
        next();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        Collect.getInstance().getActivityLogger().logOnStart(this);
    }

    @Override // android.app.Activity
    protected void onStop() {
        Collect.getInstance().getActivityLogger().logOnStop(this);
        super.onStop();
    }
}
