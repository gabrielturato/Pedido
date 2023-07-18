package com.devsuperior.pedido.service;

import com.devsuperior.pedido.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public Double total(Order order){
        return (order.getBasic() - discountValue(order.getBasic(), order.getDiscount()))
                + shippingService.shipment(order) ;
    }

    private Double discountValue(Double basic,Double discount){
        return (basic * discount) / 100;
    }
}
