/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*Un objeto de tipo InstitucionEducativa*/

        InstitucionEducativa ft = new InstitucionEducativa();
        String nombre = "La Dolorosa";
        String tipoInstitucion = "Fiscal";
        int numeroAlumnos = 2500;
        int numeroDocentes = 2500;
        int numeroSedes = 2500;

        ft.establecernombre(nombre);
        ft.establecertipoInstitucion(tipoInstitucion);
        ft.establacernumeroAlumnos(numeroAlumnos);
        ft.establecernumeroDocentes(numeroDocentes);
        ft.establecernumeroSedes(numeroSedes);

        System.out.printf("%s Nombre: \n Tipo de institucion %s"
                + " \n Numero de alumnos %d \n Numero de docentes %d "
                + " \n Numero de sedes %d \n", ft.obtenerNombre(),
                ft.obtenertipoInstitucion(), ft.obtenerNumeroAlumnos(),
                 ft.obtenernumeroDocentes(), ft.obtnernumeroSedes());
    }
}
