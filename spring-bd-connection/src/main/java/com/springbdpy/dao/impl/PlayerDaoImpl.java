package com.springbdpy.dao.impl;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.springbdpy.beans.Player;
import com.springbdpy.beans.ShirtBrand;
import com.springbdpy.dao.interfaces.PlayerDao;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;

public class PlayerDaoImpl implements PlayerDao {

    @Autowired
    MongoClient mongoClient;
    @Override
    public void insertPlayer(Player player) throws Exception {
        MongoDatabase db = mongoClient.getDatabase("spring-mongo-db1");
        MongoCollection players = db.getCollection("players");
        Document doc = new Document("id", player.getId())//
                .append("name", player.getName());

        players.insertOne(doc); // first insert
    }

}
