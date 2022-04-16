package Demo;

import com.microsoft.playwright.*;

public class browserContext {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        BrowserContext browsercontext1 = browser.newContext();
        Page p1 = browsercontext1.newPage();
        p1.navigate("https://www.orangehrm.com/");
        p1.fill("#myText","Test");
        System.out.println(p1.title());

        BrowserContext browsercontext2 = browser.newContext();
        Page p2 = browsercontext2.newPage();
        p2.navigate("http://automationpractice.com/index.php");
        p2.fill("#search_query_top","Test");
        System.out.println(p1.title());

    }
}
