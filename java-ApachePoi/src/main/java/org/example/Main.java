package org.example;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello world!");
//        writeExcel01();
//        writeExcel02();
        writeExcelBatch();
    }


    /**
     * (03版本)使用poi写出表格
     */
    public static void writeExcel01() throws Exception{

        //1.创建工作簿
        HSSFWorkbook sheets = new HSSFWorkbook();
        //2.创建工作表
        HSSFSheet sheet = sheets.createSheet("第一个工作表");
        //3.创建行
        HSSFRow row = sheet.createRow(0);
        //4.创建单元格
        HSSFCell cell = row.createCell(0);
        //5.单元格写入数据
        cell.setCellValue("第一行，第一个单元格数据");
        //6.创建文件流
        FileOutputStream fileOutputStream = new FileOutputStream("./第一个表格文件(03版本).xls");
        sheets.write(fileOutputStream);
        //关闭流
        fileOutputStream.close();
    }

    /**
     * (07版本)使用poi写出表格
     */
    public static void writeExcel02() throws Exception{

        //1.创建工作簿
        XSSFWorkbook sheets = new XSSFWorkbook();
        //2.创建工作表
        XSSFSheet sheet = sheets.createSheet("第一个工作表");
        //3.创建行
        XSSFRow row = sheet.createRow(0);
        //4.创建单元格
        XSSFCell cell = row.createCell(0);
        //5.单元格写入数据
        cell.setCellValue("第一行，第一个单元格数据");
        //6.创建文件流
        FileOutputStream fileOutputStream = new FileOutputStream("./第二个表格文件(07版本).xlsx");
        sheets.write(fileOutputStream);
        //关闭流
        fileOutputStream.close();
    }

    /**
     * (07)版本批量写出数据
     */
    public static void writeExcelBatch() throws Exception{
        //1.创建07工作簿
        XSSFWorkbook sheets = new XSSFWorkbook();
        XSSFSheet sheet = sheets.createSheet("sheet");
        //1.写入100行数据
        for (int i = 0; i <100; i++) {
            XSSFRow row = sheet.createRow(i);
            XSSFCell cell = row.createCell(0);
            cell.setCellValue(i);
        }
        FileOutputStream fileOutputStream = new FileOutputStream("./第三个表格文件批量数据(07版本).xlsx");
        sheets.write(fileOutputStream);
        fileOutputStream.close();
    }
}