/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fruitshop;

/**
 *
 * @author Nguyen Minh Duc
 */
public class Main {
    public static void main (String[] args){
        Menu mn = new Menu();
        mn.add("1. Create fruit");
        mn.add("2. View orders");
        mn.add("3. Shopping (for buyer)");
        mn.add("4. Exit");
        int userChoice;
        do{
            mn.print();
            userChoice = mn.getUserChoices();
            switch(userChoice){
                case 1:
                    MnFruitShop.createProduct();
                    break;
                case 2:
                    MnFruitShop.viewOrder();
                    break;
                case 3:
                    MnFruitShop.shopping();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while(true);
    }
}