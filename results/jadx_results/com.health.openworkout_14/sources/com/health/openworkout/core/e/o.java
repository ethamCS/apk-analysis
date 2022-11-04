package com.health.openworkout.core.e;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
/* loaded from: classes.dex */
public class o extends WorkoutItem {
    public o() {
        setName(getContext().getString(R.string.workout_name_mountain_climbers));
        setDescription(getContext().getString(R.string.workout_description_mountain_climbers));
        setImagePath("mountain_climbers.png");
        setVideoPath("mountain_climbers.mp4");
    }
}
