package ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.autowired.komponenty_komputera;


/**
 * Reprezetnacja Monitora, czyli zależność, która zostaje wstrzyknięta do klasy {@link a_adnotacje_wstrzykiwania.autowired.Komputer Komputer} za pomocą metody z parametrami.
 *
 * @author Wiktor Rup
 * @see KomponentKomputera
 */
class Monitor implements KomponentKomputera {

    @Override
    public void status() {
        System.out.println("Monitor podłączony!");
    }
}
