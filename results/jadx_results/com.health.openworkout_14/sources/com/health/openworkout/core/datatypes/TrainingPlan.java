package com.health.openworkout.core.datatypes;

import android.content.Context;
import androidx.annotation.Keep;
import com.health.openworkout.R;
import com.health.openworkout.core.a;
import java.util.ArrayList;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class TrainingPlan implements Comparable<TrainingPlan>, Cloneable {
    private final transient Context context;
    private String name;
    private long trainingPlanId;
    private long orderNr = -1;
    private int countFinishedTraining = 0;
    private List<WorkoutSession> workoutSessions = new ArrayList();
    private boolean isImagePathExternal = false;
    private String imagePath = "defaultTraining.png";

    public TrainingPlan() {
        Context f2 = a.h().f();
        this.context = f2;
        this.name = "<" + f2.getString(R.string.label_new_training_plan) + ">";
    }

    public void addWorkoutSession(WorkoutSession workoutSession) {
        this.workoutSessions.add(workoutSession);
    }

    public TrainingPlan clone() {
        try {
            TrainingPlan trainingPlan = (TrainingPlan) super.clone();
            for (WorkoutSession workoutSession : trainingPlan.workoutSessions) {
                workoutSession.setWorkoutSessionId(0L);
                for (WorkoutItem workoutItem : workoutSession.getWorkoutItems()) {
                    workoutItem.setWorkoutItemId(0L);
                }
            }
            return trainingPlan;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException("failed to clone TrainingPlan", e2);
        }
    }

    public int compareTo(TrainingPlan trainingPlan) {
        long j;
        long j2 = this.orderNr;
        if (j2 != -1) {
            long j3 = trainingPlan.orderNr;
            if (j3 != -1) {
                j = j2 - j3;
                return (int) j;
            }
        }
        j = this.trainingPlanId - trainingPlan.trainingPlanId;
        return (int) j;
    }

    public int finishedSessionSize() {
        int i = 0;
        for (WorkoutSession workoutSession : this.workoutSessions) {
            if (workoutSession.isFinished()) {
                i++;
            }
        }
        return i;
    }

    public Context getContext() {
        return this.context;
    }

    public int getCountFinishedTraining() {
        return this.countFinishedTraining;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public String getName() {
        return this.name;
    }

    public WorkoutSession getNextWorkoutSession() {
        for (WorkoutSession workoutSession : this.workoutSessions) {
            if (!workoutSession.isFinished()) {
                return workoutSession;
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

    public int getWorkoutSessionSize() {
        return this.workoutSessions.size();
    }

    public List<WorkoutSession> getWorkoutSessions() {
        return this.workoutSessions;
    }

    public boolean isImagePathExternal() {
        return this.isImagePathExternal;
    }

    public void setCountFinishedTraining(int i) {
        this.countFinishedTraining = i;
    }

    public void setImagePath(String str) {
        this.imagePath = str;
    }

    public void setImagePathExternal(boolean z) {
        this.isImagePathExternal = z;
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

    public void setWorkoutSessions(List<WorkoutSession> list) {
        this.workoutSessions = list;
    }

    public String toString() {
        return this.name;
    }
}
