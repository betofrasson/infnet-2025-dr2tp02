package org.example.Ex06;

public class NationalityService {

    public static void main(String[] args) {
        Flag flag = FlagFactory.getFlagColors(Nationality.DUTCH);
        System.out.println(flag.getNationality()+" - "+flag.getFlagColors());

        Flag flag2 = FlagFactory.getFlagColors(Nationality.FRENCH);
        System.out.println(flag2.getNationality()+" - "+flag2.getFlagColors());
    }
}
