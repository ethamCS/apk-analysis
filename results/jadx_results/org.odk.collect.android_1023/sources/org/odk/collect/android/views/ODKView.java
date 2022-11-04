package org.odk.collect.android.views;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.javarosa.core.model.FormIndex;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.form.api.FormEntryCaption;
import org.javarosa.form.api.FormEntryPrompt;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.widgets.IBinaryWidget;
import org.odk.collect.android.widgets.QuestionWidget;
import org.odk.collect.android.widgets.WidgetFactory;
/* loaded from: classes.dex */
public class ODKView extends ScrollView implements View.OnLongClickListener {
    public static final String FIELD_LIST = "field-list";
    private static final int VIEW_ID = 12345;
    private static final String t = "ODKView";
    private Handler h;
    private ArrayList<QuestionWidget> widgets = new ArrayList<>();
    private LinearLayout mView = new LinearLayout(getContext());
    private LinearLayout.LayoutParams mLayout = new LinearLayout.LayoutParams(-1, -2);

    public ODKView(Context context, FormEntryPrompt[] questionPrompts, FormEntryCaption[] groups, boolean advancingPage) {
        super(context);
        final String playOption;
        this.h = null;
        this.mView.setOrientation(1);
        this.mView.setGravity(48);
        this.mView.setPadding(0, 7, 0, 0);
        this.mLayout.setMargins(10, 0, 10, 0);
        addGroupText(groups);
        boolean first = true;
        int len$ = questionPrompts.length;
        int i$ = 0;
        int id = 0;
        while (i$ < len$) {
            FormEntryPrompt p = questionPrompts[i$];
            if (!first) {
                View divider = new View(getContext());
                divider.setBackgroundResource(17301522);
                divider.setMinimumHeight(3);
                this.mView.addView(divider);
            } else {
                first = false;
            }
            QuestionWidget qw = WidgetFactory.createWidgetFromPrompt(p, getContext());
            qw.setLongClickable(true);
            qw.setOnLongClickListener(this);
            qw.setId(id + VIEW_ID);
            this.widgets.add(qw);
            this.mView.addView(qw, this.mLayout);
            i$++;
            id++;
        }
        addView(this.mView);
        if (advancingPage && questionPrompts.length == 1 && (playOption = this.widgets.get(0).getPrompt().getFormElement().getAdditionalAttribute(null, "autoplay")) != null) {
            this.h = new Handler();
            this.h.postDelayed(new Runnable() { // from class: org.odk.collect.android.views.ODKView.1
                @Override // java.lang.Runnable
                public void run() {
                    if (playOption.equalsIgnoreCase(FormEntryCaption.TEXT_FORM_AUDIO)) {
                        ((QuestionWidget) ODKView.this.widgets.get(0)).playAudio();
                    } else if (playOption.equalsIgnoreCase(FormEntryCaption.TEXT_FORM_VIDEO)) {
                        ((QuestionWidget) ODKView.this.widgets.get(0)).playVideo();
                    }
                }
            }, 150L);
        }
    }

    public void recycleDrawables() {
        destroyDrawingCache();
        this.mView.destroyDrawingCache();
        Iterator i$ = this.widgets.iterator();
        while (i$.hasNext()) {
            QuestionWidget q = i$.next();
            q.recycleDrawables();
        }
    }

    @Override // android.view.View
    protected void onScrollChanged(int l, int t2, int oldl, int oldt) {
        Collect.getInstance().getActivityLogger().logScrollAction(this, t2 - oldt);
    }

    public LinkedHashMap<FormIndex, IAnswerData> getAnswers() {
        LinkedHashMap<FormIndex, IAnswerData> answers = new LinkedHashMap<>();
        Iterator<QuestionWidget> i = this.widgets.iterator();
        while (i.hasNext()) {
            QuestionWidget q = i.next();
            FormEntryPrompt p = q.getPrompt();
            answers.put(p.getIndex(), q.getAnswer());
        }
        return answers;
    }

    private void addGroupText(FormEntryCaption[] groups) {
        StringBuffer s = new StringBuffer("");
        for (FormEntryCaption g : groups) {
            int i = g.getMultiplicity() + 1;
            String t2 = g.getLongText();
            if (t2 != null) {
                s.append(t2);
                if (g.repeats() && i > 0) {
                    s.append(" (" + i + ")");
                }
                s.append(" > ");
            }
        }
        if (s.length() > 0) {
            TextView tv = new TextView(getContext());
            tv.setText(s.substring(0, s.length() - 3));
            int questionFontsize = Collect.getQuestionFontsize();
            tv.setTextSize(1, questionFontsize - 4);
            tv.setPadding(0, 0, 0, 5);
            this.mView.addView(tv, this.mLayout);
        }
    }

    public void setFocus(Context context) {
        if (this.widgets.size() > 0) {
            this.widgets.get(0).setFocus(context);
        }
    }

    public void setBinaryData(Object answer) {
        boolean set = false;
        Iterator i$ = this.widgets.iterator();
        while (true) {
            if (!i$.hasNext()) {
                break;
            }
            QuestionWidget q = i$.next();
            if ((q instanceof IBinaryWidget) && ((IBinaryWidget) q).isWaitingForBinaryData()) {
                ((IBinaryWidget) q).setBinaryData(answer);
                set = true;
                break;
            }
        }
        if (!set) {
            Log.w(t, "Attempting to return data to a widget or set of widgets not looking for data");
        }
    }

    public void cancelWaitingForBinaryData() {
        int count = 0;
        Iterator i$ = this.widgets.iterator();
        while (i$.hasNext()) {
            QuestionWidget q = i$.next();
            if ((q instanceof IBinaryWidget) && ((IBinaryWidget) q).isWaitingForBinaryData()) {
                ((IBinaryWidget) q).cancelWaitingForBinaryData();
                count++;
            }
        }
        if (count != 1) {
            Log.w(t, "Attempting to cancel waiting for binary data to a widget or set of widgets not looking for data");
        }
    }

    public boolean suppressFlingGesture(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Iterator i$ = this.widgets.iterator();
        while (i$.hasNext()) {
            QuestionWidget q = i$.next();
            if (q.suppressFlingGesture(e1, e2, velocityX, velocityY)) {
                return true;
            }
        }
        return false;
    }

    public boolean clearAnswer() {
        if (this.widgets.size() != 1 || this.widgets.get(0).getPrompt().isReadOnly()) {
            return false;
        }
        this.widgets.get(0).clearAnswer();
        return true;
    }

    public ArrayList<QuestionWidget> getWidgets() {
        return this.widgets;
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener l) {
        for (int i = 0; i < this.widgets.size(); i++) {
            QuestionWidget qw = this.widgets.get(i);
            qw.setOnFocusChangeListener(l);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View v) {
        return false;
    }

    @Override // android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        Iterator i$ = this.widgets.iterator();
        while (i$.hasNext()) {
            QuestionWidget qw = i$.next();
            qw.cancelLongPress();
        }
    }
}
