package 上半.day7;

public class 二维数组_静态初始化 {
    public static void main(String[] args) {
        //1.定义二维数组
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };
        //2.获取元素
        //System.out.println(arr[i][j]);
        //arr[i]:表示二维数组的索引
        //arr[i][j]:表示一维数组的索引
//        System.out.println(arr[1][0]);

        //3.二维数组遍历
        //外循环：遍历二维数组，得到每一个一维数组
        for (int[] ints : arr) {
            //i表示二维数组中的每一个索引
            //arr[i]表示二维数组中的每一个元素
            for (int anInt : ints) {
                //内循环：遍历一维数组，得到每一个元素
                //j表示一维数组中的每一个元素
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
