package h1314;

import h789tienelf.model.Account;
import h789tienelf.model.Human;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        House lien = new House();
        Human zh = new Human("Zh");
        Human yd = new Human("Yd");
        lien.familie.add(yd);
        lien.familie.add(zh);
        lien.toString();
        List<Human> andereFamilie = new ArrayList<Human>();
        lien.copy(lien.familie, andereFamilie);
        System.out.println(andereFamilie);

        Account Nr1 = new Account("Nr1", "Ergens", "UNKNOWN");
        Account Nr2 = new Account("Nr1", "Ergens", "UNKNOWN");
        Account Nr3 = new Account("N3", "Nergens", "MALE");
        double een = Nr1.hashCode();
        double twee = Nr2.hashCode();
        double drie = Nr3.hashCode();
        HashSet<Double> alleHash = new HashSet<>();
        alleHash.add(een);
        alleHash.add(twee);
        alleHash.add(drie);
        Nr3.giveAllHashCodes(alleHash);
    }
}
