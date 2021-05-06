/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Xerioms
 */
public class Despacho {

    public Despacho() {
    }
    
    public Despacho(int idEstado, String tipoEstado) {
        this.idEstado = idEstado;
        this.tipoEstado = tipoEstado;
    }
    
    /**
     * @return the idEstado
     */
    public int getIdEstado() {
        return idEstado;
    }

    /**
     * @param idEstado the idEstado to set
     */
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    /**
     * @return the tipoEstado
     */
    public String getTipoEstado() {
        return tipoEstado;
    }

    /**
     * @param tipoEstado the tipoEstado to set
     */
    public void setTipoEstado(String tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    private int idEstado;
    private String tipoEstado;

    
}
