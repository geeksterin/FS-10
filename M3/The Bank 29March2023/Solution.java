import java.io.*;
import java.util.*;

class Account{
    String name;
    int bal;
    Account(String name){
        this.name = name;
        this.bal = 0;
    }
    void printInfo(){
        System.out.println(name + " " + bal);
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<String, Account> hm = new HashMap<>();
        
        while(true){
            String s = scn.nextLine();
            String [] input = s.split(" ");
            
            String operation = input[0];
            if(operation.equals("0")){
                break;
            }
            else if(operation.equals("CREATE")){
                String id = input[1];
                String name = input[2];
                // Account acc = new Account(name);
                // hm.put(id, acc);
                hm.put(id, new Account(name));
                
            }
            // WITHDRAW ACC001 1000
            else if(operation.equals("WITHDRAW")){
                String id = input[1];
                int val = Integer.parseInt(input[2]);
                hm.get(id).bal -= val;
            }
            else if(operation.equals("DEPOSIT")){
                String id = input[1];
                int val = Integer.parseInt(input[2]);
                hm.get(id).bal += val;
            }
            // BALANCE ACC001 
            else if(operation.equals("BALANCE")){
                String id = input[1];
                hm.get(id).printInfo();
            }
            
            
        }
    }
}