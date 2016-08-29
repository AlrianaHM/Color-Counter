package com.company;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.HashSet;
import java.util.Set;
import javax.imageio.ImageIO;

public class Main {

    public static void main(String[] args) throws IOException {
	    Set<Integer> setOfColors = new HashSet<Integer>();
        BufferedImage image = ImageIO.read(new File("input.png"));
        int width = image.getWidth();
        int height = image.getHeight();
        System.out.println(width +" x "+ height);

        for(int y=0; y<height; y++){
            for (int x=0; x<width; x++){
                int pixel = image.getRGB(x, y);
                setOfColors.add(pixel);
            }
        }
        System.out.println(setOfColors.size() + " colors");
    }
}
