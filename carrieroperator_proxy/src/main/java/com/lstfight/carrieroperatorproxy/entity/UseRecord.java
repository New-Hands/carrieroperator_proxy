package com.lstfight.carrieroperatorproxy.entity;

import lombok.*;

import java.sql.Timestamp;

/**
 * @author lst
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UseRecord {
    private int id;
    private int cardId;
    private Timestamp usedTime;
    private double usedAmount;
    private int status;
}
