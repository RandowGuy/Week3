public class TestAnimals {
    public static void main(String[] args) {
        Animals myDog = new Animals();
        myDog.setName("Pun");
        myDog.setAge(3);
        myDog.setKind("Poodle");
        myDog.setId(3);
        myDog.setFood("Meat");
        myDog.setSound("Gâu Gâu! ");

        myDog.getInfo();
        myDog.play();
        System.out.printf("My dog is barking!! \n");
        myDog.makeNoise();
    }
}
