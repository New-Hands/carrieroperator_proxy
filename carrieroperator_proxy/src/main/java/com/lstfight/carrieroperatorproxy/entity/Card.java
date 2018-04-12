package com.lstfight.carrieroperatorproxy.entity;

import lombok.*;

/**
 * @author lst
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Card {
    private int id;
    private int cardNumber;
    private int poolId;
    private int ownerId;
    private double usedAmount;
    private int currentPackId;
    private int status;
    private int type;
}
