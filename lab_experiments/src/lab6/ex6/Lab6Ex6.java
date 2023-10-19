

package lab6.ex1;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;

import java.util.Map;

 

 

 

//Create a method which accepts the id and the age of people as a Map and decide if

//they are eligible for vote. A person is eligible for vote if his age is greater than 18.

//Add the IDs of all the eligible persons to list and return the list.

public class Lab6Ex6 {

 

	    public static List<String> VotersList(Map<String, Integer> ageMap) {

	        List<String> Id = new ArrayList<>();

 

	        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {

	            String id = entry.getKey();

	            int age = entry.getValue();

 

	            if (age > 18) {

	                Id.add(id);

	            }

	        }

 

	        return Id;

	    }

 

	    public static void main(String[] args) {

	        Map<String, Integer> ageMap = new HashMap<>();

	        ageMap.put("ID1", 20);

	        ageMap.put("ID2", 17);

	        ageMap.put("ID3", 25);

	        ageMap.put("ID4", 16);

 

	        List<String> eligibleVoters = VotersList(ageMap);

 

	        if (eligibleVoters.isEmpty()) {

	            System.out.println("No one is eligible to vote.");

	        } else {

	            System.out.println("Eligible Voter IDs: " + eligibleVoters);

	        }

	    }

}

 