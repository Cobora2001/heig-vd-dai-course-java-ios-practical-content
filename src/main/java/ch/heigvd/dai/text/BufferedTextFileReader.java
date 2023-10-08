package ch.heigvd.dai.text;

import ch.heigvd.dai.Readable;

import java.io.*;

public class BufferedTextFileReader implements Readable {
    @Override
    public void read(String filename) throws IOException {
        BufferedReader bis = new BufferedReader(new FileReader(filename));
        while(bis.read() != -1);
        bis.close();
    }
}
