package com.health.openworkout.core.e;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
/* loaded from: classes.dex */
public class c extends WorkoutItem {
    public c() {
        setName(getContext().getString(R.string.workout_name_bicycle_crunch));
        setDescription(getContext().getString(R.string.workout_description_bicycle_crunch));
        setImagePath("bicycle_crunch.png");
        setVideoPath("bicycle_crunch.mp4");
        setTimeMode(false);
    }
}
