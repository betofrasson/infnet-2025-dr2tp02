package org.example.Ex06;

import java.util.Arrays;
import java.util.List;

public class NationalityItalian implements Flag {
    @Override
    public Nationality getNationality() {
        return Nationality.ITALIAN;
    }

    @Override
    public List<Color> getFlagColors() {
        return Arrays.asList(Color.GREEN, Color.WHITE, Color.RED);
    }
}
