import java.util.ArrayList;
import java.util.Scanner;

import jpFanerozoico.jpCocodrilo;
import jpMutacion.jpTanqueMutacion;
import jpProterozoico.jpAmniota;
import jpProterozoico.jpAnimal;
import jpProterozoico.jpGnathostomata;
import jpProterozoico.jpOsteichthyes;
import jpProterozoico.jpSarcopterygii;
import jpProterozoico.jpTetrapoda;

public class Controller {

    public void mostrarArbolFilogenetico() {

        jpGnathostomata gnathostomata = new jpGnathostomata("Gnathostomata");
        jpOsteichthyes osteichthyes = new jpOsteichthyes("Osteichthyes");
        jpSarcopterygii sarcopterygii = new jpSarcopterygii("Sarcopterygii");
        jpTetrapoda tetrapoda = new jpTetrapoda("Tetrapoda");
        jpAmniota amniota = new jpAmniota("Amniota");
        jpCocodrilo cocodrilo = new jpCocodrilo();
        jpTanqueMutacion mutacion = new jpTanqueMutacion();
        char[] jpSimbolos = { '\\', '|', '/', '-' };

        ArrayList<Object> jpLstClases = new ArrayList<>();
        jpLstClases.add(gnathostomata);
        jpLstClases.add(osteichthyes);
        jpLstClases.add(sarcopterygii);
        jpLstClases.add(tetrapoda);
        jpLstClases.add(amniota);
        jpLstClases.add(cocodrilo);

        Scanner scann = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cocodrilo: ");
        String jpNombreCocodrilo = scann.nextLine();
        cocodrilo.setJpnombre("Cocodrilo " + jpNombreCocodrilo + " ");

        for (int jpI = 0; jpI <= cocodrilo.getJpfamiliares(); jpI++) {
            int jpC = 0;
            try {
                for (int e = 0; e < 10; e++) {
                    if (jpC > 3) {
                        jpC = 0;
                    }
                    System.out.print("\r" + jpSimbolos[jpC]);
                    System.out.print(((e + 1) * 10) + "%");
                    Thread.sleep(333);
                    jpC++;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.print("---".repeat(jpI + 1));
            if (jpI == cocodrilo.getJpfamiliares()) {
                System.out.println(cocodrilo.getJpnombre());
            } else {
                jpAnimal animal = (jpAnimal) jpLstClases.get(jpI);
                System.out.println(animal.getJpClase());
            }
        }

        System.out.println("===========================================================================");

        cocodrilo.jpSaludar();

        System.out.print("Ingrese un nombre que lo identifique: ");
        String jpNombreBiologo = scann.nextLine();
        cocodrilo.jpSaludar(jpNombreBiologo);

        System.out.println("Ingrese el animal a mutar:");
        String jpNombreMutacion = scann.nextLine();
        scann.close();
        String jpNmombreMutado = mutacion.jpMutar(jpNombreMutacion);
        for (int jpI = 0; jpI <= cocodrilo.getJpfamiliares(); jpI++) {
            int jpC = 0;
            try {
                for (int e = 0; e < 10; e++) {
                    if (jpC > 3) {
                        jpC = 0;
                    }
                    System.out.print("\r" + jpSimbolos[jpC]);
                    System.out.print(((e + 1) * 10) + "%");
                    Thread.sleep(333);
                    jpC++;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.print("---".repeat(jpI + 1));
            if (jpI == cocodrilo.getJpfamiliares()) {
                System.out.println(jpNmombreMutado);
            } else {
                jpAnimal animal = (jpAnimal) jpLstClases.get(jpI);
                System.out.println(animal.getJpClase());
            }
        }
    }

}
