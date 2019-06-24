package com.mokelock.houseleasing.services.servicesImpl;

import com.mokelock.houseleasing.model.UserModel.User;
import com.mokelock.houseleasing.model.UserModel.modifyUser;
import com.mokelock.houseleasing.model.UserModel.record;
import com.mokelock.houseleasing.services.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServicesImpl implements UserService {



    @Override
    public boolean signIn() {
        return false;
    }


    //获取目标用户账户的余额，查询失败返回-1
    public int getBalance(String _username)
    {
        return 0;
    }

    //根据用户名username获取目标用户的信息数据，返回信息存储在_one对象里，用户名存在，返回true，用户名不存在，返回值为false；
    public boolean getUser(User _one, String _username)
    {
        return true;
    }

    //向目标账户进行充值，成功返回true，失败返回false；
    public boolean postAccount(String _username,int _money)
    {
        return true;
    }

    //根据用户名查询该用户的交易记录，存储在一个ArrayList<record>链表中
    public ArrayList<record> getRecords(String _username)
    {
        return null;
    }

    //根据用户名查询该用户名下的房子信息，存储在一个ArrayList<house>链表中
    public ArrayList<house> getHouses(String _username)
    {
        return null;
    }

    //修改一个用户的信誉值，得到的信誉值是_credit，成功返回true，失败返回false；实际上是调用了postUser
    public boolean postCredit(User _old,short _credit)
    {
        return true;
    }

    //修改一个用户的性别，成功返回true，失败返回false；实际上是调用了postUser
    public boolean postGender(User _old,byte _gender)
    {
        return true;
    }

    //修改一个用户的密码，成功返回true，失败返回false;实际上是调用了postUser
    public boolean postPassword(User _old,String _password)
    {
        return true;
    }

    //修改一个用户的电话号码，成功返回true，失败返回false;实际上是调用了postUser
    public boolean postPhone(User _old,String _phone)
    {
        return true;
    }

    //传入一个User对象和一个modifyUser对象，将_modified对象的信息覆盖old的信息,成功返回true，失败返回false;
    //该方法是其他修改方法的源方法，可以不用主动调用;
    public boolean postUser(User _old, modifyUser _modified)
    {
        return true;
    }



}
