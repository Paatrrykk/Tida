import java.util.Date;

public class PersonBackup {
    private final String imie;
    private final String nazwisko;
    private final Date dataUrodzenia;
    private final String miejsceUrodzenia;
    private final int telefon;

    public PersonBackup(String imie, String nazwisko, Date dataUrodzenia, String miejsceUrodzenia, int telefon) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.miejsceUrodzenia = miejsceUrodzenia;
        this.telefon = telefon;
    }

    public String getImie() { return imie; }
    public String getNazwisko() { return nazwisko; }
    public Date getDataUrodzenia() { return dataUrodzenia; }
    public String getMiejsceUrodzenia() { return miejsceUrodzenia; }
    public int getTelefon() { return telefon; }
}
