package org.example;

import java.util.ArrayList;
import java.util.List;

public class DataHandler {
    List<String> inputLines = new ArrayList<>();

    public void addLine(String s){
        inputLines.add(s);
    }

    @Override
    public String toString() {
        return String.join("\n\r", inputLines);
    }
}
