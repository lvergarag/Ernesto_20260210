package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    //    Text_AddProduct = driver.find_element(By.XPATH, "/html/body/div/div[3]/div[1]/div[1]/h1")

    // Agregamos 'throws InterruptedException' porque usamos sleep
    public void hacerClickEnConsulta() throws InterruptedException {
        Thread.sleep(5000); // Pausa inicial solicitada

        By locator = By.xpath("//*[contains(text(), 'Make an Inquiry')]");

        try {
            WebElement boton = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", boton);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", boton);

            Thread.sleep(5000); // Pausa final antes de cerrar
        } catch (Exception e) {
            throw e;
        }
    }
}