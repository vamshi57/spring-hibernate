package com.vamshi.external;

import org.springframework.stereotype.Component;

@Component("external")
public class ExternalImpl  implements External{
	 @Override
	public String getCode(String s){
		
		if(s.equalsIgnoreCase("india"))
		{
			return "india: 352/2 pak: 300/10";
		}
		else {
			 throw new IllegalArgumentException("invalid match");
		}
		
	}

}
