package h1314;

import h789tienelf.model.Human;

import java.util.ArrayList;
import java.util.List;

public class House {
    public List<Human> familie = new ArrayList<>();

    public House(){
    }
    @Override
    public String toString(){
        System.out.println("This house is owned by:");
        for(Human b : familie){
            System.out.println(b.name);
            b.greet();
        };
        return null;
    }
    public <T> void copy(List<T> OG, List<? super T> NEW){
        NEW.addAll(OG);
    }
}
