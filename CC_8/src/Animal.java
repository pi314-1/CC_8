
public class Animal {

	private char type = 'n';
	private int age = 0;
	private int health = 50;

	public Animal(Animal p) {

	}

	public Animal(char aType, int anAge, int healthAmount) {
		setType(aType);
		setAge(anAge);
		setHealth(healthAmount);
	}

	public Object getType() {
		return type;
	}

	public Object getAge() {
		return age;
	}

	public Object getHealth() {
		return health;
	}

	public void setType(char aType) {
		if (aType == 'm' || aType == 'b' || aType == 'f' || aType == 'r' || aType == 'a') {
			type = aType;
		};
	}
	public void setAge(int anAge) {
		if (type == 'm' || type == 'r') {
			if (0 <= anAge && anAge <= 100) {
				age = anAge;
			}
		} else if (type == 'b' || type == 'f' || type == 'a') {
			if (0 <= anAge && anAge <= 10) {
				age = anAge;
			}
		} else if (type == 'n')
			if (0 <= anAge && anAge <= 2) {
				age = anAge;
			}
	}


	public void setHealth(int i) {
		if (i > 0) {
			health = i;
		}
		else if (i < 0)
			health = 50;
		}


	public double getRelativeHealth() {

		return 8.8;
	}

}
