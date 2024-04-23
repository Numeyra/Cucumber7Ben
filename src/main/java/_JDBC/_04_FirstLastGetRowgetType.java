package _JDBC;




import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_FirstLastGetRowgetType extends JDBCParent {


    @Test
    public void Test1() throws SQLException {
        DBConnectionOpen();

        ResultSet rs = sorguEkrani.executeQuery("select city from city"); // mysql e gidip yapistir,calistir,bak sonuca !!

        rs.last();// son satira gider
        System.out.println("Son satir:"+rs.getString(1));

        rs.first();//ilk  satira gider
        System.out.println("Ilk satir:"+rs.getString(1));

        rs.last(); //son satira gittim
        int kacinciSatirdayim=rs.getRow(); // su anda kacinci satirda oldugnun bilgisini veri

        System.out.println("kacinciSatirdayim="+kacinciSatirdayim);




        DBConnectionClose();

    }
}