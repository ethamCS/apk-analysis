package com.health.openworkout.core.e;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
/* loaded from: classes.dex */
public class u extends WorkoutItem {
    public u() {
        setName(getContext().getString(R.string.workout_name_russian_twist));
        setDescription(getContext().getString(R.string.workout_description_russian_twist));
        setImagePath("russian_twist.png");
        setVideoPath("russian_twist.mp4");
        setTimeMode(false);
    }
}
