package _JDBC;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_NextPrevAbsRel extends JDBCParent{

  @Test
    public void Test1() throws SQLException {
      DBConnectionOpen();

      ResultSet rs = sorguEkrani.executeQuery("select * from language"); // mysql e gidip yapistir,calistir,bak sonuca !!

      rs.next(); //bir adim ileri
      System.out.println("1. Satir=" + rs.getString(2)); //2 index degil ,sira:italian(mysql de)


      rs.next(); //bir adim geri
      System.out.println("2. Satir=" + rs.getString(2)); // Englisch(mysql de)


      rs.previous(); //bir adim geri
      System.out.println("1. Satir=" + rs.getString(2)); //2 index degil ,sira:italian(mysql de)


      DBConnectionClose();
  }
    @Test
      public void Test2() throws SQLException {
          DBConnectionOpen();

          ResultSet rs=sorguEkrani.executeQuery("select * from film"); // mysql e gidip yapistir,calistir,bak sonuca !!

        rs.absolute(10); //direk 10. satira gider
        System.out.println("10. Satir:" + rs.getString("title")); // Aladdin calender(mysql de)


        rs.absolute(5); //direk 5. satira gider,her zaman bastan sayarak gider
        System.out.println("5. Satir:" + rs.getString("title")); //  AFRICAN EGG(mysql de)

        rs.relative(5); //kaldigi yerden 5. satira  ileri gider
        System.out.println("10. Satir:" + rs.getString("title")); // Aladdin calender(mysql de)


rs.next(); // Kacinci satira gider? 11. satira gider



        DBConnectionClose();

  }

// rs.next() : sonraki satır
// rs.previous : önceki satır
// rs.absolute(10) : baştan itibaren 10.satıra ileri gider.
// rs.relative(10) : bulunduğu yerden 10.satıra ileri gider.
// rs.absolute(-10) : - (eksi) sondan demektir, sondan 10.satır
// rs.relative(-5) :  - (eksi) bulunduğu yerden 5 satır geri
// ilk satırdan relative ile 5 geri gitmek istersek sınırı taştığı için hata verecektir

  /*  next() -> 1.satır
    next() -> 2.Satır
    next() -> 3.Satır
    absolute(10) -> 10.Satıra gider
    relative(5) -> 15 e gider
    relative(-2) -> 13 e gider
    absolute(-5) -> - siyi görünce en sona gider
    ordan 5 geri gelir.*/

}
