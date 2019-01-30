package com.navri;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class namesorter {


    public static void main(String[] args) {

        //Input
        String inputFile = "unsorted-names-list.txt";
        String line;
        List<Name> nameList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                Name name = new Name();
                name.setLastName(line.substring(line.lastIndexOf(" ")+1));
                name.setRestName(line);
                nameList.add(name);
            }
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" +inputFile + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '"+ inputFile + "'");

        }

        //Process
        Collections.sort(nameList,Name.comByLast);

        //Output
        String outputFile = "sorted-names-list.txt";

        try {
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Name item : nameList) {
                bufferedWriter.write(item.getRestName());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Error writing to file '"+ outputFile + "'");
        }

        for (Name item : nameList) {
            System.out.println(item.getRestName());
        }
    }
}
