package org.example.Ex06;

public class FlagFactory {
    public static Flag getFlagColors(Nationality nationality) {
        return switch (nationality) {
            case DUTCH -> new NationalityDutch();
            case GERMAN -> new NationalityGerman();
            case BELGIAN -> new NationalityBelgian();
            case FRENCH -> new NationalityFrench();
            case ITALIAN -> new NationalityItalian();
            default -> new NationalityUnclassified();
        };
    }
}
