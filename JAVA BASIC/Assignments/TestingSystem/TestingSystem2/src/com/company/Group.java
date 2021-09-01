package com.company;

import java.time.LocalDate;

public class Group {
    int         groupID;
    String      groupName;
    Account     creator;
    LocalDate   createDate;
    Account[]   account;
}
