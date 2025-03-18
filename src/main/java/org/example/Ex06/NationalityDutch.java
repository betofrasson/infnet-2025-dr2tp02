package org.example.Ex06;

import java.util.Arrays;
import java.util.List;

public class NationalityDutch implements Flag {

    @Override
    public Nationality getNationality() {
        return Nationality.DUTCH;
    }

    @Override
    public List<Color> getFlagColors() {
        return Arrays.asList(Color.RED, Color.WHITE, Color.BLUE);
    }
}
