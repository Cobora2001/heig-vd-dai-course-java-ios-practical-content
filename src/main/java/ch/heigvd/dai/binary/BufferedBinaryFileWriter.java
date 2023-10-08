package ch.heigvd.dai.binary;

import ch.heigvd.dai.Writable;

import java.io.*;

public class BufferedBinaryFileWriter implements Writable {

    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filename));
        for(int i = 0; i < sizeInBytes; ++i) {
            bos.write(1);
        }
        bos.flush();
        bos.close();
    }
}
