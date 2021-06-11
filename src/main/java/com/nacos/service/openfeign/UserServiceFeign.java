package com.nacos.service.openfeign;

import com.nacos.api.UserService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("nacos-a")
public interface UserServiceFeign extends UserService {
}
