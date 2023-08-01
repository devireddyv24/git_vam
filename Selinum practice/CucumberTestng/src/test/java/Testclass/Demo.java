package Testclass;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Screenshot.Screen.class)
public class Demo {
@Test
public void test() {
	System.out.println("vamshi");
}

}
