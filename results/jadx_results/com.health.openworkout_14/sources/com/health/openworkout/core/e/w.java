package com.health.openworkout.core.e;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
/* loaded from: classes.dex */
public class w extends WorkoutItem {
    public w() {
        setName(getContext().getString(R.string.workout_name_squat));
        setDescription(getContext().getString(R.string.workout_description_squat));
        setImagePath("squad.png");
        setVideoPath("squad.mp4");
    }
}
