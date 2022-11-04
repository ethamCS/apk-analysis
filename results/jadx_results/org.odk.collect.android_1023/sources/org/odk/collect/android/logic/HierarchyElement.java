package org.odk.collect.android.logic;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.javarosa.core.model.FormIndex;
/* loaded from: classes.dex */
public class HierarchyElement {
    ArrayList<HierarchyElement> mChildren = new ArrayList<>();
    private int mColor;
    FormIndex mFormIndex;
    private Drawable mIcon;
    private String mPrimaryText;
    private String mSecondaryText;
    int mType;

    public HierarchyElement(String text1, String text2, Drawable bullet, int color, int type, FormIndex f) {
        this.mPrimaryText = "";
        this.mSecondaryText = "";
        this.mIcon = bullet;
        this.mPrimaryText = text1;
        this.mSecondaryText = text2;
        this.mColor = color;
        this.mFormIndex = f;
        this.mType = type;
    }

    public String getPrimaryText() {
        return this.mPrimaryText;
    }

    public String getSecondaryText() {
        return this.mSecondaryText;
    }

    public void setPrimaryText(String text) {
        this.mPrimaryText = text;
    }

    public void setSecondaryText(String text) {
        this.mSecondaryText = text;
    }

    public void setIcon(Drawable icon) {
        this.mIcon = icon;
    }

    public Drawable getIcon() {
        return this.mIcon;
    }

    public FormIndex getFormIndex() {
        return this.mFormIndex;
    }

    public int getType() {
        return this.mType;
    }

    public void setType(int newType) {
        this.mType = newType;
    }

    public ArrayList<HierarchyElement> getChildren() {
        return this.mChildren;
    }

    public void addChild(HierarchyElement h) {
        this.mChildren.add(h);
    }

    public void setChildren(ArrayList<HierarchyElement> children) {
        this.mChildren = children;
    }

    public void setColor(int color) {
        this.mColor = color;
    }

    public int getColor() {
        return this.mColor;
    }
}
