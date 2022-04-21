package com.sea.bank;

import com.sea.bank.bank.domain.Account;
import com.sea.bank.bank.domain.Statement;

import java.text.ParseException;

import static com.sea.bank.bank.domain.Amount.amountOf;
import static com.sea.bank.utils.DateUtils.date;

public class Main {

    public static void main(String[] args) throws ParseException {
        Account account = new Account(new Statement());

        account.deposit(amountOf(1000), date("10/01/2012"));
        account.deposit(amountOf(2000), date("13/01/2012"));
        account.withdrawal(amountOf(500), date("14/01/2012"));

        account.printStatement();
    }
}
