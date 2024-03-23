package cn.kis2.Array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6};
        System.out.println(arr1[1]);


        //把数据存储到数组内 数组名[索引] = 具体数据/变量
        //一但覆盖，原数据就不存在了
        arr1[0] = 100;
        System.out.println(arr1[0]);
    }


}
