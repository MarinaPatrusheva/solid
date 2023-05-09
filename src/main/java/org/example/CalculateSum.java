package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class CalculateSum implements Calculate{

    @Override
    public int calculate(ArrayList<Purchase> purchases, HashMap<String, Integer> map) {
        int count = 0;
        for(int i = 0; i < purchases.size(); i++){
            count += purchases.get(i).getCount() * map.get(purchases.get(i).getTitle());
        }
        return count;
    }
    public int calculateByPurchase(ArrayList<Purchase> purchases, HashMap<String, Integer> map, String title){
        int count = 0;
        for(int i = 0; i < purchases.size(); i ++){
            if(purchases.get(i).getTitle().equals(title)){
                count += purchases.get(i).getCount() * map.get(title);
            }
        }
        return count;
    }
}
