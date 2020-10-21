/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan11.formating;

/**
 *
 * @author senenngahenen
 * Nama      : Rizqy Ananda Rusmana
 * NIM       : 10119906
 * Kelas     : IF-10K
 * Deskripsi : Formatting.
 */
public class IF10K10119906Latihan11Formating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 3546764;
        int iMinus = -i;
        
        System.out.println("i\t : " + i);
        System.out.printf("%%d\t : %d%n",i);
        System.out.printf("%%10\t : %10d%n",i);
        System.out.printf("%%+10\t : %+10d%n",i);
        System.out.printf("%%10\t : %10d%n",iMinus);
        System.out.printf("%%,10\t : %,10d%n",i);
        System.out.printf("%%-10\t : %-10d%n",i);
        double f = 5675482.982;
        System.out.println("f \t : " + f);
        System.out.printf("%%f\t : %f%n",f);
        System.out.printf("%%.2f\t : %.2f%n",f);
        System.out.printf("%%12.2f\t : %12.2f%n",f);
        System.out.printf("%%,12.2f\t : %,12.2f%n",f);
        
    }
    
}
