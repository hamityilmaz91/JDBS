import java.sql.*;

public class Query04 {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {



        // 1) Driver tanimla
        Class.forName("org.postgresql.Driver");


        //2) Database'e baglan
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "ab154423@");


        //3) Statement
        Statement st = con.createStatement();// sql sorgumuzu yapmak icin VE ( data gondermek te oluyor bu )
        // YANI STATEMENT  CLASI HEM VERI GONDERMEK HEM VERI N CAGIRMAK ICIN KULLANIYOR


        ResultSet rs =st.executeQuery("select * from workers ");
        ResultSetMetaData rsmd = rs.getMetaData();
        System.out.println(rsmd.getColumnName(1));


    }






}
