/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class InstitucionEducativa {

    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;

    public void establecernombre(String c) {
        nombre = c;
    }

    public void establecertipoInstitucion(String c) {
        tipoInstitucion = c;
    }

    public void establacernumeroAlumnos(int c) {
        numeroAlumnos = c;
    }

    // public void establecerValorFactura(){
    public void establecernumeroDocentes(int c) {
        numeroDocentes = c;
    }

    public void establecernumeroSedes(int c) {
        numeroSedes = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenertipoInstitucion() {
        return tipoInstitucion;
    }

    public int obtenerNumeroAlumnos() {
        return numeroAlumnos;
    }

    public int obtenernumeroDocentes() {
        return numeroDocentes;
    }

    public int obtnernumeroSedes() {
        return numeroSedes;
    }

    /*Crear los método necesarios*/

   
}
