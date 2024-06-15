package 上半.day13.p127_利用方法的重写设计继承结构;

import 上半.day13.p125_继承的特点和继承体系的设计.Dog;

public class SharPei extends Dog {
    @Override
    public void eat (){
        super.eat();
        System.out.println("吃骨头");
    }
}
