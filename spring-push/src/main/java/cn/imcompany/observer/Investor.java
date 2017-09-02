package cn.imcompany.observer;

import cn.imcompany.subject.StockSubject;

public interface Investor {

    String getName();

    void setName(String name);

    void reaction();

    void seeUp(StockSubject subject);
}
