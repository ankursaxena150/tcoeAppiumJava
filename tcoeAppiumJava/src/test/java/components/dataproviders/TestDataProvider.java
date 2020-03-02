package components.dataproviders;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class TestDataProvider {

    @DataProvider(name = "staticExcelDataProvider")
    public static Object[][] TestDataProviderReader(final Method testMethod) {
        String excel = "/testdata/";
        DataProviderArguments dataFile = testMethod.getAnnotation(DataProviderArguments.class);
        if (dataFile != null)
            excel += dataFile.file();
        else
            excel += "LoginWithIncorrectPasswords.xlsx";
        ExcelLibrary excelReader = new ExcelLibrary();
        int totalNumberOfRows = excelReader.getRowCount(excel);
        Object[][] array = new Object[totalNumberOfRows][];
        for (int row = 1; row <= totalNumberOfRows; row++) {
            array[row - 1][0] = excelReader.readFromExcel(row, 0, excel);
            array[row - 1][1] = excelReader.readFromExcel(row, 1, excel);
        }
        return array;
    }

    @DataProvider(name = "getDataFromFile")
    public static Object[][] getDataFromLocalFile(final Method testMethod) {
        DataProviderArguments dataFile = testMethod.getAnnotation(DataProviderArguments.class);
        ExcelLibrary excelReader = new ExcelLibrary();
        return excelReader.readFromExcel(dataFile.file());
    }

    @DataProvider(name = "getExcelDataFromFile", parallel = true)
    public static Object[][] getDataFromExcelTab(final Method testMethod) {
        ExcelDataProvider dataFile = testMethod.getAnnotation(ExcelDataProvider.class);
        ExcelLibrary excelReader = new ExcelLibrary();
        return excelReader.readFromExcelTab(dataFile.fileName(), dataFile.tab());
    }
}
