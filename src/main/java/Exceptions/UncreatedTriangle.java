package Exceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UncreatedTriangle extends Exception{
    private static int id = 1;
    public UncreatedTriangle(String message){
        super(message);
        //now it creates an registry in log exception archive
        try {
            File file = new File ("src/Files/LogExeptions.txt");
            FileWriter writer = new FileWriter(file,true);
            String date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
            writer.write(id + "\t||\t" + date + "\t||\tUncreatedTriangleException\n");
            id++;
            System.out.println(id);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error ocurred during file creation: ");
            e.printStackTrace();
        }

    }
}
