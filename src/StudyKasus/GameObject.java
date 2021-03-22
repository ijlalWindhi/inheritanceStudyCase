package StudyKasus;
import java.util.Random;
public class GameObject {
    
//    membuat attribute
    private String name;
    private int hp;
    private int damage;
    private boolean isDead;
    private int speed;

//    konstrutor
    public GameObject(String name, int hp, int speed) {
        super();
        this.name = name;
        this.hp = hp;
        this.speed = speed;
        System.out.println(this.name+" telah hadir dengan nyawa " +this.hp+
                " dan kecepatan "+this.speed);
    }
    
    public void attack(GameObject opponent){
//        membuat nomor acak antara 1-10
        Random randomNumberGenerator = new Random();
        damage = randomNumberGenerator.nextInt(10);
//        poin kesehatan dan kecepatan substack dari lawan
        opponent.defend(damage);
        System.out.println(opponent.getName()+" terkena serangan sebanyak "
                + damage + " point. Nyawa tersisa "+opponent.getHp());
        opponent.run(damage);
        System.out.println(opponent.getName()+" terkena serangan sebanyak "
                + damage + " point. Kecepatan berkurang menjadi "
                +opponent.getSpeed());
        System.out.println();
    }

/*    method untuk mengecek apakah pemain meninggal, jika tidak akan ditampilkan
    sisa nyawa*/
    public void defend(int damageTaken){
        if(this.getHp() - damageTaken <= 0){
            this.setHp(0);
            this.setIsDead(true);
        }else{
            this.setHp(this.hp - damageTaken);
        }
    }
    
//    method untuk memberikan berapa kecepatan pemain setelah terkena damage
    public void run(int damageTaken){
        if(this.getSpeed() - damageTaken <= 0){
            this.setSpeed(0);
        }else{
            this.setSpeed(this.speed - damageTaken);
        }
    }
    
//    getter dan setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isIsDead() {
        return isDead;
    }

    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
