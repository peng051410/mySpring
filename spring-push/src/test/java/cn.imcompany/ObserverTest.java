package cn.imcompany;

import cn.imcompany.model.Stock;
import cn.imcompany.observer.ConcreteInvestor;
import cn.imcompany.observer.Investor;
import cn.imcompany.subject.ConcreteStockSubject;
import cn.imcompany.subject.StockSubject;

public class ObserverTest {

    public static void main(String[] args) {


        StockSubject subject = new ConcreteStockSubject();
        Investor concreteInvestor = new ConcreteInvestor("1111");

        Stock stock = new Stock();
        stock.setName("我的牛股");
        stock.setPrice(51);

        StockSoft stockSoft = new StockSoft();
        stockSoft.setStock(stock);
    }

}
