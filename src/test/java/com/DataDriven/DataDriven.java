package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws Throwable {

		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\Book.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Scanner sc = new Scanner(System.in);

		Sheet s = w.getSheetAt(0);

		int PhysicalNumberOfRows = s.getPhysicalNumberOfRows();

		for (int i = 0; i < PhysicalNumberOfRows; i++) {

			Row row = s.getRow(i);

			int physicalNumberOfCells = row.getPhysicalNumberOfCells();

			for (int j = 0; j < physicalNumberOfCells; j++) {

				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();

				if (cell.getCellType().equals(cellType.STRING)) {

					String stringCellValue = cell.getStringCellValue();

					System.out.println(
							"Cell value at " + "Row " + i + " : " + " Column " + j + " : " + "  " + stringCellValue);

				} // End of If statement

				else if (cell.getCellType().equals(cellType.NUMERIC)) {

					double numericCellValue = cell.getNumericCellValue();
					int cellValue = (int) numericCellValue;
					System.out
							.println("Cell value at " + "Row " + i + " : " + " Column " + j + " : " + "  " + cellValue);

				} // End of ElseIf statement

			} // End of J Loop

		} // End of I loop

		try {

			System.out.println("Data based on Row & Column Index: \n\n");

			System.out.println("Enter index of Row :");
			int rowIndex = sc.nextInt();

			System.out.println("Enter index of column :");
			int columnIndex = sc.nextInt();

			Row row = s.getRow(rowIndex);

			Cell cell = row.getCell(columnIndex);
			CellType cellType = cell.getCellType();

			if (cell.getCellType().equals(cellType.STRING)) {

				String stringCellValue = cell.getStringCellValue();
				System.out.println("Data at cell :" + stringCellValue);

			}

			else if (cell.getCellType().equals(cellType.NUMERIC)) {

				double numericCellValue = cell.getNumericCellValue();
				int cellValue = (int) numericCellValue;

				System.out.println("Data at cell :" + cellValue);

			}

		} // end of try

		catch (Exception e) {

			System.out.println("Data not there in cell. Incorrect Index.");

		} // end of catch

	}// End of Main

}// End of Class
