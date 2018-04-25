package com.springboot.vo;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by liushiquan on 2018/2/5.
 */


public class TeamConfigVO extends SuperVO {

    /**
     * 全员允许
     */
    public static final String PERMISSION_ALLOW = "1";

    /**
     * 全员禁止邀请
     */
    public static final String PERMISSION_FORBID = "2";

    /**
     * 只有管理员可邀请
     */
    public static final String PERMISSION_ADMIN_ALLOW = "0";

    public static final String TERMINAL_WEB = "web";

    public static final String TERMINAL_PHONE = "mobile";


    /**
     * 团队名称
     */
    private String tenantName;

    /**
     * 头像
     */
    private String logo;

    private String linkman;

    private String tenantAddress;

    private String tenantEmail;

    private String tenantIndustry;

    private String tenantTel;

    /**
     * 邀请成员权限 0-只有管理员可邀请，1-全部成员可邀请，2-禁止邀请',
     */
    private String invitePermission = PERMISSION_ALLOW;

    /**
     * 加入权限  0-开放,所有用户都可以加入，1禁止加入'
     */
    private String joinPermission = "0";

    /**
     * 允许用户退出空间，默认false  0:禁止;1:允许;
     */
    private String allowExit = "0";

    /**
     * 团队规模
     * A:0－50，B:51-100，C:101-200，D:201-500，E:501-1000，F:1001－2000，G:>2000人
     */
    private String tenantSize = "A";

    /**
     * 终端类型  取值web/mobile   默认值web
     */
    private String terminal = TERMINAL_WEB;


    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getTenantSize() {
        return tenantSize;
    }

    public void setTenantSize(String tenantSize) {
        this.tenantSize = tenantSize;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getInvitePermission() {
        return invitePermission;
    }

    public void setInvitePermission(String invitePermission) {
        this.invitePermission = invitePermission;
    }

    public String getJoinPermission() {
        return joinPermission;
    }

    public void setJoinPermission(String joinPermission) {
        this.joinPermission = joinPermission;
    }

    public String getAllowExit() {
        return allowExit;
    }

    public void setAllowExit(String allowExit) {
        this.allowExit = allowExit;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getTenantAddress() {
        return tenantAddress;
    }

    public void setTenantAddress(String tenantAddress) {
        this.tenantAddress = tenantAddress;
    }

    public String getTenantEmail() {
        return tenantEmail;
    }

    public void setTenantEmail(String tenantEmail) {
        this.tenantEmail = tenantEmail;
    }

    public String getTenantIndustry() {
        return tenantIndustry;
    }

    public void setTenantIndustry(String tenantIndustry) {
        this.tenantIndustry = tenantIndustry;
    }

    public String getTenantTel() {
        return tenantTel;
    }

    public void setTenantTel(String tenantTel) {
        this.tenantTel = tenantTel;
    }

    public void get11() {
        System.out.println("kid");
    }
}
