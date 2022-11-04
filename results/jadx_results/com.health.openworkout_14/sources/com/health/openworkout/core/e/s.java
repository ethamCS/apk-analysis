package com.health.openworkout.core.e;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
/* loaded from: classes.dex */
public class s extends WorkoutItem {
    public s() {
        setName(getContext().getString(R.string.workout_name_push_ups));
        setDescription(getContext().getString(R.string.workout_description_push_ups));
        setImagePath("push_ups.png");
        setVideoPath("push_ups.mp4");
    }
}
