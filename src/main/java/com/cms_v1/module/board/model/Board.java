package com.cms_v1.module.board.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Board {

    @Id
    private int boardSeq;
    private String title;
    private String contents;
    @CreationTimestamp
    private Date regDate;

}
