package com.health.openworkout.core.e;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
/* loaded from: classes.dex */
public class i extends WorkoutItem {
    public i() {
        setName(getContext().getString(R.string.workout_name_donkey_kick));
        setDescription(getContext().getString(R.string.workout_description_donkey_kick));
        setImagePath("donkey_kick.png");
        setVideoPath("donkey_kick.mp4");
        setTimeMode(false);
    }
}
