package ua.od.game.repository.dao.impl;

import ua.od.game.model.BuildingEntity;
import ua.od.game.model.ResourceEntity;
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
    public Map<BuildingEntity,List<ResourceEntity>> getAllBuildingList() {
        /*return SqlHelper.prepareStatement("SELECT   a.id, a.name, a.description, b.resource_id, b.number_per_sec " +
                "from Building a inner join Building_Product b on a.id = b.building_id group order by a.id ASC", pstmt -> {
            ResultSet rs = pstmt.executeQuery();
            Map<BuildingEntity,List<ResourceEntity>> map = new LinkedHashMap<>();
            List<ResourceEntity> list_all = new LinkedList<>();
            List<ResourceEntity> list = new LinkedList<>();
            ResourceDaoImpl resourceDao = new ResourceDaoImpl();
            list_all = resourceDao.getAllResourceList();
            while(rs.next()) {
                list_all.forEach(resources -> {
                    try {
                        if(resources.getId().equals(rs.getInt("resource_id"))) {
                            list.add(resources);
                        }
                    } catch (SQLException e) {
                        System.out.println(e);
                    }
                });
                map.put(new BuildingEntity(){{
                    setId(rs.getInt("id"));
                    setName(rs.getString("name"));
                    setDescription(rs.getString("description"));
                    setNumber_per_sec(rs.getFloat("number_per_sec"));
                }}, list);
                list.clear();
            }
            return map;
        });*/
        Map<BuildingEntity,List<ResourceEntity>> map1 = new LinkedHashMap<>();
        map1 = SqlHelper.prepareStatement("SELECT   id, name, description from Building", pstmt -> {
            ResultSet rs = pstmt.executeQuery();
            Map<BuildingEntity,List<ResourceEntity>> map = new LinkedHashMap<>();
            while(rs.next()) {
                map.put(
                        new BuildingEntity(){{
                            setId(rs.getInt("id"));
                            setName(rs.getString("name"));
                            setDescription(rs.getString("description"));
                        }},
                        null);
            }
            return map;
        });
        return map1;
    }
}
