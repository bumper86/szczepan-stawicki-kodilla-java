package com.kodilla.good.patterns.food2door;

public class OrderProcessor {
        private OrderService orderService;

        public OrderProcessor(final OrderService orderService) {
            this.orderService = orderService;
        }

        public OrderDto process(final OrderRequest orderRequest) {
            boolean isOrder = orderService.order(orderRequest.getProduct(), orderRequest.getQuantity(), orderRequest.getProducent());

            if(isOrder) {
                return new OrderDto(orderRequest.getProduct(), true);
            } else {
                return new OrderDto(orderRequest.getProduct(), false);
            }
        }
}
