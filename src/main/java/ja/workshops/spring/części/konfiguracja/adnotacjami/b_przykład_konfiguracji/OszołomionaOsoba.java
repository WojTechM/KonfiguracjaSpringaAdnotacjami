package ja.workshops.spring.części.konfiguracja.adnotacjami.b_przykład_konfiguracji;

/**
 * Proste POJO. Ot zwykła otoczka na imię.
 *
 * @author Wojciech Makiela
 */
class OszołomionaOsoba {

    String imie;

    OszołomionaOsoba(String imie) {
        this.imie = imie;
        System.out.println(this.getClass().getName() + " - Konstruktor");

    }
}
