package com.health.openworkout.core.database;

import com.health.openworkout.core.datatypes.TrainingPlan;
import java.util.List;
/* loaded from: classes.dex */
public interface a {
    TrainingPlan a(long j);

    List<TrainingPlan> b();

    long c(TrainingPlan trainingPlan);

    void d(TrainingPlan trainingPlan);

    void e(TrainingPlan trainingPlan);
}
