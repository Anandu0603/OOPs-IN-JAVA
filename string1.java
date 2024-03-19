class string1
{
    public static void main(String args[])
    {
        String str = "Java programming";
        System.out.println("The string is " + str + " ");
        System.out.println("Length of the string is " + str.length());
        System.out.println("Character at second and fourth position is " + str.charAt(1) + "," + str.charAt(3));
        System.out.println("The sub string using start index only is " + str.substring(5));
        System.out.println("The sub string using start index only is " + str.substring(0, 4));
    }
}

output
  The string is Java programming 
Length of the string is 16
Character at second and fourth position is a,a
The sub string using start index only is programming
The sub string using start index only is Java

Process finished with exit code 0
