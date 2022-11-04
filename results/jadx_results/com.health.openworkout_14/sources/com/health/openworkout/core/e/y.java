package com.health.openworkout.core.e;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
/* loaded from: classes.dex */
public class y extends WorkoutItem {
    public y() {
        setName(getContext().getString(R.string.workout_name_triceps_dip));
        setDescription(getContext().getString(R.string.workout_description_triceps_dip));
        setImagePath("tricep_dips.png");
        setVideoPath("tricep_dips.mp4");
    }
}
