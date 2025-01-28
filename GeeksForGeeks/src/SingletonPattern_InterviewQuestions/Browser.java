package SingletonPattern_InterviewQuestions;

//What is singletonPattern ?
//We are going to create the object of that class or we are going to instantiate the object only once 
//we can't create multiple object
//once the object is created ..only one copy will be shared with all the threats

public class Browser {
	
	//1. Private statice instance of the class
	
	private volatile static Browser browser;
	
	//2. Private constructor to prevent/avoid instantiation/object
	private Browser()
	{
		
	}
	//3. Public static method to provide access to the instance/object
	
	public synchronized static Browser getInstance() {
		if(browser == null) {
			synchronized (Browser.class) {
				if(browser == null) {
					browser=new Browser();
			}}
		}
		return browser;
	}
	
	//Individual method of the class
	
	public void displayMesg() {
		System.out.println("browser info");
	}

}
