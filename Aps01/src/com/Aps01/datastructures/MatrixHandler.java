package com.Aps01.datastructures;

import java.io.FileNotFoundException;

/**
 * Class to return the final matrix obj
 */
public class MatrixHandler {

    private Matrix matrix;

    /**
     * Reads the file and returns the final matrix
     * @param filename
     * @return final matrix obj
     * @throws FileNotFoundException
     */
    public Matrix readFile(String filename) throws FileNotFoundException {
        TxtFileReader fileReader = new TxtFileReader(filename);
        String[] arrline;

        while (fileReader.hasNextLine()) {
            arrline = fileReader.nextLine();
            matrix.pushLine(arrline);
        }

        return matrix;
    }

}
