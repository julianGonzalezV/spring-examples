package com.springbdpy.service.impl;

import com.springbdpy.beans.Player;
import com.springbdpy.dao.interfaces.PlayerDao;
import com.springbdpy.service.interfaces.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;

public class PlayerServiceImpl implements PlayerService {


    @Autowired
    private PlayerDao playerDao;

    @Override
    public void insert(Player player) throws Exception {
            playerDao.insertPlayer(player);
    }
}
