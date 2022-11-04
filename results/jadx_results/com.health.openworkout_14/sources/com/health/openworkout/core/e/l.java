package com.health.openworkout.core.e;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
/* loaded from: classes.dex */
public class l extends WorkoutItem {
    public l() {
        setName(getContext().getString(R.string.workout_name_jumping_jack));
        setDescription(getContext().getString(R.string.workout_description_jumping_jack));
        setImagePath("jumping_jack.png");
        setVideoPath("jumping_jack.mp4");
    }
}
