package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes img) throws IllegalAccessException {
        if (img == ImageTypes.JPG)
            return new JpgReader();

        if (img == ImageTypes.BMP)
            return new BmpReader();

        if (img == ImageTypes.PNG)
            return new PngReader();

        throw new IllegalArgumentException("Unknown image type");

    }

}
