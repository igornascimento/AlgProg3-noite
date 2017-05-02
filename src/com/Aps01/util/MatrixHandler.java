package com.Aps01.util;

import com.Aps01.datastructures.LinkedList;
import java.io.FileNotFoundException;

/**
 * Class to manipulate the bi-dimensional linkedList obj
 */
public class MatrixHandler {


    /**
     * Stores the matrix as a bi-dimensional LinkedList
     */
    private LinkedList matrix = new LinkedList();


    /**
     * Reads the file and returns the final LinkedList
     * @param filename
     * @return LinkedList matrix object
     * @throws FileNotFoundException
     */
    public LinkedList readFile(String filename) throws FileNotFoundException {
        TxtFileReader fileReader = new TxtFileReader(filename);
        String[] arrLine;

        // reading each line from file
        while (fileReader.hasNextLine()) {
            arrLine = fileReader.nextLine();
            LinkedList line = new LinkedList();
            for (int i = 0; i < arrLine.length; i++) {
                // creates X dimension for the matrix
                line.append(arrLine[i]);
            }
            // adds the line created to the final matrix
            matrix.append(line);
        }
        return matrix;
    }

    /**
     * Prints the matrix to the console
     */
    public void exposeMatrix() {

    }

}
