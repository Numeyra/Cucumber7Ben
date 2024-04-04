package ApachePOI;

import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {

    public static void main(String[] args) throws IOException {

    String path="src/test/java/ApachePOI/resource/ApacheExcel2 (1).xlsx"; //excelin oldugu yer

//Java dosya okuma nesnesine bu yolu vererekbaglanti kuruyorum

        FileInputStream dosyaOkumaBaglantisi=new FileInputStream(path);

      //Dosya okuma islemcisi üzerindencalisma kitabini aliyorum
     //hafizada workbook u alip olusturdu
        Workbook calismaKitabi= WorkbookFactory.create(dosyaOkumaBaglantisi);

        //istedigim ismdeki calisma sayfasini aliyorum
        Sheet calismaSayfasi=calismaKitabi.getSheet("Sheet1");

       //istenen saatiri aliyorum
         Row satir=calismaSayfasi.getRow(0);// 0. satiri aldim

       //istenen hücreyi aliyorum
      Cell hucre= satir.getCell(0);// 0. hücreyi aldim

        System.out.println("hucre"+hucre);







    }
}
