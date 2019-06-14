package ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.autowired.komponenty_klawiatury;

/**
 * Reprezentacja Diody, czyli zależność, która zostaje wstrzyknięta do klasy {@link a_adnotacje_wstrzykiwania.autowired.komponenty_komputera.Klawiatura Klawiatura} za pomocą settera.
 *
 * @author Wiktor Rup
 * @see KomponentKlawiatury
 */
class Dioda implements KomponentKlawiatury {

    @Override
    public void robiRzeczy() {
        System.out.println("mig...mig...");
    }
}
