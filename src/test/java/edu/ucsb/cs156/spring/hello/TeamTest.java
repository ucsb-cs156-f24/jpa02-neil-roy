package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;
    Team team2;

    @BeforeEach
    public void setup() {
        team = new Team("test-team"); 
        team2 = new Team("test-team2");
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

   @Test
   public void equals_returns_true() {
        assert(team.equals(team)); 
   }

   @Test
   public void equals_returns_false() {
        assertEquals(false, team.equals(team2));
   }

   @Test
   public void equals_not_instance_of_team() {
    assertEquals(false, team.equals("not a team object"));
   }

   @Test 
   public void hash_code_equals_true() {
        assertEquals(team.hashCode(), team.hashCode());
   }

   @Test
   public void hash_code_equals_false() {
        assertEquals(false, team.hashCode() == team2.hashCode());
   }

}
