
public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Thor");
        hero1.setRole("Warrior");
        Hero hero2 = new Hero("Groot");
        hero2.setRole("Thief");
        Hero hero3 = new Hero("Doctor Strange");
        hero3.setRole("Wizard");

        Party party = new Party();
        party.addHero(hero1, 0);
        party.addHero(hero2, 1);
        party.addHero(hero3, 2);

        party.gainExperience(100); 
        System.out.println(party);
    }
}
