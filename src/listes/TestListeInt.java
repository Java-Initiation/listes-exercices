package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class TestListeInt {

    public static void main(String[] args) {

        ArrayList<Integer> entiers = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));

        for (Integer entier : entiers) {
            System.out.println(entier);
        }

        System.out.println("Taille de la liste " + entiers.size());

        int plusGrand = entiers.get(0);
        Integer plusPetit = entiers.get(0);

        for (int i = 1; i < entiers.size(); i++) {
            if (entiers.get(i) > plusGrand)
                plusGrand = entiers.get(i);
            if (entiers.get(i) < plusPetit)
                plusPetit = entiers.get(i);
        }

        System.out.println("Le plus grand est " + plusGrand);

        entiers.remove(plusPetit);


        System.out.println("Resultat sans le plus petit :");
        for (Integer entier : entiers) {
            System.out.println(entier);
        }


        for (int i = 0; i < entiers.size(); i++) {
            if (entiers.get(i) < 0)
                entiers.set(i, Math.abs(entiers.get(i)));
        }

        System.out.println("Resultat sans les negatifs :");
        for (Integer entier : entiers) {
            System.out.println(entier);
        }

    }

}
