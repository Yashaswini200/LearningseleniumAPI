package org.example.ex17_data_driven_testing;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Utilexcel {
    //apache poi
    //read the file -login.csv
    //workbook
    //sheet
    //row and cell
    //2d object -getdata()
    static Workbook book;
    static  Sheet sheet;
    public static String Sheetpath=System.getProperty("user.dir")+"/src/test/resources/testdata.xlsx";
    public static Object[][] getTestdata(String sheetname) {
        FileInputStream file = null;
        try {
            file = new FileInputStream(Sheetpath);
            book = WorkbookFactory.create(file);
            sheet = book.getSheet(sheetname);
        } catch (Exception e) {
            System.out.println("wrong");
        }
        Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for(int i=0;i<sheet.getLastRowNum();i++){
            for(int j=0;j<sheet.getRow(0).getLastCellNum();j++){
                data[i][j]=sheet.getRow(i+1).getCell(j).toString();
            }
        }
return data;
    }
}
