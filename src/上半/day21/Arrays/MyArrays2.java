package 上半.day21.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrays2 {
    public static void main(String[] args) {
        /*
        参数一:要排序的数组
        参数二:排序的规则
        细节:
        只能给引用数据类型的数组进行排序如果数组是基本数据类型的，需要变成其对于的包装类
        */

        Integer [] arr = {2,3,5,7,9,11,23,768,8,14};
        //第二个参数是一个接口，所以我们在调用方法的时候，需要传递这个接口的实现类对象，作为排序的规则。
        //但是这个实现类，我只要使用一次，所以就没有必要单独的去写一个类，直接采取匿名内部类的方式就可以了
        /*
        1.底层原理:
        利用插入排序 +二分查找的方式进行排序的。
        默认把0索引的数据当做是有序的序列，1索引到最后认为是无序的序列。
        遍历无序的序列得到里面的每一个元素，假设当前遍历得到的元素是A元素
        把A往有序序列中进行插入，在插入的时候，是利用二分查找确定A元素的插入点。
        拿着A元素，跟插入点的元素进行比较，比较的规则就是compare方法的方法体
        如果方法的返回值是负数，拿着A继续跟前面的数据进行比较
        如果方法的返回值是正数，拿着A继续跟后面的数据进行比较
        如果方法的返回值是0，也拿着A跟后面的数据进行比较
        直到能确定A的最终位置为止。

        2.compare方法的形式参数:
        参数一o1: 表示在无序序列中，遍历得到的每一个元素
        参数二o2:有序序列中的元素

        3.返回值:
        负数:表示当前要插入的元素是小的，放在前面
        正数:表示当前要插入的元素是大的，放在后面
        0:表示当前要插入的元素跟现在的元素比是一样的们也会放在后面

        4.简单理解:
        01-02 :升序排列
        02-01 :降序排序
        */
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
