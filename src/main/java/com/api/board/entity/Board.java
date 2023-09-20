package com.api.board.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "board")
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@RequiredArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long docNo;

    @Column
    private final String title;

    @Column
    private final String writer;

    @Column
    private final String regDttm;

    @Column
    private final int view;

    @Column
    private final int reply;
}
