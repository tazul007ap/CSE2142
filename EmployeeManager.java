//File Name EmployeeManager.java
import java.io.*;
import java.util.*;

public class EmployeeManager{
    public static void main(String[] args){


        if(args.length == 0) {
        System.out.println("No arguments provided.");
        return;
    }

if (args[0].equals("l")) {
System.out.println("Loading data ...");
try {
    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("employees.txt")));
    String line = reader.readLine();
    String employees[] = line.split(",");
      for (String emp : employees) {
System.out.println(emp);
}
    }
 catch (Exception employees) {}
    System.out.println("Data Loaded.");
} 
else if (args[0].equals("s")) {
System.out.println("Loading data ...");
try {
    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("employees.txt")));
    String line = reader.readLine();
    System.out.println(line);
    String employees[] = line.split(",");
    Random ran = new Random();
    int Random_idx = ran.nextInt(employees.length);
    System.out.println(employees[Random_idx]);
    }
 catch (Exception employees) {}
    System.out.println("Data Loaded.");
}
 else if (args[0].contains("+")) {
    System.out.println("Loading data ...");
try {
    BufferedWriter writer = new BufferedWriter(new FileWriter("employees.txt", true));
    String name = args[0].substring(1);
    writer.write(", " + name);
    writer.close();
    } 
catch (Exception employees) {}
    System.out.println("Data Loaded.");
}
 else if (args[0].contains("?")) {
    System.out.println("Loading data ...");
try {
    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("employees.txt")));
    String line = reader.readLine();
    String employees[] = line.split(",");
    boolean found = false;
    String searchname = args[0].substring(1);
     for (int i = 0; i < employees.length && !found; i++) {
if (employees[i].equals(searchname)) {
    System.out.println("Employee found!");
    found = true;
       }
      }
    } 
catch (Exception employees) {}
    System.out.println("Data Loaded.");
}
 else if (args[0].contains("c")) {
    System.out.println("Loading data ...");
try {
    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("employees.txt")));
    String line = reader.readLine();
    char[] chars = line.toCharArray();
    boolean inWord = false;
    int count = 0;
     for (char c : chars) {
if (c == ' ') {
   if (!inWord) {
    count++;
    inWord = true;
      }
   else {
    inWord = false;
    }
}
    }
    System.out.println(count + " word(s) found " + chars.length);
 } catch (Exception employees) {}
    System.out.println("Data Loaded.");
}
 else if (args[0].contains("u")) {
    System.out.println("Loading data ...");
try {
    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("employees.txt")));
    String line = reader.readLine();
    String employees[] = line.split(",");
    String name = args[0].substring(1);
     for (int i = 0; i < employees.length; i++) {
if (employees[i].equals(name)) {
     employees[i] = "Updated";
  }
}
    BufferedWriter writer = new BufferedWriter(new FileWriter("employees.txt"));
    writer.write(String.join(",", employees));
    writer.close();
} 
catch (Exception employees) {}
    System.out.println("Data Updated.");
} 
else if (args[0].contains("d")) {
     System.out.println("Loading data ...");
try {
     BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("employees.txt")));
     String line = reader.readLine();
     String employees[] = line.split(",");
     String name = args[0].substring(1);
     List<String> list = new ArrayList<>(Arrays.asList(employees));
     list.remove(name);
     BufferedWriter writer = new BufferedWriter(new FileWriter("employees.txt"));
    writer.write(String.join(",", list));
    writer.close();
    } 
catch (Exception e) {}
     System.out.println("Data Deleted.");
     }
  }
}
