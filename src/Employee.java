import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Employee {

	private int empNo;
	private String eName;
	private int salary;
	private String designation;
	private String dept;

	static Scanner sc = new Scanner(System.in);
	HashMap<Integer, ArrayList> map = new HashMap<>();

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
		System.out.println("press 8 to exit");

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
				break;
			default:
				System.out.println("Please Choose correct Option");
				break;
			}
		}

	}

	public void addEmp() {

		ArrayList<Object> emp = new ArrayList<>();
		empNo++;
		System.out.println("Name :");
		eName = sc.next();
		System.out.println("Salary :");
		salary = sc.nextInt();
		System.out.println("Designation :");
		designation = sc.next();
		System.out.println("Department :");
		dept = sc.next();
		emp.add(empNo);
		emp.add(eName);
		emp.add(salary);
		emp.add(designation);
		emp.add(dept);
		System.out.println("New Employee added Scucessfully!");
		map.put(empNo, emp);

	}

	public void viewAllEmp() {
		for (Entry<Integer, ArrayList> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

	public void removeEmp() {
		System.out.println("Enter Employee's Number to remove from Data");
		int no = sc.nextInt();
		map.remove(no);
		System.out.println("Employee number "+(no)+" deleted sucessfully!");
		
	}

	public void clearData() {
		for(int i: map.keySet()){
			map.remove(i);
		}

	}

	public void updateSalary() {
		System.out.println("Enter Employee's Number ");
		int no = sc.nextInt();
		ArrayList list=map.get(no);
		System.out.println("enter new salary ");
		int newSal=sc.nextInt();
		list.set(salary, newSal);
	
	}

	public void searchEmployee() {
		System.out.println("Enter Employee's Number to search from Data");
		int no = sc.nextInt();
		System.out.println(map.get(no));
	}

	public void deptWiseList() {
		System.out.println("enter department name");
		String dName=sc.next();
		for(int i: map.keySet())
		{
			ArrayList list=map.get(i);
			System.out.println(list);
				
		}
	}

}
