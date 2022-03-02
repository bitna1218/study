package com.company;

public class test_11 {
    public static void main(String[] args) {

        Solution2 S =new Solution2();
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};
        S.solution(arr1,arr2);

        System.out.println(arr1[0].length);



            }
        }

class Solution2 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < arr1[j].length; i++) {
                answer[j][i]=arr1[j][i] + arr2[j][i];
            }
        }
        return answer;
    }
}







/*class Solution2 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int [][] a = new int[arr1.length][arr1[0].length];

        if (arr1[0].length == 1) {
            for (int i = 0; i < arr1.length; i++) {
                a[i][0]=arr1[i][0] + arr2[i][0];
            }

        }else{
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    a[i][j]=arr1[i][j]+arr2[i][j];
                }
            }
        }
        return a;
    }
}*/
