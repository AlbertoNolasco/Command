/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;
import java.util.ArrayList;
import java.util.List;
import command.*;

/**
 *
 * @author oux_xd
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();
    
    public void takeOrder(Order order){
      orderList.add(order);		
   }

   public void placeOrders(){
   
      for (Order order : orderList) {
         order.execute();
      }
      orderList.clear();
   }
    
    
    
}
