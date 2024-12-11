import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Adrian", "Nowak", new Date(), "Warszawa", 123456789);

        PersonBackup backup = person.saveToBackup();
        System.out.println("Oryginalna osoba: " + person);

        person.setImie("Tomasz");
        person.setNazwisko("Pompka");
        System.out.println("Zmodyfikowana osoba: " + person);

        person.restoreFromBackup(backup);
        System.out.println("Przywrócona osoba: " + person);
    }
}
