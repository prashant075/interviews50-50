//package z_lld.inmobi;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.Random;
//
//public class Dummy {
//
//    /*
//    * User (Basic Entity)
//AdminUser extends User
//(
//createTournent();
//AddTeamsToTournent();
//createMatchesBetweenTeam();
//UpdatePointTablesforTournent();
//)
//
//Player( )
//Team()
//Match( 2 teams)
//Venue()
//Tournament(teams, match, venue)
//PointTable()
//Score()
//    * */
//
//    public class Player{
//    String id;
//    String name;
//    }
//    public class Team{
//        List<Player> players;
//        Venue homeground;
//    }
//    public class Match{
//        Team team1;
//        Team team2;
//        Score Score;
//        int winner;
//        SelectHomeGround(){
//        }
//    }
//    int SelectHomeGround (){
//        return new Random().nextInt(2)+1;
//    }
//
//
//    public class Venue {
//        String City;
//    }
//    public class Country {
//       List<Venue> venue;
//    }
//    public class PointTable{
//        Team team;
//        int score;
//
//
//    }
//    public class Score{
//
//    }
//
//    public abstract Tournament{
//        addTeam(){};
//        addFixture(){};
//       abstract Tournament();
//    }
//    public class cricket implements Tournament {
//        /*
//        * Tournement -> Match between Team ,
//        * */
//        String name;
//        List<Match> matches;
//        List<Team> winner;
//
//    }
//    public class Fixture{
//        Map<Team, ArrayList<Team>> resultoffixtuers;
//
//    }
//
//}

/**
 *
 * package com.codility;
 *
 * // you can also use imports, for example:
 *  import java.util.*;
 *
 * public class Solution {
 *
 *     public static void main(String [] args) {
 *         // you can write to stdout for debugging purposes, e.g.
 *         System.out.println("This is a debug message");
 *         String s = "Abcbcbcc";
 *         Iterator itr = s.iterator();
 *         while(itr.hasNext()){
 *                 System.out.println(itr.next());
 *         }
 *     }
 *
 *     class String implements Interator {
 *         char[] chars;
 * 	    String(char[] s) {
 *         }
 *        Pulbic <T> iterator(){
 *            Char[] arrry = this.toCharArray();
 *         }
 *     }
 *
 *     public interface Interator{
 *             public <T> iterator();
 *             public boolean hasNext();
 *             public <T>> next();
 *
 *     }
 * }
 * class CustomString
 * {
 *
 * String s = "";
 * 	CustomString(String s1) { /// s1= "aaaabbcccdaa"
 * 		s = convert(s1); // s = a4b2c3d1a2
 *
 *        // "44444442323223"
 *        }
 *
 *     class CustomInterator impements Interator {
 *     //Varible
 *     private int count;
 *     private int i;
 *     private char curr;
 *      Pulbic <T> iterator(){
 *            Char[] arrry = this.toCharArray();
 *         }
 *      {
 *          CustomInterator(){
 *
 *          }
 *      }
 *     public boolean hasNext(){
 *         //String class Method
 *         //flag
 *
 *        if(i>s.length()-2){
 *            return false;
 *        }
 *        if(count>0){
 *             return true;
 *         }
 *         i+=2;
 *         count =  s.charAt(i+1)-'0';
 *         return count>0;
 *
 *
 *     }
 *
 *     public char next(){
 *         if(hasNext()){
 *             count--;
 *             return s.charAt(i);
 *         }else{
 *             return null; //no null
 *         }
 *     }
 *
 * }
 *
 * }
 */
