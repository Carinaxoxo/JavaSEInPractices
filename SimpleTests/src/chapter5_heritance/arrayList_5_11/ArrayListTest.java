package chapter5_heritance.arrayList_5_11;

import java.util.*;

import chapter5_heritance.abstractClasses_5_4.Employee;

// this program demonstrates the ArrayList class

public class ArrayListTest{
	public static void main(String[] args) {
		// fill the staff array list with three Employee objects
		ArrayList<Employee> staff = new ArrayList<>();
		
		staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
		staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
		staff.add(new Employee("Tony Testser", 40000, 1990, 3, 15));
		
		// raise everyone's salary by 5%
		for (Employee e : staff)
			e.raiseSalary(5);
		
		// print out info about all Employee objects
		for (Employee e : staff)
			System.out.println("name = " + e.getName() + ", salary = " + e.getSalary()
			+ ", hireDay = " + e.getHireDay());
	}
}