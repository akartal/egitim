package com.uniyaz.polymorphism;

/**
 * Created by AKARTAL on 6.12.2019.
 */
public class FotosentezApp {

    public static void main(String[] args) {
        
        Cam cam = new Cam();
        cam.setAd("ÇAM 1");

        Cam cam2 = new Cam();
        cam2.setAd("ÇAM 2");

        Cam cam3 = new Cam();
        cam3.setAd("ÇAM 3");


        Mese mese = new Mese();
        mese.setAd("MEŞE 1");

        Mese mese2 = new Mese();
        mese2.setAd("MEŞE 2");

        Mese mese3 = new Mese();
        mese3.setAd("MEŞE 3");

        // ........
        // ........
        // ........
        // ........
        // ........
        // ........
        // ........

        camFotosentezYaptir(cam);
        meseFotosentezYaptir(mese);

        fotosentezYaptir(cam);
        fotosentezYaptir(mese2);
        fotosentezYaptir(cam2);
        fotosentezYaptir(mese3);
        fotosentezYaptir(cam3);
    }

    private static void fotosentezYaptir(FotosentezYapabilir fotosentezYapabilir) {
        if (fotosentezYapabilir instanceof Cam) {
            Cam cam = (Cam) fotosentezYapabilir;
            String ad = cam.getAd();
            System.out.println(ad + " TEST ÇAM AĞACI");
        }
        fotosentezYapabilir.fotosentezYapar();
    }

    private static void fotosentezYaptir(Agac agac) {
        agac.fotosentezYapar();
    }

    private static void fotosentezYaptir(Cam cam) {
        cam.fotosentezYapar();
    }

    private static void fotosentezYaptir(Mese mese) {
        mese.fotosentezYapar();
    }
    
    private static void camFotosentezYaptir(Cam cam) {
        cam.fotosentezYapar();
    }

    private static void meseFotosentezYaptir(Mese mese) {
        mese.fotosentezYapar();
    }
}
