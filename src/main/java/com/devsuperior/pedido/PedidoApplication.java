package com.devsuperior.pedido;

import com.devsuperior.pedido.entities.Order;
import com.devsuperior.pedido.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PedidoApplication implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(PedidoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1034,150.00,20.0);
		Order order2 = new Order(2282,800.00,10.0);
		Order order3 = new Order(1309,95.90,0.0);

		System.out.println("--- Order 1 ---");
		System.out.printf("Pedido código %d \n",order1.getCode());
		System.out.printf("Valor total: %.2f \n",orderService.total(order1));
		System.out.println("--- Order 2 ---");
		System.out.printf("Pedido código %d \n",order2.getCode());
		System.out.printf("Valor total: %.2f \n",orderService.total(order2));
		System.out.println("--- Order 3 ---");
		System.out.printf("Pedido código %d \n",order3.getCode());
		System.out.printf("Valor total: %.2f \n",orderService.total(order3));
	}
}
