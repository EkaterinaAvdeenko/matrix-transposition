package com.epam.rd.autotasks.matrices;

import java.util.Arrays;

public class TransposeMatrix {

  public static int[][] transpose(int[][] matrix) {
    int n = matrix.length;
    int m = matrix[0].length;
    int[][] transposedMatrix = new int[m][n];
    for (int x = 0; x < m; x++) {
      for (int y = 0; y < n; y++) {
        transposedMatrix[x][y] = matrix[y][x];
      }
    }
    return transposedMatrix;
  }

  public static void main(String[] args) {

    System.out.println("Test your code here!\n");

    int[][] matrix = {
        {1, 2},
        {7, -13}};

    int[][] result = transpose(matrix);
    System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
  }
}


