package mypack;

public class Main {

    public static void main(String[] args) {
      pack1.Player1 player1 = new pack1.Player1("Bindu","sword",100);
          System.out.println("player1 Details:\n");
          System.out.println(player1.getName());
          System.out.println(player1.getHealth());
          System.out.println(player1.getWeapon());
      
      pack1.Player1 player1 = new pack1.Player1("Raghu","sword",100,true);
          System.out.println("player2 Details:\n");
          System.out.println(player2.getName());
          System.out.println(player2.getHealth());
          System.out.println(player2.getWeapon());

      player2.damageByGun1();
      player2.damageByGun2();
      
    }

}
