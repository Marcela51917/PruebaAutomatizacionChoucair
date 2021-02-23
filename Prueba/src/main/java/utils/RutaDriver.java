package utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class RutaDriver{
    public static void main(String[] args) {
// declaracion e instanciar los objectos/variables
        System.setProperty("webdriver.chrome.driver","C:\\Users\\marce\\IdeaProjects\\Prueba\\src\\test\\resources\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
          String baseUrl = "http://utest.com";
          driver.get(baseUrl);
//Cerrar chrome
          driver.close();
    }
}