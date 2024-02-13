package exception.task_1;

import algorithms.Bubble;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Task1 {

    public static void main(String[] args) throws IOException{

//        try {
            readFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
    public static void readFile() throws IOException {

//        try {

            BufferedReader fin = new BufferedReader
                    (new FileReader("/home/pavel/IdeaProjects/learn_java/src/exception/exception.txt"));
            String line;
            while ((line = fin.readLine()) != null)
                System.out.println(line);
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

}
