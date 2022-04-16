package Demo;


import com.microsoft.playwright.*;

import java.util.List;

public class createElements {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

     /*   BrowserContext browsercontext1 = browser.newContext();
        Page p1 = browsercontext1.newPage();
        p1.navigate("https://www.orangehrm.com/");

        //Single Element
        Locator contactSales = p1.locator("text = CONTACT SALES");
        contactSales.hover();
        contactSales.click();*/



      /*  BrowserContext browsercontext2 = browser.newContext();
        Page p2 = browsercontext2.newPage();
        p2.navigate("https://academy.naveenautomationlabs.com/");
        Locator LoginBtn = p2.locator("text = Login");
        int logincount = LoginBtn.count();
        System.out.println("Login Count"+logincount);
        LoginBtn.hover();
        LoginBtn.first().click();*/

        //Multiple elements
        BrowserContext browsercontext3 = browser.newContext();
        Page p3 = browsercontext3.newPage();
        p3.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/");
        Locator countryOptions = p3.locator("select#Form_submitForm_Country option");
        System.out.println(countryOptions.count());

        for (int i=0;i<countryOptions.count();i++){
            String countryText = countryOptions.nth(i).textContent();
            System.out.println(countryText);
        }

        List<String> optionsTextList = countryOptions.allTextContents();
        for(String e:optionsTextList) {
            System.out.println(e);
        }
        optionsTextList.forEach(e->System.out.println(e));
    }


}
