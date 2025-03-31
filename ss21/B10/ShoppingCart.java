package ss21.B10;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<Integer,CartItem> mapCart = new HashMap<>();
    // public ShoppingCart(){
    //     mapCart 
    // }
    
    public void addToCart(Product product){
        if(mapCart.containsKey(product.getId())){
            mapCart.get(product.getId()).increaseQuantity();
        }else{
            mapCart.put(product.getId(), new CartItem(product,1));
        }
      

    }
    public void displayCart(){
        for(Map.Entry<Integer,CartItem> entry : mapCart.entrySet()){
            System.out.println(entry.getValue().getProduct().getName()+" X " + entry.getValue().getQuantity());
        }
    }
    public void removeFromCart(int removeId){
if(mapCart.remove(removeId)==null || removeId<0){
    throw new IllegalArgumentException("loi ko tim thay sp trong cua hang ");
}


    }
    public void checkout(){
        double sum=0;
        // System.out.println(sum);
        for(CartItem prd : mapCart.values()){
          sum+=  prd.getProduct().getPrice() * prd.getQuantity();
        }
        System.out.println("tong tien "+ sum);
    }
}