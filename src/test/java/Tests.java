import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Tests {

    @Test
    public void TC1() {

        //Test Case 1 - Testing if "Add to Bag" button puts the item to "My Bag"

        // Given that the user adds a product by using 'Add to bag' button
        // And user goes to 'My bag'
        // Then this product should be in his bag


        System.setProperty("webdriver.chrome.driver", "c:/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://www.lego.com/en-us");
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#__next > div:nth-child(7) > div > div > div.AgeGatestyles__Panels-xudtvj-2.bGqBZC > div.AgeGatestyles__Panel-xudtvj-3.AgeGatestyles__GrownUps-xudtvj-4.kGpmWw > div > button")).click();

        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/aside/div/div/div[3]/div[2]/span")));
        driver.findElement(By.xpath("/html/body/div[6]/div/aside/div/div/div[3]/div[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/aside/div/div/div[2]/div/button[2]")).click();


        driver.findElement(By.cssSelector("#blt51f52bea34c3fb01_menubutton")).click();
        driver.findElement(By.cssSelector("#blte6fb96bc03e90791_submenubutton > div")).click();
        driver.findElement(By.cssSelector("#__next > div.MediaQuery__MediaHideable-sc-1poqfy2-0.JbPTs > header > div.HeaderDesktopstyles__HeaderWrapper-r4w2ln-1.kNEtZz > div.MainBarstyles__Container-sc-1cg7sjw-1.kXzbKR > div > div:nth-child(3) > nav > div > div.SubMenustyles__Container-lbil4s-0.hvbDJ > div > div.SubMenustyles__ChildrenContainer-lbil4s-7.ffWOxg > div > div > div:nth-child(5) > a > span")).click();

        String item1 = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[4]/div/div/section/div/div/div[2]/ul/li[1]/div/div[3]/div[1]/a/h2/span")).getText();
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div[4]/div/div/section/div/div/div[2]/ul/li[1]/div/div[3]/div[2]/button")).click();

        driver.findElement(By.xpath("/html/body/div[6]/div/aside/div/div[2]/div[2]/div[2]/a")).click();

        String item2 = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/a/h3/span")).getText();


        Assertions.assertEquals(item1, item2);

        driver.quit();



    }

    @Test
    public void TC2() {

        //Test Case 1 - Testing if default search results are sorted by relevance

        // Given that the user types 'Real Madrid – Santiago Bernabéu Stadium' in the search engine
        // And search is being performed
        // And search results are displayed sorted by relevance
        // Then the first result should be Real Madrid – Santiago Bernabéu Stadium


        System.setProperty("webdriver.chrome.driver", "c:/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://www.lego.com/en-us");
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#__next > div:nth-child(7) > div > div > div.AgeGatestyles__Panels-xudtvj-2.bGqBZC > div.AgeGatestyles__Panel-xudtvj-3.AgeGatestyles__GrownUps-xudtvj-4.kGpmWw > div > button")).click();

        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/aside/div/div/div[3]/div[2]/span")));
        driver.findElement(By.xpath("/html/body/div[6]/div/aside/div/div/div[3]/div[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/aside/div/div/div[2]/div/button[2]")).click();
        driver.findElement(By.cssSelector("#__next > div.MediaQuery__MediaHideable-sc-1poqfy2-0.JbPTs > header > div.HeaderDesktopstyles__HeaderWrapper-r4w2ln-1.kNEtZz > div.MainBarstyles__Container-sc-1cg7sjw-1.kXzbKR > div > div.MainBarstyles__ActionsContainer-sc-1cg7sjw-15.dQygBi > div > button")).click();
        String itemName = "Real Madrid – Santiago Bernabéu Stadium";
        driver.findElement(By.id("desktop-search-search-input")).sendKeys(itemName);
        driver.findElement(By.id("desktop-search-search-input")).sendKeys(Keys.ENTER);
        String itemName2 = driver.findElement(By.cssSelector("#main-content > div > div.SearchPagestyles__SearchLayout-sc-1d2gqze-2.jwEPir > div > ul > li:nth-child(1) > div > div.ProductLeafSharedstyles__Column-sc-1epu2xb-1.eTTqVI > div.ProductLeafSharedstyles__DetailsRow-sc-1epu2xb-4.heRrTF > a > h2 > span")).getText();

        Assertions.assertEquals(itemName, itemName2);


        driver.quit();
    }
    @Test
    public void TC3() {

        //Test Case3 - Testing if the most expensive item in the group of under 25$ is actually less
        //than 25$

        // Given that the user selects a group of products under 25$
        // And products are displayed
        // And products sorted by 'Price: High to Low'
        // Then the first product on the list should have a price < 25$

        System.setProperty("webdriver.chrome.driver", "c:/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://www.lego.com/en-us");
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#__next > div:nth-child(7) > div > div > div.AgeGatestyles__Panels-xudtvj-2.bGqBZC > div.AgeGatestyles__Panel-xudtvj-3.AgeGatestyles__GrownUps-xudtvj-4.kGpmWw > div > button")).click();

       new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/aside/div/div/div[3]/div[2]/span")));
       driver.findElement(By.xpath("/html/body/div[6]/div/aside/div/div/div[3]/div[2]/span")).click();
       driver.findElement(By.xpath("/html/body/div[6]/div/aside/div/div/div[2]/div/button[2]")).click();


        driver.findElement(By.id("blt51f52bea34c3fb01_menubutton")).click();
        driver.findElement(By.cssSelector("#blte6fb96bc03e90791_submenubutton > div > span")).click();
        //
        driver.findElement(By.cssSelector("#__next > div.MediaQuery__MediaHideable-sc-1poqfy2-0.JbPTs > header > div.HeaderDesktopstyles__HeaderWrapper-r4w2ln-1.kNEtZz > div.MainBarstyles__Container-sc-1cg7sjw-1.kXzbKR > div > div:nth-child(3) > nav > div > div.SubMenustyles__Container-lbil4s-0.hvbDJ > div > div.SubMenustyles__ChildrenContainer-lbil4s-7.ffWOxg > div > div > div:nth-child(1) > a > span")).click();
        driver.findElement(By.cssSelector("#sortBy")).click();
        driver.findElement(By.cssSelector("#sortBy > option:nth-child(3)")).click();

        String priceStr = driver.findElement(By.cssSelector("#bltc99ee9f0de715b6b > section > div > div > div.Productsstyles__ProductsWrapper-r9qrnh-0.erhzce > ul > li:nth-child(1) > div > div.ProductLeafSharedstyles__Column-sc-1epu2xb-1.eTTqVI > div.ProductLeafSharedstyles__DetailsRow-sc-1epu2xb-4.heRrTF > div.ProductLeafSharedstyles__PriceRow-sc-1epu2xb-10.fEzYBd > div > span")).getText();

        String priceNo = priceStr.replaceAll("[^0-9]", "");

        System.out.println(priceNo);

        int intPrice = Integer.parseInt(priceNo);

        System.out.println(intPrice);

        Assertions.assertTrue(intPrice < 2500);

        driver.quit();


    }

    @Test
    public void TC4() {

        //Test Case4 - Testing if the least expensive item in the group of products over 100$ is
        // actually 100$ or more

        // Given that the user selects a group of products over 100$
        // And products are displayed
        // And products sorted by 'Price: Low to High'
        // Then the first product on the list should have a price > 100$

        System.setProperty("webdriver.chrome.driver", "c:/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://www.lego.com/en-us");
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#__next > div:nth-child(7) > div > div > div.AgeGatestyles__Panels-xudtvj-2.bGqBZC > div.AgeGatestyles__Panel-xudtvj-3.AgeGatestyles__GrownUps-xudtvj-4.kGpmWw > div > button")).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/aside/div/div/div[3]/div[2]/span")));
        driver.findElement(By.xpath("/html/body/div[6]/div/aside/div/div/div[3]/div[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/aside/div/div/div[2]/div/button[2]")).click();


        driver.findElement(By.id("blt51f52bea34c3fb01_menubutton")).click();
        driver.findElement(By.cssSelector("#blte6fb96bc03e90791_submenubutton > div")).click();
        driver.findElement(By.cssSelector("#__next > div.MediaQuery__MediaHideable-sc-1poqfy2-0.JbPTs > header > div.HeaderDesktopstyles__HeaderWrapper-r4w2ln-1.kNEtZz > div.MainBarstyles__Container-sc-1cg7sjw-1.kXzbKR > div > div:nth-child(3) > nav > div > div.SubMenustyles__Container-lbil4s-0.hvbDJ > div > div.SubMenustyles__ChildrenContainer-lbil4s-7.ffWOxg > div > div > div:nth-child(5) > a")).click();

        driver.findElement(By.cssSelector("#sortBy")).click();
        driver.findElement(By.cssSelector("#sortBy > option:nth-child(2)")).click();

        String priceStr = driver.findElement(By.cssSelector("#blt6e2c7651ff15b69a > section > div > div > div.Productsstyles__ProductsWrapper-r9qrnh-0.erhzce > ul > li:nth-child(1) > div > div.ProductLeafSharedstyles__Column-sc-1epu2xb-1.eTTqVI > div.ProductLeafSharedstyles__DetailsRow-sc-1epu2xb-4.heRrTF > div.ProductLeafSharedstyles__PriceRow-sc-1epu2xb-10.fEzYBd > div > span")).getText();


        String priceNo = priceStr.replaceAll("[^0-9]", "");

        System.out.println(priceNo);

        int intPrice = Integer.parseInt(priceNo);

        System.out.println(intPrice);

        Assertions.assertTrue(intPrice >= 10000);

        driver.quit();


    }


    @Test
    public void TC5() {

        //Test Case 1 - Testing adding products to the order by using "+" button in 'My Bag'

       // Given that the user adds a product by using 'Add to bag' button
       // And user goes to 'My bag'
       // When user clicks '+' symbol
       // Then one more of the same product is added to his order
       // And the Total Order price is equal to the sum of the values of the selected items

        System.setProperty("webdriver.chrome.driver", "c:/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://www.lego.com/en-us");
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#__next > div:nth-child(7) > div > div > div.AgeGatestyles__Panels-xudtvj-2.bGqBZC > div.AgeGatestyles__Panel-xudtvj-3.AgeGatestyles__GrownUps-xudtvj-4.kGpmWw > div > button")).click();

        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/aside/div/div/div[3]/div[2]/span")));
        driver.findElement(By.xpath("/html/body/div[6]/div/aside/div/div/div[3]/div[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/aside/div/div/div[2]/div/button[2]")).click();

        driver.findElement(By.id("blt51f52bea34c3fb01_menubutton")).click();
        driver.findElement(By.cssSelector("#__next > div.MediaQuery__MediaHideable-sc-1poqfy2-0.JbPTs > header > div.HeaderDesktopstyles__HeaderWrapper-r4w2ln-1.kNEtZz > div.MainBarstyles__Container-sc-1cg7sjw-1.kXzbKR > div > div:nth-child(3) > nav > div > div.SubMenustyles__Container-lbil4s-0.jIkTVk > ul > li:nth-child(9) > div > a")).click();
        driver.findElement(By.cssSelector("#bltd69af38026d9ea16 > section > div > div > div.Productsstyles__ProductsWrapper-r9qrnh-0.erhzce > ul > li:nth-child(3) > div > div.ProductLeafSharedstyles__Column-sc-1epu2xb-1.eTTqVI > div.ProductLeafListingstyles__ActionRow-sc-19n1otk-2.coyJam > button > div.ButtonLabelWithProgressstyles__StyledMessage-sc-19upyqe-1.ifFIha")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/aside/div/div[2]/div[2]/div[2]/a")).click();

        //adding 3 more of the same items by +
        driver.findElement(By.className("add")).click();
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.textToBePresentInElementValue(By.xpath("/html/body/div[1]/main/div/div[1]/div[2]/div[1]/div/div/div[2]/div/div[1]/div[2]/div[3]/div[2]/div/div/input"), "2"));
        driver.findElement(By.className("add")).click();
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.textToBePresentInElementValue(By.xpath("/html/body/div[1]/main/div/div[1]/div[2]/div[1]/div/div/div[2]/div/div[1]/div[2]/div[3]/div[2]/div/div/input"), "3"));
        driver.findElement(By.className("add")).click();
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.textToBePresentInElementValue(By.xpath("/html/body/div[1]/main/div/div[1]/div[2]/div[1]/div/div/div[2]/div/div[1]/div[2]/div[3]/div[2]/div/div/input"), "4"));

        String singlePrice = driver.findElement(By.cssSelector("#main-content > div > div.MinHeightContent-sc-1delze2-0.lfErNH > div.Cartstyles__Wrapper-sc-7x7mam-2.ivTbFz > div.Cartstyles__ContentContainer-sc-7x7mam-3.ccRTdK > div > div > div.LineItemSectionstyles__LineItemsContentWrapper-sc-15qoiay-2.iamOvA > div.LineItemDetailsstyles__ProductRowContainer-sc-1bhwxkp-9.dQATUj > div.LineItemDetailsstyles__CustomWrapper-sc-1bhwxkp-20.jwRwvK > div.LineItemDetailsstyles__LineItemDetailsContainer-sc-1bhwxkp-16.UIsis > div.LineItemDetailsstyles__ActionWrapper-sc-1bhwxkp-7.kTlkVB > div > div.MediaQuery__MediaHideable-sc-1poqfy2-0.NsHaz.LineItemDetailsstyles__StyledMediaQuery-sc-1bhwxkp-26.jlDxJh > div > span")).getText();
        String singlePriceNo = singlePrice.replaceAll("[^0-9]", "");
        int intSinglePrice = Integer.parseInt(singlePriceNo);

        String sumPrice = driver.findElement(By.cssSelector("#main-content > div > div.MinHeightContent-sc-1delze2-0.lfErNH > div.Cartstyles__Wrapper-sc-7x7mam-2.ivTbFz > div.Cartstyles__OrderSummaryWrapper-sc-7x7mam-12.feXgXF > div.Cartstyles__OrderSummaryContainer-sc-7x7mam-4.fqJXVx > div > div.OrderSummarystyles__Summary-sc-1c05ehf-2.jqURki > div.OrderSummarystyles__SummaryWrapper-sc-1c05ehf-14.oPylr > div.MediaQuery__MediaHideable-sc-1poqfy2-0.NsHaz > div > div.MediaQuery__MediaHideable-sc-1poqfy2-0.NsHaz > div > span > span")).getText();
        String sumPriceNo = sumPrice.replaceAll("[^0-9]", "");
        int intSumPrice = Integer.parseInt(sumPriceNo);

        String noOfItems = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/div[2]/div[3]/div[2]/div/div/input")).getDomProperty("value");

        int intNoOfItems = Integer.parseInt(noOfItems);

        int singlePriceMultiplied = intSinglePrice * intNoOfItems;

        System.out.println(singlePriceMultiplied);
        System.out.println(intSumPrice);


        Assertions.assertTrue(singlePriceMultiplied == intSumPrice);

        driver.quit();


    }

    @Test
    public void TC6() {

        //Test Case 1 - Testing adding products to the order by using "+" button in 'My Bag'

        // Given that the user opens bestsellers
        // And user opens chosen product details by clicking on products name
        // And user types "5" in the products quantity selection tool
        // And user clicks on 'Add to Bag' button
        // When user goes to 'My bag'
        // Then 5 items of the previously chosen product should be in his 'bag'


        System.setProperty("webdriver.chrome.driver", "c:/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://www.lego.com/en-us");
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#__next > div:nth-child(7) > div > div > div.AgeGatestyles__Panels-xudtvj-2.bGqBZC > div.AgeGatestyles__Panel-xudtvj-3.AgeGatestyles__GrownUps-xudtvj-4.kGpmWw > div > button")).click();

        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/aside/div/div/div[3]/div[2]/span")));
        driver.findElement(By.xpath("/html/body/div[6]/div/aside/div/div/div[3]/div[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/aside/div/div/div[2]/div/button[2]")).click();

        driver.findElement(By.id("blt51f52bea34c3fb01_menubutton")).click();
        driver.findElement(By.cssSelector("#__next > div.MediaQuery__MediaHideable-sc-1poqfy2-0.JbPTs > header > div.HeaderDesktopstyles__HeaderWrapper-r4w2ln-1.kNEtZz > div.MainBarstyles__Container-sc-1cg7sjw-1.kXzbKR > div > div:nth-child(3) > nav > div > div.SubMenustyles__Container-lbil4s-0.jIkTVk > ul > li:nth-child(9) > div > a")).click();
        driver.findElement(By.cssSelector("#bltd69af38026d9ea16 > section > div > div > div.Productsstyles__ProductsWrapper-r9qrnh-0.erhzce > ul > li:nth-child(7) > div > div.ProductLeafSharedstyles__Column-sc-1epu2xb-1.eTTqVI > div.ProductLeafSharedstyles__DetailsRow-sc-1epu2xb-4.heRrTF > a > h2")).click();



        driver.findElement(By.cssSelector("#main-content > div > div.ProductDetailsPagestyles__ProductOverviewContainer-sc-1waehzg-1.dgDnXa > div > div.ProductOverviewstyles__Container-sc-1a1az6h-2.hrtCoK > div.QuantitySelectorstyles__Container-sc-1nfm8rg-0.hsSpBq.ProductActionsstyles__QuantitySelector-sc-18otgdy-5.gEGZyQ > div.Quantitystyles__QuantityWrapper-ee4u7w-0.hDZZEl.QuantitySelectorstyles__Quantity-sc-1nfm8rg-1.bcUUur > div > input")).sendKeys("5");
        driver.findElement(By.cssSelector("#main-content > div > div.ProductDetailsPagestyles__ProductOverviewContainer-sc-1waehzg-1.dgDnXa > div > div.ProductOverviewstyles__Container-sc-1a1az6h-2.hrtCoK > div.ProductActionsstyles__ButtonsWrapper-sc-18otgdy-6.gLGIpK > div.ProductActionsstyles__AddToBagButtonWrapper-sc-18otgdy-7.grMSxO > div > div > div > button > div.ButtonLabelWithProgressstyles__StyledMessage-sc-19upyqe-1.ifFIha")).click();
        driver.findElement(By.cssSelector("body > div:nth-child(23) > div > aside > div > div.AddToBagModalstyles__Container-thtx66-4.bqReQg > div.AddToBagModalstyles__Body-thtx66-6.bgklcV > div.AddToBagModalstyles__ActionsContainer-thtx66-12.ebHfkF > a")).click();

        String itemsStr = driver.findElement(By.cssSelector("#main-content > div > div.MinHeightContent-sc-1delze2-0.lfErNH > div.Cartstyles__Wrapper-sc-7x7mam-2.ivTbFz > div.Cartstyles__ContentContainer-sc-7x7mam-3.ccRTdK > div > div > div.LineItemSectionstyles__LineItemsContentWrapper-sc-15qoiay-2.iamOvA > div.LineItemDetailsstyles__ProductRowContainer-sc-1bhwxkp-9.dQATUj > div.LineItemDetailsstyles__CustomWrapper-sc-1bhwxkp-20.jwRwvK > div.LineItemDetailsstyles__LineItemDetailsContainer-sc-1bhwxkp-16.UIsis > div.LineItemDetailsstyles__ActionWrapper-sc-1bhwxkp-7.kTlkVB > div.LineItemDetailsstyles__QuantityContainer-sc-1bhwxkp-2.faijVH > div > div > input")).getDomProperty("value");


        int itemsInt = Integer.parseInt(itemsStr);

        Assertions.assertEquals(5, itemsInt);

        driver.quit();
    }
    }
