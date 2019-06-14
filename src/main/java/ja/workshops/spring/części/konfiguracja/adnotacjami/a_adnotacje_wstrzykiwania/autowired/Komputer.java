package ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.autowired;

import ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.autowired.komponenty_komputera.IPort;
import ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.autowired.komponenty_komputera.KomponentKomputera;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

/**
 * Reprezetnacja wstrzykiwania zależności na różne sposoby. {@link org.springframework.beans.factory.annotation.Autowired}
 *
 * @author Wiktor Rup
 * @see IPort
 * @see KomponentKomputera
 */
class Komputer {

    private KomponentKomputera klawiatura;
    private KomponentKomputera monitor;
    @Autowired
    private Set<IPort> porty;


    /**
     * Metoda przedstawia mechanizm wstrzykiwania zależności poprzez dowolną metodę z parametrami.
     *
     * @param klawiatura
     * @param monitor
     */
    @Autowired
    void podłączKomponentyDoKomputera(KomponentKomputera klawiatura, KomponentKomputera monitor) {
        this.klawiatura = klawiatura;
        this.monitor = monitor;
    }

    void mojeKomponenty() {
        System.out.println("Komponenty komputera: ");
        klawiatura.status();
        monitor.status();
        for (IPort port : porty) {
            port.status();
        }
    }

}
