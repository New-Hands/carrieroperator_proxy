package com.lstfight.carrieroperatorproxy.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author lst
 * Created on 2018/5/6.
 */
@AllArgsConstructor
@NoArgsConstructor
public class JobRow {
    @Getter
    @Setter
    private String jobName;

    @Getter
    @Setter
    private String JobGroup;

    @Getter
    @Setter
    private String state;

    @Getter
    @Setter
    private String description;
}
