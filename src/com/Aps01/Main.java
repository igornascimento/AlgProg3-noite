package com.Aps01;

import com.Aps01.datastructures.LinkedList;
import com.Aps01.util.MatrixHandler;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String args[]) {

        //input file
        String filename = "matrix/basicMatrix.txt";

        //reading the matrix
        MatrixHandler matrixHandler = new MatrixHandler();
        try {
            LinkedList matrix = matrixHandler.readFile(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
