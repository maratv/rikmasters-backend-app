package com.vakhitov.driversandaccounts.model;

public enum Category {
    A("Motorcycles"),
    B("Cars"),
    C("Trucks"),
    D("Buses"),
    E("Trailers");

    private final String description;

    Category(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
