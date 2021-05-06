/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Despacho;
import modelo.Producto;
import Conexion.Connect;

/**
 *
 * @author Xerioms
 */
public class Registro {
    public void Agregar(Producto p) throws SQLException {

        try {

            if (p.getCodigo() < 1) {
                JOptionPane.showMessageDialog(null, "Complete todos los campos!");
            } else {
                
                    System.out.println("Insertar registro ...");

                    Statement s = Conexion.Connect().createStatement();

                    String query1 = "insert into Producto (idProducto, nombre, descripcion, fecha_elab, fecha_ven, precio_unitario, marca) values (" + p.getCodigo() + ",\'" + p.getNombre() + "\',\'" + p.getDescripcion() + "\',\'" + p.getElaboracion() + "\',\'" + p.getVencimiento() + "\'," + p.getUnitario() + ",\'" + p.getMarca() + ")";

                    s.executeUpdate(query1);

                    JOptionPane.showMessageDialog(null, "Agregado Satisfactoriamente");
                
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public DefaultTableModel mostrar() throws SQLException {

        String query2 = "select * from Bodega.Estado";
        Object[] datos = new Object[2];
        Object[] columnas = {"idEstado", "tipo_estado"};

        DefaultTableModel modelo = new DefaultTableModel(null, columnas);

        try {
            Statement s = Conexion.Connect().createStatement();
            ResultSet r = s.executeQuery(query2);

            while (r.next()) {
                datos[0] = r.getInt(1);
                datos[1] = r.getString(2);

                modelo.addRow(datos);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos!");
        }
        return modelo;

    }
    
    public DefaultTableModel buscar(int cod) throws SQLException {

        String query2 = "select * from Bodega.Estado where idEstado=" + cod;
        Object[] datos = new Object[2];
        Object[] columnas = {"idEstado", "tipo_estado"};

        DefaultTableModel modelo = new DefaultTableModel(null, columnas);

        try {
            Statement s = Conexion.Connect().createStatement();
            ResultSet r = s.executeQuery(query2);

            while (r.next()) {
                datos[0] = r.getInt(1);
                datos[1] = r.getString(2);

                modelo.addRow(datos);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos!");
        }
        return modelo;

    }
    
    public int buscarCodigo(int cod) throws SQLException {

        int respuesta = 0;
        String query2 = "select * from Bodega.Estado where idEstado=" + cod;

        try {
            Statement s = Conexion.Connect().createStatement();
            ResultSet r = s.executeQuery(query2);

            while (r.next()) {
                respuesta = 1;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró el despacho asociado!");
        }
        return respuesta;

    }
    
    public void modificar(Despacho d) throws SQLException {
        try {
            System.out.println("Modificando registro ...");

            Statement s = Conexion.Connect().createStatement();

            String query1 = "update Estado.Despacho set tipoEstado=\'" + d.getTipoEstado()+ " where codigo=" + d.getIdEstado();

            s.executeUpdate(query1);

            JOptionPane.showMessageDialog(null, "Modificado satisfactoriamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
}
