package com.hxb.instance.factory;

public class factory {
    public factory() {
        System.out.println("bean工厂实例化");
    }
    public Bean3 createBean(){
        return new Bean3();
    }
}
