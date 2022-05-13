package com.jackyzeng.structure.db.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseDto extends PageQuery implements Serializable {

    private String creator;

    private String updater;

    private Date startDate;

    private Date endDate;
}
