import java.sql.*;
import java.util.Scanner;

public class Query2 {


    // Salary si 2000 3000 in altinda olan iscileri yazdirin
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1) Driver olusturma (Database i tanitma,,,, PG Admin. mysql,oracle....)


        // 2) Connection kurma

        // 3) Statement (veri gonderme)

        // 4) verileri geri cekme (Resultset)

        // 5) Verileri okuma

        // 6) Baglantiyi sonlandirma

  



        // 1) Driver tanimla
        Class.forName("org.postgresql.Driver");
        //2) Database'e baglan
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "ab154423@");


        //3) Statement
        Statement st = con.createStatement();




        String sorgu ="Select * from workers where worker_salary<3000";






        //4)ResultSet
        ResultSet veri = st.executeQuery(sorgu);
        System.out.println(veri);


        //5) Datalari Al
        while (veri.next()) {
            System.out.println(
                    veri.getInt(1) +
                            veri.getString(2) +
                            veri.getInt(3));

        }

        //6) Baglantilari kapatma
        con.close();
        st.close();
        veri.close();







    }
}
