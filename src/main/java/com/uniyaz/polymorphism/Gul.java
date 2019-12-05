package com.uniyaz.polymorphism;

/**
 * Created by AKARTAL on 5.12.2019.
 */
public class Gul extends Cicek {

    private boolean dikenli;

    public boolean isDikenli() {
        return dikenli;
    }

    public void setDikenli(boolean dikenli) {
        this.dikenli = dikenli;
    }

    @Override
    public void cicekAc() {
        System.out.println("Gül çok güzel çiçek açar");
    }
}
