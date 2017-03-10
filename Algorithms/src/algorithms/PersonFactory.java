/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Random;

/**
 *
 * @author Tobias
 */
public class PersonFactory
{
    private Random rnd = new Random();
    private String[] firstNames = {"Stefan", "Mathias", "Martin", "Mads", "Alexander", "Mikkel", "Mo", "Christian", "David", "Tjalfe"}; 
    private String[] lastNames = {"Hansen", "Jensen", "Søndergård", "Madsen", "Rasted", "Mikkelsen", "Mortensen", "Christiansen", "Davidsen", "Thomsen"}; 
    
    public Person createPerson()
    {
        return new Person(firstNames[rnd.nextInt(firstNames.length)], lastNames[rnd.nextInt(lastNames.length)]);
    }
}
