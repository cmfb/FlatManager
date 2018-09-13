package Services;

import Pojo.Renter;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

import static org.junit.Assert.*;

public class RenterServicesTest {

    @Test
    public void insertRenterService() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_service.xml");
        RenterServices renterServices = (RenterServices) context.getBean("renterServices");
        Renter renter = new Renter();
        renter.setName("约翰");
        renter.setPhonenum("5863145");
        renter.setSex(1);
        renter.setNativeplace("埃及");
        renter.setIdcard("111111111111");
        renter.setCreatetime(new Date());
        renter.setLastmodifiedtime(new Date());

        renterServices.insertRenterService(renter);

        System.out.println("test git");
    }
}