package com.mycompany.lab08;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    
    public static void main(String[] args){
        
        ArrayList<Camera> cameras = new ArrayList();
        
        try{
            File myFile = new File("C:\\Users\\Ethan\\Documents\\NetBeansProjects\\lab08\\src\\main\\java\\com\\mycompany\\lab08\\data.txt");
            Scanner fileScanner = new Scanner(myFile);
            
            while(fileScanner.hasNextLine()){
                String cameraRow = fileScanner.nextLine();
                String[] cameraProperties = cameraRow.split(",");
                cameras.add(
                        new Camera(
                            cameraProperties[0],
                            cameraProperties[1],
                            cameraProperties[2],
                            cameraProperties[3],
                            Double.valueOf(cameraProperties[4]),
                            Double.valueOf(cameraProperties[5]))
                    );
            }
            
        }catch(Exception e){
            System.out.println("Error occurred...");
            System.out.println("Error message: " + e.getMessage());
            e.printStackTrace();
        }
        
        // System.out.println(cameras.get(47).getLongitude());
        cameras.get(10).display();
    }
    
}
