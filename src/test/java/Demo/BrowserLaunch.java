package Demo;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserLaunch {
    public static void main(String[] args) {
        //create methods returns playwright and starts playwright server
        Playwright playwright = Playwright.create();
        // sets browser context, execution will be headless by default therefore set it false to launch actually
       // Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        //To launch Chrome (This will launch chrome based on chromium)/edge browsers
        LaunchOptions lp=  new LaunchOptions();
        lp.setChannel("chrome"); //msedge/firefox/chrome-beta/msedge-beta
        lp.setHeadless(false);
        Browser browser = playwright.chromium().launch(lp);
        //sets page context
        Page page = browser.newPage();

        page.navigate("https://www.amazon.com/");
        String title =  page.title();
        System.out.print(title);

        browser.close();
        playwright.close();
    }
}
