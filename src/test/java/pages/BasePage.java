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

    public void click_en_Mas_Informacion() throws InterruptedException {
        Thread.sleep(5000); // Pausa inicial solicitada

        By locator = By.xpath("//button[@class='inline-flex items-center justify-center gap-2 whitespace-nowrap font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 [&_svg]:pointer-events-none [&_svg]:size-4 [&_svg]:shrink-0 border bg-background hover:text-accent-foreground h-11 rounded-md text-lg px-8 py-6 border-primary/30 hover:border-primary/50 hover:bg-primary/5']");

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