import java.util.ArrayList;
import java.util.List;

public class Uczen {
    private String imie;
    private List<Integer> oceny;

    public Uczen(String imie) {
        this.imie = imie;
        this.oceny = new ArrayList<>();
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public List<Integer> getOceny() {
        return new ArrayList<>(oceny);
    }

    public void setOceny(List<Integer> oceny) {
        this.oceny = new ArrayList<>(oceny);
    }

    public void dodajOceny(int... noweOceny) {
        for (int ocena : noweOceny) {
            oceny.add(ocena);
        }
    }

    public double obliczSrednia() {
        if (oceny.isEmpty()) {
            return 0.0;
        }

        int suma = 0;

        for (int ocena : oceny) {
            suma += ocena;
        }

        return (double) suma / oceny.size();
    }
}
