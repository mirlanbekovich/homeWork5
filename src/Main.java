public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();

        boss.setBossHealth(700);
        boss.setBossDamage(60);
        boss.setBossDeffens("Antispeed");
        System.out.println(boss.getBossHealth() +" "+
                boss.getBossDamage() + " " + boss.getBossDeffens());

    }
}
