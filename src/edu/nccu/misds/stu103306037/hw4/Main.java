package edu.nccu.misds.stu103306037.hw4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		KeywordList kLsit = new KeywordList();
		while (sc.hasNextLine()) {
			String cmd = sc.next();
			switch (cmd) {
			case "add": {
				String name = sc.next();
				int count = sc.nextInt();
				float weight = sc.nextFloat();
				Keyword k = new Keyword(name, count, weight);
				kLsit.add(k);
			}
				break;
			case "outputIndex": {
				int x = sc.nextInt();
				kLsit.outputIndex(x);
			}
				break;
			case "outputCount": {
				int count = sc.nextInt();
				kLsit.outputCount(count);
			}
				break;
			case "outputHas":
			{
				String arg = sc.next();
				kLsit.outputHas(arg);
			}
				break;
			case "outputName":
			{
				String name = sc.next();
				kLsit.outputName(name);
			}
				break;
			case "outputFirstN":
			{
				int N = sc.nextInt();
				kLsit.outputFirstN(N);
			}
				break;
			case "outputScore":
			{
				kLsit.outputScore();
			}
				break;
			case "deleteIndex":
			{
				int x = sc.nextInt();
				kLsit.deleteIndex(x);
			}
				break;
			case "deleteCount":
			{
				int x = sc.nextInt();
				kLsit.deleteCount(x);
			}
				break;
			case "deleteHas":
			{
				String arg = sc.next();
				kLsit.deleteHas(arg);
			}
				break;
			case "deleteName":
			{
				String name = sc.next();
				kLsit.deleteName(name);
			}
				break;
			case "deleteFirstN":
			{
				int N = sc.nextInt();
				kLsit.deleteFirstN(N);
			}
				break;

//			case "deleteAll":
//			{
//				kLsit.deleteAll();
//			}
			
//			case "printAll":
//			{
//				kLsit.printAll();
//			}
			default:
				break;
			}
		}
		sc.close();
	}

}
