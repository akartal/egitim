package com.uniyaz.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by AKARTAL on 5.12.2019.
 */
public class PolymorphismApp {

    public static List<Agac> agacList = new ArrayList<Agac>();

    public static void main(String[] args) {

//        Agac agac = new Cam();
//        agac.yaprakDok();
//
//        Agac agac1 = new Mese();
//        agac1.yaprakDok();
//
//        Cicek cicek = new Gul();
//        cicek.cicekAc();
//
//        Cicek cicek1 = new Orkide();
//        cicek1.cicekAc();
//
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Meşe");
            System.out.println("2. Çam");
            System.out.println("3. Listele");
            System.out.println("Tercihiniz:");

            int secim = scanner.nextInt();
            if (secim == 1) {
                scanner.nextLine();

                System.out.println("Meşenin adını giriniz");
                String adi = scanner.nextLine();
                Mese mese = new Mese();
                mese.setAd(adi);
                agacList.add(mese);
            } else if (secim == 2) {
                scanner.nextLine();

                System.out.println("Çam adını giriniz");
                String adi = scanner.nextLine();
                Cam cam = new Cam();
                cam.setAd(adi);
                agacList.add(cam);
            } else if (secim == 3){
                agaclarinYapraklariniDok(agacList);
            } else {
                break;
            }

        } while (true);
    }

    public static void agaclarinYapraklariniDok(List<Agac> agacList) {
        for (Agac agac : agacList) {
            agac.buyur();
            agac.yaprakDok();
        }

    }
}