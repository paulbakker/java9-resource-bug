package consumer;


import java.io.IOException;
//import org.hibernate.boot.jaxb.internal.stax.LocalSchemaLocator;
import tester.ResourceLoader;
public class Consumer {
    public static void main(String[] args) throws IOException {
        new ResourceLoader().loadResource();

     //   LocalSchemaLocator.resolveLocalSchemaUrl("org/hibernate/jpa/orm_2_0.xsd");

    }
}
