package com.androidplot.ui;
/* loaded from: classes2.dex */
public class Insets {
    private float bottom;
    private float left;
    private float right;
    private float top;

    public Insets() {
    }

    public Insets(float f, float f2, float f3, float f4) {
        this.top = f;
        this.bottom = f2;
        this.left = f3;
        this.right = f4;
    }

    public float getTop() {
        return this.top;
    }

    public void setTop(float f) {
        this.top = f;
    }

    public float getBottom() {
        return this.bottom;
    }

    public void setBottom(float f) {
        this.bottom = f;
    }

    public float getLeft() {
        return this.left;
    }

    public void setLeft(float f) {
        this.left = f;
    }

    public float getRight() {
        return this.right;
    }

    public void setRight(float f) {
        this.right = f;
    }
}
