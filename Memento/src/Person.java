import java.util.Date;

public class Person {
    private String imie;
    private String nazwisko;
    private Date dataUrodzenia;
    private String miejsceUrodzenia;
    private int telefon;

    public Person(String imie, String nazwisko, Date dataUrodzenia, String miejsceUrodzenia, int telefon) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.miejsceUrodzenia = miejsceUrodzenia;
        this.telefon = telefon;
    }

    public String getImie() { return imie; }
    public void setImie(String imie) { this.imie = imie; }
    public String getNazwisko() { return nazwisko; }
    public void setNazwisko(String nazwisko) { this.nazwisko = nazwisko; }
    public Date getDataUrodzenia() { return dataUrodzenia; }
    public void setDataUrodzenia(Date dataUrodzenia) { this.dataUrodzenia = dataUrodzenia; }
    public String getMiejsceUrodzenia() { return miejsceUrodzenia; }
    public void setMiejsceUrodzenia(String miejsceUrodzenia) { this.miejsceUrodzenia = miejsceUrodzenia; }
    public int getTelefon() { return telefon; }
    public void setTelefon(int telefon) { this.telefon = telefon; }

    public PersonBackup saveToBackup() {
        return new PersonBackup(imie, nazwisko, dataUrodzenia, miejsceUrodzenia, telefon);
    }

    public void restoreFromBackup(PersonBackup backup) {
        this.imie = backup.getImie();
        this.nazwisko = backup.getNazwisko();
        this.dataUrodzenia = backup.getDataUrodzenia();
        this.miejsceUrodzenia = backup.getMiejsceUrodzenia();
        this.telefon = backup.getTelefon();
    }

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                ", miejsceUrodzenia='" + miejsceUrodzenia + '\'' +
                ", telefon=" + telefon +
                '}';
    }
}
