package 下半.day25.斗地主项目;

import java.util.ArrayList;

public class PokerGame {
    static ArrayList<String> list = new ArrayList<>();
    //准备牌
    //思想：静态代码块
    //特点：随着类的加载而加载，而且只执行一次
    static {
        String[] color = {"?","?","?","?"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //遍历得到每一个花色
        for (String c : color) {
            //遍历得到每一个数字
            for (String n : number) {
                //将花色和数字添加到集合中
                list.add(c+n);
            }
        }
        list.add("小王");
        list.add("小王");
    }



    public PokerGame(){
        System.out.println(list);
        //洗牌

        //发牌

        //看牌
    }
}
