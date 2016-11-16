package tdd.librarykata;

import org.apache.poi.ss.util.CellRangeAddress;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExcelWrapperTest {

    @Test
    public void creates_spanned_cells() {
        ExcelWrapper excelWrapper = new ExcelWrapper();
        excelWrapper.createNewSheet();

        excelWrapper.createSpan(2, 3, 2, 4);

        CellRangeAddress region = excelWrapper.getRegionAt(2, 3);

        assertThat(region.getFirstRow()).isEqualTo(2);
        assertThat(region.getFirstColumn()).isEqualTo(3);
        assertThat(region.getLastRow()).isEqualTo(5);
        assertThat(region.getLastColumn()).isEqualTo(4);
    }
}
