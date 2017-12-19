package com.csu;


public class adjustArray {

    public static void rejustArray(int[] numbers){
        if(numbers == null || numbers.length==0){
            return;
        }

        int start = 0;
        int end = numbers.length-1;
        while (start < end){
            if (numbers[start] % 2==0 && numbers[end] % 2!=0){//如果开始位置为偶，结束位置为奇，则交换两个数的位置，且指针做出变动
                int temp = numbers[start];
                numbers[start] = numbers[end];
                numbers[end] = temp;
                start++;
                end--;
            }else if(numbers[start] % 2 != 0){//如果开始位置恰好为奇数，则指针向后移动
                start++;
            }else {//如果结束位置恰好为偶数，则指针向前移动
                end--;
            }
        }


    }


    public static void main(String[] args) {
	// write your code here
    }
}
