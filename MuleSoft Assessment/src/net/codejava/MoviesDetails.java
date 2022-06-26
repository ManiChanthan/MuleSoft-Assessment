package net.codejava;

import java.sql.*;
import java.sql.Connection;
import java.util.*;
import java.sql.Statement;

public class MoviesDetails {

	public static void main(String[] args) {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con=DriverManager.getConnection("jdbc:sqlite:mulesoftAsst.db");
			System.out.println("Database Connection opened.");
			Statement st=con.createStatement();
			st.executeUpdate("create table movieDetails(movieName varchar(20),actor varchar(20),actress varchar(20),relesae varchar(10),director varchar(20))");
			System.out.println("Table Created");
			
			st.executeUpdate("INSERT INTO movieDetails (movieName,actor,actress,relesae,director) VALUES ('premam','nivin pauly','sai pallavi','2015','Alphonse Puthren')");
			st.executeUpdate("INSERT INTO movieDetails (movieName,actor,actress,relesae,director) VALUES ('Aayirathil Oruvan','Karthi','Andrea','2010','Selvaraghavan')");
			st.executeUpdate("INSERT INTO movieDetails (movieName,actor,actress,relesae,director) VALUES ('KGF','yash','srinidhi','2018','prashanth')");
			st.executeUpdate("INSERT INTO movieDetails (movieName,actor,actress,relesae,director) VALUES ('Jersey','nani','shraddha','2019','gowtam')");
			st.executeUpdate("INSERT INTO movieDetails (movieName,actor,actress,relesae,director) VALUES ('Bajrangi Bhaijaan','salman khan','kareena kapoor','2015','kabir khan')");
			st.executeUpdate("INSERT INTO movieDetails (movieName,actor,actress,relesae,director) VALUES ('Avengers Endgame','Robert','scarlett','2019','Joe')");
			st.executeUpdate("INSERT INTO movieDetails (movieName,actor,actress,relesae,director) VALUES ('RRR','ram charan','alia bhatt','2022','rajamouli')");
			st.executeUpdate("INSERT INTO movieDetails (movieName,actor,actress,relesae,director) VALUES ('Bangalore days','salman','nazriya','2014','anjali menon')");
			st.executeUpdate("INSERT INTO movieDetails (movieName,actor,actress,relesae,director) VALUES ('Vikram','kamal hasasan','swathishta','2022','Lokesh')");
			
			ResultSet rs = st.executeQuery("select * from movieDetails");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" : " +(rs.getString(2)+" : "+rs.getString(3)+" : "+ rs.getString(4)+" : "+rs.getString(5)));
			}
			
			con.close();
			System.out.println("Connection closed.");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}


