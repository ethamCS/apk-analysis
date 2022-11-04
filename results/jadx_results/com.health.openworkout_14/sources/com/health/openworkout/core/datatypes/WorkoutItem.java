package com.health.openworkout.core.datatypes;

import android.content.Context;
import androidx.annotation.Keep;
import com.health.openworkout.R;
import com.health.openworkout.core.a;
@Keep
/* loaded from: classes.dex */
public class WorkoutItem implements Comparable<WorkoutItem>, Cloneable {
    private final transient Context context;
    private String description;
    private long elapsedTime;
    private String name;
    private long workoutItemId;
    private long workoutSessionId;
    private long orderNr = -1;
    private int prepTime = 5;
    private int workoutTime = 30;
    private int breakTime = 30;
    private int repetitionCount = 5;
    private boolean isTimeMode = true;
    private boolean finished = false;
    private boolean isVideoMode = true;
    private boolean isVideoPathExternal = false;
    private String videoPath = "idle.mp4";
    private boolean isImagePathExternal = false;
    private String imagePath = "idle.png";

    public WorkoutItem() {
        Context f2 = a.h().f();
        this.context = f2;
        this.name = "<" + f2.getString(R.string.label_new_workout_item) + ">";
        this.description = "<" + f2.getString(R.string.label_new_workout_item) + ">";
    }

    public WorkoutItem clone() {
        try {
            return (WorkoutItem) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException("failed to clone WorkoutItem", e2);
        }
    }

    public int compareTo(WorkoutItem workoutItem) {
        long j;
        long j2 = this.orderNr;
        if (j2 != -1) {
            long j3 = workoutItem.orderNr;
            if (j3 != -1) {
                j = j2 - j3;
                return (int) j;
            }
        }
        j = this.workoutItemId - workoutItem.workoutItemId;
        return (int) j;
    }

    public int getBreakTime() {
        return this.breakTime;
    }

    public final Context getContext() {
        return this.context;
    }

    public String getDescription() {
        return this.description;
    }

    public long getElapsedTime() {
        return this.elapsedTime;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public String getName() {
        return this.name;
    }

    public long getOrderNr() {
        return this.orderNr;
    }

    public int getPrepTime() {
        return this.prepTime;
    }

    public int getRepetitionCount() {
        return this.repetitionCount;
    }

    public String getVideoPath() {
        return this.videoPath;
    }

    public long getWorkoutItemId() {
        return this.workoutItemId;
    }

    public long getWorkoutSessionId() {
        return this.workoutSessionId;
    }

    public int getWorkoutTime() {
        return this.workoutTime;
    }

    public boolean isFinished() {
        return this.finished;
    }

    public boolean isImagePathExternal() {
        return this.isImagePathExternal;
    }

    public boolean isTimeMode() {
        return this.isTimeMode;
    }

    public boolean isVideoMode() {
        return this.isVideoMode;
    }

    public boolean isVideoPathExternal() {
        return this.isVideoPathExternal;
    }

    public void setBreakTime(int i) {
        this.breakTime = i;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setElapsedTime(long j) {
        this.elapsedTime = j;
    }

    public void setFinished(boolean z) {
        this.finished = z;
        if (!z) {
            this.elapsedTime = 0L;
        }
    }

    public void setImagePath(int i) {
        this.imagePath = this.context.getResources().getResourceEntryName(i);
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

    public void setPrepTime(int i) {
        this.prepTime = i;
    }

    public void setRepetitionCount(int i) {
        this.repetitionCount = i;
    }

    public void setTimeMode(boolean z) {
        this.isTimeMode = z;
    }

    public void setVideoMode(boolean z) {
        this.isVideoMode = z;
    }

    public void setVideoPath(String str) {
        this.videoPath = str;
    }

    public void setVideoPathExternal(boolean z) {
        this.isVideoPathExternal = z;
    }

    public void setWorkoutItemId(long j) {
        this.workoutItemId = j;
    }

    public void setWorkoutSessionId(long j) {
        this.workoutSessionId = j;
    }

    public void setWorkoutTime(int i) {
        this.workoutTime = i;
    }
}
