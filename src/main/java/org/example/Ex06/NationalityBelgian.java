package org.example.Ex06;

import java.util.Arrays;
import java.util.List;

public class NationalityBelgian implements Flag {
    @Override
    public Nationality getNationality() {
        return Nationality.BELGIAN;
    }

    @Override
    public List<Color> getFlagColors() {
        return Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED);
    }
}
