package zadanie_dziedziczenie;
public class Pracownik extends Osoba {

    String stanowisko;
    String nazwaFirmy;

    Pracownik(String imie, String nazwisko, String stanowisko, String nazwaFirmy) {
        super(imie, nazwisko);
        this.stanowisko = stanowisko;
        this.nazwaFirmy = nazwaFirmy;


    }

    @Override
    void przedstawSie() {
        System.out.println("Jestem " + imie + " " + nazwisko + " pracuje na stanowsku " + stanowisko + " w " + nazwaFirmy);
    }
}
