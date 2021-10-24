package co.com.sofka.util;

public enum Gender {
    CHILD("Child"),
    OTHER("Other");

    private final String value;

    public String getValue() {
        return value;
    }

    Gender(String value) {
        this.value = value;
    }
}
