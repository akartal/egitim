package com.uniyaz;

public class Gitar {

    private int id;
    private EnumGitarTuru gitarTuru;
    private Malzeme malzeme;
    private byte perdeSayisi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EnumGitarTuru getGitarTuru() {
        return gitarTuru;
    }

    public void setGitarTuru(EnumGitarTuru gitarTuru) {
        this.gitarTuru = gitarTuru;
    }

    public Malzeme getMalzeme() {
        return malzeme;
    }

    public void setMalzeme(Malzeme malzeme) {
        this.malzeme = malzeme;
    }

    public byte getPerdeSayisi() {
        return perdeSayisi;
    }

    public void setPerdeSayisi(byte perdeSayisi) {
        this.perdeSayisi = perdeSayisi;
    }
}