
import java.io.File;
import jxl.*;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mlhit10
 */
public class Read {
    public static void main (String[] args) throws Exception{
         File f;
         f=new File("C:\\Users\\mlhit10\\Desktop\\SensorData\\Users.xls");
         Workbook wb;
         wb=Workbook.getWorkbook(f);
        Sheet s=wb.getSheet(0);
        int row=s.getRows();
        int col=s.getColumns();
        for (int i=0;i<row;i++){
            for (int j=0; j<col;j++){
            Cell c=s.getCell(j, i);
            System.out.print(c.getContents());        
        }
            System.out.print("\n");
        }
         
    }
    
}
