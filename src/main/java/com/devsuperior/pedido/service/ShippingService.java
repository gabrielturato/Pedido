package com.devsuperior.pedido.service;

import com.devsuperior.pedido.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

   public Double shipment(Order order){
        if(order.getBasic() < 100.0){
            return 20.00;
        } else if (order.getBasic() >= 100.0 && order.getBasic() < 200.0) {
            return 12.00;
        }else{
            return 0.0;
        }
    }
}
