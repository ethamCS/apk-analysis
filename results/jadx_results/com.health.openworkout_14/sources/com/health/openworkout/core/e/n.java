package com.health.openworkout.core.e;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
/* loaded from: classes.dex */
public class n extends WorkoutItem {
    public n() {
        setName(getContext().getString(R.string.workout_name_lunge_kick));
        setDescription(getContext().getString(R.string.workout_description_lunge_kick));
        setImagePath("lunge_kick.png");
        setVideoPath("lunge_kick.mp4");
        setTimeMode(false);
    }
}