package com.Magento;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Magento.TTd.DataFeatch;

public class Testclasess extends Baseclass {
	public static SearchPage search;
@Test(priority = 1)
public void Enterdata_inText_box() throws IOException {
	 search=new SearchPage(driver);
	search.getSearchtextbox(DataFeatch.data("data1"));
}
@Test(priority = 2)
public void SearchSymbal_Without_Data() throws IOException, InterruptedException {
	search.getSearchtextbox(DataFeatch.data("data1")).clear();
	Thread.sleep(3000);
	System.out.println(search.getSearch_symbol());
}
@Test(priority = 3)
public void SearchSymbol_With_Data() throws IOException, InterruptedException {
	Thread.sleep(3000);
	search.getSearchtextbox(DataFeatch.data("data1"));
	System.out.println(search.getSearch_symbol());
	//search.getSearchtextbox(DataFeatch.data("data1"));
}
@Test(priority = 4)
public void copey_And_Pase() throws InterruptedException {
	Thread.sleep(3000);
	search.copeytext();
}
@Test(priority = 5)
public void Min_data_inSearchBox() throws IOException {
	search.cleartextinTextbox();
	search.getSearchtextbox(DataFeatch.data("data2"));
	search.Click_on_Searchsymbol();
}

}
