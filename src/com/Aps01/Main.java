package com.Aps01;

import com.Aps01.datastructures.Matrix;
import com.Aps01.datastructures.MatrixHandler;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String args[]) {

        //input file
        String filename = "matrix/basicMatrix.txt";

        //reading the matrix
        MatrixHandler matrixHandler = new MatrixHandler();
        try {
            Matrix matrix = matrixHandler.readFile(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
