package cn.imcompany.subject;

import cn.imcompany.observer.Investor;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class StockSubject {

    List<Investor> investors = new CopyOnWriteArrayList<>();

    public void attach(Investor investor) {
        investors.add(investor);
    }

    public void dettach(Investor investor) {
        investors.remove(investor);
    }

    public abstract void update();
}
