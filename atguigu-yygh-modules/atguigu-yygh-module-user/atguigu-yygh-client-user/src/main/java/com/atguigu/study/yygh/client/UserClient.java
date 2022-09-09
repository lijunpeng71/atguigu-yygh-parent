package com.atguigu.study.yygh.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;

/**
 * @author lijunpeng
 */
@FeignClient(value = "atguigu-yygh-service-user")
@Repository
public interface UserClient {
}
