package com.haritha.practice.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		Example example = new Example();

		List<String> mainList = example.createList();
		Example.printList(mainList);

	}

	/**
	 * Example 1: create a list
	 * This method returns a new list created with some default values
	 * @return
	 */
	public List<String> createList() {
		List<String> colors = new ArrayList<>();
		colors.add("Green");
		colors.add("Blue");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Indigo");
		colors.add("Violet");
		colors.add("Pink");
		colors.add("Orange");
		colors.add("Black");
		colors.add("Brown");

		return colors;
	}

	/**
	 * Example 2: Print a list
	 * This method prints a list
	 * @param myList
	 */
	public static void printList(List<String> myList) {

		System.out.println("This is the printing list as it is");
		System.out.println(myList);
		
		System.out.println("This is printing the list using for loop ");
		for (String j : myList) {
			System.out.println(j);
		}

	}

}
