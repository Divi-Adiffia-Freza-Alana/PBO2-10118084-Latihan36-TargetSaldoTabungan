/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.targetsaldotabungan;

/**
 *
 *
* Nama : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk mengitung target saldo

 */
public class TargetSaldoTabungan {
    Double SaldoAwal;
    Double bunga;
    Double SaldoTarget;
    int i;
    
    
    public void lamabulan(){
        i =1;
        bunga = bunga/100;
        while(SaldoAwal<=SaldoTarget){
        SaldoAwal = SaldoAwal * bunga + SaldoAwal;     
        System.out.println("Saldo di bulan ke-" + i + " Rp."+ SaldoAwal);
        i++;
        }
    }
}
