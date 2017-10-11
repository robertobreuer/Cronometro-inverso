/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author rjbr
 */
public class Reloj {
    public int hora, minutos, segundos = 0       
            ;

    public Reloj() {
       //To change body of generated methods, choose Tools | Templates.
    }

    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
     //   return "Reloj{" + "hora=" + hora + ", minutos=" + minutos + ", segundos=" + segundos + '}';
        return +hora+":"+minutos+":" + segundos;
    }

    public Reloj(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    
    
}
