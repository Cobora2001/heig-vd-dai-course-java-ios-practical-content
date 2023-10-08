package ch.heigvd.dai.binary;

import ch.heigvd.dai.Writable;

import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileWriter implements Writable {

    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        FileOutputStream writer = new FileOutputStream(filename);
        for(int i = 0; i < sizeInBytes; ++i) {
            writer.write(1);
        }
        writer.close();
    }
}
