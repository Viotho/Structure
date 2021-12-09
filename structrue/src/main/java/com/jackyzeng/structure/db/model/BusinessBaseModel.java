package com.jackyzeng.structure.db.model;

import com.jackyzeng.structure.db.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessBaseModel extends BaseModel {

    /**
     * 
     */
    private static final long serialVersionUID = 4994528450626394608L;
    
    private String code;
    
    private String name;
    
    private String description;

}
