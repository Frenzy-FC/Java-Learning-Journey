package PROJECTS.AtEastLBS.data;

import java.util.ArrayList;
import java.util.HashMap;
import PROJECTS.AtEastLBS.model.book;
import PROJECTS.AtEastLBS.model.borrowLog;
import PROJECTS.AtEastLBS.model.user;

public class data {
    public static HashMap<String, user> users = new HashMap<>();
    public static HashMap<String, book> books= new HashMap<>();
    public static ArrayList<borrowLog> borrowLogs = new ArrayList<>();
}
