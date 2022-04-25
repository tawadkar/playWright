package Demo;

import com.microsoft.playwright.*;

public class textSelectors {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        Page page  = browser.newPage();
       // page.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/");
       /* Locator links  = page.locator("text=Privacy Policy");
        for(int i=0;i< links.count();i++){
            String text = links.nth(i).textContent();
            if(text.contains("Service Privacy Policy")){
                links.nth(i).click();
                break;
            }
        }*/
        page.navigate("https://demo.opencart.com/index.php?route=account/login");
        String header = page.locator("div.well h2:has-text('New Customer')").textContent();
        System.out.println(header);

        String pageHeader= page.locator("Your Store").textContent();
        System.out.println(pageHeader);
        //or
        String pageHeader1 = page.locator("text=Your Store").first().textContent();
        page.locator("form input:has-text=('Login')").click();


    }
}
