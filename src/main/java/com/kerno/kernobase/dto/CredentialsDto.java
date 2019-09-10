package com.kerno.kernobase.dto;

import lombok.Data;

@Data
public class CredentialsDto {
    private String subject;
    private String accountId;
    private boolean isSuperUser;

    public CredentialsDto(String subject, String accountId, boolean isSuperUser) {
        this.accountId = accountId;
        this.isSuperUser = isSuperUser;
        this.subject = subject;
    }
}
