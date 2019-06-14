package ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.autowired.komponenty_komputera;

import org.springframework.beans.factory.annotation.Required;

/**
 * Reprezetnacja Portu, czyli zależność, która zostaje wstrzyknięta do klasy {@link a_adnotacje_wstrzykiwania.autowired.Komputer Komputer} za pomocą pola (kolekcja).
 *
 * @author Wiktor Rup
 * @see IPort
 */
class Port implements IPort {

    private String nazwa;

    @Override
    public void status() {
        System.out.println("Port " + nazwa + " aktywny!");
    }

    @Required
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
