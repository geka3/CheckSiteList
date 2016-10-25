package net.ukr.geka3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileList {
	String filelist;
	
	
	File [] fileArray = null;
	
	public String[] getHttpList(String address){
		File file = new File(address);
		if(!file.exists()){
			System.out.println("file doesnt exist");
			return null;
		}
		if(!file.isFile()){
			System.out.println("this is not file");
			return null;
		}
		
		try(BufferedReader bf = new BufferedReader(new FileReader(file))){
			List<String>  array = new ArrayList<>(); 
			String temp;
			for(;(temp = bf.readLine()) != null;){
				if(temp != "" )
				array.add(temp);
			}
			//String [] t = null; 
			String [] result = array.toArray(new String[array.size()]);
			return result;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	} 
	
	
}


