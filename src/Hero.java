public class Hero {
    private int heroesHealth;
    private int heroesDamage;
    private String superDamage;

    public Hero(int heroesHealth, int heroesDamage, String superDamage) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
        this.superDamage = superDamage;
    }

    public Hero(int heroesHealth, int heroesDamage) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
    }

    public int getHeroesHealth() {
        return heroesHealth;
    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    public String getSuperDamage() {
        return superDamage;
    }
}
