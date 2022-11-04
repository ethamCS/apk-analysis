package com.health.openworkout.core.e;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
/* loaded from: classes.dex */
public class v extends WorkoutItem {
    public v() {
        setName(getContext().getString(R.string.workout_name_side_plank));
        setDescription(getContext().getString(R.string.workout_description_side_plank));
        setImagePath("side_plank.png");
        setVideoPath("side_plank.mp4");
    }
}
