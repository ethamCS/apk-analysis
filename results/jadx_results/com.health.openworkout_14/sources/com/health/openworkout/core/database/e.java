package com.health.openworkout.core.database;

import com.health.openworkout.core.datatypes.WorkoutItem;
import java.util.List;
/* loaded from: classes.dex */
public interface e {
    WorkoutItem a(long j);

    List<WorkoutItem> b(long j);

    void c(long j);

    void clear();

    void d(List<WorkoutItem> list);

    void e(WorkoutItem workoutItem);

    long f(WorkoutItem workoutItem);

    List<WorkoutItem> g();

    void h(WorkoutItem workoutItem);
}
