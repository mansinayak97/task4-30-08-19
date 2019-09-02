
public class Emp  {
	private int empNo;
	private String eName;
	private int salary;
	private String designation;
	private String dept;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result
				+ ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		result = prime * result + empNo;
		result = prime * result + salary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		if (empNo != other.empNo)
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	
	
	
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", eName=" + eName + ", salary="
				+ salary + ", designation=" + designation + ", dept=" + dept
				+ "]";
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public Emp(int empNo, String eName, int salary, String designation,
			String dept) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.salary = salary;
		this.designation = designation;
		this.dept = dept;
	}
	
	/*@Override
	public int compareTo(Emp emp) {
		
		return 0;
	}*/
	
}
