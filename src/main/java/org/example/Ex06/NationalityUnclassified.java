package org.example.Ex06;

import java.util.Arrays;
import java.util.List;

public class NationalityUnclassified implements Flag {

    @Override
    public Nationality getNationality() {
        return Nationality.UNCLASSIFIED;
    }

    @Override
    public List<Color> getFlagColors() {
        return Arrays.asList(Color.GRAY);
    }
}
