package com.health.openworkout.core.b;

import com.health.openworkout.core.datatypes.WorkoutItem;
import com.health.openworkout.core.datatypes.WorkoutSession;
import com.health.openworkout.core.e.j;
import com.health.openworkout.core.e.l;
import com.health.openworkout.core.e.m;
import com.health.openworkout.core.e.q;
import com.health.openworkout.core.e.r;
import com.health.openworkout.core.e.s;
import com.health.openworkout.core.e.w;
import com.health.openworkout.core.e.x;
import com.health.openworkout.core.e.y;
/* loaded from: classes.dex */
public class b extends WorkoutSession {

    /* renamed from: b */
    private float f3383b;

    public b(int i, float f2) {
        q qVar;
        q qVar2;
        this.f3383b = f2;
        int i2 = 25;
        switch (i) {
            case 0:
                d(new l(), 15);
                b(new x(), 5);
                b(new s(), 2);
                b(new com.health.openworkout.core.e.a(), 5);
                d(new q(), 5);
                return;
            case 1:
                d(new l(), 15);
                b(new x(), 10);
                b(new s(), 3);
                b(new com.health.openworkout.core.e.a(), 10);
                d(new q(), 10);
                return;
            case 2:
                d(new l(), 18);
                b(new y(), 4);
                b(new w(), 10);
                b(new com.health.openworkout.core.e.a(), 10);
                qVar = new q();
                d(qVar, 15);
                return;
            case 3:
                d(new l(), 22);
                d(new j(), 10);
                b(new m(), 12);
                b(new r(), 4);
                qVar = new q();
                d(qVar, 15);
                return;
            case 4:
                d(new l(), 25);
                b(new s(), 4);
                b(new com.health.openworkout.core.e.a(), 12);
                b(new w(), 12);
                d(new q(), 18);
                return;
            case 5:
                b(new s(), 4);
                b(new com.health.openworkout.core.e.a(), 15);
                b(new w(), 15);
                d(new j(), 15);
                qVar2 = new q();
                i2 = 20;
                d(qVar2, i2);
                return;
            case 6:
                d(new l(), 30);
                b(new y(), 5);
                b(new m(), 16);
                b(new com.health.openworkout.core.e.a(), 16);
                d(new q(), 22);
                return;
            case 7:
                d(new l(), 35);
                b(new x(), 16);
                d(new j(), 15);
                b(new r(), 6);
                qVar2 = new q();
                d(qVar2, i2);
                return;
            default:
                return;
        }
    }

    private void b(WorkoutItem workoutItem, int i) {
        workoutItem.setTimeMode(false);
        workoutItem.setRepetitionCount(Math.round(i * this.f3383b));
        addWorkout(workoutItem);
    }

    private void d(WorkoutItem workoutItem, int i) {
        workoutItem.setWorkoutTime(Math.round(i * this.f3383b));
        addWorkout(workoutItem);
    }
}
