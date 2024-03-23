package cn.kis2.Array;

public class ArrayTest1 {
    public static void main(String[] args) {
        int sum=0;
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组的和为："+sum);
    }

}
