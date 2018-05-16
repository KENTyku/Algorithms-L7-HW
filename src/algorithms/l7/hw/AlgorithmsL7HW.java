/*
 * Use and copying for commercial purposes
 * only with the author's permission
 */
package algorithms.l7.hw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yuri Tveritin
 */
public class AlgorithmsL7HW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        readMatrix();
    }
    /**
     * Задание 1. Написать функцию, которая считывает матрицу смежности из 
     * файла и выводит её на экран.
     */
    static void readMatrix() throws FileNotFoundException, IOException{
        BufferedReader reader = new BufferedReader(new FileReader("matrix.txt"));
        String line;
        List<String> lines = new ArrayList<String>();
        List<String> linestemp = new ArrayList<String>();
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        //если нужен массив то список можно запросто преобрпзовать
        String [] array = lines.toArray(new String[lines.size()]);
        for (int i = 0; i < lines.size(); i++) {
//            System.out.println(array[i]);
            String[]matrix=array[i].split(" ");
            for (int j = 0; j < matrix.length; j++) {
                linestemp.add(matrix[j]);
            }
            
        }
        array=linestemp.toArray(new String[linestemp.size()]);
        for (int i = 0; i < linestemp.size(); i++) {
            System.out.print(array[i]+" ");
        }
        
        
    }
    
}
