package com.uniyaz;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Malzeme malzeme = new Malzeme();
        malzeme.setId(1);
        malzeme.setFirma("ABCD");
        malzeme.setMalzemeTuru(EnumMalzemeTuru.AKCA);
        malzeme.setAgirlik((byte) 1);
        malzeme.setUretimYeri("TÜRKİYE");

        Gitar gitar = new Gitar();
        gitar.setId(1);
        gitar.setMalzeme(malzeme);
        gitar.setGitarTuru(EnumGitarTuru.AKUSTIK);
        gitar.setPerdeSayisi((byte) 8);

        Malzeme malzeme1 = new Malzeme();
        malzeme1.setUretimYeri("");

        System.out.println(malzeme.getUretimYeri());
        System.out.println(malzeme1.getUretimYeri());


        PersonelMaas personelMaas = new PersonelMaas();
        personelMaas.setCalistigiYilSayisi(3);
        personelMaas.setMaas(1000);

        float maas = personelMaas.getMaas();
        System.out.println(maas);
    }
}