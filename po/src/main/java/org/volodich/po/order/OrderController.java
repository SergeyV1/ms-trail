package org.volodich.po.order;

import org.volodich.po.order.clients.ProductSpecificationRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {
    private final ProductOrderRepository orderRepository;
    private final ProductSpecificationRepository specificationRepository;

    public OrderController(ProductOrderRepository orderRepository, ProductSpecificationRepository specificationRepository) {
        this.orderRepository = orderRepository;
        this.specificationRepository = specificationRepository;
    }

    @PutMapping("/catalog/{specificationId}/order")
    public ProductOrder orderProductBySpecificationId(@PathVariable String specificationId) {
        if (specificationRepository.existsById(specificationId) == null) {
            throw new RuntimeException("There is no product specification with Id: " + specificationId);
        }
        return orderRepository.save(new ProductOrder(null, specificationId, 1l));
    }
}
