public class Animals {
    private int id;
    private String name;
    private int age;
    private String kind;
    private String food;
    private String sound;

    public void makeNoise(){
        System.out.println(this.sound + this.sound);;
    }
    public void play(){
        System.out.println(this.name + " is playing");
    }

    public Animals(){
    }
    public Animals(int id,String name,int age,String kind, String food,String sound){
        this.id = id;
        this.name = name;
        this.age = age;
        this.kind = kind;
        this.food = food;
        this.sound = sound;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setKind(String kind){
        this.kind = kind;
    }
    public void setFood(String food){
        this.food = food;
    }
    public void setSound(String sound){
        this.sound = sound;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getKind(){
        return this.kind;
    }
    public String getFood(){
        return this.food;
    }
    public String getSound(){
        return this.sound;
    }

    public void getInfo(){
        System.out.println("Name: "+ getName() + "\nKind: "+ getKind()
        + "\nId: "+ getId() + "\nAge: "+ getAge()+ "\nFood: "+ getFood()
        +"\nSound: "+ getSound());
    }

}
