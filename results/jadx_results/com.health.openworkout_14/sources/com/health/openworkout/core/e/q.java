package com.health.openworkout.core.e;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
/* loaded from: classes.dex */
public class q extends WorkoutItem {
    public q() {
        setName(getContext().getString(R.string.workout_name_plank));
        setDescription(getContext().getString(R.string.workout_description_plank));
        setImagePath("plank.png");
        setVideoPath("plank.mp4");
    }
}
