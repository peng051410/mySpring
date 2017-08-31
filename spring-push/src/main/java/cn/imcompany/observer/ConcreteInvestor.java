package cn.imcompany.observer;

import cn.imcompany.subject.StockSubject;

public class ConcreteInvestor implements Investor {

    private String name;

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

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
        System.out.println("happy:" + this.name);
    }

    public void lookStockUp(StockSubject stockSubject) {

        if (this.price > 50) {
            stockSubject.update();
        }
    }
}

