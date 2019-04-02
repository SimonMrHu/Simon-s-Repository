package com.simon.home.biz.common.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {


    static final long serialVersionUID = 20190227L;

    /**
     * 自增ID
     */
    @Column(name = "ID",insertable = false,updatable = false)
    private Long id;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_DATETIME")
    private @NotNull @CreatedDate Date createDatetime;

    /**
     * 最后更新时间
     */
    @Column(name = "LAST_MODIFIED_DATETIME")
    private @NotNull @LastModifiedDate Date lastModifiedDatetime;
}
