import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraidinView {
    @Test
    public void checkLinks() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tradingview.com/symbols/NASDAQ-AMZN/financials-overview/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-AMZN/financials-income-statement/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-AMZN/financials-balance-sheet/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-AMZN/financials-cash-flow/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-AMZN/financials-earnings/");

        driver.get("https://www.tradingview.com/symbols/NASDAQ-AAPL/financials-overview/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-AAPL/financials-income-statement/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-AAPL/financials-balance-sheet/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-AAPL/financials-cash-flow/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-AAPL/financials-dividends/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-AAPL/financials-earnings/");

        driver.get("https://www.tradingview.com/symbols/NASDAQ-GOOG/financials-overview/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-GOOG/financials-income-statement/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-GOOG/financials-balance-sheet/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-GOOG/financials-cash-flow/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-GOOG/financials-earnings/");

        driver.get("https://www.tradingview.com/symbols/NASDAQ-MSFT/financials-overview/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-MSFT/financials-income-statement/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-MSFT/financials-balance-sheet/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-MSFT/financials-cash-flow/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-MSFT/financials-dividends/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-MSFT/financials-earnings/");

        driver.get("https://www.tradingview.com/symbols/NASDAQ-TSLA/financials-overview/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-TSLA/financials-income-statement/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-TSLA/financials-balance-sheet/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-TSLA/financials-cash-flow/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-TSLA/financials-earnings/");

        driver.get("https://www.tradingview.com/symbols/NASDAQ-META/financials-overview/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-META/financials-income-statement/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-META/financials-balance-sheet/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-META/financials-cash-flow/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-META/financials-earnings/");

        driver.get("https://www.tradingview.com/symbols/NYSE-V/financials-overview/");
        driver.get("https://www.tradingview.com/symbols/NYSE-V/financials-income-statement/");
        driver.get("https://www.tradingview.com/symbols/NYSE-V/financials-balance-sheet/");
        driver.get("https://www.tradingview.com/symbols/NYSE-V/financials-cash-flow/");
        driver.get("https://www.tradingview.com/symbols/NYSE-V/financials-dividends/");
        driver.get("https://www.tradingview.com/symbols/NYSE-V/financials-earnings/");

        driver.get("https://www.tradingview.com/symbols/NASDAQ-NVDA/financials-overview/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-NVDA/financials-income-statement/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-NVDA/financials-balance-sheet/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-NVDA/financials-cash-flow/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-NVDA/financials-dividends/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-NVDA/financials-earnings/");

        driver.get("https://www.tradingview.com/symbols/NYSE-WMT/financials-overview/");
        driver.get("https://www.tradingview.com/symbols/NYSE-WMT/financials-income-statement/");
        driver.get("https://www.tradingview.com/symbols/NYSE-WMT/financials-balance-sheet/");
        driver.get("https://www.tradingview.com/symbols/NYSE-WMT/financials-cash-flow/");
        driver.get("https://www.tradingview.com/symbols/NYSE-WMT/financials-dividends/");
        driver.get("https://www.tradingview.com/symbols/NYSE-WMT/financials-earnings/");

        driver.get("https://www.tradingview.com/symbols/NYSE-KO/financials-overview/");
        driver.get("https://www.tradingview.com/symbols/NYSE-KO/financials-income-statement/");
        driver.get("https://www.tradingview.com/symbols/NYSE-KO/financials-balance-sheet/");
        driver.get("https://www.tradingview.com/symbols/NYSE-KO/financials-cash-flow/");
        driver.get("https://www.tradingview.com/symbols/NYSE-KO/financials-dividends/");
        driver.get("https://www.tradingview.com/symbols/NYSE-KO/financials-earnings/");

        driver.get("https://www.tradingview.com/symbols/NYSE-PFE/financials-overview/");
        driver.get("https://www.tradingview.com/symbols/NYSE-PFE/financials-income-statement/");
        driver.get("https://www.tradingview.com/symbols/NYSE-PFE/financials-balance-sheet/");
        driver.get("https://www.tradingview.com/symbols/NYSE-PFE/financials-cash-flow/");
        driver.get("https://www.tradingview.com/symbols/NYSE-PFE/financials-dividends/");
        driver.get("https://www.tradingview.com/symbols/NYSE-PFE/financials-earnings/");

        driver.get("https://www.tradingview.com/symbols/NYSE-MA/financials-overview/");
        driver.get("https://www.tradingview.com/symbols/NYSE-MA/financials-income-statement/");
        driver.get("https://www.tradingview.com/symbols/NYSE-MA/financials-balance-sheet/");
        driver.get("https://www.tradingview.com/symbols/NYSE-MA/financials-cash-flow/");
        driver.get("https://www.tradingview.com/symbols/NYSE-MA/financials-dividends/");
        driver.get("https://www.tradingview.com/symbols/NYSE-MA/financials-earnings/");

        driver.get("https://www.tradingview.com/symbols/NASDAQ-PEP/financials-overview/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-PEP/financials-income-statement/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-PEP/financials-balance-sheet/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-PEP/financials-cash-flow/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-PEP/financials-dividends/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-PEP/financials-earnings/");

        driver.get("https://www.tradingview.com/symbols/NYSE-DIS/financials-overview/");
        driver.get("https://www.tradingview.com/symbols/NYSE-DIS/financials-income-statement/");
        driver.get("https://www.tradingview.com/symbols/NYSE-DIS/financials-balance-sheet/");
        driver.get("https://www.tradingview.com/symbols/NYSE-DIS/financials-cash-flow/");
        driver.get("https://www.tradingview.com/symbols/NYSE-DIS/financials-earnings/");

        driver.get("https://www.tradingview.com/symbols/NYSE-ORCL/financials-overview/");
        driver.get("https://www.tradingview.com/symbols/NYSE-ORCL/financials-income-statement/");
        driver.get("https://www.tradingview.com/symbols/NYSE-ORCL/financials-balance-sheet/");
        driver.get("https://www.tradingview.com/symbols/NYSE-ORCL/financials-cash-flow/");
        driver.get("https://www.tradingview.com/symbols/NYSE-ORCL/financials-dividends/");

        driver.get("https://www.tradingview.com/symbols/NYSE-MCD/financials-overview/");
        driver.get("https://www.tradingview.com/symbols/NYSE-MCD/financials-income-statement/");
        driver.get("https://www.tradingview.com/symbols/NYSE-MCD/financials-balance-sheet/");
        driver.get("https://www.tradingview.com/symbols/NYSE-MCD/financials-cash-flow/");
        driver.get("https://www.tradingview.com/symbols/NYSE-MCD/financials-dividends/");
        driver.get("https://www.tradingview.com/symbols/NYSE-MCD/financials-earnings/");

        driver.get("https://www.tradingview.com/symbols/NASDAQ-ADBE/financials-overview/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-ADBE/financials-income-statement/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-ADBE/financials-balance-sheet/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-ADBE/financials-cash-flow/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-ADBE/financials-earnings/");

        driver.get("https://www.tradingview.com/symbols/NYSE-NKE/financials-overview/");
        driver.get("https://www.tradingview.com/symbols/NYSE-NKE/financials-income-statement/");
        driver.get("https://www.tradingview.com/symbols/NYSE-NKE/financials-balance-sheet/");
        driver.get("https://www.tradingview.com/symbols/NYSE-NKE/financials-cash-flow/");
        driver.get("https://www.tradingview.com/symbols/NYSE-NKE/financials-dividends/");
        driver.get("https://www.tradingview.com/symbols/NYSE-NKE/financials-earnings/");

        driver.get("https://www.tradingview.com/symbols/NASDAQ-INTC/financials-overview/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-INTC/financials-income-statement/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-INTC/financials-balance-sheet/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-INTC/financials-cash-flow/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-INTC/financials-dividends/");
        driver.get("https://www.tradingview.com/symbols/NASDAQ-INTC/financials-earnings/");

        driver.get(" https://www.tradingview.com/symbols/NYSE-CVS/financials-overview/");
        driver.get(" https://www.tradingview.com/symbols/NYSE-CVS/financials-income-statement/");
        driver.get("https://www.tradingview.com/symbols/NYSE-CVS/financials-balance-sheet/");
        driver.get("https://www.tradingview.com/symbols/NYSE-CVS/financials-cash-flow/");
        driver.get("https://www.tradingview.com/symbols/NYSE-CVS/financials-dividends/");
        driver.get(" https://www.tradingview.com/symbols/NYSE-CVS/financials-earnings/");

        driver.get("  https://www.tradingview.com/symbols/NASDAQ-AMGN/financials-overview/");
        driver.get("  https://www.tradingview.com/symbols/NASDAQ-AMGN/financials-income-statement/");
        driver.get("  https://www.tradingview.com/symbols/NASDAQ-AMGN/financials-balance-sheet/");
        driver.get(" https://www.tradingview.com/symbols/NASDAQ-AMGN/financials-cash-flow/");
        driver.get(" https://www.tradingview.com/symbols/NASDAQ-AMGN/financials-dividends/");
        driver.get(" https://www.tradingview.com/symbols/NASDAQ-AMGN/financials-earnings/");

        driver.get(" https://www.tradingview.com/symbols/NASDAQ-PYPL/financials-overview/");
        driver.get(" https://www.tradingview.com/symbols/NASDAQ-PYPL/financials-income-statement/");
        driver.get(" https://www.tradingview.com/symbols/NASDAQ-PYPL/financials-balance-sheet/");
        driver.get(" https://www.tradingview.com/symbols/NASDAQ-PYPL/financials-cash-flow/");
        driver.get(" https://www.tradingview.com/symbols/NASDAQ-PYPL/financials-earnings/");

        driver.get(" https://www.tradingview.com/symbols/NASDAQ-NFLX/financials-overview/");
        driver.get(" https://www.tradingview.com/symbols/NASDAQ-NFLX/financials-income-statement/");
        driver.get(" https://www.tradingview.com/symbols/NASDAQ-NFLX/financials-balance-sheet/");
        driver.get(" https://www.tradingview.com/symbols/NASDAQ-NFLX/financials-cash-flow/");
        driver.get(" https://www.tradingview.com/symbols/NASDAQ-NFLX/financials-earnings/");

        driver.get(" https://www.tradingview.com/symbols/NASDAQ-SBUX/financials-overview/");
        driver.get(" https://www.tradingview.com/symbols/NASDAQ-SBUX/financials-income-statement/");
        driver.get(" https://www.tradingview.com/symbols/NASDAQ-SBUX/financials-balance-sheet/");
        driver.get(" https://www.tradingview.com/symbols/NASDAQ-SBUX/financials-cash-flow/");
        driver.get(" https://www.tradingview.com/symbols/NASDAQ-SBUX/financials-dividends/");
        driver.get(" https://www.tradingview.com/symbols/NASDAQ-SBUX/financials-earnings/");
    }
}
