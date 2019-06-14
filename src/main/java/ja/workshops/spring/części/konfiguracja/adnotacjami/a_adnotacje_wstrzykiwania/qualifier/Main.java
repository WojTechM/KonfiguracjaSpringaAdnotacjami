package ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Klasa rozruchowa aplikacji. Tworzony jest kontekst aplikacji springowej. {@link ApplicationContext}
 *
 * @author Wiktor Rup
 */
class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("QualifierBeans.xml");
        Elektrownia elektrownia = (Elektrownia) context.getBean("elektrownia");
        elektrownia.rodzajElektrowni();
    }


}
