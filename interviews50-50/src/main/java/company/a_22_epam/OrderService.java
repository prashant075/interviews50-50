package company.a_22_epam;

import java.util.List;
import java.util.stream.Collectors;


public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(){}
    public OrderService(OrderRepository orderRepository){
        this.orderRepository =orderRepository;
    }

    public List<Order> findOrdersByTypeAndNickNameThenSortById(String type, String nickNameMatches) {
        /**
         Implement this method which will filter of “type” orders and matches with nickNameMatches
         Sorted by Order ID.
         */
        List<Order> orderList = orderRepository.getOrders();
        List<Order> filterOrder= orderList.stream().
                filter(object->object.getType().equals(type) && object.getNickName().contains(nickNameMatches)).sorted((o1, o2) -> o1.getId().compareTo(o2.getId())).
                collect(Collectors.toList());

        return null;
    }

//    public int[][] magicSquare(int number) {
//    int[][] dp = new int[3][3];
//    /*
//    * 1 2 3
//    * 4 5 6
//    * 7 8 9
//    *
//    * {8, 1, 6},
//	{3, 5, 7},
//	{4, 9, 2}
//492
//357
//816
//
//
//    * */
//    }


}
