package org.odk.collect.android.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.form.api.FormEntryCaption;
import org.javarosa.form.api.FormEntryPrompt;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.views.MediaLayout;
/* loaded from: classes.dex */
public abstract class QuestionWidget extends LinearLayout {
    private static int idGenerator = 1211322;
    private static final String t = "QuestionWidget";
    private TextView mHelpText;
    protected FormEntryPrompt mPrompt;
    private TextView mQuestionText;
    private MediaLayout mediaLayout;
    protected final int mQuestionFontsize = Collect.getQuestionFontsize();
    protected final int mAnswerFontsize = this.mQuestionFontsize + 2;
    private LinearLayout.LayoutParams mLayout = new LinearLayout.LayoutParams(-1, -2);

    public abstract void clearAnswer();

    public abstract IAnswerData getAnswer();

    public abstract void setFocus(Context context);

    @Override // android.view.View
    public abstract void setOnLongClickListener(View.OnLongClickListener onLongClickListener);

    public static int newUniqueId() {
        int i = idGenerator + 1;
        idGenerator = i;
        return i;
    }

    public QuestionWidget(Context context, FormEntryPrompt p) {
        super(context);
        this.mPrompt = p;
        setOrientation(1);
        setGravity(48);
        setPadding(0, 7, 0, 0);
        this.mLayout.setMargins(10, 0, 10, 0);
        addQuestionText(p);
        addHelpText(p);
    }

    public void playAudio() {
        this.mediaLayout.playAudio();
    }

    public void playVideo() {
        this.mediaLayout.playVideo();
    }

    public FormEntryPrompt getPrompt() {
        return this.mPrompt;
    }

    private void recycleDrawablesRecursive(ViewGroup viewGroup, List<ImageView> images) {
        int childCount = viewGroup.getChildCount();
        for (int index = 0; index < childCount; index++) {
            View child = viewGroup.getChildAt(index);
            if (child instanceof ImageView) {
                images.add((ImageView) child);
            } else if (child instanceof ViewGroup) {
                recycleDrawablesRecursive((ViewGroup) child, images);
            }
        }
        viewGroup.destroyDrawingCache();
    }

    public void recycleDrawables() {
        List<ImageView> images = new ArrayList<>();
        recycleDrawablesRecursive(this, images);
        for (ImageView imageView : images) {
            imageView.destroyDrawingCache();
            Drawable d = imageView.getDrawable();
            if (d != null && (d instanceof BitmapDrawable)) {
                imageView.setImageDrawable(null);
                BitmapDrawable bd = (BitmapDrawable) d;
                Bitmap bmp = bd.getBitmap();
                if (bmp != null) {
                    bmp.recycle();
                }
            }
        }
    }

    public boolean suppressFlingGesture(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }

    protected void addQuestionText(FormEntryPrompt p) {
        String imageURI = p.getImageText();
        String audioURI = p.getAudioText();
        String videoURI = p.getSpecialFormQuestionText(FormEntryCaption.TEXT_FORM_VIDEO);
        String bigImageURI = p.getSpecialFormQuestionText("big-image");
        this.mQuestionText = new TextView(getContext());
        this.mQuestionText.setText(p.getLongText());
        this.mQuestionText.setTextSize(1, this.mQuestionFontsize);
        this.mQuestionText.setTypeface(null, 1);
        this.mQuestionText.setPadding(0, 0, 0, 7);
        this.mQuestionText.setId(newUniqueId());
        this.mQuestionText.setHorizontallyScrolling(false);
        if (p.getLongText() == null) {
            this.mQuestionText.setVisibility(8);
        }
        this.mediaLayout = new MediaLayout(getContext());
        this.mediaLayout.setAVT(p.getIndex(), "", this.mQuestionText, audioURI, imageURI, videoURI, bigImageURI);
        addView(this.mediaLayout, this.mLayout);
    }

    private void addHelpText(FormEntryPrompt p) {
        String s = p.getHelpText();
        if (s != null && !s.equals("")) {
            this.mHelpText = new TextView(getContext());
            this.mHelpText.setTextSize(1, this.mQuestionFontsize - 3);
            this.mHelpText.setPadding(0, -5, 0, 7);
            this.mHelpText.setHorizontallyScrolling(false);
            this.mHelpText.setText(s);
            this.mHelpText.setTypeface(null, 2);
            addView(this.mHelpText, this.mLayout);
        }
    }

    @Override // android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        if (this.mQuestionText != null) {
            this.mQuestionText.cancelLongPress();
        }
        if (this.mHelpText != null) {
            this.mHelpText.cancelLongPress();
        }
    }
}
