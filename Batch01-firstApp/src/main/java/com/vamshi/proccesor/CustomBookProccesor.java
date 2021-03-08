package com.vamshi.proccesor;

import org.springframework.batch.item.ItemProcessor;

public class CustomBookProccesor implements ItemProcessor<String, String> {

	public String process(String item) throws Exception {
		System.out.println("CustomBookProccesor.process()");
	  if(item.equalsIgnoreCase("crj"))
		  return item+"--by HS ";
	  else if(item.equalsIgnoreCase("hfj"))
		  return item+"--by gjd ";
	  else if(item.equalsIgnoreCase("tij"))
		return item+" --by hdn";
	  else if(item.equalsIgnoreCase("bbj"))
		  return item+" --by hsjbc";
	  else if(item.equalsIgnoreCase("Ej")) 
		  return item+" --by be";
	  
		return null;
	}

}
