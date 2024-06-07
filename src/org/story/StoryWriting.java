package org.story;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StoryWriting extends StoryStorage {
	
	
	
	public static void main(String[] args) {
		
		Scanner v=new Scanner(System.in);
		
	System.out.println("enter your story title");
	
	String title=v.nextLine();
	
	System.out.println("enter your story");
		
	String story = v.nextLine();
	Map<String,String> m=new LinkedHashMap<>();
	
	
			m.put(title, story);
			
			StoreStory(m);
	v.close();
	
	}
	
	
	

}
