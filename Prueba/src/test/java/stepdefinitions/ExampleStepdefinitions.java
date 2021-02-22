package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import userinterfaces.HomePage;

import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleStepdefinitions {

    @Managed(driver = "chrome")

    private WebDriver navegador;
    private Actor actor= Actor.named("Marcela");
    private HomePage homePage= new HomePage();


    @Dado("^cualquier persona que desee ingresar a la pagina Utest\\.com$")
    public void cualquierPersonaQueDeseeIngresarALaPaginaUtestCom() {
        // Write code here that turns the phrase above into concrete actions
        actor.can(BrowseTheWeb.with(navegador));
      //  actor.wasAbleTo(Open.browserOn(HomePage));

    }

    @Cuando("^En cualquier momento (\\d+)/(\\d+)$")
    public void enCualquierMomento(int arg1, int arg2) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Entonces("^Le debe cargar correctamente la pagina indicada$")
    public void leDebeCargarCorrectamenteLaPaginaIndicada() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Dado("^cualquier persona que desea hacer parte de la comunidad Utest\\.com y da clic en el boton \"([^\"]*)\"$")
    public void cualquierPersonaQueDeseaHacerParteDeLaComunidadUtestComYDaClicEnElBoton(String arg1) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Cuando("^En cualquier momento ya que es una pagina para aprender acerca del testing y tranajar freelance$")
    public void enCualquierMomentoYaQueEsUnaPaginaParaAprenderAcercaDelTestingYTranajarFreelance() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Entonces("^Esta debe cargar el formulario y realizar el registro de manera automatica$")
    public void estaDebeCargarElFormularioYRealizarElRegistroDeManeraAutomatica() {
        // Write code here that turns the phrase above into concrete actions

    }


    public WebDriver getNavegador() {
        return navegador;
    }
}
