package org.volodich.po.order.clients;

import org.volodich.po.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "spring-cloud-client-pc", configuration = FeignConfiguration.class)
public interface ProductSpecificationRepository {

    @RequestMapping(method = RequestMethod.GET, path = "/catalog/{specificationId}")
    Object existsById(@PathVariable("specificationId") String specificationId);
}
