import java.util.Scanner;

public class Login {
    
    public  boolean login(Hesap hesap){
        
        Scanner scan = new Scanner(System.in);
        String kullanici_adi;
        String parola;
        
        System.out.print("Kullan�c� Ad� : ");
        kullanici_adi = scan.nextLine();
        System.out.print("Parola : ");
        parola = scan.nextLine();
        
        if (hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola)){
            
            return true;
            
        }
        else {
            return false;
        }
        
        
    }
}
