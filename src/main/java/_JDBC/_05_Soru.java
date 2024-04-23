package _JDBC;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static _JDBC.JDBCParent.*;

public class _05_Soru {
    //city tablosundaki tüm satirlardaki sehir isimlerini absolute ile yazdiriniz

@Test
public void Test1() throws SQLException {

   DBConnectionOpen();

    ResultSet rs=sorguEkrani.executeQuery("select city from city");
    rs.last();
  int sonSatirNo=rs.getRow(); //son  satir numarasi

    for (int i =1; i <=sonSatirNo ; i++) {
        rs.absolute(i);

        System.out.println(i + ".Satir:" + rs.getString(1));

    }


    DBConnectionClose();

}
    //city tablosundaki tüm satirlardaki sehir isimlerini relative ile yazdiriniz


    @Test
    public void Test2() throws SQLException {

        DBConnectionOpen();

        ResultSet rs=sorguEkrani.executeQuery("select city from city");
        rs.last();
        int sonSatirNo=rs.getRow(); //son  satir numarasi

        rs.first();
        System.out.println("1.Satir:"+rs.getString(1));

        for (int i =1; i < sonSatirNo ; i++) {
            rs.relative(1); // relative 1 er 1 er gittigi icin

            System.out.println(i + ".Satir:" +rs.getString(1));

        }


        DBConnectionClose();

    }


}
