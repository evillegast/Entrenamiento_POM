package utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InjecionDatos {

    public String obtenerDatos (String filepath, String sheetName, int rowNumber, int cellNumber) throws IOException {
        File excelFile = new File(filepath);
        FileInputStream inputStream = new FileInputStream(excelFile);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        Row row = sheet.getRow(rowNumber);
        Cell cell = row.getCell(cellNumber);
        return cell.getStringCellValue();


    }

}
