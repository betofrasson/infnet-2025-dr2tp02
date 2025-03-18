package org.example.Ex06;

import java.util.Arrays;
import java.util.List;

public class NationalityFrench implements Flag {
    @Override
    public Nationality getNationality() {
        return Nationality.FRENCH;
    }

    @Override
    public List<Color> getFlagColors() {
        return Arrays.asList(Color.BLUE, Color.WHITE, Color.RED);
    }
}
