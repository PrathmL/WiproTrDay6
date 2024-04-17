package com.wipro.Day6.listTask1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LiTask1 {
	    static public void removesecondelement(List<Integer> l1) {
	        List<Integer> res = new ArrayList<>();
	        for (int i = 0; i < l1.size(); i++) {
	            if (i % 2 == 0) {
	                res.add(l1.get(i));
	            }
	        }
	        System.out.println("Result of l1 "+"is: "+res);
	    }
	    static public void main(String... pra) {
	        Scanner tin=new Scanner(System.in);
	    	List<Integer> myList = new ArrayList<>();
	       /* myList.add(15);
	        myList.add(29);
	        myList.add(35);
	        myList.add(43);
	        myList.add(59);
	        myList.add(64);
	        myList.add(71);
	        myList.add(80);
	        myList.add(99);*/
	        System.out.println("Enter numbers and to stop entering number type p:");
	        while (tin.hasNext()) {
	            if (tin.hasNextInt()) {
	                myList.add(tin.nextInt());
	            } else if (tin.next().equalsIgnoreCase("p")) {
	                break;
	            }
	        }
	        System.out.println("The numbers u had entered are:"+myList);
	        tin.close();
	        removesecondelement(myList);
	    }
}
	


