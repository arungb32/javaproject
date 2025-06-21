package day6;

public class Student {

	 private String sname;
	 private static int id;
	 private int Register;
	 public Student() {
		id++;
		Register++;
		System.out.println("constructor called");
	 }
	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * @return the id
	 */
	public static int getId() {
		return id;
	}
	/**
	 * @return the register
	 */
	public int getRegister() {
		return Register;
	}
	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * @param id the id to set
	 */
	public static void setId(int id) {
		Student.id = id;
	}
	/**
	 * @param register the register to set
	 */
	public void setRegister(int register) {
		Register = register;
	}
	@Override
	public String toString() {
		return "Student [id="+id+",sname=" + sname + ", Register=" + Register + "]";
	}
		}
	
	
	
	 