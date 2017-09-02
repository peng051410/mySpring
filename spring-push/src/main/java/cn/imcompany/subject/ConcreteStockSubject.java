package cn.imcompany.subject;

import cn.imcompany.observer.Investor;

public class ConcreteStockSubject extends StockSubject {

    @Override
    public void notifyInvestor() {

        for (Investor investor : investors) {
            investor.reaction();
        }
    }
}

