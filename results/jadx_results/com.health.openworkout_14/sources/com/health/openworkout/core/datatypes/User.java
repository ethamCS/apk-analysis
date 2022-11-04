package com.health.openworkout.core.datatypes;

import androidx.annotation.Keep;
@Keep
/* loaded from: classes.dex */
public class User {
    private boolean isMale = true;
    private long trainingsPlanId;
    private long userId;

    public long getTrainingsPlanId() {
        return this.trainingsPlanId;
    }

    public long getUserId() {
        return this.userId;
    }

    public boolean isMale() {
        return this.isMale;
    }

    public void setMale(boolean z) {
        this.isMale = z;
    }

    public void setTrainingsPlanId(long j) {
        this.trainingsPlanId = j;
    }

    public void setUserId(long j) {
        this.userId = j;
    }
}
