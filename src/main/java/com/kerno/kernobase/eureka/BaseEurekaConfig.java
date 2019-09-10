package com.kerno.kernobase.eureka;

import lombok.Data;

@Data
public class BaseEurekaConfig {
    private String serviceId;
    private String port;
}
