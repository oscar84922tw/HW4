package edu.nccu.misds.stu103306037.hw4;

import java.util.ArrayList;

public class KeywordList {
	private ArrayList<Keyword> lst;

	public KeywordList() {
		this.lst = new ArrayList<Keyword>();

	}

	public void add(Keyword keyword) {
		for (int i = 0; i < lst.size(); i++) {
			Keyword k = lst.get(i);
			if(k.count>=keyword.count){
				lst.add(i, keyword);
				System.out.println("Done");
				return;
			}
		}
		lst.add(keyword);
		System.out.println("Done");
	}
}
