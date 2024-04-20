package _JDBC;

import org.junit.Test;

import java.sql.*;

public class _01_Giris {

    @Test
   public  void Test1() throws SQLException {
        String url="jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/sakila";
        String username="root";
        String password="'\"-LhCB'.%k[4S]z";

        //1- bağlantı bilgilerini girdik DB server bağlandık
        Connection baglanti= DriverManager.getConnection(url,username,password);

//2-sorgu ekranini actik
        Statement sorguEkrani= baglanti.createStatement();

   //3- Sorgu ekranina sorguyu yazdim ve calistirdim
        ResultSet sonucTablosu=sorguEkrani.executeQuery("select * from customer");

// 4: Alltta sonuclar gözüktü


        sonucTablosu.next();
        String ad=sonucTablosu.getString("first_name");
        String soyad=sonucTablosu.getString("last_name");
        System.out.println("1.satir ad ve soyad" +ad+" "+soyad);

        sonucTablosu.next();
         ad=sonucTablosu.getString("first_name");
         soyad=sonucTablosu.getString("last_name");
        System.out.println("2.satir ad ve soyad" +ad+" "+soyad);

baglanti.close();


    }

}
