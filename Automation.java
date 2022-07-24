//Assignment-5
package week3.day1.Assignment;
interface Language {
	public void java(); // interface method
}

interface TestTool {
	public void selenium(); // interface method
}

class MultipleLanguage implements Language, TestTool {
	public void java() {
		System.out.println("Java: multipurpose language that adjusts efficiently to web development.");
	}
	public void selenium() {
		System.out.println("Selenium WebDriver is one of the most popular open source website automation tools");
	}
	public void python() {
		System.out.println("Python: it works in a wide variety of contexts and on the web has technical advantages.");
	}
	public void ruby() {
		System.out.println("Ruby on Rails: allows you to design web applications quickly.");
	}

}

public class Automation {

	public static void main(String[] args) {

		MultipleLanguage myObj = new MultipleLanguage();
		myObj.java();
		myObj.selenium();
		myObj.ruby();
		myObj.python();
	}

}
