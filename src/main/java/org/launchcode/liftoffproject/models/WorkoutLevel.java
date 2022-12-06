package org.launchcode.liftoffproject.models;

public enum WorkoutLevel {
    BEGGINER("Begginer"),
    INTERMEDIATE("Intermediate"),
    ADVANCED("Advanced");

    private final String displayName;

    WorkoutLevel(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
