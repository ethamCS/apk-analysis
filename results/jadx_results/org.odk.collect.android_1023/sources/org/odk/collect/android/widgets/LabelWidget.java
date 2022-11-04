package org.odk.collect.android.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.io.File;
import java.util.Vector;
import org.javarosa.core.model.SelectChoice;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.reference.InvalidReferenceException;
import org.javarosa.core.reference.ReferenceManager;
import org.javarosa.form.api.FormEntryCaption;
import org.javarosa.form.api.FormEntryPrompt;
import org.odk.collect.android.R;
import org.odk.collect.android.utilities.FileUtils;
/* loaded from: classes.dex */
public class LabelWidget extends QuestionWidget {
    private static final String t = "LabelWidget";
    LinearLayout buttonLayout;
    private TextView label;
    private ImageView mImageView;
    Vector<SelectChoice> mItems;
    private TextView mMissingImage;
    private TextView mQuestionText;
    LinearLayout questionLayout;

    public LabelWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt);
        this.mItems = prompt.getSelectChoices();
        this.mPrompt = prompt;
        this.buttonLayout = new LinearLayout(context);
        if (this.mItems != null) {
            for (int i = 0; i < this.mItems.size(); i++) {
                String imageURI = prompt.getSpecialFormSelectChoiceText(this.mItems.get(i), FormEntryCaption.TEXT_FORM_IMAGE);
                this.mImageView = null;
                this.mMissingImage = null;
                int labelId = QuestionWidget.newUniqueId();
                String errorMsg = null;
                if (imageURI != null) {
                    try {
                        String imageFilename = ReferenceManager._().DeriveReference(imageURI).getLocalURI();
                        File imageFile = new File(imageFilename);
                        if (imageFile.exists()) {
                            Bitmap b = null;
                            try {
                                Display display = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
                                int screenWidth = display.getWidth();
                                int screenHeight = display.getHeight();
                                b = FileUtils.getBitmapScaledToDisplay(imageFile, screenHeight, screenWidth);
                            } catch (OutOfMemoryError e) {
                                errorMsg = "ERROR: " + e.getMessage();
                            }
                            if (b != null) {
                                this.mImageView = new ImageView(getContext());
                                this.mImageView.setPadding(2, 2, 2, 2);
                                this.mImageView.setAdjustViewBounds(true);
                                this.mImageView.setImageBitmap(b);
                                this.mImageView.setId(labelId);
                            } else if (errorMsg == null) {
                                errorMsg = getContext().getString(R.string.file_invalid, imageFile);
                            }
                        } else if (0 == 0) {
                            errorMsg = getContext().getString(R.string.file_missing, imageFile);
                        }
                        if (errorMsg != null) {
                            Log.e(t, errorMsg);
                            this.mMissingImage = new TextView(getContext());
                            this.mMissingImage.setText(errorMsg);
                            this.mMissingImage.setPadding(2, 2, 2, 2);
                            this.mMissingImage.setId(labelId);
                        }
                    } catch (InvalidReferenceException e2) {
                        Log.e(t, "image invalid reference exception");
                        e2.printStackTrace();
                    }
                }
                this.label = new TextView(getContext());
                this.label.setText(prompt.getSelectChoiceText(this.mItems.get(i)));
                this.label.setTextSize(1, this.mQuestionFontsize);
                this.label.setGravity(1);
                RelativeLayout answer = new RelativeLayout(getContext());
                RelativeLayout.LayoutParams headerParams = new RelativeLayout.LayoutParams(-2, -2);
                headerParams.addRule(10);
                headerParams.addRule(14);
                if (this.mImageView != null) {
                    this.mImageView.setScaleType(ImageView.ScaleType.CENTER);
                    answer.addView(this.mImageView, headerParams);
                } else if (this.mMissingImage != null) {
                    answer.addView(this.mMissingImage, headerParams);
                } else {
                    this.label.setId(labelId);
                    answer.addView(this.label, headerParams);
                }
                answer.setPadding(4, 0, 4, 0);
                LinearLayout.LayoutParams answerParams = new LinearLayout.LayoutParams(-1, -2);
                answerParams.weight = 1.0f;
                this.buttonLayout.addView(answer, answerParams);
            }
        }
        this.buttonLayout.setOrientation(0);
        LinearLayout.LayoutParams buttonParams = new LinearLayout.LayoutParams(-1, -2);
        buttonParams.weight = 1.0f;
        this.questionLayout.addView(this.buttonLayout, buttonParams);
        addView(this.questionLayout);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void clearAnswer() {
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
        return null;
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void setFocus(Context context) {
        InputMethodManager inputManager = (InputMethodManager) context.getSystemService("input_method");
        inputManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    protected void addQuestionText(FormEntryPrompt p) {
        this.mQuestionText = new TextView(getContext());
        this.mQuestionText.setText(p.getLongText());
        this.mQuestionText.setTextSize(1, this.mQuestionFontsize);
        this.mQuestionText.setTypeface(null, 1);
        this.mQuestionText.setPadding(0, 0, 0, 7);
        this.mQuestionText.setId(QuestionWidget.newUniqueId());
        this.mQuestionText.setHorizontallyScrolling(false);
        if (p.getLongText() == null) {
            this.mQuestionText.setVisibility(8);
        }
        LinearLayout.LayoutParams labelParams = new LinearLayout.LayoutParams(-1, -2);
        labelParams.weight = 1.0f;
        this.questionLayout = new LinearLayout(getContext());
        this.questionLayout.setOrientation(0);
        this.questionLayout.addView(this.mQuestionText, labelParams);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        this.mQuestionText.cancelLongPress();
        if (this.mMissingImage != null) {
            this.mMissingImage.cancelLongPress();
        }
        if (this.mImageView != null) {
            this.mImageView.cancelLongPress();
        }
        if (this.label != null) {
            this.label.cancelLongPress();
        }
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l) {
        this.mQuestionText.setOnLongClickListener(l);
        if (this.mMissingImage != null) {
            this.mMissingImage.setOnLongClickListener(l);
        }
        if (this.mImageView != null) {
            this.mImageView.setOnLongClickListener(l);
        }
        if (this.label != null) {
            this.label.setOnLongClickListener(l);
        }
    }
}
