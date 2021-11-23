package com.revature;

import com.revature.model.User;
import com.revature.util.*;
import com.revature.persistence.*;

import java.util.*;

// Main class
public class Driver {

    // Main driver method
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("new1234");
        user.setPassword("Password");
        user.setPhone_number(1234251233);
        user.setAge(12);
        System.out.println(user);

        //ListAll.ListAllAnnotatedFields(User.class);
        //ListAll.ListAllAnnotatedMethods(User.class);

        SQLStringCreator.CreateTableString(User.class);
        SQLStringCreator.CreateRowString(User.class);
        SQLStringCreator.ReadString(User.class);
        SQLStringCreator.ReadByPKeyString(User.class);
        SQLStringCreator.UpdateString(User.class);
        SQLStringCreator.DeleteString(User.class);

        final GenericDao genericDao = new GenericDao();

        //genericDao.createRow(user);
        List<Integer> list = Arrays.asList(1);
        //genericDao.delete(user, list);
        genericDao.Read(user);
        genericDao.ReadByPKey(user,list);
    }

}
