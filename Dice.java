//package jp.ac.uryukyu.ie.ex3.pair25;
public class Dice{
    private int value;
    public Dice(){}

    public int getValue(){ return this.value; }
    public void setValue(int value){ this.value=value; }

    public void play(){
        setValue((int)(Math.random()*6)+1);
    }
}