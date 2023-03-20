import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query03 {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        // 1) Driver tanimla
        Class.forName("org.postgresql.Driver");
        //2) Database'e baglan
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "ab154423@");


        //3) Statement
        Statement st = con.createStatement();// sql sorgumuzu yapmak icin VE ( data gondermek te oluyor bu )
        // YANI STATEMENT  CLASI HEM VERI GONDERMEK HEM VERI N CAGIRMAK ICIN KULLANIYOR

        // statement olusturuyorum


        // isciler adinda bir tablo olusuturup "worker_id  ,  worker_name ,,,,worker_salary" sutunlarini ekleyin

        String sql01 = "CREATE TABLE isciler ( worker_id int, " +
                "worker_name VARCHAR(20)," +
                "worker_salary int);";
        //  st.execute(sql01);// database e veri gondermek icin execute komutunu kullanmak gerekiyor


        //////////SADECE EXECUTE VERI GONDERMEK OLUYOR
        //////// EXECUTEQUERY ISE VERI CEKMEK OLUYOR

// TABLOMUZA workers_adres sutunu ekleyelim

        String sql02 = "ALTER table isciler  add column  worker_adress varchar(50)";

        // st.execute(sql02);


// isciler tablosunu silelim
        String sql03 = "Drop table isciler";
        st.execute(sql03);

         // execute ()  >>>>>> create ,drop,alter  icin kullanilir
        // executequery() >>>>>  select islemleri icin kullanilir  BU ResultSet i zorunlu kilar

        con.close();
        st.close();




    }
}
