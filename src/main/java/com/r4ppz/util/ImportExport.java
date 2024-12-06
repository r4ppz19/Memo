package com.r4ppz.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.r4ppz.model.MainModel;

public class ImportExport {
    private MainModel mainModel = new MainModel();
    private GetTimeDate getTimeDate = new GetTimeDate();


    // Import data.txt in to the program
    public void importData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            if ((line = reader.readLine()) != null) {
                mainModel.setDate(line);
            }
            if ((line = reader.readLine()) != null) {
                mainModel.setTime(line);
            }
            StringBuilder textBuilder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                textBuilder.append(line).append("\n");
            }
            mainModel.setTxt(textBuilder.toString().trim());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Export data to data.txt
    public void exportData() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt", true));
            writer.write(getTimeDate.getCurrentDate());
            writer.newLine();
            writer.write(getTimeDate.getCurrentTime());
            writer.newLine();
            writer.write(mainModel.getTxt());
            writer.newLine();
            writer.newLine();
            writer.close();
        } catch (IOException IOe) {
            System.out.println("IO EXCEPTION !!! WHOOO HOOO");
        }
    }
}
