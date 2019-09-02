import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Employee {

	static Scanner sc = new Scanner(System.in);
	HashMap<Integer, Emp> map = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();

		System.out.println("press 1 to add new Employee");
		System.out.println("press 2 view all Employee");
		System.out.println("press 3 to remove an Employee");
		System.out.println("press 4 to clear Date of all Employes");
		System.out.println("press 5 to change salary Employee");
		System.out.println("press 6 to search for an  Employee");
		System.out.println("press 7 to view Department wise List");
		System.out.println("press 8 to Sort");
		System.out.println("press 9 to Exit");

		while (true) {
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				e.addEmp();
				break;
			case 2:
				e.viewAllEmp();
				break;
			case 3:
				e.removeEmp();
				break;
			case 4:
				e.clearData();
				break;
			case 5:
				e.updateSalary();
				break;
			case 6:
				e.searchEmployee();
				break;
			case 7:
				e.deptWiseList();
				break;
			case 8:
				e.sort();
				break;
			default:
				System.out.println("Please Choose correct Option");
				break;
			}
		}

	}

	public void addEmp() {
		System.out.println("Employee number :");
		int empNo = sc.nextInt();
		System.out.println("Name :");
		String eName = sc.next();
		System.out.println("Salary :");
		int salary = sc.nextInt();
		System.out.println("Designation :");
		String designation = sc.next();
		System.out.println("Department :");
		String dept = sc.next();
		Emp emp = new Emp(empNo, eName, salary, designation, dept);

		System.out.println("New Employee added Scucessfully!");
		map.put(empNo, emp);

	}

	public void viewAllEmp() {
		System.out.println(map.entrySet());
	}

	public void removeEmp() {
		System.out.println("Enter Employee's Number to remove from Data");
		int no = sc.nextInt();
		map.remove(no);
		System.out.println("Employee number " + (no) + " deleted sucessfully!");

	}

	public void clearData() {
		for (int i : map.keySet()) {
			map.remove(i);
		}

	}

	public void updateSalary() {
		System.out.println("Enter Employee's Number ");
		int no = sc.nextInt();
		Emp e = map.get(no);
		System.out.println("enter new salary ");
		int newSal = sc.nextInt();
		e.setSalary(newSal);

	}

	public void searchEmployee() {
		System.out.println("Enter Employee's Number to search from Data");
		int no = sc.nextInt();
		System.out.println(map.get(no));
	}

	public void deptWiseList() {
		/*
		 * System.out.println("enter department name"); String dName=sc.next();
		 */
	}

	public void sort() {
		Emp e1 = new Emp(5001, "john", 50000, "haha", "hr");
		Emp e2 = new Emp(1011, "qwer", 30000, "lol", "mkt");
		Emp e3 = new Emp(5010, "jaszd", 35000, "rofl", "it");
		Emp e4 = new Emp(1501, "ochn", 55000, "lmao", "it");
		Emp e5 = new Emp(2001, "sasdhn", 40000, "lol", "mkt");

		Emp eAr[] = { e1, e2, e3, e4, e5 };
		for (Emp ee : eAr) {
			System.out.println(ee);
		}
		System.out
				.println("enter field name on basis of which sorting is to be performed");
		String field = sc.next();

		Arrays.sort(eAr, new Comparator<Emp>() {

			@Override
			public int compare(Emp e1, Emp e2) {
				if (field.equals("empNo")) 
					return e1.getEmpNo() - e2.getEmpNo();
				else if (field.equals("eName")){
					int  i= e1.geteName().compareTo(e2.geteName());
					return i;
				}	
				else if (field.equals("salary"))
					{return e1.getSalary()-e2.getSalary();}
				return 0;
			}
		});
		for (Emp ee : eAr) {
			System.out.println(ee);
		}
	}

}
