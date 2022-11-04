package com.health.openworkout.core.e;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
/* loaded from: classes.dex */
public class x extends WorkoutItem {
    public x() {
        setName(getContext().getString(R.string.workout_name_step_up));
        setDescription(getContext().getString(R.string.workout_description_step_up));
        setImagePath("step_up.png");
        setVideoPath("step_up.mp4");
    }
}
