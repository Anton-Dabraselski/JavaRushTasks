package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFName = reader.readLine();
        Cat catGrandF = new Cat(grandFName, null, null);

        String grandMName = reader.readLine();
        Cat catGrandM = new Cat(grandMName, null, null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandF);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandM, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandF);
        System.out.println(catGrandM);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentMale;
        private Cat parentFemale;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentFemale, Cat parentMale) {
            this.name = name;
            this.parentFemale = parentFemale;
            this.parentMale = parentMale;
        }


        @Override
        public String toString() {

            if (parentFemale == null && parentMale == null)
                return "Cat name is "+ name + ", no mother, no father";
            else if (parentFemale == null)
                return "Cat name is " + name + ", no mother, father is " + parentMale.name;
            else  if (parentMale == null)
                return "Cat name is " + name + ", mother is " + parentFemale.name + ", no father";

            else
                return "Cat name is " + name + ", mother is " + parentFemale.name + ", father is " + parentMale.name;




        }
    }

}
