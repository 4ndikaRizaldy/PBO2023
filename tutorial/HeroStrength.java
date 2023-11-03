package tutorial;

//Child Class
public class HeroStrength extends Hero {
    void display(){
        System.out.println("Hero: " + this.nama);
        System.out.println("Heronya adalah " + super.nama);
    }
}
