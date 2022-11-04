package com.androidplot.ui;

import android.graphics.RectF;
/* loaded from: classes2.dex */
public class BoxModel implements BoxModelable {
    private float marginBottom;
    private float marginLeft;
    private float marginRight;
    private float marginTop;
    private float paddingBottom;
    private float paddingLeft;
    private float paddingRight;
    private float paddingTop;

    public BoxModel() {
    }

    public BoxModel(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.marginLeft = f;
        this.marginTop = f2;
        this.marginRight = f3;
        this.marginBottom = f4;
        this.paddingLeft = f5;
        this.paddingTop = f6;
        this.paddingRight = f7;
        this.paddingBottom = f8;
    }

    @Override // com.androidplot.ui.BoxModelable
    public RectF getMarginatedRect(RectF rectF) {
        return new RectF(rectF.left + getMarginLeft(), rectF.top + getMarginTop(), rectF.right - getMarginRight(), rectF.bottom - getMarginBottom());
    }

    @Override // com.androidplot.ui.BoxModelable
    public RectF getPaddedRect(RectF rectF) {
        return new RectF(rectF.left + getPaddingLeft(), rectF.top + getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setMargins(float f, float f2, float f3, float f4) {
        setMarginLeft(f);
        setMarginTop(f2);
        setMarginRight(f3);
        setMarginBottom(f4);
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setPadding(float f, float f2, float f3, float f4) {
        setPaddingLeft(f);
        setPaddingTop(f2);
        setPaddingRight(f3);
        setPaddingBottom(f4);
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getMarginLeft() {
        return this.marginLeft;
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setMarginLeft(float f) {
        this.marginLeft = f;
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getMarginTop() {
        return this.marginTop;
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setMarginTop(float f) {
        this.marginTop = f;
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getMarginRight() {
        return this.marginRight;
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setMarginRight(float f) {
        this.marginRight = f;
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getMarginBottom() {
        return this.marginBottom;
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setMarginBottom(float f) {
        this.marginBottom = f;
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getPaddingLeft() {
        return this.paddingLeft;
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setPaddingLeft(float f) {
        this.paddingLeft = f;
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getPaddingTop() {
        return this.paddingTop;
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setPaddingTop(float f) {
        this.paddingTop = f;
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getPaddingRight() {
        return this.paddingRight;
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setPaddingRight(float f) {
        this.paddingRight = f;
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getPaddingBottom() {
        return this.paddingBottom;
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setPaddingBottom(float f) {
        this.paddingBottom = f;
    }
}
