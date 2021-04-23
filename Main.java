package org.corso.giornalaio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    static  Map<String,Rivista> mRivista = new HashMap<>();
    static  Map<String,Cliente> mCliente = new HashMap<>();
    static  Map<String,Abbonamento> mAbbonamento = new HashMap<>();
    static  List<String> giorniSettimana = new ArrayList<>();



    public static void main(String[] args) {

        giorniSettimana.add("lunedi");
        giorniSettimana.add("martedi");
        giorniSettimana.add("mercoledi");
        giorniSettimana.add("giovedi");
        giorniSettimana.add("venerdi");
        giorniSettimana.add("sabato");
        giorniSettimana.add("domenica");
        
        Rivista riviste = new Rivista( "Carcetto", "Sport", 2, "R01");
        mRivista.put(riviste.getIdRivista(),riviste);
         riviste = new Rivista( "Fashion", "Moda", 1, "R02");
        mRivista.put(riviste.getIdRivista(),riviste);
       riviste = new Rivista( "Faidate", "Hobby", 3, "R03");
        mRivista.put(riviste.getIdRivista(),riviste);

        Cliente clienti = new Cliente("Alessandro", "Forsetti", "Via Milano","C01");
        mCliente.put(clienti.getIdCliente(), clienti);
        clienti = new Cliente("Carlo", "Celano", "Via Napoli","C02");
        mCliente.put(clienti.getIdCliente(), clienti);
        clienti = new Cliente("Emanuele", "Pugliatto", "Via Roma","C03");
        mCliente.put(clienti.getIdCliente(), clienti);

        Abbonamento abbonamenti = new Abbonamento("A001", "C01", "R01", true,mRivista.get("R01").getGiorno());
        mAbbonamento.put(abbonamenti.getIdAbbonamento(), abbonamenti);
        abbonamenti = new Abbonamento("A002", "C02", "R02", true,mRivista.get("R02").getGiorno());
        mAbbonamento.put(abbonamenti.getIdAbbonamento(), abbonamenti);
        abbonamenti = new Abbonamento("A003", "C03", "R03", true,mRivista.get("R03").getGiorno());
        mAbbonamento.put(abbonamenti.getIdAbbonamento(), abbonamenti);

        for(int i = 1;i<8;i++){

            for(String keyab : mAbbonamento.keySet()){
                Abbonamento ab = mAbbonamento.get(keyab);
                if(ab.getGiorno() == i){
                    String ncli;
                    String nriv;
                    String messaggio;
                    ncli = mCliente.get(ab.getIdCliente()).getNome() + " " + mCliente.get(ab.getIdCliente()).getCognome();
                    nriv = mRivista.get(ab.getIdRivista()).getNome();
                    messaggio = giorniSettimana.get(i-1);
                    messaggio = messaggio + "\n ========== \n ";
                    messaggio = messaggio + "Inviare a " + ncli + " : \n";
                    messaggio = messaggio + nriv;
                     
                    System.out.println(messaggio);
                   
                }
            }

        }


    }

   


}
