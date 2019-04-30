package day27_Arrays05;

import java.util.*;

public class Tools {
	public static void main(String[] args) {
		// Java --> programming language
		// Selenium --> Test Automation
		// TestNG --> Unit Tests
		// JUnit --> Unit Tests
		// Cucumber --> BDD Style testing
		// Git --> Version control
		// Maven --> Building and execution for project
		Scanner scan = new Scanner(System.in);
		String[] tools = { "Java", "Selenium", "TestNG", "JUnit", "Cucumber", "Git", "Maven" };
		String[] exp = { "programming language", "Unit Tests", "Unit Tests", "BDD Style testing", "Version control",
				"Building and execution for project" };
		String tool = scan.next();
		for (int i = 0; i < exp.length; i++) {
			if (tools[i].equalsIgnoreCase(tool)) {
				System.out.println(tools[i] + " - " + exp[i]);
			}
		}
	}
}
