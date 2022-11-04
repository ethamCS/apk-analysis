package com.health.openworkout.core.datatypes;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class WorkoutSession implements Comparable<WorkoutSession>, Cloneable {
    public String name;
    private long trainingPlanId;
    private long workoutSessionId;
    private long orderNr = -1;
    private List<WorkoutItem> workoutItems = new ArrayList();
    private boolean finished = false;

    public WorkoutItem addWorkout(WorkoutItem workoutItem) {
        this.workoutItems.add(workoutItem);
        return workoutItem;
    }

    public WorkoutSession clone() {
        try {
            WorkoutSession workoutSession = (WorkoutSession) super.clone();
            for (WorkoutItem workoutItem : workoutSession.workoutItems) {
                workoutItem.setWorkoutItemId(0L);
            }
            return workoutSession;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException("failed to clone WorkoutSession", e2);
        }
    }

    public int compareTo(WorkoutSession workoutSession) {
        long j;
        long j2 = this.orderNr;
        if (j2 != -1) {
            long j3 = workoutSession.orderNr;
            if (j3 != -1) {
                j = j2 - j3;
                return (int) j;
            }
        }
        j = this.workoutSessionId - workoutSession.workoutSessionId;
        return (int) j;
    }

    public long getElapsedSessionTime() {
        long j = 0;
        for (WorkoutItem workoutItem : this.workoutItems) {
            j += workoutItem.getElapsedTime();
        }
        return j;
    }

    public String getName() {
        return this.name;
    }

    public WorkoutItem getNextWorkoutItem(long j) {
        for (WorkoutItem workoutItem : this.workoutItems) {
            if (!workoutItem.isFinished() && workoutItem.getOrderNr() >= j) {
                return workoutItem;
            }
        }
        for (WorkoutItem workoutItem2 : this.workoutItems) {
            if (!workoutItem2.isFinished()) {
                return workoutItem2;
            }
        }
        return null;
    }

    public long getOrderNr() {
        return this.orderNr;
    }

    public long getTrainingPlanId() {
        return this.trainingPlanId;
    }

    public List<WorkoutItem> getWorkoutItems() {
        return this.workoutItems;
    }

    public long getWorkoutSessionId() {
        return this.workoutSessionId;
    }

    public boolean isFinished() {
        return this.finished;
    }

    public void setFinished(boolean z) {
        this.finished = z;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOrderNr(long j) {
        this.orderNr = j;
    }

    public void setTrainingPlanId(long j) {
        this.trainingPlanId = j;
    }

    public void setWorkoutItems(List<WorkoutItem> list) {
        this.workoutItems = list;
    }

    public void setWorkoutSessionId(long j) {
        this.workoutSessionId = j;
    }
}
