package ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Tworzenie kontekstu aplikacji springowej. {@link ApplicationContext}
 *
 * @author Wiktor Rup
 */
class Main {

    public static void main(String[] args) {


        ApplicationContext kontekst = new ClassPathXmlApplicationContext("AutowiredBeans.xml");

        Komputer komputer = (Komputer) kontekst.getBean("komputer");
        komputer.mojeKomponenty();

    }
}
