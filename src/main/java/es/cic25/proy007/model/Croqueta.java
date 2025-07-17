package es.cic25.proy007.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Croqueta {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long croquetaId;

    private String saborCroqueta;

    private String restaurante;

    private int puntuacion;

    public long getCroquetaId(){
        return croquetaId;
    }

    public void setCroquetaId(long croquetaId) {
        this.croquetaId=croquetaId;
    }


    public String getSaborCroqueta() {
        return saborCroqueta;
    }


    public void setSaborCroqueta(String saborCroqueta) {
        this.saborCroqueta = saborCroqueta;
    }


    public String getRestaurante() {
        return restaurante;
    }


    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }


    public int getPuntuacion() {
        return puntuacion;
    }


    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}

