package laptop;
import java.util.Scanner;

public class LaptopView {

    public LaptopService laptopService = new LaptopService();
    public Scanner scanner = new Scanner(System.in);

    public void meniu(){

        System.out.println("Apasati tasta 1 pentru a afisa lista de laptopuri");
        System.out.println("Apasati tasta 2 pentru a adauga un laptop");
        System.out.println("Apasati tasta 3 pentru a sterge un laptop");
        System.out.println("Apasati tasta 4 pentru a edita datele unui laptop");


    }

    public void play(){

        laptopService.loadData();
        boolean running = true;
        while(running){

            meniu();
            int alegere = Integer.parseInt(scanner.nextLine());

            switch (alegere){
                case 1: laptopService.afisare();
                    break;
                case 2: adaugareLaptop();
                    break;
                case 3: stergereLaptop();
                    break;
                case 4: editareLaptop();
                    break;
                default:
                    System.out.println("Tasta incorecta");
            }

        }

    }


    public void adaugareLaptop(){

        System.out.println("Introduceti datele laptopului:");

        System.out.println("Marca: ");
        String marca = scanner.nextLine();
        System.out.println("Model: ");
        String model = scanner.nextLine();
        System.out.println("Pretul: ");
        int pret= Integer.parseInt(scanner.nextLine());
        System.out.println("Anul: ");
        int an = Integer.parseInt(scanner.nextLine());
        System.out.println("Este uzat?(true/false)");
        boolean uzat = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Stocare:");
        int stocare = Integer.parseInt(scanner.nextLine());
        System.out.println("Procesor: ");
        String procesor = scanner.nextLine();
        System.out.println("Ram: ");
        int ram = Integer.parseInt(scanner.nextLine());

        Laptop nou = new Laptop();
        nou.marca = marca;
        nou.model = model;
        nou.pret = pret;
        nou.an = an;
        nou.uzat= uzat;
        nou.stocareGB = stocare;
        nou.procesor = procesor;
        nou.ram = ram;

        if(!laptopService.adaugareLaptop(nou)){
            System.out.println("Laptopul se afla deja in lista");

        }
        else{
            System.out.println("Laptopul a fost adaugat");
        }



    }

    public void stergereLaptop(){

        System.out.println("Introduceti Marca si Modelul laptopului care doriti sa fie sters din lista\n");
        System.out.println("Marca: ");
        String marca = scanner.nextLine();
        System.out.println("Modelul: ");
        String model = scanner.nextLine();

        if(laptopService.stergereLaptop(marca, model)){

            System.out.println("Laptopul a fost sters");

        }else{
            System.out.println("Laptopul nu a fost gasit in lista");
        }


    }

    public void editareLaptop(){

        System.out.println("Introduceti Marca si Modelul laptopului care doriti sa fie editat\n");
        System.out.println("Marca: ");
        String marca = scanner.nextLine();
        System.out.println("Modelul: ");
        String model = scanner.nextLine();

        Laptop laptop = laptopService.findLaptopByMarcaSiModel(marca, model);

        laptopService.editareLaptop(laptop);

    }

}
