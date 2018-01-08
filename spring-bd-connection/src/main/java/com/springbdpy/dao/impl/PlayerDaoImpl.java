package com.springbdpy.dao.impl;

import com.springbdpy.beans.Player;
import com.springbdpy.dao.interfaces.PlayerDao;

public class PlayerDaoImpl implements PlayerDao {


    @Override
    public void insertPlayer(Player player) throws Exception {
        String sql = "INSERT INTO PLAYER (id, name) VALUES (?, ?)";
        try{

        }catch (Exception e){

        }
    }
}
