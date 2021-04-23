package org.corso.giornalaio;

public class Abbonamento {
    
    private String idAbbonamento;
    private String idCliente;
    private String idRivista;
    private boolean attivo;
    private Integer giorno;

    

    public Abbonamento() {
    }

   
    public Abbonamento(String idAbbonamento, String idCliente, String idRivista, boolean attivo,Integer giorno) {
        this.idAbbonamento = idAbbonamento;
        this.idCliente = idCliente;
        this.idRivista = idRivista;
        this.attivo = attivo;
        this.giorno = giorno;
    }

    
    
    public Integer getGiorno() {
        return giorno;
    }


    public void setGiorno(Integer giorno) {
        this.giorno = giorno;
    }


    public boolean isAttivo() {
        return attivo;
    }


    public void setAttivo(boolean attivo) {
        this.attivo = attivo;
    }


    public String getIdAbbonamento() {
        return idAbbonamento;
    }
    public void setIdAbbonamento(String idAbbonamento) {
        this.idAbbonamento = idAbbonamento;
    }
    public String getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    public String getIdRivista() {
        return idRivista;
    }
    public void setIdRivista(String idRivista) {
        this.idRivista = idRivista;
    }

    

}
