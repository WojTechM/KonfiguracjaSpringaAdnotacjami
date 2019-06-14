package ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.qualifier.komponenty_elektrowni;

import ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.qualifier.Elektrownia;

/**
 * Klasa, która reprezentuje reaktor jądrowy, czyli zależność, która zostaje wstrzyknięta do klasy {@link Elektrownia Elektrownia} za pomocą settera.
 *
 * @author Wiktor Rup
 * @see Reaktor
 */
class ReaktorJądrowy implements Reaktor {
    @Override
    public void typ() {
        System.out.println("Reaktor jądrowy.");
    }
}
