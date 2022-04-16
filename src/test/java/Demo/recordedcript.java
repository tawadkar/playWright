package Demo;
import com.microsoft.playwright.*;

public class recordedcript {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            // Open new page
            Page page = context.newPage();
            // Go to https://academy.naveenautomationlabs.com/
            page.navigate("https://academy.naveenautomationlabs.com/");
            // Click text=Login
            page.click("text=Login");
            // Click button:has-text("Sign Up")
            page.click("button:has-text(\"Sign Up\")");
            // Click [placeholder="Name"]
            page.click("[placeholder=\"Name\"]");
            // Press CapsLock
            page.press("[placeholder=\"Name\"]", "CapsLock");
            // Fill [placeholder="Name"]
            page.fill("[placeholder=\"Name\"]", "T");
            // Press CapsLock
            page.press("[placeholder=\"Name\"]", "CapsLock");
            // Fill [placeholder="Name"]
            page.fill("[placeholder=\"Name\"]", "Tanmay");
            // Press Tab
            page.press("[placeholder=\"Name\"]", "Tab");
            // Fill [placeholder="Email"]
            page.fill("[placeholder=\"Email\"]", "twadkar@gmail.com");
            // Click [placeholder="Create Password"]
            page.click("[placeholder=\"Create Password\"]");
            // Fill [placeholder="Create Password"]
            page.fill("[placeholder=\"Create Password\"]", "jagfuysdtf");
            // Click [placeholder="Mobile"]
            page.click("[placeholder=\"Mobile\"]");
            // Fill [placeholder="Mobile"]
            page.fill("[placeholder=\"Mobile\"]", "94756963563");
            // Click .modal-header
            page.click(".modal-header");
            // Click #loginFormHtml div [aria-label="Close"]
            page.click("#loginFormHtml div [aria-label=\"Close\"]");
        }
    }
}
