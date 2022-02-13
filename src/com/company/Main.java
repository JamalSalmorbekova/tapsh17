package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
   //  Animal деген класс тузунуз жана бир метод кошунуз.
        //       Анын 3 наследнигин тузунуз.


        Animal[] animals = {new Eage(), new Shark(), new Turtle()};


        //     Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды
        //      болуп оз озунун массивине салыныз
        Animal[] reptile = {animals[3]};
        Animal[] fish = {animals[1]};
        Animal[] bird = {animals[0]};

        for ( Animal s : animals) {
//
            if (s instanceof Shark) {
                ((Shark) s).attack();
            }
            if (s.getClass().getName().equals("com.company.Shark")) {
                ((Shark) s).attack();
            }
            if (s instanceof Eage) {
                ((Eage) s).fly();
            }
            if (s.getClass().getName().equals("com.company.Eage")) {
                ((Eage) s).fly();
            }
            if (s instanceof Turtle) {
                ((Turtle) s).swim();
            }
            if (s.getClass().getName().equals("com.company.Turtle")) {
                ((Turtle) s).swim();
            }
        }}}
