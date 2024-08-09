package dev.diego;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private String name;
    private String owner;
    private String taxIdentifier;
    private List<Computer> computers;

    public Store(String name, String owner, String taxIdentifier) {
        this.name = name;
        this.owner = owner;
        this.taxIdentifier = taxIdentifier;
        this.computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public boolean removeComputer(String brand) {
        return computers.removeIf(c -> c.getBrand().equalsIgnoreCase(brand));
    }

    public Computer findComputer(String brand) {
        for (Computer computer : computers) {
            if (computer.getBrand().equalsIgnoreCase(brand)) {
                return computer;
            }
        }
        return null;
    }

    public List<Computer> listComputers() {
        return new ArrayList<>(computers);
    }
}