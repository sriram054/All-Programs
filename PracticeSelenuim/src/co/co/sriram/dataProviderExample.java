package co.co.sriram;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderExample {
  @Test(dataProvider="getData")
  public void setData(String username,String password) {
	  System.out.println("Your Username is "+username);
	  System.out.println("Your Password is "+password);
  }
  @DataProvider
  public Object[][] getData()
  {
	  Object [][] data=new Object[3][2];
	  //1st row 
	  data[0][0]="sriram";
	  data[0][1]="123456";
	  //2ndd row 
	  data[1][0]="murthy";
	  data[1][1]="234567";
	  //3rd row
	  data[2][0]="ithineni";
	  data[2][1]="345678";
	  return data;
  }
}
