import org.openqa.selenium.By;

public class SignUp {
	static void open(String browser) throws Exception {
		Common.open("firefox", "http://alex.academy/exe/signup/www/index.php");
	}

	static void validate() throws Exception {
		Common.isElementPresent(By.id("id_fname"));
		Common.setValue(By.id("id_fname"), "Greg");
		Thread.sleep(1000);
		Common.isElementPresent(By.id("id_lname"));
		Common.setValue(By.id("id_lname"), "Zink");
		Thread.sleep(1000);
		Common.isElementPresent(By.id("id_email"));
		Common.setValue(By.id("id_email"), "greg@gmail.com");
		Thread.sleep(1000);
		Common.isElementPresent(By.id("id_phone"));
		Common.setValue(By.id("id_phone"), "415 555-1212");
		Thread.sleep(1000);

	}
}
