package ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.qualifier;

import ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.qualifier.komponenty_elektrowni.Reaktor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Klasa prezentująca działanie adnotacji Qualifier. {@link org.springframework.beans.factory.annotation.Qualifier}
 *
 * @author Wiktor Rup
 */
public class Elektrownia {


    private Reaktor reaktor;

    /**
     * Wstrzyknięcie zależności za pomocą settera. Koniecznym jest zastosowanie adnotacji Qualifier aby określić, która fasolka ma zostać wstrzyknięta.
     * Interfejs Reaktor implementowany jest zarówno przez klasę ReaktorChemiczny jak i ReaktorJądrowy, dlatego należy zdefiniować konkretnie, która fasolka nas interesuje.
     *
     * @param reaktor
     * @see Reaktor
     */
    @Autowired
    @Qualifier("reaktorchemiczny")
    public void setReaktor(Reaktor reaktor) {
        this.reaktor = reaktor;
    }

    void rodzajElektrowni() {
        reaktor.typ();
    }
}
