package com.annauniv.model;

public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    TRANSGENDER("Transgender");

    private final String displayName;

    Gender(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

