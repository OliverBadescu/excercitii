package laptop;
import java.util.Scanner;
import javax.print.DocFlavor;
import java.util.ArrayList;


public class LaptopService {

    public ArrayList<Laptop> laptops = new ArrayList<>();
    public Scanner scanner = new Scanner(System.in);

    public void loadData(){

        Laptop l1 = new Laptop();

        l1.marca = "Dell";
        l1.model = "XPS 13";
        l1.pret = 2000;
        l1.an = 2021;
        l1.uzat = false;
        l1.procesor = "Intel Core i7";
        l1.ram = 16;
        l1.stocareGB = 512;

        Laptop l2 = new Laptop();
        l2.marca = "Apple";
        l2.model = "MacBook Air";
        l2.pret = 1500;
        l2.an = 2020;
        l2.uzat = true;
        l2.procesor = "Apple M1";
        l2.ram = 8;
        l2.stocareGB = 256;

        Laptop l3 = new Laptop();
        l3.marca = "HP";
        l3.model = "Spectre x360";
        l3.pret = 1800;
        l3.an = 2021;
        l3.uzat = false;
        l3.procesor = "Intel Core i5";
        l3.ram = 16;
        l3.stocareGB = 512;

        Laptop l4 = new Laptop();
        l4.marca = "Lenovo";
        l4.model = "ThinkPad X1 Carbon";
        l4.pret = 2200;
        l4.an = 2020;
        l4.uzat = false;
        l4.procesor = "Intel Core i7";
        l4.ram = 16;
        l4.stocareGB = 1_024;

        Laptop l5 = new Laptop();
        l5.marca = "Asus";
        l5.model = "ZenBook Duo";
        l5.pret = 2500;
        l5.an = 2021;
        l5.uzat = false;
        l5.procesor = "Intel Core i9";
        l5.ram = 32;
        l5.stocareGB = 1_024;

        Laptop l6 = new Laptop();
        l6.marca = "Acer";
        l6.model = "Predator Helios 300";
        l6.pret = 1700;
        l6.an = 2020;
        l6.uzat = true;
        l6.procesor = "Intel Core i7";
        l6.ram = 16;
        l6.stocareGB = 512;

        Laptop l7 = new Laptop();
        l7.marca = "Microsoft";
        l7.model = "Surface Laptop 4";
        l7.pret = 1900;
        l7.an = 2021;
        l7.uzat = false;
        l7.procesor = "Intel Core i5";
        l7.ram = 16;
        l7.stocareGB = 512;

        Laptop l8 = new Laptop();
        l8.marca = "Razer";
        l8.model = "Blade 15";
        l8.pret = 2600;
        l8.an = 2020;
        l8.uzat = false;
        l8.procesor = "Intel Core i7";
        l8.ram = 32;
        l8.stocareGB = 1_024;

        Laptop l9 = new Laptop();
        l9.marca = "MSI";
        l9.model = "GS66 Stealth";
        l9.pret = 2300;
        l9.an = 2021;
        l9.uzat = false;
        l9.procesor = "Intel Core i9";
        l9.ram = 64;
        l9.stocareGB = 2_048;

        Laptop l10 = new Laptop();
        l10.marca = "Google";
        l10.model = "Pixelbook Go";
        l10.pret = 1200;
        l10.an = 2019;
        l10.uzat = true;
        l10.procesor = "Intel Core i5";
        l10.ram = 8;
        l10.stocareGB = 128;

        laptops.add(l1);
        laptops.add(l2);
        laptops.add(l3);
        laptops.add(l4);
        laptops.add(l5);
        laptops.add(l6);
        laptops.add(l7);
        laptops.add(l8);
        laptops.add(l9);
        laptops.add(l10);


    }

    public void afisare(){

        for (int i = 0; i < laptops.size(); i++){
            System.out.println(laptops.get(i).descriere());
        }

    }

    public Laptop findLaptopByMarcaSiModel(String marcaLaptop, String modelLaptop){

        for (int i =0; i < laptops.size(); i++){
            if (laptops.get(i).marca.equals(marcaLaptop) && laptops.get(i).model.equals(modelLaptop)){

                return  laptops.get(i);


            }
        }

        return null;

    }

    public boolean adaugareLaptop(Laptop laptop){
        if(this.findLaptopByMarcaSiModel(laptop.marca,laptop.model)!=null){

            return false;
        }
        this.laptops.add(laptop);
        return true;


    }

    public boolean stergereLaptop(String marcaLaptop, String modelLaptop){

        for (int i =0; i < laptops.size(); i++){
            if (laptops.get(i).marca.equals(marcaLaptop) && laptops.get(i).model.equals(modelLaptop)){


                laptops.remove(laptops.get(i));
                return true;

            }
        }

        return false;

    }

    public void editareLaptop(Laptop laptop){


        if (laptops != null) {

            System.out.println("Ce doriti sa modificati?");
            String alegere = scanner.nextLine();
            switch (alegere) {
                case "an":
                    System.out.println("Introduceti noul an:");
                    laptop.an = Integer.parseInt(scanner.nextLine());
                    break;
                case "pret":
                    System.out.println("Introduceti noul pret:");
                    laptop.pret = Integer.parseInt(scanner.nextLine());
                    break;
                case "stocare":
                    System.out.println("Introduceti noua capacitate:");
                    laptop.stocareGB = Integer.parseInt(scanner.nextLine());
                    break;
                case "uzat":
                    System.out.println("Introduceti daca este uzat: (true/false)");
                    laptop.uzat = Boolean.parseBoolean(scanner.nextLine());
                    break;
                case "procesor":
                    System.out.println("Introduceti noul procesor:");
                    laptop.procesor = scanner.nextLine();
                    break;
                case "ram":
                    System.out.println("Introduceti noii ram:");
                    laptop.ram = Integer.parseInt(scanner.nextLine());
                    break;
                default:
                    System.out.println("Date incorecte");



            }
            System.out.println("Datele laptopului au fost actualizate cu succes.");
        }else{
            System.out.println("Laptopul nu a fost gasita in lista.");
        }

    }

}
