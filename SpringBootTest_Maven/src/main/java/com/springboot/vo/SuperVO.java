package com.springboot.vo;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;

/**
 * 基类 该类作为父类但不生成 Created by Administrator on 2017/11/10.
 *
 * @author liushiquan
 */

public class SuperVO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 创建时间
     */

    private Date createTime = new Date();

    /**
     * 修改时间
     */
    private Date modifiedTime;

    private Date ts;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 修改人
     */
    private String modifier;


    private String tenantId;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }


    private void getField(Class clazz, List<Field> list) {
        if (clazz.isInstance(SuperVO.class))
            return;
        Field[] fields = clazz.getDeclaredFields();
        if (fields != null && fields.length > 0)
            for (Field field : fields) {
                list.add(field);
            }
        getField(clazz.getSuperclass(), list);
    }

    public void get11(){
        System.out.println("super");
    }
}
