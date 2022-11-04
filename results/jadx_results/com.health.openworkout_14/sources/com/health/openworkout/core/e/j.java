package com.health.openworkout.core.e;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
/* loaded from: classes.dex */
public class j extends WorkoutItem {
    public j() {
        setName(getContext().getString(R.string.workout_name_high_knees));
        setDescription(getContext().getString(R.string.workout_description_high_knees));
        setImagePath("high_knees.png");
        setVideoPath("high_knees.mp4");
    }
}
