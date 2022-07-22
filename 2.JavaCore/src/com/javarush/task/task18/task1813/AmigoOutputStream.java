package com.javarush.task.task18.task1813;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    FileOutputStream fileOutputStream;

    public AmigoOutputStream(FileOutputStream fdObj) throws FileNotFoundException {
        super(fileName);
        fileOutputStream = fdObj;
    }

    @Override
    public void write(int b) throws IOException {
        fileOutputStream.write(b);
    }
    @Override
    public void write(byte[] b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fileOutputStream.write(b, off, len);
    }

    @Override
    public FileChannel getChannel() {
        return fileOutputStream.getChannel();
    }

    @Override
    public void close() throws IOException {
        fileOutputStream.flush();

        String string = "JavaRush © All rights reserved.";
        write(string.getBytes());

        fileOutputStream.close();
    }
    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
