package com.company.Classes;

public class Money
{
    int intPart;
    int floatPart;

    @Override
    public String toString() {
        return intPart + "," + floatPart;
    }
}

