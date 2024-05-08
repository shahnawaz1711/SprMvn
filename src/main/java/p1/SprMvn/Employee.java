package p1.SprMvn;

public class Employee {

	int eid;
	String eName;
	int sal;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public Employee(int eid, String eName, int sal) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.sal = sal;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", sal=" + sal + "]";
	}
}
