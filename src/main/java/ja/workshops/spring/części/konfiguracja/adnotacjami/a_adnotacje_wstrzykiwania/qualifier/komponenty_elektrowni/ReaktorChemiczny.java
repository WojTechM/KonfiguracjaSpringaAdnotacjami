package ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.qualifier.komponenty_elektrowni;

/**
 * Klasa, która reprezentuje reaktor chemiczny, czyli zależność, która zostaje wstrzyknięta do klasy {@link ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.qualifier.Elektrownia Elektrownia} za pomocą settera.
 *
 * @author Wiktor Rup
 * @see Reaktor
 */
class ReaktorChemiczny implements Reaktor {
    @Override
    public void typ() {
        System.out.println("Reaktor chemiczny.");
    }
}
