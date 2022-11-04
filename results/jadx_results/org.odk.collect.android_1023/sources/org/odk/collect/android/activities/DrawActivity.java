package org.odk.collect.android.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.utilities.ColorPickerDialog;
import org.odk.collect.android.utilities.FileUtils;
/* loaded from: classes.dex */
public class DrawActivity extends Activity {
    public static final String EXTRA_OUTPUT = "output";
    public static final String OPTION = "option";
    public static final String OPTION_ANNOTATE = "annotate";
    public static final String OPTION_DRAW = "draw";
    public static final String OPTION_SIGNATURE = "signature";
    public static final String REF_IMAGE = "refImage";
    public static final String SAVEPOINT_IMAGE = "savepointImage";
    public static final String t = "DrawActivity";
    private AlertDialog alertDialog;
    private String alertTitleString;
    private Button btnCancel;
    private Button btnDrawColor;
    private Button btnFinished;
    private Button btnReset;
    private DrawView drawView;
    private Paint paint;
    private Paint pointPaint;
    private String loadOption = null;
    private File refImage = null;
    private File output = null;
    private File savepointImage = null;
    private int currentColor = -16777216;

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        try {
            saveFile(this.savepointImage);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (this.savepointImage.exists()) {
            outState.putString(SAVEPOINT_IMAGE, this.savepointImage.getAbsolutePath());
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            this.loadOption = OPTION_DRAW;
            this.refImage = null;
            this.savepointImage = new File(Collect.TMPDRAWFILE_PATH);
            this.savepointImage.delete();
            this.output = new File(Collect.TMPFILE_PATH);
        } else {
            this.loadOption = extras.getString(OPTION);
            if (this.loadOption == null) {
                this.loadOption = OPTION_DRAW;
            }
            Uri uri = (Uri) extras.get(REF_IMAGE);
            if (uri != null) {
                this.refImage = new File(uri.getPath());
            }
            String savepoint = extras.getString(SAVEPOINT_IMAGE);
            if (savepoint != null) {
                this.savepointImage = new File(savepoint);
                if (!this.savepointImage.exists() && this.refImage != null && this.refImage.exists()) {
                    FileUtils.copyFile(this.refImage, this.savepointImage);
                }
            } else {
                this.savepointImage = new File(Collect.TMPDRAWFILE_PATH);
                this.savepointImage.delete();
                if (this.refImage != null && this.refImage.exists()) {
                    FileUtils.copyFile(this.refImage, this.savepointImage);
                }
            }
            Uri uri2 = (Uri) extras.get(EXTRA_OUTPUT);
            if (uri2 != null) {
                this.output = new File(uri2.getPath());
            } else {
                this.output = new File(Collect.TMPFILE_PATH);
            }
        }
        if (OPTION_SIGNATURE.equals(this.loadOption)) {
            setRequestedOrientation(0);
            this.alertTitleString = getString(R.string.quit_application, new Object[]{getString(R.string.sign_button)});
        } else if (OPTION_ANNOTATE.equals(this.loadOption)) {
            this.alertTitleString = getString(R.string.quit_application, new Object[]{getString(R.string.markup_image)});
        } else {
            this.alertTitleString = getString(R.string.quit_application, new Object[]{getString(R.string.draw_image)});
        }
        setTitle(getString(R.string.app_name) + " > " + getString(R.string.draw_image));
        LayoutInflater inflater = (LayoutInflater) getSystemService("layout_inflater");
        RelativeLayout v = (RelativeLayout) inflater.inflate(R.layout.draw_layout, (ViewGroup) null);
        LinearLayout ll = (LinearLayout) v.findViewById(R.id.drawViewLayout);
        this.drawView = new DrawView(this, this, OPTION_SIGNATURE.equals(this.loadOption), this.savepointImage);
        ll.addView(this.drawView);
        setContentView(v);
        this.paint = new Paint();
        this.paint.setAntiAlias(true);
        this.paint.setDither(true);
        this.paint.setColor(this.currentColor);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeJoin(Paint.Join.ROUND);
        this.paint.setStrokeWidth(10.0f);
        this.pointPaint = new Paint();
        this.pointPaint.setAntiAlias(true);
        this.pointPaint.setDither(true);
        this.pointPaint.setColor(this.currentColor);
        this.pointPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.pointPaint.setStrokeWidth(10.0f);
        this.btnDrawColor = (Button) findViewById(R.id.btnSelectColor);
        this.btnDrawColor.setTextColor(getInverseColor(this.currentColor));
        this.btnDrawColor.getBackground().setColorFilter(this.currentColor, PorterDuff.Mode.SRC_ATOP);
        this.btnDrawColor.setText(getString(R.string.set_color));
        this.btnDrawColor.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.DrawActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v2) {
                Collect.getInstance().getActivityLogger().logInstanceAction(DrawActivity.this, "setColorButton", "click", Collect.getInstance().getFormController().getFormIndex());
                ColorPickerDialog cpd = new ColorPickerDialog(DrawActivity.this, new ColorPickerDialog.OnColorChangedListener() { // from class: org.odk.collect.android.activities.DrawActivity.1.1
                    @Override // org.odk.collect.android.utilities.ColorPickerDialog.OnColorChangedListener
                    public void colorChanged(String key, int color) {
                        DrawActivity.this.btnDrawColor.setTextColor(DrawActivity.this.getInverseColor(color));
                        DrawActivity.this.btnDrawColor.getBackground().setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
                        DrawActivity.this.currentColor = color;
                        DrawActivity.this.paint.setColor(color);
                        DrawActivity.this.pointPaint.setColor(color);
                    }
                }, "key", DrawActivity.this.currentColor, DrawActivity.this.currentColor, DrawActivity.this.getString(R.string.select_drawing_color));
                cpd.show();
            }
        });
        this.btnFinished = (Button) findViewById(R.id.btnFinishDraw);
        this.btnFinished.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.DrawActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v2) {
                Collect.getInstance().getActivityLogger().logInstanceAction(DrawActivity.this, "saveAndCloseButton", "click", Collect.getInstance().getFormController().getFormIndex());
                DrawActivity.this.SaveAndClose();
            }
        });
        this.btnReset = (Button) findViewById(R.id.btnResetDraw);
        this.btnReset.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.DrawActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View v2) {
                Collect.getInstance().getActivityLogger().logInstanceAction(DrawActivity.this, "resetButton", "click", Collect.getInstance().getFormController().getFormIndex());
                DrawActivity.this.Reset();
            }
        });
        this.btnCancel = (Button) findViewById(R.id.btnCancelDraw);
        this.btnCancel.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.DrawActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View v2) {
                Collect.getInstance().getActivityLogger().logInstanceAction(DrawActivity.this, "cancelAndCloseButton", "click", Collect.getInstance().getFormController().getFormIndex());
                DrawActivity.this.CancelAndClose();
            }
        });
    }

    public int getInverseColor(int color) {
        int red = Color.red(color);
        int green = Color.green(color);
        int blue = Color.blue(color);
        int alpha = Color.alpha(color);
        return Color.argb(alpha, 255 - red, 255 - green, 255 - blue);
    }

    public void SaveAndClose() {
        try {
            saveFile(this.output);
            setResult(-1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            setResult(0);
        }
        finish();
    }

    private void saveFile(File f) throws FileNotFoundException {
        if (this.drawView.getWidth() == 0 || this.drawView.getHeight() == 0) {
            Log.e(t, "view has zero width or zero height");
            return;
        }
        FileOutputStream fos = new FileOutputStream(f);
        Bitmap bitmap = Bitmap.createBitmap(this.drawView.getWidth(), this.drawView.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        this.drawView.draw(canvas);
        bitmap.compress(Bitmap.CompressFormat.JPEG, 70, fos);
        if (fos != null) {
            try {
                fos.flush();
                fos.close();
            } catch (Exception e) {
            }
        }
    }

    public void Reset() {
        this.savepointImage.delete();
        if (!OPTION_SIGNATURE.equals(this.loadOption) && this.refImage != null && this.refImage.exists()) {
            FileUtils.copyFile(this.refImage, this.savepointImage);
        }
        this.drawView.reset();
        this.drawView.invalidate();
    }

    public void CancelAndClose() {
        setResult(0);
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case 4:
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "onKeyDown.KEYCODE_BACK", "quit");
                createQuitDrawDialog();
                return true;
            case 21:
                if (event.isAltPressed()) {
                    Collect.getInstance().getActivityLogger().logInstanceAction(this, "onKeyDown.KEYCODE_DPAD_LEFT", "showPrevious");
                    createQuitDrawDialog();
                    return true;
                }
                break;
            case 22:
                if (event.isAltPressed()) {
                    Collect.getInstance().getActivityLogger().logInstanceAction(this, "onKeyDown.KEYCODE_DPAD_RIGHT", "showNext");
                    createQuitDrawDialog();
                    return true;
                }
                break;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void createQuitDrawDialog() {
        String[] items = {getString(R.string.keep_changes), getString(R.string.do_not_save)};
        Collect.getInstance().getActivityLogger().logInstanceAction(this, "createQuitDrawDialog", "show");
        this.alertDialog = new AlertDialog.Builder(this).setIcon(17301659).setTitle(this.alertTitleString).setNeutralButton(getString(R.string.do_not_exit), new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.DrawActivity.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int id) {
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "createQuitDrawDialog", "cancel");
                dialog.cancel();
            }
        }).setItems(items, new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.DrawActivity.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        Collect.getInstance().getActivityLogger().logInstanceAction(this, "createQuitDrawDialog", "saveAndExit");
                        DrawActivity.this.SaveAndClose();
                        return;
                    case 1:
                        Collect.getInstance().getActivityLogger().logInstanceAction(this, "createQuitDrawDialog", "discardAndExit");
                        DrawActivity.this.CancelAndClose();
                        return;
                    case 2:
                        Collect.getInstance().getActivityLogger().logInstanceAction(this, "createQuitDrawDialog", "cancel");
                        return;
                    default:
                        return;
                }
            }
        }).create();
        this.alertDialog.show();
    }

    /* loaded from: classes.dex */
    public class DrawView extends View {
        private boolean isSignature;
        private File mBackgroundBitmapFile;
        private Bitmap mBitmap;
        private Paint mBitmapPaint;
        private Canvas mCanvas;
        private Path mCurrentPath;
        private float mX;
        private float mY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DrawView(Context c) {
            super(c);
            DrawActivity.this = r3;
            this.isSignature = false;
            this.mBitmapPaint = new Paint(4);
            this.mCurrentPath = new Path();
            setBackgroundColor(-1);
            this.mBackgroundBitmapFile = new File(Collect.TMPDRAWFILE_PATH);
        }

        public DrawView(DrawActivity drawActivity, Context c, boolean isSignature, File f) {
            this(c);
            this.isSignature = isSignature;
            this.mBackgroundBitmapFile = f;
        }

        public void reset() {
            Display display = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
            int screenWidth = display.getWidth();
            int screenHeight = display.getHeight();
            resetImage(screenWidth, screenHeight);
        }

        public void resetImage(int w, int h) {
            if (this.mBackgroundBitmapFile.exists()) {
                this.mBitmap = FileUtils.getBitmapScaledToDisplay(this.mBackgroundBitmapFile, w, h).copy(Bitmap.Config.ARGB_8888, true);
                this.mCanvas = new Canvas(this.mBitmap);
                return;
            }
            this.mBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
            this.mCanvas = new Canvas(this.mBitmap);
            this.mCanvas.drawColor(-1);
            if (this.isSignature) {
                drawSignLine();
            }
        }

        @Override // android.view.View
        protected void onSizeChanged(int w, int h, int oldw, int oldh) {
            super.onSizeChanged(w, h, oldw, oldh);
            resetImage(w, h);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            canvas.drawColor(-5592406);
            canvas.drawBitmap(this.mBitmap, 0.0f, 0.0f, this.mBitmapPaint);
            canvas.drawPath(this.mCurrentPath, DrawActivity.this.paint);
        }

        private void touch_start(float x, float y) {
            this.mCurrentPath.reset();
            this.mCurrentPath.moveTo(x, y);
            this.mX = x;
            this.mY = y;
        }

        public void drawSignLine() {
            this.mCanvas.drawLine(0.0f, (int) (this.mCanvas.getHeight() * 0.7d), this.mCanvas.getWidth(), (int) (this.mCanvas.getHeight() * 0.7d), DrawActivity.this.paint);
        }

        private void touch_move(float x, float y) {
            this.mCurrentPath.quadTo(this.mX, this.mY, (this.mX + x) / 2.0f, (this.mY + y) / 2.0f);
            this.mX = x;
            this.mY = y;
        }

        private void touch_up() {
            if (this.mCurrentPath.isEmpty()) {
                this.mCanvas.drawPoint(this.mX, this.mY, DrawActivity.this.pointPaint);
            } else {
                this.mCurrentPath.lineTo(this.mX, this.mY);
                this.mCanvas.drawPath(this.mCurrentPath, DrawActivity.this.paint);
            }
            this.mCurrentPath.reset();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent event) {
            float x = event.getX();
            float y = event.getY();
            switch (event.getAction()) {
                case 0:
                    touch_start(x, y);
                    invalidate();
                    return true;
                case 1:
                    touch_up();
                    invalidate();
                    return true;
                case 2:
                    touch_move(x, y);
                    invalidate();
                    return true;
                default:
                    return true;
            }
        }
    }
}
