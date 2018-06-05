package com.springboot;

import com.yonyou.uap.tenant.service.itf.ITenantRoleService;
import com.yonyou.uap.tenantauth.entity.TenantRole;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @auther zhangchy
 * @create 2018/5/21
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ApplictionBootApplication.class})
public class ITenantRoleServiceTest {

    @Autowired
    private ITenantRoleService iTenantRoleService;

    @Test
    public void getRolesPage(){
        String tenantId = "";
        String sysCode = "";
        boolean onlySysRole = false;
        String roleName = "";
        int pageNum = 1;
        int pageSize  =2;

        Page<TenantRole> rolesPage = iTenantRoleService.getRolesPage(tenantId, sysCode, onlySysRole, roleName, pageNum, pageSize, null, null);
        System.out.println(rolesPage);

    }


}
