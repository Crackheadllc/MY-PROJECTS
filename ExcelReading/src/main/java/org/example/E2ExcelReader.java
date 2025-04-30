package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E2ExcelReader {
    public static void main(String[] args) throws IOException {

        String path = "/Users/hustl3r/IdeaProjects/ExcelReading/Files/EmpData.xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
        Sheet sheet = xssfWorkbook.getSheet("sheet1");
        int noOfRows = sheet.getPhysicalNumberOfRows();
        List<Map<String,String>> excelData=new ArrayList<>();
        Row headerRow= sheet.getRow(0);
        for (int i = 0; i < noOfRows; i++) {
            Row row = sheet.getRow(i);
            Map<String,String> rowMap=new LinkedHashMap<>();
            int noOfCells = row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfCells; j++) {
                String key=headerRow.getCell(j).toString();
                String value=row.getCell(j).toString();
                rowMap.put(key,value);
                //System.out.print(row.getCell(j) +" ");
            }
            excelData.add(rowMap);
            //System.out.println();
        }
        System.out.println(excelData);
    }
}
