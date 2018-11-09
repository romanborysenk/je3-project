package ua.od.game.repository.dao;

import ua.od.game.model.BuildingsEntity;
import ua.od.game.model.ResourcesEntity;

import java.util.List;
import java.util.Map;

public interface BuildingDao {
    Map<BuildingsEntity, ResourcesEntity> getAllBuildingList();
}
