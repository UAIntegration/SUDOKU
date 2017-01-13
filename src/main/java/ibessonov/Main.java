package ibessonov;

import ibessonov.ss.Field;
import ibessonov.ss.Field.Cell;
import ibessonov.ss.Field.Row;
import ibessonov.ss.SudokuSolver;

import java.util.stream.IntStream;

import static java.lang.Runtime.getRuntime;

/**
 * @author ibessonov
 */
public class Main {

    public static String main(String field) {
//final String field = "800000000003600000070090200050007000000045700000100030001000068008500010090000400";
String myresult = "";
    StringBuilder out = new StringBuilder(171);
        SudokuSolver solver = SudokuSolver.of(field)
                .withPrecision(1e-5)
                .withLogging(true)//логинование
                .build();
        /*IntStream.range(0, getRuntime().availableProcessors()).parallel().forEach(i -> {
            Field result = solver.solve();

            // printing out the answer
            //StringBuilder out = new StringBuilder(171);
            for (Row row : result.rows()) {
                for (Cell cell : row.cells()) {
                    out.append(' ');
                    out.append(cell.value());
                }
                out.append("\n");
            }
            out.append("\n");//разделитель
            /*synchronized (Main.class) {
                System.out.print(out);
                System.out.flush();
                //System.exit(0);
            }*/
        //});
        
        
        Field result = solver.solve();

            // printing out the answer
            //StringBuilder out = new StringBuilder(171);
            for (Row row : result.rows()) {
                for (Cell cell : row.cells()) {
                    //out.append(' ');
                    out.append(cell.value());
                }
                //out.append("\n");
            }
        myresult = out.toString();
        return myresult;
    }
}
