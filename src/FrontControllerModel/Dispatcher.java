package FrontControllerModel;

public class Dispatcher {
	private ShowHomePage homePage;
	private FirstPage firstPage;
	private LastPage lastPage;
	/**
	 * 
	 */
	public Dispatcher() {
		homePage = new ShowHomePage();
		firstPage = new FirstPage();
		lastPage = new LastPage();
	}
	
	public void deal(String requestType) {
		if (requestType.equalsIgnoreCase("FirstPage")) {//忽略大小写的比较
			firstPage.show(); 
		}else if (requestType.equalsIgnoreCase("lastpage")) {
			lastPage.show();
		}else {
			homePage.show();
		}
	}
}
