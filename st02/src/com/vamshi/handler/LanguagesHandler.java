package com.vamshi.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LanguagesHandler implements Handler {

	@Override
	public String handle(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Locale[] locales=null;
		List<String> langList=null;
		//write b.logic to get all languages
		locales=Locale.getAvailableLocales();
		langList=new ArrayList<String>();
		for(Locale l:locales) {
			langList.add(l.getDisplayLanguage());
		}
		//keep the result in request scope
		req.setAttribute("rs", langList);
		req.setAttribute("local", locales);
		req.setAttribute("list", langList);
		
		//return lvn
		return "disp_lang";
		
	}

}
