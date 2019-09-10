package com.kerno.kernobase.eureka;


public interface BaseEurekaService {

    String getEndpoint(InstanceInfoDto instanceInfo, String url);
}
