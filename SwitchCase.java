/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class10;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SwitchCase {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        System.out.println("Enter any number:");
        int day=user_input.nextInt();
        
        //day=5 input(int())
        
        switch(day){
            case 1:
                System.out.println("sat day");
                break;
            case 2:
                System.out.println("sun day");
                break;
            case 3:
                System.out.println("Mon day");
                break;
            case 4:
                System.out.println("Tue day");
                break;
            case 5:
                System.out.println("Tus day");
                break;
            case 6:
                System.out.println("Wed day");
                break;
            case 7:
                System.out.println("Fir day");
                break;
            default:
                System.out.println("day is not found");
            
        }
        
        
    }
}
