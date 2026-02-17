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
    public void click_en_Realizar_Una_Consulta() throws InterruptedException{
        basePage.hacerClickEnConsulta();
        System.out.println("01 click en Realizar Conulta");
        String textoReal = driver.findElement(By.cssSelector("div.p-12.text-center h2")).getText();
        String mensajeEsperado = "Ready to Make Your Move?";

        Assert.assertEquals("El mensaje de pagina no es el esperado",
                mensajeEsperado, textoReal);
    }

    @When("click en Mas Informacion")
    public void click_en_Mas_Informacion() throws InterruptedException{
        basePage.click_en_Mas_Informacion();
        Thread.sleep(5000);

        String textoReal2 = driver.findElement(By.cssSelector("h2")).getText();
        Assert.assertEquals("Why Python.com?", textoReal2);

    }

    @And("mostrar aviso Ready to Make Your Move")
    public void mostrar_aviso_Ready_to_Make_Your_Move() throws InterruptedException{
        System.out.println("02 Se muestra el aviso:  Ready to Make Your Move? ");
    }

    @And("mostrar aviso Why Python.com")
    public void mostrar_aviso_Why_Python() throws InterruptedException{
        System.out.println("02 Se muestra el aviso:  WhyPython? ");
    }

    @Then("validar aviso")
    public void validar_aviso() {
        String mensajeEsperado = "Ready to Make Your Move?";
        System.out.println(" ");
        System.out.println("03 Text_AddProduct ");
        String Text_AddProduct = driver.findElement(By.cssSelector("div.p-12.text-center h2.text-4xl.md\\:text-5xl.font-bold.mb-6")).getText();
        System.out.println(Text_AddProduct);
        System.out.println(" ");

        Assert.assertEquals("El mensaje de consola NO es el esperado",
                Text_AddProduct ,
                mensajeEsperado);

        System.out.println("04 Validación exitosa: El aviso es correcto. ");
    }
        @Then("validar aviso 2")
        public void validar_aviso_2() {
            String mensajeEsperado2 = "Why Python.com?";
            System.out.println(" ");
            System.out.println("03.1 Text_AddProduct 2");
            String Text_AddProduct_2 =driver.findElement(By.cssSelector("h2[class='text-4xl md:text-5xl font-bold mb-6 bg-gradient-to-r from-foreground to-primary bg-clip-text text-transparent']")).getText();
            System.out.println(Text_AddProduct_2);
            System.out.println(" ");

            Assert.assertEquals("El mensaje de consola NO es el esperado",
                    mensajeEsperado2,
                    Text_AddProduct_2);

            System.out.println("04 Validación exitosa: El aviso 2 es correcto. ");
        }

    @And("la pagina debe cargar")
    public void la_pagina_debe_cargar()  {
        System.out.println("01.1 Título de la página : " + driver.getTitle());
    }
}
