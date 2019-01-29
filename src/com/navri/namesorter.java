package com.navri;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class namesorter {


    public static void main(String[] args) {

        //Input
        String inputFile = "temp.txt";
        String line;
        List<String> nameList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                nameList.add(line);
            }
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" +inputFile + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '"+ inputFile + "'");

        }

        String [] arrayName = nameList.toArray( new String[ nameList.size() ] );
        String temp;
        //Process
        for (int i = 0; i < nameList.size()-1; i++) {
            for (int j = i+1; j < nameList.size(); j++) {
                String lastWordi = arrayName[i].substring(arrayName[i].lastIndexOf(" ")+1);
                String lastWordj = arrayName[j].substring(arrayName[j].lastIndexOf(" ")+1);
                String combineI = lastWordi+" "+arrayName[i];
                String combineJ = lastWordj+" "+arrayName[j];
                if (combineI.compareTo(combineJ)>0) {
                    temp = arrayName[i];
                    arrayName[i] = arrayName[j];
                    arrayName[j] = temp;
                }
            }
        }
        
        //Output
        String outputFile = "result.txt";

        try {
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String item : arrayName) {
                bufferedWriter.write(item);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Error writing to file '"+ outputFile + "'");
        }

        for (String item : arrayName) {
            System.out.println(item);
        }
    }
}
