package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * De creat clasa “Balaur” cu câteva câmpuri.(Varianta 8)
 * @author Hilea Ecaterina
 */


/**
 * Classa Balaur
 * Am creat clasa si campuri
 */
public class Balaur {

//    private static int nrDeBalauriCreati;//nr intregi in careva pastra nr de balauri creati
//    private int[] IQAlCapetelor = null;//vector dinamic in care pastreaza informatia despre IQ
//    private int nrTotaldeCapete;//nr total de capete ale unui balaur
//
//    /**
//     * Campuri obtionale
//     **/
//    private int varsta;
//    private float greutatea;
//    private String name;
//
//
//
//    /**
//     * Constructor implicit(fara parametri)
//     **/
//    public Balaur() {
//
//    }
//
//    /**Constructor cu parametri**/
//    /**
//     * @param IQAlCapetelor     -> vector dinamic in care pastreaza informatia despre IQ
//     * @param nrTotaldeCapete-> nr total de capete ale unui balaur
//     * @param varsta->varsta    param greutatea->greutatea
//     *                          param name->name
//     */
//    public Balaur(int[] IQAlCapetelor, int nrTotaldeCapete, int varsta, float greutatea, String name) {
//        this.IQAlCapetelor = IQAlCapetelor;
//        this.nrTotaldeCapete = nrTotaldeCapete;
//        this.varsta = varsta;
//        this.greutatea = greutatea;
//        this.name = name;
//    }
//
//    /**
//     * Constructor de copiere
//     **/
//    public Balaur(Balaur balaur) {
//        this.IQAlCapetelor = balaur.getIQAlCapetelor();
//        this.nrTotaldeCapete = balaur.getNrTotaldeCapete();
//        this.varsta = balaur.getVarsta();
//        this.greutatea = balaur.getGreutatea();
//        this.name = balaur.getName();
//    }
//
//
//    /**
//     * Metodele get si set
//     **/
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public static int getNrDeBalauriCreati() {
//        return nrDeBalauriCreati;
//    }
//
//    public static void setNrDeBalauriCreati(int nrDeBalauriCreati) {
//        Balaur.nrDeBalauriCreati = nrDeBalauriCreati;
//    }
//
//    public int[] getIQAlCapetelor() {
//        return IQAlCapetelor;
//    }
//
//    public void setIQAlCapetelor(int[] IQAlCapetelor) {
//        this.IQAlCapetelor = IQAlCapetelor;
//    }
//
//    public int getNrTotaldeCapete() {
//        return nrTotaldeCapete;
//    }
//
//    public void setNrTotaldeCapete(int nrTotaldeCapete) {
//        this.nrTotaldeCapete = nrTotaldeCapete;
//    }
//
//    public int getVarsta() {
//        return varsta;
//    }
//
//    public void setVarsta(int varsta) {
//        this.varsta = varsta;
//    }
//
//    public float getGreutatea() {
//        return greutatea;
//    }
//
//    public void setGreutatea(float greutatea) {
//        this.greutatea = greutatea;
//    }
//
//    /**
//     * Metoda pentru a afişa la ecran toată informaţia despre balaur, adică toate câmpurile din această clasă.
//     **/
//    @Override
//    public String toString() {
//        return "Balaur{" +
//                "IQAlCapetelor=" + Arrays.toString(IQAlCapetelor) +
//                ", nrTotaldeCapete=" + nrTotaldeCapete +
//                ", varsta=" + varsta +
//                ", greutatea=" + greutatea +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
//    /**
//     * Metoda care completeaza toate campurile obiectului cu valori citite de la tastatura.
//     **/
//    /**Metoda lenese**/
//    public void setFromKeyBoard() throws BalaurException {
//        // Accepta input de la user
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Dati numarul de capete a balaurului: ");
//        this.nrTotaldeCapete = scanner.nextInt();
//        this.IQAlCapetelor = new int[nrTotaldeCapete];
//        nrDeBalauriCreati += 1;
//
//        // Ciclul do-while nu va permite IQ unui numar mai mic decat 20 si mai mare decat 250
//        for (int iCapat = 0; iCapat < nrTotaldeCapete; iCapat++) {
//            /** Standart*/
//            try {
//                // Get input
//                System.out.print("Introduceti coeficientul de intelect al capetelui " + (iCapat + 1) + ": ");
//                int iqCapul = scanner.nextInt();
//
//                // Throw error if condition is not met
//                if (iqCapul > 250 || iqCapul < 20){
//                    throw new BalaurException(iqCapul);
//                } else {
//                    this.IQAlCapetelor[iCapat] = iqCapul;
//                }
//
//            } catch (BalaurException e) {
//                e.handle();
//                e.printStackTrace();
//            }
//
//
///**Metoda try in try**/
//            try {
//                try {
//                    Scanner var = new Scanner(System.in);
//
//                    System.out.print("Dati varsta balaurului: ");
//                    varsta = var.nextInt();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//                    Scanner gr = new Scanner(System.in);
//                    System.out.print("Dati greutatea balaurului: ");
//                    this.greutatea = gr.nextFloat();
//
//
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//            throw new BalaurException();
//
//        }
//
//    }
//
//
//            /**Metoda ,care completeaza toate campurile cu valori aleatoare**/
//            public void setRandom () {
//                Random random = new Random();
//                nrTotaldeCapete = random.nextInt(10);
//                nrDeBalauriCreati += 1;
//                this.IQAlCapetelor = new int[nrTotaldeCapete];
//                for (int i = 0; i < nrTotaldeCapete; i++) {
//                    IQAlCapetelor[i] = (byte) random.nextInt(6);
//                }
//                varsta = random.nextInt(50);
//                greutatea = (float) (random.nextFloat());
//
//                String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//                StringBuilder sb = new StringBuilder();
//                for (int i = 0; i < 8; i++) {
//                    sb.append(candidateChars.charAt(random.nextInt(candidateChars.length())));
//                }
//                this.name = sb.toString();
//            }
//
//
//    /**Metoda de lupta de IQ,cina are <IQ ,atunci el pierde cap**/
//    public static void cineEsteMaiDestept(Balaur primulBalaur, Balaur alDoileaBalaur) {
//        int primulBalaurTotal=0;
//        int alDoileaBalaurTotal=0;
//        for (int i = 0; i < primulBalaur.nrTotaldeCapete; i++) {
//            primulBalaurTotal+=primulBalaur.IQAlCapetelor[i];
//        }
//        for (int i = 0; i < alDoileaBalaur.nrTotaldeCapete; i++) {
//            alDoileaBalaurTotal+=alDoileaBalaur.IQAlCapetelor[i];
//        }
//        if (primulBalaurTotal > alDoileaBalaurTotal)
//        {
//            if (primulBalaur.name != null && alDoileaBalaur.name != null)
//            {
//                System.out.println(primulBalaur.name + " este mai destept decat " + alDoileaBalaur.name);
//            }
//            else
//            {
//                System.out.println("primulBalaur > alDoileaBalaur");
//            }
//        }
//        else if (alDoileaBalaurTotal > primulBalaurTotal)
//        {
//            if (primulBalaur.name != null && alDoileaBalaur.name != null)
//            {
//                System.out.println(alDoileaBalaur.name + " este mai destept decat " + primulBalaur.name);
//            }
//            else
//            {
//                System.out.println("alDoileaBalaur > primulBalaur");
//            }
//        }
//        else
//        {
//            System.out.println("Balaurii au acelasi coeficient de intelect");
//        }
//    }
//
//    public static void fight( Balaur primulBalaur, Balaur alDoileaBalaur) {
//
//        Random random = new Random();
//
//        Balaur randomBalaur;
//        if (random.nextBoolean()){
//            randomBalaur = primulBalaur;
//            System.out.println("Primul balaur a pierdut");
//        } else{
//            randomBalaur = alDoileaBalaur;
//            System.out.println("Al doilea balaur a pierdut");
//        }
//
//        //-1 capat si -un element din tabloul IQAlCapetelor
//        randomBalaur.setNrTotaldeCapete(randomBalaur.getNrTotaldeCapete()-1);
//        int[] iqAlCapetelor = randomBalaur.getIQAlCapetelor();
//        int index = iqAlCapetelor.length-1;//stergem de la array -1 element si returnam array nou
//        int[] updatedArray = IntStream.range(0, iqAlCapetelor.length)
//                .filter(i -> i != index)
//                .map(i -> iqAlCapetelor[i])
//                .toArray();
//        randomBalaur.setIQAlCapetelor(updatedArray);
//
//        System.out.println("Primul balaur: " + primulBalaur.toString());
//        System.out.println("Al doilea balaur: " + alDoileaBalaur.toString());
//
//    }
//
//    }
//
    private static int nrDeBalauriCreati;// nr intregi in careva pastra nr de balauri creati
    private int[] IQAlCapetelor = null;// vector dinamic in care pastreaza informatia despre IQ
    private int nrTotaldeCapete;// nr total de capete ale unui balaur

    // Optional
    private int varsta;
    private float greutatea;
    private String name;

    /**Constructor cu parametri**/
    /**
     * @param IQAlCapetelor     -> vector dinamic in care pastreaza informatia despre IQ
     * @param nrTotaldeCapete-> nr total de capete ale unui balaur
     * @param varsta->varsta    param greutatea->greutatea
     *                          param name->name
     */
    public Balaur(int[] IQAlCapetelor, int nrTotaldeCapete, int varsta, float greutatea, String name) {
        this.IQAlCapetelor = IQAlCapetelor;
        this.nrTotaldeCapete = nrTotaldeCapete;
        this.varsta = varsta;
        this.greutatea = greutatea;
        this.name = name;
    }

    public int getNrTotaldeCapete() {
        return nrTotaldeCapete;
    }

    public void setNrTotaldeCapete(int nrTotaldeCapete) {
        this.nrTotaldeCapete = nrTotaldeCapete;
    }

    public int[] getIQAlCapetelor() {
        return IQAlCapetelor;
    }

    public void setIQAlCapetelor(int[] IQAlCapetelor) {
        this.IQAlCapetelor = IQAlCapetelor;
    }

    /**
     * Metoda pentru a afişa la ecran toată informaţia despre balaur, adică toate câmpurile din această clasă.
     **/
    @Override
    public String toString() {
        return "Balaur{" +
                "IQAlCapetelor=" + Arrays.toString(IQAlCapetelor) +
                ", nrTotaldeCapete=" + nrTotaldeCapete +
                ", varsta=" + varsta +
                ", greutatea=" + greutatea +
                ", name='" + name + '\'' +
                '}';
    }

    public void getUserInputAndCheckValues(){
        int capat = getUserInput("Dati numarul de capete a balaurului: ");
        standardExceptionCapatul(capat, 0, 1000);
    }

    public int getUserInput(String question){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void standardExceptionCapatul(int value, int minimum, int maximum){
        if(value <= minimum|| value >= maximum) {
            try {
                throw new BalaurException(value, "Numarul de capete");
            } catch (BalaurException e) {
                e.printStackTrace();
            }
        }
    }

    public void lazyExceptionIQ(){

    }

    public void TryTryGreutate(){

    }

    /**
     * Metoda care completeaza toate campurile obiectului cu valori citite de la tastatura.
     **/
    /**Metoda lenese**/
    public void setFromKeyBoard() throws BalaurException {
        // Accepta input de la user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dati numarul de capete a balaurului: ");
        this.nrTotaldeCapete = scanner.nextInt();
        this.IQAlCapetelor = new int[nrTotaldeCapete];
        nrDeBalauriCreati += 1;

        // Ciclul do-while nu va permite IQ unui numar mai mic decat 20 si mai mare decat 250
        for (int iCapat = 0; iCapat < nrTotaldeCapete; iCapat++) {
            /** Standart*/
            try {
                // Get input
                System.out.print("Introduceti coeficientul de intelect al capetelui " + (iCapat + 1) + ": ");
                int iqCapul = scanner.nextInt();

                // Throw error if condition is not met
                if (iqCapul > 250 || iqCapul < 20){
                    throw new BalaurException(iqCapul);
                } else {
                    this.IQAlCapetelor[iCapat] = iqCapul;
                }

            } catch (BalaurException e) {
                e.handle();
                e.printStackTrace();
            }


/**Metoda try in try**/
            try {
                try {
                    Scanner var = new Scanner(System.in);

                    System.out.print("Dati varsta balaurului: ");
                    varsta = var.nextInt();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                Scanner gr = new Scanner(System.in);
                System.out.print("Dati greutatea balaurului: ");
                this.greutatea = gr.nextFloat();



            } catch (Exception e) {
                e.printStackTrace();
            }

            throw new BalaurException();

        }

    }


    /**Metoda ,care completeaza toate campurile cu valori aleatoare**/
    public void setRandom () {
        Random random = new Random();
        nrTotaldeCapete = random.nextInt(10);
        nrDeBalauriCreati += 1;
        this.IQAlCapetelor = new int[nrTotaldeCapete];
        for (int i = 0; i < nrTotaldeCapete; i++) {
            IQAlCapetelor[i] = (byte) random.nextInt(6);
        }
        varsta = random.nextInt(50);
        greutatea = (float) (random.nextFloat());

        String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sb.append(candidateChars.charAt(random.nextInt(candidateChars.length())));
        }
        this.name = sb.toString();
    }


    /**Metoda de lupta de IQ,cina are <IQ ,atunci el pierde cap**/
    public static void cineEsteMaiDestept(Balaur primulBalaur, Balaur alDoileaBalaur) {
        int primulBalaurTotal=0;
        int alDoileaBalaurTotal=0;
        for (int i = 0; i < primulBalaur.nrTotaldeCapete; i++) {
            primulBalaurTotal+=primulBalaur.IQAlCapetelor[i];
        }
        for (int i = 0; i < alDoileaBalaur.nrTotaldeCapete; i++) {
            alDoileaBalaurTotal+=alDoileaBalaur.IQAlCapetelor[i];
        }
        if (primulBalaurTotal > alDoileaBalaurTotal)
        {
            if (primulBalaur.name != null && alDoileaBalaur.name != null)
            {
                System.out.println(primulBalaur.name + " este mai destept decat " + alDoileaBalaur.name);
            }
            else
            {
                System.out.println("primulBalaur > alDoileaBalaur");
            }
        }
        else if (alDoileaBalaurTotal > primulBalaurTotal)
        {
            if (primulBalaur.name != null && alDoileaBalaur.name != null)
            {
                System.out.println(alDoileaBalaur.name + " este mai destept decat " + primulBalaur.name);
            }
            else
            {
                System.out.println("alDoileaBalaur > primulBalaur");
            }
        }
        else
        {
            System.out.println("Balaurii au acelasi coeficient de intelect");
        }
    }

    public static void fight( Balaur primulBalaur, Balaur alDoileaBalaur) {

        Random random = new Random();

        Balaur randomBalaur;
        if (random.nextBoolean()){
            randomBalaur = primulBalaur;
            System.out.println("Primul balaur a pierdut");
        } else{
            randomBalaur = alDoileaBalaur;
            System.out.println("Al doilea balaur a pierdut");
        }

        //-1 capat si -un element din tabloul IQAlCapetelor
        randomBalaur.setNrTotaldeCapete(randomBalaur.getNrTotaldeCapete()-1);
        int[] iqAlCapetelor = randomBalaur.getIQAlCapetelor();
        int index = iqAlCapetelor.length-1;//stergem de la array -1 element si returnam array nou
        int[] updatedArray = IntStream.range(0, iqAlCapetelor.length)
                .filter(i -> i != index)
                .map(i -> iqAlCapetelor[i])
                .toArray();
        randomBalaur.setIQAlCapetelor(updatedArray);

        System.out.println("Primul balaur: " + primulBalaur.toString());
        System.out.println("Al doilea balaur: " + alDoileaBalaur.toString());

    }

}



