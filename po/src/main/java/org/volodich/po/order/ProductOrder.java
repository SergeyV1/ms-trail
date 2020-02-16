package org.volodich.po.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Data
@AllArgsConstructor
public class ProductOrder {
    @Id
    private String id;
    private String specificationId;
    private Long quantity;
}
