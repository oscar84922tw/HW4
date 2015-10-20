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
			if (k.count >= keyword.count) {
				lst.add(i, keyword);
				System.out.println("Done");
				return;
			}
		}
		lst.add(keyword);
		System.out.println("Done");
	}

	public void outputIndex(int c) {
		if (c < lst.size()) {
			Keyword k = lst.get(c);
			System.out.println(k);
		} else {
			System.out.println("Invalid Operation");
		}

	}

	public void outputCount(int c) {
		int tmp = 0;
		for (int i = 0; i < lst.size(); i++) {
			Keyword k = lst.get(i);
			if (k.count == c) {
				System.out.println(k);
				tmp++;
			}
			if (tmp == 0) {
				System.out.println("NotFount");
			}
		}
	}

	public void outputHas(String str) {
		int tmp = 0;
		int fromIdx = 0;
		for (int i = 0; i < lst.size(); i++) {
			Keyword k = lst.get(i);
			while ((k.name.indexOf(str, fromIdx)) != -1) {
				System.out.println(k.name);
				tmp++;
				break;
			}

		}
		if (tmp == 0) {
			System.out.println("NotFount");
		}
	}

	public void outputName(String name) {
		int tmp = 0;
		for (int i = 0; i < lst.size(); i++) {
			Keyword k = lst.get(i);
			if (k.name.equals(name)) {
				System.out.println(k);
				tmp++;
			}
		}
		if (tmp == 0) {
			System.out.println("Not Found");
		}

	}

	public void outputFirstN(int n) {
		int tmp = 0;
		for (int i = 0; i < lst.size(); i++) {
			Keyword k = lst.get(i);
			if (i < n) {
				System.out.println(k);
				tmp++;
			}
		}
		if (tmp == 0) {
			System.out.println("Invalid Operation");
		}
	}

	public void outputScore() {
		double sum = 0;
		for (int i = 0; i < lst.size(); i++) {
			Keyword k = lst.get(i);
			sum += (k.count) * (k.weight);
		}
		System.out.println(sum);
	}

	public void deleteIndex(int c) {
		if (c < lst.size()) {
			lst.remove(c);
			System.out.println("Done");
		} else {
			System.out.println("Invalid Operation");
		}
	}

	public void deleteCount(int c) {
		int tmp = 0;
		for (int i = 0; i < lst.size(); i++) {
			Keyword k = lst.get(i);
			if (k.count == c) {
				lst.remove(i);
				tmp++;
			}
		}
		if (tmp == 0) {
			System.out.println("Not Found");
		} else {
			System.out.println("Done");
		}
	}

	public void deleteHas(String str) {
		int tmp = 0;
		int fromIdx = 0;
		for (int i = 0; i < lst.size(); i++) {
			Keyword k = lst.get(i);
			while ((k.name.indexOf(str, fromIdx)) != -1) {
				lst.remove(i);
				tmp++;
				break;
			}
		}
		if (tmp == 0) {
			System.out.println("Not Found");
		} else {
			System.out.println("Done");
		}
	}

	public void deleteName(String name) {
		int tmp = 0;
		for (int i = 0; i < lst.size(); i++) {
			Keyword k = lst.get(i);
			if (k.name.equals(name)) {
				lst.remove(i);
				tmp++;
			}
		}
		if (tmp == 0) {
			System.out.println("Not Found");
		} else {
			System.out.println("Done");
		}
	}

	public void deleteFirstN(int n) {
		// int tmp = 0;

		if (n > lst.size()) {
			System.out.println("Invalid Operation");

			// tmp++;

		} else {
			for (int i = 0; i < lst.size(); i++) {
				// Keyword k = lst.get(i);
				if (i < n) {
					// System.out.println(k);
					lst.remove(i);

					// }
				}
				System.out.println("Done");
			}
		}
	}

	public void deleteAll() {
		lst.removeAll(lst);
	}

	public void printAll() {
		for (int i = 0; i < lst.size(); i++) {
			Keyword k = lst.get(i);
			System.out.println(k);
		}
	}

}