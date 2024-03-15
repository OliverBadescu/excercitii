package Casa;
import java.util.Scanner;
public class CasaView {

    public CasaService casaService = new CasaService();
    public Scanner scanner = new Scanner(System.in);

    public void meniu() {
        System.out.println("Apasati tasta 1 pentru a afisa lista de case");
        System.out.println("Apasati tasta 2 pentru a adauga o casa");
        System.out.println("Apasati tasta 3 pentru a sterge o casa");
        System.out.println("Apasati tasta 4 pentru a edita datele unei case");
    }

    public void play() {
        casaService.loadData();
        boolean running = true;
        while (running) {
            meniu();
            int alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {
                case 1:
                    casaService.afisare();
                    break;
                case 2:
                    adaugareCasa();
                    break;
                case 3:
                    stergereCasa();
                    break;
                case 4:
                    editareCasa();
                    break;
                default:
                    System.out.println("Tasta incorecta");
            }
        }
    }

    public void adaugareCasa() {
        System.out.println("Introduceti datele casei:");
        System.out.println("Adresa: ");
        String adresa = scanner.nextLine();
        System.out.println("Numar camere: ");
        int nrCamere = Integer.parseInt(scanner.nextLine());
        System.out.println("Suprafata (mp): ");
        int suprafata = Integer.parseInt(scanner.nextLine());
        System.out.println("An constructie: ");
        int anConstructie = Integer.parseInt(scanner.nextLine());
        System.out.println("Pret: ");
        int pret = Integer.parseInt(scanner.nextLine());
        System.out.println("Este mobilata?(true/false)");
        boolean esteMobilata = Boolean.parseBoolean(scanner.nextLine());

        Casa nouaCasa = new Casa();
        nouaCasa.adresa = adresa;
        nouaCasa.nrCamere = nrCamere;
        nouaCasa.suprafata = suprafata;
        nouaCasa.anConstructie = anConstructie;
        nouaCasa.pret = pret;
        nouaCasa.esteMobilata = esteMobilata;

        if (!casaService.adaugareCasa(nouaCasa)) {
            System.out.println("Casa se afla deja in lista");
        } else {
            System.out.println("Casa a fost adaugata");
        }
    }

    public void stergereCasa() {
        System.out.println("Introduceti adresa casei pe care doriti sa o stergeti:");
        String adresa = scanner.nextLine();
        if (casaService.stergereCasa(adresa)) {
            System.out.println("Casa a fost stearsa");
        } else {
            System.out.println("Casa nu a fost gasita in lista");
        }
    }

    public void editareCasa() {
        System.out.println("Introduceti adresa casei care doriti sa fie editata:");
        String adresa = scanner.nextLine();
        Casa casa = casaService.findCasaByAdresa(adresa);
        casaService.editareCasa(casa);
    }
}
