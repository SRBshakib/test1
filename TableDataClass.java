package mainpkg;


public class TableDataClass {
    private String colVal;

    public TableDataClass() {
    }

    public TableDataClass(String colVal) {
        this.colVal = colVal;
    }

    public String getColVal() {
        return colVal;
    }

    public void setColVal(String colVal) {
        this.colVal = colVal;
    }

    @Override
    public String toString() {
        return "TableDataClass{" + "colVal=" + colVal + '}';
    }
    
}
