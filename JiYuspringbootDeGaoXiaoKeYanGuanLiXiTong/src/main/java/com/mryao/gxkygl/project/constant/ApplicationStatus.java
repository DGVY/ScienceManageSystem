package com.mryao.gxkygl.project.constant;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/31 9:28
 * @Description: 申请的状态
 * @Version: 1.0
 */
public enum ApplicationStatus {

    ON_APPLIACTION(0,"申报中"),

    FAIL_APPLICATION(1,"申报失败"),

    SUCCESS_APPLICATION(2,"申报成功"),
    ;
    private int code;

    private String name;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ApplicationStatus(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public static ApplicationStatus getByName(String name){
        ApplicationStatus[] values = values();
        for(ApplicationStatus applicationStatus : values){
            if(name.equals(applicationStatus.getName())){
                return applicationStatus;
            }
        }
        return ApplicationStatus.ON_APPLIACTION;
    }

    public static ApplicationStatus getByCode(int code){
        ApplicationStatus[] values = values();
        for(ApplicationStatus applicationStatus : values){
            if(code == applicationStatus.getCode()){
                return applicationStatus;
            }
        }
        return ApplicationStatus.ON_APPLIACTION;
    }
}
