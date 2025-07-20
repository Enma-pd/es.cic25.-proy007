package es.cic25.proy007.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Croqueta {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Long croquetaId;
    private String saborCroqueta;
    private String restaurante;
    private int puntuacion;

    public Long getCroquetaId(){
        return croquetaId;
    }

    public void setCroquetaId(Long croquetaId) {
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((croquetaId == null) ? 0 : croquetaId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Croqueta other = (Croqueta) obj;
        if (croquetaId == null) {
            if (other.croquetaId != null)
                return false;
        } else if (!croquetaId.equals(other.croquetaId))
            return false;
        return true;
    }

    
}

