package edu.sdccd.cisc191;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

    public class LabProgram {
        public static void main(String[] args) throws IOException {
           //create scanner to hold user filename
            Scanner scnr = new Scanner(System.in);
            /* Type your code here. */

            String fileName = scnr.next();
            //path to search for the file
            File testResult = new File("src/main/resources/"+fileName);
            // scanner to scan the contents of the file
            Scanner scanner = new Scanner(testResult);

            String line;

            //loop that checks if file has a next line and replaces the part intended
            while(scanner.hasNextLine()){
                line = scanner.nextLine();

                if(line.contains("_photo.jpg")){
                    line = line.replace("_photo.jpg", "_info.txt");
                    System.out.println(line);
                }
            }
            //closing the scanner for the file
            scanner.close();
        }
    }

