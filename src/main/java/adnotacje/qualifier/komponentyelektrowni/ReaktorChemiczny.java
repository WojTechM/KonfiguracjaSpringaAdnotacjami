package adnotacje.qualifier.komponentyelektrowni;

/**
 * Klasa, która reprezentuje reaktor chemiczny, czyli zależność, która zostaje wstrzyknięta do klasy Elektrownia za pomocą settera.
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
