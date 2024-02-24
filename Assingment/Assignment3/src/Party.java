
public class Party {
	 private Hero[] heroes = new Hero[3];
	 
     public Party() {
    	 Hero hero1 = new Hero(null);
         Hero hero2 = new Hero(null);
         Hero hero3 = new Hero(null);

         hero1.setRole(null);
         hero2.setRole(null);
         hero3.setRole(null);
         
     }
     
     public void addHero(Hero hero, int index) {
         if (index >= 0 && index < heroes.length) {
             for (Hero h : heroes) {
                 if (h != null && h.getName().equals(hero.getName())) {
                     System.out.println(hero.getName() + " is already in the party.");
                 }
             }
             heroes[index] = hero;
         }
     }
     
     public void removeHero(int index) {
         if (index >= 0 && index < heroes.length && heroes[index] != null) {
             heroes[index] = null;
             // Shift the elements to the left to fill the null space
             for (int i = index; i < heroes.length - 1; i++) {
                 heroes[i] = heroes[i + 1];
                 heroes[i + 1] = null;
             }
         }
     }
     
     public Hero getHero(int index) {
         if (index >= 0 && index < heroes.length) {
             return heroes[index];
         }
         return null;
     }
     
     public void gainExperience(int experience) {
         System.out.println("The party gained " + experience + " experience.");
         for (Hero hero : heroes) {
             if (hero != null) {
                 hero.gainExperience(experience);
             }
         }
     }
     
     public String toString() {
         StringBuilder sb = new StringBuilder("Party:\n");
         for (Hero hero : heroes) {
             if (hero != null) {
                 sb.append(hero.toString()).append("\n");
             }
         }
         return sb.toString();
     }
}
