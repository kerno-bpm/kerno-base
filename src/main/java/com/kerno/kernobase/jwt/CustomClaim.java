package com.kerno.kernobase.jwt;

import lombok.Data;

@Data
public class CustomClaim {
    private String accountId;
    private boolean isSuperUser;
}
