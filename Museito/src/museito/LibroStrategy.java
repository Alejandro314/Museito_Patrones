/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museito;

/**
 *
 * @author aleja
 */
public class LibroStrategy implements Estrategia{

    public LibroStrategy() {
    }

    public void reparar(SimpleObraFactory obra) {
        System.out.println("El libro con nombre " + obra.getNombre() + " ha sido enviado a reparar.\n ");
    }

    public String getTipoStrategy() {
        return "LIBRO";
    }

}
