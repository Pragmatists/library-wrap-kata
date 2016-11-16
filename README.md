Library Wrap Kata
=================

Create a class that allows:

1. save an Excel workbook as a file (empty to start with)
2. create a spanned cell in an excel file
```
public void createSpanned(int row, int column, int hspan, int vspan);
```

3. find a spanned cell in an excel file
 ```
 public CellRangeAddress getRegion(int row, int column);
 ``` 
 
Start by writing a few learning tests for poi library.

Reference: http://poi.apache.org/spreadsheet/quick-guide.html