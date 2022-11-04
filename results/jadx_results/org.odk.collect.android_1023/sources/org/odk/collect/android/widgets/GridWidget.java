package org.odk.collect.android.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import java.io.File;
import java.util.Vector;
import org.javarosa.core.model.SelectChoice;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.SelectOneData;
import org.javarosa.core.model.data.helper.Selection;
import org.javarosa.core.reference.InvalidReferenceException;
import org.javarosa.core.reference.ReferenceManager;
import org.javarosa.form.api.FormEntryCaption;
import org.javarosa.form.api.FormEntryPrompt;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.listeners.AdvanceToNextListener;
import org.odk.collect.android.utilities.FileUtils;
import org.odk.collect.android.views.AudioButton;
/* loaded from: classes.dex */
public class GridWidget extends QuestionWidget {
    public static final int orangeBlueVal = 0;
    public static final int orangeGreenVal = 140;
    public static final int orangeRedVal = 255;
    AudioButton.AudioHandler[] audioHandlers;
    String[] choices;
    GridView gridview;
    ImageView[] imageViews;
    AdvanceToNextListener listener;
    Vector<SelectChoice> mItems;
    int maxColumnWidth;
    int numColumns;
    boolean quickAdvance;
    boolean[] selected;

    public GridWidget(Context context, FormEntryPrompt prompt, int numColumns, final boolean quickAdvance) {
        super(context, prompt);
        this.mItems = prompt.getSelectChoices();
        this.mPrompt = prompt;
        this.listener = (AdvanceToNextListener) context;
        this.selected = new boolean[this.mItems.size()];
        this.choices = new String[this.mItems.size()];
        this.gridview = new GridView(context);
        this.imageViews = new ImageView[this.mItems.size()];
        this.audioHandlers = new AudioButton.AudioHandler[this.mItems.size()];
        this.maxColumnWidth = -1;
        this.numColumns = numColumns;
        for (int i = 0; i < this.mItems.size(); i++) {
            this.imageViews[i] = new ImageView(getContext());
        }
        this.quickAdvance = quickAdvance;
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            SelectChoice sc = this.mItems.get(i2);
            String audioURI = prompt.getSpecialFormSelectChoiceText(sc, FormEntryCaption.TEXT_FORM_AUDIO);
            if (audioURI != null) {
                this.audioHandlers[i2] = new AudioButton.AudioHandler(prompt.getIndex(), sc.getValue(), audioURI);
            } else {
                this.audioHandlers[i2] = null;
            }
            String imageURI = prompt.getSpecialFormSelectChoiceText(sc, FormEntryCaption.TEXT_FORM_IMAGE);
            if (imageURI != null) {
                this.choices[i2] = imageURI;
                try {
                    String imageFilename = ReferenceManager._().DeriveReference(imageURI).getLocalURI();
                    File imageFile = new File(imageFilename);
                    if (imageFile.exists()) {
                        Display display = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
                        int screenWidth = display.getWidth();
                        int screenHeight = display.getHeight();
                        Bitmap b = FileUtils.getBitmapScaledToDisplay(imageFile, screenHeight, screenWidth);
                        if (b != null && b.getWidth() > this.maxColumnWidth) {
                            this.maxColumnWidth = b.getWidth();
                        }
                    }
                } catch (InvalidReferenceException e) {
                    Log.e("GridWidget", "image invalid reference exception");
                    e.printStackTrace();
                }
            }
        }
        ImageAdapter ia = new ImageAdapter(getContext(), this.choices);
        this.gridview.setAdapter((ListAdapter) ia);
        this.gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: org.odk.collect.android.widgets.GridWidget.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                for (int i3 = 0; i3 < GridWidget.this.selected.length; i3++) {
                    if (GridWidget.this.selected[i3] && GridWidget.this.audioHandlers[i3] != null) {
                        GridWidget.this.audioHandlers[i3].stopPlaying();
                    }
                    GridWidget.this.selected[i3] = false;
                    if (GridWidget.this.imageViews[i3] != null) {
                        GridWidget.this.imageViews[i3].setBackgroundColor(-1);
                    }
                }
                GridWidget.this.selected[position] = true;
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "onItemClick.select", GridWidget.this.mItems.get(position).getValue(), GridWidget.this.mPrompt.getIndex());
                GridWidget.this.imageViews[position].setBackgroundColor(Color.rgb(255, 140, 0));
                if (quickAdvance) {
                    GridWidget.this.listener.advance();
                } else if (GridWidget.this.audioHandlers[position] != null) {
                    GridWidget.this.audioHandlers[position].playAudio(GridWidget.this.getContext());
                }
            }
        });
        Display display2 = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        int screenWidth2 = display2.getWidth();
        int screenHeight2 = display2.getHeight();
        AbsListView.LayoutParams params = new AbsListView.LayoutParams(screenWidth2 - 5, screenHeight2 - 5);
        this.gridview.setLayoutParams(params);
        if (numColumns > 0) {
            this.gridview.setNumColumns(numColumns);
        } else {
            this.gridview.setNumColumns(-1);
        }
        this.gridview.setColumnWidth(this.maxColumnWidth);
        this.gridview.setHorizontalSpacing(2);
        this.gridview.setVerticalSpacing(2);
        this.gridview.setGravity(3);
        this.gridview.setStretchMode(0);
        String s = null;
        s = prompt.getAnswerValue() != null ? ((Selection) prompt.getAnswerValue().getValue()).getValue() : s;
        for (int i3 = 0; i3 < this.mItems.size(); i3++) {
            String sMatch = this.mItems.get(i3).getValue();
            this.selected[i3] = sMatch.equals(s);
            if (this.selected[i3]) {
                this.imageViews[i3].setBackgroundColor(Color.rgb(255, 140, 0));
            } else {
                this.imageViews[i3].setBackgroundColor(-1);
            }
        }
        addView(this.gridview);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public IAnswerData getAnswer() {
        for (int i = 0; i < this.choices.length; i++) {
            if (this.selected[i]) {
                SelectChoice sc = this.mItems.elementAt(i);
                return new SelectOneData(new Selection(sc));
            }
        }
        return null;
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void clearAnswer() {
        for (int i = 0; i < this.mItems.size(); i++) {
            this.selected[i] = false;
            this.imageViews[i].setBackgroundColor(-1);
        }
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget
    public void setFocus(Context context) {
        InputMethodManager inputManager = (InputMethodManager) context.getSystemService("input_method");
        inputManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class ImageAdapter extends BaseAdapter {
        private String[] choices;

        public ImageAdapter(Context c, String[] choices) {
            GridWidget.this = r1;
            this.choices = choices;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.choices.length;
        }

        @Override // android.widget.Adapter
        public Object getItem(int position) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return 0L;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x012f  */
        @Override // android.widget.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.view.View getView(int r22, android.view.View r23, android.view.ViewGroup r24) {
            /*
                Method dump skipped, instructions count: 318
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.odk.collect.android.widgets.GridWidget.ImageAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l) {
        this.gridview.setOnLongClickListener(l);
    }

    @Override // org.odk.collect.android.widgets.QuestionWidget, android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        this.gridview.cancelLongPress();
    }
}
