package udemy;

import java.util.Random;
import java.util.Scanner;

public class GameProject {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
    Random rand= new Random();
    
    //Game points
    String[] enemies= {"Skeleton", "Zombies", "Warrior", "Assassin"};
    int maxenemyhealty=100;
    int enemyattackdamage=25;
    
    //player variable
    int health=100;
    int attackdamage=50;
    int numhealthpotion=3;
    int healtpotionamount=30;
    int healtpotiondropchance=50;//percentage
    
    Boolean running=true;
    System.out.println("   welcome the dungeon!");
    
    GAME:
    while(running) {
    	System.out.println("---------------------------");
    	int enemyhealty=rand.nextInt(maxenemyhealty);
    	String enemy=enemies[rand.nextInt(enemies.length)];
    	System.out.println("\t# " + enemy + " has appeared! #\n");
    	
    
    while(enemyhealty>0) {
    System.out.println("\tyour HP: " + health);	
    System.out.println("\t" + enemy + "'s HP: " + enemyhealty);
    System.out.println("\n\tWHAT WOULD YOU LİKE TO DO?"); 
    System.out.println("\t1. ATTACK");
    System.out.println("\t2. DRİNK HEALTH POTİON");
    System.out.println("\t3. RUN!");
    
    String input1=input.nextLine();
    if(input1.equals("1")) {
    	int damageDealt=rand.nextInt(attackdamage);
    	int damageTaken=rand.nextInt(enemyattackdamage);
    	enemyhealty= enemyhealty-damageDealt;
    	health= health-damageTaken;
    	
    	System.out.println("\t> you strike the "+ enemy+ " for "+ damageDealt+ " damage.");
    	System.out.println("\t> you receive "+ damageTaken + " in retaliation!");
    	
    	if(health<1) {
    		System.out.println("\t you have taken so much damage, you are too weak to go on!");
    		break;
    	}
    }
    else if(input1.equals("2")) {
    	if(numhealthpotion>0) {
    		health=health+healtpotionamount;
    		numhealthpotion--;
    		System.out.println("\t> you drink health potion, healing yourself for " + healtpotionamount + "." + "\n\t> you have now " + health + "HP." + "\n\t> you have "
    				+ numhealthpotion +" health potions left.\n" );
    	}
    	else {
    		System.out.println("\t> you have no health potions left! defeat enemies for a chance to get one!");
    	}
    	
    }
    else if(input1.equals("3")) {
    	System.out.println("\t you run away from the "+ enemy + "!");
    	continue GAME;
    }
    else {
    	System.out.println("\t !! invalid comman !!\n");
    	
    }
    }
    if(health<1) {
    	System.out.println("you limp out of dungeon, weak from bottle");
    	break;
    }
    System.out.println("----------------------------------");
    System.out.println(" # " + enemy + " was defeated! # ");
    System.out.println(" # you have " + health + " HP left. # ");
    if(rand.nextInt(100)<healtpotiondropchance) {
    	numhealthpotion++;
    	System.out.println("# the " + enemy + " dropped a health potion! #  ");
    	System.out.println(" you now have " + numhealthpotion + " health potion(s). # ");
    }
    System.out.println("-----------------");
    System.out.println("What would you like to do now?");
    System.out.println("1. continue fighting");
    System.out.println("2. exit dungeon");
    
    String input1=input.next();
    
    while(input1.equals("1") && input1.equals("2")) {
    	System.out.println("invalid command! ");
    	input1=input.next();
    }
    if(input1.equals("1")) {
    	System.out.println(" go on your adventure");
    }
    else if(input1.equals("2")) {
    	System.out.println("you exit the dungeon, succesful your adventures");
    	break;
    }
    }
    System.out.println("##################");
    System.out.println("# THANKS FOR PLAY #");
    System.out.println("##################");
	}

}
