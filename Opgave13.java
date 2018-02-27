package Kap11Exercise13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Opgave13
{
    /*
    Write a method isUnique that accepts a map whose keys and values are
    strings as a parameter and returns true if no two keys map to the
    same value (and false if any two or more keys do map to the same value).
    For example, if the map contains the following key/value pairs, your method
    would return true:
    {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}.
    But calling it on the following map would return false, because of two
    mappings for Perkins and Reges:
    {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}.
    */

    public static void main(String[] args)
    {
        Map<String, String> stringMap = new HashMap<String, String>();
        stringMap.put("Hal", "Perkins");
        stringMap.put("Hallen", "Perkins");
        stringMap.put("Marty", "Stepp");
        stringMap.put("Stuart", "Reges");
        stringMap.put("Jessica", "Miller");
        stringMap.put("Amanda", "Camp");

        System.out.println(isUnique(stringMap));
    }


    public static boolean isUnique(Map<String, String> stringStringMap)
    {
        List<String> compareList = new ArrayList<>();

        for (Map.Entry<String, String> stringEntry : stringStringMap.entrySet())
        {
            if (compareList.contains(stringEntry.getValue()))
            {
                return false;
            }
            compareList.add(stringEntry.getValue());
        }
        return true;
    }


}
