package com.health.openworkout.core.c;

import com.health.openworkout.R;
import com.health.openworkout.core.datatypes.TrainingPlan;
/* loaded from: classes.dex */
public class b extends TrainingPlan {
    public b() {
        setName(getContext().getString(R.string.training_beginners_training));
        setImagePath("beginnersTraining.png");
        float f2 = 1.0f;
        int i = 0;
        while (i <= 27) {
            int i2 = i % 8;
            if (i2 == 7) {
                f2 += 0.2f;
            }
            com.health.openworkout.core.b.b bVar = new com.health.openworkout.core.b.b(i2, f2);
            i++;
            bVar.setName(String.format(getContext().getString(R.string.day_unit), Integer.valueOf(i)));
            addWorkoutSession(bVar);
        }
    }
}
