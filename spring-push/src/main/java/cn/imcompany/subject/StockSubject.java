package cn.imcompany.subject;

import cn.imcompany.observer.Investor;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class StockSubject {

    private String stockName;
    private int price;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //要维护买了股票的人
    List<Investor> investors = new CopyOnWriteArrayList<>();

    //有人买入
    public void attach(Investor investor) {
        System.out.println(investor.getName() + "买了股票！");
        investors.add(investor);
    }

    //有人卖出
    public void dettach(Investor investor) {
        System.out.println(investor.getName() + "卖了股票！");
        investors.remove(investor);
    }

    /**
     * 通知持有该股票的人
     */
    public abstract void notifyInvestor();
}
