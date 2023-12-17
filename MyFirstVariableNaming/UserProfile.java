package MyFirstVariableNaming;
import java.util.Scanner;

public class UserProfile {
	String name;
	String gender;
	String jobpreference;
	String nationality;
	String bloodtype;
	static int age;
	public UserProfile(String name, String gender, String jobpreference, String nationality, String bloodtype,
			int age) {
		this.name = name;
		this.gender = gender;
		this.jobpreference = jobpreference;
		this.nationality = nationality;
		this.bloodtype = bloodtype;
		this.age = age;
	}
	public  static int birthyear() {
		return  java.time.Year.now().getValue() - age;
		}

	public void userinformation() {
		System.out.println("Name:"+ name);
		System.out.println("Gender:"+ gender);
		System.out.println("Job Preference:"+ jobpreference);
		System.out.println("Nationality:"+nationality);
		System.out.println("Bloodtype:"+bloodtype);
		System.out.println("Age:"+age);
		System.out.println("Birth Year: "+birthyear());
	}
		

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	String name;
	System.out.println("Enter your Name:");
	name =sc.nextLine();
	String gender;
	System.out.println("Enter your Gender: ");
	gender =sc.nextLine();
	String jobpreference;
	System.out.println("Enter your pefered job:");
	jobpreference = sc.nextLine();
	String nationality;
	System.out.println("Enter your Nationality:");
	nationality = sc.nextLine();
	String bloodtype;
	System.out.println("Enter your Bloodgroup:");
	bloodtype = sc.nextLine();
	int age;
	System.out.println("Enter your age");
	age= sc.nextInt();
	UserProfile Userinfo = new UserProfile(name,gender,jobpreference,nationality,bloodtype,age);
	Userinfo.userinformation();
	}
	
	
	
	}

		
