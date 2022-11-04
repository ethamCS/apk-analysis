package com.health.openworkout.core.e;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
/* loaded from: classes.dex */
public class z extends WorkoutItem {
    public z() {
        setName(getContext().getString(R.string.workout_name_wall_sit));
        setDescription(getContext().getString(R.string.workout_description_wall_sit));
        setImagePath("wall_sit.png");
        setVideoPath("wall_sit.mp4");
    }
}
