package StudyKasus;

import java.util.Random;

public class main {
    public static void main(String[] args) {
//        membuat random nomor
        Random randomNumberGenerator = new Random();
        
//        membuat dua angka acak untuk memulai nyawa player dan enemy
        int hp1 = randomNumberGenerator.nextInt(100);
        int hp2 = randomNumberGenerator.nextInt(100);
        
//        membuat dua angka acak untuk memulai kecepatan player dan enemy
        int speed1 = randomNumberGenerator.nextInt(60);
        int speed2 = randomNumberGenerator.nextInt(60);
        
//        membuat objek baru
        Player player = new Player(hp1, speed1);
        Enemy enemy = new Enemy(hp2, speed2);
        
        System.out.println("\nPemain dan musuh sudah dibuat. Saatnya perang!\n");
        
        while(!player.isIsDead() && !enemy.isIsDead()){
//        menyerang satu sama lain
        player.attack(enemy);
        enemy.attack(player);
            
//        mengecek siapa yang masih hidup
        if(player.isIsDead()){
            System.out.println("/nWonder Women meninggal!!!"+
                    "\nPemenangnya Goblin!!!");
        }
        if(enemy.isIsDead()){
            System.out.println("\nGoblin meninggal!!!"+
                    "\nPemenangnya Wonder Women!!!");
        }
        }
    }
}