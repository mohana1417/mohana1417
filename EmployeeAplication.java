package Employe;

public class EmployeeApplication {

private static int empNo[] = { 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
private static String empName[] = { "Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Teja" };
private static String joiningDate[] = { "01/04/2009", "23/08/2012", "12/11/2008", "29/01/2003", "16/07/2005",
                                 "1/1/2000", "12/06/2006" };

private static char designationCode[] = {'e','c','k','r','m','e','c'};
private static String department[] = {"R & D","PM","ACC","Front Desk","Engg","Manufacturing","PM"};
private static int basic[] = {20000,30000,10000,50000,40000,12000,60000};
private static int HRA[] = {6000,8000,12000,9000,10000,12000,16000};
private static int IT[] = {2000,4000,6000,3500,5000,6000,8000};

public static void main(String args[]) {
int employeeId = Integer.parseInt(args[0]);

String empDepartment="";
boolean flag=false;

int da=0;
int salary=0;
int index = 0;

for (int i = 0; i < empNo.length; i++) {
if (employeeId == empNo[i]) {
index = i;
flag = true;
break;
}

}

      switch(designationCode[index])
      {
      case 'e':
      empDepartment = "Engineer";
      da=20000;
      break;
      case 'c':
      empDepartment = "Consultant";
      da=32000;
      break;
      case 'k':
      empDepartment = "Clerk";
      da=12000;
      break;
      case 'r':
      empDepartment = "Receptionist";
      da=15000;
      break;
      case 'm':
      empDepartment = "Manager";
      da=40000;
      break;
         
     
      }
     
      if(flag)
      {
      salary = basic[index] + HRA[index] + da - IT[index];
     
      System.out.println("Employee No: " + empNo[index] +
     "Employee Name : " + empName[index] + "Department: " +  department[index] +
     "Designation : " + empDepartment + "Salary: " + salary );
      }
      else
      {
    System.out.println("There is no employee with empid: " + args[0]);
      }

}
}