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
        int userSelect = input.nextInt();
        user1.setGenre(user1.genres[userSelect]);
        System.out.println("Your user profile is created successfully.");
        System.out.println(user1.getUserID()+" "+user1.getGenre());
        
    }
}
