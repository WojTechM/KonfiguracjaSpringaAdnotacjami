/**
 * <h1>Adnotacja Qualifier!</h1>
 *
 *  <p>Podczas zapoznania się z kodem w tym pakiecie dowiesz się o sytuacji,
 *  gdzie kilka ziaren implementuje dany interfejs i musimy wskazać implementację, która ma zostać wstrzyknięta.</p>
 *  <p>Do tego wykorzystana jest adnotacja {@link org.springframework.beans.factory.annotation.Qualifier Qualifier}.</p>
 *
 *  <p>Zacznij od analizy klas {@link a_adnotacje_wstrzykiwania.qualifier.komponenty_elektrowni.ReaktorChemiczny ReaktorChemiczny}
 *  oraz {@link a_adnotacje_wstrzykiwania.qualifier.komponenty_elektrowni.ReaktorJądrowy ReaktorJądrowy} w pakiecie <font color="yellow">{@code komponenty_elektrowni}</font>.</p>
 *
 *  <p>Następnie uruchom aplikację za pomocą klasy {@link ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.qualifier.Main Main} i zauważ potrzebę użycia adnotacji w klasie {@link ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.qualifier.Elektrownia Elektorwnia}</p>
 *
 *  <p>W katalogu <font color="yellow">{@code resources}</font> znajduje się plik konfiguracyjny dla tego pakietu o nazwie {@code QualifierBeans.xml}.
 *  Znajdziesz tam konfiguracje wykorzystywanych ziaren i zalezności.</p>
 *
 * @author Wiktor Rup
 */
package ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.qualifier;