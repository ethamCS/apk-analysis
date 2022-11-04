package com.health.openworkout.core.e;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
/* loaded from: classes.dex */
public class k extends WorkoutItem {
    public k() {
        setName(getContext().getString(R.string.workout_name_jump_push_ups));
        setDescription(getContext().getString(R.string.workout_description_jump_push_ups));
        setImagePath("jump_push_ups.png");
        setVideoPath("jump_push_ups.mp4");
        setTimeMode(false);
    }
}
