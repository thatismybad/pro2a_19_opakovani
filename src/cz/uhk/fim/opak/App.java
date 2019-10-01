package cz.uhk.fim.opak;

import cz.uhk.fim.opak.model.Student;

import java.util.function.DoubleToIntFunction;

public class App {
    public static void main(String[] args) {
//        new App().vypisSlovo("asdghaskjhdjk");
//        App.vypisNecoJineho("asdhasjkhdkjas");

//        int[] pole = {1, 2, 3, 4};
//        String[] pole2 = {"Bafan", "Ahoj"};
//        new App().vypisPole(pole);
//        new App().vypisPole(pole2);

        Student s = new Student(
                "Michal",
                "Macinka",
                "I1800888",
                "macinmi1",
                "michal.macinka@uhk.cz",
                40,
                1
        );
        System.out.println(s.isMuzeDoDalsihoRoku());
    }

    public void vypisSlovo(String slovo) {
        System.out.println(slovo);
    }

    public static void vypisNecoJineho(String slovo) {
        System.out.println(slovo);
    }

    public void vypisPole(int[] pole) {
        for (int i = 0; i < pole.length; i++) {
            System.out.println(pole[i]);
        }
    }

    public void vypisPole(String[] pole) {
        for (int i = 0; i < pole.length; i++) {
            System.out.println(pole[i] + " - "+ pole[i].length());
            for (int j = 0; j < pole[i].length(); j++) {
                System.out.print(pole[i].charAt(j)+ " ");
            }
        }
    }
}
