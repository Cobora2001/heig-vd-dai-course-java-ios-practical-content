package ch.heigvd.dai;

import java.io.IOException;

class Test {
    private static void test(String directoryPath, int nbrBytes) throws IOException {
        System.out.println("---------------------- " + nbrBytes + " bytes ----------------------");

        testBufferedOrNot(directoryPath, nbrBytes, true);

        System.out.println("\n");

        testBufferedOrNot(directoryPath, nbrBytes, false);

        System.out.println("\n\n");
    }

    private static void testBufferedOrNot(String directoryPath, int nbrBytes, boolean buffered) throws IOException {
        System.out.println("====================== " + (buffered ? "Buffered" : "Unbuffered") + " ======================");

        testBinary(directoryPath, nbrBytes, buffered);
        testText(directoryPath, nbrBytes, buffered);
    }

    private static void testBinary(String directoryPath, int nbrBytes, boolean buffered) throws IOException {
        System.out.println("++++++++++++++++++++++ Binary ++++++++++++++++++++++");

        Measure.write(directoryPath + "binary_" + nbrBytes + "B.bin", nbrBytes, buffered, Measure.FileType.BINARY);
        Measure.read(directoryPath + "binary_" + nbrBytes + "B.bin", buffered, Measure.FileType.BINARY);
    }

    private static void testText(String directoryPath, int nbrBytes, boolean buffered) throws IOException {
        System.out.println("++++++++++++++++++++++ Text ++++++++++++++++++++++");

        Measure.write(directoryPath + "text_" + nbrBytes + "B.txt", nbrBytes, buffered, Measure.FileType.TEXT);
        Measure.read(directoryPath + "text_" + nbrBytes + "B.txt", buffered, Measure.FileType.TEXT);
    }

    public static void test(String directoryPath) throws IOException {
        int byteNumber = 1;
        test(directoryPath, byteNumber);
        byteNumber *= 1024;
        test(directoryPath, byteNumber);
        byteNumber *= 1024;
        test(directoryPath, byteNumber);
        byteNumber *= 5;
        test(directoryPath, byteNumber);
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        Test.test(".\\src\\test\\resources\\");
    }
}
