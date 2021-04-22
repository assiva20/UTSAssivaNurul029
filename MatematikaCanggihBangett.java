/*
Nama    : Assiva Nurul Huzna
NIM     : 11200930000029
Kelas   : Sistem Informasi 2A
 */
package Matematik;

public class MatematikaCanggihBangett extends MatematikaCanggihh {
    @Override
    void pertambahan(int a,int b, int c, int d){
        System.out.println("Pertambahan :"+a+"+"+b+"+"+c+"+"+d+"="+(a+b+c+d));
    }
    @Override
    void perkalian(int a,int b, int c, int d){
        System.out.println("Perkalian :"+a+"x"+b+"x"+c+"x"+d+"="+(a*b*c*d)); 
}
    void pertambahanEmpat(int a,int b, int c, int d){
        System.out.println("pertambahanEmpat :"+a+"+"+b+"+"+c+"+"+d+"="+(a+b+c+d));
}
    @Override
    void modulus(int a,int b, int c, int d){
        System.out.println("Modulus :"+a+"%"+b+"%"+c+"%"+d+"="+(a%b%c%d));
    }
}
