package com.health.openworkout.core.b;

import com.health.openworkout.core.datatypes.WorkoutItem;
import com.health.openworkout.core.datatypes.WorkoutSession;
import com.health.openworkout.core.e.e;
import com.health.openworkout.core.e.f;
import com.health.openworkout.core.e.g;
import com.health.openworkout.core.e.j;
import com.health.openworkout.core.e.l;
import com.health.openworkout.core.e.m;
import com.health.openworkout.core.e.p;
import com.health.openworkout.core.e.q;
import com.health.openworkout.core.e.r;
import com.health.openworkout.core.e.t;
import com.health.openworkout.core.e.v;
import com.health.openworkout.core.e.w;
import com.health.openworkout.core.e.z;
/* loaded from: classes.dex */
public class a extends WorkoutSession {

    /* renamed from: b */
    private float f3382b;

    public a(int i, float f2) {
        q qVar;
        this.f3382b = f2;
        switch (i) {
            case 0:
                d(new l(), 15);
                b(new f(), 5);
                b(new p(), 2);
                d(new v(), 5);
                b(new com.health.openworkout.core.e.a(), 5);
                d(new q(), 5);
                return;
            case 1:
                d(new l(), 15);
                b(new com.health.openworkout.core.e.a(), 10);
                b(new v(), 3);
                d(new j(), 15);
                b(new f(), 10);
                d(new q(), 10);
                return;
            case 2:
                d(new l(), 18);
                b(new e(), 4);
                d(new v(), 10);
                b(new r(), 10);
                b(new com.health.openworkout.core.e.a(), 10);
                qVar = new q();
                break;
            case 3:
                d(new l(), 22);
                b(new com.health.openworkout.core.e.c(), 10);
                b(new m(), 12);
                b(new p(), 4);
                qVar = new q();
                break;
            case 4:
                d(new l(), 25);
                d(new g(), 20);
                d(new v(), 20);
                b(new com.health.openworkout.core.e.a(), 12);
                b(new w(), 12);
                d(new q(), 18);
                return;
            case 5:
                d(new j(), 30);
                b(new com.health.openworkout.core.e.a(), 15);
                b(new p(), 15);
                d(new t(), 15);
                b(new f(), 15);
                d(new q(), 20);
                return;
            case 6:
                d(new l(), 30);
                b(new e(), 5);
                d(new z(), 20);
                b(new com.health.openworkout.core.e.a(), 16);
                d(new q(), 22);
                return;
            case 7:
                d(new l(), 35);
                b(new com.health.openworkout.core.e.a(), 16);
                d(new j(), 15);
                b(new f(), 15);
                d(new v(), 20);
                d(new q(), 25);
                return;
            default:
                return;
        }
        d(qVar, 15);
    }

    private void b(WorkoutItem workoutItem, int i) {
        workoutItem.setTimeMode(false);
        workoutItem.setRepetitionCount(Math.round(i * this.f3382b));
        addWorkout(workoutItem);
    }

    private void d(WorkoutItem workoutItem, int i) {
        workoutItem.setWorkoutTime(Math.round(i * this.f3382b));
        addWorkout(workoutItem);
    }
}
