/*
 *  UCF COP3330 Fall 2021 Interest Class file
 *  Copyright 2021 Celina Alzenor
 */

package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Interest
{
    private final int pAmt;
    private final double rate;
    private final int years;

    public Interest()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        this.pAmt = input.nextInt();

        System.out.print("Enter the rate of interest: ");
        this.rate = input.nextDouble();

        System.out.print("Enter the number of years: ");
        this.years = input.nextInt();
    }

    public void SmpInt()
    {
        float percent = (float) this.rate/100;
        double monies =  this.pAmt * (1+(percent * this.years));

        DecimalFormat round = new DecimalFormat("###.##");

        System.out.print("After "+this.years+" years  at "+this.rate+"%, the investment will be worth $"+round.format(monies)+".");
    }
}