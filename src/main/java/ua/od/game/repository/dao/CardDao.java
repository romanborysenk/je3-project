package ua.od.game.repository.dao;

import ua.od.game.model.CardEntity;

import java.util.List;

/**@author DemianSH
 **/

public interface CardDao {
    List<CardEntity> getAllCardList();
}