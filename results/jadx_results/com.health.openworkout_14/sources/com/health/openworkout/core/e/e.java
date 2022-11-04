package com.health.openworkout.core.e;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
/* loaded from: classes.dex */
public class e extends WorkoutItem {
    public e() {
        setName(getContext().getString(R.string.workout_name_burpee));
        setDescription(getContext().getString(R.string.workout_description_burpee));
        setImagePath("burpee.png");
        setVideoPath("burpee.mp4");
        setTimeMode(false);
    }
}
