package com.zkq.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class ApplicationRecord {
    @TableId(value = "record_id",type = IdType.ASSIGN_ID)
    private Integer recordId;
    private Integer plantId;
    private String plantName;
    private double price;
    private String time;
    private String employeeName;
    private Integer isAllowed;
    private Integer quantity;

}