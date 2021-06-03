 class Employee
 {
     private int eno;
     private String ename;
     private Float esal;
     private String eadr;

 public void setEno(int empno)
         {
            eno = empno;

        }
        public void setEname (String empname)
        {
            ename = empname;
        }

        public void setEadr (String empadr)
        {
            eadr = empadr;

        }

        public void setEsal (float empsal)
        {
            esal =empsal;

        }


        public int getEno()
        {
            return eno;
        }
        public  String getEname()
        {
            return  ename;
        }
        public  float getEsal()
        {
            return esal;
        }

     public String getEadr()
     {
         return eadr;
     }
 }

    class Student{
             String sname = "Anup";
             String sid = "S-123";
             String sadd = "Neemuch";
             String smob = "9785154711";
             String squl = "MCA";

             public void getStudentdetails()
             {
                 System.out.println("Student Details");
                 System.out.println("...............");
                 System.out.println("Student Name : " + sname);
                 System.out.println("Student Id : " + sid);
                 System.out.println("Student Address : " + sadd);
                 System.out.println("Student Mobile Number : " + smob);
                 System.out.println("Student Qualification : " + squl);

             }

    }
    class Test
    {
        public static void main(String[] args)

        {
            Student std = new Student();
            std.getStudentdetails();
            System.out.println();

            Employee emp = new Employee();
            emp.setEno(111);
            emp.setEname("Anup");
            emp.setEsal(50000.0f);
            emp.setEadr("Neemuch");

            System.out.println("Employee Details");
            System.out.println("...............");
            System.out.println("Employee Number : "+emp.getEno());
            System.out.println("Employee Name : "+emp.getEname());
            System.out.println("Employee Salary : "+emp.getEsal());
            System.out.println("Employee Address : "+emp.getEadr());




        }


    }



