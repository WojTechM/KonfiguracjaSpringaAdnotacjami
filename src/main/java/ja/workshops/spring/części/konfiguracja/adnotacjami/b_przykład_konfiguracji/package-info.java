/**
 * <h1>Prezentacja konfiguracji adnotacjami - Przykład użycia.</h1>
 * Podczas zapoznania się z kodem w tym pakiecie zobaczych przykładową implementację
 * aplikacji webowej (instrukcja uruchomienia na samym dole).<br/>
 * Dowiesz się jak może wyglądać konfiguracja aplikacji webowej, oraz powtórzysz sobie czym są:
 * <ul>
 *     <li>{@link org.springframework.stereotype.Controller @Controller}</li>
 *     <li>{@link org.springframework.stereotype.Service @Service}</li>
 *     <li>{@link org.springframework.stereotype.Repository @Repository}</li>
 * </ul>
 *
 * <ol>
 *     <li>Przegląd kodu<br/>
 *          Polecam przypomnieć sobie czym są repozytoria, serwisy oraz kontrolery (w tej kolejności)
 *          <ol>
 *              <li>{@link ja.workshops.spring.części.konfiguracja.adnotacjami.b_przykład_konfiguracji.RozsądneRepozytorium}</li>
 *              <li>{@link ja.workshops.spring.części.konfiguracja.adnotacjami.b_przykład_konfiguracji.SuperSerwis}</li>
 *              <li>{@link ja.workshops.spring.części.konfiguracja.adnotacjami.b_przykład_konfiguracji.KreatywnyKontroler}</li>
 *          </ol>
 *          W dokumentacji tych klas znajdziesz skrótowe przypomnienie czym są wspomniane stereotypy.
 *     </li><br/>
 *     <li>Konfiguracja<br/>
 *         Konfiguracja odbywa się w całości przez adnotacje.
 *         <br/>
 *         Zwróć uwagę na fakt, że nigdzie nie pojawia się adnotacja {@link org.springframework.beans.factory.annotation.Autowired @Autowired}.
 *         Jeśli jakiś {@link org.springframework.stereotype.Component komponent} posiada tylko 1 konstruktor, to jest on używany do wstrzykiwania automatycznie.
 *         <ol>
 *              <li>
 *                  Dopisz teraz do jednego z komponentów dodatkowy (bezparametrowy) konstruktor - uruchom aplikację.
 *              </li>
 *              <li>
 *                  Dodaj teraz do tego konstruktora jakiś parametr (np. String, int, Object) - uruchom aplikację. *Dodatkowy parametr nie musi być użyty*
 *              </li>
 *         </ol>
 *         Wyjaśnienia co i dlaczego się stało poszukaj w dokumentacji {@link org.springframework.beans.factory.annotation.Autowired @Autowired}
 *         (podpowiedź - przeczytaj ze zrozumieniem pierwsze 2 akapity dokumentacji).
 *
 *     </li>
 * </ol>
 * <br/>
 * Aby uruchomić Jettiego użyj komendy:
 * <p>{@code mvn jetty:run}</p> lub jeśli chcesz uruchomić go na innym porcie (domyślny port to 8080):
 * <p>{@code mvn -Djetty.port=8888 jetty:run}</p>
 * <br/>
 * @author Wojciech Makiela
 */
package ja.workshops.spring.części.konfiguracja.adnotacjami.b_przykład_konfiguracji;