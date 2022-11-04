package com.health.openworkout.core.c;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.TrainingPlan;
/* loaded from: classes.dex */
public class a extends TrainingPlan {
    public a() {
        setName(getContext().getString(R.string.training_abdominal_muscle_training));
        setImagePath("abdominalMuscleTraining.png");
        float f2 = 1.0f;
        int i = 0;
        while (i <= 21) {
            int i2 = i % 8;
            if (i2 == 7) {
                f2 += 0.2f;
            }
            com.health.openworkout.core.b.a aVar = new com.health.openworkout.core.b.a(i2, f2);
            i++;
            aVar.setName(String.format(getContext().getString(R.string.day_unit), Integer.valueOf(i)));
            addWorkoutSession(aVar);
        }
    }
}
