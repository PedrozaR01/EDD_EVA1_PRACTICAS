
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Antonio 18550354
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sInpt = new Scanner(System.in);
        
        System.out.println("Bienvenido");
        System.out.println("Cuántos grupos tienes?: ");
        int grupos = sInpt.nextInt();
        Alumno[][] cAlu = new Alumno[grupos][];
        
        System.out.println("Introduce los alumnos de cada uno de tus grupos: ");
        int alumnos = 0;
        for (int i = 0; i < cAlu.length; i++) {
            for (int j = 0; j < cAlu[i].length; j++) {
                alumnos = sInpt.nextInt();
                
            }
            
        }
    }
    
}

class Alumno{
        private String nombre;
        private String edad;
        private int grupos;
        private int alumnos;

    public int getGrupos() {
        return grupos;
    }

    public void setGrupos(int grupos) {
        this.grupos = grupos;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }
        
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEdad() {
            return edad;
        }

        public void setEdad(String edad) {
            this.edad = edad;
        }
        
        
    }
