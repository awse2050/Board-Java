package com.multi.core.domains.board.entity;

import javax.persistence.*;

@Entity
@Table(name = "board", indexes = {@Index(columnList = "title", name = "idx_title")})
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 50)
    private String title;

}
