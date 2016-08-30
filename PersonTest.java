import java.util.*;
class person
{
private String name;
private String address;
public person(String name,String address)
{
this.name=name;
this.address=address;
}
	public String getName()
	{
        return name;
	}
	public String getAddress()
	{
	return address;
	}
	public void setAddress(String address)
	{
	this.address=address;
	}
	public String toString()
	{
	return "person [name ="+ name+"  " + "address ="+ address + "]";
	}
	
}
class student extends person
{
private String program;
private int year;
private double fee;
public student(String name,String address,String program,int year,double fee)
{
super(name,address);
this.program=program;
this.year=year;
this.fee=fee;
}
public String getProgram()
{
return program;
}
public void setProgram(String program)
{
this.program=program;
}
public int getYear()
{	
return year;
}
public void setYear(int year)
{
this.year=year;
}
public double getFee()
{
return fee;
}
public void setFee(double fee)
{
this.fee=fee;
}
public String toString()
{
return "Student[Person[name="+getName()+",address="+getAddress()+"],program="+program+",year="+year+",fee="+fee+"]";
}	
}
class staff extends person
{
private String school;
private double pay;
public staff(String name,String address,String school,double pay)
{
super(name,address);
this.school=school;
this.pay=pay;
}
public String getSchool()
{
return school;
}
	public void setSchool(String school)
	{
	this.school=school;
	}

public double getPay()
{
return pay;
}
	public void setPay(double pay)
	{
	this.pay=pay;
	}
public String toString()
{
return "Staff[Person[name="+getName()+",address="+getAddress()+"],school="+school+",pay="+pay+"]";	
}

}

class PersonTest
{
public static void main(String args[])
{
student std=new student("praveen","Guntur","MTECH",2012,122342);
std.setAddress("Guntur");
System.out.println("The person details are");
System.out.println(std.getName());
System.out.println(std.getAddress());
Scanner sin=new Scanner(System.in);
System.out.println("The Student details are");
System.out.println(std.getName());
System.out.println("Enter Address:");
String address=sin.nextLine();
std.setAddress(address);
System.out.println(std.getAddress());
System.out.println("Enter Program:");
String program=sin.nextLine();
std.setProgram(program);
System.out.println(std.getProgram());
System.out.println("Enter Year:");
int year=sin.nextInt();
std.setYear(year);
System.out.println(std.getYear());
System.out.println("Enter Fee:");
double fee=sin.nextDouble();
std.setFee(fee);
System.out.println(std.getFee());
System.out.println(std.toString());;

staff stf=new staff("Praveen","Guntur","RVRJCCE",32000);

System.out.println("The Staff details are");
System.out.println(stf.getName());
System.out.println(stf.getAddress());
System.out.println(stf.getSchool());
System.out.println(stf.getPay());
System.out.println(stf.toString());;

}
}
/* output
E:\androidpre>javac PersnTest.java

E:\androidpre>java PersonTest
The person details are
Praveen
Guntur
The Student details are
Praveen
Enter Address:
Guntur
Guntur
Enter Program:
Mtech
Mtech
Enter Year:
2012
2012
Enter Fee:
150000
150000.0
Student[Person[name=praveen,address=guntur],program=mtech,year=2012,fee=150000.0]
The Staff details are
Praveen
Guntur
RVRJCCE
32000.0
Staff[Person[name=praveen,address=guntur],school=rvrjcce,pay=32000.0]*/