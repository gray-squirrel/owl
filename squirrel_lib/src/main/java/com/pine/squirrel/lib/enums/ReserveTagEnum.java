package com.pine.squirrel.lib.enums;

/**
 * @author 赵松
 * @date 2020/2/18
 * 保留的标签信息
 */
public enum ReserveTagEnum {

    /**
     * 采集时间
     */
    COLLECT_TIME("collect_time"),


    /**
     * 采集数据
     */
    COLLECT_DATA("collect_data"),


    /**
     * kafka的元信息
     */
    KAFMA_META("kafka_meta"),



    /**
     * 采集项ID
     */
    COLLECT_ID("collect_id");


    private String code;

    ReserveTagEnum(String code){
        this.code=code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
