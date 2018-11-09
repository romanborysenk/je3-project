package ua.od.game.repository.dao.impl;

import ua.od.game.model.BuildingsEntity;
import ua.od.game.model.ResourcesEntity;
import ua.od.game.repository.dao.BuildingDao;
import ua.od.game.repository.helper.SqlHelper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BuildingDaoImpl implements BuildingDao {

    @Override
    public Map<BuildingsEntity,ResourcesEntity> getAllBuildingList() {
        return SqlHelper.prepareStatement("SELECT  a.id, a.name, a.description, b.resource_id, b.number_per_sec " +
                "from Building a inner join Building_Product b on a.id = b.building_id", pstmt -> {
            ResultSet rs = pstmt.executeQuery();
            Map<BuildingsEntity,ResourcesEntity> map = new LinkedHashMap<>();
            List<ResourcesEntity> list = new LinkedList<>();
            ResourceDaoImpl resourceDao = new ResourceDaoImpl();
            list = resourceDao.getAllResourceList();
            while(rs.next()) {
                list.forEach(resources -> {
                    try {
                        if(resources.getId().equals(rs.getInt("b.resource_id"))) {
                            map.put(new BuildingsEntity(){{
                                setId(rs.getInt("a.id"));
                                setName(rs.getString("a.name"));
                                setDescription(rs.getString("a.description"));
                                setNumber_per_sec(rs.getFloat("b.number_per_sec"));
                            }},resources);
                        }
                    } catch (SQLException e) {
                        System.out.println(e);
                    }
                });
            }
            return map;
        });
    }
}
