package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws BalaurException {
        /**variabila flag-a fost erori sau nu*/
        boolean flag = false;
        do {
            flag = false;
            try {
                System.out.println("Inroduceti datele");
            } catch (Exception p) {

                flag = true;
            }
        }
            while (flag != false);


            //Cream 2 obiecte al classei Balaur
            Balaur balaur = new Balaur();
            Balaur balaur1 = new Balaur(new int[]{59, 63, 99}, 3, 4, 8, "Jake");
            Balaur balaur2 = new Balaur(balaur1);

            //Indicam metoda de completarea campurile obiectului
            balaur.setFromKeyBoard();
            balaur2.setRandom();

            //creem un vector de balauri
            Balaur[] balauri = new Balaur[3];
            balauri[0] = balaur;
            balauri[1] = balaur1;
            balauri[2] = balaur2;

            //Printam in ciclu informatia despre fiecare obiect
            for (Balaur b : balauri) {
                System.out.println(b.toString());
            }

            Balaur.fight(balaur, balaur1);

            //Aflam care balaur este ai destept
            Balaur.cineEsteMaiDestept(balaur, balaur2);

            //Afisam numarul total de balauri nascuti
            System.out.println("Numarul total de balauri creati: " + Balaur.getNrDeBalauriCreati());


            /*Salvare datelor in fisier*/
            PrintWriter out = null;
            System.out.println("Introcudeci numele fisierului: ");
            Scanner scan = new Scanner(System.in);
            String fileName = scan.next();
            try {
                out = new PrintWriter(fileName + ".txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < balauri.length; i++) {
                out.println("Balaur nr: " + (i + 1));
                out.println("Numele balaurului : " + balaur.getNrTotaldeCapete());
                for (int j = 0; j < balaur.getIQAlCapetelor().length; j++) {
                    out.println("Coeficientul de inteligenta al capetului: " + j + " este " + balaur.getIQAlCapetelor()[j]);
                }
                out.println("Nr total de capete: " + balaur.getNrTotaldeCapete());
                out.println("Varsta : " + balaur.getVarsta());
                out.println("Greutatea : " + balaur.getGreutatea());
            }
            out.close();




    }
}
