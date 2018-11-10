package ua.od.game.repository.dao.impl;

import org.junit.Before;
import org.junit.Test;
import ua.od.game.model.BuildingEntity;
import ua.od.game.model.ResourceEntity;
import ua.od.game.repository.dao.BuildingDao;
import ua.od.game.repository.dao.DbTest;

import java.util.List;
import java.util.Map;

public class BuildingDaoImplTest extends DbTest {

    BuildingDaoImpl buildingDao;

    @Before
    public void init() {
        buildingDao = new BuildingDaoImpl();
    }

    @Test
    public void getAllBuildingListTest() {

        Map<BuildingEntity, List<ResourceEntity>> map = buildingDao.getAllBuildingList();

        map.forEach((map1,list1) -> {
            System.out.println("building:" +  map1.getName() + " " );
                }

        );

    }



}
