
public class Hero {
	private String name;
	private String role;
	private int level;
	private int experience;
	private static final int MAX_LEVEL = 100;
	private static final String[] ROLES = {"Warrior", "Priest", "Wizard", "Thief"};

    public Hero(String name) {
        this.name = name;
        this.role = "Unassigned";
        this.level = 1;
        this.experience = 0;
    }
    
    public void setRole(String role) {
        for (String validRole : ROLES) {
            if (validRole.equals(role)) {
                this.role = role;
            }
        }
        System.out.println("Invalid role");
    }

    
	public String getName() {
		return name;
	}


	public String getRole() {
		return role;
	}


	public int getLevel() {
		return level;
	}


	public int getExperience() {
		return experience;
	}

    public int expToLevelUp() {
        return level * level;
    }
    
    public void gainExperience(int experience) {
        this.experience += experience;
        while (this.experience >= expToLevelUp()) {
            if (level < MAX_LEVEL) {
                this.experience -= expToLevelUp();
                level++;
                System.out.println(name + " is now level " + level + "!");
            }
        }
    }
    
    public String toString() {
        return name + " the " + role + " is level " + level + " with " + experience + " experience.";
    }
	
}
