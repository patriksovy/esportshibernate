package sk.kasv.kincel;

import org.apache.ibatis.jdbc.ScriptRunner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RunScript {
    public static void runSqlScripts() throws SQLException, FileNotFoundException {

        //Getting the connection
        String mysqlUrl = "jdbc:mysql://localhost:3306/esportshibernate?useSSL=false&serverTimezone=UTC";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "");
        System.out.println("Connection established......");

        //Initialize the script runner
        ScriptRunner sr = new ScriptRunner(con);

        //Creating a reader objects
        Reader r1 = new BufferedReader(new FileReader("src/main/java/sk/kasv/kincel/script/script1.sql"));
        Reader r2 = new BufferedReader(new FileReader("src/main/java/sk/kasv/kincel/script/script2.sql"));
        Reader r3 = new BufferedReader(new FileReader("src/main/java/sk/kasv/kincel/script/script3.sql"));
        Reader r4 = new BufferedReader(new FileReader("src/main/java/sk/kasv/kincel/script/script4.sql"));
        Reader r5 = new BufferedReader(new FileReader("src/main/java/sk/kasv/kincel/script/script5.sql"));

        //Running the scripts
        sr.runScript(r1);
        sr.runScript(r2);
        sr.runScript(r3);
        sr.runScript(r4);
        sr.runScript(r5);




        System.out.println("Scripts Executed......");
    }

}
