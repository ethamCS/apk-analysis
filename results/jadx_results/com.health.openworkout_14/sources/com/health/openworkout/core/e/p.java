package com.health.openworkout.core.e;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
/* loaded from: classes.dex */
public class p extends WorkoutItem {
    public p() {
        setName(getContext().getString(R.string.workout_name_pike_walk));
        setDescription(getContext().getString(R.string.workout_description_pike_walk));
        setImagePath("pike_walk.png");
        setVideoPath("pike_walk.mp4");
        setTimeMode(false);
    }
}
