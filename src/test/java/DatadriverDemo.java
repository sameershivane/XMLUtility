import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xml.security.utils.XalanXPathFactory;

public class DatadriverDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("D:\\SAMEER BACKUP\\WACT\\Other\\XSSFWorkbook.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int sheets = workbook.getNumberOfSheets();

		for (int i = 0; i < sheets; i++) {

			String sheetname = workbook.getSheetName(i);
			if (sheetname.equalsIgnoreCase("Testdata")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> cell = firstrow.iterator();

				while (cell.hasNext()) {

					Cell value = cell.next();
					if (value.getStringCellValue().equalsIgnoreCase("Testdata1")) {

					}
				}
			}

		}

	}
}
