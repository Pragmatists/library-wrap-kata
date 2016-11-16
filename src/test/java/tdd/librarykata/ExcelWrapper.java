package tdd.librarykata;

import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrapper {

    private XSSFWorkbook workbook;
    private XSSFSheet currentSheet;

    public void createSpan(int row, int column, int hspan, int vspan) {
        currentSheet.addMergedRegion(new CellRangeAddress(row, row, column, column));
    }

    public void createNewSheet() {
    }

    public CellRangeAddress getRegionAt(int row, int column) {
        return currentSheet.getMergedRegions().get(0);
    }
}
