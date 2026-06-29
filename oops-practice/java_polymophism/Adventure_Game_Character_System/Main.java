public class Main {

    public static void main(String[] args) {

        GameCharacter[] characters = {

                new Warrior("Thor"),
                new Mage("Merlin"),
                new Archer("Robin Hood"),
                new Warrior("Leon"),
                new Mage("Gandalf"),
                new Archer("Legolas")
        };

        BattleArena.startBattle(characters);
    }
}