/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Juntong
 */
public class TestUserprofile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a username: ");
        String username = input.nextLine();
        UserProfile user1 = new UserProfile(username,"");
        System.out.println("Please Select a genre: ");
        for(int i=0;i<user1.genres.length;i++){
            System.out.println((i+1)+" "+user1.genres[i]);
        }
        boolean successful = true;
        try{
            int userSelect = input.nextInt();
            if(userSelect>=1 && userSelect<=4){
                user1.setGenre(user1.genres[userSelect-1]);
            }else{
                System.out.println("Invalid input");
                successful = false;
            }
        }catch(Exception e){
            System.out.println("Invalid input");
            successful = false;
        }
        if(successful){
            System.out.println("Your user profile is created successfully.");
            System.out.println(user1.getUserID()+"  "+user1.getGenre());
        }else{
            System.out.println("User profiled failed to create.");
            user1 = null;
        }
    }
}
