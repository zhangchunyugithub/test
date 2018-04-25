package com.springboot.util;

import com.google.common.collect.Lists;
import com.yonyou.workbench.model.ServiceVO;
import org.junit.Test;

import java.io.StringWriter;
import java.util.*;

/**
 * @auther zhangchy
 * @create 2018/3/22
 */
public class IoUtils {

    @Test
    public void test() {
        StringWriter writer = new StringWriter();
        writer.append("sss");
        System.out.println(writer.toString());
        writer.getBuffer().setLength(0);
        writer.append("bbb");
        System.out.println(writer.toString());
    }

    @Test
    public void test1() {
        ServiceVO serviceVO1 = new ServiceVO();
        serviceVO1.setServiceCode("XTDONGTAI0002");
        ServiceVO serviceVO2 = new ServiceVO();
        serviceVO2.setServiceCode("XTDONGTAI0003");
        ServiceVO serviceVO3 = new ServiceVO();
        serviceVO3.setServiceCode("XTDONGTAI0001");
        ServiceVO serviceVO4 = new ServiceVO();
        ServiceVO serviceVO5 = new ServiceVO();
        serviceVO5.setServiceCode("XTQUANYI0001");
        serviceVO4.setServiceCode("XTHUATI00000000000");
        List<ServiceVO> services = Lists.newArrayList(serviceVO1, serviceVO2, serviceVO3, serviceVO4, serviceVO5);
        services.forEach(service -> {
            System.out.print(service.getServiceCode()+" ");

        });
        Collections.sort(services, new Comparator<ServiceVO>() {
            @Override
            public int compare(ServiceVO o1, ServiceVO o2) {

                return o1.getServiceCode().compareTo(o2.getServiceCode());
                //return o1.getServiceCode().getBytes() - o2.getServiceCode().getBytes();
               /* Set<String> sets = new HashSet<>();
                sets.add(o1.getServiceCode());
                sets.add(o2.getServiceCode());
                if (sets.size() == 1)
                    return 0;
                String set = sets.iterator().next();
                if (set.equals(o1.getServiceCode()))
                    return -1;
                else
                    return 1;*/
            }
        });
        System.out.println("===============");
        services.forEach(service -> {
            System.out.print(service.getServiceCode()+" ");

        });
    }


    @Test
    public void test2(){
        String a = "a";
        String b = "b";

    }
}
