package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.ImageReader;
import com.javarush.task.task16.task1631.common.ImageTypes;

/* 
Factory method pattern
*/

public class Solution {
    public static void main(String[] args) throws IllegalAccessException {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}
