import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FT {
    @Test
    public void checkLinks(){
       System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.ft.com/global-economy");
       driver.get("https://www.ft.com/companies/financials");
       driver.get("https://www.ft.com/banks");
       driver.get("https://www.ft.com/companies/insurance");
       driver.get("https://www.ft.com/companies/property");
       driver.get("https://www.ft.com/companies/financial-services");
        driver.get("https://www.ft.com/support-services");
        driver.get("https://www.ft.com/companies/professional-services");

        driver.get("https://www.ft.com/markets");
        driver.get("https://www.ft.com/alphaville");
        driver.get("https://markets.ft.com/data");
        driver.get("https://www.ft.com/cryptofinance");
        driver.get("https://www.ft.com/capital-markets");

        driver.get("https://www.ft.com/commodities");
        driver.get("https://www.ft.com/oil");
        driver.get("https://www.ft.com/gold");
        driver.get("https://www.ft.com/copper");

        driver.get("https://www.ft.com/currencies");
        driver.get("https://www.ft.com/us-dollar");
        driver.get("https://www.ft.com/euro");
        driver.get("https://www.ft.com/pound-sterling");
        driver.get("https://www.ft.com/renminbi");
        driver.get("https://www.ft.com/yen");

        driver.get("https://www.ft.com/equities");
        driver.get("https://www.ft.com/fund-management");

        driver.get("https://www.ft.com/ft-trading-room");
        driver.get("https://www.ft.com/ft-trading-room/clearing-settlement");
        driver.get("https://www.ft.com/ft-trading-room/high-frequency-trading");
        driver.get("https://www.ft.com/financial-markets-regulation");
        driver.get("https://www.ft.com/otc-markets");
        driver.get("https://www.ft.com/derivatives");

        driver.get("https://www.ft.com/moral-money");
        driver.get("https://etf.ft.com/");


    }
}
