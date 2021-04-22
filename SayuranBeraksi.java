/*
Nama        : Assiva Nurul Huzna
NIM         : 11200930000029
Kelas       : Sistem Informasi 2A
 */
package sayur;

public class SayuranBeraksi {
    public static void main(String[] args) {
        Sayuran sayurku = new Sayuran();
        
        sayurku.sayur = "Ibu membeli sayur di pasar...";
        sayurku.sayur = "Ibu membayar dengan uang 50.000";
        sayurku.sayur = "Ibu mencuci sayur sebelum dimasak";
        sayurku.sayur = "Ibu memasak sayur, rasanya enak";
        
        sayurku.printmembeli();
        sayurku.printmembayar();
        sayurku.printmencuci();
        sayurku.printmemasak();
    }
    
}