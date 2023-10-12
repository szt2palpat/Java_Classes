public class Animal {
    public int numberOfLegs;
    public int numberOfeyes;
    public String name;

    public Animal(int numberOfeyes,int numberOfLegs,String name){
        this.name=name;
        this.numberOfeyes=numberOfeyes;
        this.numberOfLegs=numberOfLegs;
    }
    public void printAnimal(){
        System.out.println(name+" "+numberOfeyes+" "+numberOfLegs);
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfeyes() {
        return numberOfeyes;
    }

    public void setNumberOfeyes(int numberOfeyes) {
        this.numberOfeyes = numberOfeyes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
