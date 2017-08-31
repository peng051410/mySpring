package cn.imcompany;

import cn.imcompany.model.Stock;
import cn.imcompany.observer.Investor;
import cn.imcompany.subject.StockSubject;

public class StockSoft implements Investor {

    private StockSubject subject;
    private Stock stock;

    public StockSubject getSubject() {
        return subject;
    }

    public void setSubject(StockSubject subject) {
        this.subject = subject;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void reaction() {
        if (stock.getPrice() > 50) {
            subject.update();
        }
    }
}
