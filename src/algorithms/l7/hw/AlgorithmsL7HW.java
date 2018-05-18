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
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        //преобразуем список строк в массив строк
        String [] array = lines.toArray(new String[lines.size()]);
        /**
         * считываем первую строку которая определяет размер матрицы (так 
         * было оговорено) и преобразуем в int
         */
        int sizeArray=Integer.parseInt(array[0]);
        /**
         * помещаем в мартицу считанные строки, разбивая каждую строку
         * на элементы
         */
        int [][] array2D=new int[sizeArray][sizeArray];
        for (int i = 0; i < sizeArray; i++) {
//            System.out.println(array[i]);
            String[]matrix=array[i+1].split(" ");
            for (int j = 0; j < matrix.length; j++) {
                array2D[i][j]=Integer.parseInt(matrix[j]);
            }
            
        }
        //вывод матрицы
        for (int i = 0; i < sizeArray; i++) {
            for (int j = 0; j < sizeArray; j++) {
                System.out.print(array2D[i][j]+" ");
            }
            System.out.println();
            
        }
        
        
    }
    
    /**
     * Задание 2 Написать рекурсивную функцию обхода графа в глубину.
     */
    void runmatrix(){
        
        class Node {
            int key;
            int value;
            Node l;
            Node r;
            Node p;
            public Node(int key, int value, Node p) {
                this.key = key;
                this.value = value;
                this.p = p;
            }
        }
    }
    
}
