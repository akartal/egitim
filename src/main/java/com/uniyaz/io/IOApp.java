package com.uniyaz.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by AKARTAL on 9.12.2019.
 */
public class IOApp {

    public static void main(String[] args) {

        List<Ilac> ilacList = new ArrayList<>();

        Ilac calpol = new Ilac(1, "CALPOL", EnumIlacTuru.SURUP);
        ilacList.add(calpol);

        Ilac apranax = new Ilac(2, "APRANAX", EnumIlacTuru.HAP);
        ilacList.add(apranax);

        Ilac dolven = new Ilac(3, "DOLVEN", EnumIlacTuru.SURUP);
        ilacList.add(dolven);

        Ilac serum = new Ilac(4, "ATEŞ DÜŞÜRÜCÜ SERUM", EnumIlacTuru.SERUM);
        ilacList.add(serum);

        //ilaclariDosyayaYaz(ilacList);
        ilaclariDosyayaYazBuffered(ilacList);
        yazdir();
    }

    private static void ilaclariDosyayaYaz(List<Ilac> ilacList) {

        try {
            File file = new File(".\\Txt\\ilac.txt");
            FileWriter fileWriter = new FileWriter(file);
            for (Ilac ilac : ilacList) {
                fileWriter.write(ilac.getAdi() + "\n");
            }
            fileWriter.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void ilaclariDosyayaYazBuffered(List<Ilac> ilacList) {

        File file = new File(".\\Txt\\ilac.txt");
        try (
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
            ) {
            for (Ilac ilac : ilacList) {
                bufferedWriter.write(ilac.getAdi() + "\n");
            }
            bufferedWriter.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void yazdir() {
        try {
            String str = "Bu gün hava biraz serin";
            FileWriter fileWriter = new FileWriter(".\\Txt\\ilac.txt");
            fileWriter.append(str);
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}