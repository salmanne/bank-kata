package com.sea.bank.bank.domain;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

public class Statement {

    private static final int TOP_OF_THE_LIST = 0;

    public static final String STATEMENT_HEADER = "date       | credit   | debit    | balance";

    private final List<StatementLine> statementLines = new LinkedList<>();

    public void addLineContaining(Transaction transaction, Amount currentBalance) {
        statementLines.add(TOP_OF_THE_LIST, new StatementLine(transaction, currentBalance));
    }

    public void printTo() {
        System.out.println(STATEMENT_HEADER);
        printStatementLines();
    }

    private void printStatementLines() {
        for (StatementLine statementLine : statementLines) {
            statementLine.printTo();
        }
    }

}
