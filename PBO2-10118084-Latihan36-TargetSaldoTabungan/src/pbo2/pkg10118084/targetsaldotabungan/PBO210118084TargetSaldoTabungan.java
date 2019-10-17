/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.targetsaldotabungan;

import java.util.Scanner;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menghitung target saldo

 * 
 */
public class PBO210118084TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner (System.in);
        TargetSaldoTabungan targetsaldotabungan=new TargetSaldoTabungan();
        System.out.print("Saldo Awal: Rp.");
        targetsaldotabungan.SaldoAwal=Scanner.nextDouble();
        System.out.print("Bunga : Rp.");
        targetsaldotabungan.bunga=Scanner.nextDouble();
        System.out.print("Saldo target:Rp.");
        targetsaldotabungan.SaldoTarget=Scanner.nextDouble();
        
        targetsaldotabungan.lamabulan();
        
        
    }
    
}
