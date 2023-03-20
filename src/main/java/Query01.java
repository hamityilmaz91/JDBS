import org.postgresql.Driver;

import java.sql.*;

public class Query01 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        // 1) Driver tanimla
        Class.forName("org.postgresql.Driver");
        //2) Database'e baglan
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "ab154423@");


        //3) Statement
        Statement st = con.createStatement();


        //4)ResultSet
        ResultSet veri = st.executeQuery("select * from companies");
        System.out.println(veri);


        //5) Datalari Al
        while (veri.next()) {
            System.out.println(
                    veri.getString(1) +
                            veri.getString(2) +
                            veri.getInt(3));

        }

        //6) Baglantilari kapatma
        con.close();
        st.close();
        veri.close();


    }


}
