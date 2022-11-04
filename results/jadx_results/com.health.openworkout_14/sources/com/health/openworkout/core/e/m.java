package com.health.openworkout.core.e;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.WorkoutItem;
/* loaded from: classes.dex */
public class m extends WorkoutItem {
    public m() {
        setName(getContext().getString(R.string.workout_name_lunge));
        setDescription(getContext().getString(R.string.workout_description_lunge));
        setImagePath("lunge.png");
        setVideoPath("lunge.mp4");
    }
}
