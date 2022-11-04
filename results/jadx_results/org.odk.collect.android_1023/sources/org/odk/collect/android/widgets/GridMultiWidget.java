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
import java.util.Iterator;
import java.util.Vector;
import org.javarosa.core.model.SelectChoice;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.SelectMultiData;
import org.javarosa.core.model.data.helper.Selection;
import org.javarosa.core.reference.InvalidReferenceException;
import org.javarosa.core.reference.ReferenceManager;
import org.javarosa.form.api.FormEntryCaption;
import org.javarosa.form.api.FormEntryPrompt;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.utilities.FileUtils;
import org.odk.collect.android.views.AudioButton;
/* loaded from: classes.dex */
public class GridMultiWidget extends QuestionWidget {
    public static final int orangeBlueVal = 0;
    public static final int orangeGreenVal = 140;
    public static final int orangeRedVal = 255;
    AudioButton.AudioHandler[] audioHandlers;
    String[] choices;
    GridView gridview;
    ImageView[] imageViews;
    int lastClickPosition = 0;
    Vector<SelectChoice> mItems;
    int maxColumnWidth;
    int numColumns;
    boolean[] selected;

    public GridMultiWidget(Context context, FormEntryPrompt prompt, int numColumns) {
        super(context, prompt);
        Vector<Selection> ve;
        this.mItems = prompt.getSelectChoices();
        this.mPrompt = prompt;
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
            } else {
                this.choices[i2] = prompt.getSelectChoiceText(sc);
            }
        }
        ImageAdapter ia = new ImageAdapter(getContext(), this.choices);
        this.gridview.setAdapter((ListAdapter) ia);
        this.gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: org.odk.collect.android.widgets.GridMultiWidget.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                if (GridMultiWidget.this.selected[position]) {
                    GridMultiWidget.this.selected[position] = false;
                    if (GridMultiWidget.this.audioHandlers[position] != null) {
                        GridMultiWidget.this.audioHandlers[position].stopPlaying();
                    }
                    GridMultiWidget.this.imageViews[position].setBackgroundColor(-1);
                    Collect.getInstance().getActivityLogger().logInstanceAction(this, "onItemClick.deselect", GridMultiWidget.this.mItems.get(position).getValue(), GridMultiWidget.this.mPrompt.getIndex());
                    return;
                }
                GridMultiWidget.this.selected[position] = true;
                if (GridMultiWidget.this.audioHandlers[GridMultiWidget.this.lastClickPosition] != null) {
                    GridMultiWidget.this.audioHandlers[GridMultiWidget.this.lastClickPosition].stopPlaying();
                }
                GridMultiWidget.this.imageViews[position].setBackgroundColor(Color.rgb(255, 140, 0));
                Collect.getInstance().getActivityLogger().logInstanceAction(this, "onItemClick.select", GridMultiWidget.this.mItems.get(position).getValue(), GridMultiWidget.this.mPrompt.getIndex());
                if (GridMultiWidget.this.audioHandlers[position] != null) {
                    GridMultiWidget.this.audioHandlers[position].playAudio(GridMultiWidget.this.getContext());
                }
                GridMultiWidget.this.lastClickPosition = position;
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
        IAnswerData answer = prompt.getAnswerValue();
        if (answer == null || answer.getValue() == null) {
            ve = new Vector<>();
        } else {
            ve = (Vector) answer.getValue();
        }
        for (int i3 = 0; i3 < this.choices.length; i3++) {
            String value = this.mItems.get(i3).getValue();
            boolean found = false;
            Iterator i$ = ve.iterator();
            while (true) {
                if (!i$.hasNext()) {
                    break;
                }
                Selection s = i$.next();
                if (value.equals(s.getValue())) {
                    found = true;
                    break;
                }
            }
            this.selected[i3] = found;
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
        Vector<Selection> vc = new Vector<>();
        for (int i = 0; i < this.mItems.size(); i++) {
            if (this.selected[i]) {
                SelectChoice sc = this.mItems.get(i);
                vc.add(new Selection(sc));
            }
        }
        if (vc.size() == 0) {
            return null;
        }
        return new SelectMultiData(vc);
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
            GridMultiWidget.this = r1;
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
            throw new UnsupportedOperationException("Method not decompiled: org.odk.collect.android.widgets.GridMultiWidget.ImageAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
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
