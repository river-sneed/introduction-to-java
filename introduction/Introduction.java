
/**
 * This program tells a little bit about me.
 *
 * @author (Rivers need)
 * @version (august 20, 2018)
 */
public class Introduction
{
    public static void main(String[] args)
    {
        // here are some facts about me
        System.out.println("I was born from my mother's belly button");
        System.out.println("I go to Charlie boy's highschool");
        System.out.println("Pats on bottom");
        System.out.println("My friend, aSHLYN, is 17");
        System.out.println("I like to camp and hike like Mr. Coooooooooooooooop Dogg");
        
        // create variables and store values in them
        String name = "rIVER";
        int birthYear = 2001;
        int currentYear = 2018;
        int deathYear =  2071;
        
        //What happens here?
        System.out.println("currentYear-birthYear");
        System.out.println(currentYear-birthYear);
        System.out.println("deathYear-currentYear");
        System.out.println(deathYear-currentYear);
        
        //Do some arithmetic
        int age = currentYear - birthYear;
        int ded = deathYear - currentYear;
        
        //Concatenate literal strings with variables
        System.out.println("My name is " + name + ", and I am " + age + " years old."); 
        System.out.println("Based on current life expactancies for my home county...  I have "
        + ded + " years to live");
        
        /* You may notice that age calculation is only correct if you've already had 
         * your birthday this year. We can fix that using a boolean variable and some
         * conditional logic.
         */
        
        // Change this value to false if you haven't had your birthday yet this year
        boolean hadBirthday = true;
        
        // Conditionally, subtract one from the age if the birthday hasn't occured yet
        if (hadBirthday == false) {
            age -= 1;
        }
        
        //This output should always be correct
        System.out.println("My name is " + name + ", and I am " + age + " years old.");
        System.out.println("Based on current life expactancies for my home county...  I have "
        + ded + " years to live");
    }
}
        
        
        