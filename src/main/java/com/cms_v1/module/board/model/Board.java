package com.cms_v1.module.board.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Board {

    @Id
    @Column(name = "boardNm")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int boardNm;
    private String title;
    private String contents;
    @CreationTimestamp
    private Date regDate;

}
