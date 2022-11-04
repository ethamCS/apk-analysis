package org.javarosa.core.model.utils;

import java.util.Date;
import java.util.Vector;
import org.javarosa.core.model.data.DateData;
import org.javarosa.core.model.data.DateTimeData;
import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.model.data.StringData;
import org.javarosa.core.model.instance.TreeElement;
import org.javarosa.core.services.PropertyManager;
import org.javarosa.core.util.Map;
import org.javarosa.core.util.PropertyUtils;
/* loaded from: classes.dex */
public class QuestionPreloader {
    private Map preloadHandlers = new Map();

    public QuestionPreloader() {
        initPreloadHandlers();
    }

    private void initPreloadHandlers() {
        IPreloadHandler iPreloadHandler = new IPreloadHandler() { // from class: org.javarosa.core.model.utils.QuestionPreloader.1
            @Override // org.javarosa.core.model.utils.IPreloadHandler
            public String preloadHandled() {
                return "date";
            }

            @Override // org.javarosa.core.model.utils.IPreloadHandler
            public IAnswerData handlePreload(String str) {
                return QuestionPreloader.this.preloadDate(str);
            }

            @Override // org.javarosa.core.model.utils.IPreloadHandler
            public boolean handlePostProcess(TreeElement treeElement, String str) {
                return false;
            }
        };
        IPreloadHandler iPreloadHandler2 = new IPreloadHandler() { // from class: org.javarosa.core.model.utils.QuestionPreloader.2
            @Override // org.javarosa.core.model.utils.IPreloadHandler
            public String preloadHandled() {
                return "property";
            }

            @Override // org.javarosa.core.model.utils.IPreloadHandler
            public IAnswerData handlePreload(String str) {
                return QuestionPreloader.this.preloadProperty(str);
            }

            @Override // org.javarosa.core.model.utils.IPreloadHandler
            public boolean handlePostProcess(TreeElement treeElement, String str) {
                QuestionPreloader.this.saveProperty(str, treeElement);
                return false;
            }
        };
        IPreloadHandler iPreloadHandler3 = new IPreloadHandler() { // from class: org.javarosa.core.model.utils.QuestionPreloader.3
            @Override // org.javarosa.core.model.utils.IPreloadHandler
            public String preloadHandled() {
                return "timestamp";
            }

            @Override // org.javarosa.core.model.utils.IPreloadHandler
            public IAnswerData handlePreload(String str) {
                if ("start".equals(str)) {
                    return QuestionPreloader.this.getTimestamp();
                }
                return null;
            }

            @Override // org.javarosa.core.model.utils.IPreloadHandler
            public boolean handlePostProcess(TreeElement treeElement, String str) {
                if ("end".equals(str)) {
                    treeElement.setAnswer(QuestionPreloader.this.getTimestamp());
                    return true;
                }
                return false;
            }
        };
        IPreloadHandler iPreloadHandler4 = new IPreloadHandler() { // from class: org.javarosa.core.model.utils.QuestionPreloader.4
            @Override // org.javarosa.core.model.utils.IPreloadHandler
            public String preloadHandled() {
                return "uid";
            }

            @Override // org.javarosa.core.model.utils.IPreloadHandler
            public IAnswerData handlePreload(String str) {
                return new StringData(PropertyUtils.genGUID(25));
            }

            @Override // org.javarosa.core.model.utils.IPreloadHandler
            public boolean handlePostProcess(TreeElement treeElement, String str) {
                return false;
            }
        };
        addPreloadHandler(iPreloadHandler);
        addPreloadHandler(iPreloadHandler2);
        addPreloadHandler(iPreloadHandler3);
        addPreloadHandler(iPreloadHandler4);
    }

    public void addPreloadHandler(IPreloadHandler iPreloadHandler) {
        this.preloadHandlers.put(iPreloadHandler.preloadHandled(), iPreloadHandler);
    }

    public IAnswerData getQuestionPreload(String str, String str2) {
        IPreloadHandler iPreloadHandler = (IPreloadHandler) this.preloadHandlers.get(str);
        if (iPreloadHandler != null) {
            return iPreloadHandler.handlePreload(str2);
        }
        System.err.println("Do not know how to handle preloader [" + str + "]");
        return null;
    }

    public boolean questionPostProcess(TreeElement treeElement, String str, String str2) {
        IPreloadHandler iPreloadHandler = (IPreloadHandler) this.preloadHandlers.get(str);
        if (iPreloadHandler != null) {
            return iPreloadHandler.handlePostProcess(treeElement, str2);
        }
        System.err.println("Do not know how to handle preloader [" + str + "]");
        return false;
    }

    public IAnswerData preloadDate(String str) {
        boolean z;
        int i = 1;
        boolean z2 = false;
        Date date = null;
        if (str.equals("today")) {
            date = new Date();
        } else if (str.substring(0, 11).equals("prevperiod-")) {
            Vector split = DateUtils.split(str.substring(11), "-", false);
            String[] strArr = new String[split.size()];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr[i2] = (String) split.elementAt(i2);
            }
            try {
                String str2 = strArr[0];
                String str3 = strArr[1];
                if (strArr[2].equals("head")) {
                    z = true;
                } else if (!strArr[2].equals("tail")) {
                    throw new RuntimeException();
                } else {
                    z = false;
                }
                if (strArr.length >= 4) {
                    if (strArr[3].equals("x")) {
                        z2 = true;
                    } else if (!strArr[3].equals("")) {
                        throw new RuntimeException();
                    }
                }
                if (strArr.length >= 5) {
                    i = Integer.parseInt(strArr[4]);
                }
                date = DateUtils.getPastPeriodDate(new Date(), str2, str3, z, z2, i);
            } catch (Exception e) {
                throw new IllegalArgumentException("invalid preload params for preload mode 'date'");
            }
        }
        return new DateData(date);
    }

    public IAnswerData preloadProperty(String str) {
        String singularProperty = PropertyManager._().getSingularProperty(str);
        if (singularProperty == null || singularProperty.length() <= 0) {
            return null;
        }
        return new StringData(singularProperty);
    }

    public void saveProperty(String str, TreeElement treeElement) {
        IAnswerData value = treeElement.getValue();
        String displayText = value == null ? null : value.getDisplayText();
        if (str != null && str.length() > 0 && displayText != null && displayText.length() > 0) {
            PropertyManager._().setProperty(str, displayText);
        }
    }

    public DateTimeData getTimestamp() {
        return new DateTimeData(new Date());
    }
}
