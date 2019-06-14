package ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Klasa rozruchowa aplikacji. Tworzony jest kontekst aplikacji springowej. {@link ApplicationContext}
 *
 * @author Wiktor Rup
 */
class Main {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("RequiredBeans.xml");
        Samochód samochód = (Samochód) context.getBean("samochód");
        System.out.println("Rok produkcji: " + samochód.getRokProdukcji());
        System.out.println("Marka: " + samochód.getMarka());
    }
}
