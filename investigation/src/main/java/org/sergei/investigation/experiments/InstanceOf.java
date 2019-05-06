package org.sergei.investigation.experiments;

class AnimalTwo {
    private String name;
    
    public AnimalTwo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class DogTwo extends AnimalTwo {
    public DogTwo(String name) {
        super(name);
    }
}

class CatTwo extends AnimalTwo {
    public CatTwo(String name) {
        super(name);
    }
}

class NotInhetritedAnimal {
    
    private final String notInherited = "Not inherited";

    public String getNotInherited() {
        return notInherited;
    }
    
}

public class InstanceOf {
    
    public static void main(String[] args) {
        CatTwo catTwo = new CatTwo("Jane");
        DogTwo dogTwo = new DogTwo("Daniel");
        
        if (catTwo instanceof AnimalTwo) {
            System.out.println("Cat yes");
        } else if (dogTwo instanceof AnimalTwo) {
            System.out.println("Dog yes");
        }
        
    }
    
}
