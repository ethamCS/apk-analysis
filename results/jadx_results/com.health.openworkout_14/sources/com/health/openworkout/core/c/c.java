package com.health.openworkout.core.c;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.TrainingPlan;
/* loaded from: classes.dex */
public class c extends TrainingPlan {
    public c() {
        setName(getContext().getString(R.string.training_seven_minutes_workout_training));
        setImagePath("sevenMinutesTraining.png");
        for (int i = 1; i <= 30; i++) {
            com.health.openworkout.core.b.c cVar = new com.health.openworkout.core.b.c();
            cVar.setName(String.format(getContext().getString(R.string.day_unit), Integer.valueOf(i)));
            addWorkoutSession(cVar);
        }
    }
}
