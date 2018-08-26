//package com.springboot;
//
//import com.yonyou.diwork.exception.BusinessException;
//import com.yonyou.diwork.service.IApplicationService;
//import com.yonyou.workbench.dto.ApplicationDTO;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
///**
// * @auther zhangchy
// * @create 2018/5/31
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class ApplicationCreateTest {
//
//    @Autowired
//    private IApplicationService applicationService;
//
//
//    @Test
//    public void aa()throws Exception{
//        ApplicationDTO applicationDTO = new ApplicationDTO();
//        String tenantId = "q9bl10bo";
//        String userId = "06da4854-17fe-41dd-b53c-cbe700927472";
//        applicationDTO.setTenantId(tenantId);
//        applicationDTO.setPrimitive(false);
//        applicationDTO.setIosParam("asdf");
//        applicationDTO.setApplicationName("rpc3加");
//        applicationDTO.setApplicationIcon("https://cdn.yonyoucloud.com/pro/workbench/%E6%9F%A5%E5%B7%A5%E8%B5%84.png");
//        applicationDTO.setEveryone(true);
//        applicationDTO.setWebStatus(true);
////        applicationDTO.setClientUrl("http://www.baidu.com");
////        applicationDTO.setClientStatus(true);
//        applicationDTO.setPhoneStatus(true);
//        applicationDTO.setPhoneUrl("http://www.baidu.com");
//        applicationDTO.setPrimitive(false);
//        applicationDTO.setSummerPackageId("123");
//        applicationDTO.setWebUrl("http://www.baidu.com");
//        applicationDTO.setPhoneUrl("http://www.baidu.com");
//        applicationDTO.setLabelTypeId("80360ef3-c4d6-4957-92da-23bb1c1d9037");
//        ApplicationDTO applicationVO = (ApplicationDTO)applicationService.create(applicationDTO, tenantId, userId);
//        System.out.println(1111);
//
//    }
//}
