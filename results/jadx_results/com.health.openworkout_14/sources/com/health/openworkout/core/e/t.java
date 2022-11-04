package com.health.openworkout.core.e;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
/* loaded from: classes.dex */
public class t extends WorkoutItem {
    public t() {
        setName(getContext().getString(R.string.workout_name_quick_steps));
        setDescription(getContext().getString(R.string.workout_description_quick_steps));
        setImagePath("quick_steps.png");
        setVideoPath("quick_steps.mp4");
    }
}
