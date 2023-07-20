package com.company.lesson10;

import java.io.*;
import java.util.ArrayList;

public class Utils {

    public ArrayList<String> getStringList(String path) {
        ArrayList<String> strings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String str;
            while ((str = reader.readLine()) != null) {
                strings.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    public void writeString(String str, String path){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getMerge(String firstPath, String secondPath, String newPath) {
        ArrayList<String> strings1 = getStringList(firstPath);
        ArrayList<String> strings2 = getStringList(secondPath);

        StringBuilder mergeFiles = new StringBuilder();
        for (String str : strings1) {
            mergeFiles.append(str).append("\n");
        }
        for (String str : strings2) {
            mergeFiles.append(str).append("\n");
        }
        writeString(mergeFiles.toString(), newPath);
    }

    public void replacer(String sourceFilePath, String targetFilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(targetFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String replacedLine = line.replaceAll("[^А-ЯЁа-яё0-9]", "\\$");
                writer.write(replacedLine);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
