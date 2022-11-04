package com.androidplot.pie;

import com.androidplot.Series;
/* loaded from: classes2.dex */
public class Segment implements Series {
    private String title;
    private Number value;

    public Segment(String str, Number number) {
        this.title = str;
        setValue(number);
    }

    @Override // com.androidplot.Series
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public Number getValue() {
        return this.value;
    }

    public void setValue(Number number) {
        this.value = number;
    }
}
