package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E1ExcelReader {
    public static void main(String[] args) throws IOException {

        String path="/Users/hustl3r/IdeaProjects/ExcelReading/Files/EmpData.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
        Sheet sheet=   xssfWorkbook.getSheet("sheet1");
       //Row row=  sheet.getRow(1);
        Row row=  sheet.getRow(2);
        Cell cellrow= row.getCell(0);
        System.out.println(cellrow.toString());
    }
}
