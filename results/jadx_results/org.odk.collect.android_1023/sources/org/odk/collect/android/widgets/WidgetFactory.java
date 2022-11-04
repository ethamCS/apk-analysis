package org.odk.collect.android.widgets;

import android.content.Context;
import android.util.Log;
import java.util.Locale;
import org.javarosa.form.api.FormEntryPrompt;
import org.odk.collect.android.activities.DrawActivity;
/* loaded from: classes.dex */
public class WidgetFactory {
    public static QuestionWidget createWidgetFromPrompt(FormEntryPrompt fep, Context context) {
        String appearance = fep.getAppearanceHint();
        if (appearance == null) {
            appearance = "";
        }
        String appearance2 = appearance.toLowerCase(Locale.ENGLISH);
        switch (fep.getControlType()) {
            case 1:
                switch (fep.getDataType()) {
                    case 1:
                        if (appearance2.startsWith("ex:")) {
                            QuestionWidget questionWidget = new ExStringWidget(context, fep);
                            return questionWidget;
                        } else if (appearance2.equals("numbers")) {
                            QuestionWidget questionWidget2 = new StringNumberWidget(context, fep);
                            return questionWidget2;
                        } else {
                            QuestionWidget questionWidget3 = new StringWidget(context, fep);
                            return questionWidget3;
                        }
                    case 2:
                        if (appearance2.startsWith("ex:")) {
                            QuestionWidget questionWidget4 = new ExIntegerWidget(context, fep);
                            return questionWidget4;
                        }
                        QuestionWidget questionWidget5 = new IntegerWidget(context, fep);
                        return questionWidget5;
                    case 3:
                        if (appearance2.startsWith("ex:")) {
                            QuestionWidget questionWidget6 = new ExDecimalWidget(context, fep);
                            return questionWidget6;
                        }
                        QuestionWidget questionWidget7 = new DecimalWidget(context, fep);
                        return questionWidget7;
                    case 4:
                        QuestionWidget questionWidget8 = new DateWidget(context, fep);
                        return questionWidget8;
                    case 5:
                        QuestionWidget questionWidget9 = new TimeWidget(context, fep);
                        return questionWidget9;
                    case 6:
                        QuestionWidget questionWidget10 = new DateTimeWidget(context, fep);
                        return questionWidget10;
                    case 7:
                    case 8:
                    case 9:
                    default:
                        QuestionWidget questionWidget11 = new StringWidget(context, fep);
                        return questionWidget11;
                    case 10:
                        QuestionWidget questionWidget12 = new GeoPointWidget(context, fep);
                        return questionWidget12;
                    case 11:
                        QuestionWidget questionWidget13 = new BarcodeWidget(context, fep);
                        return questionWidget13;
                }
            case 2:
                if (appearance2.contains("compact")) {
                    int numColumns = -1;
                    try {
                        int idx = appearance2.indexOf("-");
                        if (idx != -1) {
                            numColumns = Integer.parseInt(appearance2.substring(idx + 1));
                        }
                    } catch (Exception e) {
                        Log.e("WidgetFactory", "Exception parsing numColumns");
                    }
                    if (appearance2.contains("quick")) {
                        QuestionWidget questionWidget14 = new GridWidget(context, fep, numColumns, true);
                        return questionWidget14;
                    }
                    QuestionWidget questionWidget15 = new GridWidget(context, fep, numColumns, false);
                    return questionWidget15;
                } else if (appearance2.equals("minimal")) {
                    QuestionWidget questionWidget16 = new SpinnerWidget(context, fep);
                    return questionWidget16;
                } else if (appearance2.equals("quick")) {
                    QuestionWidget questionWidget17 = new SelectOneAutoAdvanceWidget(context, fep);
                    return questionWidget17;
                } else if (appearance2.equals("list")) {
                    QuestionWidget questionWidget18 = new ListWidget(context, fep, true);
                    return questionWidget18;
                } else if (appearance2.equals("list-nolabel")) {
                    QuestionWidget questionWidget19 = new ListWidget(context, fep, false);
                    return questionWidget19;
                } else if (appearance2.equals("label")) {
                    QuestionWidget questionWidget20 = new LabelWidget(context, fep);
                    return questionWidget20;
                } else {
                    QuestionWidget questionWidget21 = new SelectOneWidget(context, fep);
                    return questionWidget21;
                }
            case 3:
                if (appearance2.contains("compact")) {
                    int numColumns2 = -1;
                    try {
                        int idx2 = appearance2.indexOf("-");
                        if (idx2 != -1) {
                            numColumns2 = Integer.parseInt(appearance2.substring(idx2 + 1));
                        }
                    } catch (Exception e2) {
                        Log.e("WidgetFactory", "Exception parsing numColumns");
                    }
                    QuestionWidget questionWidget22 = new GridMultiWidget(context, fep, numColumns2);
                    return questionWidget22;
                } else if (appearance2.equals("minimal")) {
                    QuestionWidget questionWidget23 = new SpinnerMultiWidget(context, fep);
                    return questionWidget23;
                } else if (appearance2.equals("list")) {
                    QuestionWidget questionWidget24 = new ListMultiWidget(context, fep, true);
                    return questionWidget24;
                } else if (appearance2.equals("list-nolabel")) {
                    QuestionWidget questionWidget25 = new ListMultiWidget(context, fep, false);
                    return questionWidget25;
                } else if (appearance2.equals("label")) {
                    QuestionWidget questionWidget26 = new LabelWidget(context, fep);
                    return questionWidget26;
                } else {
                    QuestionWidget questionWidget27 = new SelectMultiWidget(context, fep);
                    return questionWidget27;
                }
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            default:
                QuestionWidget questionWidget28 = new StringWidget(context, fep);
                return questionWidget28;
            case 9:
                QuestionWidget questionWidget29 = new TriggerWidget(context, fep);
                return questionWidget29;
            case 10:
                if (appearance2.equals("web")) {
                    QuestionWidget questionWidget30 = new ImageWebViewWidget(context, fep);
                    return questionWidget30;
                } else if (appearance2.equals(DrawActivity.OPTION_SIGNATURE)) {
                    QuestionWidget questionWidget31 = new SignatureWidget(context, fep);
                    return questionWidget31;
                } else if (appearance2.equals(DrawActivity.OPTION_ANNOTATE)) {
                    QuestionWidget questionWidget32 = new AnnotateWidget(context, fep);
                    return questionWidget32;
                } else if (appearance2.equals(DrawActivity.OPTION_DRAW)) {
                    QuestionWidget questionWidget33 = new DrawWidget(context, fep);
                    return questionWidget33;
                } else {
                    QuestionWidget questionWidget34 = new ImageWidget(context, fep);
                    return questionWidget34;
                }
            case 12:
                QuestionWidget questionWidget35 = new AudioWidget(context, fep);
                return questionWidget35;
            case 13:
                QuestionWidget questionWidget36 = new VideoWidget(context, fep);
                return questionWidget36;
        }
    }
}
