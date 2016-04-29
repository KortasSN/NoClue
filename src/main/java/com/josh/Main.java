package com.josh;

import java.io.*;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.extractor.XSSFEventBasedExcelExtractor;
import org.apache.poi.xssf.extractor.XSSFExcelExtractor;

public class Main {

    public static void main(String[] args) {
	try {
        FileInputStream file = new FileInputStream(new File("FiguresFinalProjectolder.xls"));
        HSSFWorkbook workbook = new HSSFWorkbook(file);

        HSSFSheet sheet = workbook.getSheetAt(0);
        System.out.println(workbook);


//
//        for (Row row: sheet) {
//
//            Iterator cellIterator = row.cellIterator();
//
//            while (cellIterator.hasNext()) {
//                Cell cell = (Cell) cellIterator.next();
//                //Cell cell = cellIterator.next();
//                switch (cell.getCellType()) {
//                    case Cell.CELL_TYPE_NUMERIC:
//                        System.out.println(cell.getNumericCellValue());
//                        break;
//                    case Cell.CELL_TYPE_STRING:
//                        System.out.println(cell.getStringCellValue());
//                        break;
//                }
//            }
//            System.out.println("");
//        }
//        file.close();
//    } catch (FileNotFoundException e) {
//        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

    }
}
