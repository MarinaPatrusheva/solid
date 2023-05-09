package org.example;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Purchase> purchases = new ArrayList<>();
    public void addPurchase(String title, int count){
        if(!checkContainPurchase(title)) {
            purchases.add(new Purchase(title, count));
        }else{
            addCount(title, count);
        }
    }
    public ArrayList<Purchase> getPurchases(){
        return purchases;
    }
    private boolean checkContainPurchase(String title){
        for(int i = 0; i < purchases.size(); i++){
            if(purchases.get(i).getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }
    private void addCount(String title, int count){
        for(int i = 0; i < purchases.size(); i++){
            if(purchases.get(i).getTitle().equals(title)){
                purchases.get(i).setCount(purchases.get(i).getCount() + count);
            }
        }
    }

}
