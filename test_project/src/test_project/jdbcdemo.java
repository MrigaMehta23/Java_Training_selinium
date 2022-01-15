package test_project;
import java.sql.*;
class jdbcdemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		


		
				String value="Select * from Persons";
				try {
					Class.forName("com.mysql.jdbc.Driver");   //loading driver
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","root");
					Statement State = (Statement) con.createStatement();
					ResultSet Rs =  ((java.sql.Statement) State).executeQuery(value);
					while(Rs.next())
						System.out.println(Rs.getInt(1) + " " + Rs.getString(2) + " " + Rs.getString(3));
				}
				catch (Exception e){
					System.out.println(e);
				}
			}

		

	

}
