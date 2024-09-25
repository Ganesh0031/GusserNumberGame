package Array;

import java.util.Scanner;

class Guesser{
    int num;
    int Guessthenum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Gueeser number");
        num= sc.nextInt();
        return num;
    }
        }
class Player{
    int num1;
    int Guessthenum1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Your number");
        num1= sc.nextInt();
        return num1;
    }
}
class Umpire{
    int GusserFromnumber;
    int player1;
    int player2;
    int player3;
    int player4;
    void collectNumFromGuesser(){
    Guesser g=new Guesser();
    GusserFromnumber=g.Guessthenum();
    }
    void collectNumFromPlayer(){
        Player p=new Player();
        player1=p.Guessthenum1();
        player2=p.Guessthenum1();
        player3=p.Guessthenum1();
        player4=p.Guessthenum1();
    }
    void compaireNumber(){
        if(player1==GusserFromnumber){
            if(player2==GusserFromnumber && player3==GusserFromnumber && player4 ==GusserFromnumber){
                System.out.println("Win all the player");
            }
            else if(player2!=GusserFromnumber && player3==GusserFromnumber && player4 ==GusserFromnumber) {
                System.out.println("player1 player3 and player4 won");
            }
            else if(player2==GusserFromnumber && player3!=GusserFromnumber && player4 ==GusserFromnumber) {
                System.out.println("player1 player2 and player4 won");
            }
            else if(player2==GusserFromnumber && player3==GusserFromnumber && player4 !=GusserFromnumber) {
                System.out.println("player1 player2 and player4 won");
            }
            else if(player2==GusserFromnumber && player3!=GusserFromnumber && player4 !=GusserFromnumber) {
                System.out.println("player1 and player2 won");
            }
            else if(player2!=GusserFromnumber && player3!=GusserFromnumber && player4==GusserFromnumber) {
                System.out.println("player1 and player4 won");
            }
            else if(player2!=GusserFromnumber && player3==GusserFromnumber && player4!=GusserFromnumber) {
                System.out.println("player1 and player3 won");
            }
            else{
                System.out.println("player1 won the match");
            }
        }
        if(player2==GusserFromnumber){
            if(player1==GusserFromnumber && player3==GusserFromnumber && player4 ==GusserFromnumber){
                System.out.println("Win all the player");
            }
            else if(player1!=GusserFromnumber && player3==GusserFromnumber && player4 ==GusserFromnumber) {
                System.out.println("player2 player3 and player4 won");
            }
            else if(player1==GusserFromnumber && player3!=GusserFromnumber && player4 ==GusserFromnumber) {
                System.out.println("player2 player2 and player4 won");
            }
            else if(player1==GusserFromnumber && player3==GusserFromnumber && player4 !=GusserFromnumber) {
                System.out.println("player2 player2 and player4 won");
            }
            else if(player1==GusserFromnumber && player3!=GusserFromnumber && player4 !=GusserFromnumber) {
                System.out.println("player2 and player2 won");
            }
            else if(player1!=GusserFromnumber && player3!=GusserFromnumber && player4==GusserFromnumber) {
                System.out.println("player2 and player4 won");
            }
            else if(player1!=GusserFromnumber && player3==GusserFromnumber && player4!=GusserFromnumber) {
                System.out.println("player2 and player3 won");
            }
            else{
                System.out.println("player2 won the match");
            }
        }
        if(player3==GusserFromnumber){
            if(player1==GusserFromnumber && player2==GusserFromnumber && player4 ==GusserFromnumber){
                System.out.println("Win all the player");
            }
            else if(player1!=GusserFromnumber && player2==GusserFromnumber && player4 ==GusserFromnumber) {
                System.out.println("player3 player2 and player4 won");
            }
            else if(player1==GusserFromnumber && player2!=GusserFromnumber && player4 ==GusserFromnumber) {
                System.out.println("player2 player3 and player4 won");
            }
            else if(player1==GusserFromnumber && player2==GusserFromnumber && player4 !=GusserFromnumber) {
                System.out.println("player1 player2 and player3 won");
            }
            else if(player1==GusserFromnumber && player2!=GusserFromnumber && player4 !=GusserFromnumber) {
                System.out.println("player1 and player3 won");
            }
            else if(player1!=GusserFromnumber && player2!=GusserFromnumber && player4==GusserFromnumber) {
                System.out.println("player3 and player4 won");
            }
            else if(player1!=GusserFromnumber && player2==GusserFromnumber && player4!=GusserFromnumber) {
                System.out.println("player2 and player3 won");
            }
            else{
                System.out.println("player2 won the match");
            }
        }
        if(player4==GusserFromnumber){
            if(player1==GusserFromnumber && player2==GusserFromnumber && player3 ==GusserFromnumber){
                System.out.println("Win all the player");
            }
            else if(player1!=GusserFromnumber && player2==GusserFromnumber && player3 ==GusserFromnumber) {
                System.out.println("player2 player3 and player4 won");
            }
            else if(player1==GusserFromnumber && player2!=GusserFromnumber && player3 ==GusserFromnumber) {
                System.out.println("player1 player3 and player4 won");
            }
            else if(player1==GusserFromnumber && player2==GusserFromnumber && player3 !=GusserFromnumber) {
                System.out.println("player1 player2 and player4 won");
            }
            else if(player1==GusserFromnumber && player2!=GusserFromnumber && player3!=GusserFromnumber) {
                System.out.println("player1 and player4 won");
            }
            else if(player1!=GusserFromnumber && player2!=GusserFromnumber && player3==GusserFromnumber) {
                System.out.println("player3 and player4 won");
            }
            else if(player1!=GusserFromnumber && player2==GusserFromnumber && player3!=GusserFromnumber) {
                System.out.println("player2 and player4 won");
            }
            else{
                System.out.println("player4 won the match");
            }
        }
    }

}

public class GusserGame {
    public static void main(String[] args) {
        Guesser g=new Guesser();
        Player p=new Player();
        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compaireNumber();
    }

}
