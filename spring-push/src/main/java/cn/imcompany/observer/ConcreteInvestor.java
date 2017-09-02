package cn.imcompany.observer;

import cn.imcompany.subject.StockSubject;

public class ConcreteInvestor implements Investor {

    private String name;

    public ConcreteInvestor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void reaction() {
        System.out.println(this.name + " happy:");
    }

    @Override
    public void seeUp(StockSubject subject) {
        int price = subject.getPrice();
        System.out.println("现在股票的价钱为" + price);
        if (price > 50) {
            System.out.println("股票涨价了");
            subject.notifyInvestor();
        } else {
            System.out.println("没涨价，别闹");
        }
    }

}

