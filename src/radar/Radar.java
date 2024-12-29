/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package radar;

import java.util.Scanner;

public class Radar {

    
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        
        System.out.println("Enter the vehicle speed (km/h)");
        double speed_vehicle = scanner.nextDouble();
        
        System.out.println("Enter the maximum speed allowed (km/h)");
        double max_speed = scanner.nextDouble();
        
        double  max_speed_tolerance = 0;
        max_speed_tolerance = max_speed + (max_speed * 0.1) ;
        
        if( speed_vehicle > max_speed_tolerance){
            System.out.println("Fined!");
        } else {
            System.out.println("Ok!");
            
        }
        scanner.close();
        }
            
}
