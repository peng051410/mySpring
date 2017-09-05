package cn.imcompany;

import cn.imcompany.annotation.MyComponent;
import cn.imcompany.model.MyEntity2;
import org.atteo.classindex.ClassIndex;
import org.junit.Test;

public class MyClassIndexTest {

    @Test
    public void testMyEntity() throws Exception {

        for (Class<?> aClass : ClassIndex.getAnnotated(MyComponent.class)) {
            System.out.println(aClass.getName());
        }

        System.out.println("------------------------------------------------------------------------------------");

        String name = MyEntity2.class.getPackage().getName();
        for (Class<?> aClass : ClassIndex.getPackageClasses(name)) {
            System.out.println(aClass.getName());
        }
        System.out.println("------------------------------------------------------------------------------------");

       /* MyEntity2 myEntity2 = new MyEntity2();

        JAXBContext jaxbContext = JAXBContext.newInstance(MyEntity2.class);
        Marshaller marshaller = jaxbContext.createMarshaller();

        new File("");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(myEntity2, System.out);*/

        for (Class<?> aClass : ClassIndex.getPackageClasses("cn.imcompany.model")) {
            System.out.println(aClass.getName());
        }

    }
}
