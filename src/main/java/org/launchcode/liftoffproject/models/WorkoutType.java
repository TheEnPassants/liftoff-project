package org.launchcode.liftoffproject.models;

public enum WorkoutType {
    LOWERBODY("Lower Body"),
    UPPERBODY("Upper Body"),
    FULLBODY("Full Body"),
    CARDIO("Cardio"),
    YOGA("Yoga");
    private final String displayName;

    WorkoutType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
