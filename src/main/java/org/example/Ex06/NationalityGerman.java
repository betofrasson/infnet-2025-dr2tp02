package org.example.Ex06;

import java.util.Arrays;
import java.util.List;

public class NationalityGerman implements Flag {
    @Override
    public Nationality getNationality() {
        return Nationality.GERMAN;
    }

    @Override
    public List<Color> getFlagColors() {
        return Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW);
    }
}
