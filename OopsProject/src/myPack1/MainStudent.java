package myPack1;

public class MainStudent {

	public static void main(String[] args) {
        //create 1st object of student

		Student s1=new Student();
		//set the value of student 1
		s1.setInstute_name("anudeep");
		s1.setRoll_Number(01);
		s1.setName("niharika");
		s1.setAge(20);
		System.out.println("Information of first student");
        System.out.println("Institue name="+s1.getInstute_name());

        System.out.println("Roll number of student="+s1.getRoll_Number());
        System.out.println("name of student="+s1.getName());
        System.out.println("age of student="+s1.getAge());
		
        //create 2nd object of student
		Student s2=new Student();
		//set the value of student 2
		s2.setInstute_name("anudeep");
        s2.setRoll_Number(02);
		s2.setName("komal");
		s2.setAge(21);
		System.out.println("Information of second student");
        System.out.println("Institue name="+s1.getInstute_name());

		System.out.println("Roll number of student="+s2.getRoll_Number());
	    System.out.println("name of student="+s2.getName());
	    System.out.println("age of student="+s2.getAge());

		//create 3rd object
	    Student s3=new Student();
	    //set the value of student 3
	    s3.setInstute_name("anudeep");
        s3.setRoll_Number(03);
		s3.setName("diksha");
		s3.setAge(22);
		System.out.println("Information of third student");
        System.out.println("Institue name="+s1.getInstute_name());

        System.out.println("Roll number of student="+s3.getRoll_Number());
	    System.out.println("name of student="+s3.getName());
	    System.out.println("age of student="+s3.getAge());
	    
	}

}
