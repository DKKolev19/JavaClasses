public class Cat extends Animal{
    private String typeOfFood;
    public Cat(int age, String breed,String typeOfFood) {
        super(age,breed);
        this.typeOfFood = typeOfFood;
    }

    public void test() {
        System.out.println(this.typeOfFood + " " + super.age);
    }

    @Override
    public void eat(){
        System.out.println("Cat eating");
    }
}
