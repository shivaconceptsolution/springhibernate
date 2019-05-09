package jdbc;

public class Student {
private int rno;
private String sname;
private String branch;
private int fees;
public Student()
{
	
}
public Student(int rno,String sname,String branch,int fees)
{
	this.rno=rno;
	this.sname=sname;
	this.branch=branch;
	this.fees=fees;
}

public int getRno() {
	return rno;
}
public void setRno(int rno) {
	this.rno = rno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public int getFees() {
	return fees;
}
public void setFees(int fees) {
	this.fees = fees;
}

}
