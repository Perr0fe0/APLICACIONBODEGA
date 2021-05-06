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
public class Producto {

    private int codigo;
    private String nombre;
    private String elaboracion;
    private String vencimiento;
    private String unitario;
    private String marca;
    private String descripcion;

    public Producto() {
    }
    
    public Producto(int codigo, String nombre, String elaboracion, String vencimiento, String unitario, String marca, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.elaboracion = elaboracion;
        this.vencimiento = vencimiento;
        this.unitario = unitario;
        this.marca = marca;
        this.descripcion = descripcion;
    }
    
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the elaboracion
     */
    public String getElaboracion() {
        return elaboracion;
    }

    /**
     * @param elaboracion the elaboracion to set
     */
    public void setElaboracion(String elaboracion) {
        this.elaboracion = elaboracion;
    }

    /**
     * @return the vencimiento
     */
    public String getVencimiento() {
        return vencimiento;
    }

    /**
     * @param vencimiento the vencimiento to set
     */
    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    /**
     * @return the unitario
     */
    public String getUnitario() {
        return unitario;
    }

    /**
     * @param unitario the unitario to set
     */
    public void setUnitario(String unitario) {
        this.unitario = unitario;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
    
}
