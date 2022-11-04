package com.health.openworkout.core.e;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
/* loaded from: classes.dex */
public class d extends WorkoutItem {
    public d() {
        setName(getContext().getString(R.string.workout_name_box_jump));
        setDescription(getContext().getString(R.string.workout_description_box_jump));
        setImagePath("box_jump.png");
        setVideoPath("box_jump.mp4");
        setTimeMode(false);
    }
}
