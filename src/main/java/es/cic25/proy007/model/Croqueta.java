package es.cic25.proy007.model;

public class Croqueta {
    
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

