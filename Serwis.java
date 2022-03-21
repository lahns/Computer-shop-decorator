import java.util.Scanner;
public class Serwis {

//Wojciech Umiński 3P

    public static void main(String[] args){
    
        Scanner scn = new Scanner(System.in);
        System.out.println("jaka chcesz obudowe? \n1.be quiet! Dark Base 700 Black\n2.be quiet! Dark Base Pro 900 Orange Rev.2");
        int wybor = scn.nextInt();

        Komputer komputermarzen;
        if(wybor==1){
            komputermarzen = new Obudowa1();
        }
        else{
            komputermarzen = new Obudowa2();
        }
        System.out.println("jaka chcesz karte graficzna? \n1.RTX 3090 Ti\n2.RTX 3060");
        wybor=scn.nextInt();
        if(wybor==1){
            komputermarzen = new GPU1(komputermarzen);
        }
        else{
            komputermarzen = new GPU2(komputermarzen);
        }
        System.out.println("jaka chcesz plyte glowna? \n1.ASUS ROG STRIX B550-E GAMING\n2.SUS ROG STRIX B550-A GAMING");
        wybor=scn.nextInt();
        if(wybor==1){
            komputermarzen = new Motherboard1(komputermarzen);
        }
        else{
            komputermarzen = new Motherboard2(komputermarzen);
        }
        System.out.println("jaki chcesz zasilacz? \n1.be quiet! Straight Power 11 1000W 80 Plus Gold\n2.be quiet! Dark Power 12 1000W 80 Plus Titanium");
        wybor=scn.nextInt();
        if(wybor==1){
            komputermarzen = new Zasilacz1(komputermarzen);
        }
        else{
            komputermarzen = new Zasilacz2(komputermarzen);
        }
        System.out.println("jaki chcesz procesor? \n1.Ryzen 5 5600X\n2.AMD Ryzen 7 5800X");
        wybor=scn.nextInt();
        if(wybor==1){
            komputermarzen = new CPU1(komputermarzen);
        }
        else{
            komputermarzen = new CPU2(komputermarzen);
        }
        System.out.println("jaki chcesz RAM? \n1.Kingston FURY 32GB (2x16GB) 3000MHz CL16 Beast RGB\n2.G.SKILL 16GB (2x8GB) 3200MHz CL14 Flare X Black Ryzen");
        wybor=scn.nextInt();
        if(wybor==1){
            komputermarzen = new RAM1(komputermarzen);
        }
        else{
            komputermarzen = new RAM2(komputermarzen);
        }
        System.out.println("jaki chcesz dysk? \n1.Samsung 500GB M.2 PCIe NVMe 980\n2.Crucial 1TB 2,5\" SATA SSD MX500");
        wybor=scn.nextInt();
        if(wybor==1){
            komputermarzen = new Dysk1(komputermarzen);
        }
        else{
            komputermarzen = new Dysk2(komputermarzen);
        }


    System.out.println(komputermarzen.Name());
    System.out.println(komputermarzen.Cost());

    }

}
