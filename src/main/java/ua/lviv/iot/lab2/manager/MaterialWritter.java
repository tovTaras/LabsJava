package ua.lviv.iot.lab2.manager;

import ua.lviv.iot.lab2.hierarchy.Materials;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MaterialWritter {

        public void writeToFile(Materials[] materials, String fileName) {
            File file = new File(fileName + ".csv");

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write(materials[0].getHeaders() + "\n");
                for (Materials material : materials) {
                    writer.write(material.toCSV() + "\n");

                }
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
