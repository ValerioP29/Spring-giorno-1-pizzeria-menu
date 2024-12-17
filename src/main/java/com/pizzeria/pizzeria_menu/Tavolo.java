package com.pizzeria.pizzeria_menu;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tavolo {
    private int numeroTavolo;
    private int maxCoperti;
    private boolean occupato;

    public Tavolo(int numeroTavolo, int maxCoperti, boolean occupato) {
        this.numeroTavolo = numeroTavolo;
        this.maxCoperti = maxCoperti;
        this.occupato = occupato;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numeroTavolo=" + numeroTavolo +
                ", maxCoperti=" + maxCoperti +
                ", occupato=" + occupato +
                '}';
    }
}
