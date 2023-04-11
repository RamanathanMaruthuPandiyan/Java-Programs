
interface Play {
    public void palyer();
}
class Child implements Play{

    @Override
    public void palyer() {
        System.out.println("The Child play in Ground.");
    }
}
class Musician implements Play{

    @Override
    public void palyer() {
        System.out.println("The Musician Plays Keyboard.");
    }
    
}
class Actor implements Play{

    @Override
    public void palyer() {
        System.out.println("The Actor Palys a important role in the Film.");
    }
    
}

public class PlayerDemonstrator {
    public static void main(String[] args){
        Play P=new Actor();
        P.palyer();
        P=new Child();
        P.palyer();
        P=new Musician();
        P.palyer();
    }
}
