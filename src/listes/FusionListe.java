package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

    public static void main(String args[]) {

        List<String> liste1 = new ArrayList<>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        ArrayList<String> liste3 = new ArrayList<>();
        liste3.addAll(liste1);
        liste3.addAll(liste2);

        for (String s : liste3) {
            System.out.println(s);
        }

    }
}