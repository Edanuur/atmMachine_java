public class Main {
	
    public static void main(String[] args) {
        
        Atm atm = new Atm();
        
        Hesap hesap = new Hesap("Eda �nal","12345", 2000);
        
        atm.calis(hesap);
        System.out.println("Programdan ��k�l�yor...");
        
            
        
    }
 
}