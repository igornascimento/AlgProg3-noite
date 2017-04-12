package com.Aps01.datastructures;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Class to read the txt file
 */
public class TxtFileReader {

    private Scanner scanner;

    public TxtFileReader(String filename) throws FileNotFoundException {
        scanner = new Scanner(new FileReader(filename));
        scanner.nextLine();
    }

    public boolean hasNextLine() {
        return scanner.hasNext();
    }

    public String[] nextLine() {
        String line = scanner.nextLine();
        String[] list = line.split("");
        return list;
    }

}
