package edu.sdccd.cisc191;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

    public class LabProgram {
        public static void main(String[] args) throws IOException {
            Scanner scnr = new Scanner(System.in);
            /* Type your code here. */

            String fileName = scnr.next();
            File testResult = new File("src/main/resources/"+fileName);
            Scanner scanner = new Scanner(testResult);

            String line;
            while(scanner.hasNextLine()){
                line = scanner.nextLine();

                if(line.contains("_photo.jpg")){
                    line = line.replace("_photo.jpg", "_info.txt");
                    System.out.println(line);
                }
            }
            scanner.close();
        }
    }

