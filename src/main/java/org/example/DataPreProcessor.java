package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public   class DataPreProcessor {

    public static String ReadFile(String fileName){


        File file = new File("input/"+fileName);

        try {
            BufferedReader br
                    = new BufferedReader(new FileReader(file));

            return br.readLine();



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "asd";
    }
}



