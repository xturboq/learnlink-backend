package com.zecola.learnlink.model.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class TeamQuitRequest implements Serializable {

    private static final long serialVersionUID = 5341409665416510156L;

    /**
     * id
     */
    private Long teamId;
}
