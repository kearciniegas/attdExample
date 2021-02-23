package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class fibonacciSteps {
    SecuenciaFibonacci secuenciaFibonacci;
    Integer resultado;

    @Given("quiero conocer una secuencia de posiciones")
    public void quieroConocerUnaSecuenciaDePosiciones() {
        secuenciaFibonacci = new SecuenciaFibonacci();
    }

    @When("enviando la posicion {int}")
    public void enviandoLaPosicion(Integer int1) {
        resultado = secuenciaFibonacci.secuenciaposiciones(int1);
    }

    @Then("espero un {int}")
    public void esperoUn(Integer int1) {
        Assert.assertEquals(int1, resultado);
    }
}
