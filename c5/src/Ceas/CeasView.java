package Ceas;
import java.util.Scanner;
public class CeasView {

    public CeasService ceasService = new CeasService();
    public Scanner scanner = new Scanner(System.in);

    public void meniu(){

        System.out.println("Apasati tasta 1 pentru a afisa lista de ceasuri");
        System.out.println("Apasati tasta 2 pentru a adauga un ceas");
        System.out.println("Apasati tasta 3 pentru a sterge un ceas");
        System.out.println("Apasati tasta 4 pentru a edita datele unui ceas");

    }

    public void play() {
        ceasService.loadData();
        boolean running = true;
        while (running) {
            meniu();
            int alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {
                case 1:
                    ceasService.afisare();
                    break;
                case 2:
                    adaugareCeas();
                    break;
                case 3:
                    stergereCeas();
                    break;
                case 4:
                    editareCeas();
                    break;
                default:
                    System.out.println("Tasta incorecta");
            }
        }
    }

    public void adaugareCeas() {
        System.out.println("Introduceti datele ceasului:");
        System.out.println("Marca: ");
        String marca = scanner.nextLine();
        System.out.println("Model: ");
        String model = scanner.nextLine();
        System.out.println("Pret: ");
        int pret = Integer.parseInt(scanner.nextLine());
        System.out.println("An de fabricatie: ");
        int anFabricatie = Integer.parseInt(scanner.nextLine());
        System.out.println("Este uzat?(true/false)");
        boolean uzat = Boolean.parseBoolean(scanner.nextLine());

        Ceas nou = new Ceas();
        nou.marca = marca;
        nou.model = model;
        nou.anFabricatie = anFabricatie;
        nou.pret = pret;
        nou.uzat = uzat;

        if (!ceasService.adaugareCeas(nou)) {
            System.out.println("Ceasul se afla deja in lista");
        } else {
            System.out.println("Ceasul a fost adaugat");
        }
    }

    public void stergereCeas() {
        System.out.println("Introduceti marca si modelul ceasului pe care doriti sa o stergeti:");
        System.out.println("Marca:");
        String marca = scanner.nextLine();
        System.out.println("Modelul:");
        String model = scanner.nextLine();

        if (ceasService.stergereCeas(marca,model)) {
            System.out.println("Ceasul a fost sters");
        } else {
            System.out.println("Ceasul nu a fost gasit in lista");
        }
    }

    public void editareCeas() {
        System.out.println("Introduceti marca si modelul ceasului care doriti sa fie editat:");
        System.out.println("Marca:");
        String marca = scanner.nextLine();
        System.out.println("Modelul:");
        String model = scanner.nextLine();
        Ceas ceas = ceasService.findByMarcaSiModel(marca, model);
        ceasService.editareCeas(ceas);
    }

}
