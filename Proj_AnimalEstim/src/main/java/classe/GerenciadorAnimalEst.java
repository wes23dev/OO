/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 14626232639
 */
public class GerenciadorAnimalEst {
    private List<Animal> listAnimal;

    public GerenciadorAnimalEst(List<Animal> listAnimal) {
        this.listAnimal = new ArrayList<>();
    }

    public GerenciadorAnimalEst() {
        this.listAnimal = new ArrayList<>();
    }
    
    
    public void addAnimal(Animal animal){
        listAnimal.add(animal);
    }
    
    public Animal buscaAnimal(String name){
        Animal procurado = new Animal();
        for(Animal animal : listAnimal){
            if(animal.getNome().equals(name)){
                procurado = animal;
            }
        }
        return procurado;
    }
    
    public void removeAnimal(String animal){
        listAnimal.remove(buscaAnimal(animal));
    }
    
    
    
}
