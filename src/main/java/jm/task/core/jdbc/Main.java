package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        UserDaoHibernateImpl userDao = new UserDaoHibernateImpl();
        userDao.createUsersTable();
        userDao.saveUser("Ivan", "qwew", (byte) 34);
        userDao.saveUser("qaz", "yhn", (byte) 34);
        userDao.saveUser("Ivaxswn", "rfv", (byte) 34);
        userDao.saveUser("Ivrfvan", "edc", (byte) 34);
        userDao.getAllUsers().forEach(System.out::println);
        userDao.cleanUsersTable();
        userDao.dropUsersTable();

    }
}

