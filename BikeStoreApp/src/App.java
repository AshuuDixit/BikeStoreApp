import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bike.manage.User;
import com.bike.manage.UserDao;

public class App {

	public static void main(String[] args) throws IOException
	{
	System.out.println("Welcome to Bike Store");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 while(true)
	 {
		 System.out.println("Press 1 to Add User");
		 System.out.println("Press 2 to Delete User");
		 System.out.println("Press 3 to Display User");
		 System.out.println("Press 4 to Exit App");
		 int c=Integer.parseInt(br.readLine());
		 
		 if(c==1)
		 {
			 //add user
			
			
			 System.out.println("Enter User Name :");
			 String name=br.readLine();
			 
			 System.out.println("Enter User mobile :");
			 String mobile=br.readLine();
			 
			 System.out.println("Enter User Email :");
			 String email=br.readLine();
			 
			 System.out.println("Enter User Address");
			 String address=br.readLine();
			 
			 // creating user object to store user
			 User st=new User(name,mobile,email,address);
			boolean answer= UserDao.insertUserToDB(st);
			if(answer)
			{
				System.out.println("User added successfully....");
			}
			else
				{
				System.out.println("Something went wrong ....Try Again");
			}
			 
			 System.out.println(st);
		 }
		 else if(c==2)
		 {
			 //delete user
			 
			 System.out.println("Enter User Id to delete :");
			 int userId=Integer.parseInt(br.readLine());
			boolean f= UserDao.deleteStudent(userId);
			if(f)
			{
				System.out.println("User is deleted Successfully...");
			}
			else {
				System.out.println("Something went wrong....Try Again");
			}
		 }
			 
		 
		 else if(c==3)
		 {
			 //display user
			 UserDao.showAllUser();
		 }
		 else if(c==4)
		 {
			 //exit from app
			 break;
		 }
		 else
		 {
	 }

	}
	 System.out.println("Thankyou for using my App");
	}

}
