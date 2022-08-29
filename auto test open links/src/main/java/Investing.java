import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Investing {
    @Test
    public void checkLinks() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.investing.com/markets/");
        driver.get("https://www.investing.com/indices/");
        driver.get("https://www.investing.com/indices/indices-futures");
        driver.get("https://www.investing.com/indices/major-indices");
        driver.get("https://www.investing.com/indices/indices-cfds");
        driver.get("https://www.investing.com/indices/world-indices");
        driver.get("https://www.investing.com/indices/global-indices");
        driver.get("https://www.investing.com/indices/us-30-futures");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.investing.com/indices/us-spx-500-futures");
        driver.get("https://www.investing.com/indices/nq-100-futures");
        driver.get("https://www.investing.com/indices/us-spx-500");
        driver.get("https://www.investing.com/indices/us-30");
        driver.get("https://www.investing.com/indices/nq-100");
        driver.get("https://www.investing.com/indices/germany-30");
        driver.get("https://www.investing.com/indices/uk-100");
        driver.get("https://www.investing.com/indices/eu-stoxx50");
        driver.get("https://www.investing.com/indices/japan-ni225");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.investing.com/equities/");
        driver.get("https://www.investing.com/equities/trending-stocks");
        driver.get("https://www.investing.com/equities/united-states");
        driver.get("https://www.investing.com/equities/pre-market");
        driver.get("https://www.investing.com/earnings-calendar/");
        driver.get("https://www.investing.com/equities/americas");
        driver.get("https://www.investing.com/equities/europe");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.investing.com/equities/52-week-high");
        driver.get("https://www.investing.com/equities/52-week-low");
        driver.get("https://www.investing.com/equities/most-active-stocks");
        driver.get("https://www.investing.com/equities/top-stock-gainers");
        driver.get("https://www.investing.com/equities/top-stock-losers");
        driver.get("https://www.investing.com/equities/world-adrs");
        driver.get("https://www.investing.com/equities/cannabis-stocks");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.investing.com/equities/apple-computer-inc");
        driver.get("https://www.investing.com/equities/tesla-motors");
        driver.get("https://www.investing.com/equities/facebook-inc");
        driver.get("https://www.investing.com/equities/amazon-com-inc");
        driver.get("https://www.investing.com/equities/microsoft-corp");
        driver.get("https://www.investing.com/equities/nvidia-corp");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.investing.com/equities/netflix,-inc.");
        driver.get("https://www.investing.com/equities/pfizer");
        driver.get("https://www.investing.com/equities/adv-micro-device");
        driver.get("https://www.investing.com/equities/boeing-co");
        driver.get("https://www.investing.com/equities/gamestop-corp");
        driver.get("https://www.investing.com/equities/amc-entertat-hld");
        driver.get("https://www.investing.com/equities/nio-inc");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.investing.com/commodities/");
        driver.get("https://www.investing.com/commodities/real-time-futures");
        driver.get("https://www.investing.com/commodities/metals");
        driver.get("https://www.investing.com/commodities/energy");
        driver.get("https://www.investing.com/commodities/grains");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.investing.com/commodities/softs");
        driver.get("https://www.investing.com/commodities/meats");
        driver.get("https://www.investing.com/indices/commodities-indices");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.investing.com/commodities/gold");
        driver.get("https://www.investing.com/commodities/crude-oil");
        driver.get("https://www.investing.com/commodities/brent-oil");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.investing.com/commodities/silver");
        driver.get("https://www.investing.com/commodities/natural-gas");
        driver.get("https://www.investing.com/commodities/copper");
        driver.get("https://www.investing.com/commodities/us-wheat");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.investing.com/crypto/");
        driver.get("https://www.investing.com/crypto/currencies");
        driver.get("https://www.investing.com/crypto/bitcoin");
        driver.get("https://www.investing.com/crypto/ethereum");
        driver.get("https://www.investing.com/crypto/cardano");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.investing.com/crypto/solana");
        driver.get("https://www.investing.com/crypto/dogecoin");
        driver.get("https://www.investing.com/crypto/shiba-inu");
        driver.get("https://www.investing.com/crypto/xrp");
        driver.get("https://www.investing.com/currency-converter/?tag=Cryptocurrency");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.investing.com/crypto/bitcoin/btc-usd");
        driver.get("https://www.investing.com/crypto/ethereum/eth-usd");
        driver.get("https://www.investing.com/crypto/bitcoin-cash/bch-usd");
        driver.get("https://www.investing.com/crypto/litecoin/ltc-usd");
        driver.get("https://www.investing.com/crypto/dogecoin/doge-usd");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(" https://www.investing.com/crypto/ethereum-classic/etc-usd");
        driver.get(" https://www.investing.com/crypto/ethereum/eth-btc");
        driver.get(" https://www.investing.com/crypto/xrp/xrp-usd");
        driver.get(" https://www.investing.com/crypto/bitcoin/bitcoin-futures");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get(" https://www.investing.com/currencies/");
        driver.get(" https://www.investing.com/currencies/streaming-forex-rates-majors");
        driver.get(" https://www.investing.com/currencies/single-currency-crosses");
        driver.get("https://www.investing.com/currencies/live-currency-cross-rates");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(" https://www.investing.com/currencies/exchange-rates-table");
        driver.get("https://www.investing.com/rates-bonds/forward-rates");
        driver.get("https://www.investing.com/currencies/fx-futures");
        driver.get("https://www.investing.com/currencies/forex-options");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.investing.com/currencies/eur-usd");
        driver.get("https://www.investing.com/currencies/gbp-usd");
        driver.get("https://www.investing.com/currencies/eur-chf");
        driver.get("https://www.investing.com/currencies/aud-usd");
        driver.get("https://www.investing.com/currencies/usd-jpy");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.investing.com/currencies/usd-cad");
        driver.get("https://www.investing.com/currencies/usd-chf");
        driver.get("https://www.investing.com/currencies/usd-try");
        driver.get("https://www.investing.com/currencies/usd-mxn");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.investing.com/crypto/bitcoin/btc-usd");
        driver.get("https://www.investing.com/currencies/usd-rub");
        driver.get("https://www.investing.com/currencies/us-dollar-index");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.investing.com/etfs/");
        driver.get("https://www.investing.com/etfs/world-etfs");
        driver.get("https://www.investing.com/etfs/major-etfs");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.investing.com/etfs/usa-etfs");
        driver.get("https://www.investing.com/etfs/cannabis-etfs");

        driver.get("https://www.investing.com/etfs/spdr-s-p-500");
        driver.get("https://www.investing.com/etfs/ishares-msci-emg-markets");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.investing.com/etfs/diamonds-trust");
        driver.get("https://www.investing.com/etfs/powershares-qqqq");

        driver.get("https://www.investing.com/funds/");
        driver.get("https://www.investing.com/funds/world-funds");
        driver.get("https://www.investing.com/funds/major-funds");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.investing.com/funds/vanguard-500-index-admiral");
        driver.get("https://www.investing.com/funds/vanguard-total-bond-market-ii-idx-i");
        driver.get("https://www.investing.com/funds/american-funds-capital-income-bldr");
        driver.get("https://www.investing.com/funds/pimco-commodity-real-ret-strat-inst");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.investing.com/rates-bonds/");
        driver.get("https://www.investing.com/rates-bonds/world-government-bonds");
        driver.get(" https://www.investing.com/rates-bonds/financial-futures");
        driver.get("https://www.investing.com/rates-bonds/government-bond-spreads");
        driver.get("https://www.investing.com/indices/bond-indices");
        driver.get("https://www.investing.com/rates-bonds/forward-rates");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.investing.com/rates-bonds/u.s.-10-year-bond-yield");
        driver.get("https://www.investing.com/rates-bonds/u.s.-30-year-bond-yield");
        driver.get("https://www.investing.com/rates-bonds/u.s.-2-year-bond-yield");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.investing.com/rates-bonds/u.s.-5-year-bond-yield");
        driver.get("https://www.investing.com/rates-bonds/u.s.-3-month-bond-yield");
        driver.get("https://www.investing.com/rates-bonds/us-10-yr-t-note");
        driver.get("https://www.investing.com/rates-bonds/us-30-yr-t-bond");
        driver.get("https://www.investing.com/rates-bonds/euro-bund");

    }
}
