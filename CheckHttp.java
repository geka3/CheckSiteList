package net.ukr.geka3;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class CheckHttp {
	
	
	public static boolean checkHttp(String http){
		try {
			URL url = new URL(http);
			URLConnection urlCon = url.openConnection();
			if(urlCon.getDate() > 0){
				return true;
			}else{
				return false;
			}
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return false;
		}
		
		
	}
}
