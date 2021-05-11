package listes;

import models.Ville;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestVille {

    public static void main(String[] args) {

        ArrayList<Ville> villes = new ArrayList<>(Arrays.asList(new Ville("Nice", 343_000), new Ville("Carcassonne", 47_800),
                new Ville("Narbonne", 53_400), new Ville("Lyon", 484_000), new Ville("Foix", 9_700),
                new Ville("Pau", 77_200), new Ville("Marseille", 850_700), new Ville("Tarbes", 40_600)));

        // Je recupère la ville la plus peuplée
        Ville villeLaPlusPeuplee = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNombreHabitants() > villeLaPlusPeuplee.getNombreHabitants())
                villeLaPlusPeuplee = ville;
        }
        System.out.println("Ville la plus peuplée : " + villeLaPlusPeuplee);

        // Je supprime la ville la moins peuplée
        int indexVilleMoinsPeuplee = 0;
        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).getNombreHabitants() <= villes.get(indexVilleMoinsPeuplee).getNombreHabitants())
                indexVilleMoinsPeuplee = i;
        }
        villes.remove(indexVilleMoinsPeuplee);

        // Mettre en majuscule les villes de plus de 100_000 habitants
        for (Ville ville : villes) {
            if (ville.getNombreHabitants() > 100000)
                ville.setNom(ville.getNom().toUpperCase());
        }


        // On affiche le resultat
        for (Ville ville : villes) {
            System.out.println(ville);
        }


    }

}
