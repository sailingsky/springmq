package com.rabbit.receivers;

import com.rabbit.dto.User;

/**
 * Created by shuangjian on 2016/9/21.
 */
public class Receiver {

    public void execute(User user){
        System.out.println(user.getName());
    }
}
