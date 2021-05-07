
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   
        System.out.println("Kumanda Programmına Hoşgeldiniz...");
        
        Scanner scanner = new Scanner(System.in);
        
        String işlemler = "Işlemler...\n"
                        + "1. Kanalları Göster\n"
                        + "2. Kanal Ekle\n"
                        + "3. Kanal Sil\n"
                        + "4. Kanal Sayısı Öğren\n"
                        + "Çıkış için q'ya basın...";
        RemoteControl remoteControl = new RemoteControl();
        while (true) {
            System.out.println(işlemler);
            System.out.println("Işlemi giriniz : ");
            String işlem = scanner.nextLine();
            
            if (işlem.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if(işlem.equals("1")) {
                showChannels(remoteControl);
            }
            else if(işlem.equals("2")) {
                System.out.print("Eklenecek Kanal : ");
                String nameOfChannel = scanner.nextLine();
                remoteControl.addChannel(nameOfChannel);
            }
            else if(işlem.equals("3")) {
                System.out.print("Silinecek Kanal : ");
                String nameofChannel = scanner.nextLine();
                remoteControl.deleteChannel(nameofChannel);
            }
            else if(işlem.equals("4")) {
                System.out.println("Kanal Sayısı : " + remoteControl.numberOfChannels());
            }
            else {
                System.out.println("Geçersiz işlem...");
            }
            
        }
        
    } //end main    
    
    public static void showChannels(RemoteControl remoteControl) {
        if(remoteControl.numberOfChannels() == 0) {
            System.out.println("Şuanda hiç bir kanal bulunmuyor...");
        }
        else {
            for (String channel : remoteControl) {
                System.out.println("Kanal : " + channel);
            }
        }
    }
    
}
