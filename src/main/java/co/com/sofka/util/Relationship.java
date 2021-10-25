package co.com.sofka.util;

public enum Relationship {
    CHILD("Child"),
    OTHER("Other");

    private final String value;

    public String getValue() {
        return value;
    }

    Relationship(String value) {
        this.value = value;
    }
}
