/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museito;

import java.util.Calendar;

/**
 *
 * @author empic
 */
public interface SimpleObraFactory {

    String getId();

    String getNombre();

    String getTipo();

    int getAnyo();

    String getOrigen();

    Calendar getFecha_reparacion();

    String getAutor();

    String getEstado();
    
    boolean isReparado();

    String getDescripcion();

    void setId(String id);

    void setNombre(String nombre);

    void setTipo(String tipo);

    void setEstilo(String estilo);

    void setAnyo(int anyo);

    void setOrigen(String origen);

    void setFecha_reparacion(Calendar fecha_reparacion);

    void setAutor(String autor);

    void setEstado(String estado);
    
    void setReparado(boolean reoarado);

    void setDescripcion(String descripcion);

}