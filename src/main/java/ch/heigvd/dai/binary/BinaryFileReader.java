package ch.heigvd.dai.binary;

import ch.heigvd.dai.Readable;

import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileReader implements Readable {

    @Override
    public void read(String filename) throws IOException {
        FileInputStream reader = new FileInputStream(filename);
        while(reader.read() != -1);
        reader.close();
    }
}
