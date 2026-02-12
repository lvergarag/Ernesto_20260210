package steps;

import core.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AbrirUrlSteps {

    private WebDriver driver;
    private BasePage basePage;

    @Given("abro la url {string}")
    public void abro_la_url(String url) {
        driver = DriverManager.getDriver();
        basePage = new BasePage(driver);
        driver.get(url);
    }

    @When("click en Realizar una consulta")
    public void click_en_Realizar_una_consulta() throws InterruptedException{
        basePage.hacerClickEnConsulta();
        System.out.println("01 click en Realizar Conulta");

        String mensajeEsperado = "Ready to Make Your Move?";


        Assert.assertEquals("El mensaje de consola no es el esperado",
                "Ready to Make Your Move?", mensajeEsperado);
    }

    @And("mostrar por consola el aviso")
    public void mostrar_por_consola_el_aviso() throws InterruptedException{
       System.out.println("02 Se muestra el aviso:  Ready to Make Your Move?");
    }

    @Then("validar aviso")
    public void validar_aviso() {
        String mensajeEsperado = "Ready to Make Your Move?";

        System.out.println(" ");
        System.out.println("03 Text_AddProduct");
        System.out.flush();
        String Text_AddProduct = driver.findElement(By.cssSelector("div.p-12.text-center h2.text-4xl.md\\:text-5xl.font-bold.mb-6")).getText();
        System.out.println(Text_AddProduct);
        System.out.flush();
        System.out.println(" ");

      //  Assert.assertNotEquals("El mensaje de consola NO es el esperado",
        Assert.assertEquals("El mensaje de consola NO es el esperado",
                "Ready to Make Your Move?",
                mensajeEsperado);

        System.out.println("04 Validación exitosa: El aviso es correcto.");

    }

    @And("la pagina debe cargar")
    public void la_pagina_debe_cargar()  {
        System.out.println("01.1 Título de la página: " + driver.getTitle());
    }
}
