package com.company;

public class Fabonaci {
//    public static int fabonaci(int n){
//        if(n==0){
//            return 0;
//        }
//
//        if(n==1 || n==2){
//            return 1;
//        }
//
//        int prepre=1;
//        int pre =1;
//        int current=2;
//        //当n>3时
//        for(int i=3;i<=n;i++){
//            //斐波那契数列公式计算
//            current = pre + prepre;
//
//            //计算完成后，转换角色
//            prepre = pre;
//            pre = current;
//
//
//        }
//
//        return current;
//    }


    public static int fabonacivalue(int n){
        if (n==0){
            return 0;
        }else if(n==1 || n==2){
            return 1;
        }else{
            return fabonacivalue(n-1)+fabonacivalue(n-2);
        }



    }

    public static void main(String args[]){
        System.out.print(fabonacivalue(5));
    }
}
