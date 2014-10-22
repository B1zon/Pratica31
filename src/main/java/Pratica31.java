/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Rodrigues Garcia email<b1zon@hotmail.com>
 */
import java.util.GregorianCalendar;
import java.util.Date;

public class Pratica31 {
    
    private static final String meuNome = "Gabriel Rodrigues Garcia";
    private static final GregorianCalendar dataNascimento = new GregorianCalendar(1990,10,20);
    private static final GregorianCalendar today = new GregorianCalendar();
 
    public static void main(String[] args) {
        Date inicio = new Date();
        System.out.println("item 4: "+ meuNome.toUpperCase());
        System.out.println("item 5: "+ meuNome.substring(18)+", "+
                meuNome.toUpperCase().charAt(0)+"."+
                meuNome.toUpperCase().charAt(8)+".");
        System.out.println("item 6: "+(today.getTimeInMillis() - 
                dataNascimento.getTimeInMillis())/
                (60*60*24*1000)+" dias");
        Date fim = new Date();
        System.out.println("item 7: "+(fim.getTime() - inicio.getTime())+" milisegundos");
    }
}

