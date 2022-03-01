package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write {

	public static void main(String[] args) throws Throwable {

		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\Book.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Scanner sc = new Scanner(System.in);

		Workbook w = new XSSFWorkbook(fis);

		Sheet createSheet = w.createSheet("Username");

		for (int i = 0; i < 5; i++) {

			Row row = createSheet.createRow(i);

			System.out.println("Enter data for Row " + i + " : ");

			for (int j = 0; j <= 1; j++) {

				System.out.println("Column " + j + " :");

				if (j == 0) {

					System.out.println("Enter Email Id for Data :");

					String email = sc.next();

					row.createCell(j).setCellValue(email);

				}//End of If

				else {

					System.out.println("Enter 4 digit data :");

					int nextInt = sc.nextInt();

					row.createCell(j).setCellValue(nextInt);

				}//End of Else

			} // End of J Loop
		} // End of I Loop

		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);

		w.close();

	}// End of Main

}// End of Class
