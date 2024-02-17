public class Fighter {
    String name;
    int damage;
    int health;
    int weight;

    Fighter(String name, int damage, int health, int weight) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
    }

    int hit(Fighter foe) {
        System.out.println(this.name + " -> " + foe.name + " adlı dövüşçüye "
                + this.damage + " hasar vurdu!");
        foe.health -= this.damage;

        if (foe.health < 0) {
            return 0;
        } else {
            return foe.health;
        }
    }
}
