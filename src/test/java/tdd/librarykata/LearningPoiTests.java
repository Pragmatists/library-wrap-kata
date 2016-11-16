package tdd.librarykata;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class LearningPoiTests {

    public static final String TEST_OUTPUT_XLSX = "src/test/resources/test.xlsx";

    @Test
    public void create_sth() throws Exception {
        XSSFWorkbook workbook = new XSSFWorkbook(XSSFWorkbookType.XLSX);
        workbook.write(new FileOutputStream(TEST_OUTPUT_XLSX));
        assertThat(new File(TEST_OUTPUT_XLSX)).exists();
    }
}

