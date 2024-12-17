package com.pizzeria.pizzeria_menu;

import java.time.LocalTime;
import java.util.List;

public class Ordine {
    public enum StatoOrdine {IN_CORSO, SERVITO, PRONTO}

    private int numeroOrdine;
    private StatoOrdine stato;
    private Tavolo tavolo;
    private List<MenuItem> elementi;
    private int coperti;
    private LocalTime oraAcquisizione;
    private double importoTotale;

    public Ordine(int numeroOrdine, StatoOrdine stato, Tavolo tavolo, List<MenuItem> elementi, int coperti, LocalTime oraAcquisizione, double importoTotale) {

        this.numeroOrdine = numeroOrdine;
        this.stato = stato;
        this.tavolo = tavolo;
        this.elementi = elementi;
        this.coperti = coperti;
        this.oraAcquisizione = oraAcquisizione;
        this.importoTotale = importoTotale;

        this.importoTotale = calcolaTotale(copertoCosto);
    }
    private double calcolaTotale(double copertoCosto ) {
        double totale = coperti*copertoCosto;
        for (MenuItem item: elementi) {
            totale+= item.getPrezzo();
        }
    }

}
