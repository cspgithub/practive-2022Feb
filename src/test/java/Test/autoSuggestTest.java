package Test;

import org.testng.annotations.Test;

public class autoSuggestTest extends baseTest{
	
	@Test
	
	public void verifyTextEntered() {
		
		yt.enterText(prop.getProperty("text"));
	}
	

}
