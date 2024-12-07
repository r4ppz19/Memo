package com.r4ppz.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.r4ppz.model.DataModel;

public class ImportExport {
    public DataModel dataModel = new DataModel();
    private GetTimeDate getTimeDate = new GetTimeDate();

    // Import data.txt in to the program
    public void importData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            if ((line = reader.readLine()) != null) {
                dataModel.setDate(line);
            }
            if ((line = reader.readLine()) != null) {
                dataModel.setTime(line);
            }
            StringBuilder textBuilder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                textBuilder.append(line).append("\n");
            }
            dataModel.setTxt(textBuilder.toString().trim());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Export data to data.txt
    public void exportData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt", true))) {
            writer.write(getTimeDate.getCurrentDate());
            writer.newLine();
            writer.write(getTimeDate.getCurrentTime());
            writer.newLine();
            writer.write(dataModel.getTxt());
            writer.newLine();
            writer.newLine();
        } catch (IOException IOe) {
            System.out.println("IO EXCEPTION WHOOO HOOO !!!");
        } catch (NullPointerException NPe) {
            System.out.println("NULL POINTER EXCEPTION WHOOO HOOO !!!");
        }

    }
}
