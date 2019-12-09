package com.uniyaz.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by AKARTAL on 9.12.2019.
 */
public class IOSerializableApp {

    public static void main(String[] args) {

        List<Ilac> ilacList = new ArrayList<>();

        Ilac calpol = new Ilac(1, "CALPOL", EnumIlacTuru.SURUP);
        calpol.setUcret(30f);
        ilacList.add(calpol);

        Ilac apranax = new Ilac(2, "APRANAX", EnumIlacTuru.HAP);
        apranax.setUcret(20f);
        ilacList.add(apranax);

        Ilac dolven = new Ilac(3, "DOLVEN", EnumIlacTuru.SURUP);
        ilacList.add(dolven);

        Ilac serum = new Ilac(4, "ATEŞ DÜŞÜRÜCÜ SERUM", EnumIlacTuru.SERUM);
        ilacList.add(serum);

        ilaclariDosyayaObjeOlarakYaz(ilacList);
        
        ilacList = ilaclariDosyadanOku();
        for (Ilac ilac : ilacList) {
            System.out.println(ilac.getAdi());
        }

    }

    private static void ilaclariDosyayaObjeOlarakYaz(List<Ilac> ilacList) {

        try (FileOutputStream fileOut = new FileOutputStream(".\\Txt\\ilacObje.txt");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);) {
            objectOut.writeObject(ilacList);
            System.out.println("The Object  was succesfully written to a file");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static List<Ilac> ilaclariDosyadanOku() {
        List<Ilac> ilacList = null;
        try (FileInputStream fileOut = new FileInputStream(".\\Txt\\ilacObje.txt");
             ObjectInputStream objectOut = new ObjectInputStream(fileOut);) {
            ilacList = (List<Ilac>) objectOut.readObject();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return ilacList;
    }
}
