package cn.imcompany;

import cn.imcompany.observer.ConcreteInvestor;
import cn.imcompany.observer.Investor;
import cn.imcompany.subject.ConcreteStockSubject;
import cn.imcompany.subject.StockSubject;
import org.junit.Test;

public class StockTest {

    @Test
    public void testStock() {

        StockSubject subject = new ConcreteStockSubject();
        Investor system = new ConcreteInvestor("system");

        Investor lzp = new ConcreteInvestor("lzp");
        Investor zmm = new ConcreteInvestor("zmm");
        subject.attach(lzp);
        subject.attach(zmm);

        system.seeUp(subject);

        subject.setPrice(51);
        system.seeUp(subject);

        subject.dettach(lzp);

        subject.setPrice(100);
        system.seeUp(subject);
    }
}
