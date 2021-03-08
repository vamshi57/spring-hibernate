package com.vamshi.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class CustomBookWriter implements ItemWriter<List<String>> {

	public void write(List<? extends List<String>> items) throws Exception {
		System.out.println("CustomBookWriter.write()");
		System.out.println(items);

	}

}
