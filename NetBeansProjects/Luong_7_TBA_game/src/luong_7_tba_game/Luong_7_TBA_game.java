/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luong_7_tba_game;
    import java.util.Scanner;
    import java.util.Random;
/**
 *
 * @author mluong
 */
public class Luong_7_TBA_game {
    static String username;//name of player
    static String enter;//enter keystroke
    static String strings; // used to reply when the player fails a challenge
    static String fdoor;//door number for challenge 1
    static String direction;//direction that player would take in challenge 1
    static String answer; // this is used to let the player respond to yes and no questions
    static String attack;//types of attacks that can be used
    static Random arenafight_r = new Random ();//this will randomly select different leveled monkeys in red portal version
    static Random arenafight_y = new Random ();//this wil randomly select different leveld monkeys in yellow portal version
    static Random naga = new Random (); // this will randomly select different types of attacks that your friend will use
    static Random boss = new Random (); // this will ramdomly select the different types of attacks the boss will do
    static Random pick = new Random (); //this is the player's luck...will the player be able to hit the monster or not
    static Random miss = new Random (); //This is used tp determine whether certain attacks miss or hits the enemy/player/naga
    static int miss_choice; // These are the integers used to decide if the player hits or miss or the boss hits or misses
    static int naga_attacks; //this is the number that will indicate the different types of moves naga will use
    static int monsterchoices_y_r; //This is the numbers that will be selected in the random monster generator in yellow portal version
    static int playerhealth; //This is the players health that will change when they level up
    static int monsterhealth;//this is the monster's health for challenge 1...challenge 2 will be more complicated so I have to make another health bar
    static int nagahealth;//this is Naga's health for the final battle between good and bad. Naga was Kongo/Separt depends on the version
    static int bosshealth;// This is the evil witches health(the boss)
    static int boss_attacks;// This is the number that will parallel to the different types of attacks the boss will use
    static int which;//This number corresponds to the random pick, which will determine whether Naga or the player is hit
    static int zero = 0;//integer used later on to specify zero health, potions, etc...
    static int spiderhealth;// This is the enemy that you have to defeat when the random generator spits out number 1
    static int goblinshealth;// This is the second type of enemy the player can encounter in yellow portal version
    static int golbathealth;// This is the third type of enemy one can encounter as the player and Separt attempts to defeat 
    static int witchhealth;// This is the fourth type of enemy that one can encounter as the player battles in red/yellow portals
    static int ape;//this is the health of the first type of enemy that will be randomly generated in red portal version
    static int gorilla;//this is the health of the second type of enemy that a player could encounter in red portal version
    static int wolf1;//this is the health of one of the wolves in the wolf pack encountered in red portal version
    static int wolf2;//this is the health of one of the wolves in the wolf pack met in red portal version 
    static int wolf3;//this is the health of one of the wolves belonging to the wolf pack in red portal version
    static int snake;//this is the health of the fourth type of enemy that can be encountered in red portal version (snake)
    static Scanner responses  = new Scanner(System.in); //this is the scanner for all the responses in the game.
    static int potions = 5;//healing potions
    static boolean spells;
    static boolean door;// boolean to open the door and start the game
    static boolean gameplay;//boolean to keep the main game going and to end the game
    static boolean monsterisalive;// boolean to start, continue, and end while loops
    static boolean wolf1_alive;//this boolean will be used to identify whether or not wolf 1 is alive and will be able to attack
    static boolean wolf2_alive;//this boolean will be used to identify whether or not wolf 2 is alive and will be able to attack
    static boolean wolf3_alive;//this boolean will be used to identify whether or not wolf 3 is alive and will be able to attack
    static Scanner next = new Scanner(System.in); // this is used to let the player press the enter key to continue
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //play();//This method will start the 20 minute battle scene music
        gameplay = true;
        while(gameplay) {
        /*#extra credit made a separate class and music selector below:*/
        Luong_7_audioclass pl = new Luong_7_audioclass();//this is how to use classes, pl._ to start the methods
        pl.soundsystem_commands();//this is the object used to call upon the public method sound system
        intro();//starts the game       
        } 
    } 
                                         
    static void player_fights() { //method that introduces the fighting in challenge 1 of both versions
        monsterisalive = true;
        
            //#enemyobject
        /*The small creatures are one of the many enemies in this game. These small creatures tries to hinder 
          the player's growth by killing the player. There are also many traps that make the player go in a maze again.*/
        
        monsterhealth = 100; //this is a level one monster
        playerhealth = 200; //this is the player's maximum health

        do {//do while loops are similar to a while loop in that they continuously perform an action. Howver, do whiles
            //run at least once before checking the conditions
          
            if(monsterisalive = true){//oragnized to help create better view
                System.out.println("Use you spells to defeat your enemies...");
                System.out.println("Which attack do you want to use? Fire Spell, Ice Spell, or run");
                attack = next.nextLine();
                if(attack.contains("f")) {
            System.out.println(username + " uses his fire spell...FOOOSH!!!");
            enter = next.nextLine();
            System.out.println("The monster lost 30 HP");
            enter = next.nextLine();
            monsterhealth = monsterhealth-30;            
        }else if(attack.contains("i")) {
            System.out.println(username + " uses his ice spell...GHAAAA!!!");
            enter = next.nextLine();
            System.out.println("The monster loses 20 HP");
            enter = next.nextLine();
            monsterhealth = monsterhealth-20;                  
        }else{
            System.out.println(username + " there's no turning back");
            
        }
            }
            /*make sure that this if statement is outside the main if statement that introduces the do while loop
           location matters, not following this formula will keep cycling through this method without ever continuing the main story */
            
              if(monsterhealth <= zero) { 
                monsterisalive = false;
                //condition that will exit the while loop and return back to the main game
                  System.out.println("You won");
            }else if(monsterisalive = true){ 
                
                /* I placed the if statement for the monster here so it won't interfere with the player's fighting
                //if you were to place this statement somewhere inside if(monsterisalive = true), you would keep going
                until it is done going over the entire battle play. */
                
                    System.out.println("It's the monster's turn...Be prepared!");
                    enter = next.nextLine();
                    System.out.println("The monster engulfs you in a dark portal and throws you back out!");
                    enter = next.nextLine();
                    System.out.println("OUCH!!! You lose 20 HP!");
                    enter = next.nextLine();
                    playerhealth = playerhealth-20;
                }
              
              //this is the if statement that will determine whether or not the player continues to fight
              //if the player's HP reaches zero...the player will be forced to withdraw and return to the current checkpoint
              // * check statement *
              
              if(playerhealth == zero){
                  System.out.println("Oh no...you lost all your HP!");
                  monsterisalive = false;//ends the while loop 
                  backtocheckpoint1();
              }
             
        }while(monsterisalive);      
    }   
    
          //#method1()
    /* This is the method to allow randomly selected monsters to fight the player and Separt
       this method will create a randomizer that will choose an integer from 0-3 and correspond
       with a method signaling to another method. This makes it easier to go through and 
       separate out the enemies because every time an enemy is suppose to show up, I can 
       just call on this method to select the monsters.
    */
    
    static void yellow_fight () {
        monsterchoices_y_r = arenafight_y.nextInt(4);
        if (monsterchoices_y_r == 0) {//if integer is zero, you will fight a spider
            System.out.println("You encountered a giant spider.");//#enemyobject-enemy that player tries to defeat
            spider_fight();
        }else if(monsterchoices_y_r == 1) {//if integer is 1 you would fight a goblin
            System.out.println("You encountered a goblin.");//#enemyobject-enemy that player tries to defeat
            goblin_fights();    
    }else if(monsterchoices_y_r == 2) { //if integer is 2, you would fight a golbat
            System.out.println("You encountered a golbat.");//#enemyobject-enemy that player tries to defeat
            golbat_fights();
    }else if(monsterchoices_y_r == 3) { //if the integer is 3, you would fight a witch
            System.out.println("You encountered a witch.");//#enemyobject-enemy that player tries to defeat
            witch_fights();
    }
        
    }
    
            //method
     /* This method will introduce the player to the spider, and now the player will have to fight it, using spells...
        Similar to a combat arena...where healing, attacking, and defending are all necessary components. Rewards are 
        given at the end (healing potions) */
    
    static void spider_fight() {
        enter = next.nextLine();
        System.out.println( username + " defeat this spider to advance into the next level ");
        System.out.println("Remember, don't get yourself into a sticky situation, or else you will regret it later.");
        enter = next.nextLine();
        System.out.println("'We can do this master " + username + ". Just hang on a little longer!");
        playerhealth = 310; // player leveled up to level 5 with 500 HP
        spiderhealth = 150; //this is the spider's health.
        monsterisalive = true;
        while(monsterisalive){//#while-while loop that allows the player to fight the spider
            if(monsterisalive){
            System.out.println(" The spider's HP is " + spiderhealth + ".");
            enter = next.nextLine();
            System.out.println("You have recently leveled up and now can use up to six different types of attacks:");
            enter = next.nextLine();
            System.out.println(username + ", you can cast fire, ice, lightning spells, throw rocks at the enemy,");
            System.out.println("throw in multiple wind storms, run, or heal up to 80 points");
            attack = next.nextLine(); //attack response
            if(attack.contains("fire")){
                System.out.println("Alright, I'm fired up...FOOSH!!!");
                spiderhealth = spiderhealth-30;//this is the damage dealt
                System.out.println("The spider lost 30 HP. The spider now has " + spiderhealth + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("ice")) {
                System.out.println("Alright, it's gonna be a little chilly...GHAAAA!!!");
                spiderhealth = spiderhealth-20;//this is the damage dealt
                System.out.println("The spider lost 20 HP. The spider currently has " + spiderhealth + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("lightning")) {
                System.out.println("Someone's getting fried today...BAAAAAMMMM!!!");
                spiderhealth = spiderhealth-40;//this is the damage dealt
                System.out.println("OUCH!!! The spider lost 40 HP. It now has " + spiderhealth + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("throw rocks")) {
                System.out.println("Incoming Boulder...BOOOOOMM!!!");
                spiderhealth = spiderhealth-30;//this is the damage dealt
                System.out.println("The spider lost 30 HP. It now has " + playerhealth + " HP.");
                enter = next.nextLine();
                System.out.println("You now have " + playerhealth + " HP.");           
            }else if (attack.contains("wind")) {
                System.out.println("Alright...let's finish this up...WHIRL!!!");
                spiderhealth = spiderhealth-10;//this is the damage dealt
                System.out.println("The spider lost 10 HP. It now has " + spiderhealth + " HP.");
                enter = next.nextLine();
                System.out.println("You now have " + playerhealth + " HP.");
            }else if (attack.contains("run")) {
                System.out.println("Coward...there's no running. You lost a turn and don't have enough time to check your health.");
            }else if (attack.contains("heal")) {
                healing_challenge2();
                System.out.println("\n");
                System.out.println("The spider still has " + spiderhealth + " HP.");
                System.out.println(username + "'s HP increased to " + playerhealth + " HP.");
                enter = next.nextLine();
            }
        }
            if(spiderhealth <= zero) {
                System.out.println("You defeated the spider.");
                System.out.println("You win!");//#win
                System.out.println("\n");
                System.out.println("There is a small treasure chest left behind by the spider.");
                System.out.println(username + " picks it up and it appears to be a potion...");
                enter = next.nextLine();
                potions = potions+1;//adds one
                System.out.println(username + " adds the potion to his bag which currently holds " + potions + ".");
                monsterisalive = false;
                //#forthewin
            }else if (spiderhealth > zero) {
            enter = next.nextLine();
            System.out.println("Now it is the spider's turn... Brace Yourself");
            enter = next.nextLine();
            System.out.println("The spider swings from a web and hurls its ball-shaped webs to you...");
            playerhealth = playerhealth-50;//damage that the enemy dealt
            System.out.println("OUCH! " + username + " lost 50 HP...You now have " + playerhealth + ".");
            enter = next.nextLine();
        }
            if(playerhealth <= zero) {//#lose
                System.out.println("OH NO!!! You lost all your HP.");
                monsterisalive = false;//ends while loop
                play_yellowportal();//check again this was what I meant by at the end
                //#forthelose
            }
        }
    }
                    //#method2()
    /* This method will introduce the player to the goblins that will fight you similarily to the spider method...
       There will be fighting, healing, and defending during this battle. Again rewards are given at the end known as
       potions. I used this method so that every time the random enemy generator spit out a 2 the player will be taken 
       the goblin. This saves both time and space.
    */    
    static void goblin_fights() {
        enter = next.nextLine();
        System.out.println( username + " defeat this goblin to advance into the next level ");
        System.out.println("Remember, don't fool around - or else you will regret it later.");
        enter = next.nextLine();
        System.out.println("'We can do this master " + username + ". Just hang on a little longer!");
        playerhealth = 310; // player leveled up to level 5 with 500 HP
        goblinshealth = 170; //this is the goblin's health.
        monsterisalive = true;
        while(monsterisalive){//#while-while loop that will allow the player fight the goblin
            if(monsterisalive){
            System.out.println(" The goblin's HP is " + goblinshealth + ".");
            enter = next.nextLine();
            System.out.println("You have recently leveled up and now can use up to six different types of attacks:");
            enter = next.nextLine();
            System.out.println(username + ", you can cast fire, ice, lightning spells, throw rocks at the enemy,");
            System.out.println("throw in multiple wind storms, run, or heal up to 80 health points");
            attack = next.nextLine(); //attack response
            if(attack.contains("fire")){
                System.out.println("Alright, I'm fired up...FOOSH!!!");
                goblinshealth = goblinshealth-30;
                System.out.println("The goblin lost 30 HP. The goblin now has " + goblinshealth + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("ice")) {
                System.out.println("Alright, it's gonna be a little chilly...GHAAAA!!!");
                goblinshealth = goblinshealth-20;
                System.out.println("The goblin lost 20 HP. The goblin currently has " + goblinshealth + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("lightning")) {
                System.out.println("Someone's getting fried today...BAAAAAMMMM!!!");
                goblinshealth = goblinshealth-40;
                System.out.println("OUCH!!! The goblin lost 40 HP. It now has " + goblinshealth + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("throw rocks")) {
                System.out.println("Incoming Boulder...BOOOOOMM!!!");
                goblinshealth = goblinshealth-30;
                System.out.println("The goblin lost 30 HP. It now has " + goblinshealth + " HP.");
                enter = next.nextLine();
                System.out.println("You now have " + playerhealth + " HP.");           
            }else if (attack.contains("wind")) {
                System.out.println("Alright...let's finish this up...WHIRL!!!");
                goblinshealth = goblinshealth-10;
                System.out.println("The goblin lost 10 HP. It now has " + goblinshealth + " HP.");
                enter = next.nextLine();
                System.out.println("You now have " + playerhealth + " HP.");
            }else if (attack.contains("run")) {
                System.out.println("Coward...there's no running. You lost a turn and don't have enough time to check your health.");
            }else if (attack.contains("heal")) { //player heals
                healing_challenge2();
                System.out.println("\n");
                System.out.println("The goblin still has " + goblinshealth + " HP.");
                System.out.println(username + "'s HP increased to " + playerhealth + " HP.");
                enter = next.nextLine();
            }
        }//check to see if adding an if(monsterisalive) will prevent
            if(goblinshealth <= zero) {
                System.out.println("You defeated the goblin!");//#hero defeats the enemy, which affects the enemies health
                System.out.println("You win!");                //and is able to gain a potion left behind as a reward
                enter = next.nextLine();
                System.out.println("\n");
                System.out.println(username + " found a rag left behind by the goblin...");
                System.out.println("Shall we check it: yes or no?");
                answer = responses.nextLine();
                if(answer.contains("y")) {
                    System.out.println(username + " lifts up the rag to see that there is a potion.");
                    potions = potions+1;
                    System.out.println(username + " puts the potion inside the bag which already contains " + potions + " potions.");
                    //player gets a potion if they won
                    enter = next.nextLine();
                }else{
                    System.out.println(username + " kicks the rag to the side and continues on.");
                    System.out.println("\n");
                }
                monsterisalive = false;
            }else if (goblinshealth > zero) {
            enter = next.nextLine();
            System.out.println("Now it is the goblin's turn... Brace Yourself");
            enter = next.nextLine();
            System.out.println("The goblin throws multiple knives that pierced your skin...");
            playerhealth = playerhealth-60;
            System.out.println("OUCH! " + username + " lost 60 HP...You now have " + playerhealth + ".");
            enter = next.nextLine();
        }
            if(playerhealth <= zero) {
                System.out.println("OH NO!!! You lost all your HP.");
                monsterisalive = false;
                play_yellowportal();
            }
        }
    }
             //method
    /* This method will allow the player to have a battle againsts a golbat... There will be 7 choices, but mainly
       5 spells/real attacks. The heal option is for healing and run method is just a small trap built. Rewards is also
       a potion. I have many more methods, over 30 , but these are the first 5. Storyline is kinda long...
    */
    
    static void golbat_fights() {
        enter = next.nextLine();
        System.out.println( username + " defeat this Golbat to advance into the next level ");
        System.out.println("Don't let the Golbat fly near you... It's part vampire. You wouldn't want that to be near you.");
        enter = next.nextLine();
        System.out.println("'We can do this master " + username + ". Just hang on!");
        playerhealth = 310; // player leveled up to level 5 with 500 HP
        golbathealth = 190; //this is the Golbat's health.
        monsterisalive = true;
        while(monsterisalive){//#while-while loop that will allow the player fight the golbat
            if(monsterisalive){
            System.out.println(" The Golbat's HP is " + golbathealth + ".");
            enter = next.nextLine();
            System.out.println("You have recently leveled up and now can use up to six different types of attacks:");
            enter = next.nextLine();
            System.out.println(username + ", you can cast fire, ice, lightning spells, throw rocks at the enemy,");
            System.out.println("throw in multiple wind storms, heal, or run");
            attack = next.nextLine(); //attack response
            if(attack.contains("fire")){
                System.out.println("Alright, I'm fired up...FOOSH!!!");
                golbathealth = golbathealth-30;
                System.out.println("The Golbat lost 30 HP. The Golbat now has " + golbathealth + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("ice")) {
                System.out.println("Alright, it's gonna be a little chilly...GHAAAA!!!");
                golbathealth = golbathealth-20;
                System.out.println("The Golbat lost 20 HP. The Golbat currently has " + golbathealth + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("lightning")) {
                System.out.println("Someone's getting fried today...BAAAAAMMMM!!!");
                golbathealth = golbathealth-40;
                System.out.println("OUCH!!! The Golbat lost 40 HP. It now has " + golbathealth + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("throw rocks")) {
                System.out.println("Incoming Boulder...BOOOOOMM!!!");
                golbathealth = golbathealth-30;
                System.out.println("The Golbat lost 30 HP. It now has " + golbathealth + " HP.");
                enter = next.nextLine();
                System.out.println("You now have " + playerhealth + " HP.");           
            }else if (attack.contains("wind")) {
                System.out.println("Alright...let's finish this up...WHIRL!!!");
                golbathealth = golbathealth-10;
                System.out.println("The Golbat lost 10 HP. It now has " + golbathealth + " HP.");
                enter = next.nextLine();
                System.out.println("You now have " + playerhealth + " HP.");
            }else if (attack.contains("run")) {
                System.out.println("Coward...there's no running. You lost a turn and don't have enough time to check your health.");
            }else if (attack.contains("heal")) { //player will be given an opportunity to heal
                healing_challenge2();
                System.out.println("\n");
                System.out.println("The golbat still has " + golbathealth + " HP.");
                System.out.println(username + "'s HP increased to " + playerhealth + " HP.");
                enter = next.nextLine();
            }
        }//check to see if adding an if(monsterisalive) will prevent
            if(golbathealth <= zero) {
                System.out.println("You defeated the golbat.");
                System.out.println("You win!");
                System.out.println("The Golbat left a drooping that seems to glimmer...");
                System.out.println("Do you want to check it out: yes or no?");
                if(answer.contains("y")) {
                    System.out.println(username + " clears the droopings and finds a small bottle of potion.");
                    potions = potions+1;
                    System.out.println(username + " puts the healing potion into the bag, which now contains " + potions + " potions.");
                    System.out.println("\n");
                }else{
                    System.out.println(username + " casts a fire spell and burned the droopings...");
                    System.out.println("\n");
                }
                monsterisalive = false;
            }else if (golbathealth > zero) {
            enter = next.nextLine();
            System.out.println("Now it is the Golbat's turn... Brace Yourself");
            enter = next.nextLine();
            System.out.println("The Golbat swooped down and cutted " + username + " with its wings and bit ");
            System.out.println(username + "'s neck... "); 
            playerhealth = playerhealth-40;
            System.out.println("OUCH! " + username + " lost 40 HP...You now have " + playerhealth + ".");
            enter = next.nextLine();
        }
            if(playerhealth <= zero) {
                System.out.println("OH NO!!! You lost all your HP.");
                monsterisalive = false;
                play_yellowportal();
            }
        }
    }
    
    static void witch_fights(){
        enter = next.nextLine();
        System.out.println( username + " defeat this witch to advance into the next level ");
        System.out.println("Remember, witches can also cast their own spells to. Be careful!");
        enter = next.nextLine();
        System.out.println("'We can do this master " + username + ". Just hang on a little longer!");
        playerhealth = 310; // player leveled up to level 5 with 500 HP
        witchhealth = 200; //this is the spider's health.
        monsterisalive = true;
        while(monsterisalive){//#while-while loop that will allow the player fight the witch
            if(monsterisalive){
            System.out.println(" The witch's HP is " + witchhealth + ".");
            enter = next.nextLine();
            System.out.println("You have recently leveled up and now can use up to six different types of attacks:");
            enter = next.nextLine();
            System.out.println(username + ", you can cast fire, ice, lightning spells, throw rocks at the enemy,");
            System.out.println("throw in multiple wind storms, and run");
            attack = next.nextLine(); //attack response
            if(attack.contains("fire")){
                System.out.println("Alright, I'm fired up...FOOSH!!!");
                witchhealth = witchhealth-30;
                System.out.println("The witch lost 30 HP. The witch now has " + witchhealth + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("ice")) {
                System.out.println("Alright, it's gonna be a little chilly...GHAAAA!!!");
                witchhealth = witchhealth-20;
                System.out.println("The witch lost 20 HP. The witch currently has " + witchhealth + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("lightning")) {
                System.out.println("Someone's getting fried today...BAAAAAMMMM!!!");
                witchhealth = witchhealth-40;
                System.out.println("OUCH!!! The witch lost 40 HP. It now has " + witchhealth + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("throw rocks")) {
                System.out.println("Incoming Boulder...BOOOOOMM!!!");
                witchhealth = witchhealth-30;
                System.out.println("The witch lost 30 HP. It now has " + witchhealth + " HP.");
                enter = next.nextLine();
                System.out.println("You now have " + playerhealth + " HP.");           
            }else if (attack.contains("wind")) {
                System.out.println("Alright...let's finish this up...WHIRL!!!");
                witchhealth = witchhealth-10;
                System.out.println("The witch lost 10 HP. It now has " + witchhealth + " HP.");
                enter = next.nextLine();
                System.out.println("You now have " + playerhealth + " HP.");
            }else if (attack.contains("run")) {
                System.out.println("Coward...there's no running. You lost a turn and don't have enough time to check your health.");
            }else if (attack.contains("heal")) {
                healing_challenge2();
                System.out.println("\n");
                System.out.println("The witch still has " + witchhealth + " HP.");
                System.out.println(username + "'s HP increased to " + playerhealth + " HP.");
                enter = next.nextLine();
            }
        }//check to see if adding an if(monsterisalive) will prevent
            if(witchhealth <= zero) {
                System.out.println("You defeated the witch");
                System.out.println("You win!");
                System.out.println("The witch left behind her mini staff..looks like you could get more powers.");
                System.out.println(username + " grabs the staff, but it transforms into a potion.");
                System.out.println("\n");
                System.out.println(username + " puts the potion into the stock bag...");
                potions = potions+1;
                System.out.println(username + " now has " + potions + " potions.");
                System.out.println("\n");
                monsterisalive = false;
            }else if (witchhealth > zero) {
            enter = next.nextLine();
            System.out.println("Now it is the witch's turn... Brace Yourself");
            enter = next.nextLine();
            System.out.println("The witch casts dark magic and a black, heavy, burning flame burns " + username + ".");
            playerhealth = playerhealth-70;
            System.out.println("OUCH! " + username + " lost 70 HP...You now have " + playerhealth + ".");
            enter = next.nextLine();
        }
            if(playerhealth <= zero) {
                System.out.println("OH NO!!! You lost all your HP.");
                monsterisalive = false;
                play_yellowportal();
            }
        }
    }
    
    static void red_fight() { //This is the method to randomly select monkeys to fight the player and Kongo
        monsterchoices_y_r = arenafight_r.nextInt(4);
        if(monsterchoices_y_r == 0){
            System.out.println("You encountered a gigantic ape...");
            gigantic_ape();
            System.out.println("\n");
        }else if(monsterchoices_y_r == 1) {
            System.out.println("You encountered a hungry gorilla...");
            gorilla();
            System.out.println("\n");
        }else if(monsterchoices_y_r == 2) {
            System.out.println("You encountered a bloodthristy pack of wolves...");
            pack_of_wolves();
            System.out.println("\n");
        }else if (monsterchoices_y_r == 3) {
            System.out.println("You encountered a King Snake...");
            rattle_snake();
            System.out.println("\n");
        }
    }
    
    static void gigantic_ape () {
        playerhealth = 310;
        ape = 150;
        System.out.println("Alright the ape that you just saw has " + ape + " HP.");
        System.out.println(username + " you must defeat this ape to advance in the future challenges");
        enter = next.nextLine();
        System.out.println("Don't break a bone. Good Luck!");
        System.out.println("\n");
        System.out.println(username + ", you can cast fire, ice, lightning spells, throw rocks at the enemy,");
        System.out.println("throw in multiple wind storms, and run.");
        enter = next.nextLine();
        System.out.println("'We can do this " + username + ",' Kongo exclaimed.");
        monsterisalive = true;
        while(monsterisalive) {//#while-while loop that will allow the player fight the ape
         if(monsterisalive){
            System.out.println(" The ape's HP is " + ape + ".");
            enter = next.nextLine();
            System.out.println("You have recently leveled up and now can use up to six different types of attacks:");
            enter = next.nextLine();
            System.out.println(username + ", what is your next move:");
            System.out.println("cast fire, ice, lightning, throw rocks, wind storms, run, or heal...");
            attack = next.nextLine(); //attack response
            if(attack.contains("fire")){
                System.out.println("Alright, I'm fired up...FOOSH!!!");
                ape = ape-30;
                System.out.println("The ape lost 30 HP. The ape now has " + ape + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("ice")) {
                System.out.println("Alright, it's gonna be a little chilly...GHAAAA!!!");
                ape = ape-20;
                System.out.println("The ape lost 20 HP. The ape currently has " + witchhealth + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("lightning")) {
                System.out.println("Someone's getting fried today...BAAAAAMMMM!!!");
                ape = ape-40;
                System.out.println("OUCH!!! The ape lost 40 HP. It now has " + ape + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("throw rocks")) {
                System.out.println("Incoming Boulder...BOOOOOMM!!!");
                ape = ape-30;
                System.out.println("The enemy lost 30 HP. It now has " + ape + " HP.");
                enter = next.nextLine();
                System.out.println("You now have " + playerhealth + " HP.");           
            }else if (attack.contains("wind")) {
                System.out.println("Alright...let's finish this up...WHIRL!!!");
                ape = ape-10;
                System.out.println("The monster lost 10 HP. It now has " + ape + " HP.");
                enter = next.nextLine();
                System.out.println("You now have " + playerhealth + " HP.");
            }else if (attack.contains("run")) {
                System.out.println("Coward...there's no running. You lost a turn and don't have enough time to check your health.");
            }else if(attack.contains("heal")) { //player gets to heal
                healing_challenge2();
                System.out.println("\n");
                System.out.println("The ape still has " + ape + " HP.");
                System.out.println(username + "'s HP increased to " + playerhealth + " HP.");
                enter = next.nextLine();
            }else {// in case the player types the wrong move
                System.out.println("Next time please make sure you type fire, ice, lightning, throw rocks, wind storms, ");
                System.out.println("run, or heal. You lost your turn...");
            }
        }//check to see if adding an if(monsterisalive) will prevent
            if(ape <= zero) {
                System.out.println("You defeated the ape");
                System.out.println("You win!");
                System.out.println("The ape dropped his bananna...");
                System.out.println("Do you want it?");
                answer = responses.nextLine();
                if(answer.contains("y")) {
                    System.out.println(username + " picks up the bananna, but it turns into a small potion bottle.");
                    System.out.println(username + " puts the potion into the inventory...");
                    enter = next.nextLine();
                    potions = potions+1;
                    System.out.println(username + " now has " + potions + " potions.");
                    System.out.println("\n");
                }else{
                    System.out.println(username + " steps over the bananna and continues on...");
                }
                monsterisalive = false;
            }else if (ape > zero) {
            enter = next.nextLine();
            System.out.println("Now it is the ape's turn... Brace Yourself");
            enter = next.nextLine();
            System.out.println("The ape throws metal banannas at " + username + ".");
            System.out.println("PING!!! BONK!!! OUCH!");
            playerhealth = playerhealth-40;
            System.out.println("OUCH! " + username + " lost 40 HP...You now have " + playerhealth + ".");
            enter = next.nextLine();
        }
            if(playerhealth <= zero) {
                System.out.println("OH NO!!! You lost all your HP.");
                monsterisalive = false;
                play_yellowportal();
            }   
        }
        
    }
    
    static void gorilla() {
        playerhealth = 310;
        gorilla = 200;
        System.out.println("Alright the gorilla that you just saw has " + gorilla + " HP.");
        System.out.println(username + " you must defeat this gorilla to advance to the next challenge.");
        enter = next.nextLine();
        System.out.println("Don't sweat it.It's probably gonna be a breeze...!");
        System.out.println("\n");
        System.out.println(username + " has recently leveled up...");
        System.out.println("\n");
        System.out.println(username + ", you can cast fire, ice, lightning spells, throw rocks at the enemy,");
        System.out.println("throw in multiple wind storms, and run.");
        enter = next.nextLine();
        System.out.println("'Watch out for that gorilla, he's similar to me " + username + ",' Kongo exclaimed.");
        monsterisalive = true;
        while(monsterisalive) {//#while-while loop that will allow the player fight the gorilla
         if(monsterisalive){
            System.out.println(" The gorilla's HP is " + gorilla + ".");
            enter = next.nextLine();
            System.out.println("You have recently leveled up and now can use up to six different types of attacks:");
            enter = next.nextLine();
            System.out.println(username + ", what is your next move:");
            System.out.println("cast fire, ice, lightning, throw rocks, wind storms, run, or heal...");
            attack = next.nextLine(); //attack response
            if(attack.contains("fire")){
                System.out.println("Alright, I'm fired up...FOOSH!!!");
                gorilla = gorilla-30;
                System.out.println("The gorilla lost 30 HP. The gorilla now has " + gorilla + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("ice")) {
                System.out.println("Alright, it's gonna be a little chilly...GHAAAA!!!");
                gorilla = gorilla-20;
                System.out.println("The gorilla lost 20 HP. The gorilla currently has " + gorilla + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("lightning")) {
                System.out.println("Someone's getting fried today...BAAAAAMMMM!!!");
                gorilla = gorilla-40;
                System.out.println("OUCH!!! The monster lost 40 HP. It now has " + gorilla + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("throw rocks")) {
                System.out.println("Incoming Boulder...BOOOOOMM!!!");
                gorilla = gorilla-30;
                System.out.println("The enemy lost 30 HP. It now has " + gorilla + " HP.");
                enter = next.nextLine();
                System.out.println("You now have " + playerhealth + " HP.");           
            }else if (attack.contains("wind")) {
                System.out.println("Alright...let's finish this up...WHIRL!!!");
                gorilla = gorilla-10;
                System.out.println("The monster lost 10 HP. It now has " + gorilla + " HP.");
                enter = next.nextLine();
                System.out.println("You now have " + playerhealth + " HP.");
            }else if (attack.contains("run")) {
                System.out.println("Coward...there's no running. You lost a turn and don't have enough time to check your health.");
            }else if(attack.contains("heal")){ //player gets to heal
                healing_challenge2();
                System.out.println("\n");
                System.out.println("The Gorilla still has " + gorilla + " HP.");
                System.out.println(username + "'s HP increased to " + playerhealth + " HP.");
                enter = next.nextLine();
            }else {// in case the player types the wrong move
                System.out.println("Next time please make sure you type fire, ice, lightning, throw rocks, wind storms, ");
                System.out.println("run, or heal. You lost your turn...");
            }
        }//check to see if adding an if(monsterisalive) will prevent
            if(gorilla <= zero) {
                System.out.println("You defeated the gorilla");
                System.out.println("You win!");
                System.out.println("You found a bottle laying left behind by the gorilla.");
                System.out.println("Do you want to pick it up?");
                answer = responses.nextLine();
                if(answer.contains("yes")) {
                    System.out.println(username + " takes a closer look at it and it turns out to be a potion!");
                    System.out.println(username + " adds the potion to the inventory...");
                    potions = potions+1;
                    System.out.println(username + " now has " + potions + " potions.");
                    System.out.println("\n");
                }else{
                    System.out.println(username + " kicks the bottle aside and continues...");
                    System.out.println("\n");
                }
                monsterisalive = false;
            }else if (gorilla > zero) {
            enter = next.nextLine();
            System.out.println("Now it is the gorilla's turn... Brace Yourself");
            enter = next.nextLine();
            System.out.println("The gorilla uses rocket launch...");
            System.out.println("The gorilla launches his body and slames heavily on " + username + ".");
            System.out.println("BOOM!!! YOWL!!!");
            playerhealth = playerhealth-45;
            System.out.println("WOW! " + username + " lost 45 HP...You now have " + playerhealth + ".");
            enter = next.nextLine();
        }
            if(playerhealth <= zero) {
                System.out.println("OH NO!!! You lost all your HP.");
                monsterisalive = false;
                play_yellowportal();
            }   
        }
    }
    
    static void pack_of_wolves () {
        wolf1 = 70;
        wolf2 = 80;
        wolf3 = 100;
        monsterisalive = true;
        playerhealth = 310;
        System.out.println("There are three wolves in this pack wolf 1, wolf 2, and wolf 3.");
        System.out.println("Wolf 1 has " + wolf1 + " HP.");
        System.out.println("\n");
        System.out.println("Wolf 2 has " + wolf2 + " HP.");
        System.out.println("\n");
        System.out.println("Wolf 3 has " + wolf3 + " HP.");
        enter = next.nextLine();
        System.out.println(username + " you must defeat this pack in order to advance to the next challenge.");
        enter = next.nextLine();
        System.out.println("These wolves are hungry...be CAREFUL!");
        System.out.println("\n");
        System.out.println(username + " has recently leveled up...");
        System.out.println("\n");
        System.out.println(username + ", you can cast fire, ice, lightning spells, throw rocks at the enemy,");
        System.out.println("throw in multiple wind storms, and run.");
        enter = next.nextLine();
        System.out.println("'Watch out for those wolves, they can easily take you down " + username + ",' Kongo exclaimed.");
        wolf1_alive = true;
        wolf2_alive = true;
        wolf3_alive = true;
        monsterisalive = true;
        while(monsterisalive) {//#while-while loop that will allow the player fight the wolves
         if(monsterisalive){
            enter = next.nextLine();
            System.out.println("You have recently leveled up and now can use up to six different types of attacks.");
            enter = next.nextLine();
            System.out.println(username + " which wolf do you want to attack...");
            System.out.println("Wolf 1, Wolf 2, or Wolf 3.");
            answer = responses.nextLine();
            //choice for wolf #1
            if(answer.contains("1")) {
                System.out.println(username + " is preparing to aim at wolf 1...");
                System.out.println(username + ", what is your next move:");
            System.out.println("cast fire, ice, lightning, throw rocks, wind storms, run, or heal...");
            attack = next.nextLine(); //attack response
            if(attack.contains("fire")){
                System.out.println("Alright, I'm fired up...FOOSH!!!");
                wolf1 = wolf1-30;
                System.out.println("Wolf 1 lost 30 HP. It now has " + wolf1 + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("ice")) {
                System.out.println("Alright, it's gonna be a little chilly...GHAAAA!!!");
                wolf1 = wolf1-20;
                System.out.println("Wolf 1 lost 20 HP. It currently has " + wolf1 + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("lightning")) {
                System.out.println("Someone's getting fried today...BAAAAAMMMM!!!");
                wolf1 = wolf1-40;
                System.out.println("OUCH!!! The monster lost 40 HP. It now has " + wolf1 + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("throw rocks")) {
                System.out.println("Incoming Boulder...BOOOOOMM!!!");
                wolf1 = wolf1-30;
                System.out.println("The enemy lost 30 HP. It now has " + wolf1 + " HP.");
                enter = next.nextLine();
                System.out.println("You now have " + playerhealth + " HP.");           
            }else if (attack.contains("wind")) {
                System.out.println("Alright...let's finish this up...WHIRL!!!");
                wolf1 = wolf1-10;
                System.out.println("The monster lost 10 HP. It now has " + wolf1 + " HP.");
                enter = next.nextLine();
                System.out.println("You now have " + playerhealth + " HP.");
            }else if (attack.contains("run")) {
                System.out.println("Coward...there's no running. You lost a turn and don't have enough time to check your health.");
            }else if (attack.contains("heal")){//chance to heal player
                healing_challenge2();
                System.out.println("\n");
                System.out.println("Wolf 1 still has " + wolf1 + " HP.");
                System.out.println(username + "'s HP increased to " + playerhealth + " HP.");
                enter = next.nextLine();
            }else {// in case the player types the wrong move
                System.out.println("Next time please make sure you type fire, ice, lightning, throw rocks, wind storms, ");
                System.out.println("or run. You lost your turn...");
            }
            //choice for wolf #2
            }else if(answer.contains("2")) {
                System.out.println(username + " is now aiming his attack on wolf 2...");
                System.out.println(username + ", what is your next move:");
            System.out.println("cast fire, ice, lightning, throw rocks, wind storms, run, or heal...");
            attack = next.nextLine(); //attack response
            if(attack.contains("fire")){
                System.out.println("Alright, I'm fired up...FOOSH!!!");
                wolf2 = wolf2-30;
                System.out.println("Wolf 2 lost 30 HP. It now has " + wolf2 + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("ice")) {
                System.out.println("Alright, it's gonna be a little chilly...GHAAAA!!!");
                wolf2 = wolf2-20;
                System.out.println("Wolf 2 lost 20 HP. It currently has " + gorilla + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("lightning")) {
                System.out.println("Someone's getting fried today...BAAAAAMMMM!!!");
                wolf2 = wolf2-40;
                System.out.println("OUCH!!! The monster lost 40 HP. It now has " + wolf2 + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("throw rocks")) {
                System.out.println("Incoming Boulder...BOOOOOMM!!!");
                wolf2 = wolf2-30;
                System.out.println("The enemy lost 30 HP. It now has " + wolf2 + " HP.");
                enter = next.nextLine();
                System.out.println("You now have " + playerhealth + " HP.");           
            }else if (attack.contains("wind")) {
                System.out.println("Alright...let's finish this up...WHIRL!!!");
                wolf2 = wolf2-10;
                System.out.println("The monster lost 10 HP. It now has " + wolf2 + " HP.");
                enter = next.nextLine();
                System.out.println("You now have " + playerhealth + " HP.");
            }else if (attack.contains("run")) {
                System.out.println("Coward...there's no running. You lost a turn and don't have enough time to check your health.");
            }else if(attack.contains("heal")) {
                healing_challenge2();
                System.out.println("\n");
                System.out.println("Wolf 2 still has " + wolf2 + " HP.");
                System.out.println(username + "'s HP increased to " + playerhealth + " HP.");
                enter = next.nextLine();
            }else {// in case the player types the wrong move
                System.out.println("Next time please make sure you type fire, ice, lightning, throw rocks, wind storms, ");
                System.out.println("or run. You lost your turn...");
            }
            //choice for wolf #3
            }else if (answer.contains("3")) {
                System.out.println(username + " is now focused on wolf 3...");           
            System.out.println(username + ", what is your next move:");
            System.out.println("cast fire, ice, lightning, throw rocks, wind storms, run, or heal...");
            attack = next.nextLine(); //attack response
            if(attack.contains("fire")){
                System.out.println("Alright, I'm fired up...FOOSH!!!");
                wolf3 = wolf3-30;
                System.out.println("WOlf 3 lost 30 HP. It now has " + gorilla + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("ice")) {
                System.out.println("Alright, it's gonna be a little chilly...GHAAAA!!!");
                wolf3 = wolf3-20;
                System.out.println("Wolf 3 lost 20 HP. It currently has " + gorilla + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("lightning")) {
                System.out.println("Someone's getting fried today...BAAAAAMMMM!!!");
                wolf3 = wolf3-40;
                System.out.println("OUCH!!! The monster lost 40 HP. It now has " + wolf3 + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("throw rocks")) {
                System.out.println("Incoming Boulder...BOOOOOMM!!!");
                wolf3 = wolf3-30;
                System.out.println("The enemy lost 30 HP. It now has " + wolf3 + " HP.");
                enter = next.nextLine();
                System.out.println("You now have " + playerhealth + " HP.");           
            }else if (attack.contains("wind")) {
                System.out.println("Alright...let's finish this up...WHIRL!!!");
                wolf3 = wolf3-10;
                System.out.println("The monster lost 10 HP. It now has " + wolf3 + " HP.");
                enter = next.nextLine();
                System.out.println("You now have " + playerhealth + " HP.");
            }else if (attack.contains("run")) {
                System.out.println("Coward...there's no running. You lost a turn and don't have enough time to check your health.");
            }else if (attack.contains("heal")) { //opportunity to heal
                healing_challenge2();
                System.out.println("\n");
                System.out.println("Wolf 3 still has " + wolf3 + " HP.");
                System.out.println(username + "'s HP increased to " + playerhealth + " HP.");
                enter = next.nextLine();
            }else {// in case the player types the wrong move
                System.out.println("Next time please make sure you type fire, ice, lightning, throw rocks, wind storms, ");
                System.out.println("run, or heal. You lost your turn...");
            }
        }
    }    
         if(wolf1 <= zero) { //check wolf 1's health
             System.out.println("You defeated wolf 1.");
             System.out.println("GOOD JOB!!!");
             wolf1_alive = false;
         }
         
         if(wolf2 <= zero) { //check wolf 2's health
             System.out.println("You defeated wolf 2.");
             System.out.println("YOU'RE ALRIGHT...");
             wolf2_alive = false;
         }
         
         if(wolf3 <= zero) {
             System.out.println("You defeated wolf 3.");
             System.out.println("COOL!!!");
             wolf3_alive = false;
         }
   
            if(wolf1 <= zero && wolf2 <= zero && wolf3 <= zero) { //check if all of the wolves are defeated yet...
                System.out.println("You defeated the entire wolf pack!");
                System.out.println("You win!");
                System.out.println("The wolves left behind three saber teeth on the ground...");
                System.out.println(username + " picks up the saber teeth and it suddenly binded together...");
                enter = next.nextLine();
                System.out.println("It transformed into a healing potion and " + username + " inserted it into the bag.");
                potions = potions+1;
                System.out.println("You now have " + potions + " potions in your possession.");
                System.out.println("\n");
                monsterisalive = false;
            }else if (wolf1 > zero || wolf2 > zero || wolf3 > zero) {
            enter = next.nextLine();
            System.out.println("Now it is the wolves' turn. Brace Yourself...");
            }
            
            enter = next.nextLine();
            
            if(wolf1_alive) { //if wolf 1 is alive, it will attack
                System.out.println("Wolf 1 takes the lead and used saber bite...");
                System.out.println("Wolf 1 launches itself and sanked its jaws deep inside" + username + "'s thighs.");
                System.out.println("GRRRHHH!!! YOWL!!!");
                playerhealth = playerhealth-10;
                System.out.println("WOW! " + username + " lost 10 HP...You now have " + playerhealth + ".");
                System.out.println("\n");
            }
            //if wolf 2 is still alive it'll attack
            if(wolf2_alive) {
                System.out.println("Wolf 2 used saber claw...");
                System.out.println("Wolf 2 lengthens his claws and charges up to " + username + ".");
                enter = next.nextLine();
                System.out.println("Wolf 2 then sinks his jaws deep into " + username + "'s belly.");
                System.out.println("CHSINNG!!!");
                enter = next.nextLine();
                playerhealth = playerhealth-20;
                System.out.println("YOWL!!! " + username + " lost 20 HP...You now have " + playerhealth + " HP.");
                System.out.println("\n");
            }
            //if wolf 3 is still alive it'll attack
            if(wolf3_alive) {
                System.out.println("Wolf 3 used saber blow...");
                System.out.println("Wolf 3 lunges forward to " + username + "'s head and knocks him off his feet...");
                enter = next.nextLine();
                System.out.println("POOWWW!!!");
                System.out.println("\n");
                playerhealth = playerhealth-30;
                System.out.println("YOUCH!!! " + username + " lost 30 HP...You now have " + playerhealth + " HP.");
                System.out.println("\n");
            }
            
            if(playerhealth <= zero) {
                System.out.println("OH NO!!! You lost all your HP.");
                monsterisalive = false;
                play_yellowportal();
            }   
        }
    }
    
    static void rattle_snake() {
        playerhealth = 310;
        snake = 180;
        System.out.println("Alright the snake that you just saw has " + snake + " HP.");
        System.out.println(username + " you must defeat this snake to advance to the next challenge.");
        enter = next.nextLine();
        System.out.println("Just watch out for its fangs...");
        System.out.println("\n");
        System.out.println(username + " has recently leveled up...");
        System.out.println("\n");
        System.out.println(username + ", you can cast fire, ice, lightning spells, throw rocks at the enemy,");
        System.out.println("throw in multiple wind storms, and run.");
        enter = next.nextLine();
        System.out.println("'Watch out for that snake, it's poisonous " + username + ",' Kongo exclaimed.");
        monsterisalive = true;
        while(monsterisalive) {//#while-while loop that will allow the player fight the snake
         if(monsterisalive){
            System.out.println(" The snake's HP is " + snake + ".");
            enter = next.nextLine();
            System.out.println("You have recently leveled up and now can use up to six different types of attacks:");
            enter = next.nextLine();
            System.out.println(username + ", what is your next move:");
            System.out.println("cast fire, ice, lightning, throw rocks, wind storms, run, or heal...");
            attack = next.nextLine(); //attack response
            if(attack.contains("fire")){
                System.out.println("Alright, I'm fired up...FOOSH!!!");
                snake = snake-30;
                System.out.println("The snake lost 30 HP. The snake now has " + snake + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("ice")) {
                System.out.println("Alright, it's gonna be a little chilly...GHAAAA!!!");
                snake = snake-20;
                System.out.println("The snake lost 20 HP. The snake currently has " + snake + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("lightning")) {
                System.out.println("Someone's getting fried today...BAAAAAMMMM!!!");
                snake = snake-40;
                System.out.println("OUCH!!! The monster lost 40 HP. It now has " + snake + " HP.");
                enter = next.nextLine();
                System.out.println("You have " + playerhealth + " HP.");
            }else if (attack.contains("throw rocks")) {
                System.out.println("Incoming Boulder...BOOOOOMM!!!");
                snake = snake-30;
                System.out.println("The enemy lost 30 HP. It now has " + snake + " HP.");
                enter = next.nextLine();
                System.out.println("You now have " + playerhealth + " HP.");           
            }else if (attack.contains("wind")) {
                System.out.println("Alright...let's finish this up...WHIRL!!!");
                snake = snake-10;
                System.out.println("The monster lost 10 HP. It now has " + snake + " HP.");
                enter = next.nextLine();
                System.out.println("You now have " + playerhealth + " HP.");
            }else if (attack.contains("run")) {
                System.out.println("Coward...there's no running. You lost a turn and don't have enough time to check your health.");
            }else if(attack.contains("heal")) {
                healing_challenge2();
                System.out.println("\n");
                System.out.println("The snake still has " + snake + " HP.");
                System.out.println(username + "'s HP increased to " + playerhealth + " HP.");
                enter = next.nextLine();
            }else {// in case the player types the wrong move
                System.out.println("Next time please make sure you type fire, ice, lightning, throw rocks, wind storms, ");
                System.out.println("or run. You lost your turn...");
            }
        }
            if(snake <= zero) {
                System.out.println("You defeated the King Snake");
                System.out.println("You win!");
                System.out.println("The snake shedded its skin while trying to escape...");
                System.out.println("\n");
                System.out.println("The skin became a large bottle...");
                enter = next.nextLine();
                System.out.println("Shall we check it out?");
                answer = responses.nextLine();
                if(answer.contains("y")) {
                    System.out.println(username + " checks the large bottle and it turns out to be a potion...");
                    potions = potions+1;
                    System.out.println(username + " adds the bottles to the bag.");
                    System.out.println("You now have " + potions + " potions.");
                    System.out.println("\n");
                }else {
                    System.out.println(username + " steps aside and continues on...");
                    enter = next.nextLine();
                }
                monsterisalive = false;
            }else if (snake > zero) {
            enter = next.nextLine();
            System.out.println("Now it is the snake's turn... Brace Yourself");
            enter = next.nextLine();
            System.out.println("The snake used poison jaw...");
            System.out.println("The snake slithers toward " + username + " and sank its fangs into " + username + "'s arms.");
            System.out.println("BOOM!!! YOWL!!!");
            playerhealth = playerhealth-50;
            System.out.println("WOW! " + username + " lost 50 HP...You now have " + playerhealth + ".");
            enter = next.nextLine();
        }
            if(playerhealth <= zero) {
                System.out.println("OH NO!!! You lost all your HP.");
                monsterisalive = false;
                play_yellowportal();
            }   
        }
    }
    
    static void intro() { //This is where you would here the story line
        System.out.println("Welcome to ABANDONED SPELLS. What is your name?");
        Scanner userinputname = new Scanner(System.in);
        username = userinputname.nextLine();
        System.out.println(username + " here is a reminder...When you don't see text appear, press enter, this game will force you to read ");
        System.out.println("\n");//this also creates a line spacing
        System.out.println("INSTRUCTIONS!!!!");
        System.out.println(username + ", you had a depressing day today and was seeking refuge in an abandoned house, so you could ");
        System.out.println("be alone, comforted by the isolation of the outside world.");
        System.out.println("You had a lot of fun in the house, discovering hidden secrets that was forbidden to know. ");
        System.out.println("It turns out that the book lying on the ground is a spell book from the Dark Ages.");
        System.out.println("You were able to cast several spells, an introduction to the world of witchcraft.");
        System.out.println("Thinking that you can bring back knowledge about witchcraft and casting spells.");
        System.out.println("YOU WERE WRONG!!! You now have to deal with the evil spirits that guarded this book.");
        System.out.println("There is no turning back now, use your spells to cast your way out of this mess or at least get out of here alive.");
        System.out.println("GOOD LUCK " + username );
        System.out.println("Press enter to continue.");
        enter = next.nextLine();
        System.out.println("Choose which door you would want to go through. Door 1 or Door 2.");
        Scanner choose = new Scanner(System.in);
        fdoor = choose.nextLine();
        if(fdoor.contains("1")) {
            door = true;
        }else {
            door = false;
        }
            if(door) {
                Door1intro();
           }else {
                Door2_intro();
            }
    }
       static void Door1intro() {  //challenge 1
           System.out.println("You are now currently in the living room...It is probably safe.");
           System.out.println("Do you agree?");
           String response;
           response = responses.nextLine();
           System.out.println("YOU're WRONG...The creatures are chasing you. Navigate your way in the dark");
           System.out.println("and use your spells to destroy the enemies.");
           System.out.println("Press enter to continue...");
           enter = next.nextLine();
             /* #hero
           the hero is the main player, since he has to find out what is going on there is another hero later on too!*/
           System.out.println(username + " Use your fire spell to disintegrate your enemy");
           System.out.println("Use your ice spell to freeze your opponents");
           System.out.println("Use your brain to navigate through this dark arena... ");
           System.out.println("Are you ready?");
           enter = next.nextLine();
           Door1challenge();
       }
       
       static void Door1challenge() {
           
           System.out.println("Ready. 3...2...1...GO!");
           System.out.println("Where do you want to go? Left, Right, or Straight");
           direction = next.nextLine();
           //this is where the player will decide where to go
           //the rest of the maze will branch off from this decision. These choices will have the same outcome.
           
               if(direction.contains("left")) {
                   door1challenge_leftpath();
                   //player enters the left branch
                   
           }else if(direction.contains("right")){
                    System.out.println("Oh NO!!!! You fell into the pit.");
                    backtocheckpoint1(); //this will bring the player back to the beginning of the challenge
                    
           }else{
               door1challenge_straightpath();
           }
       }
       
       static void door1challenge_leftpath() {
           System.out.println("You met a creature! Use your powers to defeat it.");
           player_fights();
            //This will go to a different section of the game with a left path.
            //after you defeat the creature
            System.out.println(username + ", You defeated the beast");
            enter = next.nextLine();
            System.out.println("Now there is a straight path ahead and a curved path to the right.");
            System.out.println("Which way do you want to go. Straight or right?");
            direction = next.nextLine();
             //part 2 wave
                if(direction.contains("straight")) {
                        System.out.println("You met another creature! Use your powers to defeat the creature");
                        player_fights();
                        //after you beat the creature
                        System.out.println(username + ", you defeated the beast...you're on a roll!");
                        enter = next.nextLine();
                        System.out.println("Now there is a path directing you forward and a path directing you to the left");
                        System.out.println("Which path way would you like to pass? Left or straight?");
                        direction = next.nextLine();
                        if(direction.contains("left")) {
                            System.out.println("Oh NO!!! You fell in the trap.");//#enemyobject-traps
                            //As you can see, traps in the maze will result in the player to start over the challenge again
                            //in a certain checkpoint...
                            backtocheckpoint1();
                     
                            }else{
                                System.out.println("Looks like it is a safe path. Look there is only a path leading");
                                System.out.println("to the left. Shall we take that path?");
                                answer = responses.nextLine();
                                if(answer.contains("yes")) {
                                       System.out.println("You met another creature! Defend yourself!");
                                       player_fights();
                                       //after you beat the creature
                                       System.out.println("Great job " + username + ", you defeated the creature!");
                                       enter = next.nextLine();
                                       door1challenge_commonpath();
                            }
                        }
                         
                    }else { //going right (linked path)
                        System.out.println("You met another creature! Use your powers to defeat the creature");
                        player_fights();
                        //after you beat it
                        System.out.println(username + ", you defeated the beast...you're on a roll!");
                        enter = next.nextLine();
                        System.out.println("Here is another tough choice...There are two diverging paths, do");
                        System.out.println("you want to take the right or the straight path");
                        direction = next.nextLine();
                            if(direction.contains("right")) {
                                System.out.println("Oh No!!! You fell into the pit!");
                                backtocheckpoint1();
                            }else if(direction.contains("straight")) {
                                System.out.println("Here is another creature." + username + "get ready to exterminate it");
                                player_fights();
                                //after winning
                                System.out.println("Great job, you're a pro");
                                enter = next.nextLine();
                                door1challenge_commonpath();
                                
                            }
                        }
       }
       
       static void door1challenge_straightpath() {
            System.out.println("It looks safe...There is a straight path ahead. Press enter to continue.");
            enter = next.nextLine();
            //next choice
            System.out.println("looks like you're still safe...continue ahead or turn to the right and use that path?");
            direction = next.nextLine();//this is where you chose which way to go...also a linked path.
                 if(direction.contains("right")) {
                        System.out.println("Oh NO!!! You fell in the trap!");
                        backtocheckpoint1();
                        
                        } else{
                            System.out.println("Creature encountered... Fight this creature to continue.");
                            player_fights();
                            //after winning
                            System.out.println("You beat the creature!");
                            enter = next.nextLine();
                            //this next path is a linked path too.
                            System.out.println("Now, you can either go straight or take the right route.");
                            System.out.println("Which one do you want to go through: the right or the straight path?");
                            direction = next.nextLine();
                                if(direction.contains("right")) {
                                    System.out.println("OH NO " + username + ". You fell into the pit");
                                    backtocheckpoint1();
                                } else {
                                    door1challenge_commonpath();
                                }
                        }
                }
    
       
       
       static void Door2_intro() {
           System.out.println("You are now currently in the basement ...It is probably safe.");
           System.out.println("Besides...who would think of hiding in the basement anyways?");
           System.out.println("Do you agree?");
           //String response;
           answer = next.nextLine();
           System.out.println("YOU're WRONG...The creatures are chasing you. Navigate your way in the dark");
           System.out.println("and use your spells to destroy the enemies.");
           System.out.println("Press enter to continue...");
           enter = next.nextLine();
           System.out.println(username + " Use your fire spell to disintegrate your enemy");
           System.out.println("Use your ice spell to freeze your opponents");
           System.out.println("Use your brain to navigate through this dark arena... ");
           System.out.println("Are you ready for the challenge?");
           answer = next.nextLine();
           if(answer.contains("yes")){
               Door1challenge();
           }else if(answer.contains("no")) {
               System.out.println("Too bad!!! There's no other way out of this mess. Go kick some monster's behind!");
               Door2challenge();
       }else{
               Door2_intro();
           }
       }
       
       static void Door2challenge() { //This is where the second variation of the first challenge arrives
           System.out.println("Ready! 3...2...1...GO!");
           System.out.println("Where do you want to go? Left, Right, or Straight");
           direction = next.nextLine();
           //this is where the player will decide where to go
           //the rest of the maze will branch off from this decision. These choices will have the same outcome.
           
               if(direction.contains("left")) {
                   door2challenge_leftpath();
                   //player enters the left branch maze
                   
           }else if(direction.contains("right")){
                    door2challenge_rightpath();
                    //player enters the right branch of the maze
                    
           }else if(direction.contains("straight")){
               door2challenge_straightpath();
               //player enters the straight branch of the maze
           }else{
               System.out.println("I don't understand...type it correctly!!!");
               Door2challenge();
           }
           
       }
       
       static void door2challenge_leftpath() {
           System.out.println("The area looks safe... Continue on " + username + " on the straight path ahead.");
           System.out.println("You met a creature! Get ready to FIGHT!");
           enter = next.nextLine();
           player_fights();
           //when you defeat the creature
           System.out.println(username + ", You defeated the beast");
           System.out.println("Continue on..."); 
           //There is a straight path up ahead that the player will take to advance
           enter = next.nextLine();
           System.out.println("There is now only a curved path ahead... Take that path now.");
           System.out.println("OH NO... It was a trap. You fell into molten lava");
           enter = next.nextLine();
           backtocheckpoint1_version2();  //Dead end...Will return back to the first challenge second version
}
                  //#method3()
       /*  This method is used to organize the right branch of the maze in the first challenge. Although the path
           will continue to diverge, the main separation occurs in the beginning.     
       */
       static void door2challenge_rightpath() {
           System.out.println("You met a creature...");
           System.out.println("Get ready to RIP!!!");
           player_fights();
           //after you beat the creature...
           System.out.println("You killed it!!! " + username + "You are on a roll!");
           enter = next.nextLine();
           System.out.println("There is a straight path ahead take the path and continue to survive long enough to escape the creatures");
           System.out.println("grasp...");
           enter = next.nextLine();
           //when you take that straight path...
           System.out.println("It looks safe here... Shall we continue?");
           answer = responses.nextLine();
           //Choice doesn't matter...you still have to continue
           System.out.println("No time to think " + username + " the creatures are behind you...run");
           enter = next.nextLine();
           System.out.println("There are two diverging paths. Do you want to take the left or the right path?");
           answer = next.nextLine();
           if(answer.contains("left")) {
               System.out.println("You met a creature!");
               System.out.println(username + ", prepare yourself...");
               enter = next.nextLine();
               player_fights();
               //after you beat the monster you will go into another method which is a linked path...
               System.out.println("Congratulations you beat the monster"); {
               door2_linkedpath(); //this is the linked path with the straight path branch.
           }
           }else if (answer.contains("right")) {
               System.out.println("OH NO!!!" + username + " fell into the hole with razor sharp knives ");
               backtocheckpoint1_version2();
               
           }else{ //in case if the player mistypes the code, they will be punished by getting dragged back to an earlier checkpoint
               System.out.println(username +" Please retype your response correctly. ");
               System.out.println("There is no horse playing at a time like this... ");
               System.out.println("The monsters dragged you back...Luckily you escaped");
               enter = next.nextLine();
               System.out.println("Looks like you're back to the place where you just made your decision of taking the right path");
               door2challenge_rightpath(); 
           }
               
           
       }
       
       static void door2challenge_straightpath() { // straight branch of version 2 
           System.out.println("Oh Look! There is a creature charging directly at you");
           System.out.println("Brace Yourself " + username + "!!!");
           enter = next.nextLine();
           player_fights();
           //after you defeat the monster...
           System.out.println("Now there is another straight path up ahead take that path now.");
           enter = next.nextLine();
           System.out.println("Do you hear anything? Well, I don't. It must be safe for here...Shall we continue?");
           answer = responses.nextLine();
           System.out.println("WHA HA HA HA!!! VRMMMM!");
           enter = next.nextLine();
           System.out.println("You don't have much time...Hurry up and take the path!");
           enter = next.nextLine();
           System.out.println("Now there are two diverging paths. One leading you straight ahead and the other one ");
           System.out.println("curving to the right");
           System.out.println("Which path would you like to take straight or right?");
           answer = responses.nextLine();
           if(answer.contains("straight")) {
               System.out.println("AHHHH!!! The creatures trapped you... " + username + "!");
               System.out.println(username + " fell into the creatures grasp and was thrown into the molten rocks to burn.");
               backtocheckpoint1_version2();
           }else if(answer.contains("left")) {
               System.out.println("It appears to be safe");
               enter = next.nextLine();
               System.out.println("Let's sit for awhile and relax.");
               System.out.println("GET THAT " + username + "!");
               System.out.println("That kid is going to be killed when I come there!");
               //Here is a brief statement of the main antagonist of the game...More will be revealed as 
               //the player advances in the game.
               enter = next.nextLine();
               System.out.println("'Who's voice is that'/ Could that voice be the voice you heard as you gain your magic? ");
               enter = next.nextLine(); 
               //this hints to the later interaction between the witch and the player
               System.out.println("No time to sit...Hurry and move");
               enter = next.nextLine();
               door2_linkedpath();
               /*this is the path that links both branches the straight and the right branch that the
               player took in the beginning of the challenge.*/
          }
          
         
       }
       
       
       static void door2_linkedpath() {
           System.out.println("There is a straight path ahead take that route now if you want to live.");
           enter = next.nextLine();
           System.out.println("The path seems to be safe...");
           System.out.println("Let's take a break");
           System.out.println("MUHA HA HA HA!!!");
           System.out.println("Not again...Sorry " + username + ", break time is already over.");
           enter = next.nextLine();
           System.out.println("There is are three diverging paths...Which one do you want to cross?");
           System.out.println("The left, right , or straight path?");
           answer = responses.nextLine();
           if(answer.contains("left")) {
               System.out.println("Looks safe...");
               enter = next.nextLine();
               System.out.println("ROAR!!!! / AHHH!!!");
               System.out.println("The hounds tore you apart...");
               enter = next.nextLine();
               backtocheckpoint1_version2();//this will lead you back to the beginning of the challenge
           }else if (answer.contains("straight")) {
               System.out.println("BLOOPPP!!! You fell to your death!");
               enter = next.nextLine();
               //this was a dead end, as a result, the player will be transported back to the beginning of the challenge.
           }else{ //the player takes the right passage
               System.out.println("It appears to be safe... Let's just keep going");
               enter = next.nextLine();
               System.out.println("You met a creature...Let's show how good you've become!");
               enter = next.nextLine();
               player_fights();
               //after you beat the creature...
               System.out.println("You beat the creature...There seems to be an opening up ahead...Take the path.");
               enter = next.nextLine();
               completeddoor2challenge();
           }
       }
       
       static void backtocheckpoint1() {
           //Back to check point one version 1
           System.out.println("You came back to the main entrance of challenge 1...Are you ready to restart this challenge?");
           strings = responses.nextLine();
           Door1challenge();
       }
       
       static void backtocheckpoint1_version2() {
           //Back to check point one version 2
           System.out.println("You arrived to the main entrance of challenge 1... Are you ready to restart this challenge?");
           strings = responses.nextLine();
           if (strings.contains("n")) {
               System.out.println("It's not an option"); 
               backtocheckpoint1_version2();
           }else if (strings.contains("y")) { 
               Door2challenge();
           }else {
               System.out.println("I don't understand...type it correctly");
               backtocheckpoint1_version2();//in case the player types something else that the system can't read
           }
                   
                  
           
       }
       
       static void door1challenge_commonpath() {
            System.out.println("You completed the first task. Take the red key on the table.");
            System.out.println("Use it to unlock the next door.");
            enter = next.nextLine();
            enddoorsurvey();//this is when you finish the task and take a brief break
           
       }
       
       static void completeddoor2challenge() {
           System.out.println("You completed the first task. Take those red keys on the table.");
           System.out.println(username + " take the keys");
           enter = next.nextLine();
           System.out.println("Could this be the key to your survival?");
           enter = next.nextLine();
           enddoorsurvey();//this is when you are done with the task and follow up questions will began shortly.
           
    
}
       static void enddoorsurvey() {
           System.out.println("The small creatures that you have just encountered is just an introduction to your quest.");
           System.out.println("How do you feel about this? Good or bad?");
           answer = responses.nextLine();
           //talk about the keys
           if(answer.contains("good")) {
               System.out.println("Well " + username + ", you are going to like the rest of this journey.");
               redkeys_unlock();
           }else if(answer.contains("bad")) {
               System.out.println("Sucks for you, it was you that decided to read the spell book in the first place.");
               redkeys_unlock();
           }else{
               System.out.println("I don't understand...can you say that one more time?");
               enddoorsurvey();
           }
       }
       
       static void redkeys_unlock() {
           System.out.println(username + ", you now have the keys to unlock the doors. Hurry before they catch you!");
           enter = next.nextLine();
           System.out.println("You see a massive gate...Do you want to check it out?");
           answer = responses.nextLine();
           if(answer.contains("yes")) {
               System.out.println("The door seems to be locked...");
               System.out.println("perhaps you should use your red key and see what happens.");
               //red keys will allow you to go to challenge 2
               enter = next.nextLine();
               System.out.println("The door is unlocked. When you take a peak inside you see two different colored portals.");
               System.out.println(username + " take a better look inside.");
                answer = next.nextLine();
                portal_introduction();
           }else if(answer.contains("no")){
                   //this will introduce you to the next challenge
                   portal_denied();
                   //this will lead back to the living room where you will understand that you must go through the portals
               }else{
               System.out.println("I don't understand what you are trying to say... Please redo this again.");
               redkeys_unlock();
           }
           }
       
             //#method4();
       /* This method brings the player to the portals once the player has found the red keys and opened the door
          with the red key. As a result, the player will walk into a room where a mini sub-stroy will describe the
          next few challenges that the player will have to complete to win the game. I used a separate method in this case
          is for organizational means because the player is now at a new checkpoint in the game. So, it would be easier
          for me to recall this method once the player dies...
       */
       
       static void portal_introduction() {
           System.out.println("There are two portals that obviously lead to different paths.");
           enter = next.nextLine();
           System.out.println("You learned that in order to be teleported you must repeat a line and jump into the portal");
           System.out.println("Are you ready?");
           answer = next.nextLine();
           if(answer.contains("no")) {
               System.out.println("There's no turning back, you must go now!");
           }else if(answer.contains("yes")) {
               System.out.println("Alright...Which portal would you like to go through?");
               System.out.println("The Yellow or Red one");
               answer = responses.nextLine();
               //this is used to record the player's responses
               if(answer.contains("y")) { //this will lead player to yellow portal storyline
                   System.out.println("alright...say 'portal open for your master commands you' and then jump in");
                   //these are the lines that the protagonist will say and do to go to the next challenge
                   enter = next.nextLine();
                   System.out.println(username + " said ");
                   System.out.println(" 'portal open for your master commands you' ");
                   enter = next.nextLine();
                   System.out.println(username + " then jumps into the yellow portal.");
                   enter = next.nextLine();
                   yellowportal(); //this is where the player will be teleported into the Yellow River of China               
               }else if (answer.contains("r")) { // in the case if the player wants to chose the red portal
                   System.out.println("alright...say 'portal open for your master commands you' and then jump in");
                   //these are the lines that the protagonist will say and do to go to the next challenge
                   enter = next.nextLine();
                   System.out.println(username + " said ");
                   System.out.println(" 'portal open for your master commands you' ");
                   enter = next.nextLine();
                   System.out.println(username + " then jumps into the red portal.");
                   enter = next.nextLine();
                   redportal(); //this is where the player will be transported into the Amazon rainforest
               }
           }else{
               portal_introduction();
           }
       }
       
       static void yellowportal() { //The setting starts in the Yellow River in China. Intro to the challenge
           System.out.println( username + " closes the weary eyes that have witnessed so much chaos.");
           enter = next.nextLine();
           System.out.println("SWSSSS...SWSSSS...SWSSSS");//sound of flooding water
           System.out.println("What is this, why on earth are we in China...the Yellow River to be exact!");
           System.out.println("What does this have to do with anything...Did you say the right spell?");
           enter = next.nextLine();
           System.out.println("Blurp...Blurp...Floooosh...Blurp....");
           enter = next.nextLine();
           System.out.println("What is this...the river is rising. Quick run " + username + ".");
           enter = next.nextLine();
           System.out.println(username + " drowns in the river and wakes up weary from all the thrashing and swirming");
           System.out.println("from the day before");
           enter = next.nextLine();
           System.out.println( username + " just remembered what had happen.");
           System.out.println("You were thrown into the flooding waters and survived...how could have you survived this flood");
           enter = next.nextLine();
           System.out.println("You suddenly hear a crowd of people or creatures roaring...time to get up on your feet again.");
           //the yelling is caused by monsters 
           enter = next.nextLine();
           //a new protagonist/hero is here to support the player. The name is Separt. Separt will be involved within fights.
           System.out.println("Run to your left...stated a lizard");
           enter = next.nextLine();
           System.out.println("Wait... who are you? asked " + username);
           enter= next.nextLine();
           System.out.println("'The name is Separt");
           
           /*     #hero
              the player receives help from Separt, who becomes Naga at the boss fight...This character directs you to your 
              destination and aids in your fight.
           */
           
           System.out.println("I was the yellow portal that you summoned to come help you, stated Separt.");
           System.out.println("I am now your apprentice...you are my master.'");
           enter = next.nextLine();
           System.out.println("I guess you now have support ot help you fight these new monsters.");
           System.out.println("Separt came at good timing. These creatures are way stronger that the ones you have fought.");
           enter = next.nextLine();
           System.out.println("'We have to fight all of those creatures before you can destroy that wicked witch...'");
           System.out.println("stated Separt");
           enter = next.nextLine();
           System.out.println("Alright, lets kick some butts today!!!");
           play_yellowportal();//this is the battle arena that the player and his sidekick will play
       }
       
       static void redportal() { //The setting starts in the Amazon Rainforest where tribes of monkeys will hunt you down
           //intro to red portal
           System.out.println(username + " closes the weary eyes which have seen so much destruction lately.");
           enter = next.nextLine();
           System.out.println("Suddenly you hear rustles of leaves...where are you?");
           enter = next.nextLine();
           System.out.println("OOH OOH AHH AHH");
           enter = next.nextLine();
           System.out.println("Are those monkey sounds that you hear. Wait...");
           System.out.println("The monkeys, the trees, the portal...");
           enter = next.nextLine();
           System.out.println("You got transported into the Amazon Rainforest...What does this have to do with your survival");
           enter = next.nextLine();
           System.out.println("Watch out master " + username);
           enter = next.nextLine();
           System.out.println("Why is the ground shaking and did someone just say your name?");
           enter = next.nextLine();
           System.out.println("You see a gorilla rampaging towards you. AHHHHH!!!");
           enter = next.nextLine();
           System.out.println("'Don't worry, I'm not here to hurt you. I was summoned by you to provide support");
           System.out.println("I'm the red portal'");
           enter = next.nextLine();
           System.out.println("Wow! Spells really help you when you really need it.");
           System.out.println("What's your name " + username + " stated");
           enter = next.nextLine();
           /*   #hero
              the player has help from Kongo, which later becomes Naga to help aid in the boss fight. Kongo points out
              the directions
           */
           System.out.println("The names Kongo...");//new protagonist named Kongo will assist you in your battles
           enter = next.nextLine();
           System.out.println("'Look " + username + ", to kill that wicked witch you need to defeat those monkeys up there.'");
           System.out.println("stated Kongo.");
           enter = next.nextLine();
           System.out.println("Alright lets kick some butts today!!!");
           play_redportal();//this is the battle arena that the player and his sidekick will play
       }
       
       //this is where the second challenge begins in the yellow version
       static void play_yellowportal () {
           System.out.println("Here is challenge 2");
           System.out.println("In this challenge you would have to defeat all 5 levels without being killed...watch");
           System.out.println("out for your HP.");
           System.out.println("3...2...1...Ready-or Not...GO!!!");
           enter = next.nextLine();
           System.out.println("There is a large open clearance up ahead.");
           enter = next.nextLine();
           System.out.println(username + " hears loud noices and sees the grass rustling with life...brace yourself");
           yellow_fight();
           //after the player beats the enemy...
           System.out.println("Congratulations... this is gonna be a difficult journey and Separt can only lead the way.");
           enter = next.nextLine();
           System.out.println("There's too diverging paths that will lead to two different paths...");
           enter = next.nextLine();
           System.out.println("'Take the right path...I can sense that evil witch that way', said Separt");
           enter = next.nextLine();
           System.out.println(username +  " takes the right path");
           enter= next.nextLine();
           System.out.println("RUSTLE...RUSTLE...RUSTLE...");
           enter = next.nextLine();
           System.out.println("What's that noice...Let's get closer to check it out.");
           enter = next.nextLine();
           System.out.println(username + " and Separt walks through the big clearance. THEN...");
           enter = next.nextLine();
           System.out.println("BOOOM!!! OH NO!");
           yellow_fight();
           //after the player beats the enemy
           System.out.println("You're on a roll!");
           enter = next.nextLine();
           System.out.println("There is now three diverging paths...");
           enter = next.nextLine();
           System.out.println("'Take the straight path...That's the shortest way outta here...");
           enter = next.nextLine();
           System.out.println(username + " takes the straight path and reaches a bridge half filled with animal corpses.");
           System.out.println("YUCK! Separt exclaimed! 'That witch sure has a big appetite...'");
           enter = next.nextLine();
           System.out.println("HA! HA! HA!");
           enter = next.nextLine();
           System.out.println("Watch yourselves...something is coming from under the bridge!");
           yellow_fight();
           //after you win
           System.out.println("Alright...you got the hang of this now!");
           enter = next.nextLine();
           System.out.println("There is now two diverging paths...");
           enter = next.nextLine();
           System.out.println("Take the left one...I think it isn't a trap.");
           enter = next.nextLine();
           System.out.println(username + " takes the left path...");
           System.out.println("Looks like it is safe...Guess we got lucky!");
           enter = next.nextLine();
           System.out.println("Now there are three diverging paths...");
           enter = next.nextLine();
           System.out.println("'Take the straight path', said Separt.");
           System.out.println("That's the only way out. The other two are traps that will just bring you back to the beginning");
           System.out.println("Trust me...");
           enter = next.nextLine();
           System.out.println(username + " takes the straight path.");
           enter = next.nextLine();
           System.out.println("There is a large arena up ahead. Let's be prepared...");
           yellow_fight();
           //after you win
           System.out.println("Alright...let's finish this up...");
           enter = next.nextLine();
           System.out.println("Now there is only a straight path ahead...");
           System.out.println(username + " takes the straight path and sees a large black portal...");
           System.out.println("That will lead you to the...");
           enter = next.nextLine();
           System.out.println("BOOM! FLURP! FOOSH! POW!");
           yellow_fight();
           //after the player beats the enemy
           System.out.println("Gosh...that was rude. Please continue Separt" + username + " stated.");
           enter = next.nextLine();
           System.out.println("As I was saying...that is the path that will lead you to the wicked witch that is");
           System.out.println("Trying to hunt you down...Don't worry...I got your back...I'll help you in this battle");
           System.out.println("Shall we jump into the portal?");
           answer = responses.nextLine();
           if(answer.contains("n")) {
               System.out.println("We have no more time...the witch send more of her minions to take us on...");
               enter = next.nextLine();
               System.out.println(username + " prepares to jump");
           }else if(answer.contains("y")) {
               System.out.println("Alright get ready to jump!!!");
           }
           bossportal();
       } 
       
       //this is where the second challenge begins in the red version
       static void play_redportal () {
           System.out.println("Here is the second challenge");
           System.out.println("In this challenge you will have to defeat all the monkeys in 5 different levels.");
           System.out.println("Be careful...Your HP sets the boundaries");
           enter = next.nextLine();
           System.out.println("Alright...3...2...1...Ready- or NOT...GO!!!");
           enter = next.nextLine();
           System.out.println("There is a large open clearance up ahead.");
           enter = next.nextLine();
           System.out.println(username + " hears loud monkey sounds from above. BRACE YOURSELF!!!");
           red_fight();
           //after the player beats the enemy...
           System.out.println("Congratulations again... this is gonna be a difficult journey and Kongo can only lead the way.");
           enter = next.nextLine();
           System.out.println("There's three diverging paths that will lead to two different paths...");
           enter = next.nextLine();
           System.out.println("'Take the left path...I can sense the evil witch that way', said Kongo.");
           enter = next.nextLine();
           System.out.println(username +  " takes the right path");
           enter= next.nextLine();
           System.out.println("FRSSSH...FRSSHHH...WHOSHHH...");
           enter = next.nextLine();
           System.out.println("What's that noice...Let's get closer to check it out.");
           enter = next.nextLine();
           System.out.println(username + " and Kongo walked through the big clearance. THEN...");
           enter = next.nextLine();
           System.out.println("OOHHH!!! OOHHHH!!! AAHHH!!! AAHHH!!!  - OH NO...");
           red_fight();
           //after the player beats the enemy
           System.out.println("You're on a roll!");
           enter = next.nextLine();
           System.out.println("There is now two diverging paths...");
           enter = next.nextLine();
           System.out.println("'Take the straight path...That's the shortest way outta here...");
           enter = next.nextLine();
           System.out.println(username + " takes the straight path and arrives at the opening of a waterfall.");
           System.out.println("However, the water is black instead of a clear/pure water color...");
           System.out.println("YUCK! Separt exclaimed! 'That witch sure doesn't know how to clean up after herself...'");
           enter = next.nextLine();
           System.out.println("He! He! He!");
           enter = next.nextLine();
           System.out.println("Watch yourselves...something is emerging out of the water!");
           red_fight();
           //after you win
           System.out.println("Alright...you got the hang of this now!");
           enter = next.nextLine();
           System.out.println("There is now three diverging paths...");
           enter = next.nextLine();
           System.out.println("Take the left one...I think it isn't a trap.");
           enter = next.nextLine();
           System.out.println(username + " takes the left path...");
           System.out.println("Looks like it is safe...Guess we got lucky!");
           enter = next.nextLine();
           System.out.println("Now there are three diverging paths...");
           enter = next.nextLine();
           System.out.println("'Take the straight path', said Separt.");
           System.out.println("That's the only way out. The other two are traps that will just bring you back to the beginning");
           System.out.println("Trust me...");
           enter = next.nextLine();
           System.out.println(username + " takes the straight path.");
           enter = next.nextLine();
           System.out.println("There is a large arena up ahead. Let's be prepared...");
           enter = next.nextLine();
           System.out.println("ARRGH!!!");
           red_fight();
           //after you win
           System.out.println("Alright...let's finish this up...");
           enter = next.nextLine();
           System.out.println("Now there is only a straight path ahead...");
           System.out.println(username + " takes the straight path and sees a large black portal...");
           System.out.println("That will lead you to the...");
           enter = next.nextLine();
           System.out.println("BOOM! POW! VRRM! ARHGHHGH!");
           red_fight();
           //after the player beats the enemy
           System.out.println("'Gosh...that was rude. Please continue Kongo,'" + username + " stated.");
           enter = next.nextLine();
           System.out.println("As I was saying...that is the path that will lead us to the wicked witch that is");
           System.out.println("trying to hunt you down...Don't worry...I got your back...I'll help you in this battle");
           System.out.println("Shall we jump into the portal?");
           answer = responses.nextLine();
           if(answer.contains("n")) {
               System.out.println("We have no more time...the witch send more of her minions to take us on...");
               enter = next.nextLine();
               System.out.println(username + " prepares to jump");
           }else if(answer.contains("y")) {
               System.out.println("Alright get ready to jump!!!");
           }
           bossportal();
       } 
       
       
       static void portal_denied() { //this will take the player into the living room in which the player will understand that
                                     //they must turn back and go inside the portals.
           System.out.println("Ok...let's turn left and go to the living room");
           enter = next.nextLine();
           System.out.println("Wait!");
           enter = next.nextLine();
           System.out.println("What is that noice?");
           enter = next.nextLine();
           System.out.println("Creak...Creak...Creak...");
           System.out.println(username + " sees a thousand of creatures surrounding the living room.");
           System.out.println("I don't think it is a very good idea to take them on at once. They might look small,");
           System.out.println("but are extremely ferocious...I suggest you turn back");
           enter = next.nextLine();
           System.out.println( username + " returns to the portals");
           enter = next.nextLine();
           portal_introduction(); //this will take the player back to the portals that the player first had a choice to decide
                                  //whether or not he/she wanted to open the massive gate
       }
       
       static void bossportal() { 
           enter = next.nextLine();
           System.out.println(username + " jumps into the black portal and arrives inside a dungeon...");
           System.out.println("Hey...");
           enter = next.nextLine();
           System.out.println("What's happening your friend?");
           enter = next.nextLine();
           System.out.println("He's transforming...");
           enter = next.nextLine();
           System.out.println("A big black bulge surrounds your friend and a dragon appears. Is this your original friend...");
           enter = next.nextLine();
           System.out.println(username + " tries to run away, but is struck with fear. Then...");
           enter = next.nextLine();
           System.out.println("Don't worry...I'm still the same person. When I jump in a portal...The portal's energy");
           System.out.println("Leads to my transformation...Now I can use dark energy to help you defeat the witch.");
           enter = next.nextLine();
           System.out.println("Let's do this master...once and for all.");
           System.out.println("However, please call me by my new transformational name...NAGA");
           enter = next.nextLine();
           
           /*    #hero
             After the transformation Naga is a strong dragon that will help you defeat the wicked witch, who is the boss.
             Naga is a big help because it's now 2 against one..this means the boss is really hard...
           */
           
           System.out.println("Ok...NAGA. Let's finish this up!");
           enter = next.nextLine();
           bosschallenge();//final chapter of my long game
       }
       
       static void bosschallenge() { //the actual boss game play occurs here
           System.out.println("Naga and" + username + " are now ready to kick some butts... OH! Evil witch come out now!");
           enter = next.nextLine();
           System.out.println("You suddenly see a female figure with a purple wardrobe in front of you...");
           enter = next.nextLine();
           System.out.println("Been lookin for you all day. Where have you been?");
           System.out.println("That's the witch, Naga yelled!");
           enter = next.nextLine();
           System.out.println("It's time to end this nonsense...stated the witch. Prepare to be exterminated!");
           enter = next.nextLine();
           boss_fight();
           //after you exit boss fight you will go to 
           endgame();
       }
       
       static void boss_fight() { //this is where the fighting occurs
           miss_choice = miss.nextInt(2);//random used to determie a miss or a hit
           playerhealth = 3500;
           nagahealth = 3500;
           bosshealth = 10000;//#enemyobject-the actual boss that has created the game play(antagonsit)
           System.out.println("You have recently leveled up and have increased your HP to 3500. Be careful...");
           System.out.println("You can now cast 8 different types of spells...");
           enter = next.nextLine();
           System.out.println("These spells include fire, ice, wind, lightening, throw rocks, sacred sword, ");
           System.out.println("cosmic rays, and teleport");
           enter = next.nextLine();
           System.out.println("Naga has his own spells don't worry about him...");
           enter = next.nextLine();
           System.out.println("'I can use 3 different types of dark magic and 2 different types of normal attacks'");
           System.out.println("Don't worry, we got this "+ username + ".");
           enter = next.nextLine();
           System.out.println("ALL OR NOTHING!!! GHAAAA!!!");
           enter = next.nextLine();
           monsterisalive = true;
           //#while 
           /* while loop that will let players fight the boss */
           while(monsterisalive){
               System.out.println("It is your turn...which move will you use:");
               System.out.println("fire, ice, wind, lightening, throw rocks, sacred sword, cosmic rays, teleport, or heal.");
               attack = next.nextLine();
               if(attack.contains("fire")) {
                   System.out.println("Alright, I'm fired up...FOOOSH!!!");
                   bosshealth = bosshealth-30; //player deals damage
                   System.out.println("WHOA! The witch lost 30 HP. The boss now has " + bosshealth + " HP." );
                   enter = next.nextLine();
                   System.out.println("You now have " + playerhealth + " HP.");
               }else if(attack.contains("ice")) {
                   System.out.println("Alright, it's gonna be a little chilly...GHAAAA!!!");
                   bosshealth = bosshealth-20;
                   System.out.println("BRRR... The evil witch lost 20 HP. The boss now has " + bosshealth + " HP.");
                   enter = next.nextLine();
                   System.out.println("You now have " + playerhealth + " HP.");
               }else if(attack.contains("lightening")) {
                   System.out.println("Someone's gonna get fried today! ZAAAAP!!!");
                   bosshealth = bosshealth-40;
                   System.out.println("OUCH!!! The evil witch lost 40 HP. The boss now has " + bosshealth + " HP.");
                   enter = next.nextLine();
                   System.out.println("You now have " + playerhealth + " HP");
               }else if (attack.contains("throw rocks")) {
                   System.out.println("Incoming Boulder...BOOOOOMM!!!");
                   bosshealth = bosshealth-30;
                   System.out.println("The witch lost 30 HP. It now has " + bosshealth + " HP.");
                   enter = next.nextLine();
                   System.out.println("You now have " + playerhealth + " HP.");
               }else if (attack.contains("sacred sword")) {
                   System.out.println(username + " summons the guardians of the 9 sacred swords, and ");
                   System.out.println("the guardians released their swords to punish the wicked witch...");
                   enter = next.nextLine();
                   System.out.println("The 9 swords punctures the wicked releasing powerful, positive energy.");
                   bosshealth = bosshealth-150;
                   System.out.println("ZHHHHNGG!!! BOOOM!!! Ouch...the boss lost 150 HP. The boss now has " + bosshealth);
                   System.out.println("HP.");
                   enter = next.nextLine();
                   System.out.println("You now have " + playerhealth + " HP.");
               }else if (attack.contains("cosmic rays")) {
                   System.out.println(username + " casts a spell that absorbs all of the radiation from space...");
                   System.out.println("Then a large light bombards the witch and inflicts 130 HP.");
                   bosshealth = bosshealth-130;
                   enter = next.nextLine();
                   System.out.println("The boss now has " + bosshealth + " HP.");
                   enter = next.nextLine();
                   System.out.println(username + " now has " + playerhealth + " HP.");
               }else if (attack.contains("teleport")) {
                   System.out.println(username + " creates a blue portal and jumps inside the portal...");
                   enter = next.nextLine();
                   System.out.println(username + " then teleports behind the witch and strikes...Then jumps back in...");
                   enter = next.nextLine();
                   System.out.println("Then appears in the rear side and strikes the boss again and quickly disappears...");
                   enter = next.nextLine();
                   System.out.println("Finally..." + username + " strikes again on top of the witch.");
                   enter = next.nextLine();
                   bosshealth = bosshealth-210;
                   System.out.println("WOW!!!" + username + " inflicted 210 HP. The boss now has " + bosshealth + " HP.");
                   enter = next.nextLine();
                   System.out.println("You now have " + playerhealth + " HP.");
               }else if(attack.contains("wind")) {
                   System.out.println("Alright, let's finish this up...WHIRL!!!");
                   bosshealth = bosshealth-10;
                   System.out.println("The evil witch lost 10 HP. The boss now has " + bosshealth + " HP.");
                   enter = next.nextLine();
                   System.out.println("You now have " + playerhealth + " HP.");
               }else if (attack.contains("heal")){
                   healing_challenge3();
                   System.out.println("\n");
                   System.out.println(username + "'s HP increased 300 health points and now have " + playerhealth + ".");
                   System.out.println("The boss still has " + bosshealth + " HP.");
                   enter = next.nextLine();
               }else{
                   System.out.println("Please make sure you type everything correctly next time. You lost a turn...");
               }
               
               if(bosshealth <= zero) { //check to see if boss is still alive
                   System.out.println("You defeated the boss...Congratulations, you have won the war.");
                   enter = next.nextLine();
                   System.out.println("The witch has disappeared, vanished forever in a black hole that consumed the boss.");
                   enter = next.nextLine();
                   System.out.println("That is the last time you'll ever see that hideous thing ever again.");
                   monsterisalive = false;
                   endgame();
                   // It's Naga's turn
                }else if (bosshealth > zero) {
               System.out.println("It's Naga's turn...You can do this Naga!");
               naga_attacks = naga.nextInt(6);
               if(naga_attacks == 0){
                   System.out.println("Naga used shadow force...");
                   System.out.println("Naga disappears in a pitch black vortex...");
                   enter = next.nextLine();
                   System.out.println("GHAAAAR!!!");
                   enter = next.nextLine();
                   System.out.println("Naga flies out of his vortex and rams into the witch. YOUCH!");
                   System.out.println("The boss lost 180 HP.");
                   bosshealth = bosshealth-180;//Naga deals damage
                   enter = next.nextLine();
                   System.out.println("The evil witch now has " + bosshealth + " HP.");
                   enter = next.nextLine();
                   System.out.println("Naga now has " + nagahealth + " HP.");
               }else if (naga_attacks == 1) {
                   System.out.println("Naga used firebreath...A large dark ember sparks from naga's mouth and ");
                   System.out.println("begins to build up. The large black fire surrounds the witch and burns the witch");
                   enter = next.nextLine();
                   System.out.println("'ARGHH! You will pay for that', the witch screamed.");
                   enter = next.nextLine();
                   bosshealth = bosshealth-200;
                   System.out.println("WHOA!!! The fiery breath inflicted 200 HP. The boss now has" + bosshealth + " HP.");
                   enter = next.nextLine();
                   System.out.println("Naga now has " + nagahealth + " HP.");
               }else if (naga_attacks == 2) {
                   System.out.println("Naga used his blades of terror to torture the witch...");
                   System.out.println("Naga creates a strong whirlwind with his wings and released thousands of sharp");
                   System.out.println("scales that severely wounded the witch. SHINGG!!!");
                   enter = next.nextLine();
                   bosshealth = bosshealth-150;
                   System.out.println("OWWW!!! The boss lost 150 HP and now has " + bosshealth + "HP.");
                   enter = next.nextLine();
                   System.out.println("Naga now has " + nagahealth + " HP.");                 
               }else if (naga_attacks == 3) {
                   System.out.println("Naga used wings of Justice. ");
                   enter = next.nextLine();
                   System.out.println("Naga flies up high and plunges down toward the witch...");
                   System.out.println("Naga uppercuts the witch with his large wings and knocks the witch off her feet.");
                   enter = next.nextLine();
                   bosshealth = bosshealth-210;
                   System.out.println("YIKES!!! Naga inflicted 210 HP. The boss has " + bosshealth + " HP.");
                   enter = next.nextLine();
                   System.out.println("Naga now has " + nagahealth + " HP.");
               }else if (naga_attacks == 4) {
                   System.out.println("Naga used tail whip...");
                   System.out.println("SWWWSSS!!! BRMMM!!!");
                   System.out.println("Naga sets himself apart and lunges forward with his tail and thrusts the witch");
                   System.out.println("off the arena...");
                   enter = next.nextLine();
                   System.out.println("The witch teleports herself back into the arena, but loses 60 HP because of this.");
                   bosshealth = bosshealth-60;
                   System.out.println("The boss now has " + bosshealth + " HP.");
                   enter = next.nextLine();
                   System.out.println("Now Naga has " + nagahealth + " HP.");
               }else if (naga_attacks == 5) {
                   healing_naga_challenge3();
                   System.out.println("Naga now has " + nagahealth + " HP.");
                   System.out.println("\n");
                   System.out.println("The boss still has " + bosshealth + " HP.");
               }
                }
               
               if(bosshealth <= zero) { //check to see if boss is still alive
                   //#win
                   /* This is the conditions to win. The boss's health must equal to or less than zero. If you win the 
                      boolean monsterisalive is equal to false and the player will come to the endgame method to 
                      displayt he credits...
                   */
                   System.out.println("You defeated the boss...Congratulations, you have won the war.");
                   enter = next.nextLine();
                   System.out.println("The witch has disappeared, vanished forever in a black hole that consumed the boss.");
                   enter = next.nextLine();
                   System.out.println("That is the last time you'll ever see that hideous thing ever again.");
                   monsterisalive = false;
                   endgame();
                   //it's the boss's turn
               }else if (bosshealth > zero) { //if it is still greater than zero...
                   System.out.println("It's the monster's turn...brace yourselves");
                   System.out.println("'The witch has 8 different spells that she can use...she's very strong...");
                   System.out.println("BE CAREFUL,' stated Naga.");
                   enter = next.nextLine();
                   System.out.println("Are you ready to feel what pain really is? Prepare yourself...");
                   System.out.println("ARGGHHH!!! BRRRM!!!");
                   enter = next.nextLine();
                   System.out.println("Naga and "+ username + " are on their guard ready to defend against the witches attacks");
                   enter = next.nextLine();
                   System.out.println("Here I go...");
                   enter = next.nextLine();
                   which = pick.nextInt(2);//decide which one will get hit: player or Naga
                   boss_attacks = boss.nextInt(9);//decides which
                   if (boss_attacks == 0) {
                       System.out.println("'Night Shadow!'");
                       //this will determine which player gets hit; you or Naga
                       if(which == 0) { //player gets hit
                           enter = next.nextLine();
                           System.out.println("The witch summons a dark cloud from above with her staff...");
                           enter = next.nextLine();
                           /* #enemyobject
                            The witch affects the protagonist/player by harming the player's health through savage attacks that 
                            inflicts large amounts of damage to the player. 
                           */
                           System.out.println("The dark cloud duplicates and strikes " + username + ".");
                           enter = next.nextLine();
                           System.out.println("Ouch " + username + " loses 200 HP.");
                           playerhealth = playerhealth-200;
                           System.out.println(username + " now has " + playerhealth + " HP.");
                           enter = next.nextLine();
                           System.out.println("The boss has " + bosshealth + " HP.");
                       }else if (which == 1) { //naga gets hit
                           enter = next.nextLine();
                           System.out.println("The witch summons a dark cloud from above with her staff...");
                           enter = next.nextLine();
                           System.out.println("The dark cloud duplicates and strikes Naga. Naga collapses");
                           enter = next.nextLine();
                           System.out.println("Ouch Naga loses 200 HP.");
                           nagahealth = nagahealth-200;
                           System.out.println("Naga now has " + nagahealth + " HP.");
                           enter = next.nextLine();
                           System.out.println("The boss has " + bosshealth + " HP.");
                       }
                   }else if (boss_attacks == 1) {
                       System.out.println("'Shadow Blade!'");
                       //this will determine who will get hit
                       if (which == 0) { // player gets hit
                           System.out.println("The witch's staff transforms into a deadly blade.");
                           System.out.println("The blade has " + username + "'s face on the back...");
                           enter = next.nextLine();
                           System.out.println("Watch out " + username + ". She's on to you...");
                           enter = next.nextLine();
                           System.out.println("The witch charges up and strikes " + username + ".");
                           System.out.println("SLASH...SHING!!!");
                           enter = next.nextLine();
                           System.out.println("OUCH!!! " + username + " loses 150 HP.");
                           playerhealth = playerhealth-150;
                           System.out.println(username + " now has " + playerhealth + " HP.");
                           enter = next.nextLine();
                           System.out.println("The boss has " + bosshealth + " HP.");
                       }else if (which == 1) { //naga gets hit
                           System.out.println("The witch's staff transforms into a deadly blade.");
                           System.out.println("The blade has a black dragon symbol on the edge...");
                           enter = next.nextLine();
                           System.out.println("'Naga she's on to you. WATCH OUT!' " + username + " screams.");
                           System.out.println("SLASH...SHING!!!");
                           enter = next.nextLine();
                           System.out.println("OUCH!!! naga loses 150 HP.");
                           nagahealth = nagahealth-150;
                           System.out.println("Naga now has " + nagahealth +  " HP.");
                           enter = next.nextLine();
                           System.out.println("The boss now has " + bosshealth + " HP.");
                       }
                   }else if (boss_attacks == 2) {
                       System.out.println("Dragon spiral!");
                       if(which == 0) { //player gets hit
                           System.out.println("The witch summons a red and purple dragon underground...");
                           System.out.println("The red and purple dragon shoots out red and purple flames that fuse");
                           System.out.println("together to form a gigantic half red and purple flame.");
                           enter = next.nextLine();
                           System.out.println("Look out " + username + ".");
                           System.out.println("FOOOSH!!! The burning lava like embers engulf " + username + ".");
                           enter = next.nextLine();
                           System.out.println("ARRHHH!!! " + username + " loses 300 HP.");
                           playerhealth = playerhealth-300;
                           System.out.println(username + " now has " + playerhealth + " HP.");
                           enter = next.nextLine();
                           System.out.println("The boss has " + bosshealth + " HP.");
                       }else if (which == 1) { //naga gets hit
                           System.out.println("The witch summons a red and purple dragon underground...");
                           System.out.println("The red and purple dragon shoots out red and purple flames that fuse");
                           System.out.println("together to form a gigantic half red and purple flame.");
                           enter = next.nextLine();
                           System.out.println("'Look out Naga,' " + username + " stated.");
                           System.out.println("FOOOSH!!! The burning lava like embers engulf Naga.");
                           enter = next.nextLine();
                           System.out.println("ARRHHH!!! Naga loses 300 HP.");
                           nagahealth = nagahealth-300;
                           System.out.println("Naga now has " + nagahealth + " HP.");
                           enter = next.nextLine();
                           System.out.println("The boss has " + bosshealth + " HP.");
                       }
                   }else if (boss_attacks == 3) {
                       System.out.println("Take over");
                       enter = next.nextLine();
                       System.out.println("The witch summons the demons and releases them from a black portal she created");
                       System.out.println("Gouls, bats, and other hideous creatures emerged from the darkness");
                       if(which == 0) {// player gets hit
                           System.out.println("The creatures targets " + username + ".");
                           enter = next.nextLine();
                           System.out.println("Watch out " + username + ".");
                           System.out.println("GARRRL!!! SCRAA!!! FOOSHING!!!");
                           enter = next.nextLine();
                           System.out.println("AHHH!!! " + username + " gets bitten, beaten, and scratched ...");
                           playerhealth = playerhealth-50;
                           System.out.println(username + " loses 50 HP. You now have " + playerhealth + " HP.");
                           enter = next.nextLine();
                           System.out.println("The boss has " + bosshealth + " HP.");
                       }else if (which == 1) {
                           System.out.println("The creatures targets Naga.");
                           enter = next.nextLine();
                           System.out.println("'Watch out Naga,' " + username + " stated.");
                           System.out.println("GARRRRL!!! SCRAAA!!! FOOOSHHING!!!");
                           enter = next.nextLine();
                           nagahealth = nagahealth-50;
                           System.out.println("ARRGGG!!! Naga loses 50 HP. Naga now has " + nagahealth + " HP.");
                           enter = next.nextLine();
                           System.out.println("The boss now has " + bosshealth + " HP.");
                       }
                   }else if (boss_attacks == 4) {
                       System.out.println("dark cosmic swords!!!");
                       System.out.println("GHAAA!!!");
                       enter = next.nextLine();
                       System.out.println("There are 5 darks lands in her reign, which means 5 different swords in her possession.");
                       System.out.println("Sword 1 released fire...");
                       System.out.println("FOOSHHH!!!");
                       enter = next.nextLine();
                       System.out.println("Sword 2 released water...");
                       System.out.println("GURLG!!! FSHHH!!!");
                       enter = next.nextLine();
                       System.out.println("Sword 3 released ice...");
                       System.out.println("SHING!!! BRRRRR!!!");
                       enter = next.nextLine();
                       System.out.println("Sword 4 released wind...");
                       System.out.println("WHIRL!!! WHIRL!!! GUSHHH!!!");
                       enter = next.nextLine();
                       System.out.println("Sword 5 released lightening...");
                       System.out.println("ZHNGGG!!! BAM!!!! BRVRMM!!!");
                       System.out.println("The ground ruptures and collides on " + username + " and Naga.");
                       enter = next.nextLine();
                       System.out.println("These swords have just released the dark elements of the earth!");
                       System.out.println("YOUCH!!! Both Naga and " + username + " lost 220 HP.");
                       enter = next.nextLine();
                       playerhealth = playerhealth-220;
                       nagahealth = nagahealth-220;
                       System.out.println(username + " now has  " + playerhealth + " HP and Naga has " + nagahealth + " HP.");
                       enter = next.nextLine();
                       System.out.println("The boss now has " + bosshealth + " HP.");
                   }else if (boss_attacks == 5) {
                       System.out.println("Knock down!");
                       if(miss_choice == 0) {//boss miss
                           System.out.println("The witch summons a dark spell from her staff.");
                           enter = next.nextLine();
                           System.out.println("An evil figure lurks in the shadows...'Can you see it Naga?' ");
                           System.out.println(username + " said.");
                           enter = next.nextLine();
                           System.out.println("'No...I can't see a thing.");
                           enter = next.nextLine();
                           System.out.println("Suddenly, you see a big shadow coming at Naga.");
                           enter = next.nextLine();
                           System.out.println(username + " sends a fireball flying at the shadowy figure and it disappears.");
                           System.out.println("Naga then sees the figure coming towards " + username + " and sends a flame");
                           System.out.println("at the shadow...The figure plunges back into the witches staff. ");
                           enter = next.nextLine();
                           System.out.println("'I guess you saw that coming, won't happen ever again!' the witch exclaimed.");
                           enter = next.nextLine();
                           System.out.println("You dodged the witches attack!");
                           enter = next.nextLine();
                           playerhealth = playerhealth-0;
                           nagahealth = nagahealth-0;
                           System.out.println(username + " still has " + playerhealth + " HP.");
                           System.out.println("Naga still has " + nagahealth + " HP.");
                           System.out.println("The boss has " + bosshealth + " HP.");
                       }else if (miss_choice == 1) { //boss hits
                           System.out.println("The witch summons a dark spell from her staff.");
                           enter = next.nextLine();
                           System.out.println("An evil figure lurks in the shadows...'Can you see it Naga?' ");
                           System.out.println(username + " said.");
                           enter = next.nextLine();
                           System.out.println("'No...I can't see a thing.");
                           enter = next.nextLine();
                           System.out.println("Suddenly, you see a big shadow coming at Naga.");
                           enter = next.nextLine();
                           System.out.println(username + " sends a fireball flying at the shadowy figure, but you missed!");
                           System.out.println("The shadowy figure steals 50 HP of Naga's health.");
                           nagahealth = nagahealth-50;
                           System.out.println("Naga now has " + nagahealth + " HP.");
                           enter = next.nextLine();
                           System.out.println("The shadowy figure then turns towards " + username + ".");
                           System.out.println("Naga spits out a large fire, but misses the figure...");
                           System.out.println("The shadowy figure steals 50 HP of " + username + ".");
                           playerhealth = playerhealth-50;
                           System.out.println(username + " still has " + playerhealth + " HP.");
                           enter = next.nextLine();
                           System.out.println("The boss has " + bosshealth + " HP.");
                       }
                   }else if (boss_attacks == 6) {
                       System.out.println("Volcanic Eruption!");
                       if(miss_choice == 0) {//the boss misses
                           System.out.println("The witch casts a spell that creates a series of volcanoes around you.");
                           System.out.println("The witch then forces the volcanoes to spit lava out...");
                           System.out.println("However, you saw that coming already. You and Naga jumped out of the way");
                           enter = next.nextLine();
                           System.out.println("You dodged the attack!");
                           playerhealth = playerhealth-0;
                           nagahealth = nagahealth-0;
                           System.out.println(username + " has " + playerhealth + " HP, and Naga has " + nagahealth + " HP.");
                           enter = next.nextLine();
                           System.out.println("The boss has " + bosshealth + " HP.");
                       }else if (miss_choice == 1) {//the boss is able to hit you
                           System.out.println("The witch summons the evil lava guardian...");
                           System.out.println("She then points her staff directly at...");
                           if(which == 0){//player gets hit
                               System.out.println(username);
                               enter = next.nextLine();
                               System.out.println("Watch out!!!");
                               System.out.println("GURGLLE!!! FSH!!!");
                               System.out.println("The lava erupts like a fountain lake and basks " + username + ".");
                               System.out.println(username + " loses 100 HP.");
                               enter = next.nextLine();
                               playerhealth = playerhealth-100;
                               System.out.println(username + " now has " + playerhealth + " HP.");
                               System.out.println("Naga now has " + nagahealth + " HP.");
                               System.out.println("The boss now has " + bosshealth + " HP.");
                           }else if (which == 1){ //naga gets hit
                               System.out.println("Naga");
                               enter = next.nextLine();
                               System.out.println("Watch out!");
                               System.out.println("GURGLRE!!! FSH!!!");
                               System.out.println("The lava shoots out at Naga's face, feet, and back...");
                               System.out.println("Removing all of his scales in the process");
                               System.out.println("Naga loses 100 HP.");
                               enter = next.nextLine();
                               nagahealth = nagahealth-100;
                               System.out.println(username + " has " + playerhealth + " HP.");
                               System.out.println("Naga has " + nagahealth + " HP.");
                               System.out.println("The boss has " + bosshealth + " HP.");
                           }
                       }
                   }else if (boss_attacks == 7) {
                       System.out.println("Satin's Spear");
                       System.out.println("The witch uses her staff to summon her friend Satin...");
                       enter = next.nextLine();
                       System.out.println("EXTERMINATE THEM!!!");
                       if(miss_choice == 0){ //boss missed
                           System.out.println("Yes ma'm...");
                           System.out.println("Statin launches his spear...");
                           enter = next.nextLine();
                           System.out.println("BUT, Naga and " + username + " were able to dodge the attack!");
                           System.out.println("MISS!");
                           enter = next.nextLine();
                           System.out.println("OOPS!");
                           playerhealth = playerhealth-0;
                           nagahealth = nagahealth-0;
                           System.out.println(username + " has " + playerhealth + " and Naga has " + nagahealth + " HP.");
                           System.out.println("The boss has "+ bosshealth + " HP.");
                       }else if(miss_choice == 1){//boss gets a hit
                           System.out.println("Yes ma'm...");
                           System.out.println("URGGGHAAA!!!");
                           enter = next.nextLine();
                           System.out.println("Satin launches his spear, which duplicated...");
                           System.out.println("The spear is still launching up on the air...");
                           enter = next.nextLine();
                           if(which == 0) { //player gets hit
                               System.out.println(username + " wants to protect his friend so he jumps forward to block");
                               System.out.println("the threatening spear from piercing his friend...");
                               enter = next.nextLine();
                               System.out.println("However, in doing so the spear lands on " + username + ".");
                               System.out.println("The spear erupts into pieces, shattering " + username + "'s legs.");
                               enter = next.nextLine();
                               System.out.println("The wound heals but inflicts 300 damage to " + username + ".");
                               playerhealth = playerhealth-300;
                               System.out.println(username + " has " + playerhealth + " HP.");
                           }else if(which == 1) { //Naga gets hit
                               System.out.println("Naga tries to shield " + username + " and successfully does.");
                               System.out.println("BUT, in doing so the spear pierces Naga's well-armored belly.");
                               enter = next.nextLine();
                               System.out.println("The spear automatically drills deeper until Naga can't fight anymore...");
                               System.out.println("The wound heals, but dealt 300 damage to Naga.");
                               nagahealth = nagahealth-300;
                               System.out.println("Naga now has " + nagahealth + " HP.");
                           }
                       }
                       System.out.println("The boss now has " + bosshealth + " HP.");
                   }else if (boss_attacks == 8) {
                       System.out.println("Health Spell...");
                       System.out.println("The evil witch raised her staff and a blue vortex emerged.");
                       System.out.println("\n");
                       System.out.println("However, the witch suddenly jumps into the vortex and after a while jumps out.");
                       System.out.println("OH NO!!! She tried to heal herself...");
                       bosshealth = bosshealth + 350;
                       if(bosshealth == 10000) {
                           System.out.println("She already had a maximum health of " + bosshealth + " HP. So it didn't work.");
                           System.out.println("\n");
                       }else if(bosshealth > 10000) {
                           bosshealth = 10000;
                           System.out.println("The boss currently now " + bosshealth + " HP.");
                       }else{
                           System.out.println("The boss now has " + bosshealth + " HP.");
                       }
                   }
               }
               //#lose-player loses all of HP 
               if(playerhealth <= zero) { //in case player loses all of his/her health
                   System.out.println("OH NO!!!" + username + " lost was defeated!");
                   System.out.println("Naga currently has " + nagahealth + " HP.");
                   System.out.println("Better luck next time...");
                   monsterisalive = false;
                   replaybossfight();
               }
               //#lose-naga's HP is equal to or less than zero
               if(nagahealth <= zero) { // in case Naga loses all of his/her health
                   System.out.println("OH NO!!! Naga lost all of his health and was defeated!");
                   System.out.println(username + " currently has " + playerhealth + " HP.");
                   System.out.println("Better luck next time...");
                   monsterisalive = false;
                   replaybossfight();
               }
               
           }
           
       }
       
       static void replaybossfight() {//#forthelose
           //player continues to play until they win.
           System.out.println("I guess you couldn't survive the intense battle.");
           System.out.println("Every battle that you have fought before is just a preparation for this battle...");
           System.out.println("Trust me, NOTHING IS GONNA GET EASIER!");
           enter = next.nextLine();
           System.out.println("There is the blue portal again...Jump into it to replay the boss. Remember your life");
           System.out.println("depends on this final battle...Naga gots your back. Just be careful and use your head.");
           enter = next.nextLine();
           System.out.println("Are you ready to restart the battle?");
           answer = responses.nextLine();
           if(answer.contains("y")) {
               System.out.println("Alright take a deep breath and jump in. Naga is waiting for you on the other side.");
               enter = next.nextLine();
               System.out.println(username + " closes his weary eyes and jumps into the blue portal again...");
               bosschallenge();
           }else if (answer.contains("no")) {
               System.out.println("There's no time for foolishness, get into that portal right now unless you want to die.");
               enter = next.nextLine();
               System.out.println(username + " slowly walked into the portal, tired but still hopeful");
               bosschallenge();
           }else {
               System.out.println("I don't understand, please answer yes or no...");
               replaybossfight();
           }
       }
       
       static void endgame() {//#forthewin
           //after you beat the boss, the player wins and is finished with the game...
           System.out.println("MARK MY WORDS... THIS ISN'T THE END YET!");
           System.out.println("Don't listen to her, she's just mad that she'll have to spend her eternal life in that black cell.");
           enter = next.nextLine();
           System.out.println("The black portal gradually closes...lasting for only minutes until it exploded.");
           System.out.println("The portal was gone and so was that evil witch...WAIT");
           System.out.println("How about you Naga?");
           enter = next.nextLine();
           System.out.println("My duty is done and I'm free from your grasp. Farewell...");
           enter = next.nextLine();
           System.out.println("The black dragon creates a big black vortex that consumed Naga, his recent friend.");
           enter = next.nextLine();
           System.out.println("The black dragon bids his farewell and the black portal too exploded out of sight.");
           System.out.println("He was sent to accompany " + username + " to defeat his enemy, the witch.");
           System.out.println("His job is done and he must return back to the dragon world...or whatever dimension he lived in");
           enter = next.nextLine();
           System.out.println("I guess this is a lesson. Don't read wierd books...they don't end so well.");
           System.out.println("/n");
           System.out.println("/n");
           System.out.println("Well, congratulations again " + username + " for defeating the boss.");
           enter = next.nextLine();
           System.out.println(username + " casts a purple portal and teleports to his hometown...everything looks fine");
           enter = next.nextLine();
           System.out.println("OR IS IT? / 'I'm back. DID YOU MISS ME?'");
           System.out.println("/n");
           System.out.println("THANKS FOR PLAYING " + username + ".");
           gameplay = false;//end the main while loop
       }
       
       static void healing_challenge2() { //this is where the player will be able to heal himself/herself in red/yellow portal challenge
           System.out.println(username + " opens up the bag to check if there are any potions left in there...");
           enter = next.nextLine();
           if(potions <= zero) {
               System.out.println(username + " feels something in the bag...");
               System.out.println("\n");
               System.out.println("GASP!!! It's just a sock from granny Boo.");
               enter = next.nextLine();
               System.out.println("UH! OH! You have no more potions left, SORRY YOU'RE ON YOUR OWN...");
               System.out.println("\n");
           }else if(potions > zero && playerhealth != 310) {
               System.out.println(username + " found a potion in the bag...");
               System.out.println(username + " takes the red potion, throws the cap, and slowly let the potion heal the wounds.");
               System.out.println(username + " gained 80 HP points.");
               playerhealth = playerhealth + 80; //player's health is healed
               potions--;
               if(playerhealth > 310){ //in case of player heals and adds 80 and health goes higher than 310
                   playerhealth = 310;
               }
               //in case if player tries to increase their health over the maximum
           }else if(playerhealth == 310) {
               System.out.println("You are at maximum health.");
           }
    }   
               //#method5()
       /* This method will constantly be called because everytime the player fights, he/she will be given the 
          opportunity to heal. As a result, I used this method to prevent the redundant typing of the same set of codes
          when the player wants to heal. This method will first check whether or not the player has any health potions
          left. If the player does, the program will check if the player's health is set to the conditions, such as below
          3500, equal to 3500, or over 3500. Depending on the conditions that are satisfied, the game will decide if the 
          player is able to take the potion.
       */
       static void healing_challenge3() { //this is where the player will be able to heal himself/herself in boss challenge
           System.out.println(" You open up the bag to check your inventory...");
           enter = next.nextLine();
           if(potions <= zero) {
                System.out.println(username + " feels something in the bag...");
                System.out.println("\n");
                System.out.println("There is a large object inside, but turns out to be your spell book");
                enter = next.nextLine();
                System.out.println("UH! OH! You ran out of potions. GUESS YOUR ON YOUR OWN!!!");
                System.out.println("\n");
           }else if(potions > zero && playerhealth != 3500) { //this makes sure their aren't any loop holes in the game for cheats
               System.out.println(username + " found a potion in the bag.");
               System.out.println(username + " takes the new blue potion and consumes it entirely...");
               System.out.println(username + " gained 300 HP points.");
               playerhealth = playerhealth + 300; //player's health is healed
               potions--;//put it like this, not potions = potions--; This would break the game...
               if(playerhealth > 3500){ //in case that player heals and adds 300 and health goes higher than maixmum
                   playerhealth = 3500;
               }
               //in case if player tries to cheat with the maximum health
           }else if (playerhealth == 3500) {
               System.out.println("You are at your maximum health...You can't raise it any higher than that...");
               System.out.println("NICE TRY!");
           }          
       }
       
       static void healing_naga_challenge3 () {
            System.out.println("Naga uses his fiery breath to ease the pains that have inflicted many wounds...");
            System.out.println("A huge flame engulfs Naga and creates a large ember like a dragon-shaped ball.");
            enter = next.nextLine();
            if(nagahealth == 3500) {
                System.out.println("Naga couldn't regain any health because he has maximum health...NICE TRY!");
                nagahealth = 3500;
            }else if (nagahealth < 3500) {
                System.out.println("Naga's wounds are all healed from the internal fire.");
                nagahealth = nagahealth + 300;
                potions--;
                if(nagahealth > 3500) {
                    nagahealth = 3500;
                }
            }
       }
}                                   
