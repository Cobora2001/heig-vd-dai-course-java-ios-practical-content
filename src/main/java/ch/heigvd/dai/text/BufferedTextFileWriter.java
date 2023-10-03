package ch.heigvd.dai.text;

import ch.heigvd.dai.Writable;

import java.io.*;

public class BufferedTextFileWriter implements Writable {
    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        BufferedWriter bos = new BufferedWriter(new FileWriter(filename));
        for(int i = 0; i < sizeInBytes; ++i) {
            bos.write('a');
        }
        bos.flush();
        bos.close();
    }
}
