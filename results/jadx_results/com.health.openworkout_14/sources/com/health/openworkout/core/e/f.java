package com.health.openworkout.core.e;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
/* loaded from: classes.dex */
public class f extends WorkoutItem {
    public f() {
        setName(getContext().getString(R.string.workout_name_circle_crunch));
        setDescription(getContext().getString(R.string.workout_description_circle_crunch));
        setImagePath("circle_crunch.png");
        setVideoPath("circle_crunch.mp4");
        setTimeMode(false);
    }
}
