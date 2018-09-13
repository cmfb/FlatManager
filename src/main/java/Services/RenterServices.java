package Services;

import Dao.RenterMapper;
import Pojo.Renter;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author:lin
 * @description:
 * @date:2018/9/7
 * @packageName: Services
 * @projectName: FlatManager
 */
@Service
public class RenterServices {
    @Resource
    RenterMapper renterMapper;
//    @Transactional
    public void insertRenterService(Renter renter) {
        int insert1 = renterMapper.insertSelective(renter);
//        System.out.println(1/0);
        int insert2 = renterMapper.insertSelective(renter);
        System.out.println(insert1+"   "+insert2);
//        主分支修改1.1
    }
}

